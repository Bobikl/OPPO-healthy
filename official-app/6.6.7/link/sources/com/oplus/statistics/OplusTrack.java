package com.oplus.statistics;

import android.app.Application;
import android.content.Context;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.oplus.aiunit.vision.fsd;
import com.oplus.statistics.OplusTrack;
import com.oplus.statistics.agent.AtomAgent;
import com.oplus.statistics.agent.CommonAgent;
import com.oplus.statistics.agent.DebugAgent;
import com.oplus.statistics.agent.OnEventAgent;
import com.oplus.statistics.agent.PageVisitAgent;
import com.oplus.statistics.agent.StaticPeriodDataRecord;
import com.oplus.statistics.data.CommonBatchBean;
import com.oplus.statistics.data.CommonBean;
import com.oplus.statistics.data.PeriodDataBean;
import com.oplus.statistics.data.SettingKeyBean;
import com.oplus.statistics.data.SettingKeyDataBean;
import com.oplus.statistics.record.AppLifecycleCallbacks;
import com.oplus.statistics.storage.PreferenceHandler;
import com.oplus.statistics.strategy.ChattyEventTracker;
import com.oplus.statistics.strategy.RequestFireWall;
import com.oplus.statistics.strategy.WorkThread;
import com.oplus.statistics.util.ApkInfoUtil;
import com.oplus.statistics.util.LogUtil;
import com.oplus.statistics.util.Supplier;
import com.oplus.statistics.util.VersionUtil;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes8.dex */
public class OplusTrack {
    public static final int FLAG_SEND_TO_ATOM = 2;
    public static final int FLAG_SEND_TO_DCS = 1;
    public static final Pattern a = Pattern.compile("^[a-zA-Z0-9\\_\\-]{1,64}$");
    public static final PageVisitAgent b = new PageVisitAgent();
    public static final RequestFireWall c = new RequestFireWall.Builder(120, 120000).build();
    public static volatile StatisticsExceptionHandler d;

    public static boolean F(String str, String str2, int i) {
        if (str == null) {
            LogUtil.e("OplusTrack", new Supplier() { // from class: com.oplus.aiunit.vision.dsd
                @Override // com.oplus.statistics.util.Supplier
                public final Object get() {
                    return OplusTrack.G();
                }
            });
            return false;
        }
        if (!a.matcher(str).find()) {
            LogUtil.e("OplusTrack", new Supplier() { // from class: com.oplus.aiunit.vision.esd
                @Override // com.oplus.statistics.util.Supplier
                public final Object get() {
                    return OplusTrack.H();
                }
            });
            return false;
        }
        if (str2 == null) {
            LogUtil.e("OplusTrack", new Supplier() { // from class: com.oplus.aiunit.vision.gsd
                @Override // com.oplus.statistics.util.Supplier
                public final Object get() {
                    return OplusTrack.I();
                }
            });
            return false;
        }
        if (i <= 10000 && i >= 1) {
            return true;
        }
        LogUtil.e("OplusTrack", new Supplier() { // from class: com.oplus.aiunit.vision.hsd
            @Override // com.oplus.statistics.util.Supplier
            public final Object get() {
                return OplusTrack.J();
            }
        });
        return false;
    }

    public static /* synthetic */ String G() {
        return "EventID is null!";
    }

    public static /* synthetic */ String H() {
        return "EventID format error!";
    }

    public static /* synthetic */ String I() {
        return "EventTag format error!";
    }

    public static /* synthetic */ String J() {
        return "EventCount format error!";
    }

    public static /* synthetic */ String K() {
        return "AppCode is empty.";
    }

    public static /* synthetic */ String L(CommonBean commonBean, int i) {
        return "onCommon logTag is " + commonBean.getLogTag() + ",eventID:" + commonBean.getEventID() + ",flagSendTo:" + i;
    }

    public static /* synthetic */ void M(CommonBean commonBean) {
        CommonAgent.recordCommon(commonBean.getContext(), commonBean);
    }

    public static /* synthetic */ void N(CommonBean commonBean) {
        AtomAgent.recordAtomCommon(commonBean.getContext(), commonBean);
    }

    public static /* synthetic */ String O(Context context, boolean z) {
        return "packageName:" + context.getPackageName() + ",isDebug:" + z;
    }

    public static /* synthetic */ String P(int i, int i2) {
        return "onDynamicEvent uploadMode:" + i + ",statId:" + i2;
    }

