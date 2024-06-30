public class Tv {
    private boolean toggle;
    private Integer channel;

    public Tv () {
        this.toggle = false;
        this.channel = null;
    }
    public Tv (boolean toggle) {
        this.toggle = toggle;
        this.channel = toggle ? 0 : null;
    }

    public Tv (int channel) {
        this.toggle = false;
        this.channel = null;
        if (channel >= 0) {
            this.toggle = true;
            this.channel = channel;
        }
    }
    public boolean isTvWork () {
        return this.toggle;
    }

    public Integer getChannel() {
        return this.channel;
    }

    public void setChannel(int channel) {
        if (this.toggle && channel >= 0) {
            this.channel = channel;
        } else if (!this.toggle) {
            System.out.println("Ошибка: Телевизор выключен");
        } else {
            System.out.println("ошибка: недопустимое значение канала");
        }
    }

    public void turnOn () {
        this.toggle = true;
        if (this.channel == null) {
            this.channel = 0;
        }
    }
    public void turnOff () {
        this.toggle = false;
        this.channel = null;
    }
}