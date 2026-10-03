package com.oplus.pantaconnect.sdk.connectionservice;

import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.jvm.JvmStatic;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0015\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0007H\u0001¢\u0006\u0002\b\tR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/oplus/pantaconnect/sdk/connectionservice/SensitiveLogUtils;", "", "()V", "LENGTH_MAX", "", "LENGTH_MAX_SHOW", "toHidden", "", "target", "toHidden$connectionservice_release", "connectionservice_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class SensitiveLogUtils {

    @NotNull
    public static final SensitiveLogUtils INSTANCE = new SensitiveLogUtils();
    private static final int LENGTH_MAX = 8;
    private static final int LENGTH_MAX_SHOW = 4;

    private SensitiveLogUtils() {
    }

    @JvmStatic
    @NotNull
    public static final String toHidden$connectionservice_release(@NotNull String target) {
        int length;
        if (target.length() == 0 || (length = target.length()) == 1) {
            return target;
        }
        if (length <= 8) {
            StringBuilder sb = new StringBuilder();
            int i = length - (length / 2);
            for (int i2 = 0; i2 < length; i2++) {
                if (i2 < i) {
                    sb.append("*");
                } else {
                    sb.append(target.charAt(i2));
                }
            }
            return sb.toString();
        }
        StringBuilder sb2 = new StringBuilder("*(");
        int i3 = length - 4;
        sb2.append(i3);
        sb2.append(')');
        StringBuilder sb3 = new StringBuilder(sb2.toString());
        while (i3 < length) {
            sb3.append(target.charAt(i3));
            i3++;
        }
        return sb3.toString();
    }
}
