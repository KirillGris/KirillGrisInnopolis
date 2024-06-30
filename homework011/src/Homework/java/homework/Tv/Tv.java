package Homework.java.homework.Tv;
import java.util.Random;


public class Tv {
    private boolean toggle;
    private Integer channel;

    public Tv () { // параметры по умолчанию
        this.toggle = false;
        this.channel = null;
    }
    public Tv (boolean toggle) {
        this.toggle = toggle;
        //this.channel = toggle ? 0 : null; //тернарный оператор , если toggle= true тогда по умолчанию 0,
        // если false тогда null
        if (toggle) {
            Random random = new Random();//задаем ограничение 15ю каналами
        this.channel = random.nextInt(16);
        } else {
            this.channel = null;
        }
    }

    public Tv (int channel) {
        this.toggle = false;
        this.channel = null;
        if (channel >= 0) { //если получаем номер канала, то включаем телевизор
            this.toggle = true;
            this.channel = channel;
        }

    }
    public boolean isTvWork () { //метод для проверки состояния телевизора
        return this.toggle;
    }

    public Integer getChannel() { //метод для проверки какой канал транслируется
        return this.channel;
    }

    public void setChannel(int channel) {  //выбираем канал

        if (channel >= 0 && channel <= 15) {// Проверка, что телевизор включен и канал не отрицательный
            //и ограничиваем. например 15-ю каналами вещания
            this.toggle = true; //включаем телевизор
            this.channel = channel;
        } else {
            System.out.println("ошибка: недопустимое значение канала");
        }
    }

    public void turnOn () {
        this.toggle = true;
        if (this.channel == null) {
            Random random = new Random();
            this.channel = random.nextInt(16);
        }
    }
    public void turnOff () {
        this.toggle = false;
        this.channel = null; // Сбрасываем канал при выключении телевизора
    }


}

