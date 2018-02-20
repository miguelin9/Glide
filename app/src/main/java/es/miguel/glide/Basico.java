package es.miguel.glide;

import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

import java.io.File;

/**
 * Created by miguel on 19/02/18.
 */

public class Basico extends AppCompatActivity {

    ImageView internet, memoria, gif;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.basico);

        internet = (ImageView) findViewById(R.id.iv_basico_internet);
        memoria = (ImageView) findViewById(R.id.iv_basico_memoria);
        gif = (ImageView) findViewById(R.id.iv_basico_gif);

        Glide.with(this)
                .load("http://www.nationalgeographic.it/images/2017/02/17/121845769-5cd70c95-e40c-4fb6-99fa-955e334fa62b.jpg")
                .placeholder(R.drawable.cargando)
                .error(android.R.drawable.ic_delete)
                .into(internet);

        Glide.with(this)
                .load(Uri.fromFile(new File("/storage/emulated/0/glide/ardilla.jpg")))
                .placeholder(R.drawable.cargando)
                .error(android.R.drawable.ic_delete)
                .into(memoria);

        Glide.with(this)
                .load("https://annewise13.files.wordpress.com/2015/03/e8nzc.gif?w=300&h=296")
                .asGif()
                .placeholder(R.drawable.cargando)
                .error(android.R.drawable.ic_delete)
                .into(gif);

    }

}
