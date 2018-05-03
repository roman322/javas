//package code;
//
//import org.junit.Before;
//import org.junit.Test;
//
//import java.io.File;
//import java.io.IOException;
//import java.util.List;
//
//import static org.junit.Assert.assertEquals;
//import static org.junit.Assert.assertTrue;
//
//public class HolidayEventTest {
//
//    HolidayEvent manager;
//    private static Party party = new Animator(PartyType.ANIMATOR, PartyLocation.INSIDE,
//            4, "ANIMATOR", 2.5, "Manfucturer", 5 );
//
//    @Before
//    public void setUp() {
//        manager = new HolidayEvent();
//        Party workshop = new Workshop(PartyType.WORKSHOP, PartyLocation.INSIDE,
//                50, "Event", 2, "Stepana banderu", 40);
//
//        Party animator = new Animator(PartyType.ANIMATOR, PartyLocation.INSIDE,
//                150, "Event", 2, "Geroiv UPA", 26);
//
//        Party soapBubbles = new SoapBubble(PartyType.SOAPBUBBLE,
//                PartyLocation.OUTSIDE, 70, "Event", 2.5, "Suxiv", 15);
//
//        Party batut = new Batut(PartyType.BATUT, PartyLocation.OUTSIDE,
//                90, "Event", 2, "prospect Shevchenka", 13);
//
//        manager.addParty(workshop);
//        manager.addParty(animator);
//        manager.addParty(soapBubbles);
//        manager.addParty(batut);
//    }
//
//    @org.junit.Test
//    public void sortPartyByPrice() {
//        List<Party> sortedList = manager.sortPartyByPrice(manager.getPartyList());
//        assertEquals(50, sortedList.get(0).getPrice());
//        assertEquals(150, sortedList.get(3).getPrice());
//    }
//
//    @org.junit.Test
//    public void searchByPartyParameters() {
//        List<Party> resultList = manager.searchByPartyLocation(PartyLocation.OUTSIDE);
//        assertEquals(2 , resultList.size());
//        for(Party party : resultList) {
//            assertEquals("OUTSIDE", party.getPartyParameter());
//        }
//    }
//    @Test
//    public void writeToFile() {
//        try {
//            Writer writer = new Writer();
//            writer.writeToFile(manager.getPartyList());
//        } catch (IOException e) {
//            assertTrue(false);
//        }
//        File file = new File("F:\\Project/decoration.csv");
//        assertEquals(true, file.exists());
//    }
//
//}
