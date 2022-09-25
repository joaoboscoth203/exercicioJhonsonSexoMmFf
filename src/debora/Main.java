
package debora;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String nome1, nome2, nome3;
        char sexo1, sexo2, sexo3;
        int idade1, idade2, idade3;
        int crianca = 0;
        int adolescente = 0;
        int adulto = 0;
        int idoso = 0;
        
        Scanner entrada = new Scanner(System.in);
       
        System.out.println("Digite o nome do individuo 1: ");
        nome1 = entrada.nextLine();
        System.out.println("Digite a idade do individuo 1: ");
        idade1 = entrada.nextInt();
        entrada.nextLine();
        System.out.println("Digite o sexo (M/F) do individuo 1: ");
        sexo1 = entrada.next().charAt(0);
        sexo1 = Character.toUpperCase(sexo1);
        entrada.nextLine();
        
        while (sexo1 != 'M' && sexo1 != 'F') {
            try {
                System.out.println("Opcao invalida.");
                System.out.println("Digite o sexo (M/F) do individuo 1: ");
                sexo1 = entrada.next().charAt(0);
                sexo1 = Character.toUpperCase(sexo1);
                entrada.nextLine();
            }catch (Exception e) {
                        System.out.println("Digite apenas M ou F");
                    }
        }
       
            if (idade1 <= 13) {
            crianca = crianca + 1;
            System.out.println(nome1+" e uma crianca");
                }else if (idade1 < 20) {
                adolescente = adolescente + 1;
                System.out.println(nome1+" e adolescente");
                    }else if (idade1 <= 50) {
                    adulto = adulto + 1;
                    System.out.println(nome1+" e adulto(a)");
                        }else if (idade1 > 50) {
                        idoso = idoso + 1;
                        System.out.println(nome1+" e da melhor idade");
                        } 
            
        System.out.println("");    
        System.out.println("Digite o nome do individuo 2: ");
        nome2 = entrada.nextLine();
        System.out.println("Digite a idade do individuo 2: ");
        idade2 = entrada.nextInt();
        entrada.nextLine();         
        System.out.println("Digite o sexo do individuo 2: ");
        sexo2 = entrada.next().charAt(0);
        sexo2 = Character.toUpperCase(sexo2);
        entrada.nextLine();
        
        while (sexo2 != 'M' && sexo2 != 'F') {
            try {
                System.out.println("Opcao invalida.");
                System.out.println("Digite o sexo (M/F) do individuo 2: ");
                sexo2 = entrada.next().charAt(0);
                sexo2 = Character.toUpperCase(sexo2);
                entrada.nextLine();
            }catch (Exception e) {
                        System.out.println("Digite apenas M ou F");
                    }
        }
        
            if (idade2 <= 13) {
            crianca = crianca + 1;
            System.out.println(nome2+" e uma crianca");
                }else if (idade2 < 20) {
                adolescente = adolescente + 1;
                System.out.println(nome2+" e adolescente");
                    }else if (idade2 <= 50) {
                    adulto = adulto + 1;
                    System.out.println(nome2+" e adulto(a)");
                        }else if (idade2 > 50) {
                        idoso = idoso + 1;
                        System.out.println(nome2+" e da melhor idade");
                        }
        
        System.out.println("");   
        System.out.println("Digite o nome do individuo 3: ");
        nome3 = entrada.nextLine();
        System.out.println("Digite a idade do individuo 3: ");
        idade3 = entrada.nextInt();        
        entrada.nextLine(); 
        System.out.println("Digite o sexo do individuo 3: ");
        sexo3 = entrada.next().charAt(0);
        sexo3 = Character.toUpperCase(sexo3);
        entrada.nextLine();
        
        while (sexo3 != 'M' && sexo3 != 'F') {
            try {
                System.out.println("Opcao invalida.");
                System.out.println("Digite o sexo (M/F) do individuo 3: ");
                sexo3 = entrada.next().charAt(0);
                sexo3 = Character.toUpperCase(sexo3);
                entrada.nextLine();
            }catch (Exception e) {
                        System.out.println("Digite apenas M ou F");
                    }
        }
           
            if (idade3 <= 13) {
            crianca = crianca + 1;
            System.out.println(nome3+" e uma crianca");
                }else if (idade3 < 20) {
                adolescente = adolescente + 1;
                System.out.println(nome3+" e adolescente");
                    }else if (idade3 <= 50) {
                    adulto = adulto + 1;
                    System.out.println(nome3+" e adulto(a)");
                        }else if (idade3 > 50) {
                        idoso = idoso + 1;
                        System.out.println(nome3+" e da melhor idade");
                        }
        
        System.out.println("");
        System.out.println("Quantidade de criancas: "+crianca);
        System.out.println("Quantidade de adolescentes: "+adolescente);
        System.out.println("Quantidade de adultos: "+adulto);
        System.out.println("Quantidade de pessoas na melhor idade: "+idoso);

            int mais_idoso = idade1;            
                if (idade2 > mais_idoso)
                    mais_idoso = idade2;          
                if (idade3 > mais_idoso)
                    mais_idoso = idade3; // ao final deste if a variavel mais_idoso tem o valor do mais idoso

                if (mais_idoso == idade1){
                    System.out.println(nome1+" e o(a) mais velho(a).");
                    }else if(mais_idoso == idade2) {
                            System.out.println(nome2+" e o(a) mais velho(a).");
                    }else {
                        System.out.println(nome3+" e o(a) mais velho(a).");
                    }
    }
    
}
