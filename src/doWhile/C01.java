package doWhile;

public class C01 {
    /*
    While Loop ile Do-While Loop Farki
    1)While loop kullanirsaniz java once sarti kontrol eder
    sonra loop body icerisindeki kodu calistirir.
    DO-While loop kullanirsaniz, Java once loop body icersindeki kodu calistirir
    sonra sarti kontrol eder
    2)While loop kullanirsaniz loop body icerisindeki kod bazen hic caslismayabilirler.
    Fakat, do-while icindeki kod en az bir kere calisir

    NOT ===>Do-While loop oyun programi yazmak icin iyidir.
     */
    public static void main(String[] args) {
        int i=1;
        while (i<1){
            System.out.println("while loop");
        }

        //ikisinin
        // farkı

        int k=1;
        do {
            System.out.println( "do while loop");
            k++;
        }while(k<1);


    }
}
