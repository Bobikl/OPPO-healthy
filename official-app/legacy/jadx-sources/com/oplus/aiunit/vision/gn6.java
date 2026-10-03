package com.oplus.aiunit.vision;

import com.heytap.store.base.core.http.HttpUtils;
import java.util.Base64;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.Result;
import p010kotlin.ResultKt;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.text.Charsets;
import p010kotlin.text.StringsKt__StringsJVMKt;
import p010kotlin.text.StringsKt___StringsKt;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a\u0018\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u001a\u001e\u0010\u0007\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u0000¨\u0006\b"}, d2 = {"", "msg", "Lcom/oplus/aiunit/vision/dn6;", "encryptConfig", "a", "pubKeyString", "rsaTransformation", "b", "OLog_release"}, k = 2, mv = {1, 8, 0})
public final class gn6 {
    @NotNull
    public static final String a(@NotNull String msg, @Nullable EncryptConfig encryptConfig) {
        Intrinsics.checkNotNullParameter(msg, "msg");
        Base64.Encoder encoder = Base64.getEncoder();
        byte[] bytes = msg.getBytes(Charsets.UTF_8);
        Intrinsics.checkNotNullExpressionValue(bytes, "this as java.lang.String).getBytes(charset)");
        String encodeString = encoder.encodeToString(bytes);
        if (encryptConfig == null) {
            Intrinsics.checkNotNullExpressionValue(encodeString, "encodeString");
            return encodeString;
        }
        String base64PaddingChar = encryptConfig.getBase64PaddingChar();
        if (base64PaddingChar != null) {
            Intrinsics.checkNotNullExpressionValue(encodeString, "encodeString");
            encodeString = StringsKt__StringsJVMKt.replace$default(encodeString, HttpUtils.EQUAL_SIGN, base64PaddingChar, false, 4, (Object) null);
        }
        String base64EncodeMsgHead = encryptConfig.getBase64EncodeMsgHead();
        if (base64EncodeMsgHead != null) {
            encodeString = base64EncodeMsgHead + ((Object) encodeString);
        }
        String base64EncodeMsgTail = encryptConfig.getBase64EncodeMsgTail();
        if (base64EncodeMsgTail != null) {
            encodeString = ((Object) encodeString) + base64EncodeMsgTail;
        }
        if (encryptConfig.getBase64FinalResultShouldReverse()) {
            Intrinsics.checkNotNullExpressionValue(encodeString, "encodeString");
            encodeString = StringsKt___StringsKt.reversed((CharSequence) encodeString).toString();
        }
        Intrinsics.checkNotNullExpressionValue(encodeString, "encodeString");
        return encodeString;
    }

    @NotNull
    public static final String b(@NotNull String msg, @NotNull String pubKeyString, @NotNull String rsaTransformation) {
        Intrinsics.checkNotNullParameter(msg, "msg");
        Intrinsics.checkNotNullParameter(pubKeyString, "pubKeyString");
        Intrinsics.checkNotNullParameter(rsaTransformation, "rsaTransformation");
        try {
            Result.Companion companion = Result.INSTANCE;
            return e9f.b(msg, e9f.a(pubKeyString), rsaTransformation);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            Object objM5287constructorimpl = Result.m5287constructorimpl(ResultKt.createFailure(th));
            Object obj = msg;
            if (!Result.m5293isFailureimpl(objM5287constructorimpl)) {
                obj = objM5287constructorimpl;
            }
            return (String) obj;
        }
    }
}
