## Documentação tela de login

## Exercício

Desenvolver um cenário de teste documentado utilizando JUnit, aderindo ao padrão TDD (Desenvolvimento Orientado a Testes), e gerar um Javadoc.

## Criação da classe

Em conformidade com as instruções recebidas e aderindo ao padrão TDD, inicialmente foram desenvolvidas as classes do projeto com o objetivo de compreender os recursos necessários para o seu funcionamento, conforme orientado, e em consonância com as exigências da IDE.

    #   public class LoginScreenTest {
        @Test
        public void testeSucessfulLogin(){
        LoginScreen loginScreen = new LoginScreen();
        Assertions.assertTrue(loginScreen.login("john", "password123"));
        }
    
        @Test
        public void testeFailedLogin(){
         LoginScreen loginScreen = new LoginScreen();
         Assertions.assertFalse(loginScreen.login("john", "wrong"));
        }
    
        @Test
        public void testeAdd(){
            LoginScreen loginScreen = new LoginScreen();
            loginScreen.addUser("testuser", "testpassword");
            Assertions.assertTrue(loginScreen.login("testuser", "testpassword"));
        }
    
    }


## Classe loginScreen

Identificando as falhas, foi elaborada a classe LoginScreen, empregando os métodos da LoginScreenTest, seguida pela realização de testes na referida classe.

            package LoginScreenTest;
            
            
            import java.util.HashMap;
            import java.util.Map;
            
            
            public class LoginScreen {
            	
                private Map<String, String> userDatabase;
            
               
                public LoginScreen(){
                    userDatabase = new HashMap<>();
                    userDatabase.put("john", "password123");
                    userDatabase.put("alice", "securepass");
                }
            
            
                public boolean login(String username, String password) {
                    if(userDatabase.containsKey(username)){
                        String storedPassword = userDatabase.get(username);
                        if(storedPassword.equals(password)){
                            return true; // Sucesso na verificacao
                        }
            
                    }
                    return false; // Falha na verificacao
                }
            
               
                public void addUser(String username, String password){
                    userDatabase.put(username, password);
                }
            }


## Documentação javadoc

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
