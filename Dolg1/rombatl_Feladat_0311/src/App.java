public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Ez a program a rombusz területét számolja ki 2 átló bekérésével");
        System.out.println("Lieszkofszki Norbert, SZOFT/I/2/N");


        UserInput userInput = new UserInput();
        MathMagic mathMagic = new MathMagic();

        double Ver = userInput.askNumber("Addjon meg egy számot az első átlóhoz: ");
        double Hor = userInput.askNumber("Addjon meg egy számot a második átlóhoz: ");

        double Ter = mathMagic.Mathing(Ver, Hor);

        System.out.println("A rombusz területe: " + Ter );

    }
}
