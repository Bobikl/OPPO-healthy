package com.heytap.health.base.permission.wxbpermission;

import android.annotation.SuppressLint;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import com.oplus.aiunit.vision.a7b;
import com.oplus.aiunit.vision.iee;
import com.oplus.aiunit.vision.rdf;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes15.dex */
@SuppressLint({"InlinedApi"})
public class PermissionExplanation extends BroadcastReceiver {
    public static final Map<String, String[]> a = new HashMap();

    static {
        a();
    }

    public static void a() {
        Map<String, String[]> map = a;
        map.put("android.permission.ACTIVITY_RECOGNITION", new String[]{iee.h("android.permission.ACTIVITY_RECOGNITION"), iee.i("android.permission.ACTIVITY_RECOGNITION")});
        map.put("android.permission.WRITE_EXTERNAL_STORAGE", new String[]{iee.h("android.permission.WRITE_EXTERNAL_STORAGE"), iee.i("android.permission.WRITE_EXTERNAL_STORAGE")});
        map.put("android.permission.READ_EXTERNAL_STORAGE", new String[]{iee.h("android.permission.READ_EXTERNAL_STORAGE"), iee.i("android.permission.READ_EXTERNAL_STORAGE")});
        map.put("android.permission.READ_MEDIA_AUDIO", new String[]{iee.h("android.permission.READ_MEDIA_AUDIO"), iee.i("android.permission.READ_MEDIA_AUDIO")});
        map.put("android.permission.READ_MEDIA_IMAGES", new String[]{iee.h("android.permission.READ_MEDIA_IMAGES"), iee.i("android.permission.READ_MEDIA_IMAGES")});
        map.put("android.permission.READ_MEDIA_VIDEO", new String[]{iee.h("android.permission.READ_MEDIA_VIDEO"), iee.i("android.permission.READ_MEDIA_VIDEO")});
        map.put("android.permission.READ_MEDIA_VISUAL_USER_SELECTED", new String[]{iee.h("android.permission.READ_MEDIA_VISUAL_USER_SELECTED"), iee.i("android.permission.READ_MEDIA_VISUAL_USER_SELECTED")});
        map.put("android.permission.CAMERA", new String[]{iee.h("android.permission.CAMERA"), iee.i("android.permission.CAMERA")});
        map.put("android.permission.ACCESS_FINE_LOCATION", new String[]{iee.h("android.permission.ACCESS_FINE_LOCATION"), iee.i("android.permission.ACCESS_FINE_LOCATION")});
        map.put("android.permission.ACCESS_COARSE_LOCATION", new String[]{iee.h("android.permission.ACCESS_COARSE_LOCATION"), iee.i("android.permission.ACCESS_COARSE_LOCATION")});
        map.put("android.permission.ACCESS_BACKGROUND_LOCATION", new String[]{iee.h("android.permission.ACCESS_BACKGROUND_LOCATION"), iee.i("android.permission.ACCESS_BACKGROUND_LOCATION")});
        map.put("android.permission.RECORD_AUDIO", new String[]{iee.h("android.permission.RECORD_AUDIO"), iee.i("android.permission.RECORD_AUDIO")});
        map.put("android.permission.CALL_PHONE", new String[]{iee.h("android.permission.CALL_PHONE"), iee.i("android.permission.CALL_PHONE")});
        map.put("android.permission.READ_PHONE_STATE", new String[]{iee.h("android.permission.READ_PHONE_STATE"), iee.i("android.permission.READ_PHONE_STATE")});
        map.put("android.permission.ANSWER_PHONE_CALLS", new String[]{iee.h("android.permission.ANSWER_PHONE_CALLS"), iee.i("android.permission.ANSWER_PHONE_CALLS")});
        map.put("android.permission.READ_CONTACTS", new String[]{iee.h("android.permission.READ_CONTACTS"), iee.i("android.permission.READ_CONTACTS")});
        map.put("android.permission.READ_CALL_LOG", new String[]{iee.h("android.permission.READ_CALL_LOG"), iee.i("android.permission.READ_CALL_LOG")});
        map.put("android.permission.SEND_SMS", new String[]{iee.h("android.permission.SEND_SMS"), iee.i("android.permission.SEND_SMS")});
        map.put("android.permission.READ_CALENDAR", new String[]{iee.h("android.permission.READ_CALENDAR"), iee.i("android.permission.READ_CALENDAR")});
        map.put("android.permission.WRITE_CALENDAR", new String[]{iee.h("android.permission.WRITE_CALENDAR"), iee.i("android.permission.WRITE_CALENDAR")});
        map.put("android.permission.BLUETOOTH_SCAN", new String[]{iee.h("android.permission.BLUETOOTH_SCAN"), iee.i("android.permission.BLUETOOTH_SCAN")});
        map.put("android.permission.BLUETOOTH_CONNECT", new String[]{iee.h("android.permission.BLUETOOTH_CONNECT"), iee.i("android.permission.BLUETOOTH_CONNECT")});
        map.put("android.permission.NEARBY_WIFI_DEVICES", new String[]{iee.h("android.permission.NEARBY_WIFI_DEVICES"), iee.i("android.permission.NEARBY_WIFI_DEVICES")});
    }

    public static String[] b(String str, int i) {
        String[] strArr = a.get(str);
        if (strArr != null) {
            try {
                strArr[1] = iee.g(i, str);
            } catch (Exception e2) {
                a7b.b("PermissionExplanation", "Error is " + e2.toString());
            }
        }
        StringBuilder sb = new StringBuilder();
        sb.append("[mapContent] featureId = ");
        sb.append(i);
        sb.append(",permission = ");
        sb.append(str);
        sb.append(",content = ");
        sb.append(strArr == null ? "null" : strArr[1]);
        return strArr;
    }

    public void c(Context context) {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.LOCALE_CHANGED");
        rdf.a(context, this, intentFilter, 2);
    }

    public void d(Context context) {
        context.unregisterReceiver(this);
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        if (intent.getAction().equals("android.intent.action.LOCALE_CHANGED")) {
            a.clear();
            a();
        }
    }
}
