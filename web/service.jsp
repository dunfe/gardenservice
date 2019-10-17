<%--
  Created by IntelliJ IDEA.
  User: noface
  Date: 9/13/19
  Time: 8:28 SA
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>


<html>
<head>
    <title>Service</title>
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/home.css">
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/service.css">

</head>
<body>
<div class="main-container">
    <div class="grid-container">
        <div class="grid-item header">
		<jsp:include page="header.jsp"/>
        </div>
        <div class="grid-item main">
            <div class="full-content">
                <c:forEach items="${service}" var="item">
                    <div class="full-item">
                        <div class="full-service-name">
                            <a href="">${item.name}</a>
                        </div>
                        <div class="service-content">
                            <div class="full-image">
                                <img src="${pageContext.request.contextPath}/${item.image}" alt="">
                            </div>
                            <div class="full-service-description">
                                <p>${item.fullDetail}</p>
                            </div>
                        </div>

                    </div>
                </c:forEach>
            </div>
        </div>
        <div class="grid-item sidebar">
            <div class="share">
                <div class="share-title">
                    Share this page
                </div>
                <div class="share-item">
                    <ul class="share-ul">
                        <li><a href="">Share on Facebook</a></li>
                        <li><a href="">Share on Twitter</a></li>
                        <li><a href="">Share on Google+</a></li>
                    </ul>
                </div>
            </div>
            <div class="viral">
                <div class="share-title">
                    Create a website
                </div>
                <div class="viral-item">
                    <div class="text">
                        Everybody can create a website, it's easy.
                    </div>
                    <div class="button-try">
                        <a href="">Try it for Free now</a>
                    </div>
                </div>
            </div>
        </div>
        <div class="grid-item footer">
            <div class="info">
                <div class="text">This website was created with SimpleSite</div>
                <div><a href="">Get Your own FREE website. Click here!</a></div>
            </div>
        </div>
    </div>
</div>
</body>
</html>
