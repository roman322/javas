/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package code;

import javax.persistence.*;

/**
 *
 * @author rmoch
 */

@Entity
public class Party {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id")
    private Integer id;

    @Column(name = "type")
    private PartyType type;

    @Column(name = "partyLocation")
    private PartyLocation partyLocation;

    @Column(name = "price")
    private int price;

    @Column(name = "partyParameter")
    private String partyParameter = "";

    @Column(name = "orgName")
    private String orgName;

    @Column(name = "hours")
    private double hours;

    @Column(name = "address")
    private String address;

    @Column(name = "amount")
    private int amount;

    public Party() {

    }
    public Party(final PartyType type, final PartyLocation partyLocation,
                 final int price, final String orgName, final double hours,
                 final String address, final int amount, final Integer id) {
        this.type = type;
        this.partyLocation = partyLocation;
        this.price = price;
        this.orgName = orgName;
        this.hours = hours;
        this.address = address;
        this.amount = amount;
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getHeaders(){
        return "type"+","+"partyLocation"+","+"price"+"partyParametr"+","+"orgName"+
                ","+"hours"+","+"address "+","+"amount";
    }

    public String toCSV() {
        return getType() + "," + getPartyParameter()+","+getPrice()+","+getPartyParameter()+","+getorgName()+","+getHours()+","+getaddress()+","+getAmount();
    }
    public final PartyType getType() {
        return this.type;
    }

    public final int getPrice() {
        return price;
    }

    public final String getorgName() {
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

    public  final PartyLocation getPartyLocation(){return partyLocation;}


}
