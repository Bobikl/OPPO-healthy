package com.platform.usercenter.uws.view;

import android.content.Context;
import android.util.AttributeSet;
import com.heytap.webpro.core.CheckWebView;
import com.heytap.webpro.core.WebProFragment;
import com.oplus.aiunit.vision.tnl;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
public class UwsCheckWebView extends CheckWebView {

    public static abstract class NetCheckWebViewClient extends tnl {
        public NetCheckWebViewClient(@NotNull WebProFragment webProFragment) {
            super(webProFragment);
        }

        public abstract void onReceiveNetError(int i, String str);
    }

    public UwsCheckWebView(Context context) {
        super(context);
    }

    public UwsCheckWebView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public UwsCheckWebView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
