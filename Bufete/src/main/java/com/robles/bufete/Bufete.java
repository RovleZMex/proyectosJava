/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package com.robles.bufete;

/**
 *
 * @author santiagorobles
 */
public class Bufete {

    public static void imprime(Employee e) {
        System.out.println("**************************");
        System.out.println("Clase : " + e.getClass());
        System.out.println("Horas :" + e.getHours());
        System.out.println("Salario: " + e.getSalary());
        System.out.println("Vacaciones: " + e.getVacationDays());
        System.out.println("Formato: " + e.getVacationForm());
        
        if(e instanceof Secretary){
            Secretary t = (Secretary) e;
            t.uwtakeDictation("Hola");
            
        }else if(e instanceof Lawyer){
            Lawyer u = (Lawyer) e;
            u.sue();
        }
        
        System.out.println("**************************");
    }

    public static void main(String[] args) {
        Employee e = new Employee();
        imprime(e);
        
        Secretary b = new Secretary();
        b.takeDictation("Hola");
        imprime(b);
        
        Lawyer c = new Lawyer();
        c.sue();
        imprime(c);
    }
}
