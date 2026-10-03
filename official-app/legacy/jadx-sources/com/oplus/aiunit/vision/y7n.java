package com.oplus.aiunit.vision;

import android.app.OplusNotificationManager;
import android.content.Context;
import android.os.Binder;
import android.provider.Settings;
import android.text.TextUtils;
import android.util.Log;
import com.android.id.impl.IdProviderImpl;
import com.platform.usercenter.tools.device.OpenIDHelper;
import java.util.ArrayList;
import java.util.HashMap;

/* JADX INFO: loaded from: classes11.dex */
public final class y7n extends q7n {
    /* JADX WARN: Code duplicated, block: B:43:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:65:0x008f A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // com.oplus.aiunit.vision.q7n
    public final HashMap a(Context context, ArrayList arrayList) {
        String openid;
        OplusNotificationManager oplusNotificationManager;
        HashMap map = new HashMap();
        if (this.b.equals("OP_APP")) {
            if (arrayList.contains("OUID_STATUS") && !d8n.f10435s_a.f9249j) {
                map.put("OUID_STATUS", Settings.Secure.getInt(context.getContentResolver(), o7n.s_b.equals("phone") ? "openid_toggle" : "stdid_toggle", 1) != 1 ? "FALSE" : "TRUE");
                arrayList.remove("OUID_STATUS");
                k8n.a("2041");
            }
            if (arrayList.contains(OpenIDHelper.OUID)) {
                if (!o7n.s_b.equals("phone")) {
                    f(context, arrayList, map);
                    k8n.a("2052");
                } else if (r7n.b()) {
                    r7n r7nVar = n7n.f14389s_a;
                    IdProviderImpl idProviderImpl = r7nVar.a;
                    if (idProviderImpl != null) {
                        try {
                            openid = idProviderImpl.getOpenid(context, OpenIDHelper.OUID);
                        } catch (Error | Exception e2) {
                            StringBuilder sb = new StringBuilder("1086: ");
                            sb.append(e2.getMessage() != null ? e2.getMessage() : e2.getLocalizedMessage());
                            Log.e("IDHelper", sb.toString());
                            oplusNotificationManager = r7nVar.b;
                            if (oplusNotificationManager != null) {
                                try {
                                    openid = oplusNotificationManager.getStdid(context.getPackageName(), Binder.getCallingUid(), OpenIDHelper.OUID);
                                } catch (Error | Exception e3) {
                                    StringBuilder sb2 = new StringBuilder("1087: ");
                                    sb2.append(e3.getMessage() != null ? e3.getMessage() : e3.getLocalizedMessage());
                                    Log.e("IDHelper", sb2.toString());
                                    openid = "";
                                }
                            } else {
                                openid = "";
                            }
                        }
                    } else {
                        oplusNotificationManager = r7nVar.b;
                        if (oplusNotificationManager != null) {
                            openid = oplusNotificationManager.getStdid(context.getPackageName(), Binder.getCallingUid(), OpenIDHelper.OUID);
                        } else {
                            openid = "";
                        }
                    }
                    k8n.a("2042");
                    if (TextUtils.isEmpty(openid)) {
                        Log.e("IDHelper", "1088");
                    } else {
                        map.put(OpenIDHelper.OUID, openid);
                        arrayList.remove(OpenIDHelper.OUID);
                    }
                } else if (d8n.f10435s_a.i) {
                    k8n.a("2046");
                    f(context, arrayList, map);
                }
            }
        } else if (this.b.equals("MCS_APP")) {
            if (arrayList.contains("OUID_STATUS")) {
                map.put("OUID_STATUS", "TRUE");
                arrayList.remove("OUID_STATUS");
                k8n.a("2043");
            }
            if (arrayList.contains(OpenIDHelper.OUID)) {
                k8n.a("2044");
                if (m8n.f13986s_a.i) {
                    f(context, arrayList, map);
                }
            }
        }
        return map;
    }

    @Override // com.oplus.aiunit.vision.q7n
    public final void c(Context context, ArrayList arrayList, boolean z) {
        if (this.b.equals("OP_APP")) {
            d8n.f10435s_a.c(context, arrayList, z);
        } else {
            m8n.f13986s_a.c(context, arrayList, z);
        }
    }

    public final void f(Context context, ArrayList arrayList, HashMap map) {
        String string = Settings.Secure.getString(context.getContentResolver(), "oplus_omes_stdid_ouid");
        if (TextUtils.isEmpty(string)) {
            k8n.a("2045");
            return;
        }
        map.put(OpenIDHelper.OUID, string);
        arrayList.remove(OpenIDHelper.OUID);
        o7n.f14829s_a.execute(new s7n(this, context));
    }
}
