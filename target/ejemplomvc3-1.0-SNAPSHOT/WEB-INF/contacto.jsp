
<jsp:include page="/WEB-INF/shared/header.jsp"/>
<!-- Titulo -->
<div class="titulo mt-5">
    <h2>Formulario de Contacto</h2>
</div>
<div class="mt-5 bg-success p-2 text-dark bg-opacity-10">
    <div class="row">
        <div class="col-md-8 ml-5">
            <div class="card-body">
                <form action="contacto" method="POST">
                    <div class="form-floating mb-3">
                        <input type="text" class="form-control" id="floatingInput"
                               placeholder="Tu Nombre" name="nombre"required>
                        <label for="floatingInput">Nombre</label>
                    </div>
                    <div class="form-floating mb-3">
                        <input type="number" name="edad" min="0"  class="form-control" id="floatingInput"
                               placeholder="28 - 29 - 40" required>
                        <label for="floatingInput">Edad</label>
                    </div>
                    <div class="form-floating mb-3">
                        <input type="email" class="form-control" id="floatingInput"
                               placeholder="name@example.com" name="email" required>
                        <label for="floatingInput">E-mail</label>
                    </div>
                    <div class="form-floating mb-3" >                                    
                        <select class="form-select" name="motivos" multiple aria-label="multiple select example" >
                            <option value="1">consulta</option>
                            <option value="2">reclamo</option>
                            <option value="3">agradecimiento</option>
                        </select>
                    </div>
                    <div class="form-floating mb-3">
                        <textarea class="form-control" placeholder="Leave a comment here" id="floatingTextarea2"
                                  style="height: 100px" name="comentario" required></textarea>
                        <label for="floatingTextarea2">Comentario</label>
                    </div>
                    <button type="submit" class="btn btn-dark">Enviar contacto</button>
                </form>
            </div>
        </div>
        <div class="col">
            <img src="https://thumbs.dreamstime.com/z/coding-icon-creative-element-design-programmer-icons-collection-pixel-perfect-web-apps-software-print-usage-149551335.jpg" class="img-fluid rounded-start" alt="logo">
        </div>
    </div>
</div>
<jsp:include page="/WEB-INF/shared/footer.jsp"/>
