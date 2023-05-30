/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectoareasfigurasgeometricas;

import javax.swing.JTextField;

/**
 *
 * @author SENA
 */
public class AreasFigurasGeometricas {
    
    //Todas las operaciones de las areas de la figuras
    public double areaCirculo(double radio){
        return(Math.PI*(radio*radio));
    }
    
   public double areaCuadrado(double lado){
       return(lado*lado);
   }
   
   public double areaTriangulo(double base, double altura){
       return((base*altura)/2);
   }
}
