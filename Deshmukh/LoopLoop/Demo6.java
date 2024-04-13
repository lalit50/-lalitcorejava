package LoopLoop;

public record Demo6() {
    public static void main(String[] args) {
        // Print the number of 100,99,98.......3,2,1,0
        int a;
        for( a=100;a>=-100; a--)
        System.out.println(a);
    }
}
