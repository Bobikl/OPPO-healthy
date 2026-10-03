package com.oplus.aiunit.vision;

import android.content.Context;
import android.text.TextUtils;
import com.oplus.accountsdk.base.account.trace.AcBaseTraceHelper;
import com.oplus.accountsdk.base.account.trace.bean.AcTraceBean;
import com.oplus.accountsdk.base.account.trace.bean.AcTraceConfigResponse;
import com.oplus.accountsdk.base.common.util.AcLogUtil;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public class ah extends AcBaseTraceHelper {
    public static volatile ah g;
    public final List<String> a;
    public String b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f9357c;
    public String d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f9358e;
    public String f;

    public ah(Context context) {
        super(context, new dh(context));
        this.a = xa.a("[\"ac_sdk_getToken\", \"ac_sdk_getInfo\", \"ac_sdk_get_v1_token\"]", String.class);
    }

    public static ah b(Context context) {
        if (g == null) {
            synchronized (ah.class) {
                if (g == null) {
                    g = new ah(context);
                }
            }
        }
        return g;
    }

    public static String getDateOffset(int i) {
        Calendar calendar = Calendar.getInstance();
        calendar.add(5, i);
        return new SimpleDateFormat("yyyyMMdd", Locale.getDefault()).format(calendar.getTime());
    }

    public final boolean checkTraceFileSizeAndCountThenDeleteOldest() {
        if (zg.r(this.appContext) <= 512000 && zg.t(this.appContext) <= 7) {
            return false;
        }
        AcLogUtil.i("AcOpenTraceManager", "trace file size over limit, delete oldest file");
        zg.o(this.appContext, 512000L, 7, "open_ac_trace_event_high_freq");
        return true;
    }

    @Override // com.oplus.accountsdk.base.account.trace.AcBaseTraceHelper
    public void clearUploadedTraceEvent(List<AcTraceBean> list) {
        zg.k(this.appContext);
        bb.c(this.appContext, "open_ac_trace_event", "first_trace_time");
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0038 A[LOOP:0: B:23:0x0032->B:25:0x0038, LOOP_END] */
    public void fillCommonFields(List<AcTraceBean> list) {
        String brand;
        String appVersionName;
        String region;
        String osVersion;
        String romVersion = "";
        try {
            brand = getBrand();
            try {
                appVersionName = getAppVersionName();
                try {
                    region = getRegion();
                    try {
                        osVersion = getOsVersion();
                        try {
                            romVersion = getRomVersion();
                        } catch (Throwable th) {
                            th = th;
                            AcLogUtil.e("AcOpenTraceManager", "getTraceEvent error", th);
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        osVersion = "";
                    }
                } catch (Throwable th3) {
                    th = th3;
                    region = "";
                    osVersion = region;
                    AcLogUtil.e("AcOpenTraceManager", "getTraceEvent error", th);
                    for (AcTraceBean acTraceBean : list) {
                        acTraceBean.setResourceId("open_sdk");
                        acTraceBean.setBrand(brand);
                        acTraceBean.setDuid(getDuid());
                        acTraceBean.setAppPackage(this.appContext.getPackageName());
                        acTraceBean.setAppVersion(appVersionName);
                        acTraceBean.setRegion(region);
                        acTraceBean.setOsVersion(osVersion);
                        acTraceBean.setRomVersion(romVersion);
                    }
                }
            } catch (Throwable th4) {
                th = th4;
                appVersionName = "";
                region = appVersionName;
                osVersion = region;
                AcLogUtil.e("AcOpenTraceManager", "getTraceEvent error", th);
                while (r9.hasNext()) {
                    acTraceBean.setResourceId("open_sdk");
                    acTraceBean.setBrand(brand);
                    acTraceBean.setDuid(getDuid());
                    acTraceBean.setAppPackage(this.appContext.getPackageName());
                    acTraceBean.setAppVersion(appVersionName);
                    acTraceBean.setRegion(region);
                    acTraceBean.setOsVersion(osVersion);
                    acTraceBean.setRomVersion(romVersion);
                }
            }
        } catch (Throwable th5) {
            th = th5;
            brand = "";
            appVersionName = brand;
        }
        while (r9.hasNext()) {
            acTraceBean.setResourceId("open_sdk");
            acTraceBean.setBrand(brand);
            acTraceBean.setDuid(getDuid());
            acTraceBean.setAppPackage(this.appContext.getPackageName());
            acTraceBean.setAppVersion(appVersionName);
            acTraceBean.setRegion(region);
            acTraceBean.setOsVersion(osVersion);
            acTraceBean.setRomVersion(romVersion);
        }
    }

    public final String getAppVersionName() {
        if (TextUtils.isEmpty(this.f9357c)) {
            Context context = this.appContext;
            this.f9357c = k7.c(context, context.getPackageName());
        }
        return this.f9357c;
    }

    public final String getBrand() {
        if (TextUtils.isEmpty(this.b)) {
            this.b = l8.f();
        }
        return this.b;
    }

    @Override // com.oplus.accountsdk.base.account.trace.AcBaseTraceHelper
    public String getDuid() {
        return ec.g(this.appContext);
    }

    public final String getOsVersion() {
        if (TextUtils.isEmpty(this.f9358e)) {
            this.f9358e = l8.c();
        }
        return this.f9358e;
    }

    public final String getRegion() {
        if (TextUtils.isEmpty(this.d)) {
            this.d = m8.b();
        }
        return this.d;
    }

    public final String getRomVersion() {
        try {
            if (TextUtils.isEmpty(this.f)) {
                this.f = URLEncoder.encode(l8.r(), StandardCharsets.UTF_8.name());
            }
            return this.f;
        } catch (Throwable th) {
            AcLogUtil.e("AcOpenTraceManager", "getRomVersion error", th);
            return "";
        }
    }

    @Override // com.oplus.accountsdk.base.account.trace.AcBaseTraceHelper
    public List<AcTraceBean> getTraceEvent() {
        List<AcTraceBean> listE = zg.E(this.appContext);
        fillCommonFields(listE);
        return listE;
    }

    public final boolean isHighFrequencyEvent(String str) {
        List<String> list = this.a;
        if (list == null || list.isEmpty()) {
            return false;
        }
        return this.a.contains(str);
    }

    @Override // com.oplus.accountsdk.base.account.trace.AcBaseTraceHelper
    public boolean needUploadTrace(AcTraceConfigResponse acTraceConfigResponse) {
        if (zg.t(this.appContext) >= 2) {
            return true;
        }
        if (checkTraceFileSizeAndCountThenDeleteOldest()) {
            AcLogUtil.i("AcOpenTraceManager", "needUploadTrace trace over size");
            return true;
        }
        if (zg.q(this.appContext) >= acTraceConfigResponse.reportBatchMaxSize) {
            return true;
        }
        String strE = bb.e(this.appContext, "open_ac_trace_event", "first_trace_time");
        if (TextUtils.isEmpty(strE)) {
            return false;
        }
        try {
            return System.currentTimeMillis() - Long.parseLong(strE) > acTraceConfigResponse.reportInterval;
        } catch (Throwable th) {
            AcLogUtil.e("AcOpenTraceManager", "checkTraceFileSizeAndCount error", th);
            return false;
        }
    }

    @Override // com.oplus.accountsdk.base.account.trace.AcBaseTraceHelper
    public void report(String str, String str2, Map<String, String> map) {
        report(str, str2, false, map);
        while (true) {
            Map<String, String> mapPoll = i8.sHostChangeEvent.poll();
            if (mapPoll == null) {
                return;
            } else {
                report(str, AcBaseTraceHelper.createTraceId("host_replace"), true, mapPoll);
            }
        }
    }

    @Override // com.oplus.accountsdk.base.account.trace.AcBaseTraceHelper
    public void reportEnd(String str, String str2, Map<String, String> map) {
        report(str, str2, true, map);
    }

    @Override // com.oplus.accountsdk.base.account.trace.AcBaseTraceHelper
    public void saveTraceEvents(List<AcTraceBean> list) {
        if (list == null || list.isEmpty()) {
            AcLogUtil.i("AcOpenTraceManager", "saveTraceEvents: event is null or empty");
            return;
        }
        if (TextUtils.isEmpty(bb.e(this.appContext, "open_ac_trace_event", "first_trace_time"))) {
            bb.j(this.appContext, "open_ac_trace_event", "first_trace_time", System.currentTimeMillis() + "");
        }
        checkTraceFileSizeAndCountThenDeleteOldest();
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        AcLogUtil.i("AcOpenTraceManager", "file size: " + zg.r(this.appContext));
        for (AcTraceBean acTraceBean : list) {
            if (isHighFrequencyEvent(acTraceBean.getLog_tag())) {
                arrayList.add(acTraceBean);
            } else {
                arrayList2.add(acTraceBean);
            }
        }
        if (!arrayList.isEmpty()) {
            zg.H(this.appContext, "open_ac_trace_event_high_freq" + getDateOffset(0), arrayList);
        }
        if (arrayList2.isEmpty()) {
            return;
        }
        zg.H(this.appContext, "open_ac_trace_event" + getDateOffset(0), arrayList2);
    }

    public final void report(String str, String str2, boolean z, Map<String, String> map) {
        HashMap map2 = new HashMap(map);
        map2.put(AcBaseTraceHelper.TRACE_ID, str2);
        map2.put("biz_id", str);
        map2.put("sdk_version", "3.0.6");
        map2.put("time_stamp", System.currentTimeMillis() + "");
        super.report(map2, z);
    }
}
