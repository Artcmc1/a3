/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package A3;

import Model.Aluno;
import Model.Horario;
import Service.CadastroService;
import Service.CadastroServiceImpl;
import Service.ConsultaMarcacaoService;
import Service.ConsultaMarcacaoServiceImpl;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

/**
 *
 * @author artcm
 */
public class A3Sistemas {

    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o nome do aluno:");
        String nome = scanner.nextLine();

        System.out.println("Digite a idade do aluno:");
        int idade = scanner.nextInt();
        scanner.nextLine(); // Consumir a quebra de linha

        CadastroService cadastroService = new CadastroServiceImpl();
        Aluno aluno = cadastroService.cadastrarAluno(nome, idade);

        System.out.println("Digite a data e hora da aula no formato 'dd/MM/yyyy HH:mm':");
        String dataHoraStr = scanner.nextLine();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
        LocalDateTime dataHora = LocalDateTime.parse(dataHoraStr, formatter);

        ConsultaMarcacaoService consultaMarcacaoService = new ConsultaMarcacaoServiceImpl();
        Horario horario = consultaMarcacaoService.marcarHorario(aluno, dataHora);

        System.out.println("Aluno cadastrado: " + aluno.getNome());
        System.out.println("Horário marcado: " + horario.getData());

        scanner.close();
    }
}
