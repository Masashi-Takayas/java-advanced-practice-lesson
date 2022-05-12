<%@ page language="java" contentType="text/html; charset=UTF-8"
  pageEncoding="UTF-8"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>

<!DOCTYPE html>
<html><head>
<meta charset="UTF-8">
<title>Java応用_演習問題1</title>
<style>
body {
  border: solid 2px #000080;
  padding: 5px;
}

.result {
  background: #fffacd;
  display: inline-block;
  margin: 5px;
  padding: 10px;
}
</style>
</head>
<body>

  <h1>Java応用 - 演習問題1</h1>

  <h2>ゲームアプリ実行ページ</h2>

  <div class="result">
    <h3>アプリの実行結果</h3>
 <c:if test="${not empty result}">
    <p>${requestScope.result}</p>
</c:if>
</div>

  <form action="StartAppServlet" method="post">
    <label>名前：</label>
    <input type="text" name="name">
    <br>
    <label>アプリ名：</label>
    <input type="radio" name="radiobutton"value="トランプ" checked>トランプ
    <input type="radio" name="radiobutton"value="ダーツ">ダーツ
    <input type="radio" name="radiobutton"value="時計">時計
    <input type="radio" name="radiobutton"value="その他">その他
    <br>
    <button type="submit">実行</button>
  </form>
</body>
</html>