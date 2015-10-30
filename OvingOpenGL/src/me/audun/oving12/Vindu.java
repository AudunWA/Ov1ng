package me.audun.oving12;

import com.jogamp.opengl.awt.GLCanvas;

import javax.swing.*;

/**
 * Created by Audun on 30.10.2015.
 */
public class Vindu extends JFrame {
    public Vindu(String tittel) {
        setTitle(tittel);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        GLCanvas canvas = new GLCanvas();
        canvas.setBounds(0, 0, 500, 500);
        TegningOv1_1JOGL tegningen = new TegningOv1_1JOGL(canvas);
        add(canvas);
        pack();
    }

}
