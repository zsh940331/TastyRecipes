package com.example.segno.tastyrecipes;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
/**
 *  @author     Jession Ding
 *  created at  2016/9/2 15:55
 *  Description 引导页面，第一次安装过程中要显示，以后打开不显示
 */
public class GuideActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_guide);
    }
}
