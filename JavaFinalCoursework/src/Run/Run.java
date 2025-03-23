/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Run;

import Coursework.View.*;
import Coursework.Obs.Observer;

/**
 *
 * @author chath
 */
public class Run {
    
    public static void main(String[] args) {
        
        Observer mainController = Singleton.getInstanceMainController();
        
        mainController.addObserverArray(Singleton.getInstanceHelicopter());
        mainController.addObserverArray(Singleton.getInstanceSubmarine());
        mainController.addObserverArray(Singleton.getInstanceTank());
        
        MainControllerView mainControllerView = Singleton.getInstanceMainControllerView();
        
        mainControllerView.setVisible(true);
        
    }
    
}
