package com.heytap.sports.step.stepdaemon.store;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.text.TextUtils;
import com.oplus.aiunit.vision.a7b;
import com.oplus.aiunit.vision.tti;
import com.oplus.aiunit.vision.v9g;
import com.oplus.aiunit.vision.x05;

/* JADX INFO: loaded from: classes2.dex */
public class a {
    public static final Uri a = Uri.parse("content://com.coloros.assistantscreen.export.stepprovider/day_statistic");

    /* JADX INFO: renamed from: com.heytap.sports.step.stepdaemon.store.a$a, reason: collision with other inner class name */
    public interface InterfaceC0795a {
        void a(int i);
    }

    public static void a(Context context, InterfaceC0795a interfaceC0795a) {
        if (TextUtils.isEmpty(v9g.w().D("user_ssoid"))) {
            return;
        }
        try {
            Cursor cursorQuery = context.getContentResolver().query(a, null, null, null, null);
            try {
                StringBuilder sb = new StringBuilder();
                sb.append("getTodayStepForAssScreen total data number = ");
                sb.append(cursorQuery == null ? "null" : Integer.valueOf(cursorQuery.getCount()));
                a7b.f("AssScreenUtil", sb.toString());
                if (cursorQuery != null && cursorQuery.getCount() > 0) {
                    while (cursorQuery.moveToNext()) {
                        String string = cursorQuery.getString(cursorQuery.getColumnIndex("amount"));
                        String string2 = cursorQuery.getString(cursorQuery.getColumnIndex("date"));
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append("getTodayStepForAssScreen date = ");
                        sb2.append(string2);
                        sb2.append(", step = ");
                        sb2.append(string);
                        if (string2.equals(x05.g("yyyy-MM-dd")) && !string.isEmpty()) {
                            interfaceC0795a.a(Integer.parseInt(string));
                            break;
                        }
                    }
                } else {
                    a7b.b("AssScreenUtil", "getTodayStepForAssScreen no data");
                    interfaceC0795a.a(0);
                }
                tti.a(cursorQuery);
                if (cursorQuery != null) {
                    cursorQuery.close();
                }
            } catch (Throwable th) {
                if (cursorQuery != null) {
                    try {
                        cursorQuery.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                }
                throw th;
            }
        } catch (SecurityException e2) {
            a7b.b("AssScreenUtil", "SecurityException no permission :" + e2.getMessage());
            interfaceC0795a.a(0);
        } catch (Exception e3) {
            a7b.b("AssScreenUtil", "Exception " + e3.getMessage());
            interfaceC0795a.a(0);
        }
    }
}
