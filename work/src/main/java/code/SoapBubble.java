/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package code;

/**
 *
 * @author rmoch
 */
public class SoapBubble extends Party {
    private double length;
    SoapBubble(final PartyType partyType,
			   final PartyLocation partyLocation,
			   final int price,
			final String material, final double hours,
				final String manfucturer, final int amount,final Integer id) {
		super(partyType, partyLocation, price,
				material, hours, manfucturer, amount,id);
		this.length = length;
	}

	@Override
	public String getHeaders() {
		return super.getHeaders()+"length";
	}

	@Override
	public String toCSV() {
		return super.toCSV()+length;
	}
}


