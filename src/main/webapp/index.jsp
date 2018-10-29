<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="springForm" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">

<jsp:include page="/WEB-INF/layouts/Header.jsp"></jsp:include>
    <section id="main">
        <div class="container-fluid">
            <div id="slider" class="carousel slide" data-ride="carousel">
                <ol class="carousel-indicators">
                    <li data-target="#slider" data-slide-to="0" class="active"></li>
                    <li data-target="#slider" data-slide-to="1"></li>
                    <li data-target="#slider" data-slide-to="2"></li>
                </ol>
                <div class="carousel-inner">
                    <div class="carousel-item active">
                        <img class="d-block w-100" src="dist/images/Slide-image-1.jpg" alt="First slide">
                    </div>
                    <div class="carousel-item">
                        <img class="d-block w-100" src="dist/images/Slide-image-2.jpg" alt="Second slide">
                    </div>
                    <div class="carousel-item">
                        <img class="d-block w-100" src="dist/images/Slide-image-3.png" alt="Third slide">
                    </div>
                </div>
                <a class="carousel-control-prev" href="#slider" role="button" data-slide="prev">
                    <span class="carousel-control-prev-icon" aria-hidden="true"></span>
                    <span class="sr-only">Previous</span>
                </a>
                <a class="carousel-control-next" href="#slider" role="button" data-slide="next">
                    <span class="carousel-control-next-icon" aria-hidden="true"></span>
                    <span class="sr-only">Next</span>
                </a>
            </div>
        </div>
        <div class="container cardServices">
            <div class="row">
                <div class="col-md-4 col-sm-12">
                    <div class="card" style="width: 100%;">
                        <img class="card-img-top" src="dist/images/1cpn-avata.jpg" alt="Card image cap">
                        <div class="card-body">
                          <h5 class="card-title">Dịch vụ chuyển phát nhanh</h5>
                          <p class="card-text">Some quick example text to build on the card title and make up the bulk of the card's content.</p>
                          <a href="#" class="btn btn-primary">Chi tiết</a>
                        </div>
                    </div>
                </div>
                <div class="col-md-4 col-sm-12">
                    <div class="card" style="width: 100%;">
                        <img class="card-img-top" src="dist/images/1cptietkiemvtk.jpg" alt="Card image cap">
                        <div class="card-body">
                          <h5 class="card-title">Dịch vụ chuyển tiết kiệm</h5>
                          <p class="card-text">Some quick example text to build on the card title and make up the bulk of the card's content.</p>
                          <a href="#" class="btn btn-primary">Chi tiết</a>
                        </div>
                    </div>
                </div>
                <div class="col-md-4 col-sm-12">
                    <div class="card" style="width: 100%;">
                        <img class="card-img-top" src="dist/images/2hoatoc.jpg" alt="Card image cap">
                        <div class="card-body">
                          <h5 class="card-title">Dịch vụ chuyển đảm bảo</h5>
                          <p class="card-text">Some quick example text to build on the card title and make up the bulk of the card's content.</p>
                          <a href="#" class="btn btn-primary">Chi tiết</a>
                        </div>
                    </div>
                </div>
            </div>
        </div>
        <div class="container containerTwo">
            <div class="row">
                <div class="col-md-7 col-sm-12">
                    <div class="content-title">
                        <h2>Tin tức</h2>
                    </div>
                    <div class="news-content">
                        <ul>
                            <li><a href="#">GIẢM GIÁ 50% CHO 3 ĐƠN HÀNG ĐẦU TIÊN TRÊN ỨNG DỤNG VNPOST</a></li>
                            <li><a href="#">“TUẦN LỄ VÀNG: Chuyển phát thả ga, không lo về giá.</a></li>
                            <li><a href="#">VN POST MIỄN PHÍ 100% CHI PHÍ HỘP CHO KHÁCH HÀNG</a></li>
                            <li><a href="#">GIẢM 20% CƯỚC KHI KHÁCH MANG HÀNG RA GỬI TẠI BƯU CỤC</a></li>
                            <li><a href="#">Giảm giá 20% cước chuyển phát trên tất cả các Bưu cục của VN Post</a></li>
                        </ul>
                    </div>
                </div>
                <div class="col-md-5 col-sm-12">
                    <div class="content-title">
                        <h2>Video</h2>
                    </div>
                    <div class="video-content">
                        
                    </div>
                </div>
            </div>
        </div>
    </section>
<jsp:include page="/WEB-INF/layouts/Footer.jsp"></jsp:include>
