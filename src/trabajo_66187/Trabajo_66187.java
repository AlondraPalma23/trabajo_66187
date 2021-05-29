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
        videoComunicacion zoom = new videoComunicacion();
        
        zoom.setNombre("Lucia");
        zoom.setCantidadUsuarios(100);
        zoom.setTiempo(40);
        zoom.setNivel("libre");
        zoom.setEstrellas(5);
        
        System.out.println(zoom.toString());
        
        videoComunicacion meet = new videoComunicacion("Julio",50,2000,"libre",3);
        System.out.println(meet.toString());

        
        videoComunicacion ws = new videoComunicacion("Jorge",4,24000,"libre",1);
        System.out.println(ws.toString());
    }

    }
