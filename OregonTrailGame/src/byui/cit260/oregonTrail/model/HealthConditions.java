/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.oregonTrail.model;

/**
 *
 * @author Mason Roller
 */
public enum HealthConditions {
    
    //In most instances, the party member(s) name will come before the messages here
    Recovered("Recovered", "has recovered."),
    Worsened("Worsened", "has taken a turn for the worse."),
    Cholera("Cholera", "has contracted cholera."),
    Dysentery("Dysentery", "has somehow gotten dysentery."),
    BrokeBone("Broken Bone", "has broken a bone."),
    Fever("Fever", "has gotten a fever."),
    Measles("Measles", "contracted the measles."),
    TyphoidFever("Typhoid Fever", "somehow got typhoid fever."),
    Diptheria("Diptheria", "now has diptheria."),
    Exhaustion("Exhaustion", "is feeling exhausted."),
    Snakebite("Snake bite", "has gotten bit by a snake, that dirty rascal."),
    Frostbite("Frostbite", "is feeling cold and has frostbite."),
    Hypothermia("Hypothermia", "is cold and contracted hypothermia.");

    private String condition;
    private String message;

    private HealthConditions(String condition, String message) {
        this.condition = condition;
        this.message = message;
    }

    public String getCondition() {
        return condition;
    }

    public String getMessage() {
        return message;
    }

    @Override
    public String toString() {
        return "HealthConditions{" + "condition=" + condition + ", message=" + message + '}';
    }



    }
