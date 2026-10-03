package com.oplus.statistics.agent;

import android.content.Context;
import android.text.TextUtils;
import com.oplus.aiunit.vision.fsd;
import com.oplus.statistics.agent.PageVisitAgent;
import com.oplus.statistics.data.PageVisitBean;
import com.oplus.statistics.record.ProxyRecorder;
import com.oplus.statistics.storage.PreferenceHandler;
import com.oplus.statistics.strategy.WorkThread;
import com.oplus.statistics.util.LogUtil;
import com.oplus.statistics.util.Supplier;
import com.oplus.statistics.util.TimeInfoUtil;
import org.json.JSONArray;
import org.json.JSONException;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes8.dex */
public class PageVisitAgent {

    public static final class HandlePageVisitRunnable implements Runnable {
        public Context i;
        public String j;
        public long k;
        public int l;

        public HandlePageVisitRunnable(Context context, String str, long j, int i) {
            this.i = context;
            this.j = str;
            this.k = j;
            this.l = i;
        }

        @Override // java.lang.Runnable
        public void run() {
            int i = this.l;
            if (i == 0) {
                PageVisitAgent.n(this.i, this.j, this.k);
            } else {
                if (i != 1) {
                    return;
                }
                PageVisitAgent.m(this.i, this.j, this.k);
            }
        }
    }

    public static String g(Context context) {
        return context != null ? context.getClass().getSimpleName() : "";
    }

    public static /* synthetic */ String h(String str) {
        return "onPause: " + str;
    }

    public static /* synthetic */ String i() {
        return "onPause() called without context.";
    }

    public static /* synthetic */ String j(String str) {
        return "onResume: " + str;
    }

    public static /* synthetic */ String k() {
        return "onPause() called without context.";
    }

    public static void l(Context context) {
        String pageVisitRoutes = PreferenceHandler.getPageVisitRoutes(context);
        int pageVisitDuration = PreferenceHandler.getPageVisitDuration(context);
        if (!TextUtils.isEmpty(pageVisitRoutes)) {
            PageVisitBean pageVisitBean = new PageVisitBean(context);
            pageVisitBean.setActivities(pageVisitRoutes);
            pageVisitBean.setDuration(pageVisitDuration);
            pageVisitBean.setTime(TimeInfoUtil.getFormatTime());
            ProxyRecorder.getInstance().addTrackEvent(context, pageVisitBean);
        }
        PreferenceHandler.setPageVisitDuration(context, 0);
        PreferenceHandler.setPageVisitRoutes(context, "");
    }

    public static void m(Context context, String str, long j) {
        JSONArray jSONArray;
        long activityStartTime = PreferenceHandler.getActivityStartTime(context);
        int i = (int) ((j - activityStartTime) / 1000);
        if (str.equals(PreferenceHandler.getCurrentActivity(context)) && i >= 0 && -1 != activityStartTime) {
            try {
                String pageVisitRoutes = PreferenceHandler.getPageVisitRoutes(context);
                int pageVisitDuration = PreferenceHandler.getPageVisitDuration(context);
                if (TextUtils.isEmpty(pageVisitRoutes)) {
                    jSONArray = new JSONArray();
                } else {
                    jSONArray = new JSONArray(pageVisitRoutes);
                    if (jSONArray.length() >= 10) {
                        l(context);
                        jSONArray = new JSONArray();
                    }
                }
                JSONArray jSONArray2 = new JSONArray();
                jSONArray2.put(str);
                jSONArray2.put(i);
                jSONArray.put(jSONArray2);
                PreferenceHandler.setPageVisitDuration(context, pageVisitDuration + i);
                PreferenceHandler.setPageVisitRoutes(context, jSONArray.toString());
            } catch (JSONException e) {
                LogUtil.e("PageVisitAgent", new Supplier() { // from class: com.oplus.aiunit.vision.e6e
                    @Override // com.oplus.statistics.util.Supplier
                    public final Object get() {
                        return e.toString();
                    }
                });
            } catch (Exception e2) {
                LogUtil.e("PageVisitAgent", new fsd(e2));
                PreferenceHandler.setPageVisitRoutes(context, "");
                PreferenceHandler.setPageVisitDuration(context, 0);
            }
        }
        PreferenceHandler.setActivityEndTime(context, j);
    }

    public static void n(Context context, String str, long j) {
        long activityEndTime = PreferenceHandler.getActivityEndTime(context);
        long activityStartTime = PreferenceHandler.getActivityStartTime(context);
        long sessionTimeout = ((long) PreferenceHandler.getSessionTimeout(context)) * 1000;
        if (j - activityStartTime >= sessionTimeout && (-1 == activityEndTime || activityEndTime >= j || j - activityEndTime >= sessionTimeout)) {
            AppStartAgent.recordAppStart(context);
            l(context);
        }
        PreferenceHandler.setActivityStartTime(context, j);
        PreferenceHandler.setCurrentActivity(context, str);
    }

    public void onPause(Context context) {
        if (context == null) {
            LogUtil.e("PageVisitAgent", new Supplier() { // from class: com.oplus.aiunit.vision.g6e
                @Override // com.oplus.statistics.util.Supplier
                public final Object get() {
                    return PageVisitAgent.i();
                }
            });
            return;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        final String strG = g(context);
        LogUtil.i("PageVisitAgent", new Supplier() { // from class: com.oplus.aiunit.vision.f6e
            @Override // com.oplus.statistics.util.Supplier
            public final Object get() {
                return PageVisitAgent.h(strG);
            }
        });
        WorkThread.execute(new HandlePageVisitRunnable(context, strG, jCurrentTimeMillis, 1));
    }

    public void onResume(Context context) {
        if (context == null) {
            LogUtil.e("PageVisitAgent", new Supplier() { // from class: com.oplus.aiunit.vision.i6e
                @Override // com.oplus.statistics.util.Supplier
                public final Object get() {
                    return PageVisitAgent.k();
                }
            });
            return;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        final String strG = g(context);
        LogUtil.i("PageVisitAgent", new Supplier() { // from class: com.oplus.aiunit.vision.h6e
            @Override // com.oplus.statistics.util.Supplier
            public final Object get() {
                return PageVisitAgent.j(strG);
            }
        });
        WorkThread.execute(new HandlePageVisitRunnable(context, strG, jCurrentTimeMillis, 0));
    }
}
