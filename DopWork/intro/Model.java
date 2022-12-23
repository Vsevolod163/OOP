package DopWork.intro;

public class Model {
    int width;
    int heigth;

    public Model(int w, int h) {
        this.width = w;
        this.heigth = h;
    }

    public int calcArea() {
        return this.width * this.heigth;
    }
}




