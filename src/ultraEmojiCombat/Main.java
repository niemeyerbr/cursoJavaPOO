package ultraEmojiCombat;

public class Main {
    public static void main(String[] args) {
        Lutador l[]= new Lutador[6];
        l[0] = new Lutador("Pretty Boy", "França", 31, 11, 1, 2, 1.75, 68.9);
        l[1] = new Lutador("Putscript", "Brasil", 29, 14, 3, 2, 1.68, 57.8);
        l[2] = new Lutador("Snapshadow", "EUA", 35, 12, 1, 2, 1.65, 80.9);
        l[3] = new Lutador("Dead Code", "Austrália", 28, 13, 0, 2, 1.93, 81);
        l[4] = new Lutador("UFO BR", "Brasil", 31, 5, 3, 4, 1.70, 119.3);
        l[5] = new Lutador("Nerd", "EUA", 30, 1, 2, 5, 1.81, 105.7);

        Luta UEC01 = new Luta();
        UEC01.marcarLuta(l[0], l[1]);
        UEC01.lutar();
        l[0].status();
        l[1].status();
    }
}
