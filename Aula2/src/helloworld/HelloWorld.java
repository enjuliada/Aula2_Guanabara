package helloworld;

public class HelloWorld {

    public static void main(String[] args) {
       
        Caneta c1 = new Caneta (); //instanciado caneta c1
            c1.cor = "Azul"; // referencia a atributo
            c1.ponta = 0.5f;
                        
            c1.tampar();
            c1.rabiscar();
            c1.status(); // referencia a um método
                
         Caneta c2 = new Caneta();
            c2.modelo = "Hostenet";
            c2.cor = "Preta";
            
            c2.destampar();
            c2.rabiscar();
            c2.status();
    }       
    
}
