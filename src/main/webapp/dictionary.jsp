<%@ page language="java" contentType="text/html; charset=UTF-8"
  pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Java応用_演習問題5-2</title>
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

  <h1>Java応用 - 演習問題5-2</h1>

  <c:if test="${not empty result}">
    <div class="result">
      <h3>実行結果</h3>
      <p>${fn:escapeXml(result)}</p>
    </div>
  </c:if>

  <div>
    <h2>単語検索</h2>

    <form action="SearchServlet" method="get">
      <label>英語：</label>
      <input type="text" name="english">
      <button type="submit">検索</button>
    </form>
  </div>

</body>
</html>