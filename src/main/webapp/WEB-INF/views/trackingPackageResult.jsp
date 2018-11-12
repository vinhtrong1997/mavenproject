<%-- 
    Document   : trackingPackageDelivery
    Created on : Nov 1, 2018, 2:47:57 PM
    Author     : Ngo Quang Trong
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<jsp:include page="/WEB-INF/layouts/Header.jsp"></jsp:include>
    <section id="main">
        <br>
        <center><h3>ĐỊNH VỊ BƯU PHẨM</h3></center>
        <center><h3>_____ ///// _____</h3></center>
        <div class="container-fluid" style="padding:20px;">
            <div class="row">
                <div class="col-md-8" style="padding:10px;">
                    <div class="alert alert-warning">
                        <h5>Nhập mã bưu phẩm</h5>
                        <form action="trackingPackageResult" method="GET">
                            <div class="form-group">
                                <div class="input-group">
                                    <input class="form-control form-control-md" name="packageID" type="text">
                                    <input type="submit" value="Tìm kiếm" class="btn btn-primary">
                                </div>
                            </div>
                        </form>
                    </div>
                    
                    <c:if test="${not empty errorMessage}">
                        <div class="alert alert-error">
                            <c:out value="${errorMessage}" ></c:out>
                        </div>
                    </c:if>
                    
                    
                    <div class="col-md-12 alert alert-warning">
                        <div class="row" style="border-bottom: 2px solid black;">
                            <div class="col-sm-3 package-code">
                                <label><i class="fa fa-barcode"></i> Bưu gửi số</label><br>
                                <strong>
                                    ${packageSending.packageID}
                                </strong>
                            </div>
                            <div class="col-sm-4 package-weight">
                                <label><i class="fa fa-balance-scale"></i> Khối lượng (gam)</label><br>
                                <strong>
                                    ${packageSending.weight}
                                </strong>
                            </div>
                            <div class="col-sm-3 package-location">
                                <label><i class="fa fa-map-marker"></i> Trạng thái</label><br>
                                <strong>
                                    ${packageSending.status}
                                </strong>
                            </div>
                        </div>
                    </div>
                    <div class="col-md-12 alert alert-info">
                        <div class="row">
                            <div class="col-sm-3">
                                <label><i class="fa fa-map-marker"></i><strong> Nước chấp nhận: </strong></label>
                            </div>
                            <div class="col-sm-3">
                                <label>VN - VIETNAM</label>
                            </div>
                            <div class="col-sm-3">
                                <label><i class="fa fa-map-marker"></i><strong> Nước phát: </strong></label>
                            </div>
                            <div class="col-sm-3">
                                <label>VN - VIETNAM</label>
                            </div>
                        </div>
                        <br>
                        <div class="row">
                            <div class="col-sm-3">
                                <label><i class="fa fa-bus"></i><strong> Bưu cục nhận: </strong></label>
                            </div>
                            <div class="col-sm-3">
                                <label>${packageSending.sourceOffice}</label>
                            </div>
                            <div class="col-sm-3">
                                <label><i class="fa fa-bus"></i><strong> Bưu cục phát: </strong></label>
                            </div>
                            <div class="col-sm-3">
                                <label>${packageSending.destinatiOffice}</label>
                            </div>
                        </div>
                    </div>        
                </div>
                <div class="col-md-4" style="padding:10px;">
                    <div class="alert alert-info">
                        <h5>Tìm bằng cách quét QR Code</h5>
                        <center>
                            <video width="250" id="webcam" poster="dist/images/qr-logo.png">
                            
                            </video>
                        </center>
                        <br>
                        <center><input type="button" class="btn btn-info" value="Quét Mã" onclick="scanQRCode()"/></center>
                    </div>
                </div>
            </div>
        </div>
        
        <c:if test="${not empty packageSending}">
            <div class="container-fluid" style="padding:20px;">
                <div class="row tracking-detail">
                    <div class="col-md-8">
                        <h3>THÔNG TIN TRẠNG THÁI</h3>
                    </div>
                </div>
                <div class="page">
                    <div class="tracking__result">
                        <div class="main-container page__container">
                            <div class="timeline">
                                <c:forEach items="${listTrackingResult}" var="trackingResult">
                                    <div class="timeline__group">
                                        <span class="timeline__year">${trackingResult.date}</span>
                                        <div class="timeline__box">
                                            <div class="timeline__date">
                                                <span class="timeline__day"></span>
                                                <span class="timeline__month"></span>
                                            </div>
                                            <div class="timeline__post">
                                                <div class="timeline__content">
                                                    <p>
                                                        <strong>Bưu cục: ${trackingResult.postOfficeID}</strong>
                                                        <br>
                                                        <strong>Địa chỉ: </strong> ${trackingResult.postOfficeAddress}
                                                        <br>
                                                        <strong>Trạng thái: </strong> ${trackingResult.status}
                                                    </p>
                                                </div>
                                            </div>
                                        </div>
                                    </div>
                                </c:forEach>
                            </div>
                        </div>
                    </div>
                </div>
        </c:if>
    </section>
<script src="dist/js/instascan.min.js"></script>
<jsp:include page="/WEB-INF/layouts/Footer.jsp"></jsp:include>
