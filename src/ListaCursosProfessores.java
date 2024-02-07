import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListaCursosProfessores {
    /*------------------ FUNCÕES ------------------*/

    //Função para listar os cursos
    public static void listarCursos(List<String> listaCurso) {
        if (listaCurso.isEmpty()) {
            System.out.println("A lista de cursos está vazia.");
        } else {
            for (int i = 0; i < listaCurso.size(); i++) {
                System.out.println(i + " - " + listaCurso.get(i));
            }
        }
    }

    //Função para listar os professores
    public static void listarProf(List<String> listaProf) {
        if (listaProf.isEmpty()) {
            System.out.println("A lista de professores está vazia.");
        } else {
            for (int i = 0; i < listaProf.size(); i++) {
                System.out.println(i + " - " + listaProf.get(i));
            }
        }
    }

    public static void listarCursoConcluidos(List<String> listaCursoConcluidos) {
        if (listaCursoConcluidos.isEmpty()) {
            System.out.println("A lista de cursos concluídos está vazia.");
        } else {
            for (int i = 0; i < listaCursoConcluidos.size(); i++) {
                System.out.println(i + " - " + listaCursoConcluidos.get(i));
            }
        }
    }


    //Função para escolher listar ou cursos ou professores
    public static void escolhaListar(Scanner entrada, List<String> listaCurso, List<String> listaProf) {
        System.out.println("+----------- LISTAR -------------+");
        System.out.println("|   1 - Cursos                   |");
        System.out.println("|   2 - Professores              |");
        System.out.println("+--------------------------------+");
        System.out.print("Informe o número: ");

        int escolha = entrada.nextInt();

        switch (escolha) {
            case 1:
                listarCursos(listaCurso);
                break;
            case 2:
                listarProf(listaProf);
                break;
            default:
                System.out.println("Opção inválida.");
                System.out.print("\n");
                escolhaListar(entrada, listaCurso, listaProf);
                break;
        }
    }

    //Função para adicionar um curso
    public static void addCurso(Scanner entrada, List<String> listaCurso) {
        System.out.print("Informe o nome do curso: ");
        String curso = entrada.next();
        listaCurso.add(curso);
    }

    //Função para adicionar um professor
    public static void addProf(Scanner entrada, List<String> listaProf) {
        System.out.print("Informe o nome do professor: ");
        String prof = entrada.next();
        listaProf.add(prof);
    }

    //Função para adicionar ou um curso ou um professor
    public static void escolhaAdd(Scanner entrada, List<String> listaCurso, List<String> listaProf) {
        System.out.println("+---------- ADICIONAR -----------+");
        System.out.println("|   1 - Curso                    |");
        System.out.println("|   2 - Professor                |");
        System.out.println("+--------------------------------+");
        System.out.print("Informe o número: ");

        int escolha = entrada.nextInt();

        switch (escolha) {
            case 1:
                addCurso(entrada, listaCurso);
                break;
            case 2:
                addProf(entrada, listaProf);
                break;
            default:
                System.out.println("Opção inválida.");
                System.out.print("\n");
                escolhaAdd(entrada, listaCurso, listaProf);
                break;
        }
    }

    //Função para pedir o índice dos cursos
    public static int listarPedirIndiceCurso(Scanner entrada) {
        return entrada.nextInt();
    }

    //Função para pedir o índice dos professores
    public static int listarPedirIndiceProf(Scanner entrada) {
        return entrada.nextInt();
    }

    //Função para pedir o índice dos cursos concluídos
    public static int listarPedirIndiceCursoConcluidos(Scanner entrada) {
        return entrada.nextInt();
    }


    //Função para remover o índice selecionado de cursos
    public static void removerCurso(Scanner entrada, List<String> listaCurso) {
        System.out.print("Informe o índice do curso: ");
        listaCurso.remove(listarPedirIndiceCurso(entrada));
    }

    //Função para remover o índice de professores
    public static void removerProf(Scanner entrada, List<String> listaProf) {
        System.out.print("Informe o índice do professor: ");
        listaProf.remove(listarPedirIndiceProf(entrada));
    }


    public static void menuRemover(Scanner entrada, List<String> listaCurso, List<String> listaProf) {
        System.out.println("+----------- REMOVER ------------+");
        System.out.println("|   1 - Curso                    |");
        System.out.println("|   2 - Professor                |");
        System.out.println("+--------------------------------+");
        System.out.print("Informe o número: ");

        int escolha = entrada.nextInt();

        switch (escolha) {
            case 1:
                removerCurso(entrada, listaCurso);
                break;
            case 2:
                removerProf(entrada, listaProf);
                break;
            default:
                System.out.println("Opção inválida.");
                System.out.print("\n");
                menuRemover(entrada, listaCurso, listaProf);
                break;
        }
    }

    public static void marcarComoConcluido(Scanner entrada, List<String> listaCurso, List<String> listaCursoConcluido) {
        System.out.println("+------- CURSO CONCLUÍDO --------+");
        System.out.print("Informe o índice do curso concluído: ");

        int escolha = entrada.nextInt();

        listaCursoConcluido.add(listaCurso.get(escolha));
        listaCurso.remove(escolha);
    }


    /*--------------------- EXECUÇÃO --------------------- */
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Bem vindo a lista de Cursos e Professores");

        List<String> listaCurso = new ArrayList<>();
        List<String> listaProf = new ArrayList<>();
        List<String> listaCursoConcluido = new ArrayList<>();

        do {
            System.out.println("+------------- MENU -------------+");
            System.out.println("|   1 - Listar                   |");
            System.out.println("|   2 - Adicionar                |");
            System.out.println("|   3 - Remover                  |");
            System.out.println("|   4 - Add curso concluído      |");
            System.out.println("|   5 - Listar cursos concluídos |");
            System.out.println("+--------------------------------+");
            System.out.println("|   0 - Sair                     |");
            System.out.println("+--------------------------------+");
            System.out.print("Informe o número: ");

            int escolha = entrada.nextInt();

            System.out.print("\n");

            switch (escolha) {

                case 1:
                    escolhaListar(entrada, listaCurso, listaProf);
                    System.out.print("\n");
                    break;

                case 2:
                    escolhaAdd(entrada, listaCurso, listaProf);
                    System.out.print("\n");
                    break;

                case 3:
                    menuRemover(entrada, listaCurso, listaProf);
                    System.out.print("\n");
                    break;

                case 4:
                    marcarComoConcluido(entrada, listaCurso, listaCursoConcluido);
                    System.out.print("\n");
                    break;

                case 5:
                    listarCursoConcluidos(listaCursoConcluido);
                    System.out.print("\n");
                    break;

                case 0:
                    System.out.print("Finalizando o programa.");
                    System.exit(0);

                default:
                    System.out.println("Opção inválida.");
                    System.out.print("\n");
                    break;
            }
        } while (true);


    }
}
