package main;

import frames.Main_Frame;

public class Main {
    
    private static Main_Frame mainFrame;
    
    public static void main(String[] args) {
        mainFrame = new Main_Frame();
        mainFrame.setVisible(true);
    }
    
    public static Main_Frame getMain_Frame() {
        return mainFrame;
    }
}
