package com.oplus.aiunit.vision;

import android.content.Context;
import android.util.ArrayMap;
import androidx.annotation.NonNull;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.Observer;
import com.oplus.accountsdk.open.core.web.executor.AcOpenGetTokenExecutor;
import com.oplus.web.container.comunication.common.exception.NotImplementException;
import com.oplus.web.container.safe.model.HostSecurityLevel;
import com.platform.sdk.center.webview.js.AcCommonApiMethod;
import java.util.HashMap;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public abstract class c68 extends p51 {

    public static /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[HostSecurityLevel.values().length];
            a = iArr;
            try {
                iArr[HostSecurityLevel.HIGH.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[HostSecurityLevel.MEDIUM.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[HostSecurityLevel.NONE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public c68() {
        super("vip", AcCommonApiMethod.GET_TOKEN);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ void j(go3 go3Var, HostSecurityLevel hostSecurityLevel, lr9 lr9Var) {
        T t;
        if (!go3Var.a || (t = go3Var.b) == 0) {
            lni.h(ig1.a(com.alipay.sdk.m.u.h.i));
            c(lr9Var);
        } else {
            JSONObject jSONObjectL = l((JSONObject) t, hostSecurityLevel);
            lni.h(ig1.a("success"));
            f(lr9Var, jSONObjectL);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void k(final HostSecurityLevel hostSecurityLevel, final lr9 lr9Var, final go3 go3Var) {
        mwj.k(new Runnable() { // from class: com.oplus.aiunit.vision.a68
            @Override // java.lang.Runnable
            public final void run() {
                this.i.j(go3Var, hostSecurityLevel, lr9Var);
            }
        });
    }

    @Override // com.oplus.aiunit.vision.qr9
    public boolean a(@NonNull or9 or9Var, @NonNull kja kjaVar, @NonNull final lr9 lr9Var) throws Throwable {
        LiveData<go3<JSONObject>> liveDataI = i(or9Var.getActivity());
        if (liveDataI == null) {
            throw new NotImplementException("GetTokenInterceptor not impl");
        }
        final HostSecurityLevel hostSecurityLevelB = b(or9Var);
        if (!(or9Var instanceof LifecycleOwner)) {
            return true;
        }
        liveDataI.observe((LifecycleOwner) or9Var, new Observer() { // from class: com.oplus.aiunit.vision.y58
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                this.i.k(hostSecurityLevelB, lr9Var, (go3) obj);
            }
        });
        return true;
    }

    public abstract LiveData<go3<JSONObject>> i(Context context);

    public JSONObject l(JSONObject jSONObject, HostSecurityLevel hostSecurityLevel) {
        ArrayMap arrayMap = new ArrayMap();
        String strOptString = jSONObject.optString("secondaryToken");
        String strOptString2 = jSONObject.optString("ssoid");
        arrayMap.put("token", strOptString);
        arrayMap.put("ssoid", strOptString2);
        arrayMap.put("classifyByAge", jSONObject.optString("classifyByAge"));
        ArrayMap arrayMap2 = new ArrayMap();
        arrayMap2.put(AcOpenGetTokenExecutor.ACCOUNT_NAME_KEY, jSONObject.optString(AcOpenGetTokenExecutor.ACCOUNT_NAME_KEY));
        arrayMap2.put("country", jSONObject.optString("country"));
        ArrayMap arrayMap3 = new ArrayMap();
        arrayMap3.put("token_s", jSONObject.optString("token_s"));
        arrayMap3.put("ssoid_s", jSONObject.optString("ssoid_s"));
        HashMap map = new HashMap(8);
        int i = a.a[hostSecurityLevel.ordinal()];
        if (i == 1) {
            map.putAll(arrayMap);
            map.putAll(arrayMap2);
            map.putAll(arrayMap3);
        } else if (i != 2) {
            map.putAll(arrayMap3);
        } else {
            map.putAll(arrayMap2);
            map.putAll(arrayMap3);
        }
        return new JSONObject(map);
    }
}
