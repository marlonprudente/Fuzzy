/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fuzzy.sistemas;

import com.fuzzy.funcoes.*;

/**
 *
 * @author Marlon Prudente <m.prudente at btc-banco.com>
 * <marlonoliveira at alunos.utfpr.edu.br>
 */
public class Mamdani {
    Double sujeira;
    Double mancha;
    Double x1,x2,y1,y2,y3,y4,y5,y6,y7,y8,y9;
    Double mc, c, m, l, ml;
    Minimo compare = new Minimo();
    
    public Mamdani(Double sujeira, Double mancha){
        this.sujeira = sujeira;
        this.mancha = mancha;
        
        //X1        
        Triangular sujeiraPS = new Triangular(0.0, 0.0, 50.0);
        Triangular sujeiraMS = new Triangular(0.0, 50.0, 100.0);
        Triangular sujeiraGS = new Triangular(50.0, 100.0, 100.0);
        //X2        
        Triangular manchaSM = new Triangular(0.0, 0.0, 50.0);
        Triangular manchaMM = new Triangular(0.0, 50.0, 100.0);
        Triangular manchaGM = new Triangular(50.0, 100.0, 100.0);
        //Y
        Triangular tempoMC = new Triangular(0.0, 0.0, 10.0);
        Triangular tempoC = new Triangular(0.0, 10.0, 25.0);
        Triangular tempoM = new Triangular(10.0, 25.0, 40.0);
        Triangular tempoL = new Triangular(25.0, 40.0, 60.0);
        Triangular tempoML = new Triangular(40.0, 60.0, 60.0);
        
        System.out.print("Y1: ");
        y1 = Math.min(sujeiraPS.Resultado(sujeira), manchaSM.Resultado(mancha));
        y1 = compare.getMaximo(tempoMC.Resultado(y1), tempoC.Resultado(y1), tempoM.Resultado(y1), tempoL.Resultado(y1), tempoML.Resultado(y1));
        
        System.out.print("Y2: ");
        y2 = Math.min(sujeiraMS.Resultado(sujeira), manchaSM.Resultado(mancha));
        y2 = compare.getMaximo(tempoMC.Resultado(y2), tempoC.Resultado(y2), tempoM.Resultado(y2), tempoL.Resultado(y2), tempoML.Resultado(y2));
        //=======================
        System.out.print("Y3: ");
        y3 = Math.min(sujeiraGS.Resultado(sujeira), manchaSM.Resultado(mancha)); 
        y3 = compare.getMaximo(tempoMC.Resultado(y3), tempoC.Resultado(y3), tempoM.Resultado(y3), tempoL.Resultado(y3), tempoML.Resultado(y3));
        
        System.out.print("Y4: ");
        y4 = Math.min(sujeiraPS.Resultado(sujeira), manchaMM.Resultado(mancha));
        y4 = compare.getMaximo(tempoMC.Resultado(y4), tempoC.Resultado(y4), tempoM.Resultado(y4), tempoL.Resultado(y4), tempoML.Resultado(y4));
        
        System.out.print("Y5: ");
        y5 = Math.min(sujeiraMS.Resultado(sujeira), manchaMM.Resultado(mancha));
        y5 = compare.getMaximo(tempoMC.Resultado(y5), tempoC.Resultado(y5), tempoM.Resultado(y5), tempoL.Resultado(y5), tempoML.Resultado(y5));
        
        System.out.print("Y6: ");
        y6 = Math.min(sujeiraGS.Resultado(sujeira), manchaMM.Resultado(mancha)); 
        y6 = compare.getMaximo(tempoMC.Resultado(y6), tempoC.Resultado(y6), tempoM.Resultado(y6), tempoL.Resultado(y6), tempoML.Resultado(y6));
        
        System.out.print("Y7: ");
        y7 = Math.min(sujeiraPS.Resultado(sujeira), manchaGM.Resultado(mancha));
        y7 = compare.getMaximo(tempoMC.Resultado(y7), tempoC.Resultado(y7), tempoM.Resultado(y7), tempoL.Resultado(y7), tempoML.Resultado(y7));
        
        System.out.print("Y8: ");
        y8 = Math.min(sujeiraMS.Resultado(sujeira), manchaGM.Resultado(mancha));
        y8 = compare.getMaximo(tempoMC.Resultado(y8), tempoC.Resultado(y8), tempoM.Resultado(y8), tempoL.Resultado(y8), tempoML.Resultado(y8));
        
        System.out.print("Y9: ");
        y9 = Math.min(sujeiraGS.Resultado(sujeira), manchaGM.Resultado(mancha));
        y9 = compare.getMaximo(tempoMC.Resultado(y9), tempoC.Resultado(y9), tempoM.Resultado(y9), tempoL.Resultado(y9), tempoML.Resultado(y9));

    }
    
    public void getY(){
        System.out.println("Y1: " + y1);
        System.out.println("Y2: " + y2);
        System.out.println("Y3: " + y3);
        System.out.println("Y4: " + y4);
        System.out.println("Y5: " + y5);
        System.out.println("Y6: " + y6);
        System.out.println("Y7: " + y7);
        System.out.println("Y8: " + y8);
        System.out.println("Y9: " + y9);
        
    }
    
}
