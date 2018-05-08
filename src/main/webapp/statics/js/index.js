$(function () {
    $.ajax({
        type : 'post',
        url: 'show',
        data:'pageIndex=1',
        dataType:"html",
        success:function(data) {
            $("#show").empty();
            $("#show").append(data);
        }
    });
    $.ajax({
        type : 'post',
        url: 'showid',
        success:function(data){
            $("#warehouseno").val("TY00000"+data);
        }
    });

    $("input").on('blur',function(){
        $(this).css("border","1px solid black");
    })

    $("#show").on("click",".ss",function(e){
        $(e.target).parent().siblings().css("background","white");
        $(e.target).parent().css("background","red");
        var name=$(e.target).parent().attr("name");

        $.ajax({
            type : 'post',
            url: 'id',
            data:'warehouseno='+name,
            dataType:"json",
            success:function(data) {
               $("input[name='warehouseno']").val("TY00000"+data.warehouseno);
                $("input[name='commodityname']").val(data.commodityname);
                $("input[name='supplier']").val(data.supplier);
                $("input[name='specifications']").val(data.specifications);
                $("input[name='specificationunit']").val(data.specificationunit);
                $("input[name='number']").val(data.number);
                $("input[name='price']").val(data.price);
                $("input[name='storagdate']").val(fmtDate(data.storagdate));
                $("textarea").html(data.remarks);

                var category = document.getElementById("unit");
                var ops = category.options;
                for ( var i = 0; i < ops.length; i++) {
                    if (ops[i].value == data.unit) {
                        ops[i].selected = true;
                        return;
                    }
                }
            }
        });
    });

})

function fmtDate(inputTime) {
    var date = new Date(inputTime);
    var y = date.getFullYear();
    var m = date.getMonth() + 1;
    m = m < 10 ? ('0' + m) : m;
    var d = date.getDate();
    d = d < 10 ? ('0' + d) : d;
    var h = date.getHours();
    h = h < 10 ? ('0' + h) : h;
    var minute = date.getMinutes();
    var second = date.getSeconds();
    minute = minute < 10 ? ('0' + minute) : minute;
    second = second < 10 ? ('0' + second) : second;
    return y + '-' + m + '-' + d + ' ' + h + ':' + minute + ':' + second;
}

function page(id) {
    $.ajax({
        type : 'post',
        url: 'show',
        data:'pageIndex='+id,
        dataType:"html",
        success:function(data) {
            $("#show").empty();
            $("#show").append(data);
        }
    });
}

function add() {
    var flag = true;
    var put = document.getElementsByTagName("input");
    for(var i=1;i<put.length-2;i++){
       if(put[i].value == ""){
           put[i].style.border = "1px solid red";
           alert(put[i].parentNode.parentNode.firstChild.parentElement.innerText+"，不能为空");
           return false;
       }
    }
    $.ajax({
        type : 'post',
        url: 'name',
        data:$("form").serialize() ,
        dataType:"html",
        success:function(data){
            if(data > 0){
                $("p").html("商品名称重复");
                flag = false;
            }
            if(flag == true){
                $.ajax({
                    type : 'post',
                    url: 'add',
                    data:$("form").serialize() ,
                    dataType:"html",
                    success:function(data){
                        $("#show").empty();
                        $("#show").append(data);
                        $("p").html("添加成功");

                        $.ajax({
                            type : 'post',
                            url: 'showid',
                            success:function(data){
                                $("#warehouseno").val("TY00000"+data);
                            }
                        });
                        var put = document.getElementsByTagName("input");
                        for(var i=0;i<put.length-1;i++){
                            put[i].value = "";
                        }
                        $("textarea").val("");
                    }

                });
            }
        }
    });

}

function show(pageIndex) {
    $.ajax({
        type : 'post',
        url: 'show',
        data: 'pageIndex = '+pageIndex,
        dataType:"html",
        success:function(data){
            $("#show").append(data);
        }

    });
}