    public static /* synthetic */ String Q() {
        return "onError...";
    }

    public static /* synthetic */ String R(String str, String str2) {
        return "onEventEnd eventID:" + str + ",eventTag:" + str2;
    }

    public static /* synthetic */ String S(String str) {
        return "onEventEnd eventID:" + str;
    }

    public static /* synthetic */ String T(String str) {
        return "onEventStart eventID:" + str;
    }

    public static /* synthetic */ String U(String str, String str2) {
        return "onEventStart eventID:" + str + ",eventTag:" + str2;
    }

    public static /* synthetic */ String V(String str, String str2) {
        return "onKVEventEnd eventID:" + str + ",eventTag:" + str2;
    }

    public static /* synthetic */ String W(String str) {
        return "onKVEventEnd eventID:" + str;
    }

    public static /* synthetic */ String X(String str, String str2, Map map) {
        return "onKVEventStart eventID:" + str + ",eventTag:" + str2 + ",eventMap:" + map;
    }

    public static /* synthetic */ String Y(String str) {
        return "onKVEventStart eventID:" + str;
    }

    public static /* synthetic */ String Z() {
        return "onPause...";
    }

    public static /* synthetic */ String a0() {
        return "onResume...";
    }

    public static /* synthetic */ String b0(SettingKeyDataBean settingKeyDataBean) {
        return "onSettingKeyUpdate logTag:" + settingKeyDataBean.getLogTag() + ", eventID:" + settingKeyDataBean.getEventID() + ", keys:" + settingKeyDataBean.getLogMap();
    }

    public static /* synthetic */ String c0() {
        return "Send data failed! logTag is null.";
    }

    public static /* synthetic */ String d0(int i) {
        return "onSpecialAppStart appCode:" + i;
    }

    public static /* synthetic */ String e0(PeriodDataBean periodDataBean) {
        return "onStaticDataUpdate logTag:" + periodDataBean.getLogTag() + ", eventID:" + periodDataBean.getEventID();
    }

    public static /* synthetic */ String g0(int i, int i2, String str, String str2, String str3) {
        return "onStaticEvent uploadMode:" + i + ",statId:" + i2 + ",setId:" + str + ",setValue:" + str2 + ",remark:" + str3;
    }

    public static /* synthetic */ String h0() {
        return "removeSsoID";
    }

    public static /* synthetic */ String i0(boolean z) {
        return "onDebug (no context) sdk and dcs isDebug:" + z;
    }

    public static void init(@NonNull Context context) {
        init(context, null);
    }

    public static boolean isSupportStaticData(Context context) {
        return VersionUtil.isSupportPeriodData(context);
    }

    public static /* synthetic */ String j0(int i) {
        return "setSession timeout is " + i;
    }

    public static /* synthetic */ String k0(String str) {
        return "setSsoid ssoid is " + str;
    }

    public static boolean onCommon(@NonNull Context context, String str, String str2, Map<String, String> map) {
        CommonBean commonBean = new CommonBean(context);
        commonBean.setLogTag(str);
        commonBean.setEventID(str2);
        commonBean.setLogMap(map);
        return onCommon(commonBean, 1);
    }

    public static boolean onCommonBatch(@NonNull Context context, String str, String str2, List<Map<String, String>> list, int i) throws DataOverSizeException {
        return onCommonBatch(context, "", str, str2, list, i);
    }

    public static void onDebug(final Context context, final boolean z) {
        try {
            LogUtil.setDebug(z);
            LogUtil.d("OplusTrack", new Supplier() { // from class: com.oplus.aiunit.vision.msd
                @Override // com.oplus.statistics.util.Supplier
                public final Object get() {
                    return OplusTrack.O(context, z);
                }
            });
            if (LogUtil.isDebug()) {
                WorkThread.execute(new Runnable() { // from class: com.oplus.statistics.OplusTrack.12
                    @Override // java.lang.Runnable
                    public void run() {
                        DebugAgent.setDebug(context, z);
                    }
                });
            }
        } catch (Exception e) {
            LogUtil.e("OplusTrack", new fsd(e));
        }
    }

