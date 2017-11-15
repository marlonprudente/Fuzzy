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
public class Minimo {
    Double a;
    Double b;
    Double c;
    
    public String getMinimo(Double pequeno, Double medio, Double grande){
        this.a = pequeno;
        this.b = medio;
        this.c = grande;
        if (a>b){
            if(a>c){
                return "Pequeno";
            }else{
                return "Grande";
            }
            
        }else{
            if(b>c){
                return "Medio";
            }else{
                return "Grande";
            }
        }
    }
}
