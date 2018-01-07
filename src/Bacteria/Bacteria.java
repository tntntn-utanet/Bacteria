package Bacteria;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 
 */
/**
 *
 * @author thomas
 */
public class Bacteria {

    private static int Count = 1;
    public static double Temperature = 20;
    private static double ReferenceTemperature = 20;
    private static double ReproductionRate = 2;

    public Bacteria() {

    }

    public static int getCount() {
        return Count;
    }

    private static int ReproductionInterval = 1;    // 

    public static void setTemperature(double Temperature1) {
        Temperature = Temperature1;
        react();
    }

    private static void react() {
        if (Temperature < ReferenceTemperature) {
            ReproductionRate = 1;
        }
        if (Temperature == ReferenceTemperature) {
            ReproductionRate = 2;
        }
        if (Temperature > ReferenceTemperature) {
            ReproductionRate = 3;
        }

        Reproduce();

    }

    private static void Reproduce() {

        Count *= ReproductionRate;

    }
}
