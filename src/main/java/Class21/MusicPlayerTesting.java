package Class21;

public class MusicPlayerTesting {
    public static void main(String[] args) {
        MusicPlayer[] MP = {
                new MP3Player("Give me a reason", "PINK"),
                new CDPlayer("Timpul", "Meland & Godina"),
                new StreamingPlayer("Acasa", "Irina Rimes")};
        for (MusicPlayer music : MP) {
            music.play();
            music.pause();
            music.stop();
            music.printInfo();
            System.out.println("*******************");
        }
    }
}
