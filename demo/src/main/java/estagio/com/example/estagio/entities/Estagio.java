package estagio.com.example.estagio.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "Estagio")
public class Estagio implements Serializable {
    
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;
  private int cargaHoraria;
  private String inicio;
  private String fim;
  private Status status;

  @OneToOne
  private Aluno aluno = new Aluno();

  @OneToOne
  private Orientador orientador = new Orientador();

  @OneToOne
  private Empresa empresa = new Empresa();

  public Status getStatus() {
    return this.status;
  }

}
