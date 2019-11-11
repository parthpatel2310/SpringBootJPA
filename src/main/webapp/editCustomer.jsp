

<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<%@include file="header1.jsp" %>

<body class="bg-dark">
  <div class="container">
    <div class="card card-register mx-auto mt-5">
      <div class="card-header"><font color="black">state</font></div>
      <div class="card-body">
         <form method="POST" action="/saveCustomer">
          <div class="form-group">
            
            	
                <input class="form-control" id="exampleInputName" type="hidden"  aria-describedby="nameHelp" value="${cust.getCustomerId()}" name="customerId"> 
                <label for="exampleInputName"><font color="black">NAME</font></label>
                <input class="form-control" id="exampleInputName" type="text" aria-describedby="nameHelp" value="${cust.getCustomerName()}" name="customerName">
                
                <label for="exampleInputName"><font color="black">Mobile</font></label>
                <input class="form-control" id="exampleInputName" type="text" aria-describedby="nameHelp" value="${cust.getCustomerMobile()}" name="customerMobile">
                
                
                <input class="form-control" id="exampleInputName" type="hidden"  aria-describedby="nameHelp" value="${cust.getCustomerPassword()}" name="customerPassword">   
                <label for="exampleInputName"><font color="black">City</font></label>
                <select class="form-control" name="customerCity" selected="${cust.getCustomerCity().getCityName()}">
                <c:forEach var="city" items="${cityList}">                
                <option value="${city.getCityId()}">${city.getCityName()}</option>
                </c:forEach>
                </select>
                <label for="exampleInputName"><font color="black">Customer Balance</font></label>
                <input class="form-control" id="exampleInputName" type="text" value="${cust.getCustomerBalance()}" aria-describedby="nameHelp" name="customerBalance">
              </div>
          
          <input type="submit" name="submit" value="Submit">
        </form>
        
      </div>
    </div>
  </div>
  <!-- Bootstrap core JavaScript-->
  <script src="vendor/jquery/jquery.min.js"></script>
  <script src="vendor/bootstrap/js/bootstrap.bundle.min.js"></script>
  <!-- Core plugin JavaScript-->
  <script src="vendor/jquery-easing/jquery.easing.min.js"></script>
</body>

</html>
<%@include file="footer.jsp" %>
