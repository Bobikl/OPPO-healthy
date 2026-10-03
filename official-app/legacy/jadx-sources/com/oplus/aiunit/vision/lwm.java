package com.oplus.aiunit.vision;

import com.customer.feedback.sdk.util.LogUtil;
import com.heytap.log.formatter.LogFieldKey;
import com.oplus.weatherservicesdk.data.Weather;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes10.dex */
public final class lwm {
    public final long a;
    public final int b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f13864c;
    public final String d;

    public lwm(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            this.a = ((Long) jSONObject.get("t")).longValue();
            this.b = ((Integer) jSONObject.get(LogFieldKey.LEVEL_KEY)).intValue();
            this.f13864c = (String) jSONObject.get("n");
            this.d = (String) jSONObject.get("c");
        } catch (JSONException e2) {
            LogUtil.e("FbLogData", "exceptionInfo：" + e2);
        }
    }

    public static String b(String str) {
        str.replace("\r\n", "  ");
        str.replace(Weather.SEPARATOR, "  ");
        str.replace("\r", "  ");
        return str;
    }

    public final String a() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("t", this.a);
            jSONObject.put(LogFieldKey.LEVEL_KEY, this.b);
            jSONObject.put("n", this.f13864c);
            jSONObject.put("c", this.d);
        } catch (JSONException e2) {
            LogUtil.e("FbLogData", "exceptionInfo：" + e2);
        }
        return jSONObject.toString();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("");
        long j2 = this.a;
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone(v05.TIME_ZONE_8));
        sb.append(simpleDateFormat.format(new Date(j2)));
        sb.append(",");
        String str = "[I]";
        switch (this.b) {
            case 2:
                str = "[V]";
                break;
            case 3:
                str = "[D]";
                break;
            case 5:
                str = "[W]";
                break;
            case 6:
                str = "[E]";
                break;
            case 7:
                str = "[A]";
                break;
        }
        sb.append(str);
        sb.append(",");
        sb.append(this.f13864c);
        sb.append(",");
        sb.append(this.d);
        sb.append(",");
        return sb.toString();
    }

    public lwm(long j2, int i, String str, String str2) {
        this.a = j2;
        this.b = i;
        this.f13864c = str;
        this.d = b(str2);
    }
}
