<%-- 
    Document   : searchPostOffice
    Created on : Oct 29, 2018, 2:53:56 PM
    Author     : NgoQuang
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<jsp:include page="/WEB-INF/layouts/Header.jsp"></jsp:include>
    <section id="main">
        <br>
        <center><h3>TRA CỨU MẠNG LƯỚI BƯU CỤC</h3></center>
        <div style="padding:20px;">
            <div class="row">
                <div class="col-md-6">

                </div>
                <div class="col-md-6">
                    <div class="container">
                        <!-- div box thứ nhất (cái ở trên) -->
                        <div class="row search-box p-3 mb-2 bg-info text-light">
                            <div class="col-sm-6 col-left">
                                <label>Tỉnh/Thành phố</label>
                                <select name="cityID" id="citySelector" class="form-control">
                                    <option value="">Select city</option>
                                    <c:forEach items="${listCity}" var="city">
                                        <option value="${city.cityID}">${city.cityName}</option>
                                    </c:forEach>
                                </select>
                            </div>

                            <div class="col-sm-6 col-left col-right">
                                <label>Quận/Huyện</label>
                                <select name="districtID" id="districtSelector" class="form-control">
                                    <option value="">Select district</option>
                                </select>
                            </div>

                            <div class="col-sm-6 col-left">
                                <label>Tìm dịch vụ</label>
                                <select name="serviceID" class="form-control">
                                    <!-- sẽ thay đổi dựa vào các loại dịch vụ mình tiến hành làm -->
                                    <option selected="selected" value=""></option> 
                                    <option value="C">Bưu kiện trong nước</option>
                                </select>
                            </div>

                            <div class="col-sm-2 col-right col-left">
                                <label>Tìm Kiếm</label><br/>
                                <input type="button" value="Tìm kiếm" class="btn btn-warning text-light" onclick="searchPostOffice()"> <!-- chưa làm onclick -->
                            </div>
                        </div>  

                        <hr>
                        <!-- div box thứ hai (cái ở dưới) -->
                        <div class="row search-box p-3 mb-2 bg-warning text-darkt">
                            <div class="col-sm-12 col-left">
                                <label>Danh sách bưu cục</label>
                                <div class="form-group">
                                    
                                </div>
                            </div>
                        </div>
                    </div>
                    <div>
                    </div>
                </div>

                </section>
<jsp:include page="/WEB-INF/layouts/Footer.jsp"></jsp:include>
