/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CODIGOS;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.util.Random;
import javax.swing.Timer;

/**
 *
 * @author irmoura
 */
public class Tela extends javax.swing.JFrame {
    
    public Timer timer;
    
    public int contador;
    
    public Color btn_ativado = Color.yellow;
    public Color btn_desativado = Color.black;
    public int delay = 250;
    
    public int[] coluna_001_da_frase = new int[5];
    public int[] coluna_002_da_frase = new int[5];
    public int[] coluna_003_da_frase = new int[5];

    /**
     * Creates new form Tela
     */
    public Tela() {
        initComponents();
    }
    
    public void desenha(int a1, int b1, int c1, int d1, int e1, int f1, int g1, int h1,
                        int a2, int b2, int c2, int d2, int e2, int f2, int g2, int h2,
                        int a3, int b3, int c3, int d3, int e3, int f3, int g3, int h3,
                        int a4, int b4, int c4, int d4, int e4, int f4, int g4, int h4,
                        int a5, int b5, int c5, int d5, int e5, int f5, int g5, int h5){
        ////////////////////////////////////////////////////////////////////////
        if(a1==1){BTN_A1.setBackground(btn_ativado);}
        if(a2==1){BTN_A2.setBackground(btn_ativado);}
        if(a3==1){BTN_A3.setBackground(btn_ativado);}
        if(a4==1){BTN_A4.setBackground(btn_ativado);}
        if(a5==1){BTN_A5.setBackground(btn_ativado);}
        if(b1==1){BTN_B1.setBackground(btn_ativado);}
        if(b2==1){BTN_B2.setBackground(btn_ativado);}
        if(b3==1){BTN_B3.setBackground(btn_ativado);}
        if(b4==1){BTN_B4.setBackground(btn_ativado);}
        if(b5==1){BTN_B5.setBackground(btn_ativado);}
        if(c1==1){BTN_C1.setBackground(btn_ativado);}
        if(c2==1){BTN_C2.setBackground(btn_ativado);}
        if(c3==1){BTN_C3.setBackground(btn_ativado);}
        if(c4==1){BTN_C4.setBackground(btn_ativado);}
        if(c5==1){BTN_C5.setBackground(btn_ativado);}
        if(d1==1){BTN_D1.setBackground(btn_ativado);}
        if(d2==1){BTN_D2.setBackground(btn_ativado);}
        if(d3==1){BTN_D3.setBackground(btn_ativado);}
        if(d4==1){BTN_D4.setBackground(btn_ativado);}
        if(d5==1){BTN_D5.setBackground(btn_ativado);}
        if(e1==1){BTN_E1.setBackground(btn_ativado);}
        if(e2==1){BTN_E2.setBackground(btn_ativado);}
        if(e3==1){BTN_E3.setBackground(btn_ativado);}
        if(e4==1){BTN_E4.setBackground(btn_ativado);}
        if(e5==1){BTN_E5.setBackground(btn_ativado);}
        if(f1==1){BTN_F1.setBackground(btn_ativado);}
        if(f2==1){BTN_F2.setBackground(btn_ativado);}
        if(f3==1){BTN_F3.setBackground(btn_ativado);}
        if(f4==1){BTN_F4.setBackground(btn_ativado);}
        if(f5==1){BTN_F5.setBackground(btn_ativado);}
        if(g1==1){BTN_G1.setBackground(btn_ativado);}
        if(g2==1){BTN_G2.setBackground(btn_ativado);}
        if(g3==1){BTN_G3.setBackground(btn_ativado);}
        if(g4==1){BTN_G4.setBackground(btn_ativado);}
        if(g5==1){BTN_G5.setBackground(btn_ativado);}
        if(h1==1){BTN_H1.setBackground(btn_ativado);}
        if(h2==1){BTN_H2.setBackground(btn_ativado);}
        if(h3==1){BTN_H3.setBackground(btn_ativado);}
        if(h4==1){BTN_H4.setBackground(btn_ativado);}
        if(h5==1){BTN_H5.setBackground(btn_ativado);}
    }
    
