<%-- 
    Document   : home
    Created on : jul 4, 2021, 8:25:1 PM
    Author     : Tu
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
        <title>Account Management</title>
        <link rel="stylesheet" href="https://fonts.googleapis.com/css?family=Roboto|Varela+Round">
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/css/bootstrap.min.css">
        <link rel="stylesheet" href="https://fonts.googleapis.com/icon?family=Material+Icons">
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css">
        <script src="https://code.jquery.com/jquery-3.5.1.min.js"></script>
        <script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.0/dist/umd/popper.min.js"></script>
        <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/js/bootstrap.min.js"></script>
        <link  rel="stylesheet" href="css/home.css">
        <style>

            body{
                background: #1dbf73;
            }   
            .search{
                width: 50%;
                border-radius: 10px;
            }
            #create{
                position: relative;
                left: 600px;
            }
            .table-titled{
                background: #1dbf73;   
            }
            .table-wrapperd{
                background: #1dbf73; 
            }
        </style>
    </head>
    <body>
        <div class="container-xl">
            <h3 style="color: red">Welcome Admin : ${sessionScope.FULLNAME} </h3>
            <div class="table-wrapperd">
                <div class="table-titled">
                    <div class="row">

                        <div class="col-sm-4">
                            <form action="search" method="post">
                                <input type="text" name="txtSearchValue" value="${param.txtSearchValue}" class="search" placeholder="Search by name..."/>
                                <button type="submit" class="btn btn-outline-secondary">search</button>
                            </form>                                   
                        </div>                        
                        <div class="col-sm-4">
                            <div class="btn-group" data-toggle="buttons">                                  
                                <label class="btn btn-success">
                                    <a type="" name="status"
                                       <c:if test="${requestScope.tag eq 'all'}">
                                           checked="checked"
                                       </c:if>   
                                       >
                                        <a href="loadTag?tag=all" class="tag">All</a>                                       
                                </label>
                                <label class="btn btn-success">
                                    <a type="" name="status" 
                                       <c:if test="${requestScope.tag eq 'admin'}">
                                           checked="checked"
                                       </c:if>
                                       >
                                        <a href="loadTag?tag=admin" class="tag">Admin</a>
                                </label>
                                <label class="btn btn-success">
                                    <a type="" name="status" 
                                       <c:if test="${requestScope.tag eq 'user'}">
                                           checked="checked"
                                       </c:if>
                                       >
                                        <a href="loadTag?tag=user" class="tag">User</a>
                                </label>

                            </div>
                        </div>




                    </div>
                    <a href="#myModal"  class="trigger-btn" data-toggle="modal" id="create" style="color: black; font-style: bold; font-size: 120%">Click here to Create User</a>
                </div>
                                <h4 style='color: red'>${requestScope.DeleteUser}</h4>
                <h4 style="color: red">${requestScope.SUCESS}</h4>
                <table class="table table-striped table-hover">
                    <thead>
                        <tr>
                            <th>ID</th>
                            <th>Name</th>
                            <th>Email</th>
                            <th>Phone</th>
                            <th>Status</th>
                            <th>Rank</th>
                            <th>Status</th>
                            <th>Action</th>
                        </tr>
                    </thead>
                    <tbody>
                        <c:forEach var="account" items="${sessionScope.ListAccount}">
                        <form action="manage" method="post">
                            <tr>
                                <td> 
                                    <input type="hidden" name="txtUserID" value="${account.userID}"/>
                                    ${account.userID}
                                </td>
                                <td >
                                    <input type="hidden" name="txtUserName" value="${account.userName}"/>
                                    ${account.userName}
                                </td>
                                <td>
                                    <input type="hidden"  name="txtEmail" value="${account.email}"/>
                                    ${account.email}
                                </td>
                                <td>
                                    <input type="hidden"  name="txtPhone" value="${account.phone}"/>
                                    ${account.phone}
                                </td>
                                <c:forEach var="role" items="${sessionScope.ListRole}">
                                    <c:if test="${account.roleID == role.roleID && role.roleID == 1}">
                                        <td>
                                            <input type="hidden" name="txtRole" value="${account.roleID}"/>
                                            <span class="success">${role.roleName}</span>
                                        </td>
                                    </c:if>
                                    <c:if test="${account.roleID == role.roleID && role.roleID == 2}">
                                        <td>
                                            <input type="hidden"  name="txtRole" value="${account.roleID}"/>
                                            <span class="warning">${role.roleName}</span>
                                        </td>
                                    </c:if>
                                </c:forEach>
                                <td>
                                    <input type="hidden" name="txtRank" value="${account.rank}"/>
                                    ${account.rank}</td>
                                <td>
                                    <c:if test="${account.status}">
                                        <input type="hidden" name="txtStatus" value="${account.status}"/>
                                        Active
                                    </c:if>
                                    <c:if test="${!account.status}">
                                        <input type="hidden" name="txtStatus" value="${account.status}"/>
                                        Non-Active
                                    </c:if>
                                </td>
                            <input type="hidden" name="txtProID" value="${account.proID}"/>
                            <input type="hidden" name="txtPhoto" value="${account.photo}" />                             
                            <input type="password" name="txtPassword" value="${account.password}" style="display: none;" />
                            <td>
                                <input type="submit" value="manage" class="btn btn-sm manage"/>
                            </td>
                            </tr>
                        </form>
                    </c:forEach>

                    </tbody>
                </table>
                <a href="promotion.jsp">Promotion</a>
                <form action="logOut">
                    <button type="submit" class="btn btn-secondary">LogOut</button>
                </form>
            </div> 
        </div>   
    </div>

    <!-- Modal HTML -->
    <div id="myModal" class="modal fade">
        <div class="modal-dialog modal-login">
            <div class="modal-content">
                <form action="create" method="post">
                    <div class="modal-header">				
                        <h4 class="modal-title">Create</h4>
                        <button type="button" class="close" data-dismiss="modal" aria-hidden="true">&times;</button>
                    </div>
                    <div class="modal-body">				
                        <div class="form-group">
                            <label>Username</label>
                            <input type="text" class="form-control" name="txtUserName" required="required">
                        </div>
                        <div class="form-group">
                            <div class="clearfix">
                                <label>Password</label>							
                            </div>						
                            <input type="password" class="form-control" name="txtPassword" required="required">
                        </div>
                        <div class="form-group">
                            <div class="clearfix">
                                <label>Email</label>							
                            </div>						
                            <input type="text" class="form-control" name="txtEmail" required="required">
                        </div>
                        <div class="form-group">
                            <div class="clearfix">
                                <label>Phone</label>							
                            </div>						
                            <input type="text" class="form-control" name="txtPhone" required="required">
                        </div>
                        <div class="form-group">
                            <div class="clearfix">
                                <label>Photo</label>							
                            </div>						
                            <input type="text" class="form-control" name="txtPhoto" required="required">
                        </div>                          
                    </div>
                    <div class="modal-footer justify-content-between">			
                        <input type="submit" class="btn btn-primary" value="Create">
                    </div>
                </form>
            </div>
        </div>
    </div>
</body>
</html>                                		
