<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<jsp:include page="/WEB-INF/layouts/Header.jsp"></jsp:include>
    <section id="main">
        <br>
        <center><h3>TRA CỨU CƯỚC DỊCH VỤ</h3></center>
        <center><h3>_____ ///// _____</h3></center>
        <div class="container">
            <div style="padding:20px;" class="row">
                <div class="col-md-2"></div>
                <div class="col-md-8">
                    <div class="tracking-select-wrapper">
                        <div class="clearfix">
                            <h2 class="header-track-form">
                                Thông tin chuyển phát
                            </h2>
                            <div class="col-sm-9 col-sm-offset-3 select-area" style="padding: 10px 15px;">
                                <table  class="btn-group-select">
                                    <tbody><tr>
                                            <td><input  type="radio"  value="1" checked="checked" >
                                                <label>Trong nước</label></td>
                                            <td><input type="radio" value="2" >
                                                <label>Quốc tế</label></td>
                                        </tr>
                                    </tbody></table>
                            </div>

                            <form action="searchServiceFee" method="POST">
                                <div class="col-sm-12">
                                    <div class="form-horizontal">
                                        <div class="form-group">
                                            <label class="col-md-3 control-label">
                                                Gửi từ
                                            </label>
                                            <div class="col-md-9">
                                                <select name="cityIDFrom" class="form-control">
                                                <c:forEach items="${listCity}" var="city">
                                                    <option value="${city.cityID}">${city.cityName}</option>
                                                </c:forEach>
                                            </select>
                                        </div>
                                    </div>
                                </div>
                            </div>

                            <div class="col-sm-12">
                                <div class="form-horizontal">
                                    <div class="form-group">
                                        <label class="col-md-3 control-label">
                                            Gửi đến
                                        </label>
                                        <div class="col-md-9">
                                            <select name="cityIDTo" class="form-control">
                                                <c:forEach items="${listCity}" var="city">
                                                    <option value="${city.cityID}">${city.cityName}</option>
                                                </c:forEach>
                                            </select>
                                        </div>
                                    </div>
                                </div>
                            </div>

                            <div class="col-sm-12">
                                <div class="form-horizontal">
                                    <div class="form-group">
                                        <label class="col-md-3 control-label">

                                            Khối lượng (gram)
                                        </label>
                                        <div class="col-md-9">
                                            <input name="txtWeight" type="text" class="form-control">
                                        </div>
                                    </div>
                                </div>
                            </div>

                            <div class="col-sm-9 col-sm-offset-3">
                                <div class="form-actions right1">
                                    <button type="submit" class="btn btn-primary">Tra cứu</button>
                                </div>
                            </div>
                        </form>
                    </div>
                    <hr>
                        <table class="table-multi-tracking table table-bordered">
                            <tbody>
                                <tr>
                                    <th class="bg-info">
                                        STT
                                    </th>
                                    <th class="bg-info">
                                        Dịch vụ
                                    </th>
                                    <th style="text-align: center;" class="bg-info">
                                        Cước dự tính
                                    </th>
                                    <th class="bg-info">
                                        Thời gian
                                    </th>
                                </tr>
                            <c:if test="${not empty listFee}">
                                <% int count = 0;%>
                                <c:forEach items="${listFee}" var="serviceFee">
                                    <tr>
                                        <td><%=count++%></td>
                                        <td><a href="#">${serviceFee.serviceName}</a></td>
                                        <td>${serviceFee.totalFee} VNĐ</td>
                                        <c:choose>
                                            <c:when test="${serviceFee.serviceID == 'SV0001'}">
                                                <td>Trong ngày</td>
                                            </c:when>
                                            <c:otherwise>
                                              <td></td>
                                            </c:otherwise>
                                        </c:choose>
                                    </tr>
                                </c:forEach>
                            </c:if>
                            </tbody>
                        </table>
                        <hr>
                    </div>
                </div>
            </div>
        </div>
    </section>
<jsp:include page="/WEB-INF/layouts/Footer.jsp"></jsp:include>
