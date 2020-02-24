package cl.desafioLatam.desafio1;

import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;
import com.squareup.picasso.Picasso;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.View;
import android.widget.ImageView;

public class HomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);


        //View desafio2 parte 2
        ImageView imaged3 = findViewById(R.id.imageView2);
        Picasso.get().load("https://img2.freepng.es/20180606/fko/kisspng-vector-android-logo-encapsulated-postscript-icon-android-5b189f581d12d7.0842310315283403121191.jpg")
                .error(R.drawable.money_100dp)
                .into(imaged3);

    }

}
