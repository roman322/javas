/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package code;

/**
 * @author rmoch
 */
public class Workshop extends Party {
    private int mastersNumber;

    public Workshop(final PartyType partyType,
                    final PartyLocation name, final int price,
                    final String material, final double hours,
                    final String manfucturer,
                    final int amount,final Integer id) {
        super(partyType, name, price,
                material, hours, manfucturer, amount,id);

        this.mastersNumber = mastersNumber;
    }

    @Override
    public String getHeaders() {
        return super.getHeaders() + ","+"mastersNumber";
    }

    @Override
    public String toCSV() {
        return super.toCSV() + mastersNumber;
    }
}


