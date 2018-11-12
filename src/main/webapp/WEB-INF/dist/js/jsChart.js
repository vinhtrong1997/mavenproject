$(document).ready(function () {

    new Chart(document.getElementById("line-chart"), {
        type: 'line',
        data: {
            labels: [1500, 1600, 1700, 1750, 1800, 1850, 1900, 1950, 1999, 2050],
            datasets: [{
                    data: [86, 114, 106, 106, 107, 111, 133, 221, 783, 2478],
                    label: "Gửi bưu phẩm",
                    borderColor: "#3e95cd",
                    fill: false
                }
            ]
        },
        options: {
            title: {
                display: true,
                text: 'Lượt gửi bưu phẩm trong tháng'
            }
        }
    });


    new Chart(document.getElementById("pie-chart"), {
        type: 'pie',
        data: {
            labels: ["Tháng 4", "Tháng 5", "Tháng 6", "Tháng 7", "Tháng 8"],
            datasets: [{
                    label: "Lượt gửi (sl bưu phẩm)",
                    backgroundColor: ["#3e95cd", "#8e5ea2", "#3cba9f", "#e8c3b9", "#c45850"],
                    data: [2478, 5267, 734, 784, 433]
                }]
        },
        options: {
            title: {
                display: true,
                text: 'Bửu đồ doanh thu của 5 tháng đầu năm'
            }
        }
    });

});


