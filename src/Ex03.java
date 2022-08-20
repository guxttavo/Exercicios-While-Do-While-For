/*
-->Faça um programa que leia e valide as seguintes informações:
   -Nome: maior que 3 caracteres;
   -Idade: entre 0 e 150;
   -Salário: maior que zero;
   -Sexo: 'f' ou 'm';
   -Estado Civil: 's','c','v','d';

*/

import java.util.Scanner;

public class Ex03 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        boolean infoValida = false;

        String nome;
        int idade;
        double salario;
        String sexo;
        String estadoCivil;

        do {
            System.out.println("Entre com o nome: ");
            nome = sc.next();


            if (nome.length() > 3) {
                infoValida = true;
            } else {
                System.out.println("Nome precisa ter no mínimo 3 caracteres");
            }
        } while (!infoValida);

        infoValida = false;

        do {
            System.out.println("Digite a idade: ");
            idade = sc.nextInt();

            if (idade > 0 && idade < 150) {
                infoValida = true;
            } else {
                System.out.println("Idade inválida!");
            }
        } while (!infoValida);


        infoValida = false;

        do {
            System.out.println("Digite o salário: ");
            salario = sc.nextDouble();

            if (salario > 0) {
                infoValida = true;
            } else {
                System.out.println("Salário precisa ser maior que 0!");
            }
        } while (!infoValida);


        infoValida = false;

        do {
            System.out.println("Digite o sexo: ");
            sexo = sc.next();

            if (sexo.equalsIgnoreCase("f") || sexo.equalsIgnoreCase("m")) {
                infoValida = true;
            } else {
                System.out.println("Sexo precisa ser f ou m");
            }
        } while (!infoValida);


        infoValida = false;

        do {
            System.out.println("Digite o estado civil: ");
            estadoCivil = sc.next();

            if (estadoCivil.equalsIgnoreCase("s") || estadoCivil.equalsIgnoreCase("c") || estadoCivil.equalsIgnoreCase("f") || estadoCivil.equalsIgnoreCase("d")) {
                infoValida = true;
            } else {
                System.out.println("Estado civil precisar ser 's', 'c', 'f' ou 'd' ");
            }
        } while (!infoValida);

        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Salário: " + salario);
        System.out.println("Sexo: " + sexo);
        System.out.println("Estado Civil: " + estadoCivil);


    }
}
