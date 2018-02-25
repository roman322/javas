/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package party;

/**
 *
 * @author rmoch
 */
public class Main {

	public static void main(String[] args) {

		HolidayEvent holidayevent = new HolidayEvent("Boston", 20);

		Party Workshop = new Workshop(PartyType.WORKSHOP, PartyLocation.INSIDE, 50, "Event", 2, "Stepana banderu", 40, 15);

		Party Animator = new Animator(PartyType.ANIMATOR, PartyLocation.INSIDE, 150, "Event", 2, "Geroiv UPA", 26, 25.5);

		Party SoapBubbles = new SoapBubble(PartyType.SOAPBUBBLE, PartyLocation.OUTSIDE, 70, "Event", 2.5, "Suxiv", 15,8.6);

		Party Batut = new Batut(PartyType.BATUT, PartyLocation.OUTSIDE, 90, "Event", 2, "prospect Shevchenka", 13, 12.5);

		holidayevent.addParty(Workshop);  
		holidayevent.addParty(Animator);
		holidayevent.addParty(SoapBubbles);
		holidayevent.addParty(Batut);

		holidayevent.sortPartyByPrice(holidayevent.getPartyList());

		for (Party party : holidayevent.getPartyList()) {  

			System.out.println(party.getorg_name() + " is cost  " + party.getPrice() + " dollars and duration is "  + party.getHours() + " hours " + party.getType() + " " + party.getaddress() + " " 
			
					
					+ " " + party.getAmount()) ;

		}

	}

}

