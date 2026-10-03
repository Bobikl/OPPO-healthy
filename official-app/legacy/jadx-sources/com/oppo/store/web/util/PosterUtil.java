package com.oppo.store.web.util;

import android.os.Handler;
import android.os.Message;
import android.text.TextUtils;
import android.webkit.ValueCallback;
import android.webkit.WebView;
import com.oppo.store.web.jsbridge.javacalljs.JavaCallJs;
import com.oppo.store.web.util.PosterUtil;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001a\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\u0010\t\u001a\u0004\u0018\u00010\nR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lcom/oppo/store/web/util/PosterUtil;", "", "()V", "REQUEST_POSTER_DELAYED", "", "getPosterUrl", "", "webView", "Landroid/webkit/WebView;", "handler", "Landroid/os/Handler;", "webbrowser-impl_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class PosterUtil {

    @NotNull
    public static final PosterUtil INSTANCE = new PosterUtil();
    private static final int REQUEST_POSTER_DELAYED = 1000;

    private PosterUtil() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: getPosterUrl$lambda-0, reason: not valid java name */
    public static final void m5264getPosterUrl$lambda0(Handler handler, String str) {
        if (handler == null) {
            return;
        }
        if (!TextUtils.isEmpty(str) && !Intrinsics.areEqual("null", str)) {
            Message messageObtain = Message.obtain(null, 1, str);
            Intrinsics.checkNotNullExpressionValue(messageObtain, "obtain(null, PosterHandl…RETURN_POSTER, posterUrl)");
            handler.sendMessage(messageObtain);
        } else if (Intrinsics.areEqual("null", str)) {
            Message messageObtain2 = Message.obtain((Handler) null, 2);
            Intrinsics.checkNotNullExpressionValue(messageObtain2, "obtain(null, PosterHandl…MSG_REQUEST_POSTER_COUNT)");
            handler.sendMessageDelayed(messageObtain2, 1000L);
        }
    }

    public final void getPosterUrl(@Nullable WebView webView, @Nullable final Handler handler) {
        JavaCallJs.javaCallJs(webView, JavaCallJs.JS_METHOD_GET_POSTER_URL, null, new ValueCallback() { // from class: com.oplus.aiunit.vision.ioe
            @Override // android.webkit.ValueCallback
            public final void onReceiveValue(Object obj) {
                PosterUtil.m5264getPosterUrl$lambda0(handler, (String) obj);
            }
        });
    }
}
