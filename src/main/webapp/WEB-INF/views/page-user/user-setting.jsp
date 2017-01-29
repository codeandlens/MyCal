<%@ include file="/common/header.jsp" %>

<script type="text/javascript" src="resources/ckeditor/ckeditor.js"></script>

<div class="container" style="height: 100%;">
	<form class="form-horizontal" action='${pageContext.request.contextPath}/update-users' enctype="multipart/form-data" method="POST">
	<div class="row">
		<div class="col-sm-2"></div>
		<div class="col-sm-5">
				<div id="legend">
					<legend class="">Setting</legend>
				</div>
				<div class="control-group ">
					<!-- Username -->
					<label class="control-label" for="username">Username</label>
					<div class="controls">
						<input type="text" id="user_name" name="user_name" class="form-control input-sm" value="${sUser.user_name}" />
					</div>
				</div>
				<div class="control-group ">
					<!-- E-mail -->
					<label class="control-label" for="email">E-mail</label>
					<div class="controls">
						<input type="text" id="email" name="email" class="form-control input-sm" value="${sUser.email}">
					</div>
				</div>
				<br><div class="control-group">
					<!-- Password-->
					<a href="#"><label class="control-label" for="password">Change Password</label></a>
				</div><br>
		</div>
		<div class="col-sm-3">
			<div id="legend">
					<legend class="">picture</legend>
			</div>
			<div class="control-group ">
			<c:choose>
				<c:when test="${not empty sUser.path_image}">
					<img src="${pageContext.request.contextPath}/images/${sUser.path_image}" width="180" height="140"/>
					<input type="hidden" id="path_image" name="path_image" value="${sUser.path_image}">
					<a href="${pageContext.request.contextPath}/upload-single/users"><span class="pull-right">change</span></a>
				</c:when>
				<c:otherwise>
					<img src="${pageContext.request.contextPath}/images/users/user_setting.png" width="128" height="128"/>
					<input type="hidden" id="path_image" name="path_image" value="">
					<a href="${pageContext.request.contextPath}/upload-single/users"><span class="pull-right">change</span></a>
				</c:otherwise>
			</c:choose>
			</div>
		</div>
	</div >		
	<div class="row">
			<div class="col-sm-2"></div>
			<div class="col-sm-8">
				<div class="control-group">
					<!-- Detail-->
					<label class="control-label" for="detail">Detail</label>
					<div class="controls">
<%-- 						<input type="text" id="detail" name="detail" class="form-control input-sm" value="${sUser.detail}"> --%>
						<textarea name="detail" id="detail" rows="10" cols="80">
			                ${sUser.detail}
			            </textarea>
					</div>
				</div>
				<br>
				
				<br>
				<div class="control-group">
					<!-- Button -->
					<div class="controls">
						<button class="btn btn-info">Save</button>
					</div>
				</div>
			</div>
			<div class="col-sm-2"></div>
	</div>
	</form>
	<div class="row">
		<div class="col-sm-2"></div>
		<div class="col-sm-4">
		
		</div>
		<div class="col-sm-6"></div>
	</div>
</div>

 <script>
                CKEDITOR.replace( 'detail' );
 </script>

<%@ include file="/common/footer.jsp" %>