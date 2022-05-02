package ModelRefe;

public class ClsReferencia {

    private String ultimoNome;
    private String primeiroNome;
    private String nomeDoLivro;
    private String cidade;
    private String editora;
    private Integer ano;

    public ClsReferencia(String ultimoNome, String primeiroNome, String nomeDoLivro, String cidade, String editora, Integer ano) {

        this.ultimoNome = ultimoNome;
        this.primeiroNome = primeiroNome;
        this.nomeDoLivro = nomeDoLivro;
        this.cidade = cidade;
        this.editora = editora;
        this.ano = ano;
    }

    public ClsReferencia(String editora, int ano) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public ClsReferencia(String ultimoNome, String primeiroNome) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public ClsReferencia(int codigo, String nome) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public ClsReferencia() {

    }

    public String getUltimoNome() {
        return ultimoNome;
    }

    public void setUltimoNome(String ultimoNome) {
        this.ultimoNome = ultimoNome;
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

    public Integer getAno() {
        return ano;
    }

    public void setAno(Integer ano) {
        this.ano = ano;
    }

    public void setAno(float ano) {

    }

}
