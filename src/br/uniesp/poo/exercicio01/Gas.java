package br.uniesp.poo.exercicio01;

public class Gas {
    private int soda = 2;
    private int gas = 0;
    public void setGas(int value){
        if(value > 0){
            gas = value;
        }
    }
    public int getSoda(){
        return soda;
    }
    public int getGas(){
        return gas;
    }

}
