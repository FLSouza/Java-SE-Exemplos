# Adapter Pattern

Faz parte do grupo Structural Pattern. Funciona como uma ponte entre duas interfaces incompatíveis. Envolve uma classe que é responsável por juntar as funcionalidades de interfaces incompatíveis.

TODO: Para ver a real vantagem de adapter, você precisar mostrar um método que espera uma interface, mas o objeto que você
      tem é de outra. Exemplo:

      // suponha que essa classe é provida pela plataforma
      class MusicSystem {
          void setDefaultMediaPlayer(MediaPlayer player);
          void playMusicInBackground(String musicFile);
      }

      // suponha que eu uso uma biblioteca de música porque ela suporta vários codecs que eu preciso
      // e esse método é um callback que eu tenho que implementar para interagir com a biblioteca
      void onPlayerReady(MusicPlayer musicPlayer) {

          // só que a biblioteca me dá uma classe de MusicPlayer, enquanto a plataforma precisa de MediaPlayer
          // solução: use um adapter!
          mediaPlayer = new MediaPlayerAdapter(musicPlayer);

          system = MusicSystem.getInstance();
          system.setDefaultMediaPlayer(mediaPlayer);
          system.playMusicInBackground("music.mp3");
      }
