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
public class ClsRferencia {
    private String ultiMonome;
    private String primeiroNome;
    private String nomeDoLivro;
    private String cidade;
    private String editora;
    private float ano;

    public ClsRferencia(String ultiMonome, String primeiroNome, String nomeDoLivro, String cidade, String editora, float ano) {
        this.ultiMonome = ultiMonome;
        this.primeiroNome = primeiroNome;
        this.nomeDoLivro = nomeDoLivro;
        this.cidade = cidade;
        this.editora = editora;
        this.ano = ano;
    }

    public String getUltiMonome() {
        return ultiMonome;
    }

    public void setUltiMonome(String ultiMonome) {
        this.ultiMonome = ultiMonome;
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
