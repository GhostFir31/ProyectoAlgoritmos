/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.uabc.proyectoalgoritmos;

import java.awt.Image;
import java.util.ArrayList;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import java.awt.Color;
import java.awt.Graphics;

/**
 *
 * @author JesusOmar Leal
 */
public class InterfazMenu extends javax.swing.JFrame {

    /**
     * Creates new form InterfazMenu
     */
    private ImageIcon imagen;
    private Icon icono;
    //Actualizar esta variable cada que se quiera ejecutar en un equipo nuevo
    private String rutaAssets = "C:\\Users\\omar-\\OneDrive\\Documentos\\NetBeansProjects\\ProyectoAlgoritmos\\src\\main\\java\\com\\uabc\\proyectoalgoritmos\\assets\\";
    private final Audio audio = new Audio(rutaAssets);
    //*****************************************************************
    //Variables Funcionamiento*****************************************
    private ArrayList<Integer> lista = new ArrayList<>();
    private ArbolBinarioBalanceado arbol = new ArbolBinarioBalanceado();

    public InterfazMenu() {

        initComponents();

        this.setImagen(titulo, rutaAssets + "titulo2.png");
        this.setImagen(Background, rutaAssets + "background.jpg");
        // audio.playAudio();

    }

    private void setImagen(JLabel lbl, String url) {

        this.imagen = new ImageIcon(url);

        this.icono = new ImageIcon(this.imagen.getImage().getScaledInstance(lbl.getWidth(), lbl.getHeight(), Image.SCALE_DEFAULT));

        lbl.setIcon(this.icono);

        this.repaint();
    }

