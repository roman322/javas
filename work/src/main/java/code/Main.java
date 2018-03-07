
package code;
import java.util.List;

/**
 *
 * @author rmoch
 */
public class Main {


    public static void main(final String[] args) {

        HolidayEvent holidayEvent = new HolidayEvent("Boston", 4);

        Party workshop = new Workshop(PartyType.WORKSHOP, PartyLocation.INSIDE,
                50, "Event", 2, "Stepana banderu", 40);

        Party animator = new Animator(PartyType.ANIMATOR, PartyLocation.INSIDE,
                150, "Event", 2, "Geroiv UPA", 26);

        Party soapBubbles = new SoapBubble(PartyType.SOAPBUBBLE,
                PartyLocation.OUTSIDE, 70, "Event", 2.5, "Suxiv", 15);

        Party batut = new Batut(PartyType.BATUT, PartyLocation.OUTSIDE,
                90, "Event", 2, "prospect Shevchenka", 13);

        holidayEvent.addParty(workshop);
        holidayEvent.addParty(animator);
        holidayEvent.addParty(soapBubbles);
        holidayEvent.addParty(batut);
        holidayEvent.sortPartyByPrice(holidayEvent.getPartyList());
        for (Party party : holidayEvent.getPartyList()) {
            System.out.println(party.getorgName() + " is cost  "
                    + party.getPrice() + " dollars and duration is "
                    + party.getHours() + " hours " + party.getType() + " "
                    + party.getaddress() + " "
                    + " " + party.getAmount());
        } List<Party>
                resultList = holidayEvent.searchByPartyParameters("OUTSIDE");
        System.out.println("Find by Location");
        System.out.println(resultList);
    }
}
