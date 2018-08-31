import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;

public class Djikstra{
    
    public static void main(String[]args){            
        Scanner leitor = new Scanner(System.in);
        Pilha<Integer> valores = new Pilha(10);
        Pilha<Character> operadores = new Pilha(10);           
        int total = 0;
        int objetoNaLista = 0;
       
        String campoTexto = leitor.nextLine();                     
        
        while(objetoNaLista < campoTexto.length()){            
            char proxima = campoTexto.charAt(objetoNaLista);
            int intProxima = proxima - 48;                
            if(proxima != '('){                     
                if(proxima == '-' || proxima == '+' || proxima == '*' || proxima == '/'){
                    operadores.push(proxima);                                       
                }else if(proxima == ')'){                             
                    switch(operadores.pop()){
                        case '-':
                           total = valores.pop() - valores.pop();                                                          
                           break;
                        case '+':                          
                            total = (valores.pop() + valores.pop());                                                                
                            break;       
                        case '*':
                            total = (valores.pop() * valores.pop());                                                             
                            break; 
                        case '/':
                            total = (valores.pop() / valores.pop());                               
                            break;             
                    }                                                    
                    valores.push(total);                        
                }else if(Character.isDigit(proxima)){                    
                    valores.push(intProxima);
                }     
            }            
            objetoNaLista++;                       
        }
    System.out.println("resultado final "+total); 
        
    }
}