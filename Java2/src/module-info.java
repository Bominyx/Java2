module Java2
{
   exports exception;

   exports aufgabe2.application;

   exports aufgabe1.application;

   opens aufgabe2.application;
   
   opens aufgabe1.application;
   
   requires javafx.base;

   requires javafx.controls;

   requires javafx.graphics;
}