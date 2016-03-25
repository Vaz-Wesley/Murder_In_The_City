/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byu.cit260.murderInTheCity.view;

/**
 *
 * @author Wesley Vaz_2
 */
public class MoveToNewLocationView extends View {
    
    public MoveToNewLocationView(){
        super("\n"
            + "\n -------------------------------------------"
            + "\n  Move to a new location                    "
            + "\n -------------------------------------------"
            + "\n P - Police Office                          "
            + "\n L - Laboratory                             "
            + "\n C - Crime Scene                            "          
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
          case "C":                            // Crime Scene
                this.crimeScene();
            break;
          case "E":                            // Exit game
               return true;
         default:
               System.out.println("*** Invalid selection *** Try again");
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
       
        private void crimeScene(){            
            System.out.println("*** crimeScene function called ***");
        }
}
