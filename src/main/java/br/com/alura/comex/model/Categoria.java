package br.com.alura.comex.model;

import jakarta.persistence.*;

@Entity
public class Categoria {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, length = 50)
    private String nome;

    @Enumerated(EnumType.STRING)
    private StatusCategoria status = StatusCategoria.ATIVA;

    public Categoria(String nome) {
        this.nome = nome;
    }

    public Categoria() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public StatusCategoria getStatus() {
        return status;
    }

    public void setStatus(StatusCategoria status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Categoria{"
                + "id=" + id +
                ", nome='" + nome + "'" +
                ", status=" + status +
                '}';
    }
}