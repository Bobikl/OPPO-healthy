package com.oplus.aiunit.vision;

import com.heytap.connect.config.connectid.ConnectIdLogic;
import java.security.MessageDigest;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.JvmStatic;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\t\u0010\nJ\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0007J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002J\u0012\u0010\b\u001a\u0004\u0018\u00010\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¨\u0006\u000b"}, d2 = {"Lcom/oplus/aiunit/vision/dcb;", "", "", "byteArray", "", ConnectIdLogic.PARAM_ALGORITHM, "a", "b", "c", "<init>", "()V", "thirdparty_impl_release"}, k = 1, mv = {1, 8, 0})
public final class dcb {

    @NotNull
    public static final dcb INSTANCE = new dcb();

    @JvmStatic
    @Nullable
    public static final String a(@Nullable byte[] byteArray, @NotNull String algorithm) {
        Intrinsics.checkNotNullParameter(algorithm, "algorithm");
        if (byteArray == null) {
            return null;
        }
        try {
            MessageDigest messageDigest = MessageDigest.getInstance(algorithm);
            messageDigest.update(byteArray);
            byte[] encrypt = messageDigest.digest();
            StringBuilder sb = new StringBuilder();
            Intrinsics.checkNotNullExpressionValue(encrypt, "encrypt");
            for (byte b : encrypt) {
                String hexString = Integer.toHexString(b & 255);
                if (hexString.length() == 1) {
                    sb.append('0');
                }
                sb.append(hexString);
            }
            return sb.toString();
        } catch (Exception e2) {
            k25.b("MD5Utils", "encrypt Exception " + e2);
            return null;
        }
    }

    @Nullable
    public final String b(@Nullable byte[] byteArray) {
        return a(byteArray, "MD5");
    }

    @Nullable
    public final String c(@Nullable byte[] byteArray) {
        return a(byteArray, gc0.SHA256);
    }
}
