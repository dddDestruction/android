package cl.desafioLatam.desafio1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.Toast;

import com.squareup.picasso.Picasso;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {


    private void open(){
        Intent i = new Intent(this,HomeActivity.class);
        startActivity(i);
        Toast.makeText(MainActivity.this, "Usuario ingresado con éxito", Toast.LENGTH_SHORT).show();
    }
    private void openRegistro(){
        Intent i = new Intent(this,RegisterActivity.class);
        startActivity(i);
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //View desafio1
        ImageView ivBasicImage = (ImageView) findViewById(R.id.imageView);
        Picasso.get().load("http://blog.desafiolatam.com/wp-content/uploads/2019/02/logo.png")
                //.error(R.drawable.ic_launcher_foreground)
                .into(ivBasicImage);
        Button  button = findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick (View v){
                open();
            }
        });
        Button  registro = findViewById(R.id.button3);
        registro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick (View v){
                openRegistro();
            }
        });

    }



}
