package com.platform.sdk.center.webview;

import android.os.Bundle;
import com.heytap.webpro.core.WebProActivity;
import com.oplus.aiunit.vision.sm2;
import com.platform.usercenter.basic.annotation.Keep;
import com.platform.usercenter.tools.device.UCDeviceTypeFactory;
import com.platform.usercenter.tools.log.UCLogUtil;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Keep
public class WebExtCompatActivity extends WebProActivity {
    private static final String TAG = "WebExtCompatActivity";

    @Override // android.app.Activity
    public void finish() {
        super.finish();
    }

    @Override // com.heytap.webpro.core.AbstractWebExtActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        super.onBackPressed();
    }

    @Override // com.heytap.webpro.core.AbstractWebExtActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@Nullable Bundle bundle) {
        setWebViewToSaveInstanceState(false);
        super.onCreate(bundle);
        UCLogUtil.e(TAG, "onCreate");
        sm2.i().b(getApplicationContext());
        if (UCDeviceTypeFactory.isPad(this)) {
            setRequestedOrientation(3);
        } else {
            setRequestedOrientation(5);
        }
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        UCLogUtil.e(TAG, "onDestroy");
        super.onDestroy();
    }
}
