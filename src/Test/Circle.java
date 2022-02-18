package Test;

import Hillel_Dmitriy_Tsyhanok_DZ_1_2.Point;

import java.util.LinkedList;

public class Circle {

    int pointCircleX;
    int pointCircleY;
    int pointCircleRadius;

    double PointDistance;

    LinkedList<Point> pointListForCircle = new LinkedList<Point>();

    public void addPListForCircle(Point point) {
        pointListForCircle.add(point);
    }


    public void addPointCircle(int pointCircleX, int pointCircleY, int pointCircleRadius) {
        this.pointCircleX = pointCircleX;
        this.pointCircleY = pointCircleY;
        this.pointCircleRadius = pointCircleRadius;
    }

public void Result() {
    //расстояние между точками насчитывается по формуле
    //d = корень((x1-x2)^2 + (y1-y2)^2), где x1,y1- координаты первой точки, x2,y2- координаты второй

    //расстояние между точками ценрта окружности и точкой из LinkedList
    System.out.print("Point X Result: ");
    for (int q = 0; q < pointListForCircle.size(); q++) {
        double PointX = pointListForCircle.get(q).getX();
        double PointY = pointListForCircle.get(q).getY();
        PointDistance = Math.sqrt(Math.pow(pointCircleX - PointX, 2) +Math.pow(pointCircleY - PointY, 2));
        System.out.println("PointDistance: " +PointDistance + "\n");

        System.out.print(" " + pointListForCircle.get(0).getX());
        System.out.print(" " + pointListForCircle.get(0).getY());

    }

////////////////////////////

    System.out.print("Point X: ");
    for (int q = 0; q < pointListForCircle.size(); q++) {
        double xx = pointListForCircle.get(q).getX();
        System.out.print(" " + pointListForCircle.get(q).getY());

    }


/*
    PointDistance = Math.sqrt(Math.pow(pointCircleX - PointX, 2) +Math.pow(pointCircleY - PointY, 2));
    System.out.println("PointDistance: " +PointDistance);

    if(PointDistance < pointCircleRadius) {
        System.out.println("Точка: " + PointX +" "+ PointY + " вписывается в окружность");

    } else{
        System.out.println("Точка: " + PointX +" "+ PointY + " не вписывается в окружность");

    }


 */




}





    public void PrintPointCircle() {
        System.out.println("Circle Print Point: ");
        System.out.println(pointCircleX);
        System.out.println(pointCircleY);
        System.out.println(pointCircleRadius);

        System.out.println("Point: ");


    }
    public void printPointListC () {

        System.out.print("Point X: ");
        for (int q = 0; q < pointListForCircle.size(); q++) {
            System.out.print(" " + pointListForCircle.get(q).getX());
            //System.out.print(" " + points.get(q).getY());

        }

        System.out.print("\nPoint Y: ");
        for (int q = 0; q < pointListForCircle.size(); q++) {
            System.out.print(" " + pointListForCircle.get(q).getY());
        }
        System.out.print("\n\n");



        System.out.println("points.size: " +pointListForCircle.size());

    }

    public void  printTest() {
        System.out.println("Circle is Work!");
        System.out.println(pointListForCircle.size());

    }



/*

    //Math.sqrt((pointX-x2)^2) + (y1-y2)^2);
    double circleGipotenuza =  Math.sqrt((((pointCircleX * pointCircleY)) / ((pointCircleX + pointCircleY)))); // Гипотенуза
    double PointGipotenuza = 50;
    double PointRealGip;
        System.out.println("Гпотенуза круга: "+ circleGipotenuza);


    // при положительном значении
    // гипотенуза круга, меньще гипотенузы точки
            if(circleGipotenuza < PointGipotenuza) {
        PointRealGip = PointGipotenuza-circleGipotenuza; // реальная гип точки от начала координат x y
        if(PointRealGip<=pointCircleRadius) {
            // точка вписывается в круг

        }
    }
    // при положительном значении
    // гипотенуза круга, больше гипотенузы точки
        if(circleGipotenuza > PointGipotenuza) {
        PointRealGip = circleGipotenuza - PointGipotenuza;

        if(PointRealGip<=pointCircleRadius) {
            // точка вписывается в круг
        }
    }




 */











}
