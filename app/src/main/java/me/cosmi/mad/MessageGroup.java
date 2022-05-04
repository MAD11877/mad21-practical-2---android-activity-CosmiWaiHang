package me.cosmi.mad;

import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import me.cosmi.mad.fragment.Group1;
import me.cosmi.mad.fragment.Group2;

public class MessageGroup extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_message_group);

        initBtnGroup1();
        initBtnGroup2();
    }

    public void initBtnGroup1() {
        final Button btnGroup1 = findViewById(R.id.atvMsgGp_btnGroup1);

        btnGroup1.setOnClickListener(view -> getSupportFragmentManager()
                .beginTransaction()
                .replace(R.id.atvMsgGp_flyContent, Group1.class, null)
                .commit());
    }

    public void initBtnGroup2() {
        final Button btnGroup2 = findViewById(R.id.atvMsgGp_btnGroup2);

        btnGroup2.setOnClickListener(view -> getSupportFragmentManager()
                .beginTransaction()
                .replace(R.id.atvMsgGp_flyContent, Group2.class, null)
                .commit());
    }
}