package com.oplus.accountsdk.service.account.trace;

import android.content.Context;
import android.text.TextUtils;
import androidx.annotation.Keep;
import com.oplus.accountsdk.base.account.trace.AcBaseTraceHelper;
import com.oplus.accountsdk.base.account.trace.bean.AcTraceBean;
import com.oplus.accountsdk.base.account.trace.bean.AcTraceConfigResponse;
import com.oplus.accountsdk.base.common.util.AcLogUtil;
import com.oplus.accountsdk.service.account.BuildConfig;
import com.oplus.aiunit.vision.bb;
import com.oplus.aiunit.vision.i8;
import com.oplus.aiunit.vision.k7;
import com.oplus.aiunit.vision.l7;
import com.oplus.aiunit.vision.l8;
import com.oplus.aiunit.vision.m8;
import com.oplus.aiunit.vision.ok;
import com.oplus.aiunit.vision.qk;
import com.oplus.aiunit.vision.xa;
import com.oplus.aiunit.vision.ye;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ConcurrentLinkedQueue;

/* JADX INFO: loaded from: classes19.dex */
@Keep
public class AcIdTraceManager extends AcBaseTraceHelper {
    private static final String FIRST_TRACE_TIME_KEY = "first_trace_time";
    private static final String HIGH_FREQUENCY_TRACE_FILE_NAME = "id_ac_trace_event_high_freq";
    private static final int MAX_FILE_DATE = 7;
    private static final long MAX_FILE_SIZE = 512000;
    private static final String RESOURCE_ID = "id_sdk";
    private static final String TAG = "AcIdTraceManager";
    private static final String TRACE_FILE_NAME = "id_ac_trace_event";
    private static volatile AcIdTraceManager sInstance;
    private String mAppVersionName;
    private String mBrand;
    private final ConcurrentLinkedQueue<a> mFbePendingTraces;
    private List<String> mHighFrequencyLogTags;
    private String mOsVersion;
    private String mRegion;
    private String mRomVersion;

    public static class a {
        public final String a;
        public final String b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Map<String, String> f9131c;

        public a(String str, String str2, Map<String, String> map) {
            this.a = str;
            this.f9131c = map;
            this.b = str2;
        }
    }

    private AcIdTraceManager(Context context) {
        super(context, new qk(context));
        this.mHighFrequencyLogTags = xa.a("[\"ac_sdk_getToken\", \"ac_sdk_getInfo\", \"ac_sdk_get_v1_token\"]", String.class);
        this.mFbePendingTraces = new ConcurrentLinkedQueue<>();
    }

    private boolean checkTraceFileSizeAndCountThenDeleteOldest() {
        if (ok.r(this.appContext) <= MAX_FILE_SIZE && ok.t(this.appContext) <= 7) {
            return false;
        }
        AcLogUtil.i(TAG, "trace file size over limit, delete oldest file");
        ok.o(this.appContext, MAX_FILE_SIZE, 7, HIGH_FREQUENCY_TRACE_FILE_NAME);
        return true;
    }

    private void flushFbePendingTraces() {
        if (this.mFbePendingTraces.isEmpty()) {
            return;
        }
        AcLogUtil.i(TAG, "flushFbePendingTraces, size: " + this.mFbePendingTraces.size());
        while (true) {
            a aVarPoll = this.mFbePendingTraces.poll();
            if (aVarPoll == null) {
                return;
            } else {
                report(aVarPoll.b, aVarPoll.a, true, aVarPoll.f9131c);
            }
        }
    }

    private String getAppVersionName() {
        if (TextUtils.isEmpty(this.mAppVersionName)) {
            Context context = this.appContext;
            this.mAppVersionName = k7.c(context, context.getPackageName());
        }
        return this.mAppVersionName;
    }

    private String getBrand() {
        if (TextUtils.isEmpty(this.mBrand)) {
            this.mBrand = l8.f();
        }
        return this.mBrand;
    }

    private static String getDateOffset(int i) {
        Calendar calendar = Calendar.getInstance();
        calendar.add(5, i);
        return new SimpleDateFormat("yyyyMMdd", Locale.getDefault()).format(calendar.getTime());
    }

    public static AcIdTraceManager getInstance(Context context) {
        if (sInstance == null) {
            synchronized (AcIdTraceManager.class) {
                if (sInstance == null) {
                    sInstance = new AcIdTraceManager(context);
                }
            }
        }
        return sInstance;
    }

    private String getOsVersion() {
        if (TextUtils.isEmpty(this.mOsVersion)) {
            this.mOsVersion = l8.c();
        }
        return this.mOsVersion;
    }

    private String getRegion() {
        if (TextUtils.isEmpty(this.mRegion)) {
            this.mRegion = m8.b();
        }
        return this.mRegion;
    }

    private String getRomVersion() {
        try {
            if (TextUtils.isEmpty(this.mRomVersion)) {
                this.mRomVersion = URLEncoder.encode(l8.r(), StandardCharsets.UTF_8.name());
            }
            return this.mRomVersion;
        } catch (Throwable th) {
            AcLogUtil.e(TAG, "getRomVersion error", th);
            return "";
        }
    }

    private boolean isHighFrequencyEvent(String str) {
        List<String> list = this.mHighFrequencyLogTags;
        if (list == null || list.isEmpty()) {
            return false;
        }
        return this.mHighFrequencyLogTags.contains(str);
    }

