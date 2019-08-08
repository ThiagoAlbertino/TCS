/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package veiculos;

import java.util.Random;

/**
 *
 * @author thiag
 */
public class Caminhao extends Veiculos implements Acoes{
    
    public Caminhao(){
        this.marca = "Scania";
        this.modelo = "Streamline Griffin Edition";
        this.cor = "preto";
        this.placa = "ABC-1234";
        this.eixos = 3;    
        this.rodas = 10;
    }
    
    @Override
    public void Ligar(){
        this.ligado = true;
        
        if(this.ligado == true){
            this.desligado = false;
            System.out.println("");
            System.out.println(" -~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~- ");
            System.out.println("");
            System.out.println("Ligando o caminhão.......");
            System.out.println("");
            System.out.print("O caminhão agora está ligado - ");
            System.out.println("Ligado: " + this.ligado);
            System.out.println("");
            System.out.println("Você já pode acelerar a vontade");
        }        
    }
    
    @Override
    public void Desligar(){
        this.desligado = true;
        
        if(this.desligado == true){
            this.ligado = false;
            System.out.println("");
            System.out.println(" -~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~- ");
            System.out.println("");
            System.out.println("Desligando o caminhão.....");
            System.out.print("O caminhão agora está desligado - ");
            System.out.println("Desligado: " + this.desligado);
        }     
    }
    
    @Override
    public void Abastecer(){
        if(this.ligado == false){
            if(this.gasolina == false){
                System.out.println("");
            System.out.println(" -~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~- ");
            System.out.println("");
                System.out.println("O caminhão está sem gasolina!!");
                System.out.println("");
                System.out.println("Abastecendo.....");
                System.out.println("");
                System.out.println("Pronto, o tanque foi reabastecido!");
            }else{
                System.out.println("");
            System.out.println(" -~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~- ");
            System.out.println("");
                System.out.println("O caminhão ainda está com gasolina!!");
                System.out.println("Você ainda pode acelerar tranquilamente!");
            }
        }else{
            System.out.println("");
            System.out.println(" -~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~- ");
            System.out.println("");
            System.out.println("O caminhão está ligado, por favor desligue-o para abastercer");
        }
    }
    
    @Override
    public void TrocarPneu(){
        
        Random random = new Random(); 
        this.pneu_furado = random.nextBoolean();
        
        if(this.pneu_furado == true){
            System.out.println("");
            System.out.println(" -~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~- ");
            System.out.println("");
            System.out.println("Trocando o pneu furado do caminhão, aguarde!");
            System.out.println("");
            System.out.println("Trocando pneu.......");
            this.pneu_furado = false;
            System.out.println("");
            System.out.println("Pronto, o pneu furado já foi trocado por um pneu novo!");
        }else{
            System.out.println("");
            System.out.println(" -~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~- ");
            System.out.println("");
            System.out.println("O pneu do caminhão não está furado!");
            System.out.println("");
            System.out.println("Você ainda pode acelerar tranquilamente!");
        }
    }
        
    @Override
    public void Acelerar(){        
        if(this.ligado == true && this.desligado == false){
            System.out.println("");
            System.out.println(" -~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~- ");
            System.out.println("");
            System.out.println("Acelerando.....");
        }else{
            System.out.println("");
            System.out.println(" -~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~- ");
            System.out.println("");
            System.out.println("O caminhão está desligado, por favor ligue-o para poder acelerar!");
        }
        
        Random random = new Random(); 
        this.gasolina = random.nextBoolean();
    }
    
    void CaracteristicasCaminhao(){
        System.out.println("Marca do caminhão: " + this.marca);
        System.out.println("Modelo do caminhão: " + this.modelo);
        System.out.println("Cor do caminhão: " + this.cor);
        System.out.println("Placa do caminhão: " + this.placa);
        System.out.println("O caminhão possui: " + this.eixos + " eixos");
        System.out.println("O caminhão possui: " + this.rodas + " rodas");
    }    
}
