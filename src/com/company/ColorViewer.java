package com.company;
import javax.swing.*;

public class ColorViewer extends JFrame
{
    ColorComponent myComponent; //what is difference between JComponent myComponent and ColorComponent myComponent

    public ColorViewer()
    {
        this.myComponent = new ColorComponent();
        this.add(this.myComponent);
        this.setSize(400,400);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }
    public static void main(String[] args)
    {
        JFrame testingFrame = new ColorViewer();
    }
}
