package edu.smc.perez18.dailyirish;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    String language = "French";

    String[] irishArray = new String[]{"Madra", "Coinín", "Féileacáin"};
    String[] englishArray = new String[]{"Dog", "Rabbit", "Butterfly"};
    String[] frenchArray = new String[]{"Chien", "Lapin", "Papillon"};

    int arrayIndex = 0;

    TextView wordView = null;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setWord();
    }

    public void setWord(){
        wordView = (TextView) findViewById(R.id.wordView);

        Random r = new Random();
        int num = r.nextInt(2-0);

        arrayIndex = num;

        String wordToUse = "";

        if (language.equals("Irish")){
            wordToUse = irishArray[num];
        }else if (language.equals("English")){
            wordToUse = englishArray[num];
        }else{
            wordToUse = frenchArray[num];
        }

        wordView.setText(wordToUse);
    }

    public void onGoClick(View v){
        setWord();
    }
    public void onIrishClick(View v){
        Button btn = (Button) findViewById(R.id.buttonIrish);
        language = "Irish";
        wordView.setText(irishArray[arrayIndex]);
    }
    public void onEnglishClick(View v){
        Button btn = (Button) findViewById(R.id.buttonEnglish);
        language = "English";
        wordView.setText(englishArray[arrayIndex]);
    }
    public void onFrenchClick(View v){
        Button btn = (Button) findViewById(R.id.buttonFrench);
        language = "French";
        wordView.setText(frenchArray[arrayIndex]);
    }
}
