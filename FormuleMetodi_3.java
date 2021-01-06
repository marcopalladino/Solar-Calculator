package FormuleMetodi_3C;

/**
 * @author      Classe 3c       Mois Enrico, Maresca Riccardo 
 * @version     1.0                (current version number of program)
 * @since       1.0          (the version of the package this class was first added to)
 */
public class FormuleMetodi_3C {
   
 /**
 * Power P (kW) calculation from given parameters Voltage (V) and Current (A) 
 * 
 *
 * @param  dA Ampere.  
 * @param  dVolt Volt.  
 * @return dkW kilowatt.
 */
public double PowerkWCalculation(double dA,double dVolt)    
{ 
    double dkW=(dA*dVolt)/1000;
    return dkW;
}
   
 /**
 * Current I (A) calculation from given parameters Voltage (V) and Power (kW) 
 * 
 *
 * @param  dkW kilowatt.  
 * @param  dVolt Volt.  
 * @return dA Ampere.
 */
public double CurrentACalculation(double dkW,double dVolt)    
{ 
    double dA=(dkW*1000)/dVolt;
    return dA;
}
 
/**
 * Energy E (kWh) calculation from given parameters Power (kW) and Time (h) 
 * 
 *
 * @param  dkW kilowatt.  
 * @param  dh time.  
 * @return dE kWh.
 */
public double EnergykWhCalculation(double dkW,double dh)    
{ 
    double dE=dkW*dh;
    return dE;
}
/**
 * Energy E (J) calculation from given parameters Power (kW) and Time (h) 
 * 
 *
 * @param  dkW kilowatt.  
 * @param  dh time.  
 * @return dE J.
 */
public double EnergyJCalculation(double dkW,double dh)    
{ 
    double dE=(dkW*dh)*(3.6*106);
    return dE;
}
    
}
