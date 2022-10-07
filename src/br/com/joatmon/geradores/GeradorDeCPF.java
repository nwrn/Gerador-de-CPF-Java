package br.com.joatmon.geradores;

import java.util.Random;

public class GeradorDeCPF {
    public static void main(String[] args) {
        String cpf = "";
        Random random = new Random();
        for(int i=0; i<11; i++){
            int randomInt = random.nextInt(9);
            cpf += randomInt;
            if(i==2 || i==5){
                cpf += ".";
            }
            else if(i==8){
                cpf += "-";
            }
        }

        System.out.println(cpf);

    }
}
