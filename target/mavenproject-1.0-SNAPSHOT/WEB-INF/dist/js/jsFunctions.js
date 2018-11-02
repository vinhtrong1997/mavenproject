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


