/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.oregonTrail.model;

import java.io.Serializable;
import java.util.Objects;

/**
 *
 * @author SysAdmin
 */
public class Status implements Serializable{
       
    //class instance variables
    private String ration;
    private String pace;
    private double money;
    private PartyHealth partyhealth;
    private Weather weather;

    public Status() {
    }
    
    public String getRation() {
        return ration;
    }

    public void setRation(String ration) {
        this.ration = ration;
    }

    public String getPace() {
        return pace;
    }

    public void setPace(String pace) {
        this.pace = pace;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }

    public PartyHealth getPartyhealth() {
        return partyhealth;
    }

    public void setPartyhealth(PartyHealth partyhealth) {
        this.partyhealth = partyhealth;
    }

    public Weather getWeather() {
        return weather;
    }

    public void setWeather(Weather weather) {
        this.weather = weather;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 13 * hash + Objects.hashCode(this.ration);
        hash = 13 * hash + Objects.hashCode(this.pace);
        hash = 13 * hash + Objects.hashCode(this.money);
        hash = 13 * hash + Objects.hashCode(this.partyhealth);
        hash = 13 * hash + Objects.hashCode(this.weather);
        return hash;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Status other = (Status) obj;
        if (!Objects.equals(this.ration, other.ration)) {
            return false;
        }
        if (!Objects.equals(this.pace, other.pace)) {
            return false;
        }
        if (!Objects.equals(this.money, other.money)) {
            return false;
        }
        if (this.partyhealth != other.partyhealth) {
            return false;
        }
        return this.weather == other.weather;
    }

    @Override
    public String toString() {
        return "Status{" + "ration=" + ration + ", pace=" + pace + ", money=" + money + ", partyhealth=" + partyhealth + ", weather=" + weather + '}';
    }
    
    

}
