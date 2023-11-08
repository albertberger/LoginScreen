package LoginScreenTest;


import java.util.HashMap;
import java.util.Map;

/**
 * Classe criada para simulucao do banco de dados e validacao de login
 */
public class LoginScreen {
	
    private Map<String, String> userDatabase;// Simula o banco de dados

    /**
     *  Cria a loginScreen  
     *  Insere registros para simular o banco de dados
     */
    public LoginScreen(){
        userDatabase = new HashMap<>();
        userDatabase.put("john", "password123");
        userDatabase.put("alice", "securepass");
    }

    /**
     * Tentativa de verificar os dados passados do usuario e senha
     *
     * @param username do usuario tentando fazer o login
     * @param password do usuario tentando fazer o login
     * @return {@code true} se a verificacao for um sucesso, caso contrario {@code false}
     */
    public boolean login(String username, String password) {
        if(userDatabase.containsKey(username)){
            String storedPassword = userDatabase.get(username);
            if(storedPassword.equals(password)){
                return true; // Sucesso na verificacao
            }

        }
        return false; // Falha na verificacao
    }

    /**
     * Adiciona um novo usuario ao banco de dados
     * Metodo não recomendado para o uso em produção
     * Devido a falta de medidas de segurança
     *
     * @param username do novo usuario a ser inserido no banco de dados
     * @param password do novo usuario a ser inserida no banco de dados
     */
    public void addUser(String username, String password){
        userDatabase.put(username, password);
    }
}