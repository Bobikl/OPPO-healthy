package org.hapjs.features.channel;

import android.content.Context;
import android.text.TextUtils;
import com.oplus.aiunit.vision.abm;
import com.oplus.aiunit.vision.klm;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.hapjs.features.channel.appinfo.HapApplication;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes11.dex */
public class HapChannelManager {
    public Map<String, ChannelHandler> a = new ConcurrentHashMap();
    public volatile boolean b;

    public interface ChannelHandler {
        boolean accept(HapApplication hapApplication);

        void onClose(IHapChannel iHapChannel, int i, String str);

        void onError(IHapChannel iHapChannel, int i, String str);

        void onOpen(IHapChannel iHapChannel);

        void onReceiveMessage(IHapChannel iHapChannel, ChannelMessage channelMessage);
    }

    public static abstract class DefaultChannelHandler implements ChannelHandler {
        private String mPkgName;
        private String[] mSignatureList;

        public DefaultChannelHandler(String str, String... strArr) {
            this.mPkgName = str;
            this.mSignatureList = strArr;
        }

        @Override // org.hapjs.features.channel.HapChannelManager.ChannelHandler
        public boolean accept(HapApplication hapApplication) {
            if (hapApplication == null || !TextUtils.equals(this.mPkgName, hapApplication.mPkgName)) {
                return false;
            }
            String[] strArr = this.mSignatureList;
            if (strArr == null || strArr.length == 0) {
                return true;
            }
            for (String str : strArr) {
                if (TextUtils.equals(hapApplication.mSignature, str)) {
                    return true;
                }
            }
            return false;
        }
    }

    public static class a {
        public static HapChannelManager a = new HapChannelManager();
    }

    public static HapChannelManager get() {
        return a.a;
    }

    public void addPlatform(String str, String str2) {
        klm.a.put(str, str2);
    }

    public ChannelHandler getChannelHandler(String str) {
        return this.a.get(str);
    }

    public synchronized void initialize(Context context) {
        if (!this.b) {
            klm.a.putAll(abm.a);
            HashMap map = new HashMap();
            if (!context.isDeviceProtectedStorage()) {
                context = context.createDeviceProtectedStorageContext();
            }
            String string = context.getSharedPreferences("hap_platforms", 0).getString("platform_config", "");
            if (!TextUtils.isEmpty(string)) {
                if (TextUtils.isEmpty(string)) {
                    map = null;
                } else {
                    map = new HashMap();
                    try {
                        JSONObject jSONObject = new JSONObject(string);
                        Iterator<String> itKeys = jSONObject.keys();
                        while (itKeys.hasNext()) {
                            String next = itKeys.next();
                            map.put(next, jSONObject.optString(next));
                        }
                    } catch (JSONException unused) {
                    }
                }
            }
            if (map != null && !map.isEmpty()) {
                klm.a.putAll(map);
            }
            this.b = true;
        }
    }

    public boolean isInitialized() {
        return this.b;
    }

    public void setChannelHandler(String str, ChannelHandler channelHandler) {
        this.a.put(str, channelHandler);
    }

    public void setDefaultChannelHandler(ChannelHandler channelHandler) {
        this.a.put("default", channelHandler);
    }
}
