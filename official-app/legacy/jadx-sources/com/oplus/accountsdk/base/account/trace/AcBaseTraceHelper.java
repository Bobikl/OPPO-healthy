package com.oplus.accountsdk.base.account.trace;

import android.content.Context;
import android.text.TextUtils;
import androidx.annotation.Keep;
import androidx.annotation.WorkerThread;
import com.oplus.accountsdk.base.account.trace.bean.AcTraceBean;
import com.oplus.accountsdk.base.account.trace.bean.AcTraceConfigResponse;
import com.oplus.accountsdk.base.account.trace.bean.AcTraceUploadBean;
import com.oplus.accountsdk.base.common.util.AcLogUtil;
import com.oplus.aiunit.vision.m7;
import com.oplus.aiunit.vision.tl9;
import com.oplus.aiunit.vision.xa;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes6.dex */
public abstract class AcBaseTraceHelper {
    private static final int CORE_POOL_SIZE = 1;
    private static final int DIRECT_WRITE_THRESHOLD = 5;
    private static final String EVENT_ID_KEY = "event_id";
    private static final int INITIAL_AGGREGATION_THRESHOLD = 10;
    private static final int KEEP_ALIVE_TIME = 1;
    private static final String LOG_TAG_KEY = "log_tag";
    private static final int MAX_AGGREGATION_THRESHOLD = 50;
    private static final int MAX_POOL_SIZE = 1;
    private static final String TAG = "AcBaseTraceHelper";
    private static final double THRESHOLD_EXPANSION_FACTOR = 1.5d;
    public static final String TRACE_ID = "traceid";
    public static final String VAL_FAIL = "fail";
    public static final String VAL_SUCCESS = "success";
    protected Context appContext;
    private tl9 mTraceRepo;
    private boolean mTraceEnable = true;
    List<AcTraceBean> mTraceEventsWrite = new ArrayList();
    private final Map<String, List<AcTraceBean>> mAcTraceBeans = new LinkedHashMap<String, List<AcTraceBean>>() { // from class: com.oplus.accountsdk.base.account.trace.AcBaseTraceHelper.1
        private static final int MAX_TRACE_SIZE = 300;

        @Override // java.util.LinkedHashMap
        public boolean removeEldestEntry(Map.Entry<String, List<AcTraceBean>> entry) {
            return size() > 300;
        }
    };
    private long mFailTimeStamp = 0;
    private final Map<String, Long> mLogTagCountMap = new HashMap();
    private final List<AcTraceBean> mSharedCachedBeans = new ArrayList();
    private int mSharedAggregationThreshold = 10;
    private ThreadPoolExecutor mThreadPoolExecutor = new ThreadPoolExecutor(1, 1, 1, TimeUnit.SECONDS, new LinkedBlockingDeque(300), new ThreadPoolExecutor.DiscardPolicy());

    public class a implements Runnable {
        public final /* synthetic */ Map i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final /* synthetic */ boolean f9108j;

        public a(Map map, boolean z) {
            this.i = map;
            this.f9108j = z;
        }

        @Override // java.lang.Runnable
        public void run() {
            AcBaseTraceHelper.this.reportInternal(this.i, this.f9108j);
        }
    }

    public AcBaseTraceHelper(Context context, tl9 tl9Var) {
        this.appContext = context.getApplicationContext();
        this.mTraceRepo = tl9Var;
    }

    private void addToCache(String str, Map<String, String> map) {
        AcTraceBean traceCommonBean = getTraceCommonBean(str, map);
        String str2 = map.get(TRACE_ID);
        if (TextUtils.isEmpty(str2)) {
            return;
        }
        List<AcTraceBean> arrayList = this.mAcTraceBeans.get(str2);
        if (arrayList == null) {
            arrayList = new ArrayList<>();
        }
        arrayList.add(traceCommonBean);
        this.mAcTraceBeans.put(str2, arrayList);
    }

    public static String createTraceId(String str) {
        StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
        return str + "_" + (stackTrace.length >= 4 ? stackTrace[3].getMethodName() : "") + "_" + System.currentTimeMillis() + "_" + m7.b().substring(0, 8);
    }

    private void dealEvent(AcTraceConfigResponse acTraceConfigResponse, boolean z, Map<String, String> map) {
        if (acTraceConfigResponse == null || !acTraceConfigResponse.validParam()) {
            AcLogUtil.e(TAG, "trace config error");
            return;
        }
        String str = map.get(TRACE_ID);
        String strRemove = map.remove(LOG_TAG_KEY);
        if (TextUtils.isEmpty(strRemove) || acTraceConfigResponse.eventConfig.get(strRemove) == null || !Boolean.FALSE.equals(acTraceConfigResponse.eventConfig.get(strRemove))) {
            addToCache(strRemove, map);
        } else {
            AcLogUtil.e(TAG, "lost log_tag : " + xa.d(map) + " or log_tag : " + strRemove + " is not allowed");
        }
        if (z) {
            saveEvent(str);
        }
        if (needUploadTrace(acTraceConfigResponse)) {
            if (this.mFailTimeStamp == 0 || System.currentTimeMillis() - this.mFailTimeStamp > acTraceConfigResponse.reportInterval) {
                uploadEvents(acTraceConfigResponse);
            }
        }
    }

