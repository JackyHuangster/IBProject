package io.github.jackyhuangster;

import javax.swing.*;

public class IBProject {
    public static void main(String[] args ) {
        JFrame window = new JFrame("IBProject");
        window.setSize(1280, 720);
        window.setVisible(true);
        Icon icon = new ImageIcon(IBProject.class.getResource("SVT.gif"));
        Icon icontwo = new ImageIcon(IBProject.class.getResource("SVT.gif"));
        JLabel loadingImage = new JLabel(icon);
        loadingImage.setSize(1280, 720);
        //window.add(loadingImage);
        window.add(loadingImage, 0);
        window.setVisible(true);
        try{
            Thread.sleep(5000);
        } catch(Exception e) {
            e.printStackTrace();
        }
        loadingImage.setVisible(false);
        window.setVisible(false);
        JLabel loadingImageTwo = new JLabel(icontwo);
        loadingImageTwo.setSize(1280, 720);
        //window.add(loadingImageTwo);
        window.add(loadingImageTwo, 0);
        window.setVisible(true);


    }
}
