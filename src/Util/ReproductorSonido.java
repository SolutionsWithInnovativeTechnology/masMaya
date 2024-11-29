package Util;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;

public class ReproductorSonido {
    private Clip clip;

    public ReproductorSonido() {
    }
    
    public void cargarSonido(String direccion)
    {
        try{
            InputStream aux = getClass().getResourceAsStream(direccion);
            
            if(aux != null){
                BufferedInputStream path = new BufferedInputStream(aux);
            
                clip = AudioSystem.getClip();
                clip.open(AudioSystem.getAudioInputStream(path));
                clip.start();
            }
            else{
                System.out.println("No se pudo cargar el recurso: " + direccion);
            }
        }catch(IOException | LineUnavailableException | UnsupportedAudioFileException e){
            System.out.println(e.getMessage());
        }   
//        try{
//            AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(url.openStream());
//            clip = AudioSystem.getClip();
//            clip.open(audioInputStream);
//        }catch(IOException | LineUnavailableException | UnsupportedAudioFileException e){
//            System.out.println(e.getMessage());
//        }
    }
    
    public void reproducir(){
        if(clip != null)
        {
            clip.start();
        }
    }
    
    public void detener(){
        if(clip != null && clip.isRunning())
        {
            clip.stop();
        }
    }
}