package jogo1;

public class Main {
    public static void main(String[] args) {
        Tabuleiro tabuleiro = new Tabuleiro();
        Peca rei = new Rei(0, 0);
        Peca rainha = new Rainha(1, 1);
        Peca bispo = new Bispo(2, 2);
        Peca cavalo = new Cavalo(3, 3);
        Peca torre = new Torre(4, 4);
        Peca peao = new Peao(6, 6);

        tabuleiro.adicionarPeca(rei, 0, 0);
        tabuleiro.adicionarPeca(rainha, 1, 1);
        tabuleiro.adicionarPeca(bispo, 2, 2);
        tabuleiro.adicionarPeca(cavalo, 3, 3);
        tabuleiro.adicionarPeca(torre, 4, 4);
        tabuleiro.adicionarPeca(peao, 6, 6);

        tabuleiro.imprimirTabuleiro();
        System.out.println();

        tabuleiro.moverPeca(0, 0, 1, 1); // Movimento inv�lido para o Rei
        tabuleiro.moverPeca(1, 1, 3, 3); // Movimento v�lido para a Rainha
        tabuleiro.moverPeca(2, 2, 4, 4); // Movimento v�lido para o Bispo
        tabuleiro.moverPeca(3, 3, 5, 2); // Movimento v�lido para o Cavalo
        tabuleiro.moverPeca(4, 4, 4, 6); // Movimento v�lido para a Torre
        tabuleiro.moverPeca(6, 6, 7, 7); // Movimento inv�lido para o Pe�o

        tabuleiro.imprimirTabuleiro();
    }
}
