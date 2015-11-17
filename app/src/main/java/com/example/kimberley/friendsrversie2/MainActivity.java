package com.example.kimberley.friendsrversie2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClickFriend(View view) {
        Intent openDetail = new Intent(this, DetailsActivity.class);
        String friend = "";
        switch (view.getId()) {
            case R.id.Chandler:
                friend = "Chandler";
                break;
            case R.id.Joey:
                friend = "Joey";
                break;
            case R.id.Monica:
                friend = "Monica";
                break;
            case R.id.Rachel:
                friend = "Rachel";
                break;
            case R.id.Ross:
                friend = "Ross";
                break;
            case R.id.Phoebe:
                friend = "Phoebe";
                break;
            default:
                break;
        }
        openDetail.putExtra("friend", friend);
        startActivity(openDetail);
    }
}
