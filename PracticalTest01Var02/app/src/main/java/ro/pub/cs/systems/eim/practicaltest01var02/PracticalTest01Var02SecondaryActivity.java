package ro.pub.cs.systems.eim.practicaltest01var02;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class PracticalTest01Var02SecondaryActivity extends AppCompatActivity {

    private EditText result= null;
    private Button b1 = null;
    private Button b2 = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_practical_test01_var02_secondary);

        result = (EditText)findViewById(R.id.editText);
        b1 = (Button)findViewById(R.id.button);
        b2 = (Button)findViewById(R.id.button4);
    }
}
