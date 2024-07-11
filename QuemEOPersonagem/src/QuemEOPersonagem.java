import java.util.*;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class QuemEOPersonagem {
public static int randomer(int x){
    Random rand = new Random(x);
    return rand.nextInt(5);
} 

public static  String tela(String [] vetor1, String []vetor2, String [] vetor3, String [] vetor4, String [] vetor5){
    String[] vetorAux1 = new String [3];
    String[] vetorAux2 = new String [3];
    String[] vetorAux3 = new String [3];
    String[] vetorAux4 = new String [3];
    String[] vetorAux5 = new String [3];
    vetorAux1[0] = vetor1[1];
    vetorAux1[1] = vetor1[2];
    vetorAux1[2] = vetor1[3];

    vetorAux2[0] = vetor2[1];
    vetorAux2[1] = vetor2[2];
    vetorAux2[2] = vetor2[3];

    vetorAux3[0] = vetor3[1];
    vetorAux3[1] = vetor3[2];
    vetorAux3[2] = vetor3[3];

    vetorAux4[0] = vetor4[1];
    vetorAux4[1] = vetor4[2];
    vetorAux4[2] = vetor4[3];

    vetorAux5[0] = vetor5[1];
    vetorAux5[1] = vetor5[2];
    vetorAux5[2] = vetor5[3];
    
    ImageIcon icon = new ImageIcon("imagens/zenitsu.png");
    ImageIcon icon1 = new ImageIcon("imagens/nezuko.png");
    ImageIcon icon2 = new ImageIcon("imagens/inosuke.png");
    ImageIcon icon3 = new ImageIcon("imagens/tanjiro.png");
    ImageIcon icon4 = new ImageIcon("imagens/tomioka.png"); 

    String opcaoEscolhida1 = (String) JOptionPane.showInputDialog(null, vetor1[0], "Questão", JOptionPane.QUESTION_MESSAGE, icon, vetorAux1, vetorAux1[0]);
    String opcaoEscolhida2 = (String) JOptionPane.showInputDialog(null, vetor2[0], "Questão", JOptionPane.QUESTION_MESSAGE, icon1, vetorAux2, vetorAux2[0]);
    String opcaoEscolhida3 = (String) JOptionPane.showInputDialog(null, vetor3[0], "Questão", JOptionPane.QUESTION_MESSAGE, icon2, vetorAux3, vetorAux3[0]);
    String opcaoEscolhida4 = (String) JOptionPane.showInputDialog(null, vetor4[0], "Questão", JOptionPane.QUESTION_MESSAGE, icon3, vetorAux4, vetorAux4[0]);
    String opcaoEscolhida5 = (String) JOptionPane.showInputDialog(null, vetor5[0], "Questão", JOptionPane.QUESTION_MESSAGE, icon4, vetorAux5, vetorAux5[0]);
    
    return opcaoEscolhida1 + "," + opcaoEscolhida2 + "," + opcaoEscolhida3 + "," + opcaoEscolhida4 + "," + opcaoEscolhida5; 
}

public static void vetor(String [][] matriz){
    String[] vetor1 = new String[5];
    String[] vetor2 = new String[5];
    String[] vetor3 = new String[5];
    String[] vetor4 = new String[5];
    String[] vetor5 = new String[5];
    int index = 0;
    int aleatorio;
    int acertos = 0;

    //for (int i = 0; i < 3; i++) {
    //aleatorio = randomer(index);
    vetor1[0] = matriz[0][0];
    vetor1[1] = matriz[0][1];
    vetor1[2] = matriz[0][2];
    vetor1[3] = matriz[0][3];
    vetor1[4] = matriz[0][4];

    vetor2[0] = matriz[1][0];
    vetor2[1] = matriz[1][1];
    vetor2[2] = matriz[1][2];
    vetor2[3] = matriz[1][3];
    vetor2[4] = matriz[1][4];

    vetor3[0] = matriz[2][0];
    vetor3[1] = matriz[2][1];
    vetor3[2] = matriz[2][2];
    vetor3[3] = matriz[2][3];
    vetor3[4] = matriz[2][4];

    vetor4[0] = matriz[3][0];
    vetor4[1] = matriz[3][1];
    vetor4[2] = matriz[3][2];
    vetor4[3] = matriz[3][3];
    vetor4[4] = matriz[3][4];

    vetor5[0] = matriz[4][0];
    vetor5[1] = matriz[4][1];
    vetor5[2] = matriz[4][2];
    vetor5[3] = matriz[4][3];
    vetor5[4] = matriz[4][4];
    //String letraEscolhida;
    String[] resposta = tela(vetor1, vetor2, vetor3, vetor4, vetor5).split(",");
    
    if(vetor1[4].charAt(0) == resposta[0].charAt(0)){
        acertos++;
    }
    if(vetor2[4].charAt(0) == resposta[1].charAt(0)){
        acertos++;
    }
    if(vetor3[4].charAt(0) == resposta[2].charAt(0)){
        acertos++;
    }
    if(vetor4[4].charAt(0) == resposta[3].charAt(0)){
        acertos++;
    }
    if(vetor5[4].charAt(0) == resposta[4].charAt(0)){
        acertos++;
    }
//}
    JOptionPane.showMessageDialog(null, "Você Acertou "+ acertos+ " personagens");
}

public static void matrizJogo(){
    String [][] matriz = new String[5][5];

    matriz[0][0] = "Quem e este  personagem?";
    matriz[0][1] = "A) Nezuko";
    matriz[0][2] = "B) Zenitsu";
    matriz[0][3] = "C) Inosuke";
    matriz[0][4] = "B) Zenitsu";
    
    matriz[1][0] = "Quem e este personagem?";
    matriz[1][1] = "A) Tanjiro";
    matriz[1][2] = "B) Zenitsu";
    matriz[1][3] = "C) Nezuko";
    matriz[1][4] = "C) Nezuko";

    matriz[2][0] = "Quem e este personagem?";
    matriz[2][1] = "A) Nezuko";
    matriz[2][2] = "B) Zenitsu";
    matriz[2][3] = "C) Inosuke";
    matriz[2][4] = "C) Inosuke";

    matriz[3][0] = "Quem e este personagem?";
    matriz[3][1] = "A) Nezuko";
    matriz[3][2] = "B) Tanjiro";
    matriz[3][3] = "C) Inosuke";
    matriz[3][4] = "B) Tanjiro";

    matriz[4][0] = "Quem e este personagem?";
    matriz[4][1] = "A) Nezuko";
    matriz[4][2] = "B) Tanjiro";
    matriz[4][3] = "C) Tomioka";
    matriz[4][4] = "C) Tomioka";

    vetor(matriz);
}

    public static void inicio(){
    Scanner entrada = new Scanner(System.in);
    System.out.println("--------------------------------------------------");
    System.out.println("\tBem vindo ao jogo Quem é este personagem");
    System.out.println("--------------------------------------------------");
    System.out.println("Pronto para comecar ?(Y/N)");
    String resposta= entrada.nextLine();

    if(resposta.equalsIgnoreCase("y")){
        matrizJogo(); 
    }else {
        System.out.println("Nos vemos no proximo jogo !!");
    }
    
}
    
    public static void main(String[] args) throws Exception {
    inicio();
    }
}
