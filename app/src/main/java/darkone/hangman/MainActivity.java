package darkone.hangman;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Context;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.media.MediaPlayer;
import android.content.Intent;

public class MainActivity extends Activity {
    public static MediaPlayer mp;
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final AlertDialog.Builder builder1 = new AlertDialog.Builder(this);
        mp = MediaPlayer.create(MainActivity.this, R.raw.music);
        mp.setLooping(true);
        mp.start();
        builder1.setMessage("This game was made by Ivaylo Hristov and Iva Dineva for course project in Object Oriented Programming - Part 2.");
        builder1.setCancelable(true);
        builder1.setPositiveButton("OK",
                new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {
                        dialog.cancel();
                    }
                });

        Button about_button = (Button) findViewById(R.id.about_button);
        about_button.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View v) {
                AlertDialog alert11 = builder1.create();
                alert11.show();
            }
        });
        Button settings_button = (Button) findViewById(R.id.settings_button);
        settings_button.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, settings.class);
                startActivity(intent);
            }
        });
        Button play_button = (Button) findViewById(R.id.play_button);
        play_button.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, play.class);
                startActivity(intent);
            }
        });
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
