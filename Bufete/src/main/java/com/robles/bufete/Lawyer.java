/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.robles.bufete;

/**
 *
 * @author santiagorobles
 */
public class Lawyer extends Employee {

    @Override
    public String getVacationForm() {
        return "rosa";
    }
    
    public int getHours(){
        return 35;
    }
    
    public void sue(){
        System.out.println("Te veré en la corte!");
    }
}
