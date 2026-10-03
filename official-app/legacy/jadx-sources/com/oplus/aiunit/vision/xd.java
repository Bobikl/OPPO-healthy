package com.oplus.aiunit.vision;

import android.content.Context;
import android.text.TextUtils;
import com.oplus.accountsdk.base.account.trace.AcBaseTraceHelper;
import com.oplus.accountsdk.base.account.trace.bean.AcTraceBean;
import com.oplus.accountsdk.base.account.trace.bean.AcTraceConfigResponse;
import com.oplus.accountsdk.base.common.util.AcLogUtil;
import com.oplus.accountsdk.open.core.config.AcOpenCoreConfig;
import com.oplus.accountsdk.open.core.storage.AcOpenStorageHelper;
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
public class xd extends AcBaseTraceHelper {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static volatile xd f18584e;
    public final List<String> a;
    public String b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f18585c;
    public String d;

    public xd(Context context) {
        super(context, new zd(context));
        this.a = xa.a("[\"ac_sdk_getToken\", \"ac_sdk_getInfo\", \"ac_sdk_get_v1_token\"]", String.class);
    }

    public static xd b(Context context) {
        if (f18584e == null) {
            synchronized (xd.class) {
                if (f18584e == null) {
                    f18584e = new xd(context);
                }
            }
        }
        return f18584e;
    }

    public static String getDateOffset(int i) {
        Calendar calendar = Calendar.getInstance();
        calendar.add(5, i);
        return new SimpleDateFormat("yyyyMMdd", Locale.getDefault()).format(calendar.getTime());
    }

    public final boolean checkTraceFileSizeAndCountThenDeleteOldest() {
        if (vd.r(this.appContext) <= 512000 && vd.t(this.appContext) <= 7) {
            return false;
        }
        AcLogUtil.i("AcOpenCoreTraceManager", "trace file size over limit, delete oldest file");
        vd.o(this.appContext, 512000L, 7, "core_ac_trace_event_high_freq");
        return true;
    }

