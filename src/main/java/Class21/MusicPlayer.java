package Class21;
/*
Music Player System: Create a class MusicPlayer with methods like play(), pause(), stop(),
and fields such as currentTrack and volume. Implement subclasses for different types of music players,
like MP3Player, CDPlayer, and StreamingPlayer, each with their unique implementations of the play()
method (e.g., streaming from the internet, playing from a CD).
 */

public abstract class MusicPlayer {
    private String song;
    private String singer;

    public MusicPlayer(String song, String singer) {
        this.song = song;
        this.singer = singer;
    }

    public abstract void play();

    public abstract void pause();

    public void stop() {
        System.out.println("Stop at the song number 3");
    }

    public void printInfo() {
        System.out.println("This song " + song + " is singing by " + singer);
    }
}
   class MP3Player extends MusicPlayer {
      public  MP3Player(String song, String singer) {
            super(song,singer);
        }
        @Override
        public void play(){
            System.out.println("Play the song from the beginning");
        }

       @Override
       public void pause() {
           System.out.println("Stop the song at minute 2:37");
      }

       @Override
       public void stop() {
           System.out.println("Stop when the battery has 5% left.");
       }
   }
    class CDPlayer extends MusicPlayer{
    public CDPlayer(String song,String singer){
        super(song,singer);
    }

        @Override
        public void play() {
            System.out.println("Play CD number 5.");
        }

        @Override
        public void pause() {
            System.out.println("Pause at the end of CD number 5.");
        }

        @Override
        public void stop() {
            System.out.println("Stop playing if the CD has a scratch.");
        }
    }
class StreamingPlayer extends MusicPlayer{
    StreamingPlayer(String song, String singer){
        super(song,singer);
    }

    @Override
    public void play() {
        System.out.println("Alexa play music from youtube about Christmas.");
    }

    @Override
    public void pause(){
        System.out.println("Alexa stop playing when the phone is ringing.") ;
    }

    @Override
    public void stop() {
        System.out.println("Stop playing when the computer goes to sleep.");
    }
}
