package darkone.hangman;
import android.content.Intent;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.view.View;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;

import android.util.Log;
import android.widget.Toast;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;
import java.lang.Float;
import java.io.IOException;
import java.util.ArrayList;
import android.content.Intent;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.util.Random;
import android.graphics.Point;
public class WordsHangman extends View {
    Paint paint = new Paint();
    ArrayList<String> items = new ArrayList<String>();
    int randNumber;
    int guessedLetters;
    String word = new String();
    int errors = 0;
    DrawHangman casemen ;
    int length;
    public static AlertDialog.Builder builder1;
    public static AlertDialog.Builder builder2;
    public WordsHangman(final Context context) throws IOException {
        super(context);
        builder1 = new AlertDialog.Builder(context);
        builder1.setMessage("You lose!");
        builder1.setCancelable(true);
        builder1.setPositiveButton("OK",
                new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {
                        dialog.cancel();
                        ((play) context).finish();
                        context.startActivity(play.intent);
                    }
                });
        builder2 = new AlertDialog.Builder(context);
        builder2.setMessage("You win!");
        builder2.setCancelable(true);
        builder2.setPositiveButton("OK",
                new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {
                        dialog.cancel();
                        ((play) context).finish();
                        context.startActivity(play.intent);
                    }
                });
        casemen = new DrawHangman(context);
        paint.setColor(Color.BLACK);
        paint.setStrokeWidth(10);
        paint.setTextSize(100);
        try {
            InputStream in = getResources().openRawResource(R.raw.words);
            DocumentBuilder builder = DocumentBuilderFactory
                    .newInstance()
                    .newDocumentBuilder();
            Document doc = builder.parse(in, null);
            NodeList words = doc.getElementsByTagName("word");

            for (int i = 0; i < words.getLength(); i++) {
                items.add(((Element) words.item(i)).getAttribute("value"));
            }
            in.close();
        } catch (Throwable t) {
            t.printStackTrace();
        }
        Random rand = new Random();
        randNumber = rand.nextInt(items.size());
    }

    public void drawWords(Canvas canvas) {

        word = items.get(randNumber);
        length = word.length();
//        for (int i = 0, j = 40; i < length; i++, j += 90) {
//            canvas.drawLine(j, canvas.getHeight() / 3 * 2, j + 60, canvas.getHeight() / 3 * 2, paint);
//        }
        int sep = 20;
        for(int i=0;i<length;i++){
            canvas.drawLine(sep,canvas.getHeight() / 3 * 2,60+sep,canvas.getHeight() / 3 * 2,paint);
            sep+=80;
        }
        //20 80
        //100 160
        //180 240
        //40,130,210=1*40,2*75,3*70,40,
    }

    public void drawLetters(Canvas canvas, String letter) {
        word = items.get(randNumber);
        int sep = 20;
        if(word.contains(letter)){
            for (int index = word.indexOf(letter);
                 index >= 0;
                 index = word.indexOf(letter, index + 1)) {
                canvas.drawText(letter, sep+(index*80), (canvas.getHeight() / 3 * 2) - 30, paint);
                guessedLetters++;
            }
        }
        else{
            errors++;
            casemen.caseMen(canvas,errors);
            if(errors==10){
                AlertDialog alert11 = builder1.create();
                alert11.show();
            }
        }
        if(guessedLetters==length){
            AlertDialog alert22 = builder2.create();
            alert22.show();
        }


    }
}