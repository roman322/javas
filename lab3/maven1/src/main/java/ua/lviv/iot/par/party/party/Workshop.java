/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ua.lviv.iot.par.party.party;

/**
 *
 * @author rmoch
 */
public class Workshop extends Party{
     

	private int mastersNumber;


	public Workshop() {

	}

	
public Workshop(PartyType partyType, PartyLocation name, int price, String material, double hours, String manfucturer,
			int amount, double diametr) {

		super(partyType, name, price, material, hours, manfucturer, amount);

		this.mastersNumber = mastersNumber;

	}

    

	public double getmastersNumber() {
		return mastersNumber;
	}

	public void setDiametr(double diametr) {
		this.mastersNumber = mastersNumber;
	}
}


