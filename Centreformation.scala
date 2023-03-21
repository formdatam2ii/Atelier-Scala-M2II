
import java.time.*;  
import scala.collection.mutable.ListBuffer

object Centreformation  {

  def main(args: Array[String]): Unit = {

  var pers1 = new Personne("Dupont","Vianney",LocalDate.of(1988, 12, 13),"pers1@cf.com")
  var pers2 = new Personne("Lenormand","Alex",LocalDate.of(1989, 1, 29),"pers2@cf.com")
  var pers3 = new Personne("Leparisien","Thomas",LocalDate.of(2000, 11, 9),"pers3@cf.com")
  var age =  Period.between(LocalDate.of(1988, 12, 13), LocalDate.now()).getYears()
  var Form1 = new Formateur(pers1.getNom(),pers1.getPrenom(),pers1.getDatenaissance() ,pers1.getEmail() , "Intelligence Artificiel");
  var App1 = new Apprenant(pers2.getNom(),pers2.getPrenom(),pers2.getDatenaissance() ,pers2.getEmail() , "PRF data analyste" , "Major de promo");
  var App2 = new Apprenant(pers3.getNom(),pers3.getPrenom(),pers3.getDatenaissance() ,pers3.getEmail() , "PRF data analyste" , "Major de promo");
  var pers4 = new Personne("Lenantais","Alain",LocalDate.of(2002, 8, 1),"pers4@cf.com")
  var App3 = new Apprenant(pers4.getNom(),pers4.getPrenom(),pers4.getDatenaissance() ,pers4.getEmail() , "PRF data scientist" , "Le plus fort");
  var Mod1 = new Module("BI",3);
  var Mod2 = new Module("Big Data",3);
  var Mod3 = new Module("data Science",3);
  var Not1 = new Note(13)
  var Not2 = new Note(15)
  var Not3 = new Note(19)
  var evaluation1 = new Tuple4(App1, Mod1, Not1 , Form1 )
  var evaluation2 = new Tuple4(App2, Mod1, Not2 , Form1 )
  var setEval = Set  (evaluation1 , evaluation2)
  var evaluation3 = new Tuple4(App1, Mod2, Not3 , Form1 )
  setEval += evaluation3
  // ajouter les apprenants à la liste des apprenants 
  var listeApp : List[Apprenant] = List (App1 , App2)
    // ajouter les apprenants à la set  des apprenants    var myset = Set("G", "Geek", "for")
  var setApp = Set  (App1 , App2)

  //listeApp += App3
  val liste2 = listeApp :+ App3
  setApp += App3
 // List(1,2,3).foreach(elem => println(elem))
  liste2.foreach (elem => println(elem.toString() +". J'ai obtenue la note "+ 
            Not1.getNote() + " dans le module "+ Mod1.getNomModule()+" avec Coeff "+ Mod1.getCoeff()+" qui a été enseigné par Dr "+
            Form1.toString()+".")
  )

  setApp.foreach (elem => println(elem.toString() +". J'ai obtenue la note "+ 
            Not1.getNote() + " dans le module "+ Mod1.getNomModule()+" avec Coeff "+ Mod1.getCoeff()+" qui a été enseigné par Dr "+
            Form1.toString()+".")
  )


  }





  /*
  println("Je suis "+App1.getNom()+" "+ App1.getPrenom() +". J'étudie "+App1.getSpec() +" - "+App1.getNiveau()+". J'ai obtenue la note "+ 
                  Not1.getNote() + "dans le module "+ Mod1.getNomModule()+" avec Coeff "+ Mod1.getCoeff()+" qui a été enseigné par Dr "+
                  Form1.getNom() + " " + Form1.getPrenom()+" spécialité "+Form1.getSpecialite()+".");
 */

}
