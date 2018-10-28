
package proyectoprogra3.util;

import java.io.IOException;
import java.util.Properties;

public class Idioma extends Properties{
    
    private static final long serialVersionUID = 1L;
	        
    public Idioma(String idioma){
    	
        //Modificar si quieres añadir mas idiomas
        //Cambia el nombre de los ficheros o añade los necesarios
    	switch(idioma){
	    	case "Español":
                    getProperties("Español.properties");
                    break;
	    	case "Ingles":
                    getProperties("Ingles.properties");
                    break;
                case "Frances":
                    getProperties("Frances.properties");
                    break;
	    	default:
                    getProperties("Español.properties");
	   	}

    }

    private void getProperties(String idioma) {
        try {
            this.load( getClass().getResourceAsStream(idioma) );
        } catch (IOException ex) {
        
        }
   }
}
