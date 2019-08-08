/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package veiculos;
import java.util.Scanner;
/**
 *
 * @author thiag
 */
public class Projeto {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Caminhao caminhao = new Caminhao();   
        Carro carro = new Carro();   
        Moto moto = new Moto();   
        
        System.out.println("Digite o número do veículo que você quer saber mais informações!");
        System.out.println("1 - Caminhão");
        System.out.println("2 - Carro");
        System.out.println("3 - Moto");
        System.out.println("0 - Sair do menu");
        Scanner aux = new Scanner(System.in); 
        int tipo = aux.nextInt();
        
        System.out.println("");
        System.out.println(" -~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~- ");
        System.out.println("");
        
        switch (tipo) {
            case 1:
                
                System.out.println("Você escolheu - Caminhão");
                System.out.println("Essas são as características do caminhão!!");
                System.out.println("");
                caminhao.CaracteristicasCaminhao();
                
                System.out.println("");
                System.out.println(" -~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~- ");
                System.out.println("");
                System.out.println("Que ação deseja fazer com o caminhão?");
                
                while(true){
                    System.out.println("");
                    System.out.println(" -~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~- ");
                    System.out.println("");
                    System.out.println("1 - Ligar");
                    System.out.println("2 - Acelerar ");
                    System.out.println("3 - Abastecer");
                    System.out.println("4 - Trocar pneu");
                    System.out.println("5 - Desligar");
                    System.out.println("0 - Sair do menu");

                    Scanner c = new Scanner(System.in); 
                    int x = c.nextInt();
                
                
                    if(x == 1){
                        caminhao.Ligar();               
                    }else if(x == 2){
                        caminhao.Acelerar();
                    }else if(x == 3){
                        caminhao.Abastecer();
                    }else if(x == 4){
                        caminhao.TrocarPneu();
                    }else if(x == 5){
                        caminhao.Desligar();
                    }else{
                        System.out.println("Tchau!!");
                        break;
                    } 
                }
 
                break;
            case 2:
                
                System.out.println("Você escolheu - Carro");
                System.out.println("Essas são as características do carro!!");
                System.out.println("");
                carro.CaracteristicasCarro();
                
                System.out.println("");
                System.out.println(" -~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~- ");
                System.out.println("");
                System.out.println("Que ação deseja fazer com o carro?");
                
                while(true){
                    System.out.println("");
                    System.out.println(" -~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~- ");
                    System.out.println("");
                    System.out.println("1 - Ligar");
                    System.out.println("2 - Acelerar ");
                    System.out.println("3 - Abastecer");
                    System.out.println("4 - Trocar pneu");
                    System.out.println("5 - Desligar");
                    System.out.println("0 - Sair do menu");

                    Scanner c = new Scanner(System.in); 
                    int x = c.nextInt();
                
                
                    if(x == 1){
                        carro.Ligar();               
                    }else if(x == 2){
                        carro.Acelerar();
                    }else if(x == 3){
                        carro.Abastecer();
                    }else if(x == 4){
                        carro.TrocarPneu();
                    }else if(x == 5){
                        carro.Desligar();
                    }else{
                        System.out.println("Tchau!!");
                        break;
                    } 
                }
 
                break;
            case 3:
                
                System.out.println("Você escolheu - Moto");
                System.out.println("Essas são as características da moto!!");
                System.out.println("");
                moto.CaracteristicasMoto();
                
                System.out.println("");
                System.out.println(" -~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~- ");
                System.out.println("");
                System.out.println("Que ação deseja fazer com a moto?");
                
                while(true){
                    System.out.println("");
                    System.out.println(" -~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~- ");
                    System.out.println("");
                    System.out.println("1 - Ligar");
                    System.out.println("2 - Acelerar ");
                    System.out.println("3 - Abastecer");
                    System.out.println("4 - Trocar pneu");
                    System.out.println("5 - Desligar");
                    System.out.println("0 - Sair do menu");

                    Scanner c = new Scanner(System.in); 
                    int x = c.nextInt();
                
                
                    if(x == 1){
                        moto.Ligar();               
                    }else if(x == 2){
                        moto.Acelerar();
                    }else if(x == 3){
                        moto.Abastecer();
                    }else if(x == 4){
                        moto.TrocarPneu();
                    }else if(x == 5){
                        moto.Desligar();
                    }else{
                        System.out.println("Tchau!!");
                        break;
                    } 
                }
                break;
            default:
                 System.out.println("Tchau!");
         }
    }
    
}
