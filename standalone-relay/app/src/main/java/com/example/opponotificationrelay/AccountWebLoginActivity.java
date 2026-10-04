package com.example.opponotificationrelay;
import android.content.Context;
import android.os.Bundle;
/** Original account UI with its original resources in this application's sandbox. */
public final class AccountWebLoginActivity extends com.oplus.accountsdk.open.core.web.AcOpenWebActivity {
    @Override public void attachBaseContext(Context base){
        OfficialUiResources.ensureReady(base);super.attachBaseContext(OfficialUiResources.wrapAccount(base));
    }
    @Override public android.content.res.AssetManager getAssets(){return getBaseContext().getAssets();}
    @Override public void setTheme(int ignored){super.setTheme(0x7f160004);}
    @Override public void onCreate(Bundle state){
        AccountSdk.silence();android.webkit.WebView.setWebContentsDebuggingEnabled(false);super.onCreate(state);
    }
}
