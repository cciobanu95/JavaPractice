import org.junit.Test;

public class Variabile_Metode {

    // clasa, variabila, metoda, constructor, obiect
    // 1.clasa= un sablon ce contine variabile, metode, constructor, obiect.
    // 2.variabila= atributul unei clase.
    // 3.metoda= actiunile unei clase.
    // 1.structura clasa= access control class nume clasa {} ( variabile_metode, exemplu)
    // 1.Un fisier JAVA poate sa contina ai multe clase.
    // 1.Numele clasei trebuie sa fie UNIC.
    // 2.Tipuri variabile: global si local.
    // 2.Variabila GLOBALA= este vizibila peste tot in clasa declarata.
    // 2.Structura variabila GLOBALA= access control tip variabila nume variabila;
    // 2.O variabila poate sau nu sa primeasca o valoare.
    // 2.Structura variabila LOCALA= se declara cu tip de variabila, nume.
    //EXEMPLU: declaram variabile in interiorul clasei
    // 3.Tipuri Metode= void, return.
    // 3.In JAVA exista doar METODE (declarate in interiorul unei clase), nu si functii.
    // 3.Metodele pot avea sau nu parametrii.
    // 3. STRUCTURA METODA VOID= access control void nume metoda(){}
    public String nume;
    public String prenume;
    public Integer varsta;
    public Double inaltime;
    public String adresa;
    public Boolean esteAngajat;
    public Double greutate;


    @Test
    public void atribuiValori() {
        nume = "Ciobanu";
        prenume = "Claudia";
        varsta = 26;
        inaltime = 1.70;
        adresa = "Cucului Rasarit NR. 14";
        esteAngajat = true;
        greutate = 52.70;

        System.out.print(nume + " ");
        System.out.print(prenume);
        System.out.println(" " + esteAngajat + " ");

        System.out.println(varsta + " " + inaltime + " " + adresa);


        //Afisati pe tastatura mesajul:Cursantul <nume> <prenume> a trimis proiectul la Manual.

        System.out.println("Cursantul " + nume + " " + prenume + " a trimis proiectul la Manual.");
        System.out.println(greutate);
        // Definim cate zecimale sa ne afiseze pentru o valoare cu punct.
        System.out.println(String.format("%.2f", greutate));
    }
}
