package Homeworks.homework3;

public class StringFormat extends Model {
    String text = "";

    @Override
    String getRawData() {
        return text;
    }

    @Override
    void appendRawData(String t) {
        text += t;
    }
}