    public void apaga(){
            BTN_A1.setBackground(btn_desativado);
            BTN_A2.setBackground(btn_desativado);
            BTN_A3.setBackground(btn_desativado);
            BTN_A4.setBackground(btn_desativado);
            BTN_A5.setBackground(btn_desativado);
            BTN_B1.setBackground(btn_desativado);
            BTN_B2.setBackground(btn_desativado);
            BTN_B3.setBackground(btn_desativado);
            BTN_B4.setBackground(btn_desativado);
            BTN_B5.setBackground(btn_desativado);
            BTN_C1.setBackground(btn_desativado);
            BTN_C2.setBackground(btn_desativado);
            BTN_C3.setBackground(btn_desativado);
            BTN_C4.setBackground(btn_desativado);
            BTN_C5.setBackground(btn_desativado);
            BTN_D1.setBackground(btn_desativado);
            BTN_D2.setBackground(btn_desativado);
            BTN_D3.setBackground(btn_desativado);
            BTN_D4.setBackground(btn_desativado);
            BTN_D5.setBackground(btn_desativado);
            BTN_E1.setBackground(btn_desativado);
            BTN_E2.setBackground(btn_desativado);
            BTN_E3.setBackground(btn_desativado);
            BTN_E4.setBackground(btn_desativado);  
            BTN_E5.setBackground(btn_desativado);   
            BTN_F1.setBackground(btn_desativado); 
            BTN_F2.setBackground(btn_desativado);  
            BTN_F3.setBackground(btn_desativado);
            BTN_F4.setBackground(btn_desativado);
            BTN_F5.setBackground(btn_desativado);      
            BTN_G1.setBackground(btn_desativado);    
            BTN_G2.setBackground(btn_desativado);    
            BTN_G3.setBackground(btn_desativado);      
            BTN_G4.setBackground(btn_desativado);
            BTN_G5.setBackground(btn_desativado);
            BTN_H1.setBackground(btn_desativado);
            BTN_H2.setBackground(btn_desativado);
            BTN_H3.setBackground(btn_desativado);
            BTN_H4.setBackground(btn_desativado);
            BTN_H5.setBackground(btn_desativado);
    }
    
