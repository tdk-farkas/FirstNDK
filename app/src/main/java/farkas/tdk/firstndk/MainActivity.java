package farkas.tdk.firstndk;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends Activity implements View.OnClickListener{

    TextView textView;
    Button button1,button2;
    EditText edit1,edit2;
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView = (TextView) findViewById(R.id.textView);
        button1 = (Button) findViewById(R.id.button1);
        button2 = (Button) findViewById(R.id.button2);
        edit1 = (EditText) findViewById(R.id.editText1);
        edit2 = (EditText) findViewById(R.id.editText2);

        button1.setOnClickListener(this);

        button2.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        Load load = new Load();
        int num1 = edit1.getText().toString().trim().length()>0?Integer.parseInt(edit1.getText().toString().trim()):0;
        int num2 = edit2.getText().toString().trim().length()>0?Integer.parseInt(edit2.getText().toString().trim()):0;
        int r;
        String show;
        switch (view.getId()){
            case R.id.button1:
                r = load.addInt(num1 , num2);
                show = "C++库计算“"+num1+"+"+num2+"”的结果是：" + String.valueOf(r);
                textView.setText(show);
                break;
            case R.id.button2:
                r = load.reduceInt(num1 , num2);
                show = "C++库计算“"+num1+"-"+num2+"”的结果是：" + String.valueOf(r);
                textView.setText(show);
                break;
            default:
                Toast.makeText(this,"点错了",Toast.LENGTH_SHORT).show();
                break;
        }
    }
}
