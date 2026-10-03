package com.heytap.store.base.core.util;

import com.heytap.store.platform.tools.ContextGetterUtils;
import com.heytap.store.platform.tools.LogUtils;
import com.oplus.instant.router.Instant;
import com.oplus.instant.router.callback.Callback;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public class QuickAppProxy {
    private static final String TAG = "QuickAppProxy";
    private static QuickAppProxy instance = null;
    private static final String origin = "6827";
    private static final String secret = "40de1023dc07c2b98a83212a8314a01c";
    private Callback mCallback = new Callback() { // from class: com.heytap.store.base.core.util.QuickAppProxy.1
        @Override // com.oplus.instant.router.callback.Callback
        public void onResponse(Callback.Response response) {
            if (response == null) {
                LogUtils.INSTANCE.i(QuickAppProxy.TAG, "null of response");
                return;
            }
            LogUtils.INSTANCE.i(QuickAppProxy.TAG, "response:" + response.toString());
            response.getCode();
        }
    };

    private QuickAppProxy() {
    }

    public static QuickAppProxy getInstance() {
        if (instance == null) {
            synchronized (QuickAppProxy.class) {
                if (instance == null) {
                    instance = new QuickAppProxy();
                }
            }
        }
        return instance;
    }

    public String buildFrom(String str, String str2) {
        return Instant.createFromBuilder().setScene(str).setTraceId(str2).build();
    }

    public String getInstantVersion() {
        try {
            ContextGetterUtils contextGetterUtils = ContextGetterUtils.INSTANCE;
            String version = Instant.getVersion(contextGetterUtils.getApp());
            return "-1".equals(version) ? version : URLDecoder.decode(Instant.getVersion(contextGetterUtils.getApp()), "UTF-8").split("/")[1];
        } catch (UnsupportedEncodingException e2) {
            e2.printStackTrace();
            return "";
        }
    }

    public void initInstant() {
        Instant.setStatisticsProvider(new Instant.IStatisticsProvider() { // from class: com.heytap.store.base.core.util.QuickAppProxy.2
            @Override // com.oplus.instant.router.Instant.IStatisticsProvider
            public void onStat(Map map) {
                LogUtils.INSTANCE.d(QuickAppProxy.TAG, "onStat: " + map.toString());
            }
        });
    }

    public boolean isInstantPlatformInstalled() {
        return Instant.isInstantPlatformInstalled(ContextGetterUtils.INSTANCE.getApp());
    }

    public void start(String str) {
        if (isInstantPlatformInstalled()) {
            Instant.createBuilder(origin, secret).setRequestUrl(str).setCallback(this.mCallback).build().request(ContextGetterUtils.INSTANCE.getApp());
        }
    }
}
