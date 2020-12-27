
/**
 * @author      Classe 3c Alessio Grande Riccardo Capelli.....
 * @version     1.0                (current version number of program)
 * @since       1.0          (the version of the package this class was first added to)
 */
public class FormuleMetodi_3C {
   
 /**
 * Watt calculation from given parameters VOLT AMPERE nPanel                           (1)
 * <p>
 * Longer description. If there were any, it would be    (2)
 * here.
 * <p>
 * Cicci belli che siete avrete 2 metodi a testa da fare!
 *
 * @param  dA Ampere.  
 * @param  dVolt Panel Volt.  
 * @param  iPanel Panel's number used.  
 * @return Total Panel Watt with panel in serie.
 */
public double WattPanelCalculation(double dA,double dVolt, int iPanel)    
{ double dWatt=dA*dVolt*iPanel;
return dWatt;
}
}
