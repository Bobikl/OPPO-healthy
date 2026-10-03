package com.oplus.web.container.config.usecase;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.oplus.aiunit.vision.abm;
import com.oplus.aiunit.vision.axf;
import com.oplus.aiunit.vision.bs9;
import com.oplus.aiunit.vision.exf;
import com.oplus.aiunit.vision.itf;
import com.oplus.aiunit.vision.ks2;
import com.oplus.aiunit.vision.mp2;
import com.oplus.aiunit.vision.nt2;
import com.oplus.aiunit.vision.q94;
import com.oplus.aiunit.vision.s6h;
import com.oplus.aiunit.vision.vgd;
import com.oplus.aiunit.vision.xqc;
import com.oplus.aiunit.vision.y8b;
import com.oplus.web.container.config.model.Area;
import com.oplus.web.container.config.model.ConfigInfo;
import com.oplus.web.container.config.model.ConfigRequest;
import com.oplus.webcontainer.net.response.SuccessResponse;
import java.io.IOException;
import okhttp3.MediaType;
import okhttp3.Request;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes8.dex */
public class ConfigUseCase {
    public static final vgd a = xqc.a(q94.b());

    public class a implements nt2 {
        public void onFailure(@NonNull ks2 ks2Var, @NonNull IOException iOException) {
            y8b.d("ConfigUseCase", "exception:" + iOException);
        }

        public void onResponse(@NonNull ks2 ks2Var, @NonNull axf axfVar) {
            exf exfVarG = axfVar.g();
            if (!axfVar.b() || exfVarG == null) {
                return;
            }
            try {
                String strS = exfVarG.s();
                if (TextUtils.isEmpty(strS)) {
                    return;
                }
                mp2.b().d("key_host_config", strS).a();
                y8b.a("ConfigUseCase", "hostConfigInfo:" + strS);
            } catch (Throwable th) {
                y8b.d("ConfigUseCase", "reqHostConfigInfo" + th);
            }
        }
    }

    public static String a(String str) {
        try {
            String strA = ((bs9) Class.forName("com.oplus.web.container.debug.env.DebugHost").getDeclaredConstructor(new Class[0]).newInstance(new Object[0])).a(str);
            if (!TextUtils.isEmpty(strA)) {
                return strA;
            }
        } catch (Throwable th) {
            y8b.l("ConfigUseCase", "throwable:" + th.getLocalizedMessage());
        }
        Area area = Area.CN;
        if (area.value.equalsIgnoreCase(str)) {
            return abm.b(area.host);
        }
        Area area2 = Area.IN;
        if (area2.value.equalsIgnoreCase(str)) {
            return abm.b(area2.host);
        }
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return abm.b(Area.SG.host);
    }

    public static String b(String str) {
        return a(str) + "/api/marketing/v2/domain-whitelist-config";
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static ConfigInfo c() {
        String strC = mp2.b().c("key_host_config", null);
        if (!TextUtils.isEmpty(strC)) {
            try {
                SuccessResponse successResponse = (SuccessResponse) new Gson().fromJson(strC, new TypeToken<SuccessResponse<ConfigInfo>>() { // from class: com.oplus.web.container.config.usecase.ConfigUseCase.2
                }.getType());
                if (successResponse != null && Boolean.TRUE.equals(successResponse.success)) {
                    return (ConfigInfo) successResponse.data;
                }
            } catch (Throwable th) {
                y8b.d("ConfigUseCase", "getHostConfig#" + th);
            }
        }
        return null;
    }

    public static void d(String str) {
        String strB = b(str);
        y8b.a("ConfigUseCase", "hostConfigInfoUrl:" + strB);
        ConfigRequest configRequest = new ConfigRequest(str);
        configRequest.sign = s6h.f(configRequest);
        a.a(new Request.Builder().url(strB).post(itf.create(MediaType.parse("application/json; charset=utf-8"), new Gson().toJson(configRequest))).build()).g(new a());
    }
}
