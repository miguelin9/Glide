package es.miguel.glide;

import android.content.Context;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

import java.io.File;

/**
 * Created by miguel on 19/02/18.
 */
public class Adaptador extends BaseAdapter {
    // Contexto de la aplicación
    private Context mContext;

    // Array de identificadores
    private String[] lista = {
            "/storage/emulated/0/glide/ardilla.jpg",
            "/storage/emulated/0/glide/caballos.jpg",
            "/storage/emulated/0/glide/caracol.jpg",
            "/storage/emulated/0/glide/gatos.jpg",
            "/storage/emulated/0/glide/koala.jpg",
            "/storage/emulated/0/glide/leon.jpg",
            "/storage/emulated/0/glide/panda.jpg",
            "/storage/emulated/0/glide/perro.jpg",
            "/storage/emulated/0/glide/serpiente.jpg",
            "/storage/emulated/0/glide/tigre.jpg"
    };

    public Adaptador(Context c) {
        mContext = c;
    }

    @Override
    public int getCount() {
        return lista.length;
    }

    @Override
    public Object getItem(int position) {
        return lista[position];
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    public View getView(int position, View convertView, ViewGroup parent) {
        //ImageView a retornar
        ImageView imageView;

        if (convertView == null) {
            /*
            Crear un nuevo Image View de 90x90
            y con recorte alrededor del centro
             */
            imageView = new ImageView(mContext);
//            imageView.setLayoutParams(new GridView.LayoutParams(90,90));
            imageView.setScaleType(ImageView.ScaleType.CENTER);
        } else {
            imageView = (ImageView) convertView;
        }

        //Setear la imagen desde el array que tiene la ruta
        Glide.with(mContext)
                .load(Uri.fromFile(new File((String)getItem(position))))
                .into(imageView);

        return imageView;
    }

}

