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

import java.util.Objects;

/**
 *
 * @author Marlon Prudente <marlonoliveira at alunos.utfpr.edu.br>
 */
public class Singleton extends Pertinencia {
    Double alfaA;
    Double alfaB;

    public Singleton(Double m) {
        super.m = m;        
    }

    public Singleton(Double m, Double altura) {
        super.m = this.m;
        super.altura = this.altura;
    }

    /**
     *
     * @param x
     */
    @Override
    public Double Resultado(Double x) {
        Double resultado;              
        if (Objects.equals(m, x)) {
            resultado = altura;
        } else {
            resultado = 0.0;
        }
        return resultado;
    }

    @Override
    public void AlfaCorte(Double alfa) {
        if (alfa <= altura) {
            alfaA = m;
            alfaB = m;
        } else if (alfa > altura) {
            alfaA = 0.0;
            alfaB = -1.0;
        }
    }

}
