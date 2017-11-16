/*
 * Este arquivo foi desenvolvido na UTFPR - Campus Curitiba,
 * por alunos do curso de Engenharia de Computação.
 * 
 * Este é um software livre; você pode redistribuí-lo e/ou 
 * modificá-lo dentro dos termos da Licença Pública Geral GNU como 
 * publicada pela Fundação do Software Livre (FSF); na versão 3 da 
 * Licença, ou (a seu critério) qualquer versão posterior.
 * 
 * Este programa é distribuído na esperança de que possa ser  útil, 
 * mas SEM NENHUMA GARANTIA; sem uma garantia implícita de ADEQUAÇÃO
 * a qualquer MERCADO ou APLICAÇÃO EM PARTICULAR. Veja a
 * Licença Pública Geral GNU para maiores detalhes.
 * 
 * Você deve ter recebido uma cópia da Licença Pública Geral GNU junto
 * com este programa, Se não, veja <http://www.gnu.org/licenses/>.
 */
package com.fuzzy.main;

import com.fuzzy.funcoes.*;
import com.fuzzy.sistemas.*;

/**
 *
 * @author Marlon Prudente <marlonoliveira at alunos.utfpr.edu.br>
 */
public class Main {

    public static void main(String[] args) {
        // Minimo compare = new Minimo();
        // //X1
        // Double sujeira = 100.0;
        // Triangular sujeiraPS = new Triangular(0.0, 0.0, 50.0);
        // Triangular sujeiraMS = new Triangular(0.0, 50.0, 100.0);
        // Triangular sujeiraGS = new Triangular(50.0, 100.0, 100.0);
        // //X2
        // Double mancha = 100.0;
        // Triangular manchaSM = new Triangular(0.0, 0.0, 50.0);
        // Triangular manchaMM = new Triangular(0.0, 50.0, 100.0);
        // Triangular manchaGM = new Triangular(50.0, 100.0, 100.0);
        // //Y
        // Triangular tempoMC = new Triangular(0.0, 0.0, 10.0);
        // Triangular tempoC = new Triangular(0.0, 10.0, 25.0);
        // Triangular tempoM = new Triangular(10.0, 25.0, 40.0);
        // Triangular tempoL = new Triangular(25.0, 40.0, 60.0);
        // Triangular tempoML = new Triangular(40.0, 60.0, 60.0);
        
        // String X1, X2, Y;

        // X1 = compare.getMinimoString(sujeiraPS.Resultado(sujeira), sujeiraMS.Resultado(sujeira), sujeiraGS.Resultado(sujeira));
        // X2 = compare.getMinimoString(manchaSM.Resultado(mancha), manchaMM.Resultado(mancha), manchaGM.Resultado(mancha));
        
        // if (X1 == "Pequeno" && X2 == "Pequeno") {
            // Y = "Muito Curto";
        // } else if (X1 == "Medio" && X2 == "Pequeno") {
            // Y = "Curto";

        // } else if (X1 == "Grande" && X2 == "Pequeno") {
            // Y = "Medio";

        // } else if (X1 == "Pequeno" && X2 == "Medio") {
            // Y = "Medio";

        // } else if (X1 == "Medio" && X2 == "Medio") {
            // Y = "Medio";

        // } else if (X1 == "Grande" && X2 == "Medio") {
            // Y = "Longo";

        // } else if (X1 == "Pequeno" && X2 == "Grande") {
            // Y = "Longo";

        // } else if (X1 == "Medio" && X2 == "Grande") {
            // Y = "Longo";

        // } else {
            // Y = "Muito Longo";

        // }
        // System.out.println("Sujeira = " + X1 + " Mancha = " + X2 + " Resultado: " + Y);
        
        Mamdani mand = new Mamdani(70.0,75.0);
        mand.getY();

    }
}
