import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        int menuA = 1;
        
        String menu1 = """        
        **************************************
        *                                    *
        *     Urna Eletrônica - Menu         *
        *                                    *
        **************************************
        *                                    *
        *  1- Iniciar votação                *
        *  2- Encerrar votação               *
        *  3- Sair                           *
        *                                    *
        **************************************
        """;
        String menu2 = """        
        **************************************
        *                                    *
        *     Urna Eletrônica - Menu         *
        *                                    *
        **************************************
        *                                    *
        *  1- Iniciar votação                *
        *  2- Encerrar votação               *
        *  3- Sair                           *
        *                                    *
        **************************************
        """;

        Scanner scanner = new Scanner(System.in);

        while (menuA != 0) {
            menuA = scanner.nextInt();
            if (menuA == 1) {
                
            }
        }






    }
}
