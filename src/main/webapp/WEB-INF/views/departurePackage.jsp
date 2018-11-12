<%-- 
    Document   : managePackage
    Created on : Nov 6, 2018, 3:38:20 PM
    Author     : NgoQuang
--%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<jsp:include page="/WEB-INF/layouts/adminHeader.jsp"></jsp:include>
    <script src="dist/js/jsFunctions.js"></script>
    <section id="BreadCrumb">
        <div class="container">
            <ol class="breadcrumb">
                <li class="active"><c:out value="${pageTitle}"></c:out></li>
            </ol>
        </div>
    </section>

    <section id="main">
        <div class="container-fluid">
            <div class="row">
                <div class="col-md-2">
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
                <div class="col-md-7">
                    
                <c:if test="${not empty notification}">
                    <div class="alert alert-success">
                        <div class="container">
                            <div class="alert-icon">
                                <i class="material-icons">check</i>
                            </div>
                            <button type="button" class="close" data-dismiss="alert" aria-label="Close">
                                <span aria-hidden="true"><i class="material-icons">clear</i></span>
                            </button>
                            <b>Success Alert:</b> <c:out value="${notification}"></c:out>
                        </div>
                    </div>
                </c:if>
                    
                    <form action="controlPackage" method="POST">
                        <input type="hidden" name="control" value="departurePackage" />
                        <div class="panel panel-default">
                            <div class="panel-heading main-color-bg">
                                <h3 class="panel-title">Xác nhận bưu phẩm đi</h3>
                            </div>
                            <div class="panel-body dash-box">
                                <div class="form-row">
                                    <div class="col-md-4 mb-3">
                                        <label>Mã bưu phẩm</label>
                                        <input type="text" class="form-control" name="packageID" id="packageID" placeholder="Package ID" readonly>
                                    </div>
                                    <div class="col-md-4 mb-3">
                                        <label>Khối lượng</label>
                                        <input type="text" class="form-control" name="weight" id="weight" placeholder="Weight" readonly>
                                    </div>
                                    <div class="col-md-4 mb-3">
                                        <label>Tổng phí</label>
                                        <input type="text" class="form-control" name="totalFee" id="totalFee" placeholder="Total Fee" readonly>
                                    </div>
                                </div>
                                <br><br><br>
                                <hr>
                                <div class="form-row">
                                    <div class="col-md-4 mb-3">
                                        <label>Ngày nhận</label>
                                        <input type="text" class="form-control" name="date" id="date" placeholder="Date" readonly>
                                    </div>
                                    <div class="col-md-4 mb-3">
                                        <label>Bưu cục nhận</label>
                                        <input type="text" class="form-control" name="srcPO" id="srcPO" placeholder="Source Post Office" readonly>
                                    </div>
                                    <div class="col-md-4 mb-3">
                                        <label>Dịch vụ</label>
                                        <input type="text" class="form-control" name="service" id="service" placeholder="Service" readonly>
                                    </div>
                                </div>
                            </div>
                        </div>
                        <div class="col-sm-6">
                            <div class="panel panel-primary">
                                <div class="panel-heading">
                                    <h3 class="panel-title">Người gửi</h3>
                                </div>
                                <div class="panel-body dash-box">
                                   <label>Tên người gửi</label>
                                   <input type="text" class="form-control" name="senderName" id="senderName" readonly>
                                   <br>
                                   <label>Địa chỉ</label>
                                   <input type="text" class="form-control" name="senderAddress" id="senderAddress" readonly>
                                   <br>
                                   <label>Số ĐT</label>
                                   <input type="text" class="form-control" name="senderPhone" id="senderPhone" readonly>
                                </div>
                            </div>
                        </div>
                        <div class="col-sm-6">
                            <div class="panel  panel-success">
                                <div class="panel-heading">
                                    <h3 class="panel-title">Người nhận</h3>
                                </div>
                                <div class="panel-body dash-box">
                                   <label>Tên người nhận</label>
                                   <input type="text" class="form-control" name="receiverName" id="receiverName" readonly>
                                   <br>
                                   <label>Địa chỉ</label>
                                   <input type="text" class="form-control" name="receiverAddress" id="receiverAddress" readonly>
                                   <br>
                                   <label>Số ĐT</label>
                                   <input type="text" class="form-control" name="receiverPhone" id="receiverPhone" readonly>
                                </div>
                            </div>
                        </div>
                        <br><br><br>
                        <hr>
                        <div class="col-sm-12">
                            <div class="panel  panel-success">
                                <div class="panel-heading">
                                    <h3 class="panel-title">Xác nhận bưu cục tiếp theo</h3>
                                </div>
                                <div class="panel-body dash-box">
                                    <label>Chọn bưu cục</label>
                                    <select required name="nextOffice" id="nextOfficeSelector" class="form-control">
                                        <option value="">Select Post Office</option>
                                        <c:forEach items="${listPO}" var="PO">
                                            <option value="${PO.postOfficeID}">${PO.postOfficeName}</option>
                                        </c:forEach>
                                    </select>
                                </div>
                            </div>
                        </div>
                        <center>
                            <input type="submit" value="Xác nhận" class="btn btn-lg btn-primary" />
                        </center>
                    </form>
                </div>
                <div class="col-md-3">
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
    </section>
    <script src="dist/js/instascan.min.js"></script>
<jsp:include page="/WEB-INF/layouts/adminFooter.jsp"></jsp:include>
