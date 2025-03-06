package projetoLogin;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexaoSQLite {
    public Connection conectar(){
        Connection conexao = null; // Declara uma variável para armazenar a conexão
        String url = "jdbc:sqlite:usuariosNovo.db"; // Define o caminho do banco de dados SQLite
        
         try {
            // Tenta estabelecer a conexão com o banco de dados usando a URL fornecida
            conexao = DriverManager.getConnection(url);
            System.out.println("Conexão com SQLite estabelecida!"); // Mensagem de sucesso
        } catch (SQLException e) {
            // Caso ocorra um erro, ele será capturado e exibido
            System.out.println("Erro ao conectar ao banco: " + e.getMessage());
        }
        return conexao; // Retorna a conexão estabelecida (ou null se falhou)
        }
    
    public void desconectar(Connection conexao){
        
    }
}