    @Deprecated
    public static void onDynamicEvent(final Context context, final int i, final int i2, final Map<String, String> map, final Map<String, String> map2) {
        try {
            LogUtil.d("OplusTrack", new Supplier() { // from class: com.oplus.aiunit.vision.trd
                @Override // com.oplus.statistics.util.Supplier
                public final Object get() {
                    return OplusTrack.P(i, i2);
                }
            });
            WorkThread.execute(new Runnable() { // from class: com.oplus.statistics.OplusTrack.6
                @Override // java.lang.Runnable
                public void run() {
                    OnEventAgent.onDynamicEvent(context, i, i2, map, map2);
                }
            });
        } catch (Exception e) {
            LogUtil.e("OplusTrack", new fsd(e));
        }
    }

    public static synchronized void onError(Context context) {
        try {
            LogUtil.d("OplusTrack", new Supplier() { // from class: com.oplus.aiunit.vision.srd
                @Override // com.oplus.statistics.util.Supplier
                public final Object get() {
                    return OplusTrack.Q();
                }
            });
            if (d == null) {
                d = new StatisticsExceptionHandler(context);
                d.setStatisticsExceptionHandler();
            }
        } catch (Exception e) {
            LogUtil.e("OplusTrack", new fsd(e));
        }
    }

    @Deprecated
    public static void onEventEnd(final Context context, final String str, final String str2) {
        try {
            LogUtil.d("OplusTrack", new Supplier() { // from class: com.oplus.aiunit.vision.isd
                @Override // com.oplus.statistics.util.Supplier
                public final Object get() {
                    return OplusTrack.R(str, str2);
                }
            });
            if (F(str, str2, 1)) {
                WorkThread.execute(new Runnable() { // from class: com.oplus.statistics.OplusTrack.4
                    @Override // java.lang.Runnable
                    public void run() {
                        OnEventAgent.onEventEnd(context, str, str2);
                    }
                });
            }
        } catch (Exception e) {
            LogUtil.e("OplusTrack", new fsd(e));
        }
    }

    @Deprecated
    public static void onEventStart(final Context context, final String str, final String str2) {
        try {
            LogUtil.d("OplusTrack", new Supplier() { // from class: com.oplus.aiunit.vision.csd
                @Override // com.oplus.statistics.util.Supplier
                public final Object get() {
                    return OplusTrack.U(str, str2);
                }
            });
            if (F(str, str2, 1)) {
                WorkThread.execute(new Runnable() { // from class: com.oplus.statistics.OplusTrack.2
                    @Override // java.lang.Runnable
                    public void run() {
                        OnEventAgent.onEventStart(context, str, str2);
                    }
                });
            }
        } catch (Exception e) {
            LogUtil.e("OplusTrack", new fsd(e));
        }
    }

    public static void onKVEventEnd(final Context context, final String str, final String str2) {
        try {
            LogUtil.d("OplusTrack", new Supplier() { // from class: com.oplus.aiunit.vision.osd
                @Override // com.oplus.statistics.util.Supplier
                public final Object get() {
                    return OplusTrack.V(str, str2);
                }
            });
            if (F(str, str2, 1)) {
                WorkThread.execute(new Runnable() { // from class: com.oplus.statistics.OplusTrack.9
                    @Override // java.lang.Runnable
                    public void run() {
                        OnEventAgent.onKVEventEnd(context, str, str2);
                    }
                });
            }
        } catch (Exception e) {
            LogUtil.e("OplusTrack", new fsd(e));
        }
    }

    public static void onKVEventStart(final Context context, final String str, final Map<String, String> map, final String str2) {
        try {
            LogUtil.d("OplusTrack", new Supplier() { // from class: com.oplus.aiunit.vision.vrd
                @Override // com.oplus.statistics.util.Supplier
                public final Object get() {
                    return OplusTrack.X(str, str2, map);
                }
            });
            if (F(str, str2, 1)) {
                WorkThread.execute(new Runnable() { // from class: com.oplus.statistics.OplusTrack.8
                    @Override // java.lang.Runnable
                    public void run() {
                        OnEventAgent.onKVEventStart(context, str, map, str2);
                    }
                });
            }
        } catch (Exception e) {
            LogUtil.e("OplusTrack", new fsd(e));
        }
    }

    public static void onPause(Context context) {
        try {
            LogUtil.d("OplusTrack", new Supplier() { // from class: com.oplus.aiunit.vision.rrd
                @Override // com.oplus.statistics.util.Supplier
                public final Object get() {
                    return OplusTrack.Z();
                }
            });
            b.onPause(context);
        } catch (Exception e) {
            LogUtil.e("OplusTrack", new fsd(e));
        }
    }

