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
        <div class="alert alert-warning" style="margin: 50px">
            <h5>Nhập mã bưu phẩm</h5>
            <form action="trackingPackage" method="GET">
                <div class="form-group">
                    <div class="input-group">
                        <input class="form-control form-control-md" name="packageID" type="text">
                        <input type="submit" value="Tìm kiếm" class="btn btn-primary">
                    </div>
                </div>
            </form>
        </div>
        
        <div class="container">
            <div class="col-sm-12">
            </div>
        </div>
    </section>
<jsp:include page="/WEB-INF/layouts/Footer.jsp"></jsp:include>
