package josevilla.ioc.cat.eac3_p3_villa_jose;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    //View
    private ImageView theSimpsons0;
    private ImageView theSimpsons1;
    private ImageView theSimpsons2;
    private ImageView homerSimpson;
    private ImageView engranatgeVermell;
    private ImageView engranatgeVerd;
    private ImageView engranatgeBlau;
    private ImageView ull;
    private ImageView donut;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Obtenim els id dels view
        theSimpsons0 = findViewById(R.id.simpsons_0);
        theSimpsons1 = findViewById(R.id.simpsons_1);
        theSimpsons2 = findViewById(R.id.simpsons_2);
        homerSimpson = findViewById(R.id.homer_simpson);
        engranatgeVermell = findViewById(R.id.engranatge_vermell);
        engranatgeVerd = findViewById(R.id.engranatge_verd);
        engranatgeBlau = findViewById(R.id.engranatge_blau);
        ull = findViewById(R.id.ull);
        donut = findViewById(R.id.donut);

        //Amaguem les imatges al inici
        amagaVistes();

        theSimpsons2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Verifiquem si están visibles les images
                //Només amb una és suficient
                if (ull.isShown()) {
                    amagaVistes();
                } else {
                    mostraVistes();
                }
            }
        });

    }

    /**
     * Amaga les imatges
     */
    private void amagaVistes() {
        engranatgeVermell.setVisibility(View.INVISIBLE);
        engranatgeVerd.setVisibility(View.INVISIBLE);
        engranatgeBlau.setVisibility(View.INVISIBLE);
        ull.setVisibility(View.INVISIBLE);
        donut.setVisibility(View.INVISIBLE);
    }

    /**
     * Mostra les imatges
     */
    private void mostraVistes() {
        engranatgeVermell.setVisibility(View.VISIBLE);
        engranatgeVerd.setVisibility(View.VISIBLE);
        engranatgeBlau.setVisibility(View.VISIBLE);
        ull.setVisibility(View.VISIBLE);
        donut.setVisibility(View.VISIBLE);
    }

}
