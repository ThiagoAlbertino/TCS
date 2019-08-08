/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package veiculos;

/**
 *
 * @author thiag
 */
public abstract class Veiculos implements Acoes{
    protected String marca;
    protected String modelo;
    protected String placa;
    protected String cor;
    protected int eixos;
    protected int rodas;
    
    protected boolean pneu_furado;
    protected boolean gasolina;
    protected boolean ligado;
    protected boolean desligado;
    
    

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public int getEixos() {
        return eixos;
    }

    public void setEixos(int eixos) {
        this.eixos = eixos;
    }

    public int getRodas() {
        return rodas;
    }

    public void setRodas(int rodas) {
        this.rodas = rodas;
    }

    public boolean isPneu_furado() {
        return pneu_furado;
    }

    public void setPneu_furado(boolean pneu_furado) {
        this.pneu_furado = pneu_furado;
    }

    public boolean isGasolina() {
        return gasolina;
    }

    public void setGasolina(boolean gasolina) {
        this.gasolina = gasolina;
    }

    public boolean isLigado() {
        return ligado;
    }

    public void setLigado(boolean ligado) {
        this.ligado = ligado;
    }

    public boolean isDesligado() {
        return desligado;
    }

    public void setDesligado(boolean desligado) {
        this.desligado = desligado;
    }
    
    
}
