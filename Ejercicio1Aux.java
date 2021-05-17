
package practicotres;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;


public class Ejercicio1Aux extends javax.swing.JPanel {


    public Ejercicio1Aux(int lineas, int porcentaje, int ejercicio, int auxil) {
        initComponents();
        this.lineas=lineas;
        this.porcentaje=porcentaje;
        this.ejercicio=ejercicio;
        this.auxil=auxil;
    }
    
    public Ejercicio1Aux(int ejercicio) {
        initComponents();
        this.ejercicio=ejercicio;
    }
 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 346, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 346, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    @Override
    public void paintComponent(Graphics g){
      super.paintComponent(g);
      Color color_creado;
       switch(ejercicio){
           
           case 1:
                double ancho=(this.getWidth()/2);
                double alto=(this.getHeight()/2);
                int aux1;
                int aux2;
                double aux3=((double)porcentaje)/100;
                double ang=(360/(double)lineas)*(Math.PI)/180;
                double modulo=(double)(this.getWidth())*aux3/2;
                for(int i=0; i<lineas;i++){
                    int r = (int) (Math.random() * 255);
                    int gg = (int) (Math.random() * 255);
                    int b = (int) (Math.random() * 255);
                   color_creado = new Color(r,gg,b);
                    g.setColor(color_creado);
                    aux1=(int)(ancho+(modulo*Math.cos(ang*i)));
                    aux2=(int)(alto-(modulo*Math.sin(ang*i)));
                    g.drawLine((int)ancho, (int)alto, aux1,aux2);
                }
                aux1=(int)((1-aux3)*alto);
                aux2=(int)(((double)porcentaje)/100*alto*2);
                g.drawOval(aux1,aux1,aux2,aux2);
                break;
                
           case 2:
              
                Graphics2D g2d =(Graphics2D) g; //se hace una especie de casteo desde g a una g2D
                g2d.setStroke(new BasicStroke( porcentaje ) ); //con esto cambio el espesor de la linea
                   
                // g2d.setPaint( Color.RED ); esto serria para setearle el color y dibujar con la 2D
                //g2d.draw( new Line2D.Double( 20, 20.5, 200, 200 ) ); 
                
                int aux=(int)((((double)(this.getWidth()-auxil))/(((double)lineas)))/2);
        
                for(int i=0;i<lineas;i++){
                    int r = (int) (Math.random() * 255);
                    int gg = (int) (Math.random() * 255);
                    int b = (int) (Math.random() * 255);
                    color_creado = new Color(r,gg,b);
                    g.setColor(color_creado);
                    g.drawOval(auxil+(i*aux), auxil+(i*porcentaje), (this.getWidth()-auxil-(int)(1.5*((double)porcentaje)))-(aux*i*2), (this.getWidth()-auxil-(int)(1.5*((double)porcentaje)))-(aux*i*2));
                }
                color_creado = new Color(205,120,50);
                g.setColor(color_creado);
                g.drawRect(((int)((((double)porcentaje)*0.5))), ((int)((((double)porcentaje)*0.5))), this.getWidth()-porcentaje, this.getWidth()-porcentaje);

                break;
                
                case 3:
                   int xInicial;
                   int yInicial;
                   int xFinal;
                   int yFinal;
                   int r;
                   int gg;
                   int b;
                
                for(int i=0;i<2;i++){
                   xInicial=(int) (Math.random() * (((double)this.getWidth())/2));
                   yInicial=(int) (Math.random() * (((double)this.getHeight())/2));
                   xFinal=(int) (Math.random() * (((double)this.getWidth())-(((double)this.getWidth())/2))+(((double)this.getWidth())/2));
                   yFinal=(int) (Math.random() *(((double)this.getHeight())-(((double)this.getHeight())/2))+(((double)this.getHeight())/2));
                    r = (int) (Math.random() * 255);
                    gg = (int) (Math.random() * 255);
                    b = (int) (Math.random() * 255);
                    color_creado = new Color(r,gg,b);
                    g.setColor(color_creado);
                    g.drawLine(xInicial, yInicial, xFinal, yFinal);
                    }
                for(int i=0;i<2;i++){
                   xInicial=(int) (Math.random() * (((double)this.getWidth())/2));
                   yInicial=(int) (Math.random() * (((double)this.getHeight())/2));
                    r = (int) (Math.random() * 255);
                    gg = (int) (Math.random() * 255);
                    b = (int) (Math.random() * 255);
                    color_creado = new Color(r,gg,b);
                    g.setColor(color_creado);
                    //g.drawRect(xInicial, yInicial, xFinal, yFinal);
                    g.fillRect(xInicial, yInicial, xInicial, xInicial);
                    }
                for(int i=0;i<2;i++){
                   xInicial=(int) (Math.random() * (((double)this.getWidth())/2));
                   yInicial=(int) (Math.random() * (((double)this.getHeight())/2));
                    r = (int) (Math.random() * 255);
                    gg = (int) (Math.random() * 255);
                    b = (int) (Math.random() * 255);
                    color_creado = new Color(r,gg,b);
                    g.setColor(color_creado);
                     //g.drawOval(xInicial, yInicial, xFinal, yFinal);
                     g.fillOval(xInicial, yInicial, xInicial, xInicial);
                    }
                break;
                
           case 4:
             
               String figura="gym.jpg";
               Image ima= getToolkit().getImage(figura);
               g.drawImage(ima, 0, 0,this.getWidth(),this.getHeight(), this);
            break;
                
           default:
               break;
        }
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
    private int lineas;
    private int porcentaje;
    private int ejercicio;
    private int auxil;
}
