package com.emojirain;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.luolc.emojirain.EmojiRainLayout;

public class MainActivity extends AppCompatActivity {

    private EmojiRainLayout mContainer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mContainer = (EmojiRainLayout) findViewById(R.id.group_emoji_container);

        // add emoji sources
        mContainer.addEmoji(R.drawable.emoji_1);
        mContainer.addEmoji(R.drawable.emoji_2);
        mContainer.addEmoji(R.drawable.emoji_3);
        mContainer.addEmoji(R.drawable.emoji_4);


//        per
//        每一波掉落的emoji个数，默认6个
//                duration
//        掉落动画持续的总时长，默认8000ms
//                dropDuration
//        每个emoji掉落时长的平均值，默认2400ms
//                dropFrequency
//        掉落频率，即每两拨的时间间隔，默认500ms


        // set emojis per flow, default 6
        mContainer.setPer(10);

        // set total duration in milliseconds, default 8000
        mContainer.setDuration(7200);

        // set average drop duration in milliseconds, default 2400
        mContainer.setDropDuration(2400);

        // set drop frequency in milliseconds, default 500
        mContainer.setDropFrequency(500);

        mContainer.startDropping();

//        mContainer.stopDropping();

    }
}
