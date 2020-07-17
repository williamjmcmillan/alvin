package animations.objects;


import javafx.scene.Node;
import javafx.scene.paint.Paint;
import javafx.scene.shape.*;
import javafx.scene.shape.Shape;

import java.awt.*;
import java.util.ArrayList;

public class Bird extends Path {

    public Bird() {



    }


    public Path draw(Float x, Float y){
        Path path = new Path();

        ArrayList<LineTo> LT = new ArrayList<>();
        LT.add(new LineTo());
        LT.add(new LineTo());

// First move to starting point
        MoveTo moveTo = new MoveTo();
        moveTo.setX(100.0f);
        moveTo.setY(90.0f);

// Then start drawing a line
        LT.get(0).setX(90.0f);
        LT.get(0).setY(80.0f);

        LT.get(1).setX(100.0f);
        LT.get(1).setY(70.0f);

        

        path.getElements().add(moveTo);

        path.getElements().addAll(LT);




        return path;
    }


}
