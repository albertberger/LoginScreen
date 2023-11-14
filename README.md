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
