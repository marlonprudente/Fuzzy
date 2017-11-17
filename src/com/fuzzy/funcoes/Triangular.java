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

/**
 *
 * @author Marlon Prudente <marlonoliveira at alunos.utfpr.edu.br>
 */
public class Triangular extends Pertinencia {

    Double a;
    Double b;
    Double alfaA;
    Double alfaB;

    public Triangular(Double a, Double m, Double b) {
        this.a = a;
        this.m = m;
        this.b = b;

    }

    public Triangular(Double a, Double m, Double b, Double altura) {
        this.a = a;
        this.m = m;
        this.b = b;
        this.altura = altura;

    }

    @Override
    public Double Resultado(Double x) {
        Double resultado;
        if (x < a) {
            resultado = 0.0;
        } else if (x < m) {
            resultado = (altura * (x - a)) / (m - a);
        } else if (x <= b) {
            resultado = altura - (((altura) * (x - m)) / (b - m));
        } else {
            resultado = 0.0;
        }
        return resultado;
    }

    @Override
    public void AlfaCorte(Double alfa) {
        if (alfa <= 0.0) {
            alfaA = a;
            alfaB = b;
        } else if (alfa < altura) {
            alfaA = ((alfa * (m - a)) / altura) + a;
            alfaB = (((altura - alfa) * (b - m)) / altura) + m;
        } else if (alfa == altura) {
            alfaA = m;
            alfaB = m;
        } else if (alfa > altura) {
            alfaA = 0.0;
            alfaB = -1.0;
        }
    }
    
    public Double getAlfaA(){
        return alfaA;
    }
    public Double getAlfaB(){
        return alfaB;
    }

}
