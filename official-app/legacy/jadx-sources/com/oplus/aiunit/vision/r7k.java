package com.oplus.aiunit.vision;

import android.content.ContentProviderClient;
import android.content.ContentResolver;
import android.content.ContentValues;
import android.content.Context;
import android.net.Uri;
import com.oplus.nearx.track.internal.common.content.GlobalConfigHelper;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public class r7k {
    public static final String TAG = "TrackToDccHelper";
    public static volatile r7k d;
    public ContentResolver a;
    public Uri b = Uri.parse("content://com.oplus.dcc.provider.TrackContentProvider/dwd_sdk_log_inc_h");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final qqf f16116c = new qqf.b(120, 120000).c();

    public r7k(Context context) {
        this.a = context.getContentResolver();
    }

    public static r7k b(Context context) {
        if (d == null) {
            synchronized (r7k.class) {
                if (d == null) {
                    d = new r7k(context);
                }
            }
        }
        return d;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void c(ContentValues contentValues, String str, String str2, String str3) {
        try {
            ContentProviderClient contentProviderClientAcquireUnstableContentProviderClient = this.a.acquireUnstableContentProviderClient(this.b);
            try {
                if (contentProviderClientAcquireUnstableContentProviderClient == null) {
                    k6k.e().c(TAG, "ContentProviderClient is null", null, new Object[0]);
                    if (contentProviderClientAcquireUnstableContentProviderClient != null) {
                        contentProviderClientAcquireUnstableContentProviderClient.close();
                        return;
                    }
                    return;
                }
                if (contentProviderClientAcquireUnstableContentProviderClient.insert(this.b, contentValues) != null) {
                    k6k.e().a(TAG, String.format("appId=%s,eventGroup=%s,eventId=%s send to dcc success", str, str2, str3), null, new Object[0]);
                }
                contentProviderClientAcquireUnstableContentProviderClient.close();
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    if (contentProviderClientAcquireUnstableContentProviderClient != null) {
                        try {
                            contentProviderClientAcquireUnstableContentProviderClient.close();
                        } catch (Throwable th3) {
                            th.addSuppressed(th3);
                        }
                    }
                    throw th2;
                }
            }
        } catch (Throwable th4) {
            k6k.e().c(TAG, "acquireUnstableContentProviderClient error=", th4, new Object[0]);
        }
    }

    public boolean d(final String str, final String str2, final String str3, JSONObject jSONObject, re1 re1Var) {
        JSONObject jSONObjectOptJSONObject;
        if (jSONObject != null && re1Var != null) {
            k6k.e().a(TAG, String.format("appId=%s,eventGroup=%s,eventId=%s,bitMapConfig=%s", str, str2, str3, re1Var), null, new Object[0]);
            boolean zD = re1Var.d();
            boolean zB = re1Var.b();
            boolean zC = re1Var.c();
            boolean zA = re1Var.a();
            if (!zD && !zB) {
                k6k.e().a(TAG, String.format("appId=%s,eventGroup=%s,eventId=%s,sendToDcc=false && newSendToDcc=false,return", str, str2, str3), null, new Object[0]);
                return false;
            }
            JSONObject jSONObjectOptJSONObject2 = jSONObject.optJSONObject("head");
            JSONObject jSONObjectOptJSONObject3 = jSONObject.optJSONObject("body");
            if (jSONObjectOptJSONObject2 != null && jSONObjectOptJSONObject3 != null) {
                if (!this.f16116c.c(str + "_" + str2 + "_" + str3)) {
                    return false;
                }
                if (zB && (jSONObjectOptJSONObject = jSONObjectOptJSONObject3.optJSONObject("$event_info")) != null && !jSONObjectOptJSONObject.optBoolean("_send_to_dcc")) {
                    k6k.e().a(TAG, String.format("appId=%s,eventGroup=%s,eventId=%s,_send_to_dcc is false,return", str, str2, str3), null, new Object[0]);
                    return false;
                }
                boolean z = zC || zA;
                final ContentValues contentValues = new ContentValues();
                contentValues.put("head", jSONObjectOptJSONObject2.toString());
                contentValues.put("body", jSONObjectOptJSONObject3.toString());
                contentValues.put("sendToAI", Boolean.valueOf(z));
                GlobalConfigHelper.INSTANCE.h().execute(new Runnable() { // from class: com.oplus.aiunit.vision.q7k
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.i.c(contentValues, str, str2, str3);
                    }
                });
                return true;
            }
        }
        return false;
    }
}
