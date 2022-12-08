/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ajustesDoAluno;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import cadastroAluno.Aluno;
/**
 *
 * @author Cieudo
 */

// criando um arraylist e instanciando para 
public class ControlaAluno {

    private ArrayList<Aluno> alunos = new ArrayList<>();

    public boolean salvar(Aluno a) {
        if (existente(a)) {

            if (a != null) {
                alunos.add(a);
                return true;
            } else {
                alunos.remove(a);
                return false;
            }
        } else {
             JOptionPane.showMessageDialog(null, "Matricula ja existente !", "Aviso", JOptionPane.WARNING_MESSAGE);
            return false;
        }
    }
    
    // metodo que retorna os alunos add
    public ArrayList<Aluno> retornarTodos() {
        return alunos;
    }
    private boolean existente(Aluno aluno) {
        for (Aluno a : alunos) {
            if (a.getMatricula().equals(aluno.getMatricula())) {
                return false;
            }
        }
        return true;
    }
    
}
