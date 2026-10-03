package com.oplus.web.container.comunication.jsapi;

import androidx.annotation.Keep;
import com.oplus.aiunit.vision.ss9;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes8.dex */
@Keep
public class JsApiRegister {
    private static final Map<String, Class<? extends ss9>> EXECUTOR_MAP = new HashMap();
    private String TAG;

    public static class b {
        public static final JsApiRegister a = new JsApiRegister();
    }

    public static JsApiRegister getInstance() {
        return b.a;
    }

    public Class<? extends ss9> getJsApiExecutor(String str) {
        return EXECUTOR_MAP.get(str);
    }

    @Keep
    public void registerJsApiExecutor(String str, Class<? extends ss9> cls) {
        EXECUTOR_MAP.put(str, cls);
    }

    private JsApiRegister() {
        this.TAG = "JsApiRegister";
    }
}
