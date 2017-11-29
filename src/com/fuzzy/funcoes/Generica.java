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

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.text.DecimalFormat;

/**
 *
 * @author Marlon Prudente <marlonoliveira at alunos.utfpr.edu.br>
 */
public class Generica extends Pertinencia {

    Double r;
    Double[] x = new Double[500];
    Double[] y = new Double[500];

    public Generica(Trapezoidal t1, Trapezoidal t2, Trapezoidal t3, Trapezoidal t4,
            Trapezoidal t5, Trapezoidal t6, Trapezoidal t7, Trapezoidal t8, Trapezoidal t9) throws IOException {
        Double v1, v2;
        int j = 0;
        DecimalFormat df =  new DecimalFormat("0.00");
        String fileName = "bancodedados.txt";
        File bd = new File(fileName);
        bd.createNewFile();
        FileWriter escrever = new FileWriter(bd);
        BufferedWriter buffer = new BufferedWriter(escrever);

        for (double i = 0; i < 100; i += 0.2) {
            v1 = Math.max(t1.Resultado(i), t2.Resultado(i));
            v2 = Math.max(t3.Resultado(i), t4.Resultado(i));
            v1 = Math.max(v1, v2);
            v2 = Math.max(v2, t5.Resultado(i));
            v2 = Math.max(v2, t6.Resultado(i));
            v2 = Math.max(v2, t7.Resultado(i));
            v2 = Math.max(v2, t8.Resultado(i));
            v2 = Math.max(v2, t9.Resultado(i));

            r = Math.max(v1, v2);
            buffer.write("(" + df.format(i) + "," + df.format(r) +")");
            buffer.newLine();
            x[j] = i;
            y[j] = r;
            j++;

        }
        buffer.close();

    }

    @Override
    public Double Centroide() {


        Double area = 0.0;
        Double centroide = 0.0;
        Double x1, x2, y1, y2;
        for (int i = 1; i < 500; i++) {
            if (i == 499) {
                x2 = x[0];
                y2 = y[0];
            } else {
                x2 = x[i + 1];
                y2 = y[i + 1];
            }
            x1 = x[i];
            y1 = y[i];
            area += (x1 * y2 - x2 * y1);
            centroide += (x1 + x2) * (x1 * y2 - x2 * y1);
        }
        area /= 2;
        return centroide / (6 * area);

    }

}
