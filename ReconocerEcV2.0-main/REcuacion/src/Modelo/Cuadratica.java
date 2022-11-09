/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author Bayron Vargas
 */
public class Cuadratica {
   private  Double n1,n2,n3,n4;
   public String ec,cu;

    public Cuadratica() {
    }

    public Cuadratica(Double n1, Double n2, Double n3, Double n4) {
        this.n1 = n1;
        this.n2 = n2;
        this.n3 = n3;
        this.n4 = n4;
    }

    public String getEc() {
        return ec;
    }

    public void setEc(String ec) {
        this.ec = ec;
    }

    public String getCu() {
        return cu;
    }

    public void setCu(String cu) {
        this.cu = cu;
    }

    public Double getN1() {
        return n1;
    }

    public void setN1(Double n1) {
        this.n1 = n1;
    }

    public Double getN2() {
        return n2;
    }

    public void setN2(Double n2) {
        this.n2 = n2;
    }

    public Double getN3() {
        return n3;
    }

    public void setN3(Double n3) {
        this.n3 = n3;
    }

    public Double getN4() {
        return n4;
    }

    public void setN4(Double n4) {
        this.n4 = n4;
    }
    
  
   public void Calcular(Double n1, Double n2, Double n3, Double n4){
     
      if( n1 > 0 && n2 > 0 && n3 > 0 && n4==1  ){ec="Su figura corresponde a un  ELIPSOIDE";}
      if( n1 > 0 && n2 > 0 && n3 < 0 && n4==0  ){ ec="Su figura corresponde a un  CONO ELIPTICO";}
      if( n1 > 0 && n2 > 0 && n3 < 0 && n4==1  ){ ec="Su figura corresponde a un  HIPERBOLOIDE DE UNA HOJA"; }
      if( n1 > 0 && n2 < 0 && n3 < 0 && n4==1  ){ec="Su figura corresponde a un  HIPERBOLOIDE DE DOS HOJAS";}
      if( n1 > 0 && n2 > 0 && n3 == 0  && n4  != 1 && n4  != 0 ){ec="Su figura corresponde a un  PARABOLOIDE ELIPTICO";}
      if( n1 > 0 && n2 < 0 && n3 == 0  && n4  != 1 && n4  != 0 ){ec="Su figura corresponde a un  PARABOLOIDE HIPERBOLICO";}
      if( n1 == 0 || n2 == 0 ){ec="No puede introducir ceros ahí, la figura no es cuadratica";}
     }
   
     
     

    
   
   public void Mostrar(Double n1, Double n2, Double n3, Double n4){
   
     cu = n1+"x²+"+n2+"y²+"+n3+" z²  = "+n4;
     if( n1 > 0 && n2 > 0 && n3 == 0  && n4  != 1 && n4  != 0 ){
       cu = n1+"x²+"+n2+"y²"+" = "+n4+"c";
     }
     if( n1 > 0 && n2 < 0 && n3 == 0  && n4  != 1 && n4  != 0 ){
       cu = n1+"x²+"+n2+"y²"+" = "+n4+"c";
     }
   
   }
   
   
}
