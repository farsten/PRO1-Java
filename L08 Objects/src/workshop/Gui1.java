package workshop;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Ellipse;
import javafx.scene.shape.Line;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Gui1 extends Application {
    @Override
    public void start(Stage stage) {
        Pane root = this.initContent();
        Scene scene = new Scene(root);

        stage.setTitle("Loops"); // may be changed
        stage.setScene(scene);
        stage.show();
    }

    private Pane initContent() {
        Pane pane = new Pane();
        pane.setPrefSize(200, 200); // may be changed
        this.drawShapes(pane);
        return pane;
    }

    // ------------------------------------------------------------------------

    private void drawShapes(Pane pane) {


// EXERCISE 1A
//        int x = 100;
//        int y = 75;
//        Line line1 = new Line(x, y, x + 20, y - 8);
//        Line line2 = new Line(x, y, x + 20, y + 8);
//        pane.getChildren().addAll(line1, line2);
////arrowhead @ (100, 75);

        //EXERCISE 1B
//        x = 100;
//        y = 125;
//        Line line3 = new Line(x, y, x + 20, y - 8);
//        Line line4 = new Line(x, y, x + 20, y + 8);
//        pane.getChildren().addAll(line3, line4);
////arrowhead @ (100, 125);

        //EXERCISE 1C
//        x = 20;
//        y = 50;
//        Line line5 = new Line(x, y, x + 20, y - 8);
//        Line line6 = new Line(x, y, x + 20, y + 8);
//        pane.getChildren().addAll(line5, line6);
////arrowhead @ (20, 50);
//
        //                     EXERCISE 2
//        int x1 = 100; // start point: (x1,y1)
//        int y1 = 100;
//        int x2 = 20; // end point: (x2,y2)
//        int y2 = 10;
//        while (x2 <= 180) {
//            Line line7 = new Line(x1, y1, x2, y2);
//            pane.getChildren().add(line7);
//            x2 += 20;}
//------------------EXERCISE 3A---------------------------------------------

//        int x1 = 20;
//        int y1 = 180;
//        int x2 = 20;
//        int y2 = 20;
//
//        while (x2 <= 200) {
//            Line line = new Line(x1, y1, x2, y2);
//            pane.getChildren().add(line);
//            x1 += 40;
//            x2 += 40; // jeg tegner 5 rette og vertical linjer
//---------------------- EXERCISE 3B --------------------------------------------//
//        int x1 = 180;
//        int y1 = 20;
//        int x2 = 20;
//        int y2 = 20;
//
//        while (y2 <= 200) {
//            Line line = new Line(x1, y1, x2, y2);
//            pane.getChildren().add(line);
//            y1 += 40;
//            y2 += 40;} //jeg tegner 5 rette og horizontale linjer
        //--------------------EXERCISE 3C-----------------------------------------//

//        int x1 = 110;
//        int y1 = 20;
//        int x2 = 90;
//        int y2 = 20;
//
//        while (y2 <= 200) {
//            Line line = new Line(x1, y1, x2, y2);
//            pane.getChildren().add(line);
//            x1 += 15;
//            x2 -= 15;
//            y1 += 40;
//            y2 += 40; //Jeg tegner 5 horiontale linjer, der bliver mindre jo højere op den går
// -------------------------EXERCISE 4A-----------------------------------------//
//            int x = 100; // center: (x,y)
//            int y = 100;
//            int r = 20; // radius: r
//            while (r <= 100) {
//                Circle circle = new Circle(x, y, r);
//                circle.setStroke(Color.BLACK);
//                circle.setFill(null);
//                pane.getChildren().add(circle);
//                r += 20;} // flotte cirkler, som bliver større og større
//---------------------------EXERCISE 4b-------------------------------------//
//        int x = 30; // center: (x,y)
//            int y = 100;
//            int r = 10; // radius: r
//            while (x <= 100) {
//                Circle circle = new Circle(x, y, r);
//                circle.setStroke(Color.BLACK);
//                circle.setFill(null);
//                pane.getChildren().add(circle);
//                r += 10;
//                x += 10; // jeg laver endnu flottere cirkler
//--------------EXERCISE 4C--------------------------------//
//                int x = 100; // center: (x,y)
//            int y = 100;
//            int xRadius = 30;
//            int yRadius = 40;
//while (xRadius <= 100) {
//    Ellipse ellipse = new Ellipse(x, y, xRadius, yRadius);
//    pane.getChildren().add(ellipse);
//    ellipse.setFill(null);
//    ellipse.setStroke(Color.BLACK);
//    xRadius += 10; //Jeg laver ellipser der bliver gradvist større
        //-------------EXERCISE 5------------------------------------------//
//        String str = "Datamatiker";
//        int x = 20;
//        int y = 10;
//        for (int i = 1; i <= str.length(); i++) {
//            String sub = str.substring(0, i);
//            Text text = new Text(x, y + (i * 15), sub);
//            pane.getChildren().add(text); // her har jeg skrevet d -> datamatiker
// }

//-------------------EXERCISE 6 + ALLE UNDEROPGAVER-------------------------------------------------//
//        int x1 = 0;
//        int y1 = 190; // start point for linjen
//        int x2 = 160;
//        int y2 = 190; // slut point for linjen
//        double x3 = 10;
//        double y3 = 187;
//        double x4 = 10;
//        double y4 = 193;
//
//
//        Line line = new Line(x1, y1, x2, y2); // selve stregen til axen
//        pane.getChildren().add(line);
//
//        for (int i = 0; i < 11; i++) {
//            if (i % 5 == 0) {
//                Line line4 = new Line(x3, y3 - 2, x4, y4 + 2); // de større linjer hvert 5. punkt
//                pane.getChildren().add(line4);
//                Text skala = new Text(x3 - 3, y3 - 4, i + ""); // tallet som skal stå over hvert 5. punkt
//                pane.getChildren().add(skala);
//            } else {
//                Line line1 = new Line(x3, y3, x4, y4); // de normale linjer pr punkt
//                pane.getChildren().add(line1);
//                x3 += 17;
//                x4 += 17;
//            }
//
//            int x5 = 160;
//            int y5 = 190;
//            Line line2 = new Line(x5, y5, x5 - 5, y5 - 3);
//            Line line3 = new Line(x5, y5, x5 - 5, y5 + 3);
//            pane.getChildren().addAll(line2, line3); // arrowhead
//
//        }
//
// -----------------------Opgave 7 er samme som opgave 5------------------------------------------------------//
//
//            //-----------------------------------EXERCISE 8------------------------------------------------------//
//        Create an application that draws 10 vertical lines as shown in the figure below. The first line’s
//        height is 80 and the height of the next lines is decreased by 8. The lower endpoint of the lines is at
//        (16,160), (32,148), (48,136), etc. Use a for-statement.

//        int x1 = 16;
//        int y1 = 160;
//        int x2 = 16;
//        int y2 = 80;
//
//        for (int i = 0; i < 10; i++) {
//            Line line = new Line(
//                    x1 + i * 16,
//                    y1 - i * 12,
//                    x2 + i * 16,
//                    y2 - i * 4);
//            pane.getChildren().add(line);
//        }
//// ----------------------------------EXERCISE 9 -------------------------------------------------//
//        double x = 180;
//        double centerY = 125;   // bibehold center af streg
//
//        while (x > 5) {
//
//            double height = x / 2;      // højde af linje
//            double y1 = centerY - height / 5;
//            double y2 = centerY + height / 2;
//
//            Line line = new Line(x, y1, x, y2);
//            pane.getChildren().add(line);
//
//            x *= 0.75;   // 25% mindre pr streg
//        }
//-----------------------------EXERCISE 10-----------------------------------------------------//

//        int x = 100; // center: (x,y,r)
//            int y = 100; // INDER CIRKEL
//            int r = 25; // radius: r
//
//        int x1 = 100; // center: (x1,y1,r1)
//        int y1 = 100; // YDRE CIRKEL
//        int r1 = 30; // radius: r
//
//        Circle circle1 = new Circle(x1, y1, r1);
//        circle1.setStroke(Color.BLACK);
//        circle1.setFill(Color.GOLD);
//        pane.getChildren().add(circle1);
//
//        Circle circle = new Circle(x, y, r);
//            circle.setStroke(Color.BLACK); // inder cirkel skal efter ydre cirklen for at få en hvid midte
//            circle.setFill(Color.WHITE);
//            pane.getChildren().add(circle);
//
//        int x2 = 100; // center: (x2,y2) ELLIPSEN (DIAMANTEN)
//            int y2 = 70;
//            int x2Radius = 20;
//            int y2Radius = 10;
//    Ellipse ellipse = new Ellipse(x2, y2, x2Radius, y2Radius);
//    pane.getChildren().add(ellipse);
//    ellipse.setFill(Color.SKYBLUE);
//    ellipse.setStroke(Color.BLACK);

//-----------------------------------------------------------------------------------------------//
//
//        drawRing(pane, 50, 50); // kalder metoden ved disse koordinater
//        drawRing(pane, 150, 50);
//        drawRing(pane, 50, 150);
//        drawRing(pane, 150, 150);
//
//
//    } // RING METHOD //
//    private void drawRing(Pane pane, int x, int y) {
//            int r = 25; // radius: r
//            int r1 = r + 5; // radius men for den anden cirkel
//
//        Circle circle1 = new Circle(x, y, r1);
//        circle1.setStroke(Color.BLACK);
//        circle1.setFill(Color.GOLD);
//        pane.getChildren().add(circle1);
//
//        Circle circle = new Circle(x, y, r);
//            circle.setStroke(Color.BLACK); // inder cirkel skal efter ydre cirklen for at få en hvid midte
//            circle.setFill(Color.WHITE);
//            pane.getChildren().add(circle);
//
//           // center: (x2,y2) ELLIPSEN (DIAMANTEN)
//            y -= 30;
//            int x2Radius = 20;
//            int y2Radius = 10;
//    Ellipse ellipse = new Ellipse(x, y, x2Radius, y2Radius);
//    pane.getChildren().add(ellipse);
//    ellipse.setFill(Color.SKYBLUE);
//    ellipse.setStroke(Color.BLACK);
            //-------------------------------- EXERCISE 11 -------------------------------//
//
//
//        drawCross(pane, 50, 50, 50); // kalder metoden ved disse koordinater
//        drawCross(pane, 150, 50, 10);
//        drawCross(pane, 50, 150, 100);
//        drawCross(pane, 150, 150, 25);
//
//    }
//        private void drawCross(Pane pane, double x, double y, double w) {
//
//            Line horizontal = new Line(x - w / 2, y, x + w / 2, y);
//
//            Line vertical = new Line(x, y - w / 2, x, y + w / 2);
//
//            pane.getChildren().addAll(horizontal, vertical);
            //---------------------------TREKANT EXERCISE 12----------------------------------//

//
//        drawTriangle(pane, 20, 100, 50, 1);
//    }
//
//    void drawTriangle(Pane pane, int x, int y, int h, double size) {
//
//
//
//        int height = (int) (h * size);
//        int base = height * 2;
//
//        Line bottom = new Line(x, y, x + base, y);
//
//        Line left = new Line(x, y, x + height, y - height);
//
//        Line right = new Line(
//                x + base, y,
//                x + height, y - height);
//
//        height /= 3;
//        x += h;
//        y -= h;
//        Line bottom1 = new Line(x, y, x + base, y);
//
//        Line left1 = new Line(x, y, x + height, y - height);
//
//        Line right1 = new Line(
//                x + base, y,
//                x + height, y - height);
//
//
//
//        pane.getChildren().addAll(bottom, left, right, bottom1, left1, right1);
//

//        // LILLE TREKANT ER 1/3 SÅ STOR
//        double smallSize = size / 3.0;
//
//        // REGNER LILLE TREKANT HØJDE UD
//        int smallHeight = (int) (h * smallSize);
//
//        // VENSTRE AF TREKANTEN
//        Line leftSmall = new Line(x, y, h, smallSize);
//
//        // HØJRE AF TREKANTEN
//        Line rightSmall = new Line(x + 4 * smallHeight, y, h, smallSize);
//
//        // TOPPEN AF TREKANTEN
//        Line topSmall = new Line(x + 2 * smallHeight, y - smallHeight, h, smallSize);
//        pane.getChildren().addAll(bottom, left, right, leftSmall, rightSmall, topSmall);
        }
    }



