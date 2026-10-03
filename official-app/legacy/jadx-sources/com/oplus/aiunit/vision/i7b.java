package com.oplus.aiunit.vision;

import android.util.Log;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.io.Writer;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes18.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0002\b\t\b\u0000\u0018\u0000 \u00112\u00020\u0001:\u0001\fB\u0007¢\u0006\u0004\b\u000f\u0010\u0010J,\u0010\n\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0006\u001a\u0004\u0018\u00010\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0016J\u001e\u0010\u000b\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004J\u0010\u0010\f\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H\u0002J \u0010\u000e\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u0004H\u0002¨\u0006\u0012"}, d2 = {"Lcom/oplus/aiunit/vision/i7b;", "Lcom/oplus/aiunit/vision/a6b;", "", "priority", "", "tag", "message", "", "t", "", "log", "b", "a", "sub", "c", "<init>", "()V", "Companion", "nearx_release"}, k = 1, mv = {1, 6, 0})
public final class i7b implements a6b {
    public static final int a = 4000;

    public final String a(Throwable t) {
        StringWriter stringWriter = new StringWriter(256);
        PrintWriter printWriter = new PrintWriter((Writer) stringWriter, false);
        t.printStackTrace(printWriter);
        printWriter.flush();
        String string = stringWriter.toString();
        Intrinsics.checkNotNullExpressionValue(string, "sw.toString()");
        return string;
    }

    public final void b(int priority, @NotNull String tag, @NotNull String message) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(message, "message");
        int length = message.length() / a;
        if (length <= 0) {
            c(priority, tag, message);
            return;
        }
        int i = 0;
        int i2 = 0;
        while (i < length) {
            i++;
            int i3 = a + i2;
            String strSubstring = message.substring(i2, i3);
            Intrinsics.checkNotNullExpressionValue(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
            c(priority, tag, strSubstring);
            i2 = i3;
        }
        String strSubstring2 = message.substring(i2, message.length());
        Intrinsics.checkNotNullExpressionValue(strSubstring2, "this as java.lang.String…ing(startIndex, endIndex)");
        c(priority, tag, strSubstring2);
    }

    public final void c(int priority, String tag, String sub) {
        switch (priority) {
            case 2:
                Log.v(tag, sub);
                break;
            case 3:
                Log.d(tag, sub);
                break;
            case 4:
                Log.i(tag, sub);
                break;
            case 5:
                Log.w(tag, sub);
                break;
            case 6:
                Log.e(tag, sub);
                break;
            case 7:
                Log.wtf(tag, sub);
                break;
            default:
                Log.v(tag, sub);
                break;
        }
    }

    /* JADX WARN: Code duplicated, block: B:12:0x002f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:13:0x0031 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:14:0x0032  */
    @Override // com.oplus.aiunit.vision.a6b
    public void log(int priority, @NotNull String tag, @Nullable String message, @Nullable Throwable t) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        if (message != null) {
            if (message.length() == 0) {
                if (t == null) {
                    return;
                } else {
                    message = a(t);
                }
            } else if (t != null) {
                message = ((Object) message) + '\n' + a(t);
            }
        } else if (t == null) {
            return;
        } else {
            message = a(t);
        }
        b(priority, tag, message);
    }
}
