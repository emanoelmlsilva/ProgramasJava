public class testePilha{
    public static void main(String[]args){
        Pilha<Integer> teste = new Pilha();
        teste.push(3);
        System.out.println(teste.pop());
        teste.push(2);
        teste.push(8);
        System.out.println(teste.pop());
        System.out.println(teste.pop());
        teste.push(9);
        teste.push(1);
        System.out.println(teste.pop());
        teste.push(7);
        teste.push(6);
        System.out.println(teste.pop());
        System.out.println(teste.pop());
        teste.push(4);
        System.out.println(teste.pop());
        System.out.println(teste.pop());
    }
}