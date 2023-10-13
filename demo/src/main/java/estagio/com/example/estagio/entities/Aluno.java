package estagio.com.example.estagio.entities;

import java.io.Serializable;
//import java.util.ArrayList;
//import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "Alunos")
public class Aluno implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long matricula;
    private String name;

    @ManyToOne
    private Empresa empresa = new Empresa();

    @ManyToOne
    private Orientador orientador = new Orientador();

    public Long getId() {
        return matricula;
    }

    public void setId(Long matricula) {
        this.matricula = matricula;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}