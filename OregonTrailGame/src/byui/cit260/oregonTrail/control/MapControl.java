/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.oregonTrail.control;

import byui.cit260.oregonTrail.exceptions.MapControlException;
import byui.cit260.oregonTrail.model.Location;

/**
 *
 * @author Roller
 */
public class MapControl {
    
    public static double calcRiverChance(double depth, double width, int[] rainyDays) throws MapControlException{
        
        //Failing depth
        if(depth > 72 || depth < 0){
            throw new MapControlException("You cannot determine the depth of this river, so you turn around.");
        }
        
        //Failing width
        if(width > 500 || width < 20){
            return -1;
        }
        
        //Calculating past 7 rainyDays
        int sumRainyDays = 0;
        for(int i : rainyDays){
            sumRainyDays += i;
        }
        
        //Caluclating reverFailChance
        double riverFailChance = depth  + (.1 * width) + (sumRainyDays * 5);
        
        return riverFailChance;
    }

    public static Location[] createMap(int noOfRows, int noOfColumns) throws MapControlException{
        if(noOfRows < 1 || noOfColumns < 1){
            throw new MapControlException("You need a row or column for this map!");
        }
        
        Location[] locations;
        locations = MapControl.createLocations(noOfRows, noOfColumns);
        return locations;
    }

    public static Location[] createLocations(int rows, int columns) {
        Location[] locations = new Location[(rows * columns)];
        for(int i=1; i <= (rows * columns); i++){
            double mileMarker = 2000/(rows * columns);
            Location location = new Location();
            //Need to make a better algorithm for location names, probly an enum
            location.setName("Location " + i);
            location.setMileMarker((mileMarker * i));
            locations[i-1] = location;
            //Need to stub more location setting things here
        }
        return locations;
    }
    
}
