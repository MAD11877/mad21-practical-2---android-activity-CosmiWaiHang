package me.cosmi.mad;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import java.util.Random;

import me.cosmi.mad.enumx.ListActivityIntentEnum;

public class ListActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);

        initImgAndroid();
    }

    public void initImgAndroid() {
        final ImageView imgAndroid = findViewById(R.id.atvList_imgUser);

        imgAndroid.setOnClickListener(view -> new AlertDialog
                .Builder(this)
                .setTitle("Profile")
                .setMessage("MADness")
                .setPositiveButton("VIEW", (dialog, i) -> {
                    Intent intent = new Intent(this, MainActivity.class);
                    intent.putExtra(ListActivityIntentEnum.ID.name(), Math.abs(new Random().nextInt()));
                    startActivity(intent);
                })
                .setNegativeButton("CLOSE", null)
                .create()
                .show());
    }
}

