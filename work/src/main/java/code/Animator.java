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
public class Animator  extends Party {
    private double length;
     public Animator(final PartyType partyType,
					final PartyLocation partyLocation,
					final int price,
					final String material,
					final double hours,
					final String manfucturer,
					final int amount) {
		super(partyType, partyLocation, price,
				material, hours, manfucturer, amount);
		this.length = length;
	}
	public final double getLength() {
		return length;
	}
	public final void setLength(final double length) {
		this.length = length;
	}
}


