/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Network;

import Service.CadastroService;
import Service.CadastroServiceImpl;
import Service.ConsultaMarcacaoService;
import Service.ConsultaMarcacaoServiceImpl;

/**
 *
 * @author PICHAU
 */
public class Servidor {

    CadastroService cadastroService = new CadastroServiceImpl();
    ConsultaMarcacaoService consultaMarcacaoService = new ConsultaMarcacaoServiceImpl(cadastroService);

    void iniciar() {
        // normalmente aceitaria conexões de cliente aqui
    }
}
