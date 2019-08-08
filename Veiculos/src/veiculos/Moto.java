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
public class Moto extends Veiculos implements Acoes{
    
    public Moto(){
        this.marca = "Honda";
        this.modelo = "Bros";
        this.cor = "Vermelha";
        this.placa = "ABC-1234";
        this.eixos = 2;    
        this.rodas = 2;
    }
    
    void CaracteristicasMoto(){
        System.out.println("Marca da moto: " + this.marca);
        System.out.println("Modelo da moto: " + this.modelo);
        System.out.println("Cor da moto: " + this.cor);
        System.out.println("Placa da moto: " + this.placa);
        System.out.println("A moto possui: " + this.eixos + " eixos");
        System.out.println("A moto possui: " + this.rodas + " rodas");
    }

    @Override
    public void Ligar(){
        this.ligado = true;
        
        if(this.ligado == true){
            this.desligado = false;
            System.out.println("");
            System.out.println(" -~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~- ");
            System.out.println("");
            System.out.println("Ligando a moto.......");
            System.out.println("");
            System.out.print("A moto agora está ligada - ");
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
            System.out.println("Desligando a moto.....");
            System.out.print("A moto agora está desligada - ");
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
                System.out.println("A moto está sem gasolina!!");
                System.out.println("");
                System.out.println("Abastecendo.....");
                System.out.println("");
                System.out.println("Pronto, o tanque foi reabastecido!");
            }else{
                System.out.println("");
            System.out.println(" -~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~- ");
            System.out.println("");
                System.out.println("A moto ainda está com gasolina!!");
                System.out.println("Você ainda pode acelerar tranquilamente!");
            }
        }else{
            System.out.println("");
            System.out.println(" -~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~- ");
            System.out.println("");
            System.out.println("A moto está ligada, por favor desligue-a para abastercer");
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
            System.out.println("Trocando o pneu furado da moto, aguarde!");
            System.out.println("");
            System.out.println("Trocando pneu.......");
            this.pneu_furado = false;
            System.out.println("");
            System.out.println("Pronto, o pneu furado já foi trocado por um pneu novo!");
        }else{
            System.out.println("");
            System.out.println(" -~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~- ");
            System.out.println("");
            System.out.println("O pneu da moto não está furado!");
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
            System.out.println("A moto está desligada, por favor ligue-a para poder acelerar!");
        }
        
        Random random = new Random(); 
        this.gasolina = random.nextBoolean();
    }
}
