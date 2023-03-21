import java.time.LocalDate;


class Apprenant (Nom: String , Prenom: String, Datenaissance :LocalDate , Email :String, var Spec: String, 
var Niveau: String) extends Personne (Nom: String , Prenom: String , Datenaissance :LocalDate , Email :String ){
def getSpec(): String = {
return Spec
}
def setSpec(specialite: String): Unit = {
Spec = specialite
}
def getNiveau(): String = {
return Niveau
}
def setNiveau(Niv : String): Unit = {
Niveau = Niv
}

override def toString() = {
    "Je suis "+Nom+" "+ Prenom +". J'étudie "+Spec +" - "+Niveau
}
}