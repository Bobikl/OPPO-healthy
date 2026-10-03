package com.oplus.aiunit.vision;

import android.content.Context;
import com.oplus.accountsdk.base.common.feq.FreqStrategyType;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public interface kl9 {

    public static /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[FreqStrategyType.values().length];
            a = iArr;
            try {
                iArr[FreqStrategyType.SUCCESS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[FreqStrategyType.FAIL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    wj a(JSONObject jSONObject, Context context);

    default jl9 b(FreqStrategyType freqStrategyType, JSONObject jSONObject, Context context) {
        int i = a.a[freqStrategyType.ordinal()];
        if (i == 1) {
            return a(jSONObject, context);
        }
        if (i != 2) {
            return null;
        }
        return d(jSONObject, context);
    }

    JSONObject c(Context context, String str);

    r8 d(JSONObject jSONObject, Context context);
}
