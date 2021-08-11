<%-- 
    Document   : promotion
    Created on : Jul 5, 2021, 17:25:20 PM
    Author     : Tu
--%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Promotion Page</title>
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-+0n0xVW2eSR5OomGNYDnhzAbDsOXxcvSN1TPprVMTNDbiYZCxYbOOl7+AMvyTG2x" crossorigin="anonymous">
        <script src="https://unpkg.com/sweetalert/dist/sweetalert.min.js"></script>
        <style>
            body{
            background: #1dbf73;
            } 
            #btnSave{
                width: 70px;
                height: 50px;
                position: absolute;
                left: 50%;
                margin-left: -50px;   
                display: inline;
            }
            a{
                text-decoration: none;
                color: white;
            }
            a:hover{
                color: black;
            }
        </style>
    </head>
    <body>
        <table  class="table table-striped">
            <thead>
                <tr>
                    <th>ID</th>
                    <th>Name</th>
                    <th>User</th>
                    <th>Add</th>                   
                    <th>View</th>                    
                </tr>
            </thead>
            <tbody>
            <h3 style="color: red">${requestScope.SAVE}</h3>
                <c:forEach var="listPro" items="${sessionScope.ListPromotion}">              
                <form action="addPromotion" method="POST">
                    <tr>
                        <td>
                            ${listPro.promotionID}
                            <input type="hidden" name="txtProID" value="${listPro.promotionID}"/>
                        </td>
                        <td>                        
                            ${listPro.promotionName}
                        </td>  
                        <td>
                            <select name="cboxUser" id="inputState5" class="form-control">                                   
                                <c:forEach var="u" items="${sessionScope.getListAccountUser}">
                                    <option value="${u.userID}" <c:if test="${requestScope.CHANGEUSER eq u.userName}">selected</c:if>>
                                        ${u.userName}
                                    </option> 
                                </c:forEach>                                                           
                            </select>
                            
                        </td>
                        <td>
                            <button type="submit" class="btn btn-success">Add</button>
                        </td>

                        <td>
                            <button type="button" class="btn btn-warning">
                                <a href="promotionDetail?proID=${listPro.promotionID}" style="text-decoration: none; color: white;">View</a>
                            </button>
                        </td>
                    </tr>
                </form>
            </c:forEach>
        </tbody>
    </table>

    <div id="btnSave">
        <button type="button" class="btn btn-primary" >
            <a href="home.jsp">Back</a>
        </button>
    </div>
    <script>
        <c:if test="${requestScope.Warning != null}" >
        swal("ERROR!", "${requestScope.Warning}", "warning");
        </c:if>
    </script>
</body>
</html>
