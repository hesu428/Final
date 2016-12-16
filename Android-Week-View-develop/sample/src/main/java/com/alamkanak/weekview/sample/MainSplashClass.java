package com.alamkanak.weekview.sample;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;

public class MainSplashClass extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        // TODO 자동 생성된 메소드 스텁
        super.onCreate(savedInstanceState);
        setContentView(R.layout.mainsplash_layout);

        Handler hdl = new Handler() {
            @Override
            public void handleMessage(Message msg) {
                // TODO 자동 생성된 메소드 스텁
                Intent intent = new Intent(MainSplashClass.this, MainActivity2.class);
                intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                startActivity(intent);

            }
        };
        hdl.sendEmptyMessageDelayed(0, 3000); // 3초후 메시지 보내지
    }
}

