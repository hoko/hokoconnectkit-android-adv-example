// Activity that was opened with a deep link from YourMD and manually handles attribution
package io.hoko.dummyapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import hoko.io.hokoconnectkit.HokoConnectKit;
import hoko.io.hokoconnectkit.helpers.log.HokoLogger;

public class DeepActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_deep);

        HokoConnectKit.setup(this);
        HokoConnectKit.setVerbose(true);

        try {
            HokoConnectKit.setup(this);

            Intent intent = getIntent();
            if (intent == null) {
                HokoLogger.d("No intent");
                return;
            }
            HokoConnectKit.tracking().handleAttributionFromIntent(intent);

        } catch (Exception e) {
            HokoLogger.d(e);
        }
    }
}
