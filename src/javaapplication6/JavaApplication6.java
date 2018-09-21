/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication6;

import javax.swing.JOptionPane;

/**
 *
 * @author internet
 */
public class JavaApplication6 {
    /*static String[] user = new String[10];
    static String[] password = new String[10];*/
    static String user = "adm";
    static String password = "123";
    static double saldo = 1702.5;
    static String login;
    static String loginSenha;
    static String acao;
    static  double[] array = new double[10];
    static int i = 1;
    static int j = 0;
    static String extrato;
    
    /*public void login(){
        System.out.println("");
    } */
    
    public static void main(String[] args) {
        /*user[0] = "adm";
        password[0] = "123";*/
        array[0] =  saldo ;
        login = JOptionPane.showInputDialog("Insira seu Login");
        loginSenha = JOptionPane.showInputDialog("Insira sua Senha");
        
        //if(user.equals(login) && (user.equals(loginSenha))){
        if(login.equals(user) && loginSenha.equals(password)){
        
        
            do{
                acao = JOptionPane.showInputDialog("Transação " + i + "\nSaldo atual " + saldo + " \n 1- Sacar \n 2-Depositar \n 3-Extrato \n 4-Sair");
                if(acao.equals("1")){
                double valorSacar; 
                String valorSacarDigitado = JOptionPane.showInputDialog("Digite a quantidade de Cascalho que deseja sacar");
                valorSacar = Double.parseDouble(valorSacarDigitado); 
                 
                if(valorSacar > 0){
                    
                    saldo -= valorSacar;
                    JOptionPane.showMessageDialog(null, "Seu Novo saldo é "+ saldo, "Saldo Atualizado", JOptionPane.INFORMATION_MESSAGE);
                    acao = "0";
                    array[i] = saldo;
                    i++;
                    
                 }
        
                }
                else if(acao.equals("2")){
                    Double valorDepositar = Double.parseDouble(JOptionPane.showInputDialog("Digite a quantidade de Cascalho que deseja depositar"));
                    saldo += valorDepositar;
                    JOptionPane.showMessageDialog(null, "Seu Novo saldo é "+ saldo, "Saldo Atualizado", JOptionPane.INFORMATION_MESSAGE);
                    acao = "0";
                    array[i] = saldo;
                    i++;
                }
                else if(acao.equals("3")){
                        while(j <= array.length - 1){
                        extrato+=  "\n" + array[j] + "\n";
                        j++;
                            
                        }
                    JOptionPane.showMessageDialog(null, extrato, "Extrato", JOptionPane.INFORMATION_MESSAGE);
                    
                }
                
                else if(acao.equals("4")){
                    return;
                }
                
                
                
            }while(acao.equals("1") || acao.equals("2") || acao.equals("3") || acao.equals("4") || acao.equals("0"));

        }
        
        else{
            JOptionPane.showMessageDialog(null, "Usuario ou Senha Inválidos ", "Erro", JOptionPane.ERROR_MESSAGE); 
        };
        
        
    
    }
    
    
}
