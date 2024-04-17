import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MuteButton here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MuteButtonExample extends JFrame {
    private boolean muted = false;
    private JButton muteButton;

    public MuteButtonExample() {
        setTitle("Mute Button Example");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Create mute button
        muteButton = new JButton("Mute");
        muteButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                muted = !muted;
                if (muted) {
                    muteButton.setText("Unmute");
                    // Mute audio function call or set audio volume to 0
                    System.out.println("Audio muted");
                } else {
                    muteButton.setText("Mute");
                    // Unmute audio function call or set audio volume to normal
                    System.out.println("Audio unmuted");
                }
            }
        });

        // Add mute button to the frame
        setLayout(new FlowLayout());
        add(muteButton);

        setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new MuteButtonExample();
            }
        });
    }
}
