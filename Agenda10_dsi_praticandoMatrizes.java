package agenda10_dsi_praticandomatrizes;

import javax.swing.JOptionPane;

public class Agenda10_dsi_praticandoMatrizes {

    public static void main(String[] args) {
        // declaração de variáveis
        double notas[][] = new double[10][4];
        int linha, coluna;
        double media = 0;
        
        //entrada
        JOptionPane.showMessageDialog(null, "Inserindo os dados na Matriz:");
        for (linha = 0; linha < 10; linha++) {
            for (coluna = 0; coluna < 3; coluna++) {
                notas[linha][coluna] = Double.parseDouble(JOptionPane.showInputDialog("Insira a nota do " + (linha + 1) + "º aluno"));
            } // fim for coluna
        } // fim for linha
        
        // calculando a média
        for (linha = 0; linha < 10; linha++) {
            for (coluna = 0; coluna < 3; coluna++) { 
                media = media + notas[linha][coluna];
           } // fim for coluna
            notas[linha][3] = media / 3; 
           // tornando a média = 0 novamente para iniciar o cálculo para o próximo aluno
           media = 0;
        } // fim for linha
            
        //saída de dados
        JOptionPane.showMessageDialog(null, "Exibindo as notas:");
        for (linha = 0; linha < 10; linha++) {
            for (coluna = 0; coluna < 3; coluna++) {  
            JOptionPane.showMessageDialog(null, "Aluno: " + (linha + 1) + "\nProva n°. " + (coluna + 1) + "\nNota: " + notas[linha][coluna]); // opção que exbe as notas uma a uma
            } // fim for coluna
            //exibindo as médias
            JOptionPane.showMessageDialog(null, "Média: " + notas[linha][3]); 
        } // fim for linha                
        
    } // fim main
        
} // fim class
