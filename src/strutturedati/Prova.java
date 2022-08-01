package strutturedati;

public class Prova {
    public static void main(String[] args) {
        Alberibinari<Integer> a = new Alberibinari<>(1);
        a.add(2);
        a.add(3);
        a.add(4);
        a.preorder();
    }
}
