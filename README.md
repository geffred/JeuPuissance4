# JeuPuissance4
jeu puissance 4 en console , implémenté sous java


Contruire la grille de jeton : 
taille : 6x7

initialiser la grille avec des jetons de type Empty.


Gride :
	width: int // 6
	height: int // 7
	grille : Piece[6][7]
	colCapacity : int[6] // tout les valeurs initialiser à 6
	--------------------------
	Gride () : // contructeur qui crée et initialise la grille
	build() : void
	pushPiece(gamer:Gamer , piece : Piece , numColGride : int) // à chaque piece ajouter on ajoute ça position dans "fullCase"
	
	

Piece :
	id:int
	Couleur : String

Gamer :
	Name : String
	gameStatus : String

	


