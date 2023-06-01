/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Service;

import Model.Aluno;
import Model.Horario;
import java.time.LocalDateTime;

/**
 *
 * @author artcm
 */
public class ConsultaMarcacaoServiceImpl implements ConsultaMarcacaoService {


  
  @Override
    public Horario marcarHorario(Aluno aluno, LocalDateTime data) {
        Horario horario = new Horario(aluno, data);
        // Aqui você deve adicionar o horario ao banco de dados ou a um repositório de dados
        return horario;
    }
}
