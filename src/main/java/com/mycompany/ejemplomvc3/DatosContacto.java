package com.mycompany.ejemplomvc3;

import java.io.Serializable;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.regex.*;

public class DatosContacto implements Serializable {

    public DatosContacto() {
    }
    private String nombre;
    private Integer edad;
    private String email;
    private String[] motivos;
    private String comentarios;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String[] getMotivos() {
        return motivos;
    }

    public void setMotivos(String[] motivos) {
        this.motivos = motivos;
    }

    public String getComentarios() {
        return comentarios;
    }

    public void setComentarios(String comentarios) {
        this.comentarios = comentarios;
    }

    public String getNombreMotivos(Integer i) {
        String[] nombres = {"Consulta", "Reclamo", "Agradecimiento"};
        return nombres[i - 1];
    }

    public List<String> validar(Map<String, String[]> parametros) {

        List<String> errores = new LinkedList<>();
        String patternEmail = "^[a-zA-Z0-9.!#$%&’+/=?^_`{|}~-]+@[a-zA-Z0-9-]+(?:\\.[a-zA-Z0-9-]+)$";
        String patternNum = "[\\d]+";

        if (parametros.get("nombre")[0].isEmpty()) {
            errores.add("El campo nombre esta vacio");
        } else if (parametros.get("nombre")[0].length() > 15) {
            errores.add("El campo nombre excede los 15 caracteres");
        }

        if (parametros.get("email")[0].isEmpty()) {
            errores.add("El campo Email esta vacio");
        } else if (!Pattern.matches(patternEmail, parametros.get("email")[0])) {
            errores.add("El campo Email no es valido");
        }

        if (parametros.get("edad")[0].isEmpty()) {
            errores.add("El campo edad esta vacio");
        } else if (!Pattern.matches(patternNum, parametros.get("edad")[0])) {
            errores.add("El campo edad no es numero");
        } else if (Integer.parseInt(parametros.get("edad")[0]) > 100) {
            errores.add("Ingrese una edad menor que 100");
        }

        if (parametros.get("motivos")[0].isEmpty()) {
            errores.add("Ingrese motivos validos");
        }

        if (parametros.get("comentario")[0].isEmpty()) {
            errores.add("Ingrese comentarios validos");
        } else if (parametros.get("comentario")[0].length() > 250) {
            errores.add("Ingrese comentarios menos que 250 caracteres");
        }
        return errores;
    }

    public DatosContacto rellenar(Map<String, String[]> parametros) {
        setNombre(parametros.get("nombre")[0]);
        setEmail(parametros.get("email")[0]);
        setEdad(Integer.parseInt(parametros.get("edad")[0]));
        setMotivos(parametros.get("motivos"));
        setComentarios(parametros.get("comentario")[0]);
        return this;
    }
}
