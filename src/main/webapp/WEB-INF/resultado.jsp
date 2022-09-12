
<jsp:include page="/WEB-INF/shared/header.jsp"/>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!-- Titulo -->
<h1 class="text-center">Resultado</h1>
<div class="col-md-12 mt-5">
    <c:if test="${contacto.getEdad() >= 18}">
        <table class="table table-dark table-striped border-radius">
            <thead>
                <tr>
                    <th scope="col">Nombre</th>
                    <th scope="col">Edad</th>
                    <th scope="col">E-Mail</th>
                    <th scope="col">Motivos</th>
                    <th scope="col">Comentario</th>
                </tr>
            </thead>
            <tbody id="tablaCarrito">
                <tr>
                    <td>${contacto.getNombre()}</td>
                    <td>${contacto.getEdad()}</td>
                    <td>${contacto.getEmail()}</td>
                    <td>
            <c:forEach items="${contacto.getMotivos()}" var="item">
                ${contacto.getNombreMotivos(item)}                                   
            </c:forEach>
            </td>                            
            <td>${contacto.getComentarios()}</td>
            </tr>
            </tbody>
        </table>                               
    </c:if>
    <c:if test="${contacto.getEdad() < 18}">
        <div class="col-md-12 d-flex ">
            <button class="btn btn-danger disable"><h2 class="bold">Consulta solo para Mayores de Edad</h2></button>
        </div>                                    
    </c:if>
    <div>
        <button class="btn btn-success"><a class="text-black"href="/ejemplomvc3/contacto">Volver</a></button>
    </div>                    
</div> 
<jsp:include page="/WEB-INF/shared/footer.jsp"/>