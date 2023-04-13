Feature: Sauce Demo Test Connexion OK

    @POEI23-372 @Test
	Scenario Outline: Sauce Demo Test Connexion OK
		Given je ouvre la page de accueil "https://www.saucedemo.com/"
		When je rentre le identifiant "<login>" dans le champ identifiant
		And je rentre le mot de passe "<mdp>"
		And je clique  sur le bouton Login
		Then je suis connecte à la page "Products"

		Examples:
			| login         | mdp          |
			| standard_user | secret_sauce |
			| problem_user  | secret_sauce |
