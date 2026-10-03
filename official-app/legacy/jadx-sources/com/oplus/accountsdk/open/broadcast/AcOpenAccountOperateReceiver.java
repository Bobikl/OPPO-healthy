package com.oplus.accountsdk.open.broadcast;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.oplus.accountsdk.base.account.ILogoutCallback;
import com.oplus.accountsdk.base.common.util.AcLogUtil;
import com.oplus.aiunit.vision.ec;
import com.oplus.aiunit.vision.jf;
import com.oplus.aiunit.vision.lg;
import com.oplus.aiunit.vision.ls9;
import com.oplus.aiunit.vision.vc;
import com.oplus.aiunit.vision.zj;
import com.sensorsdata.analytics.android.sdk.aop.push.PushAutoTrackHelper;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes6.dex */
public class AcOpenAccountOperateReceiver extends BroadcastReceiver {
    public static final String a = "AcOpenAccountOperateReceiver";
    public static ArrayList<ILogoutCallback> logoutCallbacks = new ArrayList<>();
    public static ArrayList<ls9> loginCallbacks = new ArrayList<>();

    public class a implements Runnable {
        public final /* synthetic */ ls9 i;

        public a(ls9 ls9Var) {
            this.i = ls9Var;
        }

        @Override // java.lang.Runnable
        public void run() {
            AcLogUtil.i(AcOpenAccountOperateReceiver.a, "login callback invoke start " + this.i, AcLogUtil.enableDebug());
            this.i.onLogin();
            AcLogUtil.i(AcOpenAccountOperateReceiver.a, "login callback invoke end " + this.i, AcLogUtil.enableDebug());
        }
    }

    public final void b(Context context, String str) {
        AcLogUtil.i(a, "receive logout callBack size=" + logoutCallbacks.size() + "_traceId =" + str, true);
        Iterator<ILogoutCallback> it = logoutCallbacks.iterator();
        while (it.hasNext()) {
            it.next().onLogout();
        }
        jf.B().b(context);
        lg.e().a(context).a(context);
        ec.b(context);
    }

    public final void c() {
        int size = loginCallbacks.size();
        AcLogUtil.i(a, "login callback to biz. size: " + size);
        Iterator<ls9> it = loginCallbacks.iterator();
        while (it.hasNext()) {
            zj.a().g(new a(it.next()));
        }
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        PushAutoTrackHelper.onBroadcastReceiver(this, context, intent);
        if (intent != null) {
            String action = intent.getAction();
            AcLogUtil.i(a, "RECEIVER PKG =" + context.getPackageName() + ",action =" + action, true);
            if (vc.b().equals(action)) {
                b(context, intent.getStringExtra("traceId"));
            } else if (vc.a().equals(action)) {
                c();
            }
        }
    }
}
