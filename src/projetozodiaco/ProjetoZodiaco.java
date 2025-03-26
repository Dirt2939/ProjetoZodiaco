/*
 * Projeto Zodiaco
 */
package projetozodiaco;

import java.util.Calendar;
import java.util.Scanner;

/**
 *
 * @author Rafael
 */
public class ProjetoZodiaco {

    
    public static void main(String[] args) {
        
        Scanner ler = new Scanner(System.in);
        Calendar hoje = Calendar.getInstance();
        
        String nome, sexo, signo, cor;
        int sexoRspt, diaNascimento, mesNascimento, anoNascimento, diaAtual, 
            mesAtual, anoAtual, idade, numeroSorte, numCor;
        boolean statusDia, statusMes, statusAno, mes28, mes30, mes31;
        
        statusMes = false;
        statusDia = false;
        statusAno = false;
        mes28 = false;
        mes30 = false;
        mes31 = false;
        
        diaNascimento = 0;
        mesNascimento = 0;
        anoNascimento = 0;
        sexoRspt = 0;
        idade = 0;
        numeroSorte = 0;
        numCor = 0;
        
        cor = "dourado";
        signo = "";
        sexo = "";
        
        diaAtual = hoje.get(Calendar.DATE);
        mesAtual = hoje.get(Calendar.MONTH) + 1;
        anoAtual = hoje.get(Calendar.YEAR);
        
        System.out.println("Digite seu nome completo: ");
        nome = ler.nextLine();
        
        if (nome.length() <= 8) { // Nome incorreto 
            System.out.println("Nome informado de forma incorreta.");
        } // Nome incorreto \\
        
        else { // Nome correto
        
            System.out.println("Digite seu sexo: \n[1]Feminino [2]Masculino");
            sexoRspt = ler.nextInt();
            
            switch (sexoRspt) {
            
                case 1:
                    sexo = "feminino";
                    break;
                    
                case 2:
                    sexo = "masculino";
                    break;
                    
                default:
                    sexo = "masculino";
                
            }
            
            System.out.println("Digite o ano do seu nascimento: ");
            anoNascimento = ler.nextInt();
            
            if (anoNascimento >= 1900 && anoNascimento <= anoAtual) 
            { statusAno = true; } // Determina se o ano é válido \\
            
            else { statusAno = false; } // Determina que é inválido \\
            
            if (statusAno == true) { // Verifica se o ano é válido e continua 
            
            System.out.println("Digite o mês do seu nascimento: ");
            mesNascimento = ler.nextInt();
            
            if (mesNascimento == 4 || mesNascimento == 6 || mesNascimento == 9 ||
                mesNascimento == 11) { // Mês dura 30 dias
                
                    statusMes = true;
                    mes30 = true;
                    
                } // Mês dura 30 dias \\ 
                
            else if (mesNascimento == 1 || mesNascimento == 3 || mesNascimento == 5
                || mesNascimento == 7 || mesNascimento == 8 || mesNascimento == 10
                || mesNascimento ==12) { // Mês dura 31 dias
                
                    statusMes = true;
                    mes31 = true;
                    
            } // Mês dura 31 dias \\
                
            else if (mesNascimento == 2) { // Mês dura 28 dias
                 
                    statusMes = true;
                    mes28 = true;
                     
            } // Mês dura 28 dias \\
            
            else { statusMes = false; } // Caso o mes for inválido \\
                
            } // Verifica se o ano é válido e continua \\
            
            else {statusMes = false;}
                
            if (statusMes == true) { // Verifica se o mês é válido e continua
                
            System.out.println("Digite o dia do seu nascimento: ");
            diaNascimento = ler.nextInt();
            
            if (mes30 == true) { // Bloco que verifica se o dia condiz com o mês
            
                if (diaNascimento >= 1 && diaNascimento <= 30) { 
                    
                    statusDia = true; 
                    
                }
                
            } 
            
            else if (mes31 == true) { // Bloco que verifica se o dia condiz com o mês
            
                if (diaNascimento >= 1 && diaNascimento <= 31) {
                
                    statusDia = true; 
                    
                }
                
            } // Bloco que verifica se o dia condiz com o mês \\
            
            else if (mes28 == true) {
            
                if (diaNascimento >= 1 && diaNascimento <= 28) {
                
                    statusDia = true; 
                    
                }
                      
            }
            
            else { statusDia = false; }
                
            } // Verifica se o mês é válido e continua \\
            
            if (statusDia == true && statusMes == true && statusAno == true) {
                // Verifica se a data é válida e continua
            
            if ((diaNascimento >= 21 && mesNascimento == 3) || (diaNascimento >= 1
            && diaNascimento <= 20 && mesNascimento == 4)) {signo = "áries";}
            
            else if ((diaNascimento >= 21 && mesNascimento == 4) || (diaNascimento >=
                1 && diaNascimento <= 20 && mesNascimento == 5)) {signo = "touro";}
            
            else if ((diaNascimento >= 21 && mesNascimento == 5) || (diaNascimento >=
                1 && diaNascimento <= 20 && mesNascimento == 6)) {signo = "gemeos";}
            
            else if (diaNascimento >= 21 && mesNascimento == 6 || diaNascimento >= 1
                && diaNascimento <= 21 && mesNascimento == 7) {signo = "câncer";}
            
            else if (diaNascimento >= 22 && mesNascimento == 7 || diaNascimento >= 1
                && diaNascimento <= 22 && mesNascimento == 8) {signo = "leão";}
            
            else if (diaNascimento >= 23 && mesNascimento == 8 || diaNascimento >= 1
                && diaNascimento <= 22 && mesNascimento == 9) {signo = "virgem";}
            
            else if (diaNascimento >= 23 && mesNascimento == 9 || diaNascimento >= 1
                && diaNascimento <= 22 && mesNascimento == 10) {signo = "libra";}
            
            else if (diaNascimento >= 23 && mesNascimento == 10 || diaNascimento >= 1
                && diaNascimento <= 21 && mesNascimento == 11) {signo = "escorpião";}
            
            else if (diaNascimento >= 22 && mesNascimento == 11 || diaNascimento >= 1
                && diaNascimento <= 21 && mesNascimento == 12) {signo = "sagitário";}
            
            else if (diaNascimento >= 22 && mesNascimento == 12 || diaNascimento >= 1
                && diaNascimento <= 20 && mesNascimento == 1) {signo = "capricórnio";}
            
            else if (diaNascimento >= 21 && mesNascimento == 1 || diaNascimento >= 1
                && diaNascimento <= 19 && mesNascimento == 2) {signo = "aquário";}
            
            else if (diaNascimento >= 20 && mesNascimento == 2 || diaNascimento >= 1
                && diaNascimento <= 20 && mesNascimento == 3) {signo = "peixes";}
                
            else { 
                
                System.out.println("Erro!");
                System.out.println("Se estás a ver essa mensagem de erro"
                    + " é porque nem eu sei o que houve, lamento."); }
                
                if (signo.length() > 1) { // Se o signo tiver sido determinado
                
                    numeroSorte = 1 + (int)(Math.random() * 99);
                    // Cria um número aleatório \\
                    
                    numCor = 1 + (int)(Math.random() * 9); 
                    // Cria um número aleatório para randomizar a cor \\
                    
                switch (numCor) { // usa o numCor para escolher uma cor
            
                case 1: cor = "vermelho"; break;
                
                case 2: cor = "amarelo"; break;
                
                case 3: cor = "roxo"; break;
                
                case 4: cor = "laranja"; break;
                
                case 5: cor = "verde"; break;
                
                case 6: cor = "cinza"; break;
                
                case 7: cor = "rosa"; break;
                
                case 8: cor = "azul"; break;
                
                case 9: cor = "marrom"; break;
                
                } // usa o numCor para escolher uma cor \\
                    
                } // Se o signo tiver sido determinado \\
                
                // Bloco de cálculo da idade
                idade = (anoAtual - anoNascimento);
            
                if (mesNascimento > mesAtual || (mesNascimento == mesAtual && 
                diaNascimento > diaAtual)) { idade--; }
                // Bloco de cálculo da idade \\
                
                if (sexoRspt == 1) {
                
                    System.out.println("Sra. "+nome+", nascida em "+diaNascimento+"/"
                    +mesNascimento+"/"+anoNascimento+", é do signo de "+signo+". "
                    + "\nVocê tem "+idade+" anos. Seu número "
                    + "da sorte é "+numeroSorte+" e sua cor é "+cor+".");
                    
                }
                
                else {
                
                    System.out.println("Sr. "+nome+", nascido em "+diaNascimento+"/"
                    +mesNascimento+"/"+anoNascimento+", é do signo de "+signo+". "
                    + "\nVocê tem "+idade+" anos. Seu número "
                    + "da sorte é "+numeroSorte+" e sua cor é "+cor+".");
                    
                }
            
            } // Verifica se a data é válida e continua
            
            
            
            else  {
                
                System.out.println("Data inválida."); 
                
            }
            
            
            
            } // Nome correto \\       
            
        } 
        
    }