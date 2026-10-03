package com.oplus.pay.opensdk.msp.pay;

import com.heytap.health.watch.netnumber.callinterception.AbsCallInterceptionHandlerKt;
import com.heytap.msp.bean.Response;
import java.io.Serializable;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\nX\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001a\u0010\u000f\u001a\u00020\u0010X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Lcom/oplus/pay/opensdk/msp/pay/PayPerResponse;", "Ljava/io/Serializable;", "()V", "params", "", "getParams", "()Ljava/lang/String;", "setParams", "(Ljava/lang/String;)V", AbsCallInterceptionHandlerKt.GSON_KEY_RESPONSE, "Lcom/heytap/msp/bean/Response;", "getResponse", "()Lcom/heytap/msp/bean/Response;", "setResponse", "(Lcom/heytap/msp/bean/Response;)V", "result", "", "getResult", "()Z", "setResult", "(Z)V", "paysdk_msp_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class PayPerResponse implements Serializable {

    @NotNull
    private String params = "";
    public Response response;
    private boolean result;

    @NotNull
    public final String getParams() {
        return this.params;
    }

    @NotNull
    public final Response getResponse() {
        Response response = this.response;
        if (response != null) {
            return response;
        }
        Intrinsics.throwUninitializedPropertyAccessException(AbsCallInterceptionHandlerKt.GSON_KEY_RESPONSE);
        return null;
    }

    public final boolean getResult() {
        return this.result;
    }

    public final void setParams(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.params = str;
    }

    public final void setResponse(@NotNull Response response) {
        Intrinsics.checkNotNullParameter(response, "<set-?>");
        this.response = response;
    }

    public final void setResult(boolean z) {
        this.result = z;
    }
}
