package solar.calculator_v1;

import javax.swing.*;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 * This class provides some method for electrical conversions and calculations.
 *
 * @author MarcoMorrone, BeatriceScala, MarikaMacagno
 * @version 1.0
 * @since 1.0
 */
public class FormuleMetodi {

    /**
     * This method allows the user to calculate the power with given parameters
     * Ampere and Volt.
     *
     * @param dAmpere Ampere given by user.
     * @param dVolt Volt given by user.
     * @return The power expressed in kW. Conversion formula: P(kW) = I(A)*
     * V(V)/1000.
     */
    public static double PowerCalculation(double dAmpere, double dVolt) {
        double dPower = dAmpere * dVolt / 1000;
        return dPower;
    }

    /**
     * This method allows the user to convert power, expressed in kilowatts, to
     * Ampere, with the given parameters Power and Volt.
     *
     * @param dPower Power in kW given by user.
     * @param dVolt Volt given by user.
     * @return Number of amps from DC Kilowatts. Conversion formula:
     * I(A)=1000*P(kW)/V(V)
     */
    public static double KilowattsToAmpsCalculation(double dPower, double dVolt) {
        double dAmpere = 1000 * dPower / dVolt;
        return dAmpere;
    }

    /**
     * This method allows the user to calculate the amount of KilowattsHour with
     * given parameters power and time.
     *
     * @param dPower Power in kW given by user.
     * @param dTime Time expressed in hours given by user.
     * @return The total energy, expressed in kWh. Conversion formula: E
     * (kWh)=P(kW)*t(h).
     */
    public static double KilowattsHourCalculation(double dPower, double dTime) {
        double dKilowattsHours = dPower * dTime;
        return dKilowattsHours;

    }

    /**
     * This method allows the user to calculate the amount of KilowattsHour with
     * given parameters power and time.
     *
     * @param dPower Power in W given by user.
     * @param dTime Time expressed in hours given by user.
     * @return The total energy, expressed in Wh. Conversion formula:
     * E(Wh)=P(W)*t(h).
     */
    public static double WattsHourCalculation(double dPower, double dTime) {
        double dWattsHours = dPower * dTime;
        return dWattsHours;

    }

    /**
     * This method allows the user to convert the power expressed in Mechanic or
     * Hydraulic Horsepower to power expressed in Kilowatts.
     *
     * @param dHorsepower Horsepower (Mechanic / Hydraulic) given by user.
     * @return The Power expressed in Kilowatts (kW). The method use this
     * conversion rate: 1 hp(I) = 745.699872 W = 0.745699872 kW
     */
    public static double HorsepowerToKiloWattCalculation(double dHorsepower) {
        final double ConversionRate = 0.745699872;
        double dKilowatts = dHorsepower * ConversionRate;

        return dKilowatts;
    }

    /**
     * This method allows the user to calculate the Charging Time of a Battery
     * (Litihum: Gel, AGM or Liquid) with given parameters Battery Capacity,
     * Battery Efficiency, Charger Power and Consumption
     *
     * @param dCapacity Battery Capacity in Ah given by user.
     * @param Efficiency Battery Efficiency given by user from selected types.
     * @param dCharger Charger Power given by user.
     * @param dConsumption Equipment Consumption given by the user.
     * @return The total charging time calculation, based on the capacity,
     * efficiency, Charger power and Equipment consumption. Conversion Formula:
     * TCarica=(Co*Eff./I_Input-I_Consumo)
     */
    public static double ChargingTimeCalculation(double dCapacity, double Efficiency, double dCharger, double dConsumption) {
        double dChargingTime = ((dCapacity * Efficiency) / (dCharger - dConsumption));
        return dChargingTime;
    }

    /**
     * This method helps the software creator to convert a time expressed in
     * decimal system to the sessagimal system.
     *
     * @param dTime the Time given by a user.
     * @return The number of minutes associated to a decimal number. Conversion
     * Formula: (6/10)*(decimal part of time expressed in decimal system)
     */
    public static int MinuteConverter(double dTime) {
        dTime = Math.floor(dTime * 100) / 100;
        double fractional_part = (dTime % 1) * 100;
        int dMinutes = (int) (0.6 * fractional_part);
        return dMinutes;
    }

    /**
     * This method allows the user to calculate the uncharging time of a battery
     * with given parameters Batteyr Capacity and Equipment consumption.
     *
     * @param dCapacity The Battery Capacity given by user.
     * @param dConsumption The Equipment consumption given by user.
     * @return The time that the battery need to fully uncharge expressed in
     * hours and minutes. Also return the optimal uncharging time to not ruin
     * the battery with JOptionPane message.
     */
    public static double UnChargingTimeCalculation(double dCapacity, double dConsumption) {
        double dUnChargingTime = dCapacity / dConsumption;
        return dUnChargingTime;
    }

    /**
     * This method allow the user to create a new window of the software, with
     * the same function.
     */
    public static void NewWindow() {
        JFrame frame2 = new solar.calculator_v1.MainForm();
        frame2.setVisible(true);
    }

    /**
     * This method allow the user to close the software from a menu item or
     * using the shortcut Alt+F4
     *
     * @param Frame the main JFrame given by the software creator, in main Form
     * class.
     */
    public static void DisposeJFrame(JFrame Frame) {
        Frame.dispose();
    }

    /**
     * This method allow the user to view an help page from a menu item or using
     * the shortcut Ctrl+H.
     *
     * @param HelpDialog A dialog window given by the software creator in main
     * Form class.
     */
    public static void HelpDialogPage(JDialog HelpDialog) {
        HelpDialog.setVisible(true);

    }

}
