/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Service;

import Model.Aluno;

/**
 *
 * @author artcm
 */
public class CadastroServiceImpl implements CadastroService {

     @Override
    public Aluno cadastrarAluno(String nome, int idade) {
        Aluno aluno = new Aluno(nome, idade);
        // Aqui você deve adicionar o aluno ao banco de dados ou a um repositório de dados
        return aluno;
    }
}