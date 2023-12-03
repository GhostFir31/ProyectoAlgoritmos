/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.uabc.proyectoalgoritmos;

import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.sound.sampled.*;

public class Audio {

    private Clip clip;

    public Audio(String rutaAssets) {
        initializeClip(rutaAssets);
    }

    private void initializeClip(String rutaAssets) {
       File file = new File(rutaAssets+"inicio.wav");

        AudioInputStream audioStream = null;
        try {
            audioStream = AudioSystem.getAudioInputStream(file);
            clip = AudioSystem.getClip();
            clip.open(audioStream);
        } catch (UnsupportedAudioFileException | IOException | LineUnavailableException ex) {
            Logger.getLogger(Audio.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void playAudio() {
       
            clip.start();
        
    }

    public void stopAudio() {
        if (clip != null && clip.isRunning()) {
            clip.stop();
        }
    }

    public void resetAudio() {
        if (clip != null) {
            clip.stop();
            clip.setMicrosecondPosition(0);
        }
    }

    public boolean isAudioPlaying() {
        return clip != null && clip.isRunning();
    }
    
    
}
