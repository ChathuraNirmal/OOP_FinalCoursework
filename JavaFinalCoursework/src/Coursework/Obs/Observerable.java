/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Coursework.Obs;

/**
 *
 * @author chath
 */
public class Observerable {

    Observer ObserverArray[] = new Observer[0];
    int nextIndex;

    private void extendsArray() {
        Observer[] tempObserverArray = new Observer[ObserverArray.length + 1];
        System.arraycopy(ObserverArray, 0, tempObserverArray, 0, ObserverArray.length);
        ObserverArray = tempObserverArray;
    }

    public void addObserverArray(Observer ObserverAr) {
        extendsArray();
        ObserverArray[nextIndex++] = ObserverAr;
    }

    public void txtUpdate(String txt) {

        for (Observer observer : ObserverArray) {

            observer.txtSender(txt);

        }
    }

    public void areaClearedState(boolean state) {

        for (Observer obj : ObserverArray) {

            obj.areaCleared(state);

        }

    } 

    public void defenceUnlockedState(int sliderValue) {

        for (Observer obj : ObserverArray) {
            
            obj.defenceUnlocker(sliderValue);
            
        }
   
        
    }

}
