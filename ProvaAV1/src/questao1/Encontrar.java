package questao1;

import questao1.AchadoPerdido;

//Prova de Luan Maxwell R.A = 12118287
public class Encontrar {
    public static void main(String[] args) {

        Usuario usuario = new Usuario("Luan Maxwell", "luanmaxwell25@gmail.com", "admin123");
        AchadoPerdido ap = new AchadoPerdido("CTPS", "Azul", "CLT Brasil", "Encontrado");
        ap.completaDados("Full hd lindão","Newton Paiva", "12h");

        AchadoPerdido ap1 = new AchadoPerdido("CTPS", "Azul", "Full hd lindão", "CLT Brasil", "Newton Paiva", "12h" ,"Encontrado");

        System.out.println(ap1.buscarTitulo("Luan Maxwell"));
        ap1.visualizarDetalhes();
    }
}