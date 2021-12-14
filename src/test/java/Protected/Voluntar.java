package Protected;

public class Voluntar {
    //protected= vizibil in clasa parinte + clasa copil, chiar dacase afla in pachete diferite
    // DEFAULT= vizibil in clasa parinte + clasa copil cu conditia sa fie si in interiorul pachetului
    //protected= vizibil in momentul in care declaram un obiect intr-o alta clasa (din acelasi pachet)
    //protected= nu ese vizibil in momentul in care declaram un obiect intr-o alta clasa dintr-un  pachet diferit
    //DEFAULT= vizibil in momentul in care declaram un obiect intr-o alta clasa (din acelasi pachet)
    //DEFAULT= nu ese vizibil in momentul in care declaram un obiect intr-o alta clasa dintr-un  pachet diferit

    public String nume;
    public String prenume;

    public Voluntar (String nume, String prenume){
        this.nume= nume;
        this.prenume= prenume;
    }
    public void metodaPublica(){
        System.out.println("Public");
    }
    private void metodaPrivata(){
        System.out.println("Privat");
    }
    protected void metodaProtected(){
        System.out.print("Protejat");
    }
    void metodaDefault(){
        System.out.print("Implicit");
    }
}
