package DaoRefe;

import ModelRefe.ClsReferencia;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class ClsDAOReferencia {

    private Connection conexao;
    private final String url = "jdbc:mysql://localhost:3306/string";
    private final String usuario = "root";
    private final String senha = "99210361";

    //Métodos
    public Connection GetConexao() {
        try { //Tentar executar
            conexao = DriverManager.getConnection(url, usuario, senha);
        } catch (SQLException ex) { //Se erro, o sistema captura o erro
            System.out.println("Exceção: " + ex);
        }
        return conexao;
    }

    public boolean inserir(ClsReferencia objrefe) {
        String sql = "insert into cliente (ultimoNome,primeiroNome,nomeDoLivro,cidade,editora,ano) values(?,?,?,?,?,?)";
        String ultimoNome = objrefe.getUltimoNome();
        String primeiroNome = objrefe.getPrimeiroNome();
        String nomeDoLivro = objrefe.getNomeDoLivro();
        String cidade = objrefe.getCidade();
        String editora = objrefe.getEditora();
        int ano = objrefe.getAno();
        boolean resposta = false;
        conexao = this.GetConexao();
        try {
            PreparedStatement declaracao = conexao.prepareStatement(sql);
            declaracao.setString(1, ultimoNome);
            declaracao.setString(2, primeiroNome);
            declaracao.setString(3, nomeDoLivro);
            declaracao.setString(4, cidade);
            declaracao.setString(5, editora);
            declaracao.setFloat(6, ano);
            declaracao.execute();
            resposta = true;
        } catch (SQLException ex) {
            System.out.println("Exceção: " + ex);
        }
        return resposta;
    }

    public String pesquisarPorCodigo(int codigo) {
        String sql = "select * from cliente where codigo=" + codigo;
        String nome = "";
        conexao = this.GetConexao();
        try {
            PreparedStatement declaracao = conexao.prepareStatement(sql);
            ResultSet rs = declaracao.executeQuery();
            if (rs.next()) {
                nome = rs.getString("nome");
            }
        } catch (SQLException ex) {
            System.out.println("Exceção: " + ex);
        }
        return nome;
    }

    public boolean atualizar(int codigo, String novoNome) {
        String sql = "update cliente set nome=? where codigo=?";
        boolean resposta = false;
        conexao = this.GetConexao();
        try {
            PreparedStatement declaracao = conexao.prepareStatement(sql);
            declaracao.setString(1, novoNome);
            declaracao.setInt(2, codigo);
            declaracao.execute();
            resposta = true;
        } catch (SQLException ex) {
            System.out.println("Exceção: " + ex);
        }
        return resposta;
    }

    public boolean excluir(int codigo) {
        String sql = "delete from cliente where codigo=?";
        boolean resposta = false;
        conexao = this.GetConexao();
        try {
            PreparedStatement declaracao = conexao.prepareStatement(sql);
            declaracao.setInt(1, codigo);
            declaracao.execute();
            resposta = true;
        } catch (SQLException ex) {
            System.out.println("Exceção: " + ex);
        }
        return resposta;
    }

    public ArrayList pesquisarTodos() {
        String sql = "select * from cliente order by nome";
        ArrayList Referencia = new ArrayList();
        conexao = this.GetConexao();
        int ano;
        String editora;
        try {
            PreparedStatement declaracao = conexao.prepareStatement(sql);
            ResultSet rs = declaracao.executeQuery();
            while (rs.next()) {
                editora= rs.getString("editora");
                ano = rs.getInt("ano");
                ClsReferencia objReferencia = new ClsReferencia(editora,ano);
                Referencia.add(objReferencia);
            }
        } catch (SQLException ex) {
            System.out.println("Exceção: " + ex);
        }
        return Referencia;
    }

    public void setAno(float ano) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void setEditora(String editora) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void setCidade(String Cidade) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void setNomeDoLivro(String nomeLivro) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void setUltimoNome(String ultimoNome) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void setPrimeiroNome(String primeiroNome) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
