package com.oplus.aiunit.vision;

import android.webkit.ConsoleMessage;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\b"}, d2 = {"Lcom/oplus/aiunit/vision/d45;", "Lcom/oplus/aiunit/vision/fo9;", "Landroid/webkit/ConsoleMessage;", "message", "", "output", "<init>", "()V", "lib_webpro_release"}, k = 1, mv = {1, 4, 0})
public final class d45 implements fo9 {
    @Override // com.oplus.aiunit.vision.fo9
    public void output(@NotNull ConsoleMessage message) {
        Intrinsics.checkNotNullParameter(message, "message");
        String str = "onConsoleMessage sourceId: " + message.sourceId() + " lineNumber: " + message.lineNumber() + " \n message: " + message.message();
        ConsoleMessage.MessageLevel messageLevel = message.messageLevel();
        if (messageLevel != null) {
            int i = c45.$EnumSwitchMapping$0[messageLevel.ordinal()];
            if (i == 1) {
                q7b.d("ConsoleMessager", str);
                return;
            } else if (i == 2) {
                q7b.n("ConsoleMessager", str);
                return;
            }
        }
        q7b.a("ConsoleMessager", str);
    }
}
