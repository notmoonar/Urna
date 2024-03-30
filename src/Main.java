import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        int menu1 = 0, menu2 = 0, /// Navegação
        voto = 0, senhaImput = 0, /// Imputs
        senhaCode = 56473,  /// Senha do presidente da seção
        branco = 0, nulo = 0, /// Valores imutáveis
        
        cV1 = 0, cV2 = 0, cV3 = 0; /// Voto do candidato cadastrado

        int total = (cV1+cV2+cV3)/2+1; /// Usado para determinar o ganhador
        
        String winner = null; /// O nome do ganhador vai ser usado aqui

        String c1 = "Juremo", c2 = "Flavi", 
        c3 = "Osvaldo"; /// Nome do candidato cadastrado



        /// Menûs usados para o programa
        String menuA = """        
        **************************************
        *                                    *
        *     Urna Eletrônica - Menu         *
        *                                    *
        **************************************
        *                                    
        *  1- Iniciar votação                
        *  2- Encerrar votação               
        *  3- Sair                           
        *                                    
        **************************************
        """,
        menuB = """        
        **************************************
        *                                    *
        *     Urna Eletrônica - Votação      *
        *                                    *
        **************************************
        *                                    
        *  1- Votar                          
        *  2- Sair                           
        *                                    
        **************************************
        """, 
        candidatos = """        
        **************************************
        *                                    *
        *     Urna Eletrônica - Candidatos   *
        *                                    *
        **************************************
        *                                    
        *  11- %s
        *  22- %s
        *  21- %s
        *  00- Voto branco
        *                                    
        **************************************
        """.formatted(c1,c2,c3),
        painelSenha = """
        **************************************
        *                                    *
        *     Urna Eletrônica - Apuração     *
        *                                    *
        **************************************
        *
        *  Senha: """,
        vContabilizados = """
        ****************************************
        *                                      *
        *     Urna Eletrônica - Contabilização *
        *                                      *
        ****************************************
        *
        *    %s tem %s votos.
        *            
        *    %s tem %s votos.
        *        
        *    %s tem %s votos.
        *            
        *    Votos brancos %s.
        *            
        *    Votos Nulos %s.
        *
        ****************************************
        """,
        ganhador = "%s ganhou a eleição nesta urna.";
        

        Scanner scanner = new Scanner(System.in);

        while (menu1 != 3) {
            System.out.println(menuA);
            menu1 = scanner.nextInt();
            if (menu1 == 1) {
                System.out.println(menuB);
                menu2 = scanner.nextInt();
                if (menu2 == 1) {
                    System.out.println(candidatos);
                    voto = scanner.nextInt();
                    switch (voto) {
                        case 11:
                            cV1++;    
                            break;
                        case 22:
                            cV2++;
                            break;
                        case 21:
                            cV3++;
                            break;
                        case 00:
                            branco++;
                            break;
                        default:
                            nulo++;
                            break;
                    }
                }
            }
            if (menu1 == 2) {
                System.out.print(painelSenha);
                senhaImput = scanner.nextInt();
                if (senhaImput == senhaCode) {
                    System.out.println(vContabilizados.formatted
                    (c1,cV1,c2,cV2,c3,cV3,branco,nulo));
                    
                    if ((total < cV1) || (total > cV2) || (total > cV3)){
                        
                        System.out.println(ganhador.formatted(winner));
                    }
                    else {

                    }
                } else {
                    System.out.println("Acesso Negado.");
                }
            }
        }

        scanner.close();

    }
}
