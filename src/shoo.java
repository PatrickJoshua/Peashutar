
import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.QuadCurve2D;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author patrickjoshuasaguinsin
 */
public class shoo extends javax.swing.JPanel {

    /**
     * Creates new form shoo
     */
    public shoo() {
        initComponents();
    }
    
    @Override
    public void paintComponent(Graphics g) {
        Graphics2D g2 = (Graphics2D)g;
        g2.setStroke(new BasicStroke(10));
        
        //oval head
        Color darkgreen = new Color(0,90,0);
        g2.setColor(darkgreen);
        g2.drawOval(141, 90, 235, 219);
        g2.setColor(new Color(230,250,113));
        //g2.fillOval(141, 90, 235, 219);
        
        //head gradient fill
        GradientPaint green2light = new GradientPaint(200,150,new Color(231,254,117),350,219,new Color(147,207,47));
        g2.setPaint(green2light);
        g2.fillOval(141, 90, 235, 219);
        
        //eyes back white
        g2.setColor(Color.white);
        g2.rotate(Math.toRadians(-35));     //-35º
        g2.fillOval(105, 258, 47, 63);
        g2.fillOval(170, 288, 27, 43);
        
        //eyes black
        g2.setColor(Color.BLACK);
        g2.fillOval(105, 255, 47, 63);
        g2.fillOval(170, 285, 27, 43);
        
        //eyes reflection white
        g2.setColor(Color.white);
        g2.rotate(Math.toRadians(20));      //-15º
        g2.fillOval(200, 200, 22, 30);
        g2.fillOval(265, 210, 12, 20);
        
        //mouth
        g2.setColor(darkgreen);
        g2.rotate(Math.toRadians(30));      //15º
        g2.setStroke(new BasicStroke(7));
        g2.drawOval(395, 25, 122, 160);
        
        //mouth fill
        g2.setColor(new Color(147,207,47));
        g2.fillOval(391, 28, 125, 155);
        
        //darkgreen mouth fill outline
        g2.setColor(darkgreen);
        g2.fillOval(430, 50, 72, 110);
        
        //lighter green mouth fill
        g2.setColor(new Color(102,153,0));      //lighter middle green
        g2.fillOval(437, 54, 68, 102);
        
        //back to normal rotation
        g2.rotate(Math.toRadians(-15));     //0º
        //minus 60 for original coordinates
        
        //white head glare inner curve outline
        g2.setStroke(new BasicStroke(1));
        g2.setColor(Color.white);
        QuadCurve2D qc = new QuadCurve2D.Double(171, 205, 178, 128, 263, 97);
        g2.draw(qc);
        
        //white head glare outer curve outline
        qc = new QuadCurve2D.Double(149, 187, 172, 104, 263, 97);
        g2.draw(qc);
        g2.drawLine(172, 205, 149, 187);    //closing line
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
