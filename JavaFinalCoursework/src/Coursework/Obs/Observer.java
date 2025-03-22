/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Coursework.Obs;
/**
 *
 * @author chath
 */
public class Observer {

    Observerable ObserverArray[] = new Observerable[0];
    int nextIndex;

    private void extendsArray() {
        Observerable[] tempObserverArray = new Observerable[ObserverArray.length + 1];
        System.arraycopy(ObserverArray, 0, tempObserverArray, 0, ObserverArray.length);
        ObserverArray = tempObserverArray;
    }

    public void addObserverArray(Observerable ObserverAr) {
        extendsArray();
        ObserverArray[nextIndex++] = ObserverAr;
    }

    public void txtUpdate(String txt) {

        for (Observerable observer : ObserverArray) {

            observer.txtSender(txt);

        }
    }

    public void areaClearedState(boolean state) {

        for (Observerable observer : ObserverArray) {

            observer.areaCleared(state);

        }

    }
}
