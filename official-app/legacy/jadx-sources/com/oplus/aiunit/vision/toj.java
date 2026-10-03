package com.oplus.aiunit.vision;

import com.lifesense.weidong.lzsimplenetlibs.net.invoker.HttpStatus;
import io.netty.util.internal.StringUtil;
import java.util.Arrays;
import java.util.logging.Logger;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.jvm.internal.StringCompanionObject;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\u001a \u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002\u001a\u000e\u0010\n\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\b¨\u0006\u000b"}, d2 = {"Lcom/oplus/aiunit/vision/koj;", "task", "Lcom/oplus/aiunit/vision/xoj;", "queue", "", "message", "", "c", "", "ns", "b", "okhttp4_extension_release"}, k = 2, mv = {1, 4, 0})
public final class toj {
    @NotNull
    public static final String b(long j2) {
        String str;
        if (j2 <= -999500000) {
            str = ((j2 - ((long) 500000000)) / ((long) 1000000000)) + " s ";
        } else if (j2 <= -999500) {
            str = ((j2 - ((long) HttpStatus.USER_CANCEL)) / ((long) 1000000)) + " ms";
        } else if (j2 <= 0) {
            str = ((j2 - ((long) 500)) / ((long) 1000)) + " µs";
        } else if (j2 < 999500) {
            str = ((j2 + ((long) 500)) / ((long) 1000)) + " µs";
        } else if (j2 < 999500000) {
            str = ((j2 + ((long) HttpStatus.USER_CANCEL)) / ((long) 1000000)) + " ms";
        } else {
            str = ((j2 + ((long) 500000000)) / ((long) 1000000000)) + " s ";
        }
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        String str2 = String.format("%6s", Arrays.copyOf(new Object[]{str}, 1));
        Intrinsics.checkNotNullExpressionValue(str2, "java.lang.String.format(format, *args)");
        return str2;
    }

    public static final void c(koj kojVar, xoj xojVar, String str) {
        Logger loggerA = yoj.Companion.a();
        StringBuilder sb = new StringBuilder();
        sb.append(xojVar.getName());
        sb.append(StringUtil.SPACE);
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        String str2 = String.format("%-22s", Arrays.copyOf(new Object[]{str}, 1));
        Intrinsics.checkNotNullExpressionValue(str2, "java.lang.String.format(format, *args)");
        sb.append(str2);
        sb.append(": ");
        sb.append(kojVar.getName());
        loggerA.fine(sb.toString());
    }
}
