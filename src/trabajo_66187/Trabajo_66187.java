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
public class Trabajo_66187 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("----------------------TRABAJOTI--------------------");
        trabajoTI developper = new trabajoTI();

        developper.setNombre("Emiliano");
        developper.setDescripcion("Desarrollo de aplicaciones");
        developper.setHabilidades("base de datos");
        developper.setExperiencia(2);
        developper.setNivel("Jr");

        System.out.println(developper.toString());


        trabajoTI designer = new trabajoTI("Alejandro", "Desarrollo de aplicaciones", "configuración de servidores", 1, "Sr");
        System.out.println(designer.toString());

        trabajoTI telecom = new trabajoTI("Maria", "Desarrollo de aplicaciones", "programacion web", 3, "leader");
        System.out.println(telecom.toString());

        System.out.println("----------------------VIDEOCOMUNICACIÓN--------------------");
    }

    }
