// Example endpoint that calls setup and tracks one event.

package io.hoko.dummyapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import hoko.io.hokoconnectkit.HokoConnectKit;
import hoko.io.hokoconnectkit.helpers.log.HokoLogger;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        try {
            HokoConnectKit.setup(this);
            HokoConnectKit.setVerbose(true);

            HokoConnectKit.tracking().trackEvent("purchase_pro");
        } catch (Exception e) {
            HokoLogger.d(e);
        }
    }
}
