/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cocktail;
import cocktail.Colors;
/**
 *
 * @author AL-Thuraya
 */
public class Frute extends ingredients {
    private String name;

    
    public Frute(double kcl,Colors c,double size  ,String name){
        super(kcl,size ,c);
        this.name=name;

       
    }
    

//   public String getInfo(){
//    return("name "+name+"volume "+volume+"kcl "+kcl);
//    }
}
