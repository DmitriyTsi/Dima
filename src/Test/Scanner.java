package Test;



import java.io.InputStream;
import java.util.Scanner;

class ScannerPoint {

 int choice = 1;

 int pointCircleX;
 int pointCircleY;
 int pointCircleRadius;

 int PointX;
 int PointY;

 double PointCircle;

 void scan() {

  Scanner scan = new Scanner(System.in);
  PointList pointList = new PointList();

  if (choice == 1) {
   for (int i = 0; choice != 2; i++) {
    System.out.println("Введите координаты точки \nX:");
    PointX = scan.nextInt();
    System.out.println("Введите координаты точки \nX:");
    PointY = scan.nextInt();
    System.out.println("Желаете добавить еще? (1-да 2- нет)");
    choice = scan.nextInt();
    System.out.println("i=: " + i);


    Point point = new Point(PointX, PointY);
    // добавление точек в лист
    pointList.addPoint(point);
    // принт вывод точек x y
    pointList.printPointList();


    if (choice == 1) {
     System.out.println("Ваш выбор: " + choice);
     i = 1;
    }
    if (choice == 2) {
     i = 3;
     System.out.println("Ваш выбор: " + choice);
    }
   }
  }

  //Собираем координаты круга, его радиус


  if (choice == 2) {

   System.out.println("Введите координаты центра \nX:");
   pointCircleX = scan.nextInt();
   // если отрицательное число - меняем на положительное (для расчета в этом случае нет никакой разницы)

   System.out.println("Введите координаты центра \nY:");
   pointCircleY = scan.nextInt();

   System.out.println("Введите радиус окружности \n:");
   pointCircleRadius = scan.nextInt();

   //передаем значение точек в
  }
   // печать  pointList
   pointList.printPointList();


   Point pointCircle = new Point(pointCircleX, pointCircleY, pointCircleRadius);
   pointList.addPointCircle(pointCircle);


   Circle circle = new Circle();
   circle.addPointCircle(pointCircleX,pointCircleY,pointCircleRadius);

   System.out.println("PrintPointCircle: ");
  circle.PrintPointCircle();
   // вывод лист точек из Circle
   circle.printPointListC();
   circle.Result();
   circle.printTest();










  //Формула расчета

  //расстояние между точками насчитывается по формуле
  //d = корень((x1-x2)^2 + (y1-y2)^2), где x1,y1- координаты первой точки, x2,y2- координаты второй

  //расстояние между точками
  PointCircle = Math.sqrt(Math.pow(pointCircleX - PointX, 2) +Math.pow(pointCircleY - PointY, 2));
  System.out.println("PointCircle: " +PointCircle);

  if(PointCircle < pointCircleRadius) {
   System.out.println("Точка: " + PointX +" "+ PointY + " вписывается в окружность");

  } else{
   System.out.println("Точка: " + PointX +" "+ PointY + " не вписывается в окружность");

  }





  }





/*
от центра 10см
         радиус 50
         итого 60см

         Реальная точка 60-10 //



 */



}