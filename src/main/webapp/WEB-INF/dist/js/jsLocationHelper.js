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
                json = JSON.stringify(respone);
                console.log(json);
                
                $.each(JSON.parse(json), function(key,value){
                   var option = new Option(value.districtName, value.districID);
                   $district.append($(option));
                });
            }
        });
        
    });
    
});


