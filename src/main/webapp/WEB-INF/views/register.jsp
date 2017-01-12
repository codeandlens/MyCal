<%@ include file="/common/header.jsp" %>

<div class="container" style="height: 78%;">
	<div class="row">
		<div class="col-sm-4"></div>
		<div class="col-sm-4">
			<form class="form-horizontal" action='' method="POST">
				<div id="legend">
					<legend class="">Register</legend>
				</div>
				<div class="control-group">
					<!-- Username -->
					<label class="control-label" for="username">Username</label>
					<div class="controls">
						<input type="text" id="username" name="username" placeholder="Username"
							class="form-control input-sm">
					</div>
				</div>

				<div class="control-group">
					<!-- E-mail -->
					<label class="control-label" for="email">E-mail</label>
					<div class="controls">
						<input type="text" id="email" name="email" placeholder="Please provide your E-mail"
							class="form-control input-sm">
					</div>
				</div>

				<div class="control-group">
					<!-- Password-->
					<label class="control-label" for="password">Password</label>
					<div class="controls">
						<input type="password" id="password" name="password"
							placeholder="Password should be at least 4 characters" class="form-control input-sm">
					</div>
				</div>

				<div class="control-group">
					<!-- Password -->
					<label class="control-label" for="password_confirm">Password (Confirm)</label>
					<div class="controls">
						<input type="password" id="password_confirm"
							name="password_confirm" placeholder="Please confirm password"
							class="form-control input-sm">
					</div>
				</div>
				<br>
				<div class="control-group">
					<!-- Button -->
					<div class="controls">
						<button class="btn btn-success">Register</button>
					</div>
				</div>
			</form>
		</div>
		<div class="col-sm-4"></div>
	</div>
</div>

<%@ include file="/common/footer.jsp" %>
