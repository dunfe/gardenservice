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
    <title>Gallery</title>
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/home.css">
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/gallery.css">

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
                    <li class="active"><a href="GalleryController?method=get">Gallery</a></li>
                    <li><a href="ContactController?method=get">Contact</a></li>
                </ul>
            </div>
        </div>
        <div class="grid-item main gallery-content">
            <button class="prev" onclick="plusSlides(-1)">Previous</button>
            <button class="next" onclick="plusSlides(1)">Next</button>
            <c:forEach items="${gallery}" var="item">
                <div class="mySlides">
                    <img src="${pageContext.request.contextPath}/${item.link}" alt="">
                </div>
            </c:forEach>
            <div class="row">
                <c:forEach items="${gallery}" var="item">
                    <div class="column">
                        <img class="demo cursor" src="${pageContext.request.contextPath}/${item.link}"
                             style="width: 100%" onclick="currentSlide(${item.id})" alt="">
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
<script>
    var slideIndex = 1;
    showSlides(slideIndex);

    function plusSlides(n) {
        showSlides(slideIndex += n);
    }

    function currentSlide(n) {
        showSlides(slideIndex = n);
    }

    function showSlides(n) {
        var i;
        var slides = document.getElementsByClassName("mySlides");
        var dots = document.getElementsByClassName("demo");
        if (n > slides.length) {
            slideIndex = 1
        }
        if (n < 1) {
            slideIndex = slides.length
        }
        for (i = 0; i < slides.length; i++) {
            slides[i].style.display = "none";
        }
        for (i = 0; i < dots.length; i++) {
            dots[i].className = dots[i].className.replace(" active", "");
        }
        slides[slideIndex - 1].style.display = "block";
        dots[slideIndex - 1].className += " active";
    }
</script>
</body>
</html>
