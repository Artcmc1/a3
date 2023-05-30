/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Network;

import Model.Aluno;
import Model.Horario;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author artcm
 */
public class ConsultaMarcacaoServiceImpl implements ConsultaMarcacaoService {

    private List<Horario> horarios = new ArrayList<>();
    private CadastroService cadastroService;

    ConsultaMarcacaoServiceImpl(CadastroService cadastroService) {
        this.cadastroService = cadastroService;
    }

    public List<Horario> consultarHorarios() {
        return horarios;
    }

    public void marcarHorario(String alunoId, LocalDateTime dataHora) {
        Aluno aluno = cadastroService.buscarAluno(alunoId);
        Horario horario = new Horario(dataHora);
        horario.aluno = aluno;
        horarios.add(horario);
    }
}
