/*C:\Users\rmoch\Documents\NetBeansProjects\party\src\party\HolidayEvent.java
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package party;

import java.util.*;

public class HolidayEvent {

    private String name = "no name";
    private int amountOfEvents;
    private List<Party> partyList = new LinkedList();
    List<Party> parameterPartyList = new LinkedList();

    public HolidayEvent(String name, int amounOfEvents) {
        this.name = name;
        this.partyList = new LinkedList<>();

    }

    public void addParty(Party addParty) {

        partyList.add(addParty);

    }

    //sort by price
    public List<Party> sortPartyByPrice(List<Party> list) {
        list.sort((Party o1, Party o2) -> o1.getPrice() - o2.getPrice());
        return list;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getamountOfEvents() {
        return amountOfEvents;
    }

    public void setamountOfEvents(int amountOfEvents) {
        this.amountOfEvents = amountOfEvents;
    }

    public List<Party> getPartyList() {
        return partyList;

    }

    public void setPartyList(List<Party> partyList) {
        this.partyList = partyList;
    }

    public List<Party> searchByPartyParameters(String param) {
        List<Party> finalList = new LinkedList<>();
        for (Party party : partyList) {
            if (party.getPartyParameter().equalsIgnoreCase(param)) {
                finalList.add(party);
            }
        }
        return finalList;

    }
}
