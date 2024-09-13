import Entidades.Aluno;
import Entidades.Professor;

public class Escola{
    public static void main(String[] args) {
        Professor p1 = new Professor();
        p1.nome = "Maria do Socorro Constantino";
        p1.hasMestrado = true;
        p1.setCpf("123.456.789-10");

        System.out.println("Nome: " + p1.nome);
        System.out.println("CPF: " + p1.getCpf());
        System.out.println("Tem mestrado? " + p1.hasMestrado);

        p1.realizaCadastro();

        Aluno a1 = new Aluno();
        a1.nome = "Bebeca Fassino Ferreira";
        a1.matricula = 99999;
        a1.setCpf("109.876.543-21");

        System.out.println("Nome: " + a1.nome);
        System.out.println("CPF: " + a1.getCpf());
        System.out.println("Matrícula: " + a1.matricula);

        a1.realizaMatricula();
    }
}