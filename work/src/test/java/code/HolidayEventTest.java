package code;

import org.jboss.arquillian.container.test.api.Deployment;
import org.jboss.arquillian.junit.Arquillian;
import org.jboss.shrinkwrap.api.ShrinkWrap;
import org.jboss.shrinkwrap.api.asset.EmptyAsset;
import org.jboss.shrinkwrap.api.spec.JavaArchive;
import org.junit.runner.RunWith;

import static org.junit.Assert.*;

@RunWith(Arquillian.class)
public class HolidayEventTest {
    @Deployment
    public static JavaArchive createDeployment() {
        return ShrinkWrap.create(JavaArchive.class)
                .addClass(HolidayEvent.class)
                .addAsManifestResource(EmptyAsset.INSTANCE, "beans.xml");
    }

    HolidayEvent manager;
    private static Party party = new Animator(PartyType.ANIMATOR, PartyLocation.INSIDE,
            4, "ANIMATOR", 2.5, "Manfucturer", 5);

    @org.junit.Before


    @org.junit.After
    public void tearDown() throws Exception {
    }

    @org.junit.Test
    public void addParty() {
        HolidayEvent testManager = new HolidayEvent();
        testManager.addParty(party);
        assertEquals(party, testManager.getPartyList().get(0));
    }

    @org.junit.Test
    public void sortPartyByPrice() {
    }

    @org.junit.Test
    public void searchByPartyParameters() {
    }
}
