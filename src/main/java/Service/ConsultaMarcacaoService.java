/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Service;

import Model.Aluno;
import Model.Horario;
import java.time.LocalDateTime;

/**
 *
 * @author artcm
 */
public interface ConsultaMarcacaoService {

   public Horario marcarHorario(Aluno aluno, LocalDateTime data);
}