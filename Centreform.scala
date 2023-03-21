import java.time.*;  

object Centreform  {

def main(args: Array[String]): Unit = {
    var Form1 = new Formateur("KESKES","Taoufik",LocalDate.of(1972, 11, 26) ,"taokes@gmail.com" , "Big Data");
    var Appr1 = new Apprenant("Lenormand","Gerard",LocalDate.of(1945, 02, 9) ,"gerard@gmail.com" , "Chanson francaise" , "moyen");
    var Mod1 = new Module("Hadoop",4)
    var Note = new Note(18)
    var Evaluation =  Tuple4(Form1 ,Appr1 , Mod1, Note ) 
    var setEval =  Set(Evaluation)
    println(Evaluation._2.toString()+ " J'ai obtenu la note "+Evaluation._4.getNote() 
    +" dans le module " +  Evaluation._3.getNomModule() +" avec le coeficient " + Evaluation._3.getCoeff() +
    " qui a été enseigné par le formateur "+ Evaluation._1.getNom()  + " specialité " + Evaluation._1.getSpecialite())
    }
}
