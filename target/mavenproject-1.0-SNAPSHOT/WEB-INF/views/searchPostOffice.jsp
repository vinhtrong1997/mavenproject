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
        <center><h3>_____ ///// _____</h3></center>
        <div style="padding:20px;">
            <div class="row">
                <div class="col-md-6">
                    <div id="map" style="width:100%;">
                        <iframe src="https://www.google.com/maps/embed?pb=!1m18!1m12!1m3!
                                1d3723.8977453149246!2d105.83245751424809!3d21.036777085994046!
                                2m3!1f0!2f0!3f0!3m2!1i1024!2i768!4f13.1!3m3!1m2!
                                1s0x3135aba15ec15d17%3A0x620e85c2cfe14d4c!2zTMSDbmcgSOG7kyBDaMOtIE1pbmg!
                                5e0!3m2!1svi!2sus!4v1501056274257" width="100%" height="100%"
                                frameborder="0" style="border:0" allowfullscreen>
                        </iframe>
                    </div>
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
                                <select name="serviceID" id="serviceSelector" class="form-control">
                                    <c:forEach items="${listService}" var="service">
                                        <option value="${service.serviceID}">${service.serviceName}</option>
                                    </c:forEach>
                                </select>
                            </div>

                            <div class="col-sm-2 col-right col-left">
                                <label>Tìm Kiếm</label><br/>
                                <input type="button" value="Tìm kiếm" class="btn btn-warning text-light" onclick="searchPostOffice()">
                            </div>
                        </div>  
                    </div>
                    <hr>
                    <div class="row list-post">
                        <h5>DANH SÁCH BƯU CỤC</h5>
                        <hr>
                        
                    </div>
                    
                <div>
            </div>
        </div>   
    </section>
<jsp:include page="/WEB-INF/layouts/Footer.jsp"></jsp:include>
