/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package Social_Media;

/**
 *
 * @author Afad
 */
public class Main_SocialMedia {

    public static void main(String[] args) {
        Twitter twitter = new Twitter();
        Facebook facebook = new Facebook();
        Instagram instagram = new Instagram();
        WhatsApp whatsApp = new WhatsApp();
        
        twitter.chatting();
        twitter.post();
        
        facebook.chatting();
        facebook.post();
        
        instagram.chatting();
        instagram.post();
        instagram.story();
        
        whatsApp.chatting();
        whatsApp.story();
    }
}
