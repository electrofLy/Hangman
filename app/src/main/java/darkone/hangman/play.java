package darkone.hangman;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.graphics.Bitmap;
import android.graphics.Canvas;

import java.io.IOException;

import java.util.ArrayList;

@SuppressWarnings("ALL")
public class play extends Activity {
    ImageView drawingImageView;
    public static Intent intent ;

    WordsHangman words;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_play);
        intent = getIntent();
        drawingImageView = (ImageView) this.findViewById(R.id.imageView);
        Bitmap bitmap = Bitmap.createBitmap((int) getWindowManager()
                .getDefaultDisplay().getWidth(), (int) getWindowManager()
                .getDefaultDisplay().getHeight(), Bitmap.Config.ARGB_8888);
        final Canvas canvas = new Canvas(bitmap);
        drawingImageView.setImageBitmap(bitmap);
        try {
            words = new WordsHangman(this);
            words.drawWords(canvas);


        } catch (IOException e) {
            e.printStackTrace();
        }

        final Button a_button = (Button) findViewById(R.id.a_button);
        a_button.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                a_button.setEnabled(false);
                words.drawLetters(canvas, "a");

            }
        });
        final Button b_button = (Button) findViewById(R.id.b_button);
        b_button.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                b_button.setEnabled(false);
                words.drawLetters(canvas,"b");
            }
        });
        final Button c_button = (Button) findViewById(R.id.c_button);
        c_button.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                c_button.setEnabled(false);
                words.drawLetters(canvas,"c");
            }
        });
        final Button d_button = (Button) findViewById(R.id.d_button);
        d_button.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                d_button.setEnabled(false);
                words.drawLetters(canvas,"d");
            }
        });
        final Button e_button = (Button) findViewById(R.id.e_button);
        e_button.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                e_button.setEnabled(false);
                words.drawLetters(canvas,"e");
            }
        });
        final Button f_button = (Button) findViewById(R.id.f_button);
        f_button.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                f_button.setEnabled(false);
                words.drawLetters(canvas,"f");
            }
        });
        final Button g_button = (Button) findViewById(R.id.g_button);
        g_button.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                g_button.setEnabled(false);
                words.drawLetters(canvas,"g");
            }
        });
        final Button h_button = (Button) findViewById(R.id.h_button);
        h_button.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                h_button.setEnabled(false);
                words.drawLetters(canvas,"h");
            }
        });
        final Button i_button = (Button) findViewById(R.id.i_button);
        i_button.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                i_button.setEnabled(false);
                words.drawLetters(canvas,"i");
            }
        });
        final Button j_button = (Button) findViewById(R.id.j_button);
        j_button.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                j_button.setEnabled(false);
                words.drawLetters(canvas,"j");
            }
        });
        final Button k_button = (Button) findViewById(R.id.k_button);
        k_button.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                k_button.setEnabled(false);
                words.drawLetters(canvas,"k");
            }
        });
        final Button l_button = (Button) findViewById(R.id.l_button);
        l_button.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                l_button.setEnabled(false);
                words.drawLetters(canvas,"l");
            }
        });
        final Button m_button = (Button) findViewById(R.id.m_button);
        m_button.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                m_button.setEnabled(false);
                words.drawLetters(canvas,"m");
            }
        });
        final Button n_button = (Button) findViewById(R.id.n_button);
        n_button.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                n_button.setEnabled(false);
                words.drawLetters(canvas,"n");
            }
        });
        final Button o_button = (Button) findViewById(R.id.o_button);
        o_button.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                o_button.setEnabled(false);
                words.drawLetters(canvas,"o");
            }
        });
        final Button p_button = (Button) findViewById(R.id.p_button);
        p_button.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                p_button.setEnabled(false);
                words.drawLetters(canvas, "p");
            }
        });
        final Button q_button = (Button) findViewById(R.id.q_button);
        q_button.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                q_button.setEnabled(false);
                words.drawLetters(canvas,"q");
            }
        });
        final Button r_button = (Button) findViewById(R.id.r_button);
        r_button.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                r_button.setEnabled(false);
                words.drawLetters(canvas,"r");
            }
        });
        final Button s_button = (Button) findViewById(R.id.s_button);
        s_button.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                s_button.setEnabled(false);
                words.drawLetters(canvas,"s");
            }
        });
        final Button t_button = (Button) findViewById(R.id.t_button);
        t_button.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                t_button.setEnabled(false);
                words.drawLetters(canvas,"t");
            }
        });
        final Button u_button = (Button) findViewById(R.id.u_button);
        u_button.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                u_button.setEnabled(false);
                words.drawLetters(canvas,"u");
            }
        });
        final Button v_button = (Button) findViewById(R.id.v_button);
        v_button.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                v_button.setEnabled(false);
                words.drawLetters(canvas,"v");
            }
        });
        final Button w_button = (Button) findViewById(R.id.w_button);
        w_button.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                w_button.setEnabled(false);
                words.drawLetters(canvas,"w");
            }
        });
        final Button x_button = (Button) findViewById(R.id.x_button);
        x_button.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                x_button.setEnabled(false);
                words.drawLetters(canvas,"x");
            }
        });
        final Button y_button = (Button) findViewById(R.id.y_button);
        y_button.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                y_button.setEnabled(false);
                words.drawLetters(canvas,"y");
            }
        });
        final Button z_button = (Button) findViewById(R.id.z_button);
        z_button.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                z_button.setEnabled(false);
                words.drawLetters(canvas,"z");
            }
        });




    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_play, menu);
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
