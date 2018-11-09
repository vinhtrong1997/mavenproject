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
    <script src="dist/js/jsFunctions.js"></script>
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
                            <span class="fa fa-tachometer"></span>
                        <c:out value="${pageTitle}"></c:out>
                        </a>
                        <a href="controlPackage?control=addPackage" class="list-group-item"><span class="fa fa-pencil"></span> Thêm Bưu Phẩm</a>
                        <a href="controlPackage?control=arrivalPackage" class="list-group-item"><span class="fa fa-external-link"></span> QL Bưu phẩm đến</a>
                        <a href="controlPackage?control=departurePackage" class="list-group-item"><span class="fa fa-envelope-open"></span>  QL Bưu phẩm đi</a>
                    </div>

                </div>
                <div class="col-md-9">
                    <div class="panel panel-default">
                        <div class="panel-heading main-color-bg">
                            <h3 class="panel-title">Thêm bưu phẩm mới</h3>
                        </div>
                        <div class="panel-body dash-box">
                            <form class="" action="controlPackage" method="POST">
                                <input type="hidden" name="control" value="addPackage" />
                                <strong>Mã bưu phẩm: </strong>
                                <input type="text" name="packageID" id ="packageID" value="${lastPackageID}">
                                <br><br>
                                <div class="form-group">
                                    <div class="row">
                                        <div class="col-md-6" style="border-right: 1px solid;">
                                            <label>Người gửi</label>
                                            <br>
                                            <input required class="form-control" type="text" name="senderName" placeholder="Nhập tên người gửi"/>
                                            <br>
                                            <input required class="form-control" type="text" name="senderAddress" placeholder="Nhập địa chỉ"/>
                                            <br>
                                            <select required name="cityFrom" id="citySelectorFrom" class="form-control"
                                                    onchange="selectDistrictFrom()">
                                                <option value="">Select city</option>
                                                <c:forEach items="${listCity}" var="city">
                                                    <option value="${city.cityID}">${city.cityName}</option>
                                                </c:forEach>
                                            </select>
                                            <br>
                                            <select required name="districtFrom" id="districtSelectorFrom" class="form-control">
                                                <option value="">Select district</option>
                                            </select>
                                            <br>
                                            <input class="form-control" type="text" name="senderPhone" placeholder="Nhập số điện thoại"/>
                                        </div>
                                        <div class="col-md-6">
                                            <label>Người nhận</label>
                                            <br>
                                            <input required class="form-control" type="text" name="recieverName" placeholder="Nhập tên người nhận"/>
                                            <br>
                                            <input required class="form-control" type="text" name="recieverAddress" placeholder="Nhập địa chỉ"/>
                                            <br>
                                            <select required name="cityTo" id="citySelectorTo" class="form-control" onchange="selectDistrictTo()">
                                                <option value="">Select city</option>
                                                <c:forEach items="${listCity}" var="city">
                                                    <option value="${city.cityID}">${city.cityName}</option>
                                                </c:forEach>
                                            </select>
                                            <br>
                                            <select required name="districtTo" id="districtSelectorTo" class="form-control" onchange="searchPostOfficeTo()">
                                                <option value="">Select district</option>
                                            </select>
                                            <br>
                                            <input required class="form-control" type="text" name="recieverPhone" placeholder="Nhập số điện thoại"/>
                                        </div>
                                    </div>
                                    <hr>
                                    <strong>Thông tin bưu cục Nhận/Phát</strong>
                                    <div class="row">
                                        <div class="col-md-6">
                                            <div class="form-group">
                                                <label>Bưu cục nhận</label>
                                                <select name="srcPostOffice" id="srcPostOfficeSelector" class="form-control">
                                                    <option value="${sessionScope.postOffice.postOfficeID}">${sessionScope.postOffice.postOfficeName}</option>
                                                </select>
                                            </div>
                                            
                                        </div>
                                        <div class="col-md-6">
                                            <div class="form-group">
                                                <label>Bưu cục phát</label>
                                                <select required name="desPostOffice" id="desPostOfficeSelector" class="form-control">
                                                    <option value="">Chọn bưu cục</option>
                                                    
                                                </select>
                                            </div>
                                        </div>
                                    </div>
                                    <hr>
                                    <div class="row">
                                        <div class="col-md-6">
                                            <div class="form-group">
                                                <label>Khối lượng (gram)</label>
                                                <input required type="number" name="weight" id="weight" onchange="calServiceFee()"/>
                                            </div>
                                            <div class="form-group">
                                                <label>Dịch vụ</label>
                                                <select required name="serviceID" id="serviceSelector" class="form-control" onchange="calServiceFee()">
                                                    <option value="">Chọn loại dịch vụ</option>
                                                    <c:forEach items="${listService}" var="services">
                                                        <option value="${services.serviceID}">${services.serviceName}</option>
                                                    </c:forEach>
                                                </select>
                                            </div>
                                        </div>
                                        <div class="col-md-6">
                                            <div class="form-group">
                                                <label>Tổng cước phí</label>
                                                <input type="number" name="totalFee" id="totalFee"> VNĐ
                                            </div>
                                        </div>
                                    </div>
                                    <hr>
                                    <input type="submit" value="Xác nhận" class="btn btn-lg btn-primary">
                                </div>
                            </form>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </section>
<jsp:include page="/WEB-INF/layouts/adminFooter.jsp"></jsp:include>
