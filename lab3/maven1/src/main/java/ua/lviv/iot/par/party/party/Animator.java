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
public class Animator  extends Party{
    
	private double length;	
	
public Animator () {
		
	}

	
	public Animator(PartyType partyType, PartyLocation partyLocation, int price , String material, double hours, String manfucturer , int amount , double length) {
	 
		super(partyType, partyLocation, price, material, hours, manfucturer, amount);
		this.length = length;
	}

    

	public double getLength() {
		return length;
	}

	public void setLength(double length) {
		this.length = length;
	}

}


