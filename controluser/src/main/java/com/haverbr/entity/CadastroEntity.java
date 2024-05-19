/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.haverbr.entity;

/**
 *
 * @author leo
 */
public class CadastroEntity {

    /*
    Sigla do estado (selecionar a partir de uma lista)
    CEP  (formato:  XXXXX-XXX)
    CPF  (formato:  XXX.XXX.XXX-XX) – sem validação
    Data de nascimento: DD/MM/AAAA - com validação
     */

    private String id;
    private String nome;
    private String endereco;
    private String numero;
    private String complemento;
    private String bairro;
    private String sigla;
    private String cep;
    private String cpf;
    private String cidade;
    private String dataNascimento;
    private String nomePai;
    private String nomeMae;

    private static CadastroEntity instance;

    public static CadastroEntity getInstance() {
        if (instance == null) {
            instance = new CadastroEntity();
        }
        return instance;
    }
    
    private CadastroEntity(){
        
    }
    
    public void guardarCadastro(CadastroEntity cadastro) {
        // Implementar la lógica para guardar el registro
        cadastro = instance;
    }

    public CadastroEntity buscarCadastroPorId(String id) {
        instance = CadastroEntity.getInstance();
        return instance;
    }
    
    
    /**
     * @return the id
     */
    public String getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return the endereco
     */
    public String getEndereco() {
        return endereco;
    }

    /**
     * @param endereco the endereco to set
     */
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    /**
     * @return the numero
     */
    public String getNumero() {
        return numero;
    }

    /**
     * @param numero the numero to set
     */
    public void setNumero(String numero) {
        this.numero = numero;
    }

    /**
     * @return the complemento
     */
    public String getComplemento() {
        return complemento;
    }

    /**
     * @param complemento the complemento to set
     */
    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }
    
    /**
     * @return the bairro
     */
    public String getBairro() {
        return bairro;
    }

    /**
     * @param bairro the bairro to set
     */
    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    /**
     * @return the sigla
     */
    public String getSigla() {
        return sigla;
    }

    /**
     * @param sigla the sigla to set
     */
    public void setSigla(String sigla) {
        this.sigla = sigla;
    }

    /**
     * @return the cep
     */
    public String getCep() {
        return cep;
    }

    /**
     * @param cep the cep to set
     */
    public void setCep(String cep) {
        this.cep = cep;
    }

    /**
     * @return the cpf
     */
    public String getCpf() {
        return cpf;
    }

    /**
     * @param cpf the cpf to set
     */
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    /**
     * @return the dataNascimento
     */
    public String getDataNascimento() {
        return dataNascimento;
    }

    /**
     * @param dataNascimento the dataNascimento to set
     */
    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    /**
     * @return the nomePai
     */
    public String getNomePai() {
        return nomePai;
    }

    /**
     * @param nomePai the nomePai to set
     */
    public void setNomePai(String nomePai) {
        this.nomePai = nomePai;
    }

    /**
     * @return the nomeMae
     */
    public String getNomeMae() {
        return nomeMae;
    }

    /**
     * @param nomeMae the nomeMae to set
     */
    public void setNomeMae(String nomeMae) {
        this.nomeMae = nomeMae;
    }

    @Override
    public String toString() {
        return "CadastroEntity{" + "id=" + id + ", nome=" + nome + ", endereco=" + 
                endereco + ", numero=" + numero + ", complemento=" + complemento + 
                ", bairro=" + bairro + ", sigla=" + sigla + ", cep=" + cep + ", cpf=" + cpf + 
                ", dataNascimento=" + dataNascimento + ", nomePai=" + nomePai + 
                ", nomeMae=" + nomeMae + '}';
    }

}
