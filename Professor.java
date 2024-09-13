package Entidades;

public class Professor {
    public String nome;
    private String cpf;
    public boolean hasMestrado;

    public void realizaCadastro(){
        System.out.println("Cadastro feito com sucesso!");
    }

    public void lancaNotas(){
        System.out.println("Notas lançadas no sitema.");
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getCpf() {
        return cpf;
    }
}
