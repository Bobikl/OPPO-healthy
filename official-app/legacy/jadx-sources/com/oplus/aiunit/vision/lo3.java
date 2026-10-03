package com.oplus.aiunit.vision;

import org.jetbrains.annotations.NotNull;
import org.json.JSONException;
import org.json.JSONObject;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@dja(method = "sdk_version", uiThread = false)
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000 \f2\u00020\u0001:\u0001\rB\u0007¢\u0006\u0004\b\n\u0010\u000bJ \u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¨\u0006\u000e"}, d2 = {"Lcom/oplus/aiunit/vision/lo3;", "Lcom/oplus/aiunit/vision/nr9;", "Lcom/oplus/aiunit/vision/pr9;", "fragment", "Lcom/oplus/aiunit/vision/jja;", "apiArguments", "Lcom/oplus/aiunit/vision/kr9;", "callback", "", "execute", "<init>", "()V", "Companion", "a", "lib_webpro_jsbridge_release"}, k = 1, mv = {1, 4, 0})
public final class lo3 implements nr9 {
    @Override // com.oplus.aiunit.vision.nr9
    public void execute(@NotNull pr9 fragment, @NotNull jja apiArguments, @NotNull kr9 callback) throws JSONException {
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        Intrinsics.checkNotNullParameter(apiArguments, "apiArguments");
        Intrinsics.checkNotNullParameter(callback, "callback");
        JSONObject jSONObjectPut = new JSONObject().put("version", "1.0");
        Intrinsics.checkNotNullExpressionValue(jSONObjectPut, "JSONObject()\n           …BuildConfig.VERSION_NAME)");
        callback.success(jSONObjectPut);
    }
}
