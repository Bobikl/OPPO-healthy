package com.oplus.aiunit.vision;

import androidx.exifinterface.media.ExifInterface;
import com.google.protobuf.StringValue;
import java.security.MessageDigest;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.JvmStatic;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\nB\t\b\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ \u0010\b\u001a\u00020\u00072\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0007J\b\u0010\n\u001a\u00020\tH\u0007J\u0012\u0010\r\u001a\u00020\u00052\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0007¨\u0006\u0010"}, d2 = {"Lcom/oplus/aiunit/vision/x64;", "", "Lcom/oplus/aiunit/vision/x64$a;", "Lcom/google/protobuf/StringValue;", "method", "", "data", "", "c", "", "a", "", "srcBytes", "b", "<init>", "()V", "contactsync_impl_release"}, k = 1, mv = {1, 8, 0})
public final class x64 {

    @NotNull
    public static final x64 INSTANCE = new x64();

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\bæ\u0080\u0001\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00028\u0000H&¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/oplus/aiunit/vision/x64$a;", ExifInterface.GPS_DIRECTION_TRUE, "", "data", "", "invoke", "(Ljava/lang/Object;)V", "contactsync_impl_release"}, k = 1, mv = {1, 8, 0})
    public interface a<T> {
        void invoke(T data);
    }

    @JvmStatic
    public static final boolean a() {
        return true;
    }

    @JvmStatic
    @NotNull
    public static final String b(@Nullable byte[] srcBytes) {
        if (srcBytes != null) {
            if (!(srcBytes.length == 0)) {
                try {
                    MessageDigest messageDigest = MessageDigest.getInstance("MD5");
                    Intrinsics.checkNotNullExpressionValue(messageDigest, "getInstance(\"MD5\")");
                    byte[] bytes = messageDigest.digest(srcBytes);
                    StringBuilder sb = new StringBuilder();
                    Intrinsics.checkNotNullExpressionValue(bytes, "bytes");
                    for (byte b : bytes) {
                        String hexString = Integer.toHexString(b & 255);
                        if (hexString.length() == 1) {
                            hexString = "0" + hexString;
                        }
                        sb.append(hexString);
                    }
                    String string = sb.toString();
                    Intrinsics.checkNotNullExpressionValue(string, "result.toString()");
                    return string;
                } catch (Exception e2) {
                    u64.c("StringUtils", e2.getMessage(), new Object[0]);
                }
            }
        }
        return "";
    }

    @JvmStatic
    public static final void c(@NotNull a<StringValue> method, @Nullable String data) {
        Intrinsics.checkNotNullParameter(method, "method");
        boolean z = false;
        if (data != null) {
            if (data.length() > 0) {
                z = true;
            }
        }
        if (z) {
            StringValue stringValueOf = StringValue.of(d34.a(gl4.managerApi.getCurrentConnectId()).n(data));
            Intrinsics.checkNotNullExpressionValue(stringValueOf, "of(fixed)");
            method.invoke(stringValueOf);
        }
    }
}