    public void numero_a_ser_exibido(String numero_exibido){
        if(numero_exibido.equals("0")){
             coluna_001_da_frase[0] = 1;
             coluna_001_da_frase[1] = 1;
             coluna_001_da_frase[2] = 1;
             coluna_001_da_frase[3] = 1;
             coluna_001_da_frase[4] = 1;
             //////////////////////////
             coluna_002_da_frase[0] = 1;
             coluna_002_da_frase[1] = 0;
             coluna_002_da_frase[2] = 0;
             coluna_002_da_frase[3] = 0;
             coluna_002_da_frase[4] = 1;
             //////////////////////////
             coluna_003_da_frase[0] = 1;
             coluna_003_da_frase[1] = 1;
             coluna_003_da_frase[2] = 1;
             coluna_003_da_frase[3] = 1;
             coluna_003_da_frase[4] = 1;
        }
        if(numero_exibido.equals("1")){
             coluna_001_da_frase[0] = 0;
             coluna_001_da_frase[1] = 1;
             coluna_001_da_frase[2] = 0;
             coluna_001_da_frase[3] = 0;
             coluna_001_da_frase[4] = 1;
             //////////////////////////
             coluna_002_da_frase[0] = 1;
             coluna_002_da_frase[1] = 1;
             coluna_002_da_frase[2] = 1;
             coluna_002_da_frase[3] = 1;
             coluna_002_da_frase[4] = 1;
             //////////////////////////
             coluna_003_da_frase[0] = 0;
             coluna_003_da_frase[1] = 0;
             coluna_003_da_frase[2] = 0;
             coluna_003_da_frase[3] = 0;
             coluna_003_da_frase[4] = 1;
        }
        if(numero_exibido.equals("2")){
             coluna_001_da_frase[0] = 1;
             coluna_001_da_frase[1] = 0;
             coluna_001_da_frase[2] = 1;
             coluna_001_da_frase[3] = 1;
             coluna_001_da_frase[4] = 1;
             //////////////////////////
             coluna_002_da_frase[0] = 1;
             coluna_002_da_frase[1] = 0;
             coluna_002_da_frase[2] = 1;
             coluna_002_da_frase[3] = 0;
             coluna_002_da_frase[4] = 1;
             //////////////////////////
             coluna_003_da_frase[0] = 1;
             coluna_003_da_frase[1] = 1;
             coluna_003_da_frase[2] = 1;
             coluna_003_da_frase[3] = 0;
             coluna_003_da_frase[4] = 1;
        }
        if(numero_exibido.equals("3")){
             coluna_001_da_frase[0] = 1;
             coluna_001_da_frase[1] = 0;
             coluna_001_da_frase[2] = 1;
             coluna_001_da_frase[3] = 0;
             coluna_001_da_frase[4] = 1;
             //////////////////////////
             coluna_002_da_frase[0] = 1;
             coluna_002_da_frase[1] = 0;
             coluna_002_da_frase[2] = 1;
             coluna_002_da_frase[3] = 0;
             coluna_002_da_frase[4] = 1;
             //////////////////////////
             coluna_003_da_frase[0] = 1;
             coluna_003_da_frase[1] = 1;
             coluna_003_da_frase[2] = 1;
             coluna_003_da_frase[3] = 1;
             coluna_003_da_frase[4] = 1;
        }
        if(numero_exibido.equals("4")){
             coluna_001_da_frase[0] = 1;
             coluna_001_da_frase[1] = 1;
             coluna_001_da_frase[2] = 1;
             coluna_001_da_frase[3] = 0;
             coluna_001_da_frase[4] = 0;
             //////////////////////////
             coluna_002_da_frase[0] = 0;
             coluna_002_da_frase[1] = 0;
             coluna_002_da_frase[2] = 1;
             coluna_002_da_frase[3] = 0;
             coluna_002_da_frase[4] = 0;
             //////////////////////////
             coluna_003_da_frase[0] = 1;
             coluna_003_da_frase[1] = 1;
             coluna_003_da_frase[2] = 1;
             coluna_003_da_frase[3] = 1;
             coluna_003_da_frase[4] = 1;
        }
        if(numero_exibido.equals("5")){
             coluna_001_da_frase[0] = 1;
             coluna_001_da_frase[1] = 1;
             coluna_001_da_frase[2] = 1;
             coluna_001_da_frase[3] = 0;
             coluna_001_da_frase[4] = 1;
             //////////////////////////
             coluna_002_da_frase[0] = 1;
             coluna_002_da_frase[1] = 0;
             coluna_002_da_frase[2] = 1;
             coluna_002_da_frase[3] = 0;
             coluna_002_da_frase[4] = 1;
             //////////////////////////
             coluna_003_da_frase[0] = 1;
             coluna_003_da_frase[1] = 0;
             coluna_003_da_frase[2] = 1;
             coluna_003_da_frase[3] = 1;
             coluna_003_da_frase[4] = 1;
        }
        if(numero_exibido.equals("6")){
             coluna_001_da_frase[0] = 1;
             coluna_001_da_frase[1] = 1;
             coluna_001_da_frase[2] = 1;
             coluna_001_da_frase[3] = 1;
             coluna_001_da_frase[4] = 1;
             //////////////////////////
             coluna_002_da_frase[0] = 1;
             coluna_002_da_frase[1] = 0;
             coluna_002_da_frase[2] = 1;
             coluna_002_da_frase[3] = 0;
             coluna_002_da_frase[4] = 1;
             //////////////////////////
             coluna_003_da_frase[0] = 1;
             coluna_003_da_frase[1] = 0;
             coluna_003_da_frase[2] = 1;
             coluna_003_da_frase[3] = 1;
             coluna_003_da_frase[4] = 1;
        }
        if(numero_exibido.equals("7")){
             coluna_001_da_frase[0] = 1;
             coluna_001_da_frase[1] = 0;
             coluna_001_da_frase[2] = 0;
             coluna_001_da_frase[3] = 0;
             coluna_001_da_frase[4] = 0;
             //////////////////////////
             coluna_002_da_frase[0] = 1;
             coluna_002_da_frase[1] = 0;
             coluna_002_da_frase[2] = 0;
             coluna_002_da_frase[3] = 0;
             coluna_002_da_frase[4] = 0;
             //////////////////////////
             coluna_003_da_frase[0] = 1;
             coluna_003_da_frase[1] = 1;
             coluna_003_da_frase[2] = 1;
             coluna_003_da_frase[3] = 1;
             coluna_003_da_frase[4] = 1;
        }
        if(numero_exibido.equals("8")){
             coluna_001_da_frase[0] = 1;
             coluna_001_da_frase[1] = 1;
             coluna_001_da_frase[2] = 1;
             coluna_001_da_frase[3] = 1;
             coluna_001_da_frase[4] = 1;
             //////////////////////////
             coluna_002_da_frase[0] = 1;
             coluna_002_da_frase[1] = 0;
             coluna_002_da_frase[2] = 1;
             coluna_002_da_frase[3] = 0;
             coluna_002_da_frase[4] = 1;
             //////////////////////////
             coluna_003_da_frase[0] = 1;
             coluna_003_da_frase[1] = 1;
             coluna_003_da_frase[2] = 1;
             coluna_003_da_frase[3] = 1;
             coluna_003_da_frase[4] = 1;
        }
        if(numero_exibido.equals("9")){
             coluna_001_da_frase[0] = 1;
             coluna_001_da_frase[1] = 1;
             coluna_001_da_frase[2] = 1;
             coluna_001_da_frase[3] = 0;
             coluna_001_da_frase[4] = 0;
             //////////////////////////
             coluna_002_da_frase[0] = 1;
             coluna_002_da_frase[1] = 0;
             coluna_002_da_frase[2] = 1;
             coluna_002_da_frase[3] = 0;
             coluna_002_da_frase[4] = 0;
             //////////////////////////
             coluna_003_da_frase[0] = 1;
             coluna_003_da_frase[1] = 1;
             coluna_003_da_frase[2] = 1;
             coluna_003_da_frase[3] = 1;
             coluna_003_da_frase[4] = 1;
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BTN_A1 = new javax.swing.JButton();
        BTN_H1 = new javax.swing.JButton();
        BTN_B1 = new javax.swing.JButton();
        BTN_C1 = new javax.swing.JButton();
        BTN_D1 = new javax.swing.JButton();
        BTN_E1 = new javax.swing.JButton();
        BTN_F1 = new javax.swing.JButton();
        BTN_G1 = new javax.swing.JButton();
        BTN_A2 = new javax.swing.JButton();
        BTN_B2 = new javax.swing.JButton();
        BTN_C2 = new javax.swing.JButton();
        BTN_D2 = new javax.swing.JButton();
        BTN_E2 = new javax.swing.JButton();
        BTN_F2 = new javax.swing.JButton();
        BTN_G2 = new javax.swing.JButton();
        BTN_H2 = new javax.swing.JButton();
        BTN_A3 = new javax.swing.JButton();
        BTN_B3 = new javax.swing.JButton();
        BTN_C3 = new javax.swing.JButton();
        BTN_D3 = new javax.swing.JButton();
        BTN_E3 = new javax.swing.JButton();
        BTN_F3 = new javax.swing.JButton();
        BTN_G3 = new javax.swing.JButton();
        BTN_H3 = new javax.swing.JButton();
        BTN_A4 = new javax.swing.JButton();
        BTN_B4 = new javax.swing.JButton();
        BTN_C4 = new javax.swing.JButton();
        BTN_D4 = new javax.swing.JButton();
        BTN_E4 = new javax.swing.JButton();
        BTN_F4 = new javax.swing.JButton();
        BTN_G4 = new javax.swing.JButton();
        BTN_H4 = new javax.swing.JButton();
        BTN_A5 = new javax.swing.JButton();
        BTN_B5 = new javax.swing.JButton();
        BTN_C5 = new javax.swing.JButton();
        BTN_D5 = new javax.swing.JButton();
        BTN_E5 = new javax.swing.JButton();
        BTN_F5 = new javax.swing.JButton();
        BTN_G5 = new javax.swing.JButton();
        BTN_H5 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        BTN_A1.setPreferredSize(new java.awt.Dimension(23, 23));
        getContentPane().add(BTN_A1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        BTN_H1.setPreferredSize(new java.awt.Dimension(23, 23));
        getContentPane().add(BTN_H1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 0, -1, -1));

        BTN_B1.setPreferredSize(new java.awt.Dimension(23, 23));
        getContentPane().add(BTN_B1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, -1, -1));

        BTN_C1.setPreferredSize(new java.awt.Dimension(23, 23));
        getContentPane().add(BTN_C1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 0, -1, -1));

