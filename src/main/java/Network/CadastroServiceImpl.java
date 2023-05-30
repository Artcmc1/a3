/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Network;

import Model.Aluno;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

/**
 *
 * @author artcm
 */
public class CadastroServiceImpl implements CadastroService {

    private Map<String, Aluno> alunos = new HashMap<>();

    @Override
    public Aluno cadastrarAluno(String nome, int idade) {
        String id = UUID.randomUUID().toString();
        Aluno aluno = new Aluno(id, nome, idade);
        alunos.put(id, aluno);
        return aluno;
    }

    public Aluno buscarAluno(String id) {
        return alunos.get(id);
    }
}
