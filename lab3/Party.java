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
public class Party {

    private PartyType Type;
    private PartyLocation partyLocation;
    private int price;
    private String partyParameter="";
    private String org_name;
    private double hours;
    private String address;
    private int amount;

    public Party() {

    }

    public Party(PartyType Type, PartyLocation partyLocation, int price, String org_name, double hours, String address, int amount) {
        this.Type = Type;
        this.partyLocation = partyLocation;
        this.price = price;
        this.org_name = org_name;
        this.hours = hours;
        this.address = address;
        this.amount = amount;
    }

    public Party(PartyLocation partyLocation, int price) {
        this.partyLocation = partyLocation;
        this.price = price;
    }

    public PartyLocation getName() {

        return partyLocation;

    }

    public void setName(PartyLocation name) {

        this.partyLocation = name;

    }

    public void setType(PartyType Type) {
        this.Type = Type;
    }

    public PartyType getType() {
        return this.Type;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getorg_name() {
        return org_name;
    }

    public void setOrgname(String org_name) {
        this.org_name = org_name;
    }

    public double getHours() {
        return hours;
    }

    public void sethours(double hours) {
        this.hours = hours;
    }

    public String getaddress() {
        return address;
    }

    public void setaddress(String address) {
        this.address = address;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }
    
    public PartyLocation getPartyLocation(){
        return partyLocation;
    }
    
    public void setPartyLocation(PartyLocation partyLocation){
        this.partyLocation = partyLocation;
    }
    
    public String getPartyParameter(){
        return partyParameter;
    }
    
    public void setPartyParameter(String partyParameter) {
        this.partyParameter = partyParameter;
    }

}
