function searchPostOffice() {

    var cityID = $('#citySelector').val();
    var districtID = $('#districtSelector').val();
    var serviceID = $('#serviceSelector').val();
    $('.list-post').find('div').remove();
    $('<div class="list-office"></div>').appendTo($('.list-post'));
    listOffice = $('.list-office');
    $.ajax({
        type: "POST",
        url: "searchPostOffice",
        data: {
            cityID: cityID,
            districtID: districtID,
            serviceID: serviceID
        },
        success: function (response) {
            var jsonStr = JSON.stringify(response);
            $.each(JSON.parse(jsonStr), function(key,value){
                $('<div class="col-sm-12 col-left post-item"></div>').appendTo($(listOffice));
                postItem = $('.post-item');
                $('<span class="title-post">Mã số:</span>').appendTo($(postItem));
                postItem.append(value.postOfficeID);
                postItem.append('<br>');
                
                $('<span class="title-post">Bưu cục:</span>').appendTo($(postItem));
                postItem.append(value.postOfficeName);
                postItem.append('<br>');
                
                $('<span class="title-post">Địa chỉ:</span>').appendTo($(postItem));
                postItem.append(value.address);
                postItem.append('<hr>');
                postItem.appendTo($(listOffice));
            });
        }
    });
}


function scanQRCode(){
    var scanner = new Instascan.Scanner({
        video: document.getElementById("webcam")
    });
    
    scanner.addListener('scan',content => {
        if(content.length > 0){
            window.location.href = "trackingPackageResult?packageID="+content;
        }
    });
    
    Instascan.Camera.getCameras().then(cameras => {
        if(cameras.length > 0 ){
            scanner.start(cameras[0])
        }
    });
}


function viewdetailpackage(id){
    
    $.ajax({
        type: "POST",
        url: "viewDetail",
        data: {
            packageID: id
        },
        success: function (response){
            jsonString = JSON.stringify(response);
            jsonResult = JSON.parse(jsonString);
            
            refreshDetailPage();
            
            $('#senderName').append(jsonResult[1].fullname);
            $('#senderAddress').append(jsonResult[1].address);
            $('#senderPhone').append(jsonResult[1].mobilePhone);
            
            $('#recieverName').append(jsonResult[2].fullname);
            $('#recieverAddress').append(jsonResult[2].address);
            $('#recieverPhone').append(jsonResult[2].mobilePhone);
            
            $('#packageID').append(jsonResult[0].packageID);
            $('#weight').append(jsonResult[0].weight);
            $('#srcPO').append(jsonResult[3].postOfficeName);
            $('#desPO').append(jsonResult[4].postOfficeName);
            $('#date').append(jsonResult[0].date);
            $('#totalFee').append(jsonResult[0].totalFee + " VNĐ");
            
            var qrcode = new QRCode("qrcode");
            qrcode.makeCode(jsonResult[0].packageID);
            
        }
    });
    
}


function refreshDetailPage(){
    $('#senderName').text("");
    $('#senderAddress').text("");
    $('#senderPhone').text("");

    $('#recieverName').text("");
    $('#recieverAddress').text("");
    $('#recieverPhone').text("");

    $('#packageID').text("");
    $('#weight').text("");
    $('#srcPO').text("");
    $('#desPO').text("");
    $('#date').text("");
    $('#totalFee').text("");
    $('#qrcode').text("");
}


function selectDistrictFrom(){
    var city = $('#citySelectorFrom').val();
    $.ajax({
        type: "POST",
        url: "getDistrict",
        data: {cityID: city},
        success: function(respone){
            var $district = $('#districtSelectorFrom');
            $district.find('option').remove();
            json = JSON.stringify(respone);

            $.each(JSON.parse(json), function(key,value){
               console.log(value);
               var option = new Option(value.districtName, value.districID);
               $district.append($(option));
            });
        }
    });
}

function selectDistrictTo(){
    var city = $('#citySelectorTo').val();
    $.ajax({
        type: "POST",
        url: "getDistrict",
        data: {cityID: city},
        success: function(respone){
            var $district = $('#districtSelectorTo');
            $district.find('option').remove();
            json = JSON.stringify(respone);

            $.each(JSON.parse(json), function(key,value){
                console.log(value);
               var option = new Option(value.districtName, value.districID);
               $district.append($(option));
            });
        }
    });
}


function searchPostOfficeTo() {

    var cityID = $('#citySelectorTo').val();
    var districtID = $('#districtSelectorTo').val();
    $.ajax({
        type: "POST",
        url: "searchPostOffice",
        data: {
            cityID: cityID,
            districtID: districtID,
            serviceID: ''
        },
        success: function (response) {
            var jsonStr = JSON.stringify(response);
            var $desPO = $('#desPostOfficeSelector');
            $desPO.find('option').remove();
            $.each(JSON.parse(jsonStr), function(key,value){
                var option = new Option(value.postOfficeName, value.postOfficeID);
                $desPO.append($(option));
            });
        }
    });
}

function calServiceFee(){
    var weight = $('#weight').val();
    var serviceID = $('#serviceSelector').val();
    $.ajax({
        type: "POST",
        url: "calServiceFee",
        data: {
            weight: weight,
            serviceID: serviceID,
        },
        success: function (response) {
           var jsonStr = JSON.parse(JSON.stringify(response));
           $('#totalFee').val(jsonStr.totalFee);
        }
    });
}


function scanQRCodeDAPackage(){
    var scanner = new Instascan.Scanner({
        video: document.getElementById("webcam")
    });
    
    scanner.addListener('scan',content => {
        if(content.length > 0){
            console.log(content);
            departurePackageFV(content);
        }
    });
    
    Instascan.Camera.getCameras().then(cameras => {
        if(cameras.length > 0 ){
            scanner.start(cameras[0])
        }
    });
}

function departurePackageFV(id){
    $.ajax({
        type: "POST",
        url: "viewDetail",
        data: {
            packageID: id
        },
        success: function (response){
            jsonString = JSON.stringify(response);
            jsonResult = JSON.parse(jsonString);
            console.log(jsonResult);
            $('#senderName').val(jsonResult[1].fullname);
            $('#senderAddress').val(jsonResult[1].address);
            $('#senderPhone').val(jsonResult[1].mobilePhone);
            
            $('#receiverName').val(jsonResult[2].fullname);
            $('#receiverAddress').val(jsonResult[2].address);
            $('#receiverPhone').val(jsonResult[2].mobilePhone);
            
            $('#packageID').val(jsonResult[0].packageID);
            $('#weight').val(jsonResult[0].weight);
            $('#srcPO').val(jsonResult[3].postOfficeName);
            $('#date').val(jsonResult[0].date);
            $('#totalFee').val(jsonResult[0].totalFee + " VNĐ");
        }
    });
}