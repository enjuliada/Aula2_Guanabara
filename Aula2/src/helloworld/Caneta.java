package helloworld;

public class Caneta {
    String modelo;
    String cor;
    float ponta;
    int carga;
    boolean tampada;
  
    void status(){
        System.out.println("Modelo é: " + this.modelo);
        System.out.println("Ponta: " + this.ponta);
        System.out.println("Carga: " + this.carga);
        System.out.println("A caneta é: " + this.cor);
        System.out.println("Está tampada? " + this.tampada);
    
    }
    
    //metodo 
    void rabiscar (){
        if (this.tampada == true){
            System.out.println("ERRO!");
        }else {
            System.out.println("Pode rabiscar");
    }
    }
    //metodo 
    void tampar (){
        this.tampada = true; // referencia ao proprio objeto
        
    }
    //metodo 
    void destampar (){
        this.tampada = false;
    }

}

