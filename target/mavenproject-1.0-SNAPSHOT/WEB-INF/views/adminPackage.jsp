<%-- 
    Document   : home
    Created on : Aug 16, 2018, 8:22:02 PM
    Author     : Ngo Quang Trong
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<jsp:include page="/WEB-INF/layouts/adminHeader.jsp"></jsp:include>
    <section id="BreadCrumb">
        <div class="container">
            <ol class="breadcrumb">
                <li class="active">Dashboard</li>
            </ol>
        </div>
    </section>
    
    <section id="main">
        <div class="container">
            <div class="row">
                <div class="col-md-3">
                    <div class="list-group">
                      <a href="#" class="list-group-item active main-color-bg">
                       <span class="fa fa-tachometer" area-hidden="true"></span>
                        Dashborad
                      </a>
                      <a href="managePackage" class="list-group-item"><span class="fa fa-address-card" area-hidden="true"></span> QL Bưu Phẩm</a>
                      <a href="#" class="list-group-item"><span class="fa fa-building" area-hidden="true"></span> QL Bưu Cục</a>
                      <a href="#" class="list-group-item"><span class="fa fa-users" area-hidden="true"></span>  QL User</a>
                    </div>
                    <div class="well">
                        <h4>Disk Used</h4>
                        <div class="progress">
                          <div class="progress-bar progress-bar-success progress-bar-striped" role="progressbar" aria-valuenow="40" aria-valuemin="0" aria-valuemax="100" style="width: 40%">
                            <span class="sr-only">40% Complete (success)</span>
                          </div>
                        </div>
                        <h4>Bandwidth Used</h4>
                        <div class="progress">
                          <div class="progress-bar progress-bar-info progress-bar-striped" role="progressbar" aria-valuenow="20" aria-valuemin="0" aria-valuemax="100" style="width: 20%">
                            <span class="sr-only">20% Complete</span>
                          </div>
                        </div>
                    </div>
                </div>
                <div class="col-md-9">
                    <div class="panel panel-default">
                      <div class="panel-heading main-color-bg">
                        <h3 class="panel-title">Tổng quan</h3>
                      </div>
                      <div class="panel-body dash-box">
                        <div class="col-md-3">
                            <div class="well">
                                <h2><span class="fa fa-file" area-hidden="true"></span> 28</h2>
                                <h4>Bưu phẩm</h4>
                            </div>
                        </div>
                        <div class="col-md-3">
                            <div class="well">
                                <h2><span class="fa fa-user" area-hidden="true"></span> 8</h2>
                                <h4>Thành viên</h4>
                            </div>
                        </div>
                        <div class="col-md-3">
                            <div class="well">
                                <h2><span class="fa fa-building" area-hidden="true"></span> 58</h2>
                                <h4>Bưu cục</h4>
                            </div>
                        </div>
                        <div class="col-md-3">
                            <div class="well">
                                <h2><span class="fa fa-paper-plane" area-hidden="true"></span> 2218</h2>
                                <h4>Lượt gửi</h4>
                            </div>
                        </div>
                      </div>
                    </div>
                    
                    <div class="panel panel-default">
                      <div class="panel-heading">
                        <h3 class="panel-title">Thành viên mới</h3>
                      </div>
                      <div class="panel-body">
                        <table class="table table-striped table-hover">
                            <thead>
                              <tr>
                                <th>Firstname</th>
                                <th>Lastname</th>
                                <th>Email</th>
                              </tr>
                            </thead>
                            <tbody>
                              <tr>
                                <td>John</td>
                                <td>Doe</td>
                                <td>john@example.com</td>
                              </tr>
                              <tr>
                                <td>Mary</td>
                                <td>Moe</td>
                                <td>mary@example.com</td>
                              </tr>
                              <tr>
                                <td>July</td>
                                <td>Dooley</td>
                                <td>july@example.com</td>
                              </tr>
                            </tbody>
                          </table>
                      </div>
                    </div>
                </div>
            </div>
        </div>
    </section>

<jsp:include page="/WEB-INF/layouts/adminFooter.jsp"></jsp:include>
