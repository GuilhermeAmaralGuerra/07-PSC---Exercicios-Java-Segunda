//(Loiane - Adaptado) Faça um programa para armazenar em uma matriz os compromissos de uma agenda pessoal, onde, 
//cada dia do mês deve conter 24 horas, e, para cada uma destas 24 horas podemos associar uma tarefa específica (compromisso agendado). 
//O programa deve ter um menu onde o usuário indica o dia do mês que deseja alterar e a hora, entrando em seguida com o compromisso, 
//ou então, o usuário pode também consultar a agenda, fornecendo o dia e a hora para obter o compromisso armazenado.

import java.util.Scanner;

public class Questao1{
    public static void main(String[] args) {
            Scanner input = new Scanner(System.in);

            String[][] agenda = new String[30][24];
            int dia, horas;

            System.out.print("Digite o dia: ");
            dia = input.nextInt();
            input.nextLine();

            System.out.print("Digite a hora: ");
            horas = input.nextInt();
            input.nextLine();

            if (agenda[dia][horas] == null) {
                System.out.print("Digite sua tarefa: ");
                agenda[dia][horas] = input.nextLine();

                System.out.print("Você escolheu essa tarefa no dia " + dia + " as " + horas + " horas: " + agenda[dia][horas]);
            } else{
                System.out.println("Esse horário está com uma tarefa!");
            }

            input.close();
    }
}