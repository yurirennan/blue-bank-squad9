package com.squad9.bluebank.dto;

import org.hibernate.validator.constraints.br.CPF;
import javax.validation.constraints.*;
import java.util.Date;

//Serve para proteger nossa classe e "escolher" os atributos
//que queremos receber no body do request em JSON
public class ClienteRequestDTO {

    @NotBlank(message = "O campo nome não pode estar vazio.")
    @Size(min = 2, max = 100, message = "Nome inválido.")
    private String nome;

    @NotBlank(message = "O campo sobrenome não pode estar vazio.")
    private String sobrenome;

    @NotBlank(message = "O campo cpf não pode estar vazio.")
    @CPF(message = "CPF inválido.")
    private String cpf;

    @NotBlank(message = "O campo rg não pode estar vazio.")
    @Pattern(regexp = "(^\\d{1,2}).?(\\d{3}).?(\\d{3})-?(\\d{1}|X|x$)", message = "RG Inválido.")
    private String rg;

    @NotNull(message = "O campo data_de_nascimento não pode estar vazio.")
    @Past(message = "Data inválida.")
    private Date dataDeNascimento;

    @NotBlank(message = "O campo email não pode estar vazio.")
    @Email(message = "Email inválido.")
    private String email;

    @NotBlank(message = "O campo celular não pode estar vazio.")
    @Pattern(
            regexp = "(^\\([1-9]{2}\\) (?:[2-8]|9[1-9])[0-9]{3}\\-[0-9]{4}$)",
            message = "Celular inválido."
    )
    private String celular;

    @Pattern(
            regexp = "(^\\([1-9]{2}\\) [0-9]{4}\\-[0-9]{4}$)",
            message = "Telefone inválido."
    )
    private String telefone;

    @NotBlank(message = "O campo senha não pode estar vazio.")
    @Size(min = 6, message = "A senha deve conter pelo menos 6 caracteres.")
    private String senha;

    private String nomeDoPai;

    @NotBlank(message = "O campo nome_da_mae não pode estar vazio.")
    private String nomeDaMae;

    @NotBlank(message = "O campo profissao não pode estar vazio.")
    private String profissao;

    @NotNull(message = "O campo renda_mensal não pode estar vazio.")
    @Positive(message = "Valor de renda mensal inválido.")
    private Integer rendaMensal;

    @NotNull(message = "O campo patrimonio não pode estar vazio.")
    @PositiveOrZero(message = "Valor de patrimônio mensal inválido.")
    private Long patrimonio;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public Date getDataDeNascimento() {
        return dataDeNascimento;
    }

    public void setDataDeNascimento(Date dataDeNascimento) {
        this.dataDeNascimento = dataDeNascimento;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getNomeDoPai() {
        return nomeDoPai;
    }

    public void setNomeDoPai(String nomeDoPai) {
        this.nomeDoPai = nomeDoPai;
    }

    public String getNomeDaMae() {
        return nomeDaMae;
    }

    public void setNomeDaMae(String nomeDaMae) {
        this.nomeDaMae = nomeDaMae;
    }

    public String getProfissao() {
        return profissao;
    }

    public void setProfissao(String profissao) {
        this.profissao = profissao;
    }

    public Integer getRendaMensal() {
        return rendaMensal;
    }

    public void setRendaMensal(Integer rendaMensal) {
        this.rendaMensal = rendaMensal;
    }

    public Long getPatrimonio() {
        return patrimonio;
    }

    public void setPatrimonio(Long patrimonio) {
        this.patrimonio = patrimonio;
    }
}
