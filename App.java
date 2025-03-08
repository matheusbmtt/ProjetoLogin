package projetoLogin;

import java.sql.Connection;

public class App {
    public static void main(String[] args) {
        ConexaoSQLite conexaoSQLite = new ConexaoSQLite();
        Connection conexao = conexaoSQLite.conectar();
        
        // Criar tabela
       CriarTabela ct = new CriarTabela();
       ct.criarTabelaUsuarios(conexao);
       
       InserirUsuario.inserirUsuario(conexao, "Mattos", "Senha" );
       
      
       
       
    }
        
        
}