    private AcTraceBean getTraceCommonBean(String str, Map<String, String> map) {
        AcTraceBean acTraceBean = new AcTraceBean();
        try {
            acTraceBean.setLogTag(str);
            acTraceBean.setEventId(map.remove("event_id"));
            acTraceBean.setLogMap(map);
            acTraceBean.setDayno(new SimpleDateFormat("yyyyMMdd", Locale.getDefault()).format(new Date()));
            acTraceBean.setClientTime(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.getDefault()).format(new Date()));
        } catch (Throwable th) {
            AcLogUtil.e(TAG, "getTraceBean error ", th);
        }
        return acTraceBean;
    }

    private void processTraceBean(AcTraceBean acTraceBean) {
        String log_tag = acTraceBean.getLog_tag();
        Long l2 = this.mLogTagCountMap.get(log_tag);
        if (l2 == null) {
            l2 = 0L;
        }
        Long lValueOf = Long.valueOf(l2.longValue() + 1);
        this.mLogTagCountMap.put(log_tag, lValueOf);
        if (lValueOf.longValue() <= 5) {
            AcLogUtil.d(TAG, "log_tag: " + log_tag + " totalCount: " + lValueOf + " <= 5, write directly");
            this.mTraceEventsWrite.add(acTraceBean);
            return;
        }
        this.mSharedCachedBeans.add(acTraceBean);
        if (this.mSharedCachedBeans.size() >= this.mSharedAggregationThreshold) {
            this.mTraceEventsWrite.addAll(this.mSharedCachedBeans);
            this.mSharedCachedBeans.clear();
            this.mSharedAggregationThreshold = Math.min((int) (((double) this.mSharedAggregationThreshold) * THRESHOLD_EXPANSION_FACTOR), 50);
            AcLogUtil.d(TAG, "shared aggregation threshold expanded to: " + this.mSharedAggregationThreshold);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @WorkerThread
    public void reportInternal(Map<String, String> map, boolean z) {
        if (!this.mTraceEnable) {
            AcLogUtil.e(TAG, "sTraceEnable = false, not upload");
            return;
        }
        if (map == null || map.isEmpty()) {
            AcLogUtil.e(TAG, "Report event with empty params");
            return;
        }
        if (TextUtils.isEmpty(map.get(TRACE_ID))) {
            AcLogUtil.e(TAG, "traceId is empty, return");
            return;
        }
        try {
            dealEvent(this.mTraceRepo.a(this.appContext, getDuid()).getData(), z, map);
        } catch (Exception e2) {
            AcLogUtil.e(TAG, "trace event error", e2);
        }
    }

    private void saveEvent(String str) {
        List<AcTraceBean> listRemove = this.mAcTraceBeans.remove(str);
        if (listRemove == null || listRemove.isEmpty()) {
            return;
        }
        Iterator<AcTraceBean> it = listRemove.iterator();
        while (it.hasNext()) {
            processTraceBean(it.next());
        }
        if (this.mTraceEventsWrite.isEmpty()) {
            return;
        }
        saveTraceEvents(this.mTraceEventsWrite);
        this.mTraceEventsWrite.clear();
    }

    private void uploadEvents(AcTraceConfigResponse acTraceConfigResponse) {
        List<AcTraceBean> traceEvent = getTraceEvent();
        if (traceEvent.isEmpty()) {
            AcLogUtil.d(TAG, "no events to upload");
            return;
        }
        try {
            if (this.mTraceRepo.b(acTraceConfigResponse, new AcTraceUploadBean(traceEvent)).isSuccess()) {
                clearUploadedTraceEvent(traceEvent);
                AcLogUtil.i(TAG, "upload success, size: " + traceEvent.size());
            } else {
                this.mFailTimeStamp = System.currentTimeMillis();
            }
        } catch (Throwable th) {
            AcLogUtil.e(TAG, "trace upload fail: ", th);
        }
    }

    public abstract void clearUploadedTraceEvent(List<AcTraceBean> list);

    public abstract String getDuid();

    public abstract List<AcTraceBean> getTraceEvent();

    public abstract boolean needUploadTrace(AcTraceConfigResponse acTraceConfigResponse);

    public abstract void report(String str, String str2, Map<String, String> map);

    public void report(Map<String, String> map, boolean z) {
        this.mThreadPoolExecutor.execute(new a(map, z));
    }

    public abstract void reportEnd(String str, String str2, Map<String, String> map);

    public abstract void saveTraceEvents(List<AcTraceBean> list);

    @Keep
    public void setTraceEnable(boolean z) {
        this.mTraceEnable = z;
        AcLogUtil.i(TAG, "trace enable switch: " + z);
    }
}
