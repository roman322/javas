/*C:\Users\rmoch\Documents\NetBeansProjects\party\src\party\HolidayEvent.java
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package code;

import code.persistence.dao.PartyDao;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

/**
 *
 */
public class HolidayEvent implements Serializable {

    private static final long serialVersionUID = 1L;
    private PartyDao partyDao;
    private String name = "no name";
    private int amountOfEvents;
    private static Map<Integer, Party> partyMap = new HashMap<>();

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public PartyDao getPartyDao() {
        return partyDao;
    }

    public void setPartyDao(PartyDao partyDao) {
        this.partyDao = partyDao;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAmountOfEvents() {
        return amountOfEvents;
    }

    public void setAmountOfEvents(int amountOfEvents) {
        this.amountOfEvents = amountOfEvents;
    }

    public static Map<Integer, Party> getPartyMap() {
        return partyMap;
    }

    public static void setPartyMap(Map<Integer, Party> partyMap) {
        HolidayEvent.partyMap = partyMap;
    }

    public HolidayEvent(final String name, final int amounOfEvents) {
        this.name = name;
        this.partyMap = new HashMap<>();

    }

    public HolidayEvent() {
    }

    public final void addParty(final Party addParty) {

        partyDao.persist(addParty);

    }

    /*//sort by price
    public final void sortPartyByPrice(final Party newParty) {
        partyDao.persist(newParty);
    }*/

    public final Map<Integer, Party> searchByPartyLocation(final PartyLocation partyLocation) {
        Map<Integer, Party> finalList = new HashMap<>();
        for (Map.Entry<Integer, Party> party : partyMap.entrySet()) {
            if (party.getValue().getPartyParameter().equals(partyLocation)) {
                finalList.put(party.getValue().getId(), party.getValue());
            }
        }
        return finalList;
    }
}
