/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bacteria;

/**
 *
 * @author thomas
 */
public class BacteriaResponse {

    public int getBacteriaResponse() {
        Bacteria.setTemperature(22);
        return Bacteria.getCount();

    }
}
