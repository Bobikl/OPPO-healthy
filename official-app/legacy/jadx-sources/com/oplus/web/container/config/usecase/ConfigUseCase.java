package com.oplus.web.container.config.usecase;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.oplus.aiunit.vision.a3h;
import com.oplus.aiunit.vision.c7m;
import com.oplus.aiunit.vision.c94;
import com.oplus.aiunit.vision.cuf;
import com.oplus.aiunit.vision.efd;
import com.oplus.aiunit.vision.fpc;
import com.oplus.aiunit.vision.gqf;
import com.oplus.aiunit.vision.m7b;
import com.oplus.aiunit.vision.vq9;
import com.oplus.aiunit.vision.wr2;
import com.oplus.aiunit.vision.yo2;
import com.oplus.aiunit.vision.ytf;
import com.oplus.aiunit.vision.zs2;
import com.oplus.web.container.config.model.Area;
import com.oplus.web.container.config.model.ConfigInfo;
import com.oplus.web.container.config.model.ConfigRequest;
import com.oplus.webcontainer.net.response.SuccessResponse;
import java.io.IOException;
import okhttp3.MediaType;
import okhttp3.Request;

/* JADX INFO: loaded from: classes2.dex */
public class ConfigUseCase {
    public static final efd a = fpc.a(c94.b());

    public class a implements zs2 {
        @Override // com.oplus.aiunit.vision.zs2
        public void onFailure(@NonNull wr2 wr2Var, @NonNull IOException iOException) {
            m7b.d("ConfigUseCase", "exception:" + iOException);
        }

        @Override // com.oplus.aiunit.vision.zs2
        public void onResponse(@NonNull wr2 wr2Var, @NonNull ytf ytfVar) {
            cuf body = ytfVar.getBody();
            if (!ytfVar.b() || body == null) {
                return;
            }
            try {
                String strS = body.s();
                if (TextUtils.isEmpty(strS)) {
                    return;
                }
                yo2.b().d("key_host_config", strS).a();
                m7b.a("ConfigUseCase", "hostConfigInfo:" + strS);
            } catch (Throwable th) {
                m7b.d("ConfigUseCase", "reqHostConfigInfo" + th);
            }
        }
    }

    public static String a(String str) {
        try {
            String strA = ((vq9) Class.forName("com.oplus.web.container.debug.env.DebugHost").getDeclaredConstructor(new Class[0]).newInstance(new Object[0])).a(str);
            if (!TextUtils.isEmpty(strA)) {
                return strA;
            }
        } catch (Throwable th) {
            m7b.l("ConfigUseCase", "throwable:" + th.getLocalizedMessage());
        }
        Area area = Area.CN;
        if (area.value.equalsIgnoreCase(str)) {
            return c7m.b(area.host);
        }
        Area area2 = Area.IN;
        if (area2.value.equalsIgnoreCase(str)) {
            return c7m.b(area2.host);
        }
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return c7m.b(Area.SG.host);
    }

    public static String b(String str) {
        return a(str) + "/api/marketing/v2/domain-whitelist-config";
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static ConfigInfo c() {
        String strC = yo2.b().c("key_host_config", null);
        if (!TextUtils.isEmpty(strC)) {
            try {
                SuccessResponse successResponse = (SuccessResponse) new Gson().fromJson(strC, new TypeToken<SuccessResponse<ConfigInfo>>() { // from class: com.oplus.web.container.config.usecase.ConfigUseCase.2
                }.getType());
                if (successResponse != null && Boolean.TRUE.equals(successResponse.success)) {
                    return (ConfigInfo) successResponse.data;
                }
            } catch (Throwable th) {
                m7b.d("ConfigUseCase", "getHostConfig#" + th);
            }
        }
        return null;
    }

    public static void d(String str) {
        String strB = b(str);
        m7b.a("ConfigUseCase", "hostConfigInfoUrl:" + strB);
        ConfigRequest configRequest = new ConfigRequest(str);
        configRequest.sign = a3h.f(configRequest);
        a.a(new Request.Builder().url(strB).post(gqf.create(MediaType.parse("application/json; charset=utf-8"), new Gson().toJson(configRequest))).build()).g(new a());
    }
}