    public static void onResume(Context context) {
        try {
            LogUtil.d("OplusTrack", new Supplier() { // from class: com.oplus.aiunit.vision.ksd
                @Override // com.oplus.statistics.util.Supplier
                public final Object get() {
                    return OplusTrack.a0();
                }
            });
            b.onResume(context);
        } catch (Exception e) {
            LogUtil.e("OplusTrack", new fsd(e));
        }
    }

    public static void onSettingKeyUpdate(Context context, String str, String str2, List<SettingKeyBean> list) {
        SettingKeyDataBean settingKeyDataBean = new SettingKeyDataBean(context);
        settingKeyDataBean.setLogTag(str);
        settingKeyDataBean.setEventID(str2);
        settingKeyDataBean.setLogMap(list);
        onSettingKeyUpdate(context, settingKeyDataBean);
    }

    @Deprecated
    public static boolean onSpecialAppStart(Context context, final int i) {
        LogUtil.d("OplusTrack", new Supplier() { // from class: com.oplus.aiunit.vision.bsd
            @Override // com.oplus.statistics.util.Supplier
            public final Object get() {
                return OplusTrack.d0(i);
            }
        });
        return onCommon(context, "ClientStart", "ClientStart", null);
    }

    public static void onStaticDataUpdate(Context context, String str, String str2, Map<String, String> map) {
        PeriodDataBean periodDataBean = new PeriodDataBean(context);
        periodDataBean.setLogTag(str);
        periodDataBean.setEventID(str2);
        periodDataBean.setLogMap(map);
        onStaticDataUpdate(context, periodDataBean);
    }

    @Deprecated
    public static void onStaticEvent(final Context context, final int i, final int i2, final String str, final String str2, final String str3, final Map<String, String> map) {
        try {
            LogUtil.d("OplusTrack", new Supplier() { // from class: com.oplus.aiunit.vision.nsd
                @Override // com.oplus.statistics.util.Supplier
                public final Object get() {
                    return OplusTrack.g0(i, i2, str, str2, str3);
                }
            });
            WorkThread.execute(new Runnable() { // from class: com.oplus.statistics.OplusTrack.7
                @Override // java.lang.Runnable
                public void run() {
                    OnEventAgent.onStaticEvent(context, i, i2, str, str2, str3, map);
                }
            });
        } catch (Exception e) {
            LogUtil.e("OplusTrack", new fsd(e));
        }
    }

    public static void removeSsoID(Context context) {
        try {
            LogUtil.d("OplusTrack", new Supplier() { // from class: com.oplus.aiunit.vision.xrd
                @Override // com.oplus.statistics.util.Supplier
                public final Object get() {
                    return OplusTrack.h0();
                }
            });
            PreferenceHandler.setSsoID(context);
        } catch (Exception e) {
            LogUtil.e("OplusTrack", new fsd(e));
        }
    }

    public static void setDebug(final boolean z) {
        try {
            LogUtil.setDebug(z);
            LogUtil.d("OplusTrack", new Supplier() { // from class: com.oplus.aiunit.vision.lsd
                @Override // com.oplus.statistics.util.Supplier
                public final Object get() {
                    return OplusTrack.i0(z);
                }
            });
        } catch (Exception e) {
            LogUtil.e("OplusTrack", new fsd(e));
        }
    }

    public static void setSessionTimeOut(Context context, final int i) {
        LogUtil.d("OplusTrack", new Supplier() { // from class: com.oplus.aiunit.vision.krd
            @Override // com.oplus.statistics.util.Supplier
            public final Object get() {
                return OplusTrack.j0(i);
            }
        });
        if (i > 0) {
            try {
                PreferenceHandler.setSessionTimeout(context, i);
            } catch (Exception e) {
                LogUtil.e("OplusTrack", new fsd(e));
            }
        }
    }

    public static void setSsoID(Context context, final String str) {
        LogUtil.d("OplusTrack", new Supplier() { // from class: com.oplus.aiunit.vision.lrd
            @Override // com.oplus.statistics.util.Supplier
            public final Object get() {
                return OplusTrack.k0(str);
            }
        });
        if (TextUtils.isEmpty(str) || str.equals("null")) {
            str = "0";
        }
        try {
            PreferenceHandler.setSsoID(context, str);
        } catch (Exception e) {
            LogUtil.e("OplusTrack", new fsd(e));
        }
    }

