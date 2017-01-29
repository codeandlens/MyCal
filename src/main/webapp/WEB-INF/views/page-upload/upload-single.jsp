<%@ include file="/common/header.jsp" %>

<div class="container" style="height: 78%;">
				<form method="POST" action="${pageContext.request.contextPath}/preform-upload-single" enctype="multipart/form-data">
				    <input type="file" name="file" />
				    <input type="hidden" name="frompage" value="${frompage}">
				    
				    
				    
				    
				    
				    
				    
				    
				    <input type="submit" class="btn btn-info" value="upload">
				</form>
</div>

<%@ include file="/common/footer.jsp" %>