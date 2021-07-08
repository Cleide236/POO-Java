package ultraemogicombat;
public class UltraEmogiCombat {
    public static void main(String[] args) {
    Lutador l[] = new Lutador[6];
    l[0] = new Lutador("Pretty Boy", "França", 31, 1.75f, 57.8f, 11, 2, 1);
    l[1] = new Lutador("Putscript ", "Brasil", 29, 1.68f, 59.9f, 14, 2, 3);
    l[2] = new Lutador("Snapshadow ", "EUA", 35, 1.65f, 75.7f, 12, 2, 1);
    l[3] = new Lutador("Dad Code ", "Australia", 28, 1.93f, 78.8f, 13, 0, 2);
    l[4] = new Lutador("UFOCobol ", "Brasil", 37, 1.70f, 98.9f, 5, 4, 3);
    l[5] = new Lutador("Nerdaart ", "EUA", 30, 1.81f, 105.7f, 12, 2, 4);
    
    l[0].status();
        System.out.println("----------------------");
    l[1].status();
        System.out.println("----------------------");
    l[2].status();
        System.out.println("----------------------");
    l[3].status();
        System.out.println("----------------------");
    l[4].status();
        System.out.println("----------------------");
    l[5].status();
    
    }
    
}
