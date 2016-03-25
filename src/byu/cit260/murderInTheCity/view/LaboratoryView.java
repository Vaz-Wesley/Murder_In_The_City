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
public class LaboratoryView extends View{
    
        public LaboratoryView(){
            super("\n"
                + "\n -------------------------------------------"
                + "\n  Laboratory                                "
                + "\n -------------------------------------------"
                + "\n T - Time Since Death Calculator            "
                + "\n V - Validate Alibi                         "
                + "\n C - Celsius To Fahreinheit Calculator      "          
                + "\n E - Exit                                   "
                + "\n -------------------------------------------");
            
        }

    @Override
    public boolean doAction(String value) {
        
        value = value.toUpperCase();
        
        switch (value){
          case "T":                            // Police Office
               this.timeSinceDeath();
             break;
          case "V":                           // Laboratory
               this.validateAlibi();         
            break;
          case "C":                            // Crime Scene
                this.celsiusToFahrenheit();
            break;
          case "E":                            // Exit game
               return true;
         default:
               System.out.println("*** Invalid selection *** Try again");
        }
        
        return false;
    }
    
    private void timeSinceDeath(){            
            TimeSinceDeathView policeOfficeView = new TimeSinceDeathView(); 
            policeOfficeView.display();
        }
        
        private void validateAlibi(){            
            ValidateAlibiView validateAlibiView = new ValidateAlibiView(); 
            validateAlibiView.display();
        }
       
        private void celsiusToFahrenheit(){            
            System.out.println("*** celsiusToFahrenheit function called ***");
        }
}
