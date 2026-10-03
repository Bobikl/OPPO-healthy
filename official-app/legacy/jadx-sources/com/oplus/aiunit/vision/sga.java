package com.oplus.aiunit.vision;

import android.text.TextUtils;
import com.oplus.drs.core.model.OTrackEvent;
import com.oplus.drs.core.model.TrackType;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public class sga {
    public final OTrackEvent a;
    public long b = -1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f16574c = false;
    public final String d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f16575e;
    public transient JSONObject f;

    public sga(OTrackEvent oTrackEvent, String str) {
        this.a = oTrackEvent;
        this.d = str;
        this.f16575e = oTrackEvent != null ? oTrackEvent.uuid : null;
    }

    public String A() {
        OTrackEvent oTrackEvent = this.a;
        if (oTrackEvent != null) {
            return oTrackEvent.session_id;
        }
        return null;
    }

    public TrackType B() {
        OTrackEvent oTrackEvent = this.a;
        if (oTrackEvent != null) {
            return oTrackEvent.source_sdk;
        }
        return null;
    }

    public String C() {
        return this.f16575e;
    }

    public String D() {
        OTrackEvent oTrackEvent = this.a;
        if (oTrackEvent != null) {
            return oTrackEvent.user_id;
        }
        return null;
    }

    public String E() {
        OTrackEvent oTrackEvent = this.a;
        if (oTrackEvent != null) {
            return oTrackEvent.user_token;
        }
        return null;
    }

    public boolean F() {
        return this.f16574c;
    }

    public void G(boolean z) {
        this.f16574c = z;
    }

    public void H(long j2) {
        this.b = j2;
    }

    public String a() {
        OTrackEvent oTrackEvent = this.a;
        if (oTrackEvent != null) {
            return oTrackEvent.app_id;
        }
        return null;
    }

    public String b() {
        OTrackEvent oTrackEvent = this.a;
        if (oTrackEvent != null) {
            return oTrackEvent.app_uuid;
        }
        return null;
    }

    public String c() {
        OTrackEvent oTrackEvent = this.a;
        if (oTrackEvent != null) {
            return oTrackEvent.pkgName;
        }
        return null;
    }

    public int d() {
        OTrackEvent oTrackEvent = this.a;
        if (oTrackEvent != null) {
            return oTrackEvent.pkgVersionCode;
        }
        return 0;
    }

    public String e() {
        OTrackEvent oTrackEvent = this.a;
        if (oTrackEvent != null) {
            return oTrackEvent.pkgVersionName;
        }
        return null;
    }

    public String f() {
        OTrackEvent oTrackEvent = this.a;
        if (oTrackEvent != null) {
            return oTrackEvent.channel;
        }
        return null;
    }

    public String g() {
        OTrackEvent oTrackEvent = this.a;
        if (oTrackEvent != null) {
            return oTrackEvent.client_id;
        }
        return null;
    }

    public int h() {
        OTrackEvent oTrackEvent = this.a;
        if (oTrackEvent != null) {
            return oTrackEvent.client_type;
        }
        return 0;
    }

    public String i() {
        OTrackEvent oTrackEvent = this.a;
        if (oTrackEvent != null) {
            return oTrackEvent.custom_client_id;
        }
        return null;
    }

    public JSONObject j() {
        OTrackEvent oTrackEvent = this.a;
        if (oTrackEvent != null) {
            return oTrackEvent.custom_header;
        }
        return null;
    }

    public String k() {
        OTrackEvent oTrackEvent = this.a;
        if (oTrackEvent != null) {
            return oTrackEvent.duid;
        }
        return null;
    }

    public String l() {
        OTrackEvent oTrackEvent = this.a;
        if (oTrackEvent != null) {
            return oTrackEvent.event_access;
        }
        return null;
    }

    public String m() {
        OTrackEvent oTrackEvent = this.a;
        if (oTrackEvent != null) {
            return oTrackEvent.event_group;
        }
        return null;
    }

    public String n() {
        OTrackEvent oTrackEvent = this.a;
        if (oTrackEvent != null) {
            return oTrackEvent.event_id;
        }
        return null;
    }

    public Map<String, Object> o() {
        OTrackEvent oTrackEvent = this.a;
        if (oTrackEvent != null) {
            return oTrackEvent.event_info;
        }
        return null;
    }

    public long p() {
        OTrackEvent oTrackEvent = this.a;
        if (oTrackEvent != null) {
            return oTrackEvent.event_time;
        }
        return 0L;
    }

    public int q() {
        OTrackEvent oTrackEvent = this.a;
        if (oTrackEvent != null) {
            return oTrackEvent.event_time_type;
        }
        return 0;
    }

    public String r() {
        OTrackEvent oTrackEvent = this.a;
        if (oTrackEvent != null) {
            return oTrackEvent.feedback_region;
        }
        return null;
    }

    public String s() {
        OTrackEvent oTrackEvent = this.a;
        if (oTrackEvent != null) {
            return oTrackEvent.app_key;
        }
        return null;
    }

    public String t() {
        OTrackEvent oTrackEvent = this.a;
        if (oTrackEvent != null) {
            return oTrackEvent.ouid;
        }
        return null;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("IpcRequest{appId=");
        sb.append(a());
        sb.append(", key='");
        sb.append(s());
        sb.append('\'');
        sb.append(", secret='");
        sb.append(TextUtils.isEmpty(x()) ? "" : "***");
        sb.append('\'');
        sb.append(", channel='");
        sb.append(f());
        sb.append('\'');
        sb.append(", eventGroup='");
        sb.append(m());
        sb.append('\'');
        sb.append(", eventId='");
        sb.append(n());
        sb.append('\'');
        sb.append(", callinPkg='");
        sb.append(c());
        sb.append('\'');
        sb.append(", sequenceNumber=");
        sb.append(this.b);
        sb.append(", eventTime=");
        sb.append(p());
        sb.append(", timeType=");
        sb.append(q());
        sb.append('}');
        return sb.toString();
    }

    public JSONObject u() {
        Map<String, Object> map;
        JSONObject jSONObject = this.f;
        if (jSONObject != null) {
            return jSONObject;
        }
        OTrackEvent oTrackEvent = this.a;
        if (oTrackEvent == null || (map = oTrackEvent.event_info) == null) {
            JSONObject jSONObject2 = new JSONObject();
            this.f = jSONObject2;
            return jSONObject2;
        }
        JSONObject jSONObjectE = v8d.e(map);
        this.f = jSONObjectE;
        return jSONObjectE;
    }

    public String v() {
        OTrackEvent oTrackEvent = this.a;
        if (oTrackEvent != null) {
            return oTrackEvent.region;
        }
        return null;
    }

    public int w() {
        OTrackEvent oTrackEvent = this.a;
        if (oTrackEvent != null) {
            return oTrackEvent.sdk_version;
        }
        return 0;
    }

    public String x() {
        OTrackEvent oTrackEvent = this.a;
        if (oTrackEvent != null) {
            return oTrackEvent.app_secret;
        }
        return null;
    }

    public String y() {
        OTrackEvent oTrackEvent = this.a;
        if (oTrackEvent != null) {
            return oTrackEvent.sequence_id;
        }
        return null;
    }

    public long z() {
        return this.b;
    }
}
