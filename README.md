# hokoconnectkit-android-adv-example

Example of an advertiser app using hokoconnectkit v1.0.18.

### Manually test the publisher opening an advertiser deep link

`adb shell am start -d "dummy-app://?hk_code=test"`

### Manually test the advertiser app receives an install broadcast, and contacts the HOKO API

`adb shell am broadcast -a com.android.vending.INSTALL_REFERRER -n io.hoko.dummyapp/hoko.io.hokoconnectkit.receiver.InstallBroadcastReceiver --es "referrer" ":hk_dp=dummy-app%3A%2F%2F:hk_code=test"`

Where `hk_code` is an attribution token from HOKO. Token value `test` is always accepted and ignored.
