/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cocktail;

/**
 *
 * @author AL-Thuraya
 */
public class ingredients {
    private Colors c;
    private double kcl;
    private double size=0;
    public ingredients(){
    }
  public ingredients(double kcl, double size,Colors c){
  this.kcl=kcl;
  this.size=size;
  this.c=c;
  }

  void setsize(double size){
  this.size=size;
  }
    public double getsize(){
    return size;
    }
    public double getkcl(){
    return kcl;
    }
   Colors Getcolor(){
    return c;
    }
    
}
