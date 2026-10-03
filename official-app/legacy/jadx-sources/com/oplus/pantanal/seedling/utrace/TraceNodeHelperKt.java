package com.oplus.pantanal.seedling.utrace;

import android.os.Bundle;
import com.oplus.pantanal.seedling.constants.TraceConstants;
import com.oplus.pantanal.seedling.intent.IntentManager;
import com.oplus.pantanal.seedling.util.Logger;
import com.oplus.utrace.sdk.UTraceCompat;
import com.oplus.utrace.sdk.UTraceContext;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;
import org.json.JSONException;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u001a\f\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u0002\u001a\u0014\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004\u001a\u0012\u0010\u0005\u001a\u00020\u0006*\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0001\u001a\u001a\u0010\u0005\u001a\u00020\u0006*\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0004\u001a\u0012\u0010\b\u001a\u00020\u0006*\u00020\u00022\u0006\u0010\t\u001a\u00020\u0004¨\u0006\n"}, d2 = {"getTraceContext", "Lcom/oplus/utrace/sdk/UTraceContext;", "Landroid/os/Bundle;", "key", "", "saveTraceContext", "", "traceCtx", "saveTraceContextToIntentValue", "traceCtxJson", "seedling-support_manualRelease"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class TraceNodeHelperKt {
    @Nullable
    public static final UTraceContext getTraceContext(@NotNull Bundle bundle) {
        Intrinsics.checkNotNullParameter(bundle, "<this>");
        String string = bundle.getString(TraceConstants.KEY_TRACE_CONTEXT, "");
        UTraceCompat uTraceCompat = UTraceCompat.INSTANCE;
        Intrinsics.checkNotNull(string);
        return uTraceCompat.readFromJsonString(string);
    }

    public static final void saveTraceContext(@NotNull Bundle bundle, @NotNull UTraceContext traceCtx) {
        Intrinsics.checkNotNullParameter(bundle, "<this>");
        Intrinsics.checkNotNullParameter(traceCtx, "traceCtx");
        bundle.putString(TraceConstants.KEY_TRACE_CONTEXT, UTraceCompat.INSTANCE.writeToJsonString(traceCtx));
        Logger.INSTANCE.i(TraceNodeHelper.TAG, "saveTraceContext to bundle=" + traceCtx);
    }

    public static final void saveTraceContextToIntentValue(@NotNull Bundle bundle, @NotNull String traceCtxJson) throws JSONException {
        Intrinsics.checkNotNullParameter(bundle, "<this>");
        Intrinsics.checkNotNullParameter(traceCtxJson, "traceCtxJson");
        JSONArray jSONArray = new JSONArray(bundle.getString(IntentManager.KEY_INTENT_VALUE));
        int length = jSONArray.length();
        for (int i = 0; i < length; i++) {
            jSONArray.optJSONObject(i).put(TraceConstants.KEY_TRACE_CONTEXT, traceCtxJson);
        }
        bundle.putString(IntentManager.KEY_INTENT_VALUE, jSONArray.toString());
        bundle.putString(TraceConstants.KEY_TRACE_CONTEXT, traceCtxJson);
        Logger.INSTANCE.i(TraceNodeHelper.TAG, "supportSDK_send_intent_trace_context_to_ums is " + traceCtxJson);
    }

    @Nullable
    public static final UTraceContext getTraceContext(@NotNull Bundle bundle, @NotNull String key) {
        Intrinsics.checkNotNullParameter(bundle, "<this>");
        Intrinsics.checkNotNullParameter(key, "key");
        String string = bundle.getString(key, "");
        UTraceCompat uTraceCompat = UTraceCompat.INSTANCE;
        Intrinsics.checkNotNull(string);
        return uTraceCompat.readFromJsonString(string);
    }

    public static final void saveTraceContext(@NotNull Bundle bundle, @NotNull UTraceContext traceCtx, @NotNull String key) {
        Intrinsics.checkNotNullParameter(bundle, "<this>");
        Intrinsics.checkNotNullParameter(traceCtx, "traceCtx");
        Intrinsics.checkNotNullParameter(key, "key");
        bundle.putString(key, UTraceCompat.INSTANCE.writeToJsonString(traceCtx));
        Logger.INSTANCE.i(TraceNodeHelper.TAG, "key=" + key + " saveTraceContext to bundle=" + traceCtx);
    }
}
