/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Jobsheet3.Tugas1;

/**
 *
 * @author ASUS
 */
public class EncapDemo{
    private String name;
    private int age;
    
    public String getName(){
        return name;
    }
    
    public void setName(String newName){
        name = newName;
    }
    
    public int getAge(){
        return age;
    }
    
    public void setAge(int newAge){
        if(newAge > 30){
            System.out.println("Anda melewati batas umur 30 thn");
        } else if (newAge < 18){
            System.out.println("Anda belum mencapai umur 18 thn");
        } else{
            age = newAge;
        }
    }
}