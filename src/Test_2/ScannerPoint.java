package Test_2;

import Test.Circle;

import java.util.Scanner;

public class ScannerPoint {

    int x;
    int y;
    int choice = 1;

    int circleX;
    int circleY;
    int circleRadius;

    int i;

    public void Scan() {

        PointList pointList = new PointList();



        Scanner scan = new Scanner(System.in);
        if (choice == 1) {
            for (int i = 0; choice != 2; i++) {
                System.out.println("Введите координаты точки \nX:");
                x = scan.nextInt();
                System.out.println("Введите координаты точки \nX:");
                y = scan.nextInt();
                System.out.println("Желаете добавить еще? (1-да 2- нет)");
                choice = scan.nextInt();
                System.out.println("i=: " + i);

                /// сохраниние точек в поинт
                Point point = new Point();
                point.PointXY(x, y);

                // добавление точек в поинт лист
                pointList.addPoint(point);
                // печать точек x y
                pointList.printPointList();



            }

                if (choice == 1) {
                    System.out.println("Ваш выбор: " + choice);
                    i = 1;
                }
                if (choice == 2) {
                    i = 3;
                    System.out.println("Ваш выбор: " + choice);
                }

                    // Точка центра круга и радиус
                if (choice == 2) {
                    System.out.println("Введите координаты центра \nX:");
                    circleX = scan.nextInt();

                    System.out.println("Введите координаты центра \nY:");
                    circleY = scan.nextInt();

                    System.out.println("Введите радиус окружности \n:");
                    circleRadius = scan.nextInt();
                    System.out.println("////////////"+ circleX + "  " + circleY + "  "+ circleRadius);

                    // добавление точек центра круга и радиуса в поинт лист
                    Point point1 = new Point();
                    point1.PointXYCircle(circleX, circleY,circleRadius);

                    pointList.addPointCircle(point1);


                    // print
                    pointList.printPointListCircle();




                    /*
                    //расстояние между точками
                    PointCircle = Math.sqrt(Math.pow(pointCircleX - PointX, 2) +Math.pow(pointCircleY - PointY, 2));
                    System.out.println("PointCircle: " +PointCircle);

                    if(PointCircle < pointCircleRadius) {
                        System.out.println("Точка: " + PointX +" "+ PointY + " вписывается в окружность");

                    } else{
                        System.out.println("Точка: " + PointX +" "+ PointY + " не вписывается в окружность");

                    }


                     */

                    pointList.Result();



                }

            }



        }




}




