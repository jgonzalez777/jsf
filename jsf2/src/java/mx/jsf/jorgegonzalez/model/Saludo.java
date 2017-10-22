package mx.jsf.jorgegonzalez.model;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

/**
 *
 * @author jgonzalez
 */
@ManagedBean
@RequestScoped
public class Saludo {

    private String texto = "Este es el valor de retorno de JSF";
    
    public Saludo() {
    }

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }   
}
