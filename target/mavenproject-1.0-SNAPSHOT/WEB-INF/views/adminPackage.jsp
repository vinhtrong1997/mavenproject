<%-- 
    Document   : home
    Created on : Aug 16, 2018, 8:22:02 PM
    Author     : Ngo Quang Trong
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<jsp:include page="/WEB-INF/layouts/adminHeader.jsp"></jsp:include>
    <script src="webjars/chartjs/2.1.3/Chart.min.js"></script>
    <script src="dist/js/jsChart.js"></script>
    <section id="BreadCrumb">
        <div class="container">
            <ol class="breadcrumb">
                <li class="active">Dashboard</li>
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
                            Dashborad
                        </a>
                        <a href="managePackage" class="list-group-item"><span class="fa fa-address-card" area-hidden="true"></span> QL Bưu Phẩm</a>
                        <a href="managePostOffice" class="list-group-item"><span class="fa fa-building" area-hidden="true"></span> QL Bưu Cục</a>
                        <a href="manageUsers" class="list-group-item"><span class="fa fa-users" area-hidden="true"></span>  QL User</a>
                    </div>

                </div>
                <div class="col-md-9">
                    <div class="panel panel-default">
                        <div class="panel-heading main-color-bg">
                            <h3 class="panel-title">Tổng quan</h3>
                        </div>
                        <div class="panel-body dash-box">
                            <div class="col-md-3">
                                <div class="well">
                                    <h2><span class="fa fa-file" area-hidden="true"></span> 28</h2>
                                    <h4>Bưu phẩm</h4>
                                </div>
                            </div>
                            <div class="col-md-3">
                                <div class="well">
                                    <h2><span class="fa fa-user" area-hidden="true"></span> 8</h2>
                                    <h4>Thành viên</h4>
                                </div>
                            </div>
                            <div class="col-md-3">
                                <div class="well">
                                    <h2><span class="fa fa-building" area-hidden="true"></span> 58</h2>
                                    <h4>Bưu cục</h4>
                                </div>
                            </div>
                            <div class="col-md-3">
                                <div class="well">
                                    <h2><span class="fa fa-paper-plane" area-hidden="true"></span> 2218</h2>
                                    <h4>Lượt gửi</h4>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>
        <div class="container">
            <div class="panel panel-primary">
                <div class="panel-heading">
                    <h3 class="panel-title">Thống kê</h3>
                </div>
                <div class="panel-body">
                    <div class="col-md-6">
                        <canvas id="pie-chart" width="800" height="450"></canvas>
                    </div>
                    <div class="col-md-6">
                        <canvas id="line-chart" width="800" height="450"></canvas>
                    </div>
                </div>
            </div>
        </div>
    </section>

<jsp:include page="/WEB-INF/layouts/adminFooter.jsp"></jsp:include>
