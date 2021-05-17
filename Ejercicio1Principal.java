
package practicotres;

import java.awt.BorderLayout;
import java.awt.Insets;
import javax.swing.JOptionPane;


public class Ejercicio1Principal extends javax.swing.JPanel {


    public Ejercicio1Principal() {
        initComponents();
        porcentajeCirc.setText("80");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        nLineas = new javax.swing.JTextField();
        porcentajeCirc = new javax.swing.JTextField();

        setPreferredSize(new java.awt.Dimension(800, 400));

        javax.swing.GroupLayout panelLayout = new javax.swing.GroupLayout(panel);
        panel.setLayout(panelLayout);
        panelLayout.setHorizontalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 346, Short.MAX_VALUE)
        );
        panelLayout.setVerticalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 346, Short.MAX_VALUE)
        );

        jLabel1.setText("Ingrese Número de Lineas");

        jButton1.setText("Aceptar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel3.setText("Ingrese % de circunferencia");

        porcentajeCirc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                porcentajeCircActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 336, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nLineas, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(porcentajeCirc, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addComponent(jButton1)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 48, Short.MAX_VALUE)
                .addComponent(panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(55, 55, 55))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(53, 53, 53)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(nLineas, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(porcentajeCirc, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(40, 40, 40)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(26, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        try{
        int numeroLineas = Integer.parseInt(nLineas.getText());
        int porcentaje=Integer.parseInt(porcentajeCirc.getText());
        if(numeroLineas>5000 || numeroLineas<4){
            throw new MisException("2"); 
        }
        dibujar(numeroLineas,porcentaje);
        }
        catch(NumberFormatException e){
            JOptionPane.showMessageDialog(null, "Ingrese valores enteros", "Error", JOptionPane.WARNING_MESSAGE);
            nLineas.setText(null);
            porcentajeCirc.setText("80");
        }
         catch(MisException e){
            nLineas.setText(null);
            porcentajeCirc.setText("80");
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void porcentajeCircActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_porcentajeCircActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_porcentajeCircActionPerformed

   void  dibujar(int numeroLineas, int porcentaje){
       
        this.panel.removeAll();
        Ejercicio1Aux aux;
        aux = new Ejercicio1Aux(numeroLineas,porcentaje,1,1);
        aux.setSize(this.panel.getWidth(), this.panel.getHeight());
        aux.setLocation(0, 0);
        
        this.panel.add(aux, BorderLayout.CENTER);

       // this.revalidate(); //PREGUNTAR BN PARA Q FUNCIONA
        this.repaint(); // este actualiza lo q seria el dibujo
        //
       // updateUI(); //este metodo es como q actualiza toda la interfaz
   
   }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JTextField nLineas;
    private javax.swing.JPanel panel;
    private javax.swing.JTextField porcentajeCirc;
    // End of variables declaration//GEN-END:variables


}
