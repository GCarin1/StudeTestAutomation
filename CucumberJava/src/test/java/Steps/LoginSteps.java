package Steps;


import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.E;
import cucumber.api.java.pt.Entao;
import cucumber.api.java.pt.Quando;


public class LoginSteps {

	@Dado("^esta na tela de login$")
	public void esta_na_tela_de_login() throws Throwable {
		System.out.println("Dentro do Stap login page");
	}

	@Quando("usuario entrar com o usuario e a senha")
	public void usuario_entrar_com_o_usuario_e_a_senha() throws Throwable {
		System.out.println("Dentro do Stap de usuario e senha ");
	}

	@E("click no botao de login")
	public void click_no_bot_o_de_login() throws Throwable {
		System.out.println("Dentro do Stap de clicar no botao de login ");
	}

	@Entao("^usuario ira navegar para a tela de Home pag$")
	public void usuario_ira_navegar_para_a_tela_de_Home_page() throws Throwable {
		System.out.println("Dentro do Stap de acesso a home page");
	}

}
