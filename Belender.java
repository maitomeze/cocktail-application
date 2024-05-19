/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cocktail;
import cocktail.CoktailCapacityExeptiom;
import cocktail.CocktailPouredExeption;
import cocktail.ingredients;
import cocktail.Cup;
import java.util.*;
import javax.swing.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import static java.lang.Math.clamp;
import cocktail.Colors;
/**
 *
 * @author AL-Thuraya
 */
public class Belender {
    private double capacity=1000;
    private double volume=0;
    private double kcl;
    private Colors color= new Colors(0,0,0);
    public double getVolume() {
        return volume;
    }
   Frute frute;
    Colors colr;
     List<ingredients> array = new ArrayList<>();
    ingredients ing;
    
    public Belender(){
    }
   //------------------------------------------------------------------
    
    
     void add(ingredients ing) throws CoktailCapacityExeptiom {
       double test_capacity=ing.getsize()+this.volume;
      if(capacity >= test_capacity)
      {
         
       array.add(ing);
       this.volume=this.volume+ing.getsize();
     
       }
       else
       {
       throw new CoktailCapacityExeptiom();}

}

///===============================================================
    
        
void mix () {
  int red=0;
  int blue =0;
  int green=0;
  for(int i=0;i<array.size();++i){
      
        kcl=kcl+array.get(i).getkcl();
  double ing_red=array.get(i).Getcolor().getred()*array.get(i).getsize();
  double cocktail_red=color.getred()*volume;
  red=(int)((ing_red+cocktail_red)/(volume+array.get(i).getsize()));
  
  double ing_blue =array.get(i).Getcolor().getblue()*(array.get(i).getsize());
  double cocktail_blue=color.getblue()*volume;
  blue=(int)((ing_blue+cocktail_blue)/(volume+array.get(i).getsize()));
  
  double ing_green=array.get(i).Getcolor().getgreen()*array.get(i).getsize();
  double cocktail_green =color.getgreen()*volume;
  green=(int)((ing_green+cocktail_green)/(volume+array.get(i).getsize()));
 
  
  }  
  color.setred(red);
  color.setblue(blue);
  color.setgreen(green);

  
  }
//------------------------------------------------------------------------  

void Pour(Cup cup)throws CocktailPouredExeption {
    if(volume>0){
        if(volume>=cup.GetSize()){
         cup.SetKcl(kcl*cup.GetSize()/volume);
         cup.SetVolume(cup.GetSize());
         volume=volume-cup.GetSize();
         kcl=kcl-cup.GetKcl();
        }
        if(volume<cup.GetSize()&&volume>0){
         cup.SetVolume(volume);
         cup.SetKcl(kcl);
         volume=0;
         kcl=0;
         
        }
       
        
    }
    else
        throw new CocktailPouredExeption();
    
}  

//==================================================================
  public String getInfo(){
    return("capacity: "+capacity+ "  volume: "+ volume +"  kcl: "+kcl+" color: ( "+this.GetColorred()+", " +this.GetColorgreen()+"," +this.GetColorblue()+ ")");
  }
    
public int GetColorred(){
return color.getred();
}
  public int GetColorblue(){
      
   return color.getblue();
  }
  public int GetColorgreen(){
  return color.getgreen();
  }
}
