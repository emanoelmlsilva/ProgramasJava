public class Main{
   public static void main(String[]args){    
        Bits b = new Bits((byte)4);
        Bits b2 = new Bits((byte)4);
        b.modificaValorBit(0,(byte)1);
        b.modificaValorBit(1,(byte)1);
        b.modificaValorBit(2,(byte)1);        
        b2.modificaValorBit(0,(byte)1);
        b2.modificaValorBit(1,(byte)1);        
        b2.modificaValorBit(3,(byte)1); 
        System.out.println("b "+b.toString());                
        System.out.println("b2 "+b2.toString());                
        b.setArrayBit(b.OR(b2));
        System.out.println("b or b2 "+b.toString());  
        b.setArrayBit(b.NOT());
        System.out.println("b not "+b.toString());  
        b.setArrayBit(b.AND(b2));
        System.out.println("b2 "+b2.toString());                
        System.out.println("b and b2 "+b.toString());  
        System.out.println("b == b2 "+b.equals(b2));
        System.out.println("b "+b.toString());                
   }
}