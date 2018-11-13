
<%-- 
    Document   : managePackage
    Created on : Nov 6, 2018, 3:38:20 PM
    Author     : NgoQuang
--%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<jsp:include page="/WEB-INF/layouts/adminHeader.jsp"></jsp:include>
    <script src="dist/js/jsFunctions.js"></script>
    <script src="dist/js/qrcode.min.js"></script>
    <link rel="stylesheet" href="webjars/datatables/1.10.16/media/css/dataTables.bootstrap4.min.css">
    <script src="webjars/datatables/1.10.16/media/js/jquery.dataTables.min.js" type="text/javascript"></script>
    <script src="webjars/datatables/1.10.16/media/js/dataTables.bootstrap4.min.js" type="text/javascript"></script>
    <section id="BreadCrumb">
        <div class="container">
            <ol class="breadcrumb">
                <li class="active"><c:out value="${pageTitle}"></c:out></li>
            </ol>
        </div>
    </section>

    <section id="main">
        <div class="container">
            <div class="row">
                <div class="col-md-3">                 
                    <div class="list-group">
                        <a href="#" class="list-group-item active main-color-bg">
                            <span class="fa fa-tachometer" area-hidden="true"></span>
                            QL Users
                        </a>
                        <a href="" class="list-group-item"><span class="fa fa-address-card" area-hidden="true"></span> Thêm Users</a>
                        <a href="" class="list-group-item"><span class="fa fa-building" area-hidden="true"></span> Phân quyền</a>
                        <a href="" class="list-group-item"><span class="fa fa-users" area-hidden="true"></span> Other</a>
                    </div>
                </div>
                <div class="col-md-9">
                    <div class="panel panel-default">
                        <div class="panel-heading main-color-bg">
                            <h3 class="panel-title">Danh sách Users</h3>
                        </div>
                        <div class="panel-body dash-box">
                            <table class="table table-striped table-hover" id="myTable">
                                <thead>
                                    <tr>
                                        <th>User ID</th>
                                        <th>User Name</th>
                                        <th>Role ID</th>
                                        <th>Full-name</th>
                                        <th>Email </th>
                                    </tr>
                                </thead>
                                <tbody>
                                    <c:forEach items="${listUser}" var="User">
                                        <tr>
                                            <td><a href="#">${User.userID}</a></td>
                                            <td>${User.username}</td>
                                            <td>${User.roleID}</td>
                                            <td>${User.fullname}</td>
                                            <td>${User.email}</td>
                                        </tr>
                                    </c:forEach>
                                </tbody>
                            </table>
                        <div>
                    </div>
                </div>
            </div>
        </div>
    </div>
</section>
<script>
    $(document).ready(function () {
        $('#myTable').DataTable();
    });
</script>
<jsp:include page="/WEB-INF/layouts/adminFooter.jsp"></jsp:include>

