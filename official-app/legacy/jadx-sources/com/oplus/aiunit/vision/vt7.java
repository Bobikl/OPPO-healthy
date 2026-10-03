package com.oplus.aiunit.vision;

import android.content.Context;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.oplus.drs.rom.sdk.comm.log.TrackLogger;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes19.dex */
public class vt7 {
    public final ConcurrentHashMap<String, String> a = new ConcurrentHashMap<>();
    public final Context b;

    public vt7(@NonNull Context context) {
        this.b = context.getApplicationContext();
    }

    public void a(@NonNull String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        try {
            opa.a(this.b, "drs_sdk_storage").remove("fc_date_" + str);
            this.a.remove(str);
            TrackLogger.h("FlowControlManager", "Flow control cleared for appId=%s", str);
        } catch (Throwable th) {
            TrackLogger.d("FlowControlManager", "clearFlowControl failed for appId=" + str, th, new Object[0]);
        }
    }

    @Nullable
    public String b(@NonNull String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        String str2 = this.a.get(str);
        if (str2 != null) {
            return str2;
        }
        try {
            return opa.a(this.b, "drs_sdk_storage").getString("fc_date_" + str, null);
        } catch (Throwable th) {
            TrackLogger.d("FlowControlManager", "getFlowControlDate failed for appId=" + str, th, new Object[0]);
            return null;
        }
    }

    public final String c() {
        return new SimpleDateFormat("yyyyMMdd", Locale.US).format(new Date());
    }

    public boolean d(@NonNull String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        String strC = c();
        String str2 = this.a.get(str);
        if (str2 != null) {
            if (str2.equals(strC)) {
                return true;
            }
            a(str);
            return false;
        }
        try {
            String string = opa.a(this.b, "drs_sdk_storage").getString("fc_date_" + str, null);
            if (TextUtils.isEmpty(string)) {
                return false;
            }
            if (string.equals(strC)) {
                this.a.put(str, string);
                TrackLogger.c("FlowControlManager", "appId=%s is under flow control until end of day=%s", str, strC);
                return true;
            }
            TrackLogger.h("FlowControlManager", "Flow control for appId=%s expired (triggered on %s, today is %s), clearing...", str, string, strC);
            a(str);
            return false;
        } catch (Throwable th) {
            TrackLogger.d("FlowControlManager", "isFlowControlActive failed for appId=" + str, th, new Object[0]);
            return false;
        }
    }

    public void e(@NonNull String str) {
        if (TextUtils.isEmpty(str)) {
            TrackLogger.o("FlowControlManager", "markFlowControlTriggered: appId is empty", new Object[0]);
            return;
        }
        String strC = c();
        try {
            opa.a(this.b, "drs_sdk_storage").putString("fc_date_" + str, strC);
            this.a.put(str, strC);
            TrackLogger.o("FlowControlManager", "Flow control triggered for appId=%s, date=%s. IPC will be blocked until next day.", str, strC);
        } catch (Throwable th) {
            TrackLogger.d("FlowControlManager", "markFlowControlTriggered failed for appId=" + str, th, new Object[0]);
        }
    }
}
