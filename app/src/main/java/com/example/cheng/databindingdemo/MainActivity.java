package com.example.cheng.databindingdemo;

import android.content.Intent;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

/**
 * Created by cheng on 2016/11/14.
 */

public class MainActivity extends AppCompatActivity {

    @Override
    public void onCreate(Bundle savedInstanceState, PersistableBundle persistentState) {
        super.onCreate(savedInstanceState, persistentState);
        setContentView(R.layout.activity_main2);
    }

    public void goSimple(View view) {
        startActivity(new Intent(this, DemoActivity.class));
    }

    public void goList(View view) {
        startActivity(new Intent(this, ListActivity.class));
    }

    public void goTwoWayBinding(View view) {
        startActivity(new Intent(this,TwoWayActivity.class));
    }

    public void goLambda(View view) {
        startActivity(new Intent(this, LambdaActivity.class));
    }

    public void goExpression(View view) {
        startActivity(new Intent(this, ExpressionActivity.class));
    }

    public void goAnimation(View view) {
        startActivity(new Intent(this, AnimationActivity.class));
    }
}
