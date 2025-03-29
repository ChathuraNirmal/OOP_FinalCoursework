/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package Coursework.View;

/**
 *
 * @author chath
 */
public enum Strongness {

    LOW(20), MEDIUM(40), HIGH(60), STRONG(80), CLOSED(0);

    int strenght;

    private Strongness(int strongValue) {

        strenght = strongValue;

    }

    public int Strength() {
        return strenght;
    }

}
