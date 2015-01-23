package com.example.benet.calculadora2app;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;


public class MainActivity extends ActionBarActivity {

    private static float r;
    private static float aux;
    private static char op;

    public void calculadora(View view){
        TextView label=(TextView)findViewById(R.id.label);
        switch(view.getId()){
            case R.id.btn0:
                label.setText(label.getText().toString()+"0");
                break;
            case R.id.btn1:
                label.setText(label.getText().toString()+"1");
                break;
            case R.id.btn2:
                label.setText(label.getText().toString()+"2");
                break;
            case R.id.btn3:
                label.setText(label.getText().toString()+"3");
                break;
            case R.id.btn4:
                label.setText(label.getText().toString()+"4");
                break;
            case R.id.btn5:
                label.setText(label.getText().toString()+"5");
                break;
            case R.id.btn6:
                label.setText(label.getText().toString()+"6");
                break;
            case R.id.btn7:
                label.setText(label.getText().toString()+"7");
                break;
            case R.id.btn8:
                label.setText(label.getText().toString()+"8");
                break;
            case R.id.btn9:
                label.setText(label.getText().toString()+"9");
                break;
            case R.id.btnpunt:
                label.setText(label.getText().toString()+".");
                break;
            case R.id.btnC:
                label.setText("");
                aux=0;
                break;
            case R.id.btnSum:
                aux+=Float.parseFloat(label.getText().toString());
                label.setText("");
                op='+';
                break;
            case R.id.btnRes:
                aux-=Float.parseFloat(label.getText().toString());
                label.setText("");
                op='-';
                break;
            case R.id.btnMulti:
                aux=Float.parseFloat(label.getText().toString());
                label.setText("");
                op='*';
                break;
            case R.id.btnDiv:
                aux=Float.parseFloat(label.getText().toString());
                label.setText("");
                op='/';
                break;
            case R.id.btnigual:
                switch(op){
                    case '+':
                        label.setText((aux)+(Float.parseFloat(label.getText().toString()))+"");
                        aux=0;
                        break;
                    case '-':
                        label.setText((aux)-(Float.parseFloat(label.getText().toString()))+"");
                        aux=0;
                        break;
                    case '*':
                        label.setText((aux)*(Float.parseFloat(label.getText().toString()))+"");
                        aux=0;
                        break;
                    case '/':
                        label.setText((aux)/(Float.parseFloat(label.getText().toString()))+"");
                        aux=0;
                        break;
                }
                break;
        }


    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
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
