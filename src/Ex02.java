/*
-->Faça um programa que leia um nome de usuário e a sua senha e não aceite a senha igual ao nome
   do usuário, mostrando uma mensagem de erro e continue a pedir as informações.
*/

import java.util.Scanner;

public class Ex02 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        boolean infoValidas = false;
        String nomeUser;
        String senha;

        do {
            System.out.println("Entre com o nome do usuário: ");
            nomeUser = sc.next();

            System.out.println("Entre com a senha: ");
            senha = sc.next();

            if (nomeUser.equalsIgnoreCase(senha)) {
                System.out.println("Senha igual a usuário, digite novamente!");
            } else {
                infoValidas = true;
                System.out.println("Senha e usuários válidos!");

            }

        } while (!infoValidas);


    }
}
