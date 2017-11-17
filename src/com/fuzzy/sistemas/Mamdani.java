/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fuzzy.sistemas;

import com.fuzzy.funcoes.*;
import java.io.IOException;

/**
 *
 * @author Marlon Prudente <m.prudente at btc-banco.com>
 * <marlonoliveira at alunos.utfpr.edu.br>
 */
public class Mamdani {
    Double sujeira;
    Double mancha;
    Double x1,x2,y1,y2,y3,y4,y5,y6,y7,y8,y9;
    Trapezoidal Y1,Y2,Y3,Y4,Y5,Y6,Y7,Y8,Y9;
    Double a,m,n,b,alt;
    Compare compare = new Compare();
    
    public Mamdani(Double sujeira, Double mancha) throws IOException{
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
        //==========Regra 1:
        //System.out.print("Y1: ");
        y1 = Math.min(sujeiraPS.Resultado(sujeira), manchaSM.Resultado(mancha));
        tempoMC.Suporte();
        a = tempoMC.getAlfaA();
        b = tempoMC.getAlfaB();
        tempoMC.AlfaCorte(y1);
        m = tempoMC.getAlfaA();
        n = tempoMC.getAlfaB();
        Y1 = new Trapezoidal(a,m,n,b,y1);
        //System.out.print("" + Y1.Resultado(5.0) + "Altura: " + y1 + "a: " + a + "b: " + b + "m: "+m+"n: "+n);
        //==========Regra 2:
        //System.out.print("Y2: ");
        y2 = Math.min(sujeiraMS.Resultado(sujeira), manchaSM.Resultado(mancha));
        tempoC.Suporte();
        a = tempoC.getAlfaA();
        b = tempoC.getAlfaB();
        tempoC.AlfaCorte(y2);
        m = tempoC.getAlfaA();
        n = tempoC.getAlfaB();
        Y2 = new Trapezoidal(a,m,n,b,y2);
        //==========Regra 3:
        //System.out.print("Y3: ");
        y3 = Math.min(sujeiraGS.Resultado(sujeira), manchaSM.Resultado(mancha)); 
        tempoM.Suporte();
        a = tempoM.getAlfaA();
        b = tempoM.getAlfaB();
        tempoM.AlfaCorte(y3);
        m = tempoM.getAlfaA();
        n = tempoM.getAlfaB();
        Y3 = new Trapezoidal(a,m,n,b,y3);
        //===========Regra 4:
        //System.out.print("Y4: ");
        y4 = Math.min(sujeiraPS.Resultado(sujeira), manchaMM.Resultado(mancha));
        tempoM.Suporte();
        a = tempoM.getAlfaA();
        b = tempoM.getAlfaB();
        tempoM.AlfaCorte(y4);
        m = tempoM.getAlfaA();
        n = tempoM.getAlfaB();
        Y4 = new Trapezoidal(a,m,n,b,y4);
        //==========Regra 5:
        //System.out.print("Y5: ");
        y5 = Math.min(sujeiraMS.Resultado(sujeira), manchaMM.Resultado(mancha));
        tempoM.Suporte();
        a = tempoM.getAlfaA();
        b = tempoM.getAlfaB();
        tempoM.AlfaCorte(y5);
        m = tempoM.getAlfaA();
        n = tempoM.getAlfaB();
        Y5 = new Trapezoidal(a,m,n,b,y5);
        //=========Regra 6:
        //System.out.print("Y6: ");
        y6 = Math.min(sujeiraGS.Resultado(sujeira), manchaMM.Resultado(mancha)); 
        tempoL.Suporte();
        a = tempoL.getAlfaA();
        b = tempoL.getAlfaB();
        tempoL.AlfaCorte(y6);
        m = tempoL.getAlfaA();
        n = tempoL.getAlfaB();
        Y6 = new Trapezoidal(a,m,n,b,y6);
        //=========Regra 7:
       // System.out.print("Y7: ");
        y7 = Math.min(sujeiraPS.Resultado(sujeira), manchaGM.Resultado(mancha));
        tempoL.Suporte();
        a = tempoL.getAlfaA();
        b = tempoL.getAlfaB();
        tempoL.AlfaCorte(y7);
        m = tempoL.getAlfaA();
        n = tempoL.getAlfaB();
        Y7 = new Trapezoidal(a,m,n,b,y7);
        //=======Regra 8:
        //System.out.print("Y8: ");
        y8 = Math.min(sujeiraMS.Resultado(sujeira), manchaGM.Resultado(mancha));
        tempoL.Suporte();
        a = tempoL.getAlfaA();
        b = tempoL.getAlfaB();
        tempoL.AlfaCorte(y8);
        m = tempoL.getAlfaA();
        n = tempoL.getAlfaB();
        Y8 = new Trapezoidal(a,m,n,b,y8);
        //=======Regra 9:
        //System.out.print("Y9: ");
        y9 = Math.min(sujeiraGS.Resultado(sujeira), manchaGM.Resultado(mancha));
        tempoML.Suporte();
        a = tempoML.getAlfaA();
        b = tempoML.getAlfaB();
        tempoML.AlfaCorte(y9);
        m = tempoML.getAlfaA();
        n = tempoML.getAlfaB();
        Y9 = new Trapezoidal(a,m,n,b,y9);
        
        Generica g = new Generica(Y1, Y2, Y3, Y4, Y5, Y6, Y7, Y8, Y9);
        System.out.println("Centroide: " + g.Centroide());
        //g.gerarSaida(Y1, Y2, Y3, Y4, Y5, Y6, Y7, Y8, Y9);
 
    


    }
    

    
}
