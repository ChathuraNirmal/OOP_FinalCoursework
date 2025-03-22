/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Run;

import Coursework.Obs.Observer;
import Coursework.View.Helicopter;
import Coursework.View.MainControllerView;
import Coursework.View.Submarine;
import Coursework.View.Tank;

/**
 *
 * @author chath
 */
public class Singleton {

     private static  Observer mainController ;

    private Singleton() {}
 
    public static Observer getInstanceMainController(){

         if (mainController == null) {
            mainController = new Observer();
            return mainController;
         }
         return mainController;
    }
    
        private static MainControllerView mainControllerView ;

 
    public static MainControllerView getInstanceMainControllerView(){

         if (mainControllerView == null) {
            mainControllerView = new MainControllerView();
            return mainControllerView;
         }
         return mainControllerView;
    }

    private static Helicopter helicopter;
    
    
        public static Helicopter getInstanceHelicopter(){

         if (helicopter == null) {
            helicopter = new Helicopter();
            return helicopter;
         }
         return helicopter;
    }
    private static  Tank tank;
    
    
        public static Tank getInstanceTank(){

         if (tank == null) {
            tank = new Tank();
            return tank;
         }
         return tank;
    }
    private static  Submarine submarine;
    
    
        public static Submarine getInstanceSubmarine(){

         if (submarine == null) {
            submarine = new Submarine();
            return submarine;
         }
         return submarine;
    }

}
    

