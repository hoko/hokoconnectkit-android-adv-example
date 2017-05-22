# hokoconnectkit Android 1.0.21 example app

Example of a partner app using deprecated **hokoconnectkit** Android SDK v1.0.21.

[Documentation](http://yourdocs.hoko.io/advertiser/android/getting_started.html)

Do not forget to replace the `HOKOToken` string with the appropriate token from your dashboard.

### Manually test the publisher opening an advertiser deep link

`adb shell am start -d "dummy-app://?hk_code=test"`

### Manually test the advertiser app receives an install broadcast, and contacts the HOKO API

With a custom install receiver:

`adb shell am broadcast -a com.android.vending.INSTALL_REFERRER -n io.hoko.dummyapp/.MyInstallBroadcastReceiver --es "referrer" ":hk_dp=dummy-app%3A%2F%2F:hk_code=test"`

Where `hk_code` is an attribution code from HOKO. Code value `test` is always accepted and ignored. With code `test` it is expected to receive `Code=5 Description=Could not reach the Hoko Service. Please try again later.` error logs.

If you want to test instead with the default broadcast receiver you can use an unbound broadcast:

`adb shell am broadcast -a com.android.vending.INSTALL_REFERRER --es "referrer" ":hk_dp=dummy-app%3A%2F%2F:hk_code=test"`

