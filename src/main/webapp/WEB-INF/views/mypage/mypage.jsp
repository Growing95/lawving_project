<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<style type="text/css">
#box{position: relative; width: 600px; height: auto; margin: 0 auto;}
#rtoolmenu {
list-style-type: none;
padding: 0;
position: fixed;
overflow: auto;
left:5.2%;
bottom:40%;
z-index:10000;
}
#m1,#m2{width: 200px;height: 100px; font-size: 30px; 
 border-radius: 10px;border: none;
background-color: #36454F;
font-family: 'Abril Fatface', cursive;
color: white;
}
#m1:hover{background-color: white; color: black;}
#m2:hover{background-color: white; color: black;}
.tab{background-color: white; width: 600px; height: 500px; margin: auto; border-radius: 20px; }
#box div{
width: 600px;
height: auto;
margin: auto;}
caption{font-weight: bold; color: white; font-size: 40px;}
article{height: 0 auto; background-color: #85929E;
 border-radius: 20px;
}
</style>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
<script type="text/javascript">
$(function() {
	$(document).on('click','#m2',function() {
		$('.menu1').css('display','none');
	    $('.menu2').css('display','');
	});
	$(document).on('click','#m1',function() {
		$('.menu2').css('display','none');
	    $('.menu1').css('display','');
	});
})
</script>
<body>
<c:import url="/WEB-INF/views/header.jsp" />
<article>
<div id="box">
	<div class="menu1" style="display: block;">
	<table class="tab">
	<caption>MY Information</caption>
	<tbody>
	 <c:choose>
	<c:when test="${!empty members}">
	<tr><td colspan="2">회원정보없음</td></tr>
	</c:when>
	<c:otherwise>
	<tr><td>이름 :</td><td><input type="text" disabled value="${members.members_name }"></td></tr>
	<tr><td>ID :</td><td><input type="text" disabled value="${members.members_id }"></td></tr>
	<tr><td>Email :</td><td><input type="text" disabled value="${members.members_email }"></td></tr>
	<tr><td>생년월일</td><td><input type="text" disabled value="${members.members_birth}"></td></tr>
	<tr><td>휴대전화</td><td><input type="text" disabled value="${members.members_tel }"></td></tr>
	<tr><td>가입날짜</td><td><input type="text" disabled value="${members.members_reg }"></td></tr>
	<tr><td colspan="2"><button id="signout" style="width: 100px; height: 50px; 
	background-color:#85929E; color: white; font-weight: bold;border-radius: 20px;">회원탈퇴</button></td></tr>
	 </c:otherwise>
	</c:choose>
	</tbody>
	</table>
	</div>
	<ul id="rtoolmenu"><li><button id="m1">INFO</button></li><li><button id="m2">SET INFO</button></li></ul>
	
	<div class="menu2" style="display: none;">
	<table class="tab" >
	<caption>Set Information</caption>
	<tbody>
	 <c:choose>
	<c:when test="${!empty members}">
	<tr><td colspan="2">회원정보없음</td></tr>
	</c:when>
	<c:otherwise>
	<tr><td>이름 :</td><td><input type="text" disabled value="${members.members_name}" ></td></tr>
	<tr><td>ID :</td><td><input type="text" disabled value="${members.members_id }"></td></tr>
	<tr><td>Email :</td><td><input type="text" id="members_email" value="${members.members_email }"></td></tr>
	<tr><td>생년월일</td><td><input type="text" id="members_birth" value="${members.members_birth}"></td></tr>
	<tr><td>휴대전화</td><td><input type="text" id="members_tel" value="${members.members_tel }" ></td></tr>
	<tr><td colspan="2"><button id="signout" style="width: 100px; height: 50px; background-color:#85929E; color: white;
	 font-weight: bold;border-radius: 40px;">수정하기</button></td></tr>
	 </c:otherwise>
	</c:choose>
	</tbody>
	</table>
	</div>
</div>
<br><br><br><br>
</article>
</body>
</html>