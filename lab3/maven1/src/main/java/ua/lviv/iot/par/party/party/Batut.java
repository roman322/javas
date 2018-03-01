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
public class Batut extends Party{
    


	private double diametr ;
	
public Batut () {
		
	}
	
	public Batut(PartyType partyLocation, PartyLocation name, int price , String material, double hours, String manfucturer, int amount,double diametr) {
		
		super(partyLocation, name, price, material, hours, manfucturer,  amount);
		
		this.diametr = diametr;
	 }

   

	public double getdiametr() {
		return diametr;
	}

	public void setdiametr(double diametr) {
		this.diametr = diametr;
	}

}


