package Protected;

public class Teatru {
    public void habarNamDoi(){
        Voluntar Ghita = new Voluntar(nume:"Gherasim", prenume:"Avram");
        Ghita.metodaPublica();
        Ghita.metodaProtected();
        Ghita.metodaDefault();
    }
}
