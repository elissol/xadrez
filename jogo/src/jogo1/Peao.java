package jogo1;

class Peao extends Peca {
    public Peao(int x, int y) {
        super(x, y);
    }

    @Override
    public boolean mover(int novoX, int novoY) {
        if (novoY == y + 1 && (novoX == x || novoX == x + 1 || novoX == x - 1)) {
            x = novoX;
            y = novoY;
            return true;
        }
        return false;
    }
}