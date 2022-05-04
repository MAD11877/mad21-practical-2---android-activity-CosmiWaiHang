package me.cosmi.mad;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import me.cosmi.mad.entity.User;
import me.cosmi.mad.enumx.ListActivityIntentEnum;

public class MainActivity extends AppCompatActivity {

    private final User user;

    public MainActivity() {
        super();

        this.user = User
                .builder()
                .setName("Cosmi")
                .setDescription("MAD Week 02 - Practical")
                .setId(1)
                .setIsFollowing(false)
                .complete();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Get Intent
        Intent intent = getIntent();

        // Compute
        int number = intent.getIntExtra(ListActivityIntentEnum.ID.name(), 0);
        String username = String.format("%1$s - %2$d", this.user.getName(), number);

        // Layout
        ((TextView) findViewById(R.id.atvMain_tvName)).setText(username);
        ((TextView) findViewById(R.id.atvMain_tvDescription)).setText(this.user.getDescription());

        initBtnFollow();
        initBtnMessage();
    }

    private void initBtnFollow() {
        final Button btnFollow = findViewById(R.id.atvMain_btnFollow);

        btnFollow.setOnClickListener(view -> {
            final boolean isFollowing = this.user.isFollowing();

            if (isFollowing) {
                btnFollow.setText("Follow");
                this.user.setIsFollowing(false);
                Toast.makeText(this, "Unfollowed", Toast.LENGTH_LONG).show();

            } else {
                btnFollow.setText("UnFollow");
                this.user.setIsFollowing(true);
                Toast.makeText(this, "Followed", Toast.LENGTH_LONG).show();
            }
        });
    }

    private void initBtnMessage() {
        final Button btnMessage = findViewById(R.id.atvMain_btnMessage);

        btnMessage.setOnClickListener(view -> {
            Intent intent = new Intent(this, MessageGroup.class);
            startActivity(intent);
        });
    }
}