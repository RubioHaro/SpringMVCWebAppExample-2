
package Com.RubioHaroDigital.Modelos;

/**

***************************************************
    Created on : 23/05/2018, 05:27:43 PM
    Author     : Rodrigo R. Rubio Haro
***************************************************
**/
public class Persona {
    private int ID;
    private String Nombre;
    private String Correo;
    private int Pais;

    public Persona() {
    }

    public Persona(int ID, String Nombre, String Correo, int Pais) {
        this.ID = ID;
        this.Nombre = Nombre;
        this.Correo = Correo;
        this.Pais = Pais;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getCorreo() {
        return Correo;
    }

    public void setCorreo(String Correo) {
        this.Correo = Correo;
    }

    public int getPais() {
        return Pais;
    }

    public void setPais(int Pais) {
        this.Pais = Pais;
    }
    
    
}
