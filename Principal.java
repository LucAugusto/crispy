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
package principal;

import java.util.Scanner;
import curso.Curso;
import java.util.ArrayList;

public class Principal {

    public static void main(String[] args) {

        int opc, i, codCurso, numAlunos, indice;
        float notaMec = (float) 0.0;
        String nomeCurso = "";
        opc = i = codCurso = numAlunos = indice = 0;
        ArrayList<Curso> listaDinamica = new ArrayList();
        Scanner entrada = new Scanner(System.in);
        while (opc != 12) {
            System.out.println("\nMENU");
            System.out.print("\n1- Inserir dados");
            System.out.print("\n2- Insira em uma posição específica ");
            System.out.print("\n3- Mostrar os dados ");
            System.out.print("\n4- Buscar através de um código ");
            System.out.print("\n5- Buscar através de um nome ");
            System.out.print("\n6- Mostrar o curso com maior número de alunos ");
            System.out.print("\n7- Mostrar a nota da instituição (média da nota dos cursos) ");
            System.out.print("\n8- Remova através do código da curso ");
            System.out.print("\n9- Remova através do “index” escolhido pelo usuário ");
            System.out.print("\n10- Limpe o ArrayList (clear) ");
            System.out.print("\n11- Verifique se o ArrayList está vazio (isEmpty) ");
            System.out.print("\nDigite a opção: ");
            opc = Integer.parseInt(entrada.nextLine());
            switch (opc) {
                case 1:
                    System.out.println("\n Inserção de dados: ");
                    System.out.println("Olá, bem vindo.");
                    System.out.print("\nDigite o código do curso: ");
                    codCurso = Integer.parseInt(entrada.nextLine());
                    codCurso = Curso.validarCodigo(codCurso, listaDinamica);
                    if (codCurso >= 0) {
                        System.out.print("\nDigite o nome: ");
                        nomeCurso = entrada.nextLine();
                        System.out.print("\nDigite o número de alunos: ");
                        numAlunos = Integer.parseInt(entrada.nextLine());
                        if (numAlunos >= 0) {
                            System.out.print("\nDigite a nota do MEC: ");
                            notaMec = Float.parseFloat(entrada.nextLine());
                            if (notaMec >= 0) {
                                System.out.println("\nMuito obrigado. Tenha um bom dia!");
                                listaDinamica.add(new Curso(codCurso, nomeCurso, numAlunos, notaMec));
                            }

                        }
                    }

                    break;

                case 2:
                    System.out.println("\n Inserção numa posição específica: ");
                    System.out.print("\nDigite o índice: ");
                    indice = Integer.parseInt(entrada.nextLine());
                    if (indice <= listaDinamica.size() && indice >= 0) {
                        System.out.println("Olá, bem vindo.");
                        System.out.print("\nDigite o código do curso: ");
                        codCurso = Integer.parseInt(entrada.nextLine());
                        codCurso = Curso.validarCodigo(codCurso, listaDinamica);
                        if (codCurso >= 0) {
                            System.out.print("\nDigite o nome: ");
                            nomeCurso = entrada.nextLine();
                            System.out.print("\nDigite o número de alunos: ");
                            numAlunos = Integer.parseInt(entrada.nextLine());
                            if (numAlunos >= 0) {
                                System.out.print("\nDigite a nota do MEC: ");
                                notaMec = Float.parseFloat(entrada.nextLine());
                                if (notaMec >= 0) {
                                    System.out.println("\nMuito obrigado. Tenha um bom dia!");
                                    listaDinamica.add(indice, new Curso(codCurso, nomeCurso, numAlunos, notaMec));
                                }

                            }
                        }

                    } else {
                        System.out.println("\nÍndice digitado não existe na lista");
                    }

                    break;
                case 3:
                    System.out.println("\nMostrar os dados");
                    for (i = 0; i < listaDinamica.size(); i++) {
                        System.out.println("\n" + listaDinamica.get(i).toString());

                    }
                    break;
                case 4:
                    System.out.println("\nBuscar por meio de código de curso");
                    System.out.print("\nDigite o código que deseja buscar: ");
                    codCurso = Integer.parseInt(entrada.nextLine());
                    if (codCurso >= 0) {
                        for (i = 0; i < listaDinamica.size(); i++) {
                            if (listaDinamica.get(i).getCodigoCurso() == codCurso) {
                                System.out.println("\nInformações sobre o curso buscado: \n" + listaDinamica.get(i).toString());

                            }
                        }
                    } else {
                        System.out.println("\nImpossível consultar códigos de curso negativos");
                    }
                    break;

                case 5:
                    System.out.println("\nBuscar por meio de código de nome");
                    System.out.print("\nDigite o nome que deseja buscar: ");
                    nomeCurso = entrada.nextLine();
                    for (i = 0; i < listaDinamica.size(); i++) {
                        if (listaDinamica.get(i).getNome().equalsIgnoreCase(nomeCurso)) {
                            System.out.println("\nInformações sobre o curso buscado: \n" + listaDinamica.get(i).toString());
                        }
                    }
                    break;
                case 6:
                    System.out.println("\nCurso com mais alunos");
                    int maisAlunos = -1;
                    int index = 0;
                    for (i = 0; i < listaDinamica.size(); i++) {
                        if (listaDinamica.get(i).getNumeroDeAlunos() > maisAlunos) {
                            maisAlunos = listaDinamica.get(i).getNumeroDeAlunos();
                            index = i;
                        }
                    }
                    System.out.println("\nO curso com mais alunos é " + listaDinamica.get(index).getNome() + " com " + listaDinamica.get(index).getNumeroDeAlunos());
                    break;
                case 7:
                    System.out.println("\nMostrar a nota da instituição (média da nota dos cursos) ");
                    double media = 0;
                    for (i = 0; i < listaDinamica.size(); i++) {
                        media = media + listaDinamica.get(i).getNotaMec();
                    }
                    media = media / listaDinamica.size();
                    System.out.println("A média dos cursos da instituição é " + media);
                    break;
                case 8:
                    System.out.println("\nRemover por meio de código de curso");
                    System.out.print("\nDigite o código que deseja buscar: ");
                    codCurso = Integer.parseInt(entrada.nextLine());
                    if (codCurso >= 0) {
                        for (i = 0; i < listaDinamica.size(); i++) {
                            if (listaDinamica.get(i).getCodigoCurso() == codCurso) {
                                System.out.println("\nInformações sobre o curso removido: \n" + listaDinamica.get(i).toString());
                                listaDinamica.remove(i);
                            }
                        }
                    } else {
                        System.out.println("\nImpossível consultar códigos de curso negativos");
                    }
                    break;
                case 9:
                    System.out.print("\nRemover por meio do “index” escolhido pelo usuário ");
                    System.out.print("\nDigite o índice: ");
                    indice = Integer.parseInt(entrada.nextLine());
                    if (indice <= listaDinamica.size() && indice >= 0) {
                        listaDinamica.remove(indice);
                    }

                    break;
                case 10:
                    System.out.println("\nLimpar o ArrayList");
                    listaDinamica.clear();

                    break;
                case 11:
                    System.out.print("\nVerificar se o ArrayList está vazio");
                    if (listaDinamica.isEmpty()) {
                        System.out.println("\nArrayList vazio");
                    } else {
                        System.out.println("\nArrayList não está vazio");
                    }
                    break;
            }

        }

    }

}
