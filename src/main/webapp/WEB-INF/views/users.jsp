<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
 
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Users</title>
 <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/resources/css/bootstrap.min.css" > 
<!-- <link rel="stylesheet" type="text/css" href="http://localhost:8080/Mycal/resources/css/bootstrap.min.css" > -->
<!-- <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.2/jquery.min.js"></script> -->
<script src="${pageContext.request.contextPath}/resources/js/jquery.min.js"></script>


</head>
<body onload="load();">

        <input type="hidden" id="user_id">
        Name: <input type="text" id="name" required="required" name="user_name"><br>
        Email: <input type="email" id="email" required="required" name="email"><br>
        Detail: <input type="text" id="detail" required="required" name="detail"><br>
        Level: <input type="text" id="level_id" required="required" name="level_id"><br>
        <button type="button" class="btn btn-primary" onclick="submit();">Submit</button>
     
        <table id="table" class="table table-bordered" border=1>
            <tr> 
            <th> Name </th> 
            <th> Email </th>
            <th> detail </th> 
            <th> level </th>  
            <th> Edit </th> 
            <th> Delete </th> 
            </tr>
        </table>
             
     <button class="btn btn-success">okay</button>
<!--      <script src="resources/js/bootstrap.min.js"></script> -->
     <script src="${pageContext.request.contextPath}/resources/js/bootstrap.min.js"></script>
    <script type="text/javascript">
    data = "";
    submit = function(){
          
            $.ajax({
                url:'saveOrUpdate',
                type:'POST',
                data:{user_id:$("#user_id").val(),user_name:$('#name').val(),email:$('#email').val(),detail:$('#detail').val(),level_id:$('#level_id').val()},
                success: function(response){
                        alert(response.message);
                        load();    
                }              
            });        
    }
     
    delete_ = function(id){     
         $.ajax({
            url:'delete',
            type:'POST',
            data:{user_id:id},
            success: function(response){
                    alert(response.message);
                    load();
            }              
        });
}
     
 
    edit = function (index){
        $("#user_id").val(data[index].user_id);
        $("#name").val(data[index].user_name);
        $("#email").val(data[index].email);
        $("#detail").val(data[index].detail);
        $("#level_id").val(data[index].level_id);
         
    }
     
     
    load = function(){ 
        $.ajax({
            url:'list',
            type:'POST',
            success: function(response){
                    data = response.data;
                    $('.tr').remove();
                    for(i=0; i<response.data.length; i++){                  
                        $("#table").append("<tr class='tr'> <td> "+response.data[i].user_name+" </td> <td> "+response.data[i].email+" </td> <td> "+response.data[i].detail+" </td> <td> "+response.data[i].level_id+" </td> <td> <a href='#' onclick= edit("+i+");> Edit </a>  </td> </td> <td> <a href='#' onclick='delete_("+response.data[i].user_id+");'> Delete </a>  </td> </tr>");
                    }          
            }              
        });
         
    }
         
    </script>
     
</body>
</html>