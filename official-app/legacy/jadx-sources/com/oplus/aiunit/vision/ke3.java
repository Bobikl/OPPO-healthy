package com.oplus.aiunit.vision;

import android.util.Log;
import org.json.JSONException;
import org.json.JSONObject;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \b2\u00020\u0001:\u0001\u0003B\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0006\u0010\u0003\u001a\u00020\u0002¨\u0006\t"}, d2 = {"Lcom/oplus/aiunit/vision/ke3;", "Lcom/oplus/aiunit/vision/ry7;", "", "a", "Lcom/oplus/aiunit/vision/d0;", "context", "<init>", "(Lcom/oplus/aiunit/vision/d0;)V", "Companion", "aiunit.sdk.healthClassify_release"}, k = 1, mv = {1, 9, 0})
public final class ke3 extends ry7 {
    public static final String CLASSIFY_RESULT_KEY = "classify_result";
    public static final String TAG = "ClassifyInputSlot";

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ke3(d0 context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public final int a() {
        JSONObject jSONObject;
        String jsonResult = getJsonResult();
        if (jsonResult == null || jsonResult.length() == 0) {
            return 1;
        }
        try {
            jSONObject = new JSONObject(jsonResult);
        } catch (JSONException unused) {
            jSONObject = null;
        }
        if (jSONObject == null) {
            return 1;
        }
        try {
            Object obj = jSONObject.get(CLASSIFY_RESULT_KEY);
            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.Int");
            return ((Integer) obj).intValue();
        } catch (JSONException e2) {
            Log.i(TAG, "getPredictResult e:" + e2.getMessage());
            return 1;
        }
    }
}
