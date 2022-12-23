package DopWork.encapsulation.Ex1;

public class Model {
    private int width;
    private int heigth;

    public Model(int w, int h) {
        this.width = w;
        this.heigth = h;
    }

    public int getWidth() {
        return this.width;
    }

    public void setWidth(int value) {
        this.width = value;
    }

    public void setHeigth(int value) {
        this.heigth = value;
    }

    public int calcArea() {
        return this.width * this.heigth;
    }

    public int calcPerimeter() {
        return (this.heigth + this.width) * 2;
    } 
}
