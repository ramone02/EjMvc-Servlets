<jsp:include page="/WEB-INF/shared/header.jsp"/>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<div class="titulo mt-5">
    <h2>Pagina de Error</h2>
</div>
<div class="col-md-12">
    <ul>
        <c:forEach items="${errores}" var="error">
            <li class="text-black">${error}</li>                        
        </c:forEach>
    </ul>
    <div> 
        
        <button class="btn btn-success"><a class="text-black"href="/ejemplomvc3/contacto">Volver</a></button>
    </div>
</div>

<jsp:include page="/WEB-INF/shared/footer.jsp"/>
