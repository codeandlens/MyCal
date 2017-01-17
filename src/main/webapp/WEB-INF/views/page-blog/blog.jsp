<%@ include file="/common/header.jsp" %>	

	<div class="container">
		<div ng-app="myApp" ng-controller="Controller" >
			<div class="text-right">
			<a href="${pageContext.request.contextPath}/blog-add">
			<button type="button" class=" btn btn-info btn-xs"><span class="glyphicon glyphicon-plus"></span>blog</button>
			</a>
			</div><br>
			 <div class="panel panel-success" ng-repeat="blog in bloglist">
		      	<div class="panel-heading"><a href="${pageContext.request.contextPath}/blog-read/{{blog.blog_id}}">{{blog.blog_name}}</a></div>
		      	<div class="panel-body">{{blog.blog_sub_detail}}</div>
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