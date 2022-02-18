package Test_2;


import java.util.LinkedList;

public class PointList {

    public static void main(String[] args) {
        PointList p = new PointList();
       p.printPointListCircle();
    }


    int circleX;
    int circleY;
    int circleRadius;
    double PointCircle;


    LinkedList<Point> pointsLinkedList = new LinkedList<Point>();



    public void addPointCircle(Point point1) {
        this.circleX = point1.circleX;
        this.circleY = point1.circleY;
        this.circleRadius = point1.circleRadius;
    }


    public void addPoint(Point point) {
        pointsLinkedList.add(point);

    }




    public void printPointList() {

        System.out.print("Point X: ");
        for (int q = 0; q < pointsLinkedList.size(); q++) {
            System.out.print(" " + pointsLinkedList.get(q).getX());
            //System.out.print(" " + points.get(q).getY());

        }

        System.out.print("\nPoint Y: ");
        for (int q = 0; q < pointsLinkedList.size(); q++) {
            System.out.print(" " + pointsLinkedList.get(q).getY());
        }
        System.out.print("\n\n");


        System.out.println("points.size: " + pointsLinkedList.size());


    }

    public void printPointListCircle() {
        System.out.println("printPointListCircle");
        System.out.println(circleX);
        System.out.println(circleY);
        System.out.println(circleRadius);

    }


    public void Result() {


        //расстояние между точками
     for (int q = 0; q < pointsLinkedList.size(); q++) {

         double x = pointsLinkedList.get(q).getX();
         double y = pointsLinkedList.get(q).getY();

        PointCircle = Math.sqrt(Math.pow(circleX - x, 2) +Math.pow(circleY - y, 2));

        if(PointCircle < circleRadius) {
            System.out.println("Точка: "+"X: " +x+ "  Y: " +y+  " -- Вписываются в окружность:");


        }
        }




        }


}




