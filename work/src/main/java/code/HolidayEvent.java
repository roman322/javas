/*C:\Users\rmoch\Documents\NetBeansProjects\party\src\party\HolidayEvent.java
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package code;

import java.util.LinkedList;
import java.util.List;

/**
 *
 */
public class HolidayEvent {

    private String name = "no name";
    private int amountOfEvents;
    private List<Party> partyList = new LinkedList();
    public HolidayEvent(final String name, final int amounOfEvents) {
        this.name = name;
        this.partyList = new LinkedList<>();

    }

    public HolidayEvent() {
    }

    public final void addParty(final Party addParty) {

        partyList.add(addParty);

    }

    //sort by price
    public final List<Party> sortPartyByPrice(final List<Party> list) {
        list.sort((Party o1, Party o2) -> o1.getPrice() - o2.getPrice());
        return list;

    }
    public final List<Party> getPartyList() {
        return partyList;

    }
   public final List<Party> searchByPartyParameters(final String param) {
        List<Party> finalList = new LinkedList<>();
        for (Party party : partyList) {
            if (party.getPartyParameter().equalsIgnoreCase(param)) {
                finalList.add(party);
            }
        }
        return finalList;

    }
}
