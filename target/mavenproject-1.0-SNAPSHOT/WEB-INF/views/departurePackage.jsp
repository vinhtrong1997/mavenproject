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
                        <a href="managePackage" class="list-group-item active main-color-bg">
                            <span class="fa fa-tachometer" area-hidden="true"></span>
                        <c:out value="${pageTitle}"></c:out>
                        </a>
                        <a href="controlPackage?control=addPackage" class="list-group-item"><span class="fa fa-pencil" area-hidden="true"></span> Thêm Bưu Phẩm</a>
                        <a href="controlPackage?control=arrivalPackage" class="list-group-item"><span class="fa fa-external-link" area-hidden="true"></span> QL Bưu phẩm đến</a>
                        <a href="controlPackage?control=departurePackage" class="list-group-item"><span class="fa fa-envelope-open" area-hidden="true"></span>  QL Bưu phẩm đi</a>
                    </div>

                </div>
                <div class="col-md-9">
                    <div class="panel panel-default">
                        <div class="panel-heading main-color-bg">
                            <h3 class="panel-title">Xác nhận bưu phẩm đi</h3>
                        </div>
                        <div class="panel-body dash-box">
                            
                        </div>
                    </div>
                    <div class="row">
                        <div class="col-sm-8">
                            <div class="alert alert-info">
                                <h5>Quét QR Code</h5>
                                <center>
                                    <video width="250" id="webcam" poster="dist/images/qr-logo.png">

                                    </video>
                                </center>
                                <br>
                                <center><input type="button" class="btn btn-info" value="Quét Mã" onclick="scanQRCodeDAPackage()"/></center>
                            </div>
                        </div>
                    </div>
                </div>
        </div>
    </div>
</section>
<script src="dist/js/instascan.min.js"></script>
<jsp:include page="/WEB-INF/layouts/adminFooter.jsp"></jsp:include>
