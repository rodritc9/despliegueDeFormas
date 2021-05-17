
package practicotres;

import java.awt.BorderLayout;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import javax.swing.JOptionPane;


public class Ejercicio3Prin extends javax.swing.JPanel {


    public Ejercicio3Prin() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        imagen2 = new javax.swing.JPanel();
        imagen1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        texto = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        escribirTexto = new javax.swing.JTextArea();

        imagen2.setPreferredSize(new java.awt.Dimension(200, 400));

        javax.swing.GroupLayout imagen2Layout = new javax.swing.GroupLayout(imagen2);
        imagen2.setLayout(imagen2Layout);
        imagen2Layout.setHorizontalGroup(
            imagen2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 200, Short.MAX_VALUE)
        );
        imagen2Layout.setVerticalGroup(
            imagen2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        imagen1.setPreferredSize(new java.awt.Dimension(200, 400));

        javax.swing.GroupLayout imagen1Layout = new javax.swing.GroupLayout(imagen1);
        imagen1.setLayout(imagen1Layout);
        imagen1Layout.setHorizontalGroup(
            imagen1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 200, Short.MAX_VALUE)
        );
        imagen1Layout.setVerticalGroup(
            imagen1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jLabel1.setText("Ingrese nombre del texto");

        jButton1.setText("Aceptar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jScrollPane1.setPreferredSize(new java.awt.Dimension(1000, 1000));

        escribirTexto.setTabSize(0);
        escribirTexto.setMargin(new java.awt.Insets(0, 0, 0, 0));
        jScrollPane1.setViewportView(escribirTexto);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(texto)
                        .addGap(30, 30, 30))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(45, 45, 45)
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)))
                .addComponent(imagen1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(imagen2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(imagen2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(imagen1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(88, 88, 88)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(texto, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(117, Short.MAX_VALUE))
            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try{
           String nombreTexto=(String)texto.getText();
            nombreTexto=nombreTexto+".txt";
            FileReader t= new FileReader(nombreTexto);
            BufferedReader bufer= new BufferedReader(t);   
            String s;

            while((s=bufer.readLine())!=null){
               
                escribirTexto.append(s);
                escribirTexto.append(System.getProperty("line.separator"));

            }

            cargarImagenes();
        }
        catch(IOException e){
            JOptionPane.showMessageDialog(null, "El nombre del texto no es valido", "Error", JOptionPane.WARNING_MESSAGE);
            texto.setText(null);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    void cargarImagenes(){
        Ejercicio1Aux imag1;
        imag1 = new Ejercicio1Aux(3); 
        imag1.setSize(this.imagen1.getWidth(), this.imagen1.getHeight());
        imag1.setLocation(0, 0);
        this.imagen1.add(imag1, BorderLayout.CENTER);
       
        Ejercicio1Aux imag2;
        imag2 = new Ejercicio1Aux(4); 
        imag2.setSize(this.imagen2.getWidth(), this.imagen2.getHeight());
        imag2.setLocation(0, 0);
        this.imagen2.add(imag2, BorderLayout.CENTER);
        this.repaint(); // este actualiza lo q seria el dibujo
       
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea escribirTexto;
    private javax.swing.JPanel imagen1;
    private javax.swing.JPanel imagen2;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField texto;
    // End of variables declaration//GEN-END:variables

}
