package com.example.cryptocoinconverter;

import android.graphics.Typeface;
import android.provider.MediaStore;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void onClick (View view) {
        final double usdToBTC = 1 / 11036.53;
        final double btcToUSD = 11036.53;

        EditText editText = (EditText) findViewById(R.id.editText);
        TextView result = (TextView) findViewById(R.id.editText2);
        RadioGroup rd1 = (RadioGroup) findViewById(R.id.rd1);
        RadioGroup rd2 = (RadioGroup) findViewById(R.id.rd2);


        double input = Double.parseDouble(editText.getText().toString());
        double converted = 0.0;

        if (rd1.getCheckedRadioButtonId() == R.id.usd1 && rd2.getCheckedRadioButtonId() == R.id.usd2) {
            converted = input;
            result.setText(Double.toString(converted));
        }

        if (rd1.getCheckedRadioButtonId() == R.id.usd1 && rd2.getCheckedRadioButtonId() == R.id.btc2) {
            converted = input * usdToBTC;
            result.setText(Double.toString(converted));
        }

        if (rd1.getCheckedRadioButtonId() == R.id.btc1 && rd2.getCheckedRadioButtonId() == R.id.usd2) {
            converted = input * btcToUSD;
            result.setText(Double.toString(converted));
        }

        if (rd1.getCheckedRadioButtonId() == R.id.btc1 && rd2.getCheckedRadioButtonId() == R.id.btc2) {
            converted = input;
            result.setText(Double.toString(converted));
        }

    }
}
