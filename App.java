package projetoLogin;

import java.sql.Connection;

public class App {
     public static void main(String[] args) {
        ConexaoSQLite conexaoSQLite = new ConexaoSQLite(); 
        Connection conexao = conexaoSQLite.conectar();
        
        CriarTabela.criarTabelaUsuarios(conexao);
         InserirUsuarios.inserirUsuario(conexao, "Matheus", "Matheus@example.com.br");
         InserirUsuarios.inserirUsuario(conexao, "Stevao", "Stevao@example.com.br");
         InserirUsuarios.inserirUsuario(conexao, "Lucas", "Lucas@example.com.br");
        
        ListarUsuarios.listarUsuarios(conexao);
        
        AtualizarUsuarios.atualizarUsuarios(conexao, 2, "Pedro", "Pedro@email.com");
        
        DeletarUsuario.deletarUsuario(conexao, 6);
    }
}
