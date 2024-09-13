package Entidades;

public class Aluno {
    public String nome;
    private String cpf;
    public int matricula;

    public void realizaCadastro(){
        System.out.println("Cadastro feito com sucesso!");
    }

    public void realizaMatricula(){
        System.out.println("Matrícula realizada com sucesso!");
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getCpf() {
        return cpf;
    }
}
