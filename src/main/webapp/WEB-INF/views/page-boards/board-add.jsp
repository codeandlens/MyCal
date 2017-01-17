<%@ include file="/common/header.jsp" %>

<script type="text/javascript" src="resources/ckeditor/ckeditor.js"></script>

<div class="container">
	<div ng-app="myApp" ng-controller="Controller" >
	<form class="form-horizontal" accept-charset="UTF-8" action='${pageContext.request.contextPath}/perform-board-add' method="POST">
		<div class="row">
			<div class="col-sm-2"></div>
				<div class="col-sm-6">
					<div id="legend">
						<legend class="">Board Post</legend>
					</div>
					<div class="dropdown">
						<label class="control-label" for="board_type">Board Type</label>
						<div class="controls">
							<select id="board_type_id" name="board_type_id" class="form-control">
								<option ng-repeat="boardType in boardTypelist" value="{{boardType.board_type_id}}">{{boardType.board_type_name}}</option>
							</select>
						</div>
					</div>
					<div class="control-group">
						<label class="control-label" for="board_name">Board name</label>
						<div class="controls">
							<input type="text" id="board_name" name="board_name" class="form-control input-sm" />
<%-- 							<input type="hidden" id="user_id" name="user_id" value="${sUser.user_id}" /> --%>
						</div>
					</div>
					<div class="control-group">
						<label class="control-label" for="board_sub_detail">Board Sub Detail</label>
						<div class="controls">
							<textarea name="board_sub_detail" id="board_sub_detail" rows="5" cols="85"></textarea>
						</div>
					</div>
				</div>
			<div class="col-sm-4"></div>
		</div>
		<div class="row">
			<div class="col-sm-2"></div>
			<div class="col-sm-10">
				<div class="control-group">
					<label class="control-label" for="board_detail">Board Detail</label>
					<div class="controls">
						<textarea name="board_detail" id="board_detail" rows="30" cols="80">
			               
			            </textarea>
					</div>
				</div>
				<br>
				<div class="control-group">
					<!-- Button -->
					<div class="controls">
						<input type="hidden" id="count_view" name="count_view" value="0">
						<input type="hidden" id="user_id" name="user_id" value="${sUser.user_id}" />
						<button type="submit" class="btn btn-info">Save</button>
					</div>
				</div>
			</div>
		</div>
	</form>
	</div>
</div>


<script>
	CKEDITOR.replace( 'board_detail' );

	var app =  angular.module('myApp', []);
		app.controller('Controller', function ($scope, $http) {			
				$http.get("${pageContext.request.contextPath}/get-boards-type-list").success(function(response) {
					$scope.boardTypelist = response;
				});
		                        
	      }
	);
</script>

<%@ include file="/common/footer.jsp" %>	