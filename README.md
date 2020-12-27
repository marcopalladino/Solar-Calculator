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
CARICA DI UNA BATTERIA
INPUT 
TCarica=(Co*Eff./I_Input-I_Consumo)
TCarica= Tempo di carica

Co= Capacità prelevata dalla batteria

Eff.= Efficienza: 1,1 per batterie al LITIO per batterie al Gel; 1,15 per AGM; 1,2 per batterie al liquido.

I_Input= Corrente del caricabatterie

I_Consumo= Consumo degli apparati durante la carica

Un calcolo approssimativo ed empirico potrebbe essere a esempio: se dobbiamo caricare una batteria da 800 Ah dovremmo fornire 800 A per un’ora, 400 per due ore e via di seguito, e alla fine il prodotto della corrente (A) per il tempo deve essere 800. Ma per non danneggiarla, la corrente deve essere, come visto in precedenza, circa il 25% della capacità: per cui 200 A, e il tempo di carica sarà: 800/200=4 ore

# Method 6
TEMPO DI SCARICA DI UNA BATTERIA

In quanto tempo si scarica la batteria quando i pannelli solari non forniscono energia ? Tenendo conto che si deve scaricare solo del 50% o 80%, si può ipotizzare che avendo a disposizione 800 Ah e se questi li dividiamo per la corrente assorbita dagli apparati, che è stimata in 65 Ampere, si avrà che: t= Ah/I= 800 Ah/65A= 12,30 

Il numero decimale 30 non sono minuti ma centesimi di ora, per cui dovremo dividere 60/100 e moltiplicarlo per 30.

Minuti= (60/100) x 30= 18

Perciò il tempo di scarica sarà di 12 ore e 18 minuti. 

La tensione finale di scarica, viene stabilita ad un valore inferiore di circa 0,2 – 0,3 Volt rispetto al valore di tensione nominale, il valore consigliato è: 11,8 per la batteria a 12 Volt, e 23,6 per la batteria a 24 Volt.

Modellare gli input necessari per modellare il problema che trovare il tempo di carica o scarica di una batteria
