package es.miguel.glide;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.GridView;

/**
 * Created by miguel on 19/02/18.
 */

public class Avanzado extends AppCompatActivity {

    GridView gridView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.avanzado);

        gridView = (GridView) findViewById(R.id.grid_view);
        gridView.setAdapter(new Adaptador(this));

    }
}
