/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package view;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import cadastroAluno.Aluno;
import ajustesDoAluno.ControlaAluno;

/**
 *
 * @author Cieudo
 */
public class DialogMostraAlunos extends javax.swing.JDialog {

    ControlaAluno ca;
    
    
    public DialogMostraAlunos(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }
    
    public DialogMostraAlunos(java.awt.Frame parent, boolean modal, ControlaAluno ca) {
        super(parent, modal);
        this.ca = ca;
        initComponents();
        exibeInformacoes();
        
    }
    
    
    private int maisNovo(ArrayList<Aluno> alunos ){
        
        int idade = 1000;
        int indice = 0;
        for(int i=0; i< alunos.size();i++){
            
            int idadeAtual = Integer.parseInt(alunos.get(i).getIdade());
            if(idadeAtual<idade){
                idade = idadeAtual;
                indice = i;
            }
        }
        return indice;
    }
    
    private int maisVelho(ArrayList<Aluno> alunos ){
        
        int idade = 0;
        int indice = 0;
        for(int i=0; i< alunos.size();i++){
            
            int idadeAtual = Integer.parseInt(alunos.get(i).getIdade());
            if(idadeAtual>idade){
                idade = idadeAtual;
                indice = i;
            }
        }
        return indice;
    }
    
    private void excluirMatricula(ArrayList<Aluno> alunos ){
        
        if(!alunos.isEmpty()){
            
            if(alunos.size()>=2){
                
            jTmat.setValueAt(alunos.get(0).getMatricula(), 0, 0);
            jTmat.setValueAt(alunos.get(alunos.size()-1).getMatricula(), 0, 1);
                
            }else{
                
            jTmat.setValueAt(alunos.get(0).getMatricula(), 0, 0);
            jTmat.setValueAt("Aluno ainda não cadastrado !", 0, 1);
            }
     
        }else{
            
            jTmat.setValueAt("", 0, 0);
            jTmat.setValueAt("", 0, 1);
        }
    }
    
    private void exibeInformacoes(){
        
        ArrayList<Aluno> alunos = ca.retornarTodos();
        excluirMatricula(alunos);
        mostrarMaisNovoEMaisVelho(alunos);
        for (int i = 0; i > 500; i++){ 
            
            Tblalunos.setValueAt("", i, 0);
            Tblalunos.setValueAt("", i, 1);
        }
        
                for (int i = 0; i < alunos.size() && alunos.get(i) != null; i++ ){
                    Tblalunos.setValueAt(alunos.get(i).getNome(), i, 0);
                    Tblalunos.setValueAt(alunos.get(i).getMatricula(), i, 1);
                    Tblalunos.setValueAt(alunos.get(i).getTelefone(), i, 2);
                    Tblalunos.setValueAt(alunos.get(i).getIdade(), i, 3);
                    Tblalunos.setValueAt(alunos.get(i).getCpf(), i, 4);
                    Tblalunos.setValueAt(alunos.get(i).getData(), i, 5);
       }             
    }
   