    public void cacheFbeTrace(String str, String str2, Map<String, String> map) {
        this.mFbePendingTraces.offer(new a(str, str2, map));
        AcLogUtil.i(TAG, "FBE mode: cached trace, queue size: " + this.mFbePendingTraces.size());
    }

    @Override // com.oplus.accountsdk.base.account.trace.AcBaseTraceHelper
    public void clearUploadedTraceEvent(List<AcTraceBean> list) {
        ok.k(this.appContext);
        bb.c(this.appContext, TRACE_FILE_NAME, FIRST_TRACE_TIME_KEY);
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
                            AcLogUtil.e(TAG, "getTraceEvent error", th);
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        osVersion = "";
                    }
                } catch (Throwable th3) {
                    th = th3;
                    region = "";
                    osVersion = region;
                    AcLogUtil.e(TAG, "getTraceEvent error", th);
                    for (AcTraceBean acTraceBean : list) {
                        acTraceBean.setResourceId(RESOURCE_ID);
                        acTraceBean.setBrand(brand);
                        acTraceBean.setDuid(ye.b(this.appContext).a());
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
                AcLogUtil.e(TAG, "getTraceEvent error", th);
                while (r9.hasNext()) {
                    acTraceBean.setResourceId(RESOURCE_ID);
                    acTraceBean.setBrand(brand);
                    acTraceBean.setDuid(ye.b(this.appContext).a());
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
            acTraceBean.setResourceId(RESOURCE_ID);
            acTraceBean.setBrand(brand);
            acTraceBean.setDuid(ye.b(this.appContext).a());
            acTraceBean.setAppPackage(this.appContext.getPackageName());
            acTraceBean.setAppVersion(appVersionName);
            acTraceBean.setRegion(region);
            acTraceBean.setOsVersion(osVersion);
            acTraceBean.setRomVersion(romVersion);
        }
    }

    @Override // com.oplus.accountsdk.base.account.trace.AcBaseTraceHelper
    public String getDuid() {
        return ye.b(this.appContext).a();
    }

    @Override // com.oplus.accountsdk.base.account.trace.AcBaseTraceHelper
    public List<AcTraceBean> getTraceEvent() {
        List<AcTraceBean> listE = ok.E(this.appContext);
        fillCommonFields(listE);
        return listE;
    }

    @Override // com.oplus.accountsdk.base.account.trace.AcBaseTraceHelper
    public boolean needUploadTrace(AcTraceConfigResponse acTraceConfigResponse) {
        if (ok.t(this.appContext) >= 2) {
            return true;
        }
        if (checkTraceFileSizeAndCountThenDeleteOldest()) {
            AcLogUtil.i(TAG, "needUploadTrace trace over size");
            return true;
        }
        if (ok.q(this.appContext) >= acTraceConfigResponse.reportBatchMaxSize) {
            return true;
        }
        String strE = bb.e(this.appContext, TRACE_FILE_NAME, FIRST_TRACE_TIME_KEY);
        if (TextUtils.isEmpty(strE)) {
            return false;
        }
        try {
            return System.currentTimeMillis() - Long.parseLong(strE) > acTraceConfigResponse.reportInterval;
        } catch (Throwable th) {
            AcLogUtil.e(TAG, "checkTraceFileSizeAndCount error", th);
            return false;
        }
    }

    @Override // com.oplus.accountsdk.base.account.trace.AcBaseTraceHelper
    public void report(String str, String str2, Map<String, String> map) {
        flushFbePendingTraces();
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
            AcLogUtil.i(TAG, "saveTraceEvents: event is null or empty");
            return;
        }
        if (TextUtils.isEmpty(bb.e(this.appContext, TRACE_FILE_NAME, FIRST_TRACE_TIME_KEY))) {
            bb.j(this.appContext, TRACE_FILE_NAME, FIRST_TRACE_TIME_KEY, System.currentTimeMillis() + "");
        }
        checkTraceFileSizeAndCountThenDeleteOldest();
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        AcLogUtil.i(TAG, "file size: " + ok.r(this.appContext));
        for (AcTraceBean acTraceBean : list) {
            if (isHighFrequencyEvent(acTraceBean.getLog_tag())) {
                arrayList.add(acTraceBean);
            } else {
                arrayList2.add(acTraceBean);
            }
        }
        if (!arrayList.isEmpty()) {
            ok.H(this.appContext, HIGH_FREQUENCY_TRACE_FILE_NAME + getDateOffset(0), arrayList);
        }
        if (arrayList2.isEmpty()) {
            return;
        }
        ok.H(this.appContext, TRACE_FILE_NAME + getDateOffset(0), arrayList2);
    }

    private void report(String str, String str2, boolean z, Map<String, String> map) {
        HashMap map2 = new HashMap(map);
        map2.put("ac_version", l7.b(this.appContext) + "");
        map2.put("ac_pkg", l7.a(this.appContext));
        map2.put(AcBaseTraceHelper.TRACE_ID, str2);
        map2.put("biz_id", str);
        map2.put("sdk_version", BuildConfig.VERSION_NAME);
        map2.put("time_stamp", System.currentTimeMillis() + "");
        super.report(map2, z);
    }
}
