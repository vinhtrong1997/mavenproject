<%-- 
    Document   : adminHeader
    Created on : Nov 6, 2018, 2:32:37 PM
    Author     : NgoQuang
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width; initial-sale=1">
        <link rel="stylesheet" href="dist/css/bootstrap.css">
        <link rel="stylesheet" href="dist/css/style.css">
        <link rel="stylesheet" href="webjars/font-awesome/4.7.0/css/font-awesome.min.css"/>
        <script src="webjars/jquery/1.9.1/jquery.min.js"></script>
        <title>Admin Management | Dashbroad</title>
    </head>
    <body>
        <nav class="navbar navbar-default">
            <div class="container">
                <div class="navbar-header">
                    <button class="navbar-toggle collapsed" type="button" data-toggle="collapse" data-target="#navbar" aria-controls="navbar" aria-expanded="false">
                        <span class="sr-only">Toggle Navigation</span>
                        <span class="icon-bar"></span>
                        <span class="icon-bar"></span>
                        <span class="icon-bar"></span>
                    </button>
                    <a href="dashboard" class="navbar-brand">Admin Management</a>
                </div>
                <div id="navbar" class="collapse navbar-collapse">
                    <ul class="nav navbar-nav">
                        <li class="active"><a href=""><c:out value="${pageTitle}"></c:out></a></li>
                        <li><a href="managePackage">QL Bưu phẩm</a></li>
                        <li><a href="">QL Bưu Cục</a></li>
                        <li><a href="manageUsers">QL User</a></li>
                    </ul>
                    <ul class="nav navbar-nav navbar-right">
                        <li>
                            <a href="">Xin Chào, <c:out value="${sessionScope.userSession.fullname}"></c:out></a>
                        </li>
                        <li>
                            <a href="">Bưu cục, <c:out value="${sessionScope.postOffice.postOfficeID}"></c:out></a>
                        </li>
                        <li><a href="logout">Đăng xuất</a></li>
                    </ul>
                </div>
            </div>
        </nav>

        <!-- header --->
        <header id="header">
            <div class="container">
                <div class="row">
                    <div class="col-md-10">
                        <h1><i class="fa fa-tachometer"></i></span> <c:out value="${pageTitle}"></c:out> <small>| Sức mạng từ niềm tin</small></h1>
                    </div>
                    <div class="col-md-2">
                        
                    </div>
                </div>
            </div>
        </header>

