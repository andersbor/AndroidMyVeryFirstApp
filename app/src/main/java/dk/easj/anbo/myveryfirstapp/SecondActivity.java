package dk.easj.anbo.myveryfirstapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class SecondActivity extends AppCompatActivity {

    public static final String PERSONNAME = "personname";
    public static final String AGE = "age";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        Intent data = getIntent();
        String someName = data.getStringExtra(PERSONNAME);
        Log.d("MINE", "ksdfks" + someName);
    }

    public void goBackButtonClicked(View view) {
        Intent data = new Intent();
        data.putExtra(AGE, 29);
        setResult(RESULT_OK, data);
        finish();
    }
}
