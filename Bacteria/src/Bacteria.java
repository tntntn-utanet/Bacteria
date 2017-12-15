/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.util.Timer;
import java.util.TimerTask;

/**
 *
 * @author thomas
 */
public class Bacteria {

    private Timer t;
    private int Count = 1;
    private double Temperature = 20;
    private double ReferenceTemperature = 20;
    private double ReproductionRate = 1;

    public Bacteria() {
        t = new java.util.Timer();

    }

    public int getCount() {
        return Count;
    }

    private void stopReproduction() {
        t.cancel();
    }
    private int ReproductionInterval = 1;    // think 1 sec

    public void setTemperature(double Temperature) {
        this.Temperature = Temperature;
        react();
    }

    private void react() {
        if (Temperature < ReferenceTemperature) {
            ReproductionRate = 1;
        }
        if (Temperature == ReferenceTemperature) {
            ReproductionRate = 2;
        }
        if (Temperature > ReferenceTemperature) {
            ReproductionRate = 1;
        }
        if (ReproductionRate == 1) {
            stopReproduction();
        } else {
            Reproduce();
        }
    }

    private void Reproduce() {

        t.schedule(
                new java.util.TimerTask() {
            @Override
            public void run() {
                Count *= ReproductionRate;
            }
        }, ReproductionInterval, ReproductionInterval);

    }
}
