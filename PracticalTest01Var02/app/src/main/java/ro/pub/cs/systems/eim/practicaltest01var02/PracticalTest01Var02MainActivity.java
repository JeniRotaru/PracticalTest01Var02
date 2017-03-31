package ro.pub.cs.systems.eim.practicaltest01var02;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class PracticalTest01Var02MainActivity extends AppCompatActivity {

    private EditText number1 = null;
    private EditText number2 = null;
    private EditText result= null;
    private Button plus = null;
    private Button minus = null;

    private ButtonClickListener buttonClickListener = new ButtonClickListener();
    private class ButtonClickListener implements View.OnClickListener {
        @Override
        public void onClick(View view) {
            switch(view.getId()) {
                case R.id.button1:
                    int res1 = Integer.parseInt(number1.getText().toString()) + Integer.parseInt(number2.getText().toString());
                    result.setText(String.valueOf(res1));
                    break;
                case R.id.button2:
                    int res2 = Integer.parseInt(number1.getText().toString()) - Integer.parseInt(number2.getText().toString());
                    result.setText(String.valueOf(res2));
                    break;
            }
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_practical_test01_var02_main);

        number1 = (EditText)findViewById(R.id.editText1);
        number2 = (EditText)findViewById(R.id.editText2);
        result = (EditText)findViewById(R.id.editText3);
        number1.setText(String.valueOf(0));
        number2.setText(String.valueOf(0));
        plus = (Button)findViewById(R.id.button1);
        minus = (Button)findViewById(R.id.button2);

        plus.setOnClickListener(buttonClickListener);
        minus.setOnClickListener(buttonClickListener);
    }

    @Override
    protected void onSaveInstanceState(Bundle savedInstanceState) {
        savedInstanceState.putString("number1", number1.getText().toString());
        savedInstanceState.putString("number2", number2.getText().toString());
    }

    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        if (savedInstanceState.containsKey("number1")) {
            number1.setText(savedInstanceState.getString("number1"));
        } else {
            number1.setText(String.valueOf(0));
        }
        if (savedInstanceState.containsKey("number2")) {
            number2.setText(savedInstanceState.getString("number2"));
        } else {
            number2.setText(String.valueOf(0));
        }
    }
}
