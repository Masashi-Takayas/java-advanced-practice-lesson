<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%
// 必要な処理を記述してください。
String btn = "";
btn = request.getParameter("btn");

	if(btn.equals("reset"))
	{
		session.invalidate();
	}
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Java応用_演習問題1(発展)</title>
<style>
body {
	border: solid 2px #000080;
	padding: 5px;
}

.box {
	margin: 5px;
}

.box label {
	display: inline-block;
	width: 90px;
	text-align: right;
}
</style>
</head>
<body>

	<h1>Java応用 - 演習問題1(発展)</h1>

	<h2>ユーザー登録</h2>

	<span>登録するユーザー(最大5件)の情報を入力してください</span>

	<form action="result.jsp" method="post">

		<div class="box">
			<label>ユーザID：</label> <input type="text" name="userId"> <br>
			<label>ユーザ名：</label> <input type="text" name="userName"> <br>
			<label>年齢：</label> <input type="number" min="0" max="120" name="age">
		</div>
		<button type="submit">登録</button>
	</form>

</body>
</html>