    public static void init(@NonNull Context context, @Nullable OTrackConfig oTrackConfig) {
        init(context, ApkInfoUtil.getAppCode(context), oTrackConfig);
    }

    public static boolean onCommonBatch(@NonNull Context context, String str, String str2, String str3, List<Map<String, String>> list, int i) throws DataOverSizeException {
        CommonBatchBean commonBatchBean = new CommonBatchBean(context);
        commonBatchBean.setAppId(str);
        commonBatchBean.setLogTag(str2);
        commonBatchBean.setEventID(str3);
        commonBatchBean.setLogMap(list);
        return onCommon(commonBatchBean, i);
    }

    public static void init(@NonNull Context context, String str, @Nullable OTrackConfig oTrackConfig) {
        Context applicationContext = context.getApplicationContext();
        if (applicationContext != null) {
            AppLifecycleCallbacks.getInstance().init((Application) applicationContext);
        }
        if (TextUtils.isEmpty(str)) {
            LogUtil.w("OplusTrack", new Supplier() { // from class: com.oplus.aiunit.vision.qrd
                @Override // com.oplus.statistics.util.Supplier
                public final Object get() {
                    return OplusTrack.K();
                }
            });
        }
        ApkInfoUtil.putAppCodeToCache(context, str);
        OTrackContext.createIfNeed(str, context, oTrackConfig);
        if (oTrackConfig != null) {
            LogUtil.setDebug(oTrackConfig.getEnv() == 1);
        }
    }

    public static boolean onCommon(@NonNull Context context, String str, String str2, Map<String, String> map, int i) {
        CommonBean commonBean = new CommonBean(context);
        commonBean.setLogTag(str);
        commonBean.setEventID(str2);
        commonBean.setLogMap(map);
        return onCommon(commonBean, i);
    }

    @Deprecated
    public static void onEventEnd(final Context context, final String str) {
        try {
            LogUtil.d("OplusTrack", new Supplier() { // from class: com.oplus.aiunit.vision.prd
                @Override // com.oplus.statistics.util.Supplier
                public final Object get() {
                    return OplusTrack.S(str);
                }
            });
            if (F(str, "", 1)) {
                WorkThread.execute(new Runnable() { // from class: com.oplus.statistics.OplusTrack.5
                    @Override // java.lang.Runnable
                    public void run() {
                        OnEventAgent.onEventEnd(context, str, "");
                    }
                });
            }
        } catch (Exception e) {
            LogUtil.e("OplusTrack", new fsd(e));
        }
    }

    @Deprecated
    public static void onEventStart(final Context context, final String str) {
        try {
            LogUtil.d("OplusTrack", new Supplier() { // from class: com.oplus.aiunit.vision.wrd
                @Override // com.oplus.statistics.util.Supplier
                public final Object get() {
                    return OplusTrack.T(str);
                }
            });
            if (F(str, "", 1)) {
                WorkThread.execute(new Runnable() { // from class: com.oplus.statistics.OplusTrack.3
                    @Override // java.lang.Runnable
                    public void run() {
                        OnEventAgent.onEventStart(context, str, "");
                    }
                });
            }
        } catch (Exception e) {
            LogUtil.e("OplusTrack", new fsd(e));
        }
    }

    public static void onKVEventEnd(final Context context, final String str) {
        try {
            LogUtil.d("OplusTrack", new Supplier() { // from class: com.oplus.aiunit.vision.ord
                @Override // com.oplus.statistics.util.Supplier
                public final Object get() {
                    return OplusTrack.W(str);
                }
            });
            if (F(str, "", 1)) {
                WorkThread.execute(new Runnable() { // from class: com.oplus.statistics.OplusTrack.11
                    @Override // java.lang.Runnable
                    public void run() {
                        OnEventAgent.onKVEventEnd(context, str, "");
                    }
                });
            }
        } catch (Exception e) {
            LogUtil.e("OplusTrack", new fsd(e));
        }
    }

