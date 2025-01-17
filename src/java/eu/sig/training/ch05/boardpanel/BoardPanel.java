package eu.sig.training.ch05.boardpanel;

import java.awt.Graphics;
import java.util.List;

public class BoardPanel {
    @SuppressWarnings("unused")
    /**
     * Renders a single square on the given graphics context on the specified
     * rectangle.
     * 
     * @param square
     *            The square to render.
     * @param g
     *            The graphics context to draw on.
     * @param x
     *            The x position to start drawing.
     * @param y
     *            The y position to start drawing.
     * @param w
     *            The width of this square (in pixels).
     * @param h
     *            The height of this square (in pixels).
     */
    private void render(Square square, Graphics g, Dynamics dynamics) {
        square.getSprite().draw(g, dynamics);
        for (Unit unit : square.getOccupants()) {
            unit.getSprite().draw(g, dynamics);
        }
    }

    private class Sprite {
        @SuppressWarnings("unused")
        public void draw(Graphics g, Dynamics dynamics) {

        }
    }

    private class Unit {
        public Sprite getSprite() {
            return null;
        }
    }

    private class Square extends Unit {

        public List<Unit> getOccupants() {
            return null;
        }

    }

    public class Dynamics {
        @SuppressWarnings("unused")
        public int x;
        @SuppressWarnings("unused")
        public int y;
        @SuppressWarnings("unused")
        public int w;
        @SuppressWarnings("unused")
        public int h;
    }

}
