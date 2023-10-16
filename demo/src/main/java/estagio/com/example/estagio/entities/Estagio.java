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

  @OneToOne(mappedBy = "estagio")
  private Aluno aluno = new Aluno();

  @OneToOne(mappedBy = "estagio")
  private Orientador orientador = new Orientador();

  @OneToOne(mappedBy = "estagio")
  private Empresa empresa = new Empresa();

  public Aluno getAluno() {
    return this.aluno;
  }

  public void setAluno(Aluno aluno) {
    this.aluno = aluno;
  }

  public Orientador getOrientador() {
    return this.orientador;
  }

  public void setOrientador(Orientador orientador) {
    this.orientador = orientador;
  }

  public Empresa getEmpresa() {
    return this.empresa;
  }

  public void setEmpresa(Empresa empresa) {
    this.empresa = empresa;
  }

  public int getCargaHoraria() {
    return this.cargaHoraria;
  }

  public void setCargaHoraria(int cargaHoraria) {
    this.cargaHoraria = cargaHoraria;
  }

  public String getInicio() {
    return this.inicio;
  }

  public void setInicio(String inicio) {
    this.inicio = inicio;
  }

  public String getFim() {
    return this.fim;
  }

  public void setFim(String fim) {
    this.fim = fim;
  }

  public Status getStatus() {
    return this.status;
  }

  public void setStatus(Status status) {
    this.status = status;
  }

}
