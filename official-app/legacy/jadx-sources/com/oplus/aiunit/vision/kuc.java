package com.oplus.aiunit.vision;

import com.oplus.accountsdk.base.account.trace.AcBaseTraceHelper;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\f\u0010\rJ \u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J\u0010\u0010\n\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J\u0018\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¨\u0006\u000e"}, d2 = {"Lcom/oplus/aiunit/vision/kuc;", "Lcom/oplus/aiunit/vision/kr9;", "", "code", "", "message", "Lorg/json/JSONObject;", "obj", "", "a", "success", AcBaseTraceHelper.VAL_FAIL, "<init>", "()V", "lib_webpro_release"}, k = 1, mv = {1, 4, 0})
public final class kuc implements kr9 {
    @Override // com.oplus.aiunit.vision.kr9
    public void a(@NotNull Object code, @NotNull String message, @NotNull JSONObject obj) {
        Intrinsics.checkNotNullParameter(code, "code");
        Intrinsics.checkNotNullParameter(message, "message");
        Intrinsics.checkNotNullParameter(obj, "obj");
    }

    @Override // com.oplus.aiunit.vision.kr9
    public void fail(@NotNull Object code, @NotNull String message) {
        Intrinsics.checkNotNullParameter(code, "code");
        Intrinsics.checkNotNullParameter(message, "message");
    }

    @Override // com.oplus.aiunit.vision.kr9
    public void success(@NotNull JSONObject obj) {
        Intrinsics.checkNotNullParameter(obj, "obj");
    }
}
