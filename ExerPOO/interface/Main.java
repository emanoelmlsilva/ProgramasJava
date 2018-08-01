public class Main {
    
    public static void main(String[]args){
        
        AreaCalculavel[] area = new AreaCalculavel[3];
        area[0] = new Quadrado("quadrado",4);
        area[1] = new Circulo("circulo",5);
        area[2] = new Retangulo("retangulo",7,4);

        for(int i = 0;i < area.length;i++){            
            System.out.println(area[i].getNome());
            System.out.println(area[i].calculaArea());
        }
    }
}