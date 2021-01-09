package com.company;
import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JComponent;
import javax.swing.*;
import java.awt.*;

public class ColorComponent extends JComponent
{
    //so when the the method below is written as public void paintComponent(Graphics g) then we are just changing
    //a base method from the java.swing.JComponent,,,paintComponent(Graphics g)
    public void paintComponent(Graphics g)
    {
        Color[] colors = new Color[12]; //Creating an array with size 12

        //Initializing the values of the color array
        colors[0] = Color.red;
        colors[1] = Color.blue;
        colors[2] = Color.yellow;
        colors[3] = Color.green;
        colors[4] = Color.cyan;
        colors[5] = Color.pink;
        colors[6] = Color.gray;
        colors[7] = Color.magenta;
        colors[8] = Color.black;
        colors[9] = Color.orange;
        colors[10] = Color.lightGray;
        colors[11] = Color.darkGray;

        for(int i = 0; i < colors.length; i++)
        {
            g.setColor(colors[i]);
            g.drawString("Color No. :" + (i + 1), 1 * 20, 20 + i * 20);
        }
        g.drawString("Hello", 20,300);
    }
}