    @Override // com.oplus.accountsdk.base.account.trace.AcBaseTraceHelper
    public void clearUploadedTraceEvent(List<AcTraceBean> list) {
        vd.k(this.appContext);
        db.c(this.appContext, "core_ac_trace_event", "first_trace_time");
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0042 A[LOOP:0: B:22:0x003c->B:24:0x0042, LOOP_END] */
    public void fillCommonFields(List<AcTraceBean> list) {
        String country;
        String brand;
        String appVersionName;
        String osVersion;
        String romVersion = "";
        try {
            AcOpenCoreConfig acOpenCoreConfigA = uc.c().a();
            brand = acOpenCoreConfigA.getBrand();
            try {
                appVersionName = getAppVersionName();
                try {
                    country = acOpenCoreConfigA.getCountry();
                    try {
                        osVersion = getOsVersion();
                        try {
                            romVersion = getRomVersion();
                        } catch (Throwable th) {
                            th = th;
                            AcLogUtil.e("AcOpenCoreTraceManager", "getTraceEvent error", th);
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        osVersion = "";
                    }
                } catch (Throwable th3) {
                    th = th3;
                    country = "";
                    osVersion = country;
                }
            } catch (Throwable th4) {
                th = th4;
                country = "";
                appVersionName = country;
                osVersion = appVersionName;
                AcLogUtil.e("AcOpenCoreTraceManager", "getTraceEvent error", th);
                for (AcTraceBean acTraceBean : list) {
                    acTraceBean.setResourceId("open_core");
                    acTraceBean.setBrand(brand);
                    acTraceBean.setDuid(getDuid());
                    acTraceBean.setAppPackage(this.appContext.getPackageName());
                    acTraceBean.setAppVersion(appVersionName);
                    acTraceBean.setRegion(country);
                    acTraceBean.setOsVersion(osVersion);
                    acTraceBean.setRomVersion(romVersion);
                }
            }
        } catch (Throwable th5) {
            th = th5;
            country = "";
            brand = country;
            appVersionName = brand;
        }
        while (r9.hasNext()) {
            acTraceBean.setResourceId("open_core");
            acTraceBean.setBrand(brand);
            acTraceBean.setDuid(getDuid());
            acTraceBean.setAppPackage(this.appContext.getPackageName());
            acTraceBean.setAppVersion(appVersionName);
            acTraceBean.setRegion(country);
            acTraceBean.setOsVersion(osVersion);
            acTraceBean.setRomVersion(romVersion);
        }
    }

    public final String getAppVersionName() {
        if (TextUtils.isEmpty(this.b)) {
            Context context = this.appContext;
            this.b = k7.c(context, context.getPackageName());
        }
        return this.b;
    }

    @Override // com.oplus.accountsdk.base.account.trace.AcBaseTraceHelper
    public String getDuid() {
        return AcOpenStorageHelper.getInstance(this.appContext).getOpenId(this.appContext.getPackageName());
    }

    public final String getOsVersion() {
        if (TextUtils.isEmpty(this.f18585c)) {
            this.f18585c = l8.c();
        }
        return this.f18585c;
    }

    public final String getRomVersion() {
        try {
            if (TextUtils.isEmpty(this.d)) {
                this.d = URLEncoder.encode(l8.r(), StandardCharsets.UTF_8.name());
            }
            return this.d;
        } catch (Throwable th) {
            AcLogUtil.e("AcOpenCoreTraceManager", "getRomVersion error", th);
            return "";
        }
    }

    @Override // com.oplus.accountsdk.base.account.trace.AcBaseTraceHelper
    public List<AcTraceBean> getTraceEvent() {
        List<AcTraceBean> listE = vd.E(this.appContext);
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
        if (vd.t(this.appContext) >= 2) {
            return true;
        }
        if (checkTraceFileSizeAndCountThenDeleteOldest()) {
            AcLogUtil.i("AcOpenCoreTraceManager", "needUploadTrace trace over size");
            return true;
        }
        if (vd.q(this.appContext) >= acTraceConfigResponse.reportBatchMaxSize) {
            return true;
        }
        String strE = db.e(this.appContext, "core_ac_trace_event", "first_trace_time");
        if (TextUtils.isEmpty(strE)) {
            return false;
        }
        try {
            return System.currentTimeMillis() - Long.parseLong(strE) > acTraceConfigResponse.reportInterval;
        } catch (Throwable th) {
            AcLogUtil.e("AcOpenCoreTraceManager", "checkTraceFileSizeAndCount error", th);
            return false;
        }
    }

    @Override // com.oplus.accountsdk.base.account.trace.AcBaseTraceHelper
    public void report(String str, String str2, Map<String, String> map) {
        report(str, str2, false, map);
    }

    @Override // com.oplus.accountsdk.base.account.trace.AcBaseTraceHelper
    public void reportEnd(String str, String str2, Map<String, String> map) {
        report(str, str2, true, map);
    }

    @Override // com.oplus.accountsdk.base.account.trace.AcBaseTraceHelper
    public void saveTraceEvents(List<AcTraceBean> list) {
        if (list == null || list.isEmpty()) {
            AcLogUtil.i("AcOpenCoreTraceManager", "saveTraceEvents: event is null or empty");
            return;
        }
        if (TextUtils.isEmpty(db.e(this.appContext, "core_ac_trace_event", "first_trace_time"))) {
            db.j(this.appContext, "core_ac_trace_event", "first_trace_time", System.currentTimeMillis() + "");
        }
        checkTraceFileSizeAndCountThenDeleteOldest();
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        AcLogUtil.i("AcOpenCoreTraceManager", "file size: " + vd.r(this.appContext));
        for (AcTraceBean acTraceBean : list) {
            if (isHighFrequencyEvent(acTraceBean.getLog_tag())) {
                arrayList.add(acTraceBean);
            } else {
                arrayList2.add(acTraceBean);
            }
        }
        if (!arrayList.isEmpty()) {
            vd.H(this.appContext, "core_ac_trace_event_high_freq" + getDateOffset(0), arrayList);
        }
        if (arrayList2.isEmpty()) {
            return;
        }
        vd.H(this.appContext, "core_ac_trace_event" + getDateOffset(0), arrayList2);
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
