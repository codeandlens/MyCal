<%@ include file="/common/header.jsp" %>

<script type="text/javascript" src="resources/ckeditor/ckeditor.js"></script>

<div class="container" style="height: 78%;">
	<form class="form-horizontal" action='${pageContext.request.contextPath}/update-users' method="POST">
	<div class="row">
		<div class="col-sm-2"></div>
		<div class="col-sm-4">
			
				<div id="legend">
					<legend class="">Setting</legend>
				</div>
				<div class="control-group">
					<!-- Username -->
					<label class="control-label" for="username">Username</label>
					<div class="controls">
						<input type="text" id="user_name" name="user_name" class="form-control input-sm" value="${sUser.user_name}" />
					</div>
				</div>

				<div class="control-group">
					<!-- E-mail -->
					<label class="control-label" for="email">E-mail</label>
					<div class="controls">
						<input type="text" id="email" name="email" class="form-control input-sm" value="${sUser.email}">
					</div>
				</div>
				
		</div>
		<div class="col-sm-6"></div>
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
				<div class="control-group">
					<!-- Password-->
					<a href="#"><label class="control-label" for="password">Change Password</label></a>
					<!-- <div class="controls">
						<input type="password" id="password" name="password" class="form-control input-sm" >
					</div> -->
				</div>
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
</div>

 <script>
                // Replace the <textarea id="editor1"> with a CKEditor
                // instance, using default configuration.
                CKEDITOR.replace( 'detail' );
 </script>

<%@ include file="/common/footer.jsp" %>