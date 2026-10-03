package com.oplus.aiunit.vision;

import android.content.Context;
import com.oplus.accountsdk.base.common.feq.FreqStrategyType;
import com.oplus.accountsdk.base.common.util.AcLogUtil;
import com.platform.usercenter.account.ams.ipc.support.AcIpcResponse;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public class v8 {
    public final List<jl9> a;

    @Deprecated
    public static final String STRATEGY_SUCCESS = FreqStrategyType.SUCCESS.getValue();

    @Deprecated
    public static final String STRATEGY_FAIL = FreqStrategyType.FAIL.getValue();

    public v8(List<jl9> list) {
        if (list != null && !list.isEmpty()) {
            this.a = new ArrayList(list);
        } else {
            AcLogUtil.w("AcFreqController", "AcFreqController created with empty strategies");
            this.a = new ArrayList();
        }
    }

    public static v8 c(Context context, String str, kl9 kl9Var, FreqStrategyType... freqStrategyTypeArr) {
        JSONObject jSONObjectC = kl9Var.c(context, str);
        ArrayList arrayList = new ArrayList();
        for (FreqStrategyType freqStrategyType : freqStrategyTypeArr) {
            jl9 jl9VarB = kl9Var.b(freqStrategyType, jSONObjectC, context);
            if (jl9VarB != null) {
                arrayList.add(jl9VarB);
            } else {
                AcLogUtil.w("AcFreqController", "Failed to create strategy: " + freqStrategyType);
            }
        }
        return new v8(arrayList);
    }

    public void a(String str, AcIpcResponse acIpcResponse) {
        Iterator<jl9> it = this.a.iterator();
        while (it.hasNext()) {
            it.next().a(str, acIpcResponse);
        }
    }

    public String b(String str) {
        for (jl9 jl9Var : this.a) {
            if (jl9Var.d(str)) {
                AcLogUtil.i("AcFreqController", str + " request is interrupted by " + jl9Var.b());
                return jl9Var.b();
            }
        }
        Iterator<jl9> it = this.a.iterator();
        while (it.hasNext()) {
            it.next().c(str);
        }
        return null;
    }
}
