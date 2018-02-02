/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.oregonTrail.model;

/**
 *
 * @author SysAdmin
 */
public enum PartyHealth {
    
    Good("Good"),
    Fair("Fair"),
    Poor("Poor");

    private String partyHealth;

    private PartyHealth(String partyHealth) {
        this.partyHealth = partyHealth;
    }

    public String getPartyHealth() {
        return partyHealth;
    }

    @Override
    public String toString() {
        return "PartyHealth{" + "partyHealth=" + partyHealth + '}';
    }


    }
