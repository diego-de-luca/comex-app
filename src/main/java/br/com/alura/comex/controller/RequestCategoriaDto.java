package br.com.alura.comex.controller;

import br.com.alura.comex.model.Categoria;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

public class RequestCategoriaDto {

    @NotNull
    @NotBlank(message = "Campo não pode ser vazio")
    @Size(min = 2, message = "O nome da categoria deve ter no mínimo 2 caracteres.")
    private String nome;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Categoria toCategoria() {
        return new Categoria(this.nome);
    }
}