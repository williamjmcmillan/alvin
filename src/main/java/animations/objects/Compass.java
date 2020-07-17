package animations.objects;

import com.sun.prism.paint.Color;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Paint;
import javafx.scene.shape.MoveTo;
import javafx.scene.shape.Path;
import javafx.scene.text.Font;

public class Compass extends Path{

    private Path border;
    private Path letters;
    private Path notches;
    private Canvas canvas;


    public Path getBorder() {
        return border;
    }

    public void setBorder(Path border) {
        this.border = border;
    }

    public Path getLetters() {
        return letters;
    }

    public void setLetters(Path letters) {
        this.letters = letters;
    }

    public Path getNotches() {
        return notches;
    }

    public void setNotches(Path notches) {
        this.notches = notches;
    }

    public Canvas draw(){
        canvas = new Canvas(700,500);

        GraphicsContext gc = canvas.getGraphicsContext2D();

        gc.setLineWidth(10);
        gc.setFont(new Font(50));

        gc.strokeOval(110,10, 480,480);
        gc.fillText("N", 330,60);
        gc.fillText("E", 550, 270);
        gc.fillText("S", 330, 480);
        gc.fillText("W", 130, 270);



        return canvas;
    }


    public Compass(){
        border = new Path();
        letters  = new Path();
        notches  = new Path();
    }



}
