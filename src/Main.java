public class Main {
    public static void main(String[] args) {
    var dog = 8.0;
System.out.println(dog);
var cat= 3.6;
System.out.println(cat);
var paper=763789;
System.out.println(paper);
dog=dog+4;
System.out.println(dog);
cat=cat+4;
System.out.println(cat);
paper=paper+4;
System.out.println(paper);
dog=dog-3.5;
System.out.println(dog);
cat=cat-1.6;
System.out.println(cat);
paper=paper-7639;
System.out.println(paper);
var friend=19;
System.out.println(friend);
friend=friend+2;
System.out.println(friend);
friend=friend/7;
System.out.println(friend);
var frog=3.5;
System.out.println(frog);
frog=frog*10;
System.out.println(frog);
frog=frog/3.5;
System.out.println(frog);
frog=frog+4;
System.out.println(frog);

var boxerOne=78.2;
var boxerTwo=82.7;
var totalWeight= boxerOne+boxerTwo;
System.out.println("Общий вес"+totalWeight+"кг");
var weightDifference= boxerTwo-boxerOne;
System.out.println("Разница между весами бойцов"+weightDifference+"кг");
var difference=boxerTwo%boxerOne;
System.out.println("Разница на"+difference+"кг");

var totalHours=640;
var employeeTime=8;
var totalEmployees=totalHours/employeeTime;
System.out.println("Всего работников в компании-"+totalEmployees+"человек");
var addedEmployees=94;
var totalEmployees1=totalEmployees+addedEmployees;
System.out.println("Всего работников в компании стало-"+totalEmployees1+"человека");
var totalHours1=totalEmployees1*employeeTime;
System.out.println("Если в компании работает"+totalEmployees1+"человек, то всего"+totalHours1+"часов работы может быть поделено между сотрудниками");
}
}