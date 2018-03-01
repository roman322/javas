/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ua.lviv.iot.par.party.party;

import java.util.List;

/**
 *
 * @author rmoch
 */
public class Main {

    public static void main(String[] args) {

        HolidayEvent holidayEvent = new HolidayEvent("Boston", 20);

        Party Workshop = new Workshop(PartyType.WORKSHOP, PartyLocation.INSIDE, 50, "Event", 2, "Stepana banderu", 40, 15);

        Party Animator = new Animator(PartyType.ANIMATOR, PartyLocation.INSIDE, 150, "Event", 2, "Geroiv UPA", 26, 25.5);

        Party SoapBubbles = new SoapBubble(PartyType.SOAPBUBBLE, PartyLocation.OUTSIDE, 70, "Event", 2.5, "Suxiv", 15, 8.6);

        Party Batut = new Batut(PartyType.BATUT, PartyLocation.OUTSIDE, 90, "Event", 2, "prospect Shevchenka", 13, 12.5);

        holidayEvent.addParty(Workshop);
        holidayEvent.addParty(Animator);
        holidayEvent.addParty(SoapBubbles);
        holidayEvent.addParty(Batut);

        holidayEvent.sortPartyByPrice(holidayEvent.getPartyList());

        for (Party party : holidayEvent.getPartyList()) {

            System.out.println(party.getorg_name() + " is cost  " + party.getPrice() + " dollars and duration is " 
                    + party.getHours() + " hours " + party.getType() + " " + party.getaddress() + " "
                    + " " + party.getAmount());
        }
        List<Party> resultList = holidayEvent.searchByPartyParameters("OUTSIDE");
        System.out.println("Find by Location");
        System.out.println(resultList);
    }

  

}
