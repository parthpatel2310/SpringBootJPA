
<%@include file="header1.jsp" %>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>

  <div class="content-wrapper">
    <div class="container-fluid">
      <!-- Breadcrumbs-->
      
      <!-- Example DataTables Card-->
      <div class="card mb-3">
        <div class="card-header">
          <font color="black"><i class="fa fa-globe"></font></i><font color="black"> Customer </font></div>
		  <h3> <a href="/addCustomer">ADD RECORD</a></h3>
        <div class="card-body">
          <div class="table-responsive">
            <table class="table table-bordered" id="dataTable" width="100%" cellspacing="0" style="
    color: black;">
              <thead>
        .        <tr>
                  <th>Sr.no</th>
                  <th>Name</th>
                  <th>Mobile no</th>
                  <th>City</th>
                  <th>WalletBalance</th>
				  <th>Action</th>
                </tr>
              </thead>
              
              <tbody>
           
              <c:forEach var="customer" items="${customerList}" >
    			<tr>  
    			  
    			<td>${customer.getCustomerId()}</td>
    			<td>${customer.getCustomerName()}</td>
    			<td>${customer.getCustomerMobile()}</td>
    			<td>${customer.getCustomerCity().getCityName()}</td>
    			<td>${customer.getCustomerBalance()}</td>
    			
					<td>
					<a href="/deleteCustomer?id=${customer.getCustomerId()}"
					title='delete records' data-toggle='tooltip'><span
					class='fa fa fa-trash-o fa-3x'></span></a>
					</td>
					
					
					<td>
					<a href="/editCustomer/${customer.getCustomerId()}"
					title='update records' data-toggle='tooltip'><span
					class='fa fa fa-pencil-square fa-3x'></span></a>
					</td>
					
						</tr>
				</c:forEach>
              </tbody>
            </table>
          </div>
        </div>
        <div class="card-footer small text-muted"></div>
      </div>
    </div>
    <!-- /.container-fluid-->
    <!-- /.content-wrapper-->
    <%@include file="footer.jsp" %>
