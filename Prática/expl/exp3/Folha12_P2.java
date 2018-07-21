import java.util.Scanner;

public class Folha12_P2 {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        
        
        Piloto[] pilotos = new Piloto[10];
        int cont = 0;
        
        int opcao = -1;
        
        do {
            System.out.println("Gestao de uma prova automovel:");
            System.out.println("1 - Inserir informacao dos pilotos");
            System.out.println("2 - Listar pilotos ordenados pelo numero da viatura");
            System.out.println("3 - Alterar informacao de um piloto");
            System.out.println("4 - Remover piloto com base no numero da viatura");
            System.out.println("5 - Listar pilotos ordenados pelo nome");
            System.out.println("6 - Remover piloto(s) com base no nome");
            System.out.println("7 - Validar matriculas");
            System.out.println("8 - Terminar o programa");
            System.out.println("Opcao ->");
            opcao = sc.nextInt();
            
            switch(opcao) {
                case 1: cont = lerPilotos(pilotos, cont);
                      break;
                case 2: imprimePilotos(pilotos, cont);
                      break;
                case 3: modificarPiloto(pilotos, cont);
                      break;
                case 4: cont = removerPiloto(pilotos, cont);
                      break;
                case 5: listarPilotosOrdenadosNome(pilotos, cont);
                      break;
                case 6: cont = removerPilotoPorNome(pilotos, cont);
                      break;
                case 7: validarMatriculas(pilotos, cont);
                      break;
                case 8: System.out.println("Programa terminado!");
                      break;
                default: System.out.println("Opção inválida!");
                      break;
            } 
            
        }while(opcao != 8);
        

    }
    
      
       public static int lerPilotos(Piloto[] pilotos, int cont) {
           
           do {
               pilotos[cont] = new Piloto();
               sc.nextLine();
                System.out.println("Nome do piloto " + (cont+1) + ":");
                pilotos[cont].nomePiloto = sc.nextLine();

                System.out.println("Matricula da viatura:");
                pilotos[cont].matriculaViatura = sc.nextLine();

                pilotos[cont].numViatura = (cont+1);

                cont++;
                                
           }while(cont < 10 && !pilotos[cont-1].nomePiloto.equals(""));
           
           if(pilotos[cont-1].nomePiloto.equals("")) {
             cont--;
           }
           
           return cont;
    }
       
       public static void imprimePilotos(Piloto[] pilotos, int cont) {
           for (int i = cont-1; i >= 0; i--) {
               System.out.println("Número da viatura: " + pilotos[i].numViatura);
               System.out.println("Nome do piloto: " + pilotos[i].nomePiloto);
               System.out.println("Matricula da viatura: " + pilotos[i].matriculaViatura);
           }
       }
       
       public static void modificarPiloto(Piloto[] pilotos, int cont) {
           System.out.println("Número da viatura cujo piloto pretende alterar:");
           int numViaturaAAlterar = sc.nextInt();
           
           boolean encontrou = false;
           
           for(int i=0; i < cont; i++) {
               if(pilotos[i].numViatura == numViaturaAAlterar) {
                   encontrou = true;
                   sc.nextLine();
                   System.out.println("Novo nome do piloto: ");
                   pilotos[i].nomePiloto = sc.nextLine();
                   System.out.println("Nova matricula: ");
                   pilotos[i].matriculaViatura = sc.nextLine();
                   
               }
           }
           
           if(encontrou == false) {
               System.out.println("Número de viatura não encontrado");
           }
       }
       
       public static int removerPiloto(Piloto[] pilotos, int cont) {
           System.out.println("Número da viatura cujo piloto pretende remover:");
           int numViaturaARemover = sc.nextInt();
           
           boolean encontrou = false;
           
           for(int i=0; i < cont; i++) {
               if(pilotos[i].numViatura == numViaturaARemover) {
                   encontrou = true;
                   sc.nextLine();
                   
                   //apagar...
                   for(int j=i; j < cont-1; j++) {
                       pilotos[j] = pilotos[j+1];
                   }
                   
                   
                   cont--;
                   
               }
           }
           
           if(encontrou == false) {
               System.out.println("Número de viatura não encontrado");
           }
           return cont;
       }
       
       public static void listarPilotosOrdenadosNome(Piloto[] pilotos, int cont) {
           for(int i = 0; i < cont-1; i++) {
               for(int j = i +1; j < cont; j++) {
                   if(pilotos[i].nomePiloto.compareTo(pilotos[j].nomePiloto) > 0) {
                       Piloto temporario = pilotos[i];
                       pilotos[i] = pilotos[j];
                       pilotos[j] = temporario;
                   }
               }
           }
           
           for (int i = 0; i < cont; i++) {
               System.out.println("Número da viatura: " + pilotos[i].numViatura);
               System.out.println("Nome do piloto: " + pilotos[i].nomePiloto);
               System.out.println("Matricula da viatura: " + pilotos[i].matriculaViatura);
           }
           
       }
       
       public static int removerPilotoPorNome(Piloto[] pilotos, int cont) {
           sc.nextLine();
           System.out.println("Nome (ou parte) do piloto pretende remover:");
           String pilotoARemover = sc.nextLine();
           
           boolean encontrou = false;
           
           for(int i=0; i < cont; i++) {
               if(pilotos[i].nomePiloto.contains(pilotoARemover)) {
                   encontrou = true;
                   
                   System.out.println("Pretende eliminar o piloto " + pilotos[i].nomePiloto + "? (s/n)");
                   char apagar = sc.nextLine().charAt(0);
                   if(apagar == 's') {
                       //apagar...
                        for(int j=i; j < cont-1; j++) {
                            pilotos[j] = pilotos[j+1];
                        }
                        cont--;
                        i--;
                   }
               }
           }
           
           if(encontrou == false) {
               System.out.println("Nenhum piloto tem esse nome");
           }
           return cont;
       }
       
       public static void validarMatriculas(Piloto[] pilotos, int cont) {
           sc.nextLine();
           boolean matriculasValidas = true;
           for(int i = 0; i < cont; i++) {
               
               //verificar para o piloto i
               String matriculaAtual = pilotos[i].matriculaViatura;
               
               
               if( !(Character.isLetter(matriculaAtual.charAt(0)) && Character.isLetter(matriculaAtual.charAt(1)) && 
                       matriculaAtual.charAt(2) == '-' && Character.isDigit(matriculaAtual.charAt(3)) && 
                               Character.isDigit(matriculaAtual.charAt(4)) && matriculaAtual.charAt(5) == '-' &&
                               Character.isDigit(matriculaAtual.charAt(6)) && Character.isDigit(matriculaAtual.charAt(7)))) {
                   matriculasValidas = false;
                   System.out.println("Matricula inválida : " + matriculaAtual);
                   System.out.println("Insira nova matricula: ");
                   pilotos[i].matriculaViatura = sc.nextLine();
               }
               
               /*if( !(Character.isLetter(matriculaAtual.charAt(0)) && Character.isLetter(matriculaAtual.charAt(1)) && 
                       matriculaAtual.charAt(2) == '-' && Character.isDigit(matriculaAtual.charAt(3)) && 
                               Character.isDigit(matriculaAtual.charAt(4)) && matriculaAtual.charAt(5) == '-' &&
                               Character.isDigit(matriculaAtual.charAt(6)) && Character.isDigit(matriculaAtual.charAt(7))) ) {
               matriculasValidas = false;    
               System.out.println("Matricula inválida : " + matriculaAtual);
                   System.out.println("Insira nova matricula: ");
                   pilotos[i].matriculaViatura = sc.nextLine();
               }
               
               if( !(Character.isLetter(matriculaAtual.charAt(0)) && Character.isLetter(matriculaAtual.charAt(1)) && 
                       matriculaAtual.charAt(2) == '-' && Character.isDigit(matriculaAtual.charAt(3)) && 
                               Character.isDigit(matriculaAtual.charAt(4)) && matriculaAtual.charAt(5) == '-' &&
                               Character.isDigit(matriculaAtual.charAt(6)) && Character.isDigit(matriculaAtual.charAt(7))) ) {
               matriculasValidas = false;    
               System.out.println("Matricula inválida : " + matriculaAtual);
                   System.out.println("Insira nova matricula: ");
                   pilotos[i].matriculaViatura = sc.nextLine();
               } */
               
               
           }
           
           if(matriculasValidas == true) {
                   System.out.println("Todas as matriculas são válidas!");
               }
       }
}

class Piloto {
    int numViatura;
    String nomePiloto;
    String matriculaViatura;
}