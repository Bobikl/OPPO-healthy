package com.oplus.aiunit.vision;

import android.content.Context;
import android.util.ArrayMap;
import androidx.annotation.NonNull;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.Observer;
import com.oplus.statistics.storage.PreferenceHandler;
import com.oplus.web.container.comunication.common.exception.NotImplementException;
import com.oplus.web.container.safe.model.HostSecurityLevel;
import java.util.HashMap;
import org.json.JSONObject;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes8.dex */
public abstract class f78 extends d61 {

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

    public f78() {
        super("vip", "getToken");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ void j(uo3 uo3Var, HostSecurityLevel hostSecurityLevel, rs9 rs9Var) {
        T t;
        if (!uo3Var.a || (t = uo3Var.b) == 0) {
            dri.h(xg1.a("failed"));
            c(rs9Var);
        } else {
            JSONObject jSONObjectL = l((JSONObject) t, hostSecurityLevel);
            dri.h(xg1.a("success"));
            f(rs9Var, jSONObjectL);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void k(final HostSecurityLevel hostSecurityLevel, final rs9 rs9Var, final uo3 uo3Var) {
        o0k.k(new Runnable() { // from class: com.oplus.aiunit.vision.d78
            @Override // java.lang.Runnable
            public final void run() {
                this.i.j(uo3Var, hostSecurityLevel, rs9Var);
            }
        });
    }

    @Override // com.oplus.aiunit.vision.ws9
    public boolean a(@NonNull us9 us9Var, @NonNull ska skaVar, @NonNull final rs9 rs9Var) throws Throwable {
        LiveData<uo3<JSONObject>> liveDataI = i(us9Var.getActivity());
        if (liveDataI == null) {
            throw new NotImplementException("GetTokenInterceptor not impl");
        }
        final HostSecurityLevel hostSecurityLevelB = b(us9Var);
        if (!(us9Var instanceof LifecycleOwner)) {
            return true;
        }
        liveDataI.observe((LifecycleOwner) us9Var, new Observer() { // from class: com.oplus.aiunit.vision.b78
            public final void onChanged(Object obj) {
                this.i.k(hostSecurityLevelB, rs9Var, (uo3) obj);
            }
        });
        return true;
    }

    public abstract LiveData<uo3<JSONObject>> i(Context context);

    public JSONObject l(JSONObject jSONObject, HostSecurityLevel hostSecurityLevel) {
        ArrayMap arrayMap = new ArrayMap();
        String strOptString = jSONObject.optString("secondaryToken");
        String strOptString2 = jSONObject.optString(PreferenceHandler.SSOID);
        arrayMap.put("token", strOptString);
        arrayMap.put(PreferenceHandler.SSOID, strOptString2);
        arrayMap.put("classifyByAge", jSONObject.optString("classifyByAge"));
        ArrayMap arrayMap2 = new ArrayMap();
        arrayMap2.put("accountName", jSONObject.optString("accountName"));
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
