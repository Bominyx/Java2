module Java2
{
   exports exception;

   exports ab2.application;

   exports ab1.application;

   opens ab2.application;
   
   opens ab1.application;
   
   requires javafx.base;

   requires javafx.controls;

   requires javafx.graphics;
}