/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cocktail;

/**
 *
 * @author AL-Thuraya
 */
public class Cup {
    private double volume=0;
    private double size=300;
    private double kcl=0;
    public Cup(){
    }
    void SetVolume(double volume){
        this.volume=volume;
    }
    void SetSize(double size){
    this.size=size;
    }
    
    double GetVolume(){
    return volume;
    }
    double GetSize(){
    return size;
    }
    void SetKcl(double kcl){
    this.kcl=kcl;
    }
    double GetKcl(){
    return kcl;
    }
  public String getInfo(){
  return("  volume "+volume+" size "+size+" kcl "+kcl);
  }
  
  
}
