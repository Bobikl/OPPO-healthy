package com.heytap.store.base.core.http;

import com.heytap.connect.config.connectid.ConnectIdLogic;
import com.heytap.health.watch.netnumber.callinterception.AbsCallInterceptionHandlerKt;
import com.heytap.store.base.core.util.ReflectUtil;
import com.oplus.aiunit.vision.auf;
import com.oplus.aiunit.vision.ytf;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.text.StringsKt__StringsKt;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002J\u0012\u0010\u0007\u001a\u00020\u00042\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002H\u0016J\u001a\u0010\t\u001a\u00020\u00042\b\u0010\u0006\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0003\u001a\u00020\bH\u0016J\b\u0010\u000b\u001a\u00020\nH\u0016R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\"\u0010\u0005\u001a\u00020\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013¨\u0006\u0016"}, d2 = {"Lcom/heytap/store/base/core/http/ResponseLoginCheck;", "Lcom/oplus/aiunit/vision/auf;", "", AbsCallInterceptionHandlerKt.GSON_KEY_RESPONSE, "", "needToLogin", "result", "checkLogin", "Lcom/oplus/aiunit/vision/ytf;", "checkResponse", "", "isNeedToLogin", "", "CODE", "Ljava/lang/String;", "Z", "getNeedToLogin", "()Z", "setNeedToLogin", "(Z)V", "<init>", "()V", "Core_release"}, k = 1, mv = {1, 6, 0})
public final class ResponseLoginCheck implements auf {

    @NotNull
    private static final String CODE = "403";

    @NotNull
    public static final ResponseLoginCheck INSTANCE = new ResponseLoginCheck();
    private static boolean needToLogin;

    private ResponseLoginCheck() {
    }

    @Override // com.oplus.aiunit.vision.auf
    public void checkLogin(@Nullable Object result) {
    }

    public void checkResponse(@Nullable Object result, @NotNull ytf response) {
        Intrinsics.checkNotNullParameter(response, "response");
        needToLogin(result);
    }

    public final boolean getNeedToLogin() {
        return needToLogin;
    }

    public boolean isNeedToLogin() {
        boolean z = needToLogin;
        needToLogin = false;
        return z;
    }

    public final void needToLogin(@Nullable Object response) {
        String string;
        Object fieldValue = ReflectUtil.getFieldValue(response, ConnectIdLogic.PARAM_META);
        boolean z = false;
        if (fieldValue != null && (string = fieldValue.toString()) != null && StringsKt__StringsKt.contains$default((CharSequence) string, (CharSequence) CODE, false, 2, (Object) null)) {
            z = true;
        }
        if (z) {
            needToLogin = true;
        }
    }

    public final void setNeedToLogin(boolean z) {
        needToLogin = z;
    }
}
