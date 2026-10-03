package com.oplus.aiunit.vision;

import android.text.TextUtils;
import com.google.gson.Gson;
import com.oplus.account.netrequest.annotation.AcIgnoreIntercept;
import java.io.IOException;
import java.lang.reflect.Type;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import okhttp3.Request;
import okio.Buffer;
import okio.BufferedSource;

/* JADX INFO: loaded from: classes6.dex */
public abstract class r7 implements jea {
    public static final String DEBUG_NEED_DISABLE_ENVELOPE = "DisableEnvelope";
    protected static final String TAG_BASE = "AcIntercept.";
    private Gson gson = new Gson();

    public boolean isDebugSkipInterceptor(Request request) {
        String strA = request.getHeaders().a("DisableEnvelope");
        if (TextUtils.isEmpty(strA)) {
            return false;
        }
        return Boolean.valueOf(strA).booleanValue();
    }

    public boolean isIgnoreIntercept(Request request) {
        Class<? extends jea>[] clsArrValue;
        AcIgnoreIntercept acIgnoreIntercept = (AcIgnoreIntercept) ma.a(request, AcIgnoreIntercept.class);
        if (acIgnoreIntercept == null || (clsArrValue = acIgnoreIntercept.value()) == null || clsArrValue.length == 0) {
            return false;
        }
        return Arrays.asList(clsArrValue).contains(getClass());
    }

    public h8 preParseResponse(ytf ytfVar, Type type) {
        if (ytfVar == null || ytfVar.getBody() == null) {
            return null;
        }
        try {
            BufferedSource f10248j = ytfVar.getBody().getSource();
            f10248j.request(Long.MAX_VALUE);
            Buffer buffer = f10248j.getBufferField();
            return (h8) this.gson.fromJson(buffer.clone().readString(StandardCharsets.UTF_8), type);
        } catch (IOException e2) {
            throw new RuntimeException(e2);
        }
    }
}
