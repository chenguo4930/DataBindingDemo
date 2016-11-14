package com.example.cheng.databindingdemo;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;

import com.example.cheng.databindingdemo.databinding.ActivityMainBinding;


public class DemoActivity extends AppCompatActivity {
    User user = new User("cheng","guo");
    ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this,R.layout.activity_main);

        binding.setUser(user);
        binding.setPresenter(new Presenter());

        binding.viewStub.getViewStub().inflate();

    }

    public class Presenter {
        public void onTextChanged(CharSequence s, int start ,int before ,int count){
            user.setFirstName(s.toString());
            user.setFired(!user.isFired.get());
        }

        public void onClick(View view){
            Toast.makeText(DemoActivity.this, "点击了", Toast.LENGTH_SHORT).show();
        }

        public void onClickListenerBinding(User user){
            Toast.makeText(DemoActivity.this, user.getLastName(), Toast.LENGTH_SHORT).show();
        }
    }
}
