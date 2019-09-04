
<%@include file="header1.jsp" %>

  <div class="container">
    <div class="card card-register mx-auto mt-5">
      <div class="card-header"><font color="black">City</font></div>
      <div class="card-body">
         <form method="POST" action="/updateCity">
          <div class="form-group">		
           		<input class="form-control" id="exampleInputName" type="hidden" aria-describedby="nameHelp" name="cityId" value="${cityById.getCityId()}">
                <label for="exampleInputName"><font color="black">NAME</font></label>
                <input class="form-control" id="exampleInputName" type="text" aria-describedby="nameHelp" name="cityName" value="${cityById.getCityName()}">         
           </div>
          <input type="submit" name="submit" value="Submit">
        </form>        
      </div>
    </div>
  </div>
  <!-- Bootstrap core JavaScript-->
 
<%@include file="footer.jsp" %>
,