package questao2;

import javax.swing.*;
import java.util.Scanner;


//Prova de Luan Maxwell R.A = 12118287

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String nomeProjeto, descricao, endereco, dataInicio, dataFim, descricaoAlimento, tipoTrabalho;
        int escolha, duracaoTrabalho;
        float qtde;

        System.out.println("Em qual opção você deseja se voluntariar? ");
        System.out.println("1: Distribuição de Alimentos \n2: Trabalho Voluntário \n3: sair");

        escolha = sc.nextInt();

        if(escolha == 1){
            System.out.println("Qual o nome do projeto? ");
            sc.nextLine();
            nomeProjeto = sc.nextLine();
            System.out.println("Qual a descrição do projeto?");
            descricao = sc.nextLine();
            System.out.println("Qual o endereço do projeto?");
            endereco = sc.nextLine();
            System.out.println("Qual a data de início do projeto?");
            dataInicio = sc.nextLine();
            System.out.println("Qual a data de fim do projeto?");
            dataFim = sc.nextLine();
            System.out.println("Qual a descrição dos alimentos do projeto?");
            descricaoAlimento = sc.nextLine();
            System.out.println("Qual a quantidade de alimentos do projeto?");
            qtde = sc.nextFloat();

            DistribuicaoAlimento da = new DistribuicaoAlimento(nomeProjeto, descricao, endereco, dataInicio, dataFim, descricaoAlimento, qtde);

            System.out.println(da.imprimeProjeto());

        }
        else if(escolha == 2){
            System.out.println("Qual o nome do projeto? ");
            sc.nextLine();
            nomeProjeto = sc.nextLine();
            System.out.println("Qual a descrição do projeto?");
            descricao = sc.nextLine();
            System.out.println("Qual o endereço do projeto?");
            endereco = sc.nextLine();
            System.out.println("Qual a data de início do projeto?");
            dataInicio = sc.nextLine();
            System.out.println("Qual a data de fim do projeto?");
            dataFim = sc.nextLine();
            System.out.println("Qual o tipo de trabalho do projeto?");
            tipoTrabalho = sc.nextLine();
            System.out.println("Qual a duração do projeto?");
            duracaoTrabalho = sc.nextInt();

            TrabalhoVoluntario tv = new TrabalhoVoluntario(nomeProjeto, descricao, endereco, dataInicio, dataFim, tipoTrabalho, duracaoTrabalho);

            System.out.println(tv.imprimeProjeto());

        }
        else{
            System.out.println("Você decidiu sair. Programa finalizado!");
        }

        sc.close();
    }
}
