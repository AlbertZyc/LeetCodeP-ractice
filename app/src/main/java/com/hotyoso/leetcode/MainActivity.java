package com.hotyoso.leetcode;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import com.hotyoso.leetcode.questions.ASingleKeyboard;
import com.hotyoso.leetcode.questions.RemoveOuterParentheses;

public class MainActivity extends AppCompatActivity {
    private TextView out_print;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        out_print =findViewById(R.id.out_print);
//        ASingleKeyboard.calculateTime("abcdefghijklmnopqrstuvwxyz","cba");
        RemoveOuterParentheses.removeOuterParentheses("(()())(())");
    }

}
