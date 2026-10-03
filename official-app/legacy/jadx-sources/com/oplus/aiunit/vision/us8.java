package com.oplus.aiunit.vision;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.Message;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.heytap.health.base.findPhone.api.FindPhoneService;

/* JADX INFO: loaded from: classes17.dex */
public class us8 {
    public static final String TAG = "HealthPushHelper";
    public final Handler a = new a();

    public class a extends Handler {
        public a() {
        }

        @Override // android.os.Handler
        public void handleMessage(@NonNull Message message) {
            super.handleMessage(message);
            if (gxe.j(b78.a())) {
                System.exit(0);
            }
        }
    }

    @SuppressLint({"HandlerLeak"})
    public us8() {
    }

    public final void a(long j2) {
        this.a.removeMessages(1);
        this.a.sendEmptyMessageDelayed(1, j2);
    }

    public final void b(Context context, String str) {
        a7b.f(TAG, "LoggerHelper msg");
        z7b.e(context, str);
    }

    public void c(Context context, com.heytap.msp.push.mode.b bVar) {
        StringBuilder sb = new StringBuilder();
        sb.append("processMessage() ");
        sb.append(bVar.toString());
        int iG = bVar.g();
        a7b.f(TAG, "processMessage() Type = " + iG);
        if (iG == 4103) {
            bVar.d();
            if (bVar.d().contains("log")) {
                b(context, bVar.b());
                return;
            }
            if (bVar.d().contains(ds0.DESC_BADGE)) {
                a7b.f(TAG, "BadgeParser msg");
                new ds0().a(bVar);
                a(60000L);
                return;
            }
            if (bVar.d().equals("watchPush")) {
                String strB = bVar.b();
                if (!TextUtils.isEmpty(strB)) {
                    com.heytap.health.watch.notification.b.INSTANCE.i(strB, false);
                }
                a(60000L);
                return;
            }
            if (bVar.d().equals("safeGuard")) {
                tj6.c(bVar.b());
                a(60000L);
            } else {
                if (bVar.d().equals("findPhone")) {
                    ((FindPhoneService) x0.d().h(FindPhoneService.class)).B7(bVar.k());
                    return;
                }
                Intent intent = new Intent("action_broadcast_spt_push_msg");
                intent.putExtra("content", bVar.b());
                intent.setPackage(context.getPackageName());
                context.sendBroadcast(intent);
                a(60000L);
            }
        }
    }
}
