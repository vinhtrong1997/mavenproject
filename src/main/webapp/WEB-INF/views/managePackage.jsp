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
                            <h3 class="panel-title">Danh sách bưu phẩm</h3>
                        </div>
                        <div class="panel-body dash-box">
                            <table class="table table-striped table-hover">
                                <thead>
                                    <tr>
                                        <th>Mã bưu phẩm</th>
                                        <th>Khối lượng</th>
                                        <th>Người gửi</th>
                                        <th>Ngày</th>
                                        <th>Dịch vụ</th>
                                        <th>Tổng phí</th>
                                    </tr>
                                </thead>
                                <tbody>
                                <c:forEach items="${listPackage}" var="packageSending">
                                    <tr>
                                        <td><a href="javascript:viewdetailpackage('${packageSending.packageID}');">${packageSending.packageID}</a></td>
                                        <td>${packageSending.weight}</td>
                                        <td>${packageSending.senderID}</td>
                                        <td>${packageSending.date}</td>
                                        <td>${packageSending.serviceID}</td>
                                        <td>${packageSending.totalFee}</td>
                                    </tr>
                                </c:forEach>
                            </tbody>
                        </table>
                    </div>
                </div>

                <div class="panel panel-default">
                    <div class="panel-heading">
                        <h3 class="panel-title">Chi tiết</h3>
                    </div>
                    <div class="panel-body">
                        <div class="row">
                            <div class="col-md-6" id="detailFrom">
                                <strong>From:</strong>
                                <br>
                                <span id="senderName"></span>
                                <br>
                                <span id="senderAddress"></span>
                                <br>
                                <span id="senderPhone"></span>
                                <br>
                            </div>
                            <div class="col-md-6" id="detailTo">
                                <strong>To:</strong>
                                <br>
                                <span id="recieverName"></span>
                                <br>
                                <span id="recieverAddress"></span>
                                <br>
                                <span id="recieverPhone"></span>
                                <br>
                            </div>

                            <div class="col-md-12">
                                <table class="table table-striped table-hover">
                                    <thead>
                                        <tr>
                                            <th>Mã bưu phẩm</th>
                                            <th>Khối lượng</th>
                                            <th>BC Nhận</th>
                                            <th>BC Phát</th>
                                            <th>Ngày</th>
                                            <th>Tổng phí</th>
                                        </tr>
                                    </thead>
                                    <tbody>
                                    <td id="packageID"></td>
                                    <td id="weight"></td>
                                    <td id="srcPO"></td>
                                    <td id="desPO"></td>
                                    <td id="date"></td>
                                    <td id="totalFee"></td>
                                    </tbody>
                                </table>
                            </div>
                            <center>
                                <div id="qrcode"></div>
                            </center>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </div>
</section>
<jsp:include page="/WEB-INF/layouts/adminFooter.jsp"></jsp:include>
