/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ModelRefe;

/**
 *
 * @author andre
 */
public class ClsReferencia {
    private String ultimoNome;
    private String primeiroNome;
    private String nomeDoLivro;
    private String cidade;
    private String editora;
    private float ano;

    public ClsReferencia(String ultinoNome, String primeiroNome, String nomeDoLivro, String cidade, String editora, float ano) {
        this.ultimoNome = ultimoNome;
        this.primeiroNome = primeiroNome;
        this.nomeDoLivro = nomeDoLivro;
        this.cidade = cidade;
        this.editora = editora;
        this.ano = ano;
    }

    public String getUltimoNome() {
        return ultimoNome;
    }

    public void setUltiMonome(String ultiMonome) {
        this.ultimoNome = ultiMonome;
    }

    public String getPrimeiroNome() {
        return primeiroNome;
    }

    public void setPrimeiroNome(String primeiroNome) {
        this.primeiroNome = primeiroNome;
    }

    public String getNomeDoLivro() {
        return nomeDoLivro;
    }

    public void setNomeDoLivro(String nomeDoLivro) {
        this.nomeDoLivro = nomeDoLivro;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getEditora() {
        return editora;
    }

    public void setEditora(String editora) {
        this.editora = editora;
    }

    public float getAno() {
        return ano;
    }

    public void setAno(float ano) {
        this.ano = ano;
    }
    
}