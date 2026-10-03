package com.oplus.statistics.agent;

import android.content.ContentValues;
import android.content.Context;
import android.net.Uri;
import com.oplus.aiunit.vision.d14;
import com.oplus.statistics.agent.AtomAgent;
import com.oplus.statistics.data.CommonBean;
import com.oplus.statistics.data.TrackEvent;
import com.oplus.statistics.util.ApkInfoUtil;
import com.oplus.statistics.util.LogUtil;
import com.oplus.statistics.util.Supplier;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes8.dex */
public class AtomAgent {
    public static final Uri a = Uri.parse("content://com.oplus.atom.db_sys/atom_delegate");

    public static void b(final Context context, final TrackEvent trackEvent) {
        if (trackEvent == null || context == null) {
            LogUtil.d("AtomAgent", new Supplier() { // from class: com.oplus.aiunit.vision.zj0
                @Override // com.oplus.statistics.util.Supplier
                public final Object get() {
                    return AtomAgent.c(trackEvent, context);
                }
            });
            return;
        }
        CommonBean commonBean = (CommonBean) trackEvent;
        ContentValues contentValues = new ContentValues();
        contentValues.put("appId", Integer.valueOf(commonBean.getAppID()));
        contentValues.put("appPackage", ApkInfoUtil.getPackageName(context));
        contentValues.put("logTag", commonBean.getLogTag());
        contentValues.put("eventID", commonBean.getEventID());
        contentValues.put("logMap", commonBean.getLogMap());
        try {
            context.getContentResolver().insert(a, contentValues);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static /* synthetic */ String c(TrackEvent trackEvent, Context context) {
        return "AtomAgent add Task error -- bean or context is null--" + trackEvent + d14.COMMA_REGEX + context;
    }

    public static void recordAtomCommon(Context context, CommonBean commonBean) {
        b(context, commonBean);
    }
}
