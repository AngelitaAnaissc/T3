package com.example.anaisexament3;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView recycler_view = findViewById(R.id.recycler_view);
        recycler_view.setHasFixedSize(true);
        LinearLayoutManager manager = new LinearLayoutManager(this);
        recycler_view.setLayoutManager(manager);

        int [] images = {R.drawable.image1,R.drawable.image2,R.drawable.image3,R.drawable.image4,R.drawable.image5,R.drawable.image6,R.drawable.image7,
                R.drawable.image8,R.drawable.image9,R.drawable.image10};

        adapterAnime adapterList = new adapterAnime(listaAnime(),images);
        recycler_view.setAdapter(adapterList);
    }


    List<animeClass> listaAnime() {

        List<animeClass> list = new ArrayList<>();

        list.add(new animeClass(
                        "Shingeki no Kyojin",
                        "Con Eren y compañía ahora en la costa y la amenaza de Marley acechando, ¿que sigue para los Scouts y su búsqueda para desentrañar los misterios de los Titanes, la humanidad y mas?",
                        false
                )
        );
        list.add(new animeClass(
                        "Naruto Shippuden",
                        "Naruto Shippuden / Shippuuden Pasan dos años después de que Naruto y Sakura se fueran a entrenar cada uno con su maestro sannin, en este caso, Naruto se fue con Jiraya y Sakura con Tsunade",

                        false
                )
        );
        list.add(new animeClass(
                        "One Piece",
                        "Una historia épica de piratas, donde narra la historia de Monkey D. Luffy quien cuando tenia 7 años, comió accidentalmente una Akuma no mi (Fruta del diablo) la cual le convirtió en un hombre de goma.",

                        false
                )
        );
        list.add(new animeClass(
                        "Maou Gakuin no Futekigousha",
                        "El tiránico y legendario Rey Demonio se reencarna tras 2000 años. Para su desgracia, sus aptitudes como Rey Demonio le llevan a la academia en la que entrenan los candidatos a nuevo Rey Demonio",

                        false
                )
        );
        list.add(new animeClass(
                        "Black Clover",
                        "Hay un mundo en donde la magia lo es todo. Asta y Yuno crecieron en una iglesia, y el día que cumplieron 15 años participaron en una ceremonia en donde les concedieron grimores los cuales despiertan los poderes mágicos innatos",

                        false
                )
        );
        list.add(new animeClass(
                        "Kanojo, Okarishimasu",
                        "Kazuya Kinoshita es un joven universitario de 20 años que tras conseguir novia, pudo besarla, ¡pero lo dejó tras solo un mes!. Maldita sea, no quiero tener que volver a pasar por eso",

                        false
                )
        );
        list.add(new animeClass(
                        "Jujutsu Kaisen",
                        "En un mundo donde los demonios se alimentan de humanos desprevenidos, fragmentos del legendario y temido demonio Ryoumen Sukuna se perdieron y se dispersaron. Si algún demonio consume partes del cuerpo de Sukuna.",

                        false
                )
        );
        list.add(new animeClass(
                        "Kimetsu no Yaiba",
                        "Estamos en la era Taisho de Japón. Tanjiro, un joven que se gana la vida vendiendo carbón, descubre un día que su familia ha sido asesinada por un demonio. Para empeorar las cosas, su hermana menor Nezuko, la única superviviente de la masacre.",

                        false
                )
        );
        list.add(new animeClass(
                        "Tonikaku Kawaii",
                        "Una comedia de vida matrimonial obra de Kenjiro Hata, autor de Hayate the Comat Butler y que ¡al fin da el salto al anime! Nasa Yuzaki se enamora a primera vista tras conocer a la misteriosa Tsukasa.",

                        false
                )
        );
        list.add(new animeClass(
                        "Sword Art Online",
                        "Escapar es imposible hasta terminar el juego; un game over significaría una verdadera muerte. Sin saber la verdad de la siguiente generación del Multijugador Masivo Online, 'Sword Art Online(SAO)', con 10 mil usuarios unidos juntos abriendo las cortinas para esta cruel batalla a muerte.",

                        false
                )
        );

        return list;

    }
}