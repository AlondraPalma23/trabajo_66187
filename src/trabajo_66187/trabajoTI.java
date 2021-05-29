/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package trabajo_66187;

/**
 * 
 * @author Alondra Palma
 */
public class trabajoTI {
    private String Nombre;
    private String descripcion;
    private String habilidades;
    private int experiencia;
    private String nivel;

    public trabajoTI() {
    }

    public trabajoTI(String Nombre, String descripcion, String habilidades, int experiencia, String nivel) {
        this.Nombre = Nombre;
        this.descripcion = descripcion;
        this.habilidades = habilidades;
        this.experiencia = experiencia;
        this.nivel = nivel;
    }

    public String getNombre() {
        return Nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public String getHabilidades() {
        return habilidades;
    }

    public int getExperiencia() {
        return experiencia;
    }

    public String getNivel() {
        return nivel;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void setHabilidades(String habilidades) {
        this.habilidades = habilidades;
    }

    public void setExperiencia(int experiencia) {
        this.experiencia = experiencia;
    }

    public void setNivel(String nivel) {
        this.nivel = nivel;
    }
    
     public void sueldo (){
         int salario = 1000 * (1+(experiencia/10));
        System.out.println(salario);
    }
    
    public void Sueldo (){
        int salario = 1000 * (1 + (experiencia/10));
        int salario2 = 1500 * (1 + (experiencia/10));
        int salario3 = 2000 * (1 + (experiencia/10));
    }

   @Override
    public String toString() {
        return "trabajosTI{" + "Nombre=" + Nombre + ", Descripcion=" + descripcion + ", Habilidades=" + habilidades + ", Experiencia=" + experiencia + ", Nivel=" + nivel + '}';
    }
    
}
