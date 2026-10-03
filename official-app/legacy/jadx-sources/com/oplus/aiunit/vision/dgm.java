package com.oplus.aiunit.vision;

import android.app.NotificationManager;
import android.content.Context;
import com.heytap.msp.push.callback.IDataMessageCallBackService;
import com.heytap.sports.service.BgConnect;
import java.util.ArrayList;
import java.util.HashMap;

/* JADX INFO: loaded from: classes19.dex */
public class dgm implements ilm {

    public class a implements Runnable {
        public final /* synthetic */ com.heytap.msp.push.mode.b i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final /* synthetic */ Context f10568j;
        public final /* synthetic */ IDataMessageCallBackService k;

        public a(com.heytap.msp.push.mode.b bVar, Context context, IDataMessageCallBackService iDataMessageCallBackService) {
            this.i = bVar;
            this.f10568j = context;
            this.k = iDataMessageCallBackService;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.i.h() == 1) {
                dgm.this.b(this.f10568j, this.i);
            } else {
                this.k.processMessage(this.f10568j, this.i);
            }
        }
    }

    @Override // com.oplus.aiunit.vision.ilm
    public void a(Context context, com.heytap.msp.push.mode.a aVar, IDataMessageCallBackService iDataMessageCallBackService) {
        if (aVar != null && aVar.a() == 4103) {
            com.heytap.msp.push.mode.b bVar = (com.heytap.msp.push.mode.b) aVar;
            if (iDataMessageCallBackService != null) {
                hum.b(new a(bVar, context, iDataMessageCallBackService));
            }
        }
    }

    public final void b(Context context, com.heytap.msp.push.mode.b bVar) {
        if (context == null) {
            cpm.a("context is null");
            return;
        }
        cpm.a("Receive revokeMessage  extra : " + bVar.j() + "notifyId :" + bVar.i() + "messageId : " + bVar.k());
        ((NotificationManager) context.getSystemService(BgConnect.KEY_NOTIFICATION)).cancel(bVar.i());
        d(context, bVar);
    }

    public final void d(Context context, com.heytap.msp.push.mode.b bVar) {
        HashMap map = new HashMap();
        ArrayList arrayList = new ArrayList();
        arrayList.add(bVar);
        map.put(bVar.e(), arrayList);
        com.heytap.msp.push.statis.a.b(context, map);
    }
}
