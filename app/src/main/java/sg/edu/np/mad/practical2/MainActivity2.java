package sg.edu.np.mad.practical2;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.app.Dialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import java.util.Random;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle("Profile");
        builder.setMessage("MADness");
        builder.setPositiveButton("VIEW", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                Random r = new Random();
                int i = r.nextInt(2000000000 - 1000000000) + 1000000000;
                String a = String.valueOf(i);
                Intent randomNumber = new Intent(MainActivity2.this, MainActivity.class);
                randomNumber.putExtra("randomNumber", a);
                startActivity(randomNumber);
            }
        });
        builder.setNegativeButton("CLOSE", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {

            }
        });

        View imageButton = findViewById(R.id.roundLogo);
        imageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog alertDialog = builder.create();
                alertDialog.show();
            }
        });
    }
    protected void onStart(){
        super.onStart();
        Log.d("debug","start");
    }
    protected void onResume(){
        super.onResume();
        Log.d("debug","resume");
    }
    protected void onRestart(){
        super.onRestart();
        Log.d("debug","restart");
    }
}