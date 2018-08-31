public class ListaSimplesSentinela<Item>{

    public No inicio;
    public int tamanho;
    



    public class No<Item>{
        
        private Item item;
        private No proximo;
        
        public No(Item item){
            this.item = item;
            this.proximo = null;
        }
    }
}