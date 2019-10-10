package thallytasannara.tsoftware.com.signos;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends Activity {

        private ListView listaSignos;
        String[] signos = {
       "Aries", "Touro", "Gemeos", "Libra", "Virgem" , "Leão", "Peixes", "Aquario", "Capricornio", "Sargitario",
                "cancer", "escorpião"
    };

        String[] perfis ={"..", "...", "....",".....", ".....", "......","..", "...", "....",".....", ".....","...."};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listaSignos = (ListView) findViewById(R.id.listasignosid);

        ArrayAdapter<String> adaptador = new ArrayAdapter<String>(
            getApplicationContext(),
                    android.R.layout.simple_list_item_1,
                    android.R.id.text1,
                    signos
        );

        listaSignos.setAdapter(adaptador);

        listaSignos.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                int codigopodicao = position;
                Toast.makeText(getApplicationContext(), perfis[codigopodicao], Toast.LENGTH_LONG).show();
            }
        });

    }
}
