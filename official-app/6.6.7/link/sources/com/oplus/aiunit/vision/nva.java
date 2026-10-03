package com.oplus.aiunit.vision;

import androidx.annotation.NonNull;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes8.dex */
public abstract class nva extends d61 {
    public nva() {
        super("vip", "launchActivity");
    }

    @Override // com.oplus.aiunit.vision.ws9
    public boolean a(@NonNull us9 us9Var, @NonNull ska skaVar, @NonNull rs9 rs9Var) {
        try {
            Map<String, String> mapG = g(us9Var, skaVar.a());
            if (mapG == null) {
                d(rs9Var, 5000, "map is null");
            } else {
                f(rs9Var, new JSONObject(mapG));
            }
            return true;
        } catch (Throwable th) {
            d(rs9Var, 5000, th.getMessage());
            return true;
        }
    }

    public abstract Map<String, String> g(us9 us9Var, JSONObject jSONObject);
}
