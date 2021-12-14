import org.junit.Test;

public class StructuriRepetitive {

    //Cele mai intalnite structuri repetitive sunt FOR si WHILE.



    @Test
    public void testAutomat (){
        afisamNumereFor(20);
        afisamNumereWhile(100);

    }

    //Afisam primele 50 de nr
    public void afisamNumereFor(Integer limit){
        for (Integer index=0;index<limit+1;index=index++){
            System.out.print(index+" ");
        }

    }
    //Afisam primele 50 de numele -WHILE
    public void afisamNumereWhile(Integer limit){
        Integer index=0;
        while (index<limit+1){
            System.out.print(index+" ");
            index=index++;
        }
    }
}
