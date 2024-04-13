package lemadaAugRevision;

public class P01Perent {
    public static void main(String[] args) {
        P01Inteface p01IntefaceRef01 = new P01Inteface() {
            @Override
            public void numProcess() {
                System.out.println("Override done");
            }
        };
        p01IntefaceRef01.numProcess();

        P01Inteface p01IntefaceRef02 = () -> {System.out.println("Override done" + 2 * 3);};
        p01IntefaceRef02.numProcess();

        P02Inteface SquareRef =(num)-> {return (num*num); };
        System.out.println("SquareRef -- "+ SquareRef.numProcessssssss(2));


        P02Inteface CubeRef =(num)-> {return (num*num*num); };
//        CubeRef.numProcess(2);
        System.out.println("CubeRef -- "+ CubeRef.numProcessssssss(2));


    }
}
