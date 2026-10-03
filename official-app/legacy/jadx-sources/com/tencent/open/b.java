package com.tencent.open;

import android.annotation.SuppressLint;
import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.webkit.ConsoleMessage;
import android.webkit.WebChromeClient;
import com.oplus.aiunit.vision.q8g;

/* JADX INFO: loaded from: classes10.dex */
public abstract class b extends Dialog {
    public com.tencent.open.a i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @SuppressLint({"NewApi"})
    public final WebChromeClient f20307j;

    public b(Context context, int i) {
        super(context, i);
        this.f20307j = new a();
    }

    public abstract void a(String str);

    @Override // android.app.Dialog
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.i = new com.tencent.open.a();
    }

    public class a extends WebChromeClient {
        public a() {
        }

        @Override // android.webkit.WebChromeClient
        public boolean onConsoleMessage(ConsoleMessage consoleMessage) {
            if (consoleMessage == null) {
                return false;
            }
            q8g.i("openSDK_LOG.JsDialog", "WebChromeClient onConsoleMessage" + consoleMessage.message() + " -- From  111 line " + consoleMessage.lineNumber() + " of " + consoleMessage.sourceId());
            b.this.a(consoleMessage.message());
            return true;
        }

        @Override // android.webkit.WebChromeClient
        public void onConsoleMessage(String str, int i, String str2) {
            q8g.i("openSDK_LOG.JsDialog", "WebChromeClient onConsoleMessage" + str + " -- From 222 line " + i + " of " + str2);
        }
    }
}
