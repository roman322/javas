/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package code;

/**
 *
 * @author rmoch
 */
public class Party {

    private PartyType type;
    private PartyLocation partyLocation;
    private int price;
    private String partyParameter = "";
    private String orgName;
    private double hours;
    private String address;
    private int amount;

    public Party() {

    }

    public Party(final PartyType type, final PartyLocation partyLocation,
                 final int price, final String orgName, final double hours,
                 final String address, final int amount) {
        this.type = type;
        this.partyLocation = partyLocation;
        this.price = price;
        this.orgName = orgName;
        this.hours = hours;
        this.address = address;
        this.amount = amount;
    }
    public final PartyType getType() {
        return this.type;
    }

    public final int getPrice() {
        return price;
    }

    public final String getorg_name() {
        return orgName;
    }

    public final double getHours() {
        return hours;
    }

    public final String getaddress() {
        return address;
    }

    public final int getAmount() {
        return amount;
    }
    public final String getPartyParameter() {
        return partyParameter;
    }

}
