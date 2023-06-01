/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.time.LocalDateTime;

/**
 *
 * @author artcm
 */
public class Horario {
      private Aluno aluno;
    private LocalDateTime data;

    // constructor
    public Horario(Aluno aluno, LocalDateTime data) {
        this.aluno = aluno;
        this.data = data;
    }

    // getters
    public Aluno getAluno() {
        return this.aluno;
    }

    public LocalDateTime getData() {
        return this.data;
    }

    // setters
    public void setAluno(Aluno aluno) {
        this.aluno = aluno;
    }

    public void setData(LocalDateTime data) {
        this.data = data;
    }
}