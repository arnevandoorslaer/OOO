package domain;

public class CaesarCijfer implements CodeerGedrag {
    private final int s = 9;
    private Geheim context;

    public CaesarCijfer(Geheim c) {

        this.context = c;
    }

    public String Codeer() {
        StringBuffer result = new StringBuffer();
        String text = context.getZin();

        for (int i = 0; i < text.length(); i++) {
            if (Character.isUpperCase(text.charAt(i))) {
                char ch = (char) (((int) text.charAt(i) +
                        s - 65) % 26 + 65);
                result.append(ch);
            } else {
                char ch = (char) (((int) text.charAt(i) +
                        s - 97) % 26 + 97);
                result.append(ch);
            }
        }
        return result.toString();
    }

    public String Decodeer() {
        StringBuffer result = new StringBuffer();
        String text = context.getZin();

        for (int i = 0; i < text.length(); i++) {
            if (Character.isUpperCase(text.charAt(i))) {
                char ch = (char) (((int) text.charAt(i) +
                        (26 - s) - 65) % 26 + 65);
                result.append(ch);
            } else {
                char ch = (char) (((int) text.charAt(i) +
                        (26 - s) - 97) % 26 + 97);
                result.append(ch);
            }
        }
        return result.toString();
    }
}
