<%@ include file="/common/header.jsp" %>

<script type="text/javascript" src="resources/ckeditor/ckeditor.js"></script>

<div class="container">
	<div ng-app="myApp" ng-controller="Controller" >
	<form class="form-horizontal" action='${pageContext.request.contextPath}/perform-blog-add' method="POST">
		<div class="row">
			<div class="col-sm-2"></div>
				<div class="col-sm-6">
					<div id="legend">
						<legend class="">Blog Post</legend>
					</div>
					<div class="control-group">
						<label class="control-label" for="blog_name">Blog name</label>
						<div class="controls">
							<input type="text" id="blog_name" name="blog_name" class="form-control input-sm" />
							<input type="hidden" id="user_id" name="user_id" value="${sUser.user_id}" />
						</div>
					</div>
					<div class="control-group">
						<label class="control-label" for="blog_sub_detail">Blog Sub Detail</label>
						<div class="controls">
							<textarea name="blog_sub_detail" id="blog_sub_detail" rows="5" cols="85"></textarea>
						</div>
					</div>
				</div>
			<div class="col-sm-4"></div>
		</div>
		<div class="row">
			<div class="col-sm-2"></div>
			<div class="col-sm-10">
				<div class="control-group">
					<label class="control-label" for="blog_detail">Blog Detail</label>
					<div class="controls">
						<textarea name="blog_detail" id="blog_detail" rows="30" cols="80">
			               
			            </textarea>
					</div>
				</div>
				<br>
				<div class="control-group">
					<!-- Button -->
					<div class="controls">
						<button type="submit" class="btn btn-info">Save</button>
					</div>
				</div>
			</div>
		</div>
	</form>
	</div>
</div>


<script>
	CKEDITOR.replace( 'blog_detail' );

	var app =  angular.module('myApp', []);
		app.controller('Controller', function ($scope, $http) {			
				$http.get("${pageContext.request.contextPath}/get-blog-list").success(function(response) {
					$scope.bloglist = response;
				});
		                        
	      }
	);
</script>

<%@ include file="/common/footer.jsp" %>	