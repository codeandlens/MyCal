<%@ include file="/common/header.jsp" %>	

	<div class="container">
	
	<div ng-app="myApp" ng-controller="Controller" >
		 <div class="panel panel-success" ng-repeat="blog in bloglist">
	      <div class="panel-heading">{{blog.blog_name}}</div>
	      <div class="panel-body">{{blog.blog_detail}}</div>
	    </div>
	</div>

</div>

<script>
var app =  angular.module('myApp', []);
	app.controller('Controller', function ($scope, $http) {			
			$http.get("${pageContext.request.contextPath}/get-blog-list").success(function(response) {
				$scope.bloglist = response;
			});
	                        
      }
);

</script>


<%@ include file="/common/footer.jsp" %>