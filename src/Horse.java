import java.awt.Color;
import java.awt.Graphics;

public class Horse extends Actor {
    private Motif motif;

    public Horse(Cell inLoc, boolean isHuman) {
        super(inLoc, Color.YELLOW, isHuman, 1);
        motif = new Motif("assets/Chess_tile_nl.png");
    }

    @Override
    protected void setPoly() {
    }

    @Override
    public void paint(Graphics g) {
        motif.draw(g, loc.x, loc.y, color);
    }
}