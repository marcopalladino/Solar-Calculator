/*
 * Lavoro del gruppo Mhackeroni
 * MAroni Calvi, Scotto, Pettigiani
 * III M
 */
package vorii;
import java.util.Scanner;
/**
 *
 * @author pietro 
 */
  
public class Batterie {
    public void Metodo1(double I,double V){
    double P=0;
    /**
     * I=Ampere
     * V=Volt
     * P=Kilowatt
     */
    P=(I*V)/1000;
    
    System.out.println("ecco qua "+P);
    }
    public void metodo3(){
        double kW,h,J,kWh;
        int n;
        Scanner in = new Scanner(System.in);
       System.out.println("Sua altezza vuole calcora i kW-ora partendo dai Joule, o Watt?");
       System.out.println("Per usare i Joule digiti 1, per usare invece i Watt e le ore digiti 2");
       n=in.nextInt();
       if(n==1){
           System.out.println("la prego di inseriro i Joule, messere");
           J=in.nextDouble();
           kWh=J*3.6;
           System.out.println("Eccole i kWh, appena sfornati "+kWh);
       }
       else{
           if(n==2){
             System.out.println("Inserica i kW, o mi mozzeranno la testa");
             kW=in.nextDouble();
             System.out.println("Ora vada avanti, con le ore");
             h=in.nextDouble();
             kWh=kW*h;
             System.out.println("Per fortuna è stato così generoso, ora sono salvo. Ecco tenga i kWh, il suo premio per aver completato la quest "+kWh);
           } 
           else{
               System.out.println("Ma dobbiamo facciamo scherziamo? Ho detto di digitare o uno o due. Per punizione sarà ucciso nel sonno da Cthulu");
           }
       }
}
    
    public void metodo4(double Hp){
     /**
     * Questo metodo ti trasforma i cavalli in Kilowatt
     *
     *
     */
        double E, N=0.745699872;
        E=Hp*N;
        System.out.println("I Kw ottenuti sono ordunque "+E);
  }
     public double metodo_5(double eff, int Co, int I_input, int I_consumo){
        double Tcarica;
        //controllo del rapporto capacità/Ah
        if (Co/I_input<=4){
            //formula tempo di carica
        Tcarica=(Co*eff/I_input-I_consumo);
        System.out.print(" la batteria si caricherà in "+Tcarica);
        System.out.println(" ore");
        }
        else{
            System.out.println(" Stai friggendo la batteria. Ben fatto! ");
            return 0;
        }
         return Tcarica;
         }
    public void metodo6(int Ah, int A){
        // buona la pasta
        /**
        *Questo metodo ti calcora i tempi di scarica di una batteria
        *
        */
      int Tot, var;
      var=Ah/4;
      if(A>var){
          System.out.println("Acci acci, vuoi firggerla la batteria. invece che caricarla");
      }
      else{
          Tot=Ah/A;
          System.out.println("Il tempo nel quale essere improduttivi nell'attesa che si carichino le batterie Ã¨ pari a "+Tot);
      }
  } 
    public void metodo7(int W, int h){
        /**
         * Questo metodo di restituisce i watt-ora, inserendo i watt e le ore
         */
        int Wh;
        Wh=W*h;
        System.out.println("Pijiete sto Wh: "+Wh);
    }
    
}
