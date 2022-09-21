<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Add Restaurant</title>
<script type="text/javascript">
 function func(){
	alert("restaurant Added") 
 }
</script>
<style>
form{
text-align:center;
}
</style>
</head>
<body>
<h1 style="text-align:center;">Restaurant</h1>
   
   <form action="restaurant" method="post">
   
   <div Class="form-group">
   <label for="id">Restaurant Id:</label>
   <input required type="text" name="id" id="id" Class="form-control"/>
   </div>
   
   <div Class="form-group">
   <label for="restaurantName">Restaurant Name</label>
   <input required type="text" name="restaurantName" id="restaurantName" Class="form-control"/>
   </div>
   
    <div Class="form-group">
   <label for="pincode">PinCode</label>
   <input required type="text" name="pincode" id="pincode" Class="form-control"/>
   </div>
   
    <div Class="form-group">
   <label for="cuisine">Cuisine</label>
   <input required type="text" name="cuisine" id="cuisine" Class="form-control"/>
   </div>
   
    <div Class="form-group">
  <input type="submit" value="ADD" name="oper" class="btn btn-info" />
   </div> 
   
    <div Class="form-group">
  <input type="submit" value="DELETE" name="oper" class="btn btn-info"/>
   </div> 
   <div>
  <input type="submit" value="SHOW RESTAURANTS" name="oper" class="btn btn-info"/>
   </div> 
    
   </form>
   
   <p style="text-align:center;">${state}</p>
</body>
</html>