package frasedodia.cursoandroid.com.frasedodia;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private TextView textoNovaFrase;
    private Button botaoNovaFrase;

    private String[] frases = {
            "Não fui eu que ordenei a você? Seja forte e corajoso!Não se apavore nem desanime, pois o Senhor, o seu Deus, estará com você por onde você andar Josué 1:9",
            "Porque sou eu que conheço os planos que tenho para vocês', diz o Senhor, 'planos de fazê-los prosperar e não de causar dano, planos de dar a vocês esperança e um futuro. Jeremias 29:11 "

    };



    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textoNovaFrase = findViewById(R.id.textoNovaFraseId);
        botaoNovaFrase = findViewById(R.id.botaoNovaFraseId);



        botaoNovaFrase.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Random randomico = new Random();

                int numeroAleatorio = randomico.nextInt(frases.length);

                if(numeroAleatorio == numeroAleatorio)
                {
                    textoNovaFrase.setText(frases[numeroAleatorio]);
                }else{
                    textoNovaFrase.setText(frases[numeroAleatorio]);

                }




            }
        });


    }
}
