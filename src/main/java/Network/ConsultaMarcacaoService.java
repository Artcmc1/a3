/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Network;

import Model.Horario;
import java.time.LocalDateTime;
import java.util.List;

/**
 *
 * @author artcm
 */
public interface ConsultaMarcacaoService {

    List<Horario> consultarHorarios();

    void marcarHorario(String alunoId, LocalDateTime dataHora);
}
