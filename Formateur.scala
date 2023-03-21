import java.time.LocalDate;


class Formateur (Nom: String , Prenom: String, Datenaissance :LocalDate , Email :String , var Specialite: String)
    extends Personne (Nom: String , Prenom: String , Datenaissance :LocalDate , Email :String ){
    
    def getSpecialite(): String = {
    return Specialite
    }
    def setSpecialite(spec: String): Unit = {
    Specialite = spec
    }
    override def toString() = {
        "Je suis "+Nom+" "+ Prenom +". spécialité "+Specialite
    }
}