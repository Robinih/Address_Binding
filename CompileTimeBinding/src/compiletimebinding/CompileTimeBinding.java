/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package compiletimebinding;

/**
 *
 * @author Admin
 */
public class CompileTimeBinding {
    
    public void display(String text){
        System.out.println("This is a String. " + text);
    }
    
    public void display(int num){
        System.out.println("This is a Integer. " + num);
    }

    public static void main(String[] args) {
        
        CompileTimeBinding obj = new CompileTimeBinding();
        obj.display("Hello!");
        obj.display(17);
        
    }
}