
import java.time.LocalDate;

class Personne(var Nom: String , var Prenom: String ,var Datenaissance :LocalDate ,var Email :String  ){

def getNom(): String = {
return Nom
}
def getPrenom(): String = {
return Prenom
}
def setNom(N : String): Unit = {
Nom = N
}
def setPrenom(P :String): Unit = {
Prenom = P
}

def getDatenaissance(): LocalDate = {
return Datenaissance 
}

def setDatenaissance(D : LocalDate): Unit = {
Datenaissance = D
}

def getEmail(): String = {
return Email 
}

def setEmail(E : String): Unit = {
Email  = E
}



}