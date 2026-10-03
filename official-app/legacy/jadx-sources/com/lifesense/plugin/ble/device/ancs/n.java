package com.lifesense.plugin.ble.device.ancs;

import android.annotation.TargetApi;
import android.content.Context;
import android.database.ContentObserver;
import android.database.Cursor;
import android.net.Uri;
import android.os.Handler;
import android.provider.Telephony;
import com.lifesense.plugin.ble.data.LSAppCategory;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes5.dex */
@TargetApi(19)
public class n extends ContentObserver {
    private static n g = null;
    public static boolean isEnableSmsObserver = false;
    private Context a;
    private Handler b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f8746c;
    private String d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private long f8747e;
    private l f;

    public n(Context context, Handler handler) {
        super(handler);
        this.f8746c = "";
        this.d = "";
        this.f8747e = 0L;
        this.a = context;
        this.b = handler;
    }

    @Override // android.database.ContentObserver
    public void onChange(boolean z, Uri uri) {
        Handler handler;
        super.onChange(z, uri);
        if (this.f != null && (handler = this.b) != null && this.a != null) {
            handler.post(new o(this, uri));
            return;
        }
        com.lifesense.plugin.ble.b.d.a().a(null, com.lifesense.plugin.ble.b.a.a.Message_Remind, false, "no permission to handle sms message,listener = " + this.f + "; handler =" + this.b + "; context =" + this.a, null);
    }

    public static void a(Context context) {
        try {
            if (g != null) {
                context.getContentResolver().unregisterContentObserver(g);
                g = null;
            }
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    public void a(Context context, Uri uri) {
        String str;
        if (!a(uri)) {
            com.lifesense.plugin.ble.b.d.a().a(null, com.lifesense.plugin.ble.b.a.a.Message_Remind, true, "sms format err uri=" + uri, "Sms");
            return;
        }
        try {
            Cursor cursorQuery = context.getContentResolver().query(uri, new String[]{"type", "body", "address", "person", "date", "read"}, null, null, "date DESC");
            if (cursorQuery == null) {
                com.lifesense.plugin.ble.b.d.a().a(null, com.lifesense.plugin.ble.b.a.a.Message_Remind, true, "failed to query sms with uri,cursor is null >>" + uri.toString(), "Sms");
                return;
            }
            if (cursorQuery.getCount() > 1) {
                com.lifesense.plugin.ble.b.d.a().a(null, com.lifesense.plugin.ble.b.a.a.Message_Remind, true, "undefine multiple sms message...." + cursorQuery.getCount(), null);
                cursorQuery.close();
                return;
            }
            if (cursorQuery.getCount() <= 0 || !cursorQuery.moveToFirst()) {
                return;
            }
            String string = cursorQuery.getString(cursorQuery.getColumnIndex("address"));
            cursorQuery.getString(cursorQuery.getColumnIndex("person"));
            String string2 = cursorQuery.getString(cursorQuery.getColumnIndex("body"));
            int i = cursorQuery.getInt(cursorQuery.getColumnIndex("type"));
            long j2 = cursorQuery.getLong(cursorQuery.getColumnIndex("date"));
            int i2 = cursorQuery.getInt(cursorQuery.getColumnIndex("read"));
            if (i != 1 || i2 != 0) {
                cursorQuery.close();
                com.lifesense.plugin.ble.b.d.a().a(null, com.lifesense.plugin.ble.b.a.a.Message_Remind, true, "SCO<< undefine message,type=" + i + " ; read=" + i2 + " ; sender=" + string, "Sms");
                return;
            }
            String str2 = this.f8746c;
            if (str2 != null && str2.equals(string2) && (str = this.d) != null && str.equals(string) && this.f8747e == j2) {
                com.lifesense.plugin.ble.b.d.a().a(null, com.lifesense.plugin.ble.b.a.a.Message_Remind, true, "filter the same sms from >>" + string, "Sms");
                cursorQuery.close();
                return;
            }
            this.f8746c = string2;
            this.d = string;
            this.f8747e = j2;
            int iA = c.a(context);
            com.lifesense.plugin.ble.b.d.a().a(null, com.lifesense.plugin.ble.b.a.a.Message_Remind, true, "SCO<< smsCount=" + iA + " ; sender=" + string, "Sms");
            if (p.isEnableSmsReceiver) {
                cursorQuery.close();
                return;
            }
            isEnableSmsObserver = true;
            a aVar = new a(string, string2, LSAppCategory.Sms.getValue());
            aVar.c(iA);
            aVar.b(c.a(string, context));
            this.f.a(this, aVar);
            cursorQuery.close();
        } catch (Exception e2) {
            e2.printStackTrace();
            com.lifesense.plugin.ble.b.d.a().a(null, com.lifesense.plugin.ble.b.a.a.Message_Remind, true, "sms query exception", "Sms");
        }
    }

    public static void a(Context context, Handler handler, l lVar) {
        try {
            a(context);
            n nVar = new n(context, handler);
            g = nVar;
            nVar.f = lVar;
            context.getContentResolver().registerContentObserver(Telephony.Sms.CONTENT_URI, true, g);
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    private boolean a(Uri uri) {
        if (uri == null || uri.toString().length() == 0) {
            return false;
        }
        return Pattern.compile("\\d+$").matcher(uri.toString()).find();
    }
}
