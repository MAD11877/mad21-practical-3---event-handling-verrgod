package sg.edu.np.mad.practical2;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("debug","create");

        Intent randomNumber = getIntent();
        String number = randomNumber.getStringExtra("randomNumber");
        TextView numberGen = findViewById(R.id.textView2);
        numberGen.setText(String.format("MAD %s", number));

        Button followBtn = findViewById(R.id.follow);
        followBtn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                String followString = followBtn.getText().toString();
                if (followString.equals("Follow")){
                    followBtn.setText("Unfollow");
                    Toast.makeText(getApplicationContext(), "Followed", Toast.LENGTH_SHORT).show();
                }
                else {
                    followBtn.setText(("Follow"));
                    Toast.makeText(getApplicationContext(), "Unfollowed", Toast.LENGTH_SHORT).show();
                }
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