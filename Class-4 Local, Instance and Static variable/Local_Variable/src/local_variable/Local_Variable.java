/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package local_variable;

public class Local_Variable {
    int y;
    
    public void calAge(){
        int age = 0; //Cause compilation error if not initalized
        age = age + 9;
        y = y +3;
        System.out.println("Age is : "+age);
    }
    
    public static void main(String[] arggs){
       Local_Variable nc = new Local_Variable();
       nc.calAge();
    }
}