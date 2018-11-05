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
                </div>
                <div class="col-md-4" style="padding:10px;">
                    <div class="alert alert-warning">
                        <h5>Tìm bằng cách quét QR Code</h5>
                        <center>
                            <video width="250" id="webcam" poster="dist/images/qr-logo.png">
                            
                            </video>
                        </center>
                        <br>
                        <center><input type="button" class="btn btn-warning" value="Quét Mã" onclick="scanQRCode()"/></center>
                    </div>
                </div>
            </div>
        </div>
    </section>
    <script src="dist/js/instascan.min.js"></script>
<jsp:include page="/WEB-INF/layouts/Footer.jsp"></jsp:include>
