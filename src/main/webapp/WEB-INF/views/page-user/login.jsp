<%@ include file="/common/header.jsp" %>	
	<div class="container" style="height: 78%;">
	    <div class="row">
	    	<div class="col-sm-4">
	    	</div>
			<div class="col-sm-4">
				<form class="form-horizontal" action='${pageContext.request.contextPath}/login-user' method="POST">
				    <div id="legend">
				      <legend class="">Login</legend>
				    </div>
				    <div class="control-group">
				      <!-- Username -->
				      <label class="control-label"  for="username">Username</label>
				      <div class="controls">
				        <input type="text" class="form-control input-sm" id="email" name="email" placeholder="Email address" required autofocus >
				      </div>
				    </div>
				    <div class="control-group">
				      <!-- Password-->
				      <label class="control-label" for="password">Password</label>
				      <div class="controls">
				        <input type="password" class="form-control input-sm" id="password" name="password" placeholder="password" >
				      </div>
				    </div>
				    <div class="control-group"><br>
				      <!-- Button -->
				      <div class="controls">
				        <button type="submit" class="btn btn-success">Log in</button>
				        <a href="${pageContext.request.contextPath}/register"><button class="btn btn-primary">Register</button></a>
				      </div>
				    </div>
				</form>
			</div>
			<div class="col-sm-4">
			</div>
		</div>
</div>
<%@ include file="/common/footer.jsp" %>