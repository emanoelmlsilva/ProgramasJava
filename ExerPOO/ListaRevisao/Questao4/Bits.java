public class Bits{
        
    private byte[] arrayBit;

    public Bits(byte tamanho){
        this.arrayBit = new byte[tamanho];        
    }

    public byte acessaBit(int index){
        if(index < this.arrayBit.length) return this.arrayBit[index]; 
        
        return -1;
    }    
    
    public void modificaValorBit(int index,byte valor){
        if(index < this.arrayBit.length){
            arrayBit[index] = valor;
        }
    }

    public boolean equals(Bits bit){        
        if(this.arrayBit.length == bit.getArrayBit().length){                               
            for(int i = 0;i < this.arrayBit.length;i++){                              
                if((this.arrayBit[i] != bit.getArrayBit()[i])){                    
                    return false;
                }
            }            
            return true;
        }        
        return false;
    }

    public byte[] NOT(){
        byte[] arrayBitNOT = new byte[this.arrayBit.length];        
            for(int i = 0;i < this.arrayBit.length;i++){
                if(this.arrayBit[i] == 0){
                    arrayBitNOT[i] = 1;
                }else{
                    arrayBitNOT[i] = 0;
                }
            }
            return arrayBitNOT;        
    }

    public byte[] OR(Bits bit){
        byte[] arrayBitOR = new byte[this.arrayBit.length];        
        if(this.arrayBit.length == bit.arrayBit.length){
            for(int i = 0;i < this.arrayBit.length;i++){                            
                if(!(this.arrayBit[i] == bit.arrayBit[i] && this.arrayBit[i] == 0 && bit.arrayBit[i] == 0)){                    
                    arrayBitOR[i] = 1;
                }
            } 
            return arrayBitOR;           
        }else{
            return null;        
        }              
    }
    
    public byte[] AND(Bits bit){
        byte[] arrayBitAnd = new byte[this.arrayBit.length];
        String bitAnd = "";
        if(this.arrayBit.length == bit.arrayBit.length){
            for(int i = 0;i < this.arrayBit.length;i++){            
                if(this.arrayBit[i] == bit.arrayBit[i] && this.arrayBit[i] == 1) arrayBitAnd[i] = 1;                                   
            }
            return arrayBitAnd;                
        }else{
            return null;            
        }                           
    }

    public String toString(){
        String bit = "";
        for(int arrayBits:this.arrayBit){
            bit += arrayBits;
        }
        return "array de bits "+bit;
    }

    public byte[] getArrayBit(){
        return this.arrayBit;
    }

    public void setArrayBit(byte[] arrayBit){
        this.arrayBit = arrayBit;
    }
}
