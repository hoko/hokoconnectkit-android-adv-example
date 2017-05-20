# hokoconnectkit Android 1.0.x example app

Example of a partner app using deprecated **hokoconnectkit** Android SDK v1.0.18.

[Documentation](http://yourdocs.hoko.io/advertiser/android/getting_started.html)

Do not forget to replace the `HOKOToken` string with the appropriate token from your dashboard.

### Manually test the publisher opening an advertiser deep link

`adb shell am start -d "dummy-app://?hk_code=test"`

### Manually test the advertiser app receives an install broadcast, and contacts the HOKO API

`adb shell am broadcast -a com.android.vending.INSTALL_REFERRER -n io.hoko.dummyapp/hoko.io.hokoconnectkit.receiver.InstallBroadcastReceiver --es "referrer" ":hk_dp=dummy-app%3A%2F%2F:hk_code=test"`

Where `hk_code` is an attribution code from HOKO. Code value `test` is always accepted and ignored.
