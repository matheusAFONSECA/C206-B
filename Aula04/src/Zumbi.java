
public class Zumbi {
    // declaracao de var
    double vida;
    String nome;

    double mostraVida(){
        System.out.println(nome + ": " + vida);
        return 0;
    }

     boolean tranfereVida(Zumbi zumbialvo, double quantia){

         if(quantia > vida){
             vida -= quantia;
             zumbialvo.vida += quantia;

             return true;
         } else {
             return false;
         }
    }

}
