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
    <title>Home</title>
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/home.css">
</head>
<body>
<div class="main-container">
    <div class="grid-container">
        <div class="grid-item header">
            <jsp:include page="header.jsp"/>
        </div>
        <div class="main-content">
            <div class="grid-item main">
                <div class="local">
                    <div class="local-title">
                        <h3>${home.name}</h3>
                    </div>
                    <div class="local-content">
                        ${home.description}
                    </div>
                    <div class="make-online-enquiry">
                        <a href="">Make an online enquiry</a>
                    </div>
                </div>
                <div class="content">
                    <c:forEach items="${service}" var="item">
                        <div class="item">
                            <div class="image">
                                <img src="${pageContext.request.contextPath}/${item.image}" alt="">
                            </div>
                            <div class="service-name">
                                <a href="">${item.name}</a>
                            </div>
                            <div class="service-description">
                                <p>${item.shortDetail}</p>
                            </div>
                        </div>
                    </c:forEach>
                    <nav aria-label="Navigation for countries">
                        <ul class="pagination">
                            <c:if test="${currentPage != 1}">
                                <li class="page-item"><a class="page-link"
                                                         href="ServiceController?recordsPerPage=${recordsPerPage}&currentPage=${currentPage-1}">Previous</a>
                                </li>
                            </c:if>

                            <c:forEach begin="1" end="${noOfPages}" var="i">
                                <c:choose>
                                    <c:when test="${currentPage eq i}">
                                        <li class="page-item active"><a class="page-link">
                                                ${i} <span class="sr-only">(current)</span></a>
                                        </li>
                                    </c:when>
                                    <c:otherwise>
                                        <li class="page-item"><a class="page-link"
                                                                 href="ServiceController?recordsPerPage=${recordsPerPage}&currentPage=${i}">${i}</a>
                                        </li>
                                    </c:otherwise>
                                </c:choose>
                            </c:forEach>

                            <c:if test="${currentPage lt noOfPages}">
                                <li class="page-item"><a class="page-link"
                                                         href="ServiceController?recordsPerPage=${recordsPerPage}&currentPage=${currentPage+1}">Next</a>
                                </li>
                            </c:if>
                        </ul>
                    </nav>
                </div>

                <div class="about">
                    <div class="about-title">
                        <h3>About Us</h3>
                    </div>
                    <div class="about-content">
                        ${home.about}
                    </div>
                </div>
                <div class="signature">
                    <p>Kind Regards</p>
                    <div class="signature-sign">
                        ${home.signature}
                    </div>
                </div>
            </div>
            <div class="grid-item sidebar">
                <jsp:include page="sidebar.jsp"/>
            </div>
        </div>
        <div class="grid-item footer">
            <jsp:include page="footer.jsp"/>
        </div>
    </div>
</div>
</body>
</html>
