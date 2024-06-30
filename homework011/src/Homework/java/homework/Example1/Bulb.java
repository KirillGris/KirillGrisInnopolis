package Homework.java.homework.Example1;
//Класс лампочка
public class Bulb {
   private boolean toggle; //приватне ПОЛЕ КЛАССА

   //пишем конструктор для лампочки
    public Bulb() {
        this.toggle = false;
    }
    public Bulb(boolean toggle) {  //это переменная
        this.toggle = toggle; // ПОЛЕ КЛАССА=переменная (this - указатель) ; присваеваем полю класса значение перменной
    }

   public boolean isShining () {
    return this.toggle;
   }

   //пишем метод изменения состояния
    public void turnOn () {
        this.toggle = true;
    }
    public void turnOff () {
        this.toggle = false;
    }
}

