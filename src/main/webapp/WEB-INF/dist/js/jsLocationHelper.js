$(document).ready(function(){
    
    $('#citySelector').change(function(evt){
        
        var city = $('#citySelector').val();
        $.ajax({
            type: "POST",
            url: "getDistrict",
            data: {cityID: city},
            success: function(respone){
                var $district = $('#districtSelector');
                $district.find('option').remove();
                $.each(respone, function(key,value){
                    $('<option>').val(key).text(value).appendTo($district);
                });
            }
        });
    });
    
});


