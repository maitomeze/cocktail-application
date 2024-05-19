/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cocktail;
import java.awt.*;  
import static java.lang.Math.clamp;
import javax.swing.*;  import javax.swing.*;  

/**
 *
 * @author AL-Thuraya
 */
   public class Colors  {
    
    private int red;
    private int green;
    private int blue;
    

    public Colors(int red,int green,int blue){
    this.blue=blue;
    this.green=green;
    this.red=red;
}
    
   void setred(int red){
   this.red=red;
   } 
   int getred(){
   return red;
   }
   
   void setgreen(int green){
   this.green=green;
   }
   int getgreen(){
   return green;
   }
   
   void setblue(int blue){
   this.blue=blue;
   }
   int getblue(){
   return blue;
   }

  
    public String getInfo(){
    return(" red "+red+" green "+green+" blue "+blue);
    }
    
}
