<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%> 
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script src="https://cdn.bootcss.com/jquery/3.4.1/jquery.min.js"></script>
</head>
<body>
	<div id="divs">
	</div>
	<button>点击按钮发送请求</button>
</body>
	<script type="text/javascript">
		$("button").click(function(){
			$.ajax({
				type:"post",
				url:"AjaxServ",
				success:function(response){
					console.log(response);
				}
			})
		})
		// 定义变量
		// js弱类型
		// int a = 0  
		var var1 = ["abc",true,false,1.0];
		for(var i=0;i<var1.length;i++){
			console.log(var1[i]);
			// System.out.print();
		}
		
		// 创建json格式   js的object对象
		var obj = {
			id:10,
			name:"张三",
			age:18	
		}
		
		console.log(obj.id);
		/**
		  商品                              Java Class                   MySQL                  JSON格式
		  id:1              product.class              商品表             
		  name:口红                    int id = 1;                productId:1             id:1,
		  des:迪奥                      String name = "口红";       productName:口红                 name:口红,
		  price:999         double price = 999.0;      productPrice:999        price:999
		  count:800         double count = 800;        productCount:800        count:800
		**/
		
		
	
	
		/* $("button").click(function(){
			$("#divs").load('ajax.txt',function(response){
				console.log(response);
			})
		}) */
	</script>
</html>