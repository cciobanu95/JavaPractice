import org.junit.Test;

public class StructuriAlternative {
    //Cele mai des intalnite structuri sunt cele alternative
    //Structura alternativa: If (conditie) then
    //                                     else


    @Test
    public void testAutomat() {
        verificamNumere();
        verificamNume();
        verificamNrParImpar(21);
        verificamNrParImpar(15);
        verificamNrParImpar(-8);
        verificamNrParImpar(20);
    }

    //Verificam daca 5>3
    public void verificamNumere() {
        if (5 > 3) {
            System.out.println("Primul numar este mai mare decat al doilea");
        } else {
            System.out.println("Primul numar nu este mai mare decat al doilea");
        }
    }


    //Verificam daca Alexandru contine Alex.
    public void verificamNume() {
        String nume = "Alexandru";
        String continut = "Alex";//adaugam un t sau altceva in continut=alext - returneaza - nu contine -
        if (nume.contains(continut)) {
            System.out.println("Continutul se regaseste in nume");
        } else {
            System.out.println("Continutul nu se regaseste in nume");
        }
    }





    //verificam daca un numar este par sau impar.
    public void verificamNrParImpar(Integer numar){

        if(numar%2==0){
            System.out.println("Numarul " +numar+" este par");
        }
            if(numar%2==1){
                System.out.println("Numarul " +numar+ " este impar");
            }
            if (numar>0){
                System.out.println("Numarul " +numar+ " este pozitiv");
            }
            if(numar<0) {
                System.out.println("Numarul " +numar+ " este negativ");
            }
            else{
                System.out.println("SALUUT!!");
            }
        }

        //Afisam pe consola ziua in curs

    }





