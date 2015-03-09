
/**
 * Write a description of class NameGenerator here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class NameGenerator
{
    private final int LETRAS_NOMBRE = 2;
    private final int LETRAS_APELLIDO = 2;
    private final int LETRAS_AP_MADRE = 1;
    private final int CIUDAD_NAC = 2;
    private final int CONSTANTE_CERO = 0;
    private String nom;
    private String apell;
    
    public NameGenerator()
    {
        nom = null;
        apell = null; 
    }
    
    public void generateStarWarsName(String nombre, String apellido, String apellidoMadre, String ciudadNacimiento)
    {
        System.out.println("tu nombre es: " + apellido.substring(CONSTANTE_CERO, LETRAS_APELLIDO) + nombre.substring(CONSTANTE_CERO, LETRAS_APELLIDO));
        System.out.println("tu apellido es: " + apellidoMadre.substring(CONSTANTE_CERO, LETRAS_AP_MADRE) + ciudadNacimiento.substring(CONSTANTE_CERO, CIUDAD_NAC));
    }
}
