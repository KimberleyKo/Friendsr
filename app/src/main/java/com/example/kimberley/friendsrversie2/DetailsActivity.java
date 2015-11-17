package com.example.kimberley.friendsrversie2;

import android.content.res.Resources;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class DetailsActivity extends AppCompatActivity {
    String chosenFriend;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);
        Bundle extras = getIntent().getExtras();
        chosenFriend = extras.getString("friend");
        friendDetails();
    }
    public void friendDetails(){
        ImageView friendImage = (ImageView) findViewById(R.id.imageView);
        TextView friendName = (TextView) findViewById(R.id.textView9);
        TextView friendDescription = (TextView) findViewById(R.id.textView10);

        Resources res = getResources();
        String[] friend_details = res.getStringArray(R.array.friend_details);
        String[] friend_full_names = res.getStringArray(R.array.friend_full_names);

        switch (chosenFriend){
            case "Chandler":
                friendImage.setImageResource(R.drawable.chandler);
                friendName.setText(friend_full_names[0]);
                friendDescription.setText(friend_details[0]);
                break;
            case "Joey":
                friendImage.setImageResource(R.drawable.joey);
                friendName.setText(friend_full_names[1]);
                friendDescription.setText(friend_details[1]);
                break;
            case "Monica":
                friendImage.setImageResource(R.drawable.monica);
                friendName.setText(friend_full_names[2]);
                friendDescription.setText(friend_details[2]);
                break;
            case "Phoebe":
                friendImage.setImageResource(R.drawable.phoebe);
                friendName.setText(friend_full_names[3]);
                friendDescription.setText(friend_details[3]);
                break;
            case "Rachel":
                friendImage.setImageResource(R.drawable.rachel);
                friendName.setText(friend_full_names[4]);
                friendDescription.setText(friend_details[4]);
                break;
            case "Ross":
                friendImage.setImageResource(R.drawable.ross);
                friendName.setText(friend_full_names[5]);
                friendDescription.setText(friend_details[5]);
                break;
        }
    }

}
