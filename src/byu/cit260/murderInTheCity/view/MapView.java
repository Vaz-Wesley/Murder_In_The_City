/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byu.cit260.murderInTheCity.view;

import byu.cit260.murderInTheCity.control.MapControl;
import byu.cit260.murderInTheCity.exceptions.MapControlException;
/**
 *
 * @author Wesley Vaz_2
 */
public class MapView extends View {
    
    public MapView(){
        
        super
        ( "\n"
        + "\n -------------------------------------------"
        + "\n  Map (Choose a location to move to)        "
        + "\n -------------------------------------------"
        + "\n P - Police Office                          "
        + "\n L - Laboratory                             "
        + "\n A - Find a location, then select it        "
        + "\n E - Exit                                   "
        + "\n -------------------------------------------");
    }

    @Override
    public boolean doAction(String choice) {
                
        choice = choice.toUpperCase();
        
        switch (choice){
          case "P":                            // Police Office
               this.policeOffice();
             break;
          case "L":                           // Laboratory
               this.laboratory();         
            break;
          case "K":                            // Kid Mania Park
                this.parkSceneView();
            break;
          case "B":                            // Billionaire Cassino
                this.cassinoSceneView();
            break;
          case "S":                            // Black Rock Stadium
                this.stadiumSceneView();
            break;
          case "A":                            // add a location to the map
               this.findLocation();
             break;
          case "E":                            // Exit game
               return true;
         default:
               ErrorView.display(this.getClass().getName(),
                       "*** Invalid selection *** Try again");
        }
        
        return false;
    }
    
     private void policeOffice(){            
            PoliceOfficeView policeOfficeView = new PoliceOfficeView(); 
            policeOfficeView.display();
        }
        
    private void laboratory(){            
        LaboratoryView laboratoryView = new LaboratoryView(); 
        laboratoryView.display();
    }
        
    public void findLocation(){            
        
        this.console.println("\nEnter location name");
        String input = this.getInput();
        String location = "";
        
        try {
          location = MapControl.findLocation(input);
        } catch (MapControlException me) {
            this.console.println(me.getMessage());
        }
        
        this.console.println(location);
    }
        
    private void parkSceneView(){            
        this.console.println("*** parkSceneView function called ***");
    }
        
    private void cassinoSceneView(){            
        this.console.println("*** cassinoSceneView function called ***");
    }
        
    private void stadiumSceneView(){            
        this.console.println("*** stadiumSceneView function called ***");
    }
}
