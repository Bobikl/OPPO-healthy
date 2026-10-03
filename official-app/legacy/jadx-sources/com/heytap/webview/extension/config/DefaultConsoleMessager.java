package com.heytap.webview.extension.config;

import android.util.Log;
import android.webkit.ConsoleMessage;
import com.heytap.webview.extension.WebExtEnvironment;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016¨\u0006\u0007"}, d2 = {"Lcom/heytap/webview/extension/config/DefaultConsoleMessager;", "Lcom/heytap/webview/extension/config/IConsoleMessager;", "()V", "output", "", "message", "Landroid/webkit/ConsoleMessage;", "lib_webext_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class DefaultConsoleMessager implements IConsoleMessager {

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ConsoleMessage.MessageLevel.values().length];
            try {
                iArr[ConsoleMessage.MessageLevel.LOG.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ConsoleMessage.MessageLevel.TIP.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ConsoleMessage.MessageLevel.DEBUG.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[ConsoleMessage.MessageLevel.ERROR.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[ConsoleMessage.MessageLevel.WARNING.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @Override // com.heytap.webview.extension.config.IConsoleMessager
    public void output(@NotNull ConsoleMessage message) {
        Intrinsics.checkNotNullParameter(message, "message");
        if (WebExtEnvironment.INSTANCE.getDebug()) {
            String str = "url: " + message.sourceId() + " lineNumber: " + message.lineNumber() + " \n message: " + message.message();
            ConsoleMessage.MessageLevel messageLevel = message.messageLevel();
            int i = messageLevel == null ? -1 : WhenMappings.$EnumSwitchMapping$0[messageLevel.ordinal()];
            if (i == 1) {
                Log.v("ConsoleMessager", str);
                return;
            }
            if (i == 2) {
                Log.i("ConsoleMessager", str);
                return;
            }
            if (i == 3) {
                Log.d("ConsoleMessager", str);
            } else if (i == 4) {
                Log.e("ConsoleMessager", str);
            } else {
                if (i != 5) {
                    return;
                }
                Log.w("ConsoleMessager", str);
            }
        }
    }
}
