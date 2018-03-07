/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package code;

/**
 * @author rmoch
 */
public class Batut extends Party {
    private double diametr;

    public Batut(final PartyType partyLocation,
                 final PartyLocation name, final int price,
                 final String material, final double hours,
                 final String manfucturer, final int amount) {
        super(partyLocation, name, price, material,
                hours, manfucturer, amount);
        this.diametr = diametr;
    }

    public final double getdiametr() {
        return diametr;
    }

    public final void setdiametr(final double diametr) {
        this.diametr = diametr;
    }

}


