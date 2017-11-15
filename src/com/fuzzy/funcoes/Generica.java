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
package com.fuzzy.funcoes;

import java.util.Hashtable;
import java.util.Map;

/**
 *
 * @author Marlon Prudente <marlonoliveira at alunos.utfpr.edu.br>
 */
public class Generica extends Pertinencia {

    Hashtable<Integer, Vetor> vertices;

    public Generica(Hashtable<Integer, Vetor> vertices) {
        this.vertices = vertices;

    }

    @Override
    public Double Resultado(Double x) {
        for (int i = 0; i <vertices.size();i++) {
             Double x1, y1, x2, y2;
             
            x1 = vertices.get(i-1).getP1();
            y1 = vertices.get(i-1).getP2();
            x2 = vertices.get(i).getP1();
            y2 = vertices.get(i).getP2();

            if (x >= x1 && x <= x2) {

                Double m = (y1 * y2) / (x2 - x1);

                return m * (x2 - x1) - y1;
            }
        }

        return 0.0;

    }


    public Hashtable<Integer, Vetor> AlfaCorteTable(Double alfa, Double in_1, Double in_2) {
        
        return vertices;
    }

    @Override
    public Double Centroide() {
        return 0.0;
    }

}
