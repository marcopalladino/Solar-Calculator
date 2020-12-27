# Solar-Calculator
Eletric conversion an Tools to dimension Solar Panel System for your purpose.

# Esempio di metodo realizzato
'
/** Watt calculation from given parameters VOLT AMPERE nPanel                           (1)
 * <p>
 * Longer description. If there were any, it would be    (2)
 * here.
 * <p>
 *
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
'

# Method  1
The power P in kilowatts (kW) is equal to the current I in amps (A), times the voltage V in volts (V) divided by 1000:
P(kW) = I(A) × V(V) / 1000
# Method 2
DC kilowatts to amps calculation
The current I in amps (A) is equal to 1000 times the power P in kilowatts (kW), divided by the voltage V in volts (V):
I(A) = 1000 × P(kW) / V(V)
# Method 3
Kilowatt-hour definition
Kilowatt-hour is an energy unit (symbol kWh or kW⋅h).
One kilowatt-hour is defined as the energy consumed by power consumption of 1kW during 1 hour:
1 kWh = 1kW ⋅ 1h
One kilowatt-hour is equal to 3.6⋅106 joules:
1 kWh = 3.6⋅106 J
The energy E in kilowatt-hour (kWh) is equal to the power P in kilowatts (kW), times the time t in hours (h).
E(kWh) = P(kW) ⋅ t(h)
# Method 4
How to convert horsepower to kilowatts
Mechanic / Hydraulic horsepower to kilowatts
One mechanic or hydraulic horsepower is equal to 0.745699872 kilowatts:
1 hp(I) = 745.699872 W = 0.745699872 kW
So the power conversion of horsepower to kilowatts is given by:
P(kW) = 0.745699872 ⋅ P(hp)
Example
Convert 10 hp to kW:
P(kW) = 0.745699872 ⋅ 10hp = 7.45699872 kW
# Method 5
