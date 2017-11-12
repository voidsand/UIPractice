package com.android.test.practice;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ProgressBar;
import android.widget.RadioGroup;
import android.widget.RatingBar;
import android.widget.SeekBar;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.ToggleButton;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity implements
        CompoundButton.OnCheckedChangeListener, View.OnClickListener,
        RadioGroup.OnCheckedChangeListener, SeekBar.OnSeekBarChangeListener,
        RatingBar.OnRatingBarChangeListener {

    private CheckBox mCheckBox1, mCheckBox2, mCheckBox3, mCheckBox4;
    private Button mButton1, mButton2, mButton3, mButton4, mButton5, mButton6, mButton7;
    private TextView mTextView1, mTextView2;
    private RadioGroup mRadioGroup1;
    private ToggleButton mToggleButton1;
    private SeekBar mSeekBar1;
    private ProgressBar mProgressBar1;
    private RatingBar mRatingBar1;

    private List<String> lists;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_linear);
        initDate();
        initView();
        setListener();
    }

    private void initDate() {
        lists = new ArrayList<>();
    }

    private void initView() {
        mCheckBox1 = findViewById(R.id.checkBox1);
        mCheckBox2 = findViewById(R.id.checkBox2);
        mCheckBox3 = findViewById(R.id.checkBox3);
        mCheckBox4 = findViewById(R.id.checkBox4);
        mButton1 = findViewById(R.id.button1);
        mButton2 = findViewById(R.id.button2);
        mButton3 = findViewById(R.id.button3);
        mButton4 = findViewById(R.id.button4);
        mButton5 = findViewById(R.id.button5);
        mButton6 = findViewById(R.id.button6);
        mButton7 = findViewById(R.id.button7);
        mTextView1 = findViewById(R.id.textView1);
        mTextView2 = findViewById(R.id.textView2);
        mRadioGroup1 = findViewById(R.id.radioGroup1);
        mToggleButton1 = findViewById(R.id.toggleButton1);
        mSeekBar1 = findViewById(R.id.seekBar1);
        mProgressBar1 = findViewById(R.id.progressBar1);
        mRatingBar1 = findViewById(R.id.ratingBar1);
    }

    private void setListener() {
        mCheckBox1.setOnCheckedChangeListener(this);
        mCheckBox2.setOnCheckedChangeListener(this);
        mCheckBox3.setOnCheckedChangeListener(this);
        mCheckBox4.setOnCheckedChangeListener(this);
        mButton1.setOnClickListener(this);
        mButton2.setOnClickListener(this);
        mButton3.setOnClickListener(this);
        mButton4.setOnClickListener(this);
        mButton5.setOnClickListener(this);
        mButton6.setOnClickListener(this);
        mButton7.setOnClickListener(this);
        mRadioGroup1.setOnCheckedChangeListener(this);
        mToggleButton1.setOnClickListener(this);
        mSeekBar1.setOnSeekBarChangeListener(this);
        mRatingBar1.setOnRatingBarChangeListener(this);
    }

    @Override
    public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
        switch (buttonView.getId()) {
            case R.id.checkBox1:
                if (isChecked)
                    mCheckBox1.setTextColor(Color.RED);
                else
                    mCheckBox1.setTextColor(Color.BLACK);
                break;
            case R.id.checkBox2:
                if (isChecked)
                    mCheckBox2.setTextColor(Color.RED);
                else
                    mCheckBox2.setTextColor(Color.BLACK);
                break;
            case R.id.checkBox3:
                if (isChecked)
                    mCheckBox3.setTextColor(Color.RED);
                else
                    mCheckBox3.setTextColor(Color.BLACK);
                break;
            case R.id.checkBox4:
                if (isChecked)
                    mCheckBox4.setTextColor(Color.RED);
                else
                    mCheckBox4.setTextColor(Color.BLACK);
                break;
        }
    }

    @Override
    public void onCheckedChanged(RadioGroup group, int checkedId) {
        switch (checkedId) {
            case R.id.radioButton1:
                Toast.makeText(MainActivity.this, "男性", Toast.LENGTH_SHORT).show();
                break;
            case R.id.radioButton2:
                Toast.makeText(MainActivity.this, "女性", Toast.LENGTH_SHORT).show();
                break;
            case R.id.radioButton3:
                Toast.makeText(MainActivity.this, "娚性", Toast.LENGTH_SHORT).show();
                break;
        }
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.button1:
                mCheckBox1.setChecked(true);
                mCheckBox2.setChecked(true);
                mCheckBox3.setChecked(true);
                mCheckBox4.setChecked(true);
                break;
            case R.id.button2:
                mCheckBox1.setChecked(false);
                mCheckBox2.setChecked(false);
                mCheckBox3.setChecked(false);
                mCheckBox4.setChecked(false);
                break;
            case R.id.button3:
                if (mCheckBox1.isChecked())
                    lists.add(mCheckBox1.getText().toString());
                if (mCheckBox2.isChecked())
                    lists.add(mCheckBox2.getText().toString());
                if (mCheckBox3.isChecked())
                    lists.add(mCheckBox3.getText().toString());
                if (mCheckBox4.isChecked())
                    lists.add(mCheckBox4.getText().toString());
                mTextView1.setText(lists.toString());
                lists.clear();
                break;
            case R.id.button4:
                mProgressBar1.incrementProgressBy(10);
                break;
            case R.id.button5:
                mProgressBar1.incrementProgressBy(-10);
                break;
            case R.id.button6:
                mProgressBar1.incrementSecondaryProgressBy(20);
                break;
            case R.id.button7:
                mProgressBar1.incrementSecondaryProgressBy(-20);
                break;
            case R.id.toggleButton1:
                if (mToggleButton1.isChecked()) {
                    Toast.makeText(MainActivity.this, mToggleButton1.getText().toString(), Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(MainActivity.this, mToggleButton1.getText().toString(), Toast.LENGTH_SHORT).show();
                }
                break;
        }
    }

    @Override
    public void onStartTrackingTouch(SeekBar seekBar) {
    }

    @Override
    public void onStopTrackingTouch(SeekBar seekBar) {
    }

    @Override
    public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
        switch (seekBar.getId()) {
            case R.id.seekBar1:
                mTextView2.setText(" " + progress);
                break;
        }
    }

    @Override
    public void onRatingChanged(RatingBar ratingBar, float rating, boolean fromUser) {
        switch (ratingBar.getId()) {
            case R.id.ratingBar1:
                Toast.makeText(MainActivity.this, "当前评分：" + rating, Toast.LENGTH_SHORT).show();
                break;
        }
    }
}
