#Author:
#Data:
#Description::
@SmokeScenario
Feature: feature para testar funcoes  do login

  @SmokeTest
  Scenario: Checar se o login e valido
    Given esta na tela de login
    When usuario entrar com o usuario e a senha
    And click no botao de login
    Then usuario ira navegar para a tela de Home pag

  Scenario Outline: checar se o login e valido
    Given esta na tela de login
    When usuario entrar com o <usuario> e a <senha>
    And click no botao de login
    Then usuario ira navegar para a tela de Home page

    Examples: 
      | usuario | senha |
      | user2   | pass2 |
      | user2   | pass2 |
