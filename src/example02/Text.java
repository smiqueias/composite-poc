package example02;

public class Text extends StatelessWidget{

    String text;

    public Text(String text){
        this.text = text;
    }

    @Override
    public String toString() {
        return text;
    }

    @Override
    public Widget build() {
        var text = new Text(this.text);
        return text;
    }



}
