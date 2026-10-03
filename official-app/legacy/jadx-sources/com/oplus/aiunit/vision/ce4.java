package com.oplus.aiunit.vision;

import androidx.autofill.HintConstants;
import java.nio.charset.Charset;
import okio.ByteString;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.jvm.JvmOverloads;
import p010kotlin.jvm.JvmStatic;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\b\u0010\tJ\"\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u0005H\u0007¨\u0006\n"}, d2 = {"Lcom/oplus/aiunit/vision/ce4;", "", "", HintConstants.AUTOFILL_HINT_USERNAME, HintConstants.AUTOFILL_HINT_PASSWORD, "Ljava/nio/charset/Charset;", "charset", "a", "<init>", "()V", "okhttp4_extension_release"}, k = 1, mv = {1, 4, 0})
public final class ce4 {
    public static final ce4 INSTANCE = new ce4();

    @JvmStatic
    @JvmOverloads
    @NotNull
    public static final String a(@NotNull String username, @NotNull String password, @NotNull Charset charset) {
        Intrinsics.checkNotNullParameter(username, "username");
        Intrinsics.checkNotNullParameter(password, "password");
        Intrinsics.checkNotNullParameter(charset, "charset");
        return "Basic " + ByteString.INSTANCE.encodeString(username + ':' + password, charset).base64();
    }
}
