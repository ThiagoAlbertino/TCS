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
public class Carro extends Veiculos implements Acoes{
    
    public Carro(){
        this.marca = "Ford";
        this.modelo = "Ecosport";
        this.cor = "Branca";
        this.placa = "ABC-1234";
        this.eixos = 2;    
        this.rodas = 4;
    }
    
    void CaracteristicasCarro(){
        System.out.println("Marca do carro: " + this.marca);
        System.out.println("Modelo do carro: " + this.modelo);
        System.out.println("Cor do carro: " + this.cor);
        System.out.println("Placa do carro: " + this.placa);
        System.out.println("O carro possui: " + this.eixos + " eixos");
        System.out.println("O carro possui: " + this.rodas + " rodas");
    }

    @Override
    public void Ligar(){
        this.ligado = true;
        
        if(this.ligado == true){
            this.desligado = false;
            System.out.println("");
            System.out.println(" -~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~- ");
            System.out.println("");
            System.out.println("Ligando o carro.......");
            System.out.println("");
            System.out.print("O carro agora está ligado - ");
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
            System.out.println("Desligando o carro.....");
            System.out.print("O carro agora está desligado - ");
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
                System.out.println("O carro está sem gasolina!!");
                System.out.println("");
                System.out.println("Abastecendo.....");
                System.out.println("");
                System.out.println("Pronto, o tanque foi reabastecido!");
            }else{
                System.out.println("");
            System.out.println(" -~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~- ");
            System.out.println("");
                System.out.println("O carro ainda está com gasolina!!");
                System.out.println("Você ainda pode acelerar tranquilamente!");
            }
        }else{
            System.out.println("");
            System.out.println(" -~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~- ");
            System.out.println("");
            System.out.println("O carro está ligado, por favor desligue-o para abastercer");
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
            System.out.println("Trocando o pneu furado do carro, aguarde!");
            System.out.println("");
            System.out.println("Trocando pneu.......");
            this.pneu_furado = false;
            System.out.println("");
            System.out.println("Pronto, o pneu furado já foi trocado por um pneu novo!");
        }else{
            System.out.println("");
            System.out.println(" -~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~- ");
            System.out.println("");
            System.out.println("O pneu do carro não está furado!");
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
            System.out.println("O carro está desligado, por favor ligue-o para poder acelerar!");
        }
        
        Random random = new Random(); 
        this.gasolina = random.nextBoolean();
    }
}