    public static void onKVEventStart(final Context context, final String str, final Map<String, String> map) {
        try {
            LogUtil.d("OplusTrack", new Supplier() { // from class: com.oplus.aiunit.vision.jsd
                @Override // com.oplus.statistics.util.Supplier
                public final Object get() {
                    return OplusTrack.Y(str);
                }
            });
            if (F(str, "", 1)) {
                WorkThread.execute(new Runnable() { // from class: com.oplus.statistics.OplusTrack.10
                    @Override // java.lang.Runnable
                    public void run() {
                        OnEventAgent.onKVEventStart(context, str, map, "");
                    }
                });
            }
        } catch (Exception e) {
            LogUtil.e("OplusTrack", new fsd(e));
        }
    }

    public static void onSettingKeyUpdate(final Context context, final SettingKeyDataBean settingKeyDataBean) {
        try {
            LogUtil.d("OplusTrack", new Supplier() { // from class: com.oplus.aiunit.vision.jrd
                @Override // com.oplus.statistics.util.Supplier
                public final Object get() {
                    return OplusTrack.b0(settingKeyDataBean);
                }
            });
            if (!TextUtils.isEmpty(settingKeyDataBean.getLogTag())) {
                WorkThread.execute(new Runnable() { // from class: com.oplus.statistics.OplusTrack.1
                    @Override // java.lang.Runnable
                    public void run() {
                        StaticPeriodDataRecord.updateSettingKeyList(context, settingKeyDataBean);
                    }
                });
            } else {
                LogUtil.e("OplusTrack", new Supplier() { // from class: com.oplus.aiunit.vision.urd
                    @Override // com.oplus.statistics.util.Supplier
                    public final Object get() {
                        return OplusTrack.c0();
                    }
                });
            }
        } catch (Exception e) {
            LogUtil.e("OplusTrack", new fsd(e));
        }
    }

    public static void onStaticDataUpdate(final Context context, final PeriodDataBean periodDataBean) {
        try {
            LogUtil.d("OplusTrack", new Supplier() { // from class: com.oplus.aiunit.vision.mrd
                @Override // com.oplus.statistics.util.Supplier
                public final Object get() {
                    return OplusTrack.e0(periodDataBean);
                }
            });
            WorkThread.execute(new Runnable() { // from class: com.oplus.aiunit.vision.nrd
                @Override // java.lang.Runnable
                public final void run() {
                    StaticPeriodDataRecord.updateData(context, periodDataBean);
                }
            });
        } catch (Exception e) {
            LogUtil.e("OplusTrack", new fsd(e));
        }
    }

    public static boolean onCommon(@NonNull Context context, String str, String str2, Map<String, String> map, int i, int i2) {
        CommonBean commonBean = new CommonBean(context);
        commonBean.setLogTag(str);
        commonBean.setEventID(str2);
        commonBean.setLogMap(map);
        commonBean.setAppId(i);
        return onCommon(commonBean, i2);
    }

    public static boolean onCommon(@NonNull Context context, String str, String str2, String str3, Map<String, String> map) {
        CommonBean commonBean = new CommonBean(context);
        commonBean.setAppId(str);
        commonBean.setLogTag(str2);
        commonBean.setEventID(str3);
        commonBean.setLogMap(map);
        return onCommon(commonBean, 1);
    }

    public static boolean onCommon(CommonBean commonBean) {
        return onCommon(commonBean, 1);
    }

    public static boolean onCommon(final CommonBean commonBean, final int i) {
        if (!c.handleRequest(commonBean.getAppId() + "_" + commonBean.getLogTag() + "_" + commonBean.getEventID())) {
            ChattyEventTracker.getInstance().onChattyEvent(commonBean);
            return false;
        }
        try {
            LogUtil.v("OplusTrack", new Supplier() { // from class: com.oplus.aiunit.vision.yrd
                @Override // com.oplus.statistics.util.Supplier
                public final Object get() {
                    return OplusTrack.L(commonBean, i);
                }
            });
            if ((i & 1) == 1) {
                WorkThread.execute(new Runnable() { // from class: com.oplus.aiunit.vision.zrd
                    @Override // java.lang.Runnable
                    public final void run() {
                        OplusTrack.M(commonBean);
                    }
                });
            }
            if ((i & 2) == 2) {
                WorkThread.execute(new Runnable() { // from class: com.oplus.aiunit.vision.asd
                    @Override // java.lang.Runnable
                    public final void run() {
                        OplusTrack.N(commonBean);
                    }
                });
            }
            return true;
        } catch (Exception e) {
            LogUtil.e("OplusTrack", new fsd(e));
            return false;
        }
    }
}
