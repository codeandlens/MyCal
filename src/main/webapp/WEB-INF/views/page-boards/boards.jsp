<%@ include file="/common/header.jsp" %>	

	<div class="container">
		<div ng-app="myApp" ng-controller="Controller" >
			<div class="text-right">
			<a href="${pageContext.request.contextPath}/board-add">
			<button type="button" class=" btn btn-info btn-xs"><span class="glyphicon glyphicon-plus"></span>boards</button>
			</a>
			</div><br>
			 <div class="panel panel-success" ng-repeat="board in boardslist">
		      	<div class="panel-heading"><a href="${pageContext.request.contextPath}/board-read/{{board.board_id}}">{{board.board_name}}</a></div>
		      	<div class="panel-body">{{board.board_sub_detail}}</div>
		    </div>
		</div>
</div>

<script>


var app =  angular.module('myApp', []);
	app.controller('Controller', function ($scope, $http) {			
			$http.get("${pageContext.request.contextPath}/get-boards-list").success(function(response) {
				$scope.boardslist = response;
			});
      }
);

</script>

<%@ include file="/common/footer.jsp" %>