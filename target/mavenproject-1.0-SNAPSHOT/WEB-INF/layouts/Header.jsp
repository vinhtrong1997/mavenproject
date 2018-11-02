<%-- 
    Document   : Navbar
    Created on : Aug 23, 2018, 9:57:47 PM
    Author     : Ngo Quang Trong
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1"/>
        <title>VN POST</title>
        <script src="webjars/jquery/1.9.1/jquery.min.js"></script>
        <script src="webjars/bootstrap/4.1.3/js/bootstrap.min.js"></script>
        <script src="dist/js/jsLocationHelper.js"></script>
        <script src="dist/js/jsFunctions.js"></script>
        <link rel="stylesheet" href="webjars/bootstrap/4.1.3/css/bootstrap.min.css"/>
        <link rel="stylesheet" href="dist/css/all.css" />
    </head>
<body>
<nav class="navbar navbar-expand-md navbar-dark fixed-top bg-warning">
    <a class="navbar-brand" href="">VN Post</a>
    <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbars" aria-controls="navbars" aria-label="Toggle navigation">
        <span class="navbar-toggler-icon"></span>
    </button>

    <div class="collapse navbar-collapse" id="navbars">
        <ul class="navbar-nav mr-auto">
            <li class="nav-item">
                <div class="btn-group">
                    <button type="button" class="btn btn-info dropdown-toggle" data-toggle="dropdown" aria-haspopup="true">
                      Tra cứu
                    </button>
                    <div class="dropdown-menu">
                      <a class="dropdown-item" href="">Tra cước dịch vụ</a>
                      <div class="dropdown-divider"></div>
                      <a class="dropdown-item" href="searchPostOffice">Tra cứu bưu cục</a>
                    </div>
                </div>
            </li>
            <li class="nav-item">
                <a class="nav-link text-white" href="trackingPackage">Định vị bưu phẩm</a>
            </li>
            <li class="nav-item">
                <button type="button" class="btn btn-success" data-toggle="modal" data-target="#loginModal">
                    Đăng nhập
                </button>
            </li>
            <li class="nav-item">
                <a class="nav-link text-info" href="#">Đăng ký</a>
            </li>
        </ul>
        <form class="form-inline my-2 my-lg-0">
            <input class="form-control mr-sm-2" type="text" placeholder="Search" aria-label="Search">
            <button class="btn btn-info my-2 my-sm-0" type="submit">Search</button>
        </form>
    </div>
</nav>

<!-- Modal -->
<div class="modal fade" id="loginModal" tabindex="-1" role="dialog" aria-labelledby="loginModalLabel" aria-hidden="true">
  <div class="modal-dialog" role="document">
      <form action="login/userLogin.do" method="POST">
        <div class="modal-content">
          <div class="modal-header">
            <h5 class="modal-title" id="loginModalLabel">Đăng nhập</h5>
            <button type="button" class="close" data-dismiss="modal" aria-label="Close">
              <span aria-hidden="true">&times;</span>
            </button>
          </div>
          <div class="modal-body">
            <div class="form-group">
              <label>Username</label>
              <input type="text" name="username" class="form-control" placeholder="Enter username" required/>
            </div>
            <div class="form-group">
              <label>Password</label>
              <input type="password" name="password" class="form-control" placeholder="Enter password" required/>
            </div>
            <div class="form-check">
              <input type="checkbox" class="form-check-input" name="checkRemember">
              <label class="form-check-label">Remember me</label>
            </div>
          </div>
          <div class="modal-footer">
            <button type="button" class="btn btn-secondary" data-dismiss="modal">Close</button>
            <button type="submit" class="btn btn-primary">Login</button>
          </div>
        </div>
      </form>
  </div>
</div>