        BTN_D1.setPreferredSize(new java.awt.Dimension(23, 23));
        getContentPane().add(BTN_D1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 0, -1, -1));

        BTN_E1.setPreferredSize(new java.awt.Dimension(23, 23));
        getContentPane().add(BTN_E1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 0, -1, -1));

        BTN_F1.setPreferredSize(new java.awt.Dimension(23, 23));
        getContentPane().add(BTN_F1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 0, -1, -1));

        BTN_G1.setPreferredSize(new java.awt.Dimension(23, 23));
        getContentPane().add(BTN_G1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 0, -1, -1));

        BTN_A2.setPreferredSize(new java.awt.Dimension(23, 23));
        getContentPane().add(BTN_A2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 20, -1, -1));

        BTN_B2.setPreferredSize(new java.awt.Dimension(23, 23));
        getContentPane().add(BTN_B2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

        BTN_C2.setPreferredSize(new java.awt.Dimension(23, 23));
        getContentPane().add(BTN_C2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 20, -1, -1));

        BTN_D2.setPreferredSize(new java.awt.Dimension(23, 23));
        getContentPane().add(BTN_D2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 20, -1, -1));

        BTN_E2.setPreferredSize(new java.awt.Dimension(23, 23));
        getContentPane().add(BTN_E2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 20, -1, -1));

        BTN_F2.setPreferredSize(new java.awt.Dimension(23, 23));
        getContentPane().add(BTN_F2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 20, -1, -1));

        BTN_G2.setPreferredSize(new java.awt.Dimension(23, 23));
        getContentPane().add(BTN_G2, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 20, -1, -1));

        BTN_H2.setPreferredSize(new java.awt.Dimension(23, 23));
        getContentPane().add(BTN_H2, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 20, -1, -1));

        BTN_A3.setPreferredSize(new java.awt.Dimension(23, 23));
        getContentPane().add(BTN_A3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, -1, -1));

        BTN_B3.setPreferredSize(new java.awt.Dimension(23, 23));
        getContentPane().add(BTN_B3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, -1, -1));

        BTN_C3.setPreferredSize(new java.awt.Dimension(23, 23));
        getContentPane().add(BTN_C3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 40, -1, -1));

        BTN_D3.setPreferredSize(new java.awt.Dimension(23, 23));
        getContentPane().add(BTN_D3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 40, -1, -1));

        BTN_E3.setPreferredSize(new java.awt.Dimension(23, 23));
        getContentPane().add(BTN_E3, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 40, -1, -1));

        BTN_F3.setPreferredSize(new java.awt.Dimension(23, 23));
        getContentPane().add(BTN_F3, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 40, -1, -1));

        BTN_G3.setPreferredSize(new java.awt.Dimension(23, 23));
        getContentPane().add(BTN_G3, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 40, -1, -1));

        BTN_H3.setPreferredSize(new java.awt.Dimension(23, 23));
        getContentPane().add(BTN_H3, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 40, -1, -1));

        BTN_A4.setPreferredSize(new java.awt.Dimension(23, 23));
        getContentPane().add(BTN_A4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, -1, -1));

        BTN_B4.setPreferredSize(new java.awt.Dimension(23, 23));
        getContentPane().add(BTN_B4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, -1, -1));

        BTN_C4.setPreferredSize(new java.awt.Dimension(23, 23));
        getContentPane().add(BTN_C4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 60, -1, -1));

        BTN_D4.setPreferredSize(new java.awt.Dimension(23, 23));
        getContentPane().add(BTN_D4, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 60, -1, -1));

        BTN_E4.setPreferredSize(new java.awt.Dimension(23, 23));
        getContentPane().add(BTN_E4, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 60, -1, -1));

        BTN_F4.setPreferredSize(new java.awt.Dimension(23, 23));
        getContentPane().add(BTN_F4, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 60, -1, -1));

        BTN_G4.setPreferredSize(new java.awt.Dimension(23, 23));
        getContentPane().add(BTN_G4, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 60, -1, -1));

        BTN_H4.setPreferredSize(new java.awt.Dimension(23, 23));
        getContentPane().add(BTN_H4, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 60, -1, -1));

        BTN_A5.setPreferredSize(new java.awt.Dimension(23, 23));
        getContentPane().add(BTN_A5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 80, -1, -1));

        BTN_B5.setPreferredSize(new java.awt.Dimension(23, 23));
        getContentPane().add(BTN_B5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, -1, -1));

        BTN_C5.setPreferredSize(new java.awt.Dimension(23, 23));
        getContentPane().add(BTN_C5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 80, -1, -1));

        BTN_D5.setPreferredSize(new java.awt.Dimension(23, 23));
        getContentPane().add(BTN_D5, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 80, -1, -1));

        BTN_E5.setPreferredSize(new java.awt.Dimension(23, 23));
        getContentPane().add(BTN_E5, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 80, -1, -1));

        BTN_F5.setPreferredSize(new java.awt.Dimension(23, 23));
        getContentPane().add(BTN_F5, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 80, -1, -1));

        BTN_G5.setPreferredSize(new java.awt.Dimension(23, 23));
        getContentPane().add(BTN_G5, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 80, -1, -1));

        BTN_H5.setPreferredSize(new java.awt.Dimension(23, 23));
        getContentPane().add(BTN_H5, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 80, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    
    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
        
        numero_a_ser_exibido("0");
        
        timer = new Timer(delay, (ActionEvent e) -> {

        Random random = new Random();
            
            contador++;
            
            if(contador==1){
            apaga();
            desenha(0, 0, 0, 0, 0, 0, 0, coluna_001_da_frase[0],
                    0, 0, 0, 0, 0, 0, 0, coluna_001_da_frase[1],
                    0, 0, 0, 0, 0, 0, 0, coluna_001_da_frase[2],
                    0, 0, 0, 0, 0, 0, 0, coluna_001_da_frase[3],
                    0, 0, 0, 0, 0, 0, 0, coluna_001_da_frase[4]);
            }
            if(contador==3){
            desenha(0, 0, 0, 0, 0, 0, coluna_001_da_frase[0], coluna_002_da_frase[0],
                    0, 0, 0, 0, 0, 0, coluna_001_da_frase[1], coluna_002_da_frase[1],
                    0, 0, 0, 0, 0, 0, coluna_001_da_frase[2], coluna_002_da_frase[2],
                    0, 0, 0, 0, 0, 0, coluna_001_da_frase[3], coluna_002_da_frase[3],
                    0, 0, 0, 0, 0, 0, coluna_001_da_frase[4], coluna_002_da_frase[4]);
            }
            if(contador==5){
            desenha(0, 0, 0, 0, 0, coluna_001_da_frase[0], coluna_002_da_frase[0], coluna_003_da_frase[0],
                    0, 0, 0, 0, 0, coluna_001_da_frase[1], coluna_002_da_frase[1], coluna_003_da_frase[1],
                    0, 0, 0, 0, 0, coluna_001_da_frase[2], coluna_002_da_frase[2], coluna_003_da_frase[2],
                    0, 0, 0, 0, 0, coluna_001_da_frase[3], coluna_002_da_frase[3], coluna_003_da_frase[3],
                    0, 0, 0, 0, 0, coluna_001_da_frase[4], coluna_002_da_frase[4], coluna_003_da_frase[4]);
            }
            if(contador==7){
            desenha(0, 0, 0, 0, coluna_001_da_frase[0], coluna_002_da_frase[0], coluna_003_da_frase[0], 0,
                    0, 0, 0, 0, coluna_001_da_frase[1], coluna_002_da_frase[1], coluna_003_da_frase[1], 0,
                    0, 0, 0, 0, coluna_001_da_frase[2], coluna_002_da_frase[2], coluna_003_da_frase[2], 0,
                    0, 0, 0, 0, coluna_001_da_frase[3], coluna_002_da_frase[3], coluna_003_da_frase[3], 0,
                    0, 0, 0, 0, coluna_001_da_frase[4], coluna_002_da_frase[4], coluna_003_da_frase[4], 0);
            }
            if(contador==9){
            desenha(0, 0, 0, coluna_001_da_frase[0], coluna_002_da_frase[0], coluna_003_da_frase[0], 0, 0,
                    0, 0, 0, coluna_001_da_frase[1], coluna_002_da_frase[1], coluna_003_da_frase[1], 0, 0,
                    0, 0, 0, coluna_001_da_frase[2], coluna_002_da_frase[2], coluna_003_da_frase[2], 0, 0,
                    0, 0, 0, coluna_001_da_frase[3], coluna_002_da_frase[3], coluna_003_da_frase[3], 0, 0,
                    0, 0, 0, coluna_001_da_frase[4], coluna_002_da_frase[4], coluna_003_da_frase[4], 0, 0);
            }
            if(contador==11){
            desenha(0, 0, coluna_001_da_frase[0], coluna_002_da_frase[0], coluna_003_da_frase[0], 0, 0, 0,
                    0, 0, coluna_001_da_frase[1], coluna_002_da_frase[1], coluna_003_da_frase[1], 0, 0, 0,
                    0, 0, coluna_001_da_frase[2], coluna_002_da_frase[2], coluna_003_da_frase[2], 0, 0, 0,
                    0, 0, coluna_001_da_frase[3], coluna_002_da_frase[3], coluna_003_da_frase[3], 0, 0, 0,
                    0, 0, coluna_001_da_frase[4], coluna_002_da_frase[4], coluna_003_da_frase[4], 0, 0, 0);
            }
            if(contador==13){
            desenha(0, coluna_001_da_frase[0], coluna_002_da_frase[0], coluna_003_da_frase[0], 0, 0, 0, 0,
                    0, coluna_001_da_frase[1], coluna_002_da_frase[1], coluna_003_da_frase[1], 0, 0, 0, 0,
                    0, coluna_001_da_frase[2], coluna_002_da_frase[2], coluna_003_da_frase[2], 0, 0, 0, 0,
                    0, coluna_001_da_frase[3], coluna_002_da_frase[3], coluna_003_da_frase[3], 0, 0, 0, 0,
                    0, coluna_001_da_frase[4], coluna_002_da_frase[4], coluna_003_da_frase[4], 0, 0, 0, 0);
            }
            if(contador==15){
            desenha(coluna_001_da_frase[0], coluna_002_da_frase[0], coluna_003_da_frase[0], 0, 0, 0, 0, 0,
                    coluna_001_da_frase[1], coluna_002_da_frase[1], coluna_003_da_frase[1], 0, 0, 0, 0, 0,
                    coluna_001_da_frase[2], coluna_002_da_frase[2], coluna_003_da_frase[2], 0, 0, 0, 0, 0,
                    coluna_001_da_frase[3], coluna_002_da_frase[3], coluna_003_da_frase[3], 0, 0, 0, 0, 0,
                    coluna_001_da_frase[4], coluna_002_da_frase[4], coluna_003_da_frase[4], 0, 0, 0, 0, 0);
            }
            if(contador==17){
            desenha(coluna_002_da_frase[0], coluna_003_da_frase[0], 0, 0, 0, 0, 0, 0,
                    coluna_002_da_frase[1], coluna_003_da_frase[1], 0, 0, 0, 0, 0, 0,
                    coluna_002_da_frase[2], coluna_003_da_frase[2], 0, 0, 0, 0, 0, 0,
                    coluna_002_da_frase[3], coluna_003_da_frase[3], 0, 0, 0, 0, 0, 0,
                    coluna_002_da_frase[4], coluna_003_da_frase[4], 0, 0, 0, 0, 0, 0);
            }
            if(contador==19){
            desenha(coluna_003_da_frase[0], 0, 0, 0, 0, 0, 0, 0,
                    coluna_003_da_frase[1], 0, 0, 0, 0, 0, 0, 0,
                    coluna_003_da_frase[2], 0, 0, 0, 0, 0, 0, 0,
                    coluna_003_da_frase[3], 0, 0, 0, 0, 0, 0, 0,
                    coluna_003_da_frase[4], 0, 0, 0, 0, 0, 0, 0);
            }
            if(contador==20){
            contador = 0;
            
            numero_a_ser_exibido(""+random.nextInt(10));
            
            }
            if(contador%2 == 0){
            apaga();
            }
        
         });
        
        timer.start();
        
        
        
    }//GEN-LAST:event_formWindowOpened

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Tela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Tela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Tela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Tela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Tela().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BTN_A1;
    private javax.swing.JButton BTN_A2;
    private javax.swing.JButton BTN_A3;
    private javax.swing.JButton BTN_A4;
    private javax.swing.JButton BTN_A5;
    private javax.swing.JButton BTN_B1;
    private javax.swing.JButton BTN_B2;
    private javax.swing.JButton BTN_B3;
    private javax.swing.JButton BTN_B4;
    private javax.swing.JButton BTN_B5;
    private javax.swing.JButton BTN_C1;
    private javax.swing.JButton BTN_C2;
    private javax.swing.JButton BTN_C3;
    private javax.swing.JButton BTN_C4;
    private javax.swing.JButton BTN_C5;
    private javax.swing.JButton BTN_D1;
    private javax.swing.JButton BTN_D2;
    private javax.swing.JButton BTN_D3;
    private javax.swing.JButton BTN_D4;
    private javax.swing.JButton BTN_D5;
    private javax.swing.JButton BTN_E1;
    private javax.swing.JButton BTN_E2;
    private javax.swing.JButton BTN_E3;
    private javax.swing.JButton BTN_E4;
    private javax.swing.JButton BTN_E5;
    private javax.swing.JButton BTN_F1;
    private javax.swing.JButton BTN_F2;
    private javax.swing.JButton BTN_F3;
    private javax.swing.JButton BTN_F4;
    private javax.swing.JButton BTN_F5;
    private javax.swing.JButton BTN_G1;
    private javax.swing.JButton BTN_G2;
    private javax.swing.JButton BTN_G3;
    private javax.swing.JButton BTN_G4;
    private javax.swing.JButton BTN_G5;
    private javax.swing.JButton BTN_H1;
    private javax.swing.JButton BTN_H2;
    private javax.swing.JButton BTN_H3;
    private javax.swing.JButton BTN_H4;
    private javax.swing.JButton BTN_H5;
    // End of variables declaration//GEN-END:variables
}