    /**
     * Esse método é chamado de dentro do construtor para inicializar o formulário.
     * AVISO: NÃO modifique este código. O conteúdo deste método é sempre
     * regenerado pelo Editor de formulários.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jBsair = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        Tblalunos = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jBapagar = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTmat = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        JTidade = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jBsair.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jBsair.setText("Sair");
        jBsair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBsairActionPerformed(evt);
            }
        });

        Tblalunos.setBackground(new java.awt.Color(255, 153, 153));
        Tblalunos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Nome", "Matricula", "Telefone", "Idade", "Cpf", "Data de Nascimento"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(Tblalunos);

        jPanel1.setBackground(new java.awt.Color(0, 102, 153));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel1.setText("Lista dos Alunos Cadastrados");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 537, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(513, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel1)
                .addContainerGap(45, Short.MAX_VALUE))
        );

        jButton3.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jButton3.setText("Voltar para o Cadastro");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jBapagar.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jBapagar.setText("Deletar Aluno Selecionado");
        jBapagar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBapagarActionPerformed(evt);
            }
        });

        jTmat.setBackground(new java.awt.Color(255, 153, 153));
        jTmat.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Matricula Do Primeiro", "Matricula Do Ultimo"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(jTmat);

        JTidade.setBackground(new java.awt.Color(255, 153, 153));
        JTidade.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null}
            },
            new String [] {
                "Aluno Mais Novo", "Aluno Mais Velho"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane3.setViewportView(JTidade);

        jButton1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jButton1.setText("Salvar Arquivo");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jScrollPane3)
                            .addComponent(jScrollPane2))
                        .addContainerGap())
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jBapagar)
                        .addGap(42, 42, 42)
                        .addComponent(jButton3)
                        .addGap(35, 35, 35)
                        .addComponent(jButton1)
                        .addGap(46, 46, 46)
                        .addComponent(jBsair)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBapagar)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1)
                    .addComponent(jBsair))
                .addGap(94, 94, 94))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jBsairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBsairActionPerformed
        // fecha a tela da lista de alunos
            System.exit(0);
    }//GEN-LAST:event_jBsairActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // volta para a tela de cadastro
            this.dispose();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jBapagarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBapagarActionPerformed
        // Apaga o aluno selecionado com o cursor do mouse
        
          int indice = Tblalunos.getSelectedRow();
          Aluno aluno = ca.retornarTodos().get(indice);
          ca.retornarTodos().remove(aluno);
        ((DefaultTableModel) Tblalunos.getModel()).removeRow(Tblalunos.getSelectedRow());
        excluirMatricula(ca.retornarTodos());
        mostrarMaisNovoEMaisVelho(ca.retornarTodos());
        
    }//GEN-LAST:event_jBapagarActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // botão que salva a lista em arquivo csv
        
        List<Aluno> listaAluno = ca.retornarTodos();
        boolean salvou = false;
        try{
          salvarArquivo(listaAluno, "ListagemAlunos.csv");
          salvou = true;
        }catch(IOException e){
            salvou = false;
          e.printStackTrace();
        } finally{
        if(salvou){
            JOptionPane.showMessageDialog(null, " Arquivo Salvo!");
        }else{
            JOptionPane.showMessageDialog(null, "Erro Ao Salvar Arquivo!");
        }
    }
        
    }//GEN-LAST:event_jButton1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(DialogMostraAlunos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DialogMostraAlunos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DialogMostraAlunos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DialogMostraAlunos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                DialogMostraAlunos dialog = new DialogMostraAlunos(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable JTidade;
    private javax.swing.JTable Tblalunos;
    private javax.swing.JButton jBapagar;
    private javax.swing.JButton jBsair;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTmat;
    // End of variables declaration//GEN-END:variables

    private void mostrarMaisNovoEMaisVelho(ArrayList<Aluno> alunos) {
        int indiceMaisNovo = maisNovo(alunos);
        int indiceMaisVelho = maisVelho(alunos);
        JTidade.setValueAt(alunos.get(indiceMaisNovo).getNome().concat(" (Aluno Mais Novo)"), 0, 0);
        JTidade.setValueAt(alunos.get(indiceMaisVelho).getNome().concat(" (Aluno Mais Velho)"), 0, 1);
    }

    private void salvarArquivo(List<Aluno> listaAluno,String fileName)throws IOException {
    String str = linha(listaAluno);
    BufferedWriter writer = new BufferedWriter(new FileWriter(fileName));
    writer.write(str);
    
    writer.close();
}

    private String linha(List<Aluno> listaAluno) {
        StringBuilder linha = new StringBuilder();
        for(Aluno aluno: listaAluno){
           linha
                   .append(aluno.getMatricula())
                   .append(",")
                   .append(aluno.getNome())
                   .append(",")
                   .append(aluno.getData())
                   .append(",")
                   .append(aluno.getTelefone())
                   .append(",")
                   .append(aluno.getCpf())
                   .append(",")
                   .append("\n");
                   
        }
        return linha.toString();
    }
}
