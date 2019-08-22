/*
/*
Faça um programa que controle os cursos de nossa instituição. Os
atributos desta classe são: códigoDoCurso (int), nome (String),
numeroDeAlunos (int) e notaNoMec (float). As operações que se
espera do sistema são:
a) Inserir dados
b)Insira em uma posição específica
c) Mostrar os dados
d)Buscar através de um código
e) Buscar através de um nome
f) Mostrar o curso com maior número de alunos
g)Mostrar a nota da instituição (média da nota dos cursos)
h)Remova através do código da curso
i) Remova através do “index” escolhido pelo usuário
j) Limpe o ArrayList (clear)
k)Verifique se o ArrayList está vazio (isEmpty)
Obs: Use o construtor padrão e de inicialização; valide tudo que for
possível; use o ArrayList que aprendemos hoje. 
 */
package curso;

import java.util.ArrayList;
import java.util.Scanner;

public class Curso {
    static Scanner entrada = new Scanner(System.in);
    private int CodigoCurso;
    private String nome;
    private int numeroDeAlunos;
    private float notaMec;

    public Curso(){
        CodigoCurso = 0;
        nome = "sem nome";
        numeroDeAlunos = 0;
        notaMec = 0;
    }

    public Curso(int CodigoCurso, String nome, int numeroDeAlunos, float notaMec) {
       
        this.CodigoCurso = CodigoCurso;
        this.nome = nome;
        this.numeroDeAlunos = numeroDeAlunos;
        this.notaMec = notaMec;
    }
    
    
    
    public int getCodigoCurso() {
        return CodigoCurso;
    }

    public void setCodigoCurso(int CodigoCurso) {
        this.CodigoCurso = CodigoCurso;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getNumeroDeAlunos() {
        return numeroDeAlunos;
    }

    public void setNumeroDeAlunos(int numeroDeAlunos) {
        this.numeroDeAlunos = numeroDeAlunos;
    }

    public float getNotaMec() {
        return notaMec;
    }

    public void setNotaMec(float notaMec) {
        this.notaMec = notaMec;
    }

    @Override
    public String toString() {
        return "Nome: "+nome+"\n"+
                "Código Curso: "+CodigoCurso+"\n"+
                "Número de Alunos: "+numeroDeAlunos+"\n"+
                "Nota do MEC: "+notaMec+"";     
    }

     public static int validarCodigo(int validarCodigo, ArrayList<Curso> listaDinamica) {
        int i;
        for (i = 0; i < listaDinamica.size(); i++) {
            while (listaDinamica.get(i).getCodigoCurso() == validarCodigo) {
                System.out.println("\nCódigo já existe. Redigite: ");
                validarCodigo = Integer.parseInt(entrada.nextLine());
            }
        }
        return(validarCodigo);
    }
}
