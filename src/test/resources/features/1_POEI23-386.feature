Feature: Sauce Demo Test Connexion KO

	@KO
	Scenario Outline: Sauce Demo Test Connexion KO
		Given je ouvre la page de accueil "https://www.saucedemo.com/"
		When je rentre le identifiant "<login>" dans le champ identifiant
		And je rentre le mot de passe "<mdp>"
		And je clique  sur le bouton Login
		Then je verifie le  message de erreur "<MsgErreur>"

		Examples:
			| login           | mdp          | MsgErreur                                                                 |
			| standard_user2  | secret_sauce | Epic sadface: Username and password do not match any user in this service |
			| locked_out_user | secret_sauce | Epic sadface: Sorry, this user has been locked out.                       |
