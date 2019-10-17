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
    <title>Contact</title>
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/home.css">
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/contact.css">

</head>
<body>
<div class="main-container">
    <div class="grid-container">
        <div class="grid-item header">
            <div class="title">
                <div class="name">
                    Gardening Service
                </div>
                <div class="subtitle">
                    Welcome to our services
                </div>
            </div>
            <div class="navigation">
                <ul class="nav">
                    <li><a href="HomeController?method=get">Home</a></li>
                    <li><a href="ServiceController?method=get">Services</a></li>
                    <li><a href="GalleryController?method=get">Gallery</a></li>
                    <li class="active"><a href="ContactController?method=get">Contact</a></li>
                </ul>
            </div>
        </div>
        <div class="grid-item main">
            <div class="contact">
                <h3>Contact</h3>
                <h4>Gardering Service</h4>
                <p>Address: <c:out value="${contact.address}"></c:out></p>
                <p>City: <c:out value="${contact.city}"></c:out></p>
                <p>Country: <c:out value="${contact.country}"></c:out></p>
                <p>Tel: <c:out value="${contact.phone}"></c:out></p>
                <p>Email: <c:out value="${contact.email}"></c:out></p>
            </div>
            <div class="contact-message">
                <p>Write your message here. Fill out the form:</p>
                <form action="ContactController" method="post">
                    <div class="infomation">
                        <input type="text" name="name" placeholder="Write your name here">
                        <input type="text" name="email" placeholder="Write your email here">
                    </div>
                    <div class="message-content">
                        <textarea name="message" id="" cols="30" rows="10" placeholder="Write your message here"></textarea>
                    </div>
                    <button class="send-button" type="submit">Send</button>
                </form>

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
