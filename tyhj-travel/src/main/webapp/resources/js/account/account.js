/**
 * 
 */
function  login(){
	$.ajax({
			url:"<%=basePath%>account/doLogin.html",
			type : "post",
			data:{'accountName':$('#accountName').val(),'accountPass':$('#accountPass').val()},
			dataType : "json",
			success : function(data) {
				if(data.result == 1){
			 		fun();//显示倒计时
					flag =  true;
					$("#baseid").val(data.baseid);
					$(".dialog-contant").slideToggle("1000");//弹窗隐藏
					$(".dialog").fadeToggle("1000");//半透明背景隐藏
				}
				else{
					alert(data.message);
					changeVerifyCode();
					flag =  false;
				}
			},
			error : function(XMLHttpRequest, textStatus, errorThrown) {
				console.log("error:" + XMLHttpRequest.status + ","
						+ XMLHttpRequest.readyState + "," + textStatus);
			},

		});
}