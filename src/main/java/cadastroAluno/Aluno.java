/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cadastroAluno;

/**
 * 
 * classe com todos os atributos e o javabean do cadastro do aluno
 *
 * @author franc
 */
public class Aluno {
    
    private String nome;
    private String matricula;
    private String idade;
    private String telefone;
    private String cpf;
    private String data;
    
    
   //criação do contrutor do aluno com os atributos. 
  public Aluno (String nome, String idade, String cpf, String telefone, String data, String matricula){
        
        this.nome = nome;
        this.cpf = cpf;
        this.data = data;
        this.matricula = matricula;
        this.idade = idade;
        this.telefone = telefone;
        
    }
    
  // javabean do aluno com seus atributos incapsuladas.
  public Aluno() {
        
        
    }
  public String getNome() {
        return nome;
    }

  public void setNome(String nome) {
        this.nome = nome;
    }
 /**
  * 
  *    Atribui a instancia nome da classe aluno para a distribuição do cadastro
     * @return the matricula
     */
  public String getMatricula() {
        return matricula;
    }

    /**
     * Atribui a instancia matricula da classe aluno para a distribuição do cadastro
     * 
     * @param matricula the matricula to set
     */
  public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    /**
     * 
     * Atribui a instancia idade da classe aluno para a distribuição do cadastro
     * @return the idade
     */
  public String getIdade() {
        return idade;
    }

    /**
     * @param idade the idade to set
     */
  public void setIdade(String idade) {
        this.idade = idade;
    }

    /**
     * 
     * Atribui a instancia telefone da classe aluno para a distribuição do cadastro
     * @return the telefone
     */
  public String getTelefone() {
        return telefone;
    }

    /**
     * @param telefone the telefone to set
     */
  public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    /**
     * Atribui a instancia cpf da classe aluno para a distribuição do cadastro
     * 
     * @return the cpf
     */
  public String getCpf() {
        return cpf;
    }

    /**
     * @param cpf the cpf to set
     */
  public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    /**
     * 
     * Atribui a instancia data da classe aluno para a distribuição do cadastro
     * @return the data
     */
  public String getData() {
        return data;
    }

    /**
     * @param data the data to set
     */
  public void setData(String data) {
        this.data = data;
    }
}
