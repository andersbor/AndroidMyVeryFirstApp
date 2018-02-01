package dk.easj.anbo.myveryfirstapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private int counter = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        if (resultCode == RESULT_OK) {
            int age = data.getIntExtra(SecondActivity.AGE, 0);
            Log.d("MINE", "Age: " + age);
        }
    }

    public void buttonClicked(View view) {
        Log.d("MINE", "button clicked");
        TextView  textView = findViewById(R.id.mainMessageTextView);
        counter++;


        EditText nameView = findViewById(R.id.mainNameEditText);
        String name = nameView.getText().toString();
        textView.setText("Hello " + name);
    }

    public void goButtonClicked(View view) {
        Intent intent = new Intent(this,
                SecondActivity.class);
        EditText nameView = findViewById(R.id.mainNameEditText);
        String name = nameView.getText().toString();
        intent.putExtra(SecondActivity.PERSONNAME, name);
        //startActivity(intent);
        startActivityForResult(intent, 14593);
    }
}
