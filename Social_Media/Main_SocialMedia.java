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
