package Test;



import java.util.LinkedList;

public class PointList {

    LinkedList<Point> pointsLinkedList = new LinkedList<Point>();


    public void addPoint(Point point) {
        pointsLinkedList.add(point);
    }


    //Координаты круга и радиуса
    LinkedList<Point> pointsLinkedListCircle = new LinkedList<Point>();
    public void addPointCircle(Point point) {
        pointsLinkedListCircle.add(point);
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



        System.out.println("points.size: " +pointsLinkedList.size());

    }

}