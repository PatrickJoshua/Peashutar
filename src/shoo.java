
import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.geom.CubicCurve2D;
import java.awt.geom.GeneralPath;
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
        RenderingHints rh = new RenderingHints(
             RenderingHints.KEY_ANTIALIASING,
             RenderingHints.VALUE_ANTIALIAS_ON);
        g2.setRenderingHints(rh);
        GeneralPath gp;
        Color outline = new Color(0,90,0);
        
        //stem
        g2.setColor(outline);
        gp = new GeneralPath(GeneralPath.WIND_EVEN_ODD);
        gp.moveTo(204, 322);
        gp.quadTo(178, 384, 230, 456);
        gp.lineTo(255, 452);
        gp.quadTo(212, 394, 228, 332);
        gp.closePath();
        g2.setStroke(new BasicStroke(10));
        g2.draw(gp);
        GradientPaint darkstem = new GradientPaint(212,334,new Color(150,209,48),238,440,new Color(145,206,47));
        g2.setPaint(darkstem);
        g2.fill(gp);
        
        //stem gradient highlight
        gp = new GeneralPath(GeneralPath.WIND_EVEN_ODD);
        gp.moveTo(202,350);
        gp.quadTo(195, 400, 233, 450);
        gp.lineTo(238, 448);
        gp.quadTo(200,398,208,352);
        gp.closePath();
        GradientPaint gpnt = new GradientPaint(200,338,new Color(234,254,117),240,450,new Color(184,231,68));
        g2.setPaint(gpnt);
        g2.fill(gp);
        g2.draw(gp);
        
        //front leaf base
        g2.setStroke(new BasicStroke(5));
        gp = new GeneralPath(GeneralPath.WIND_EVEN_ODD);
        gp.moveTo(236,455);
        gp.curveTo(270, 404, 352, 414, 357, 465);
        gp.curveTo(358, 494, 251, 509, 236,455);
        //g2.setPaint(new GradientPaint(304,426,new Color(169,229,60),304,464,new Color(102,204,0)));
        Color leafbase = new Color(53,157,0);
        g2.setColor(leafbase);
        g2.fill(gp);
        g2.setColor(outline);
        g2.draw(gp);
        
        //front leaf right highlight
        gp = new GeneralPath(GeneralPath.WIND_EVEN_ODD);
        gp.moveTo(245,455);
        gp.curveTo(275, 415, 352, 419, 357, 465);
        gp.curveTo(358, 494, 255, 500, 245,455);
        g2.setPaint(new GradientPaint(304,426,new Color(169,229,60),304,464,new Color(102,204,0)));
        g2.fill(gp);
        
        //front right leaf crease
        gp = new GeneralPath(GeneralPath.WIND_EVEN_ODD);
        gp.moveTo(258,433);
        gp.quadTo(298, 424, 319, 442);
        gp.quadTo(290, 426, 247, 443);
        //gp.closePath();
        g2.setColor(outline);
        g2.fill(gp);
        
        //front leaf left base
        gp = new GeneralPath(GeneralPath.WIND_EVEN_ODD);
        gp.moveTo(229, 458);
        gp.curveTo(207, 410, 130, 395, 118, 472);
        gp.curveTo(119, 503, 212, 528, 229, 458);
        //g2.setPaint(new GradientPaint(164,424,new Color(169,229,60),164,466,new Color(102,204,0)));
        g2.setColor(leafbase);
        g2.fill(gp);
        g2.setColor(outline);
        g2.draw(gp);
        
        //front leaf left highlight
        gp = new GeneralPath(GeneralPath.WIND_EVEN_ODD);
        gp.moveTo(220, 458);
        gp.curveTo(204, 426, 135, 395, 122, 472);
        gp.curveTo(122, 503, 210, 518, 220, 458);
        g2.setPaint(new GradientPaint(164,424,new Color(169,229,60),164,466,new Color(102,204,0)));
        g2.fill(gp);
        
        //front left leaf crease
        gp = new GeneralPath(GeneralPath.WIND_EVEN_ODD);
        gp.moveTo(204,431);
        gp.quadTo(175, 422, 154, 444);
        gp.quadTo(183, 425, 218, 441);
        g2.setColor(outline);
        g2.fill(gp);
        
        //neck
        g2.setColor(outline);
        g2.setStroke(new BasicStroke(8));
        gp = new GeneralPath(GeneralPath.WIND_EVEN_ODD);
        gp.moveTo(188, 290);
        gp.curveTo(178, 326, 244, 352, 256, 312);
        g2.draw(gp);
        g2.setColor(new Color(51,102,0));
        gp.closePath();
        g2.fill(gp);
        
        //oval head
        g2.setStroke(new BasicStroke(10));
        g2.setColor(outline);
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
        g2.setColor(outline);
        g2.rotate(Math.toRadians(30));      //15º
        g2.setStroke(new BasicStroke(7));
        g2.drawOval(396, 25, 122, 160);
        
        //mouth fill
        g2.setColor(new Color(147,207,47));
        g2.fillOval(391, 28, 125, 155);
        
        //darkgreen mouth fill outline
        g2.setColor(outline);
        g2.fillOval(430, 50, 72, 110);
        
        //lighter green mouth fill
        g2.setColor(new Color(102,153,0));      //lighter middle green
        g2.fillOval(437, 54, 68, 102);
        
        //back to normal rotation
        g2.rotate(Math.toRadians(-15));     //0º
        //minus 60 for original coordinates
        
        //inner black mouth outline
        g2.setStroke(new BasicStroke(1));
        g2.setColor(Color.BLACK);
//        CubicCurve2D cc = new CubicCurve2D.Double(414, 183, 454, 177, 442, 277, 398, 257);
//        g2.draw(cc);
//        cc = new CubicCurve2D.Double(414, 183, 406, 187, 380, 219, 398, 257);
//        g2.draw(cc);
        gp = new GeneralPath(GeneralPath.WIND_EVEN_ODD);
        gp.moveTo(414, 183);
        gp.curveTo(454, 177, 442, 277, 398, 257);
        gp.curveTo(380, 219, 406, 187, 414, 183);
        gp.closePath();
        g2.fill(gp);
        
        //white head glare inner curve outline
        g2.setStroke(new BasicStroke(1));
        g2.setColor(Color.white);
        QuadCurve2D qc = new QuadCurve2D.Double(171, 205, 178, 128, 263, 97);
        g2.draw(qc);
        
        //white head glare outer curve outline
        qc = new QuadCurve2D.Double(149, 187, 172, 104, 263, 97);
        g2.draw(qc);
        g2.drawLine(172, 205, 149, 187);    //closing line
        
        //white head glare gp
        gp = new GeneralPath(GeneralPath.WIND_EVEN_ODD);
        gp.moveTo(171, 205);
        gp.quadTo(178, 128, 263, 97);
        gp.quadTo(172, 104, 149, 187);
        gp.closePath();
        g2.fill(gp);
        
        //head shadow
        g2.setColor(new Color(147,207,47));
        gp = new GeneralPath(GeneralPath.WIND_EVEN_ODD);
        gp.moveTo(152, 224);
        gp.quadTo(210, 312, 348, 250);
        gp.curveTo(302, 344, 168, 302, 152, 224);
        gp.closePath();
        g2.fill(gp);
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