    /**
     * This method is called from within the constructor to initialize the form. WARNING: Do NOT modify this code. The content of this method is always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        titulo = new javax.swing.JLabel();
        generarNumerosB = new javax.swing.JButton();
        insertaNumerosB = new javax.swing.JButton();
        insertarUnNumeroB = new javax.swing.JButton();
        eliminarUnNumeroB = new javax.swing.JButton();
        recorrerPreOrdenB = new javax.swing.JButton();
        recorrerPostOrdenB = new javax.swing.JButton();
        recorrerInOrdenB = new javax.swing.JButton();
        recorrerPorNivelB = new javax.swing.JButton();
        encontrarNodosNivelB = new javax.swing.JButton();
        obtenerCodigoB = new javax.swing.JButton();
        Canvas = new javax.swing.JPanel();
        Background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        titulo.setIcon(new javax.swing.ImageIcon("C:\\Users\\omar-\\OneDrive\\Documentos\\NetBeansProjects\\ProyectoAlgoritmos\\src\\main\\java\\com\\uabc\\proyectoalgoritmos\\assets\\titulo2.png")); // NOI18N
        getContentPane().add(titulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 10, 590, -1));

        generarNumerosB.setText("Generar Numeros");
        generarNumerosB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                generarNumerosBActionPerformed(evt);
            }
        });
        getContentPane().add(generarNumerosB, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, 160, -1));

        insertaNumerosB.setText("Inserta Numeros");
        insertaNumerosB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                insertaNumerosBActionPerformed(evt);
            }
        });
        getContentPane().add(insertaNumerosB, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, 160, -1));

        insertarUnNumeroB.setText("Insertar un Numero");
        insertarUnNumeroB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                insertarUnNumeroBActionPerformed(evt);
            }
        });
        getContentPane().add(insertarUnNumeroB, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, 160, -1));

        eliminarUnNumeroB.setText("Eliminar un Numero");
        eliminarUnNumeroB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminarUnNumeroBActionPerformed(evt);
            }
        });
        getContentPane().add(eliminarUnNumeroB, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 220, 160, -1));

        recorrerPreOrdenB.setText("Recorrer PreOrden");
        recorrerPreOrdenB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                recorrerPreOrdenBActionPerformed(evt);
            }
        });
        getContentPane().add(recorrerPreOrdenB, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 260, 160, -1));

        recorrerPostOrdenB.setText("Recorrer PostOrden");
        recorrerPostOrdenB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                recorrerPostOrdenBActionPerformed(evt);
            }
        });
        getContentPane().add(recorrerPostOrdenB, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 300, 160, -1));

        recorrerInOrdenB.setText("Recorrer InOrden");
        recorrerInOrdenB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                recorrerInOrdenBActionPerformed(evt);
            }
        });
        getContentPane().add(recorrerInOrdenB, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 340, 160, -1));

        recorrerPorNivelB.setText("Recorrer Por Nivel");
        recorrerPorNivelB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                recorrerPorNivelBActionPerformed(evt);
            }
        });
        getContentPane().add(recorrerPorNivelB, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 380, 160, -1));

        encontrarNodosNivelB.setText("Encontrar Nodos Nivel");
        encontrarNodosNivelB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                encontrarNodosNivelBActionPerformed(evt);
            }
        });
        getContentPane().add(encontrarNodosNivelB, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 420, 160, -1));

        obtenerCodigoB.setText("Obtener Codigo ");
        obtenerCodigoB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                obtenerCodigoBActionPerformed(evt);
            }
        });
        getContentPane().add(obtenerCodigoB, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 460, 160, -1));

        Canvas.setBackground(new java.awt.Color(255, 255, 255));
        Canvas.setForeground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout CanvasLayout = new javax.swing.GroupLayout(Canvas);
        Canvas.setLayout(CanvasLayout);
        CanvasLayout.setHorizontalGroup(
            CanvasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 740, Short.MAX_VALUE)
        );
        CanvasLayout.setVerticalGroup(
            CanvasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 380, Short.MAX_VALUE)
        );

        getContentPane().add(Canvas, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 100, 740, 380));
        getContentPane().add(Background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 960, 500));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void obtenerCodigoBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_obtenerCodigoBActionPerformed
       
        try {
            String numeroStr = JOptionPane.showInputDialog(null, new JLabel("Ingresar el numero que desea ver su codigo : "));
            if (numeroStr == null) {

                return;
            }
            int numero = Integer.parseInt(numeroStr);

            System.out.println("numero a buscar codigo: " + numero);

        } catch (NumberFormatException e) {

            JOptionPane.showMessageDialog(null, "Error: Ingrese valores numéricos válidos");
        }
    }//GEN-LAST:event_obtenerCodigoBActionPerformed

    private void encontrarNodosNivelBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_encontrarNodosNivelBActionPerformed

        try {
            String nivelStr = JOptionPane.showInputDialog(null, new JLabel("Ingresar el nivel del arbol que desea ver : "));
            if (nivelStr == null) {

                return;
            }
            int nivel = Integer.parseInt(nivelStr);

            System.out.println("nivel seleccionado: " + nivel);

        } catch (NumberFormatException e) {

            JOptionPane.showMessageDialog(null, "Error: Ingrese valores numéricos válidos");
        }
    }//GEN-LAST:event_encontrarNodosNivelBActionPerformed

    private void recorrerPorNivelBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_recorrerPorNivelBActionPerformed

        if (arbol.getRaiz() != null) {

        } else {
            JOptionPane.showMessageDialog(null, "No se ha creado el arbol");

        }
    }//GEN-LAST:event_recorrerPorNivelBActionPerformed

    private void recorrerInOrdenBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_recorrerInOrdenBActionPerformed

        if (arbol.getRaiz() != null) {
            System.out.println("Inorden:");
            inOrden();
            pintarArbol(arbol);
        } else {
            JOptionPane.showMessageDialog(null, "No se ha creado el arbol");

        }
    }//GEN-LAST:event_recorrerInOrdenBActionPerformed

    private void recorrerPostOrdenBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_recorrerPostOrdenBActionPerformed

        if (arbol.getRaiz() != null) {
            System.out.println("Postorden:");
            postOrden();
            pintarArbol(arbol);
        } else {
            JOptionPane.showMessageDialog(null, "No se ha creado el arbol");

        }
    }//GEN-LAST:event_recorrerPostOrdenBActionPerformed

    private void recorrerPreOrdenBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_recorrerPreOrdenBActionPerformed

        if (arbol.getRaiz() != null) {
            System.out.println("Preorden:");
            preOrden();
            pintarArbol(arbol);
        } else {
            JOptionPane.showMessageDialog(null, "No se ha creado el arbol");

        }
    }//GEN-LAST:event_recorrerPreOrdenBActionPerformed

    private void eliminarUnNumeroBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminarUnNumeroBActionPerformed

        try {
            String valorEliminarStr = JOptionPane.showInputDialog(null, new JLabel("Ingresar el valor que deseas eliminar: "));

            if (valorEliminarStr == null) {

                return;
            }

            int valorEliminar = Integer.parseInt(valorEliminarStr);

            arbol.eliminarRecursivo(arbol.raiz, valorEliminar);

            System.out.println("Valor eliminado: " + valorEliminar);

            arbol.mostrarArbol(arbol);

            pintarArbol(arbol);

        } catch (NumberFormatException e) {

            JOptionPane.showMessageDialog(null, "Error: Ingrese valores numéricos válidos");
        }
    }//GEN-LAST:event_eliminarUnNumeroBActionPerformed

    private void insertarUnNumeroBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_insertarUnNumeroBActionPerformed

        try {
            String valorInsertadoStr = JOptionPane.showInputDialog(null, new JLabel("Ingresar el valor que deseas insertar: "));

            if (valorInsertadoStr == null) {

                return;
            }

            int valorInsertado = Integer.parseInt(valorInsertadoStr);

            agregarDato(valorInsertado);

            System.out.println("Valor Agregado: " + valorInsertado);
            arbol.mostrarArbol(arbol);
            pintarArbol(arbol);
        } catch (NumberFormatException e) {

            JOptionPane.showMessageDialog(null, "Error: Ingrese valores numéricos válidos");
        }
    }//GEN-LAST:event_insertarUnNumeroBActionPerformed

    private void insertaNumerosBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_insertaNumerosBActionPerformed

        if (!lista.isEmpty()) {
            this.arbol=new ArbolBinarioBalanceado();
            agregarDatosArrayList();
            arbol.mostrarArbol(arbol);
            pintarArbol(arbol);
        } else {
            JOptionPane.showMessageDialog(null, "No se ha generado lista");

        }
    }//GEN-LAST:event_insertaNumerosBActionPerformed

    private void generarNumerosBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_generarNumerosBActionPerformed
        limpiarCanvas();
        try {
            String valorMaximoStr = JOptionPane.showInputDialog(null, new JLabel("Ingresar el valor máximo: "));

            if (valorMaximoStr == null) {

                return;
            }

            int valorMaximoAleatorios = Integer.parseInt(valorMaximoStr);

            String cantidadNumerosStr = JOptionPane.showInputDialog(null, new JLabel("Ingresar la cantidad de números: "));

            if (cantidadNumerosStr == null) {

                return;
            }

            int cantidadNumeros = Integer.parseInt(cantidadNumerosStr);

            lista = Metodos.generarNumeros(valorMaximoAleatorios, cantidadNumeros);

            System.out.println("" + lista);

        } catch (NumberFormatException e) {

            JOptionPane.showMessageDialog(null, "Error: Ingrese valores numéricos válidos");

        }
    }//GEN-LAST:event_generarNumerosBActionPerformed
    private void pintarArbol(ArbolBinarioBalanceado arbol) {
        limpiarCanvas();
        Graphics g = Canvas.getGraphics();
        g.setColor(Color.BLACK);

        int startX = Canvas.getWidth() / 2;
        int startY = 50;

        pintarNodo(arbol.getRaiz(), g, startX, startY);
    }

    private void pintarNodo(Nodo nodo, Graphics g, int x, int y) {
        if (nodo != null) {

            int xOffset = 60;
            int yOffset = 30;

            int leftX = x - xOffset;
            int leftY = y + yOffset;
            pintarNodo(nodo.getIzquierda(), g, leftX, leftY);

            int rightX = x + xOffset;
            int rightY = y + yOffset;
            pintarNodo(nodo.getDerecha(), g, rightX, rightY);

            if (nodo.getIzquierda() != null) {

                drawArrow(g, x, y, leftX, leftY, 50);
            }

            if (nodo.getDerecha() != null) {

                drawArrow(g, x, y, rightX, rightY, 50);
            }

            g.setColor(Color.BLUE);

            int radius = 15;

            g.fillOval(x - radius, y - radius, 2 * radius, 2 * radius);

            g.setColor(Color.BLACK);

            g.drawString(String.valueOf(nodo.getValor()), x - 5, y + 5);
        }
    }

    private void drawArrow(Graphics g, int x1, int y1, int x2, int y2, int lineLength) {
        int arrowSize = 5;

        double angle = Math.atan2(y2 - y1, x2 - x1);
        int tipX = (int) (x1 + lineLength * Math.cos(angle));
        int tipY = (int) (y1 + lineLength * Math.sin(angle));

        g.drawLine(x1, y1, tipX, tipY);

        g.drawLine(tipX, tipY, (int) (tipX - arrowSize * Math.cos(angle - Math.PI / 4)), (int) (tipY - arrowSize * Math.sin(angle - Math.PI / 4)));
        g.drawLine(tipX, tipY, (int) (tipX - arrowSize * Math.cos(angle + Math.PI / 4)), (int) (tipY - arrowSize * Math.sin(angle + Math.PI / 4)));
    }

    private void limpiarCanvas() {
       
        Graphics g = Canvas.getGraphics();
    
        Canvas.setBackground(Color.WHITE);
        int width = Canvas.getWidth();
        int height = Canvas.getHeight();
        g.clearRect(0, 0, width, height);

        g.dispose();
    }

    private Icon icono(String ruta, int width, int height) {
        Icon img = new ImageIcon(new ImageIcon(getClass().getResource(ruta)).getImage().getScaledInstance(width, height, java.awt.Image.SCALE_SMOOTH));
        return img;
    }

    public void agregarDatosArrayList() {
        int n = lista.size();

        if (n != 0) {
            for (int i = 0; i < n; i++) {
                agregarDato(lista.get(i));
            }
        }
    }

    public void agregarDato(int valor) {

        arbol.insertaNodo(valor, arbol.getRaiz());
    }

    public void preOrden() {
        arbol.recorridoPreOrden(arbol.getRaiz());
    }

    public void postOrden() {
        arbol.recorridoPostOrden(arbol.getRaiz());
    }

    public void inOrden() {
        arbol.recorridoInorden(arbol.getRaiz());
    }

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
            java.util.logging.Logger.getLogger(InterfazMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InterfazMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InterfazMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InterfazMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InterfazMenu().setVisible(true);
            }
        });
    }
    //Parte Canvas


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Background;
    private javax.swing.JPanel Canvas;
    private javax.swing.JButton eliminarUnNumeroB;
    private javax.swing.JButton encontrarNodosNivelB;
    private javax.swing.JButton generarNumerosB;
    private javax.swing.JButton insertaNumerosB;
    private javax.swing.JButton insertarUnNumeroB;
    private javax.swing.JButton obtenerCodigoB;
    private javax.swing.JButton recorrerInOrdenB;
    private javax.swing.JButton recorrerPorNivelB;
    private javax.swing.JButton recorrerPostOrdenB;
    private javax.swing.JButton recorrerPreOrdenB;
    private javax.swing.JLabel titulo;
    // End of variables declaration//GEN-END:variables
}
