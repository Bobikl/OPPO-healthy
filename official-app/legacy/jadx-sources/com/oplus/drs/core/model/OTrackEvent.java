package com.oplus.drs.core.model;

import androidx.annotation.Keep;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.oplus.aiunit.vision.iim;
import com.oplus.aiunit.vision.of5;
import com.oplus.aiunit.vision.v8d;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
@Keep
public class OTrackEvent {
    public static final int LOCAL_TIME = 2;
    public static final int NTP_TIME = 1;
    public String app_id;
    public String app_key;
    public String app_secret;
    public String app_uuid;
    public String channel;
    public String client_id;
    public int client_type;
    public String custom_client_id;
    public JSONObject custom_header;
    public String duid;
    public String event_access;
    public final String event_group;
    public final String event_id;
    public final Map<String, Object> event_info;
    public long event_time;
    public int event_time_type;
    private final Map<String, Object> extra_data;
    public String feedback_region;
    public String ouid;
    public String pkgName;
    public int pkgVersionCode;
    public String pkgVersionName;
    public String region;
    public final int sdk_version;
    public final String sequence_id;
    public final String session_id;
    public final TrackType source_sdk;
    public String user_id;
    public String user_token;
    public String uuid;

    public static class a {
        public String A;
        public String B;
        public String C;
        public String D;
        public final String a;
        public final String b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Map<String, Object> f19769c;
        public final String d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final TrackType f19770e;
        public final int f;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public String f19772l;
        public String m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public JSONObject f19773n;
        public String o;
        public String p;
        public String q;
        public int r;
        public String s;
        public String t;
        public String u;
        public String v;
        public int w;
        public String x;
        public String y;
        public String z;
        public long g = System.currentTimeMillis();
        public int h = 2;
        public String i = "";

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public String f19771j = UUID.randomUUID().toString();
        public Map<String, Object> k = new HashMap();
        public int E = 1;

        public a(@NonNull String str, @NonNull String str2, @NonNull Map<String, Object> map, String str3, @NonNull TrackType trackType, int i) {
            this.a = str;
            this.b = str2;
            this.f19769c = new HashMap(map);
            this.d = str3;
            this.f19770e = trackType;
            this.f = i;
        }

        public OTrackEvent E() {
            return new OTrackEvent(this);
        }

        public a F(String str) {
            this.f19772l = str;
            return this;
        }

        public a G(String str) {
            this.m = str;
            return this;
        }

        public a H(String str) {
            this.x = str;
            return this;
        }

        public a I(String str) {
            this.o = str;
            return this;
        }

        public a J(String str) {
            this.v = str;
            return this;
        }

        public a K(int i) {
            this.w = i;
            return this;
        }

        public a L(String str) {
            this.A = str;
            return this;
        }

        public a M(JSONObject jSONObject) {
            this.f19773n = jSONObject;
            return this;
        }

        public a N(String str) {
            this.s = str;
            return this;
        }

        public a O(String str) {
            this.y = str;
            return this;
        }

        public a P(long j2) {
            this.g = j2;
            return this;
        }

        public a Q(int i) {
            this.h = i;
            return this;
        }

        public a R(@NonNull Map<String, Object> map) {
            this.k = new HashMap(map);
            return this;
        }

        public a S(String str) {
            this.C = str;
            return this;
        }

        public a T(String str) {
            this.t = str;
            return this;
        }

        public a U(String str) {
            this.p = str;
            return this;
        }

        public a V(int i) {
            this.r = i;
            return this;
        }

        public a W(String str) {
            this.q = str;
            return this;
        }

        public a X(String str) {
            this.B = str;
            return this;
        }

        public a Y(@NonNull String str) {
            this.f19771j = str;
            return this;
        }

        public a Z(@NonNull String str) {
            this.i = str;
            return this;
        }

        public a a0(String str) {
            this.z = str;
            return this;
        }

        public a b0(@NonNull String str) {
            this.u = str;
            return this;
        }
    }

    @Nullable
    public static OTrackEvent fromJson(@NonNull String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            a aVar = new a(jSONObject.optString("event_group", ""), jSONObject.optString(of5.ARG_EVENT_ID, ""), v8d.c(jSONObject.optJSONObject("event_info")), jSONObject.optString("app_id", ""), TrackType.valueOf(jSONObject.optString("source_sdk", "UNIFIED")), jSONObject.optInt("sdk_version", 0));
            aVar.P(jSONObject.optLong("event_time", System.currentTimeMillis())).Q(jSONObject.optInt("event_time_type", 2)).Z(jSONObject.optString("session_id", "")).Y(jSONObject.optString("sequence_id", "")).R(v8d.c(jSONObject.optJSONObject("extra_data"))).F(jSONObject.optString("app_key", null)).G(jSONObject.optString("app_secret", null)).M(jSONObject.optJSONObject("custom_header")).I(jSONObject.optString("channel", null)).U(jSONObject.optString(iim.a.b, null)).W(jSONObject.optString("pkg_version_name", null)).V(jSONObject.optInt("pkg_version_code", 0)).N(jSONObject.optString("duid", null)).T(jSONObject.optString("ouid", null)).J(jSONObject.optString("client_id", null)).K(jSONObject.optInt("client_type", 0)).H(jSONObject.optString("app_uuid", null)).O(jSONObject.optString("event_access", null)).a0(jSONObject.optString("user_id", null)).L(jSONObject.optString("custom_client_id", null)).X(jSONObject.optString("region", null)).S(jSONObject.optString("feedback_region", null));
            String strOptString = jSONObject.optString("uuid", null);
            if (strOptString != null && !strOptString.isEmpty()) {
                aVar.b0(strOptString);
            }
            return aVar.E();
        } catch (Exception unused) {
            return null;
        }
    }

    @NonNull
    public static List<OTrackEvent> fromJsonArray(@NonNull String str) {
        ArrayList arrayList = new ArrayList();
        try {
            JSONArray jSONArray = new JSONArray(str);
            for (int i = 0; i < jSONArray.length(); i++) {
                OTrackEvent oTrackEventFromJson = fromJson(jSONArray.getJSONObject(i).toString());
                if (oTrackEventFromJson != null) {
                    arrayList.add(oTrackEventFromJson);
                }
            }
        } catch (JSONException unused) {
        }
        return arrayList;
    }

    @Nullable
    public static OTrackEvent fromTrackBeanJson(@NonNull String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            String strOptString = jSONObject.optString("$event_group", "");
            String strOptString2 = jSONObject.optString("$event_id", "");
            String strOptString3 = jSONObject.optString("$event_info", "{}");
            long jOptLong = jSONObject.optLong("$event_time", System.currentTimeMillis());
            int iOptInt = jSONObject.optInt("$event_time_type", 2);
            String strOptString4 = jSONObject.optString("$session_id", "");
            return new a(strOptString, strOptString2, v8d.c(new JSONObject(strOptString3)), "", TrackType.OBUS, 0).P(jOptLong).Q(iOptInt).Z(strOptString4).Y(jSONObject.optString("$sequence_id", "")).E();
        } catch (Exception unused) {
            return null;
        }
    }

    public int calculateSize() {
        return v8d.a(this);
    }

    public String getAppId() {
        return this.app_id;
    }

    public String getAppKey() {
        return this.app_key;
    }

    public String getEventGroup() {
        return this.event_group;
    }

    public String getEventId() {
        return this.event_id;
    }

    public Map<String, Object> getEventInfo() {
        return this.event_info;
    }

    @NonNull
    public String getEventInfoAsString() {
        return v8d.e(this.event_info).toString();
    }

    public long getEventTime() {
        return this.event_time;
    }

    public int getEventTimeType() {
        return this.event_time_type;
    }

    public Map<String, Object> getExtraData() {
        return this.extra_data;
    }

    public int getSdkVersion() {
        return this.sdk_version;
    }

    public String getSequenceId() {
        return this.sequence_id;
    }

    public String getSessionId() {
        return this.session_id;
    }

    public TrackType getSourceSDK() {
        return this.source_sdk;
    }

    @NonNull
    public String toJson() {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("event_group", this.event_group);
            jSONObject.put(of5.ARG_EVENT_ID, this.event_id);
            jSONObject.put("event_info", v8d.e(this.event_info));
            jSONObject.put("app_id", this.app_id);
            jSONObject.put("event_time", this.event_time);
            jSONObject.put("event_time_type", this.event_time_type);
            jSONObject.put("session_id", this.session_id);
            jSONObject.put("sequence_id", this.sequence_id);
            jSONObject.put("source_sdk", this.source_sdk.name());
            jSONObject.put("sdk_version", this.sdk_version);
            jSONObject.put("extra_data", v8d.e(this.extra_data));
            String str = this.app_key;
            if (str != null) {
                jSONObject.put("app_key", str);
            }
            String str2 = this.app_secret;
            if (str2 != null) {
                jSONObject.put("app_secret", str2);
            }
            JSONObject jSONObject2 = this.custom_header;
            if (jSONObject2 != null) {
                jSONObject.put("custom_header", jSONObject2);
            }
            String str3 = this.channel;
            if (str3 != null) {
                jSONObject.put("channel", str3);
            }
            String str4 = this.pkgName;
            if (str4 != null) {
                jSONObject.put(iim.a.b, str4);
            }
            String str5 = this.pkgVersionName;
            if (str5 != null) {
                jSONObject.put("pkg_version_name", str5);
            }
            int i = this.pkgVersionCode;
            if (i != 0) {
                jSONObject.put("pkg_version_code", i);
            }
            String str6 = this.uuid;
            if (str6 != null) {
                jSONObject.put("uuid", str6);
            }
            String str7 = this.duid;
            if (str7 != null) {
                jSONObject.put("duid", str7);
            }
            String str8 = this.ouid;
            if (str8 != null) {
                jSONObject.put("ouid", str8);
            }
            String str9 = this.client_id;
            if (str9 != null) {
                jSONObject.put("client_id", str9);
            }
            int i2 = this.client_type;
            if (i2 != 0) {
                jSONObject.put("client_type", i2);
            }
            String str10 = this.app_uuid;
            if (str10 != null) {
                jSONObject.put("app_uuid", str10);
            }
            String str11 = this.event_access;
            if (str11 != null) {
                jSONObject.put("event_access", str11);
            }
            String str12 = this.user_id;
            if (str12 != null) {
                jSONObject.put("user_id", str12);
            }
            String str13 = this.custom_client_id;
            if (str13 != null) {
                jSONObject.put("custom_client_id", str13);
            }
            String str14 = this.region;
            if (str14 != null) {
                jSONObject.put("region", str14);
            }
            String str15 = this.feedback_region;
            if (str15 != null) {
                jSONObject.put("feedback_region", str15);
            }
            String str16 = this.user_token;
            if (str16 != null) {
                jSONObject.put("user_token", str16);
            }
            return jSONObject.toString();
        } catch (JSONException unused) {
            return "{}";
        }
    }

    public String toSimpleString() {
        return "OTrackEvent{appId=" + this.app_id + ", eventGroup='" + this.event_group + "', eventId='" + this.event_id + "', callinPkg='" + this.pkgName + "', eventTime=" + this.event_time + ", timeType=" + this.event_time_type + ", tackInfoId=" + this.uuid + ", sequence_id=" + this.sequence_id + ", session_id=" + this.session_id + '}';
    }

    @NonNull
    public String toString() {
        StringBuilder sb = new StringBuilder("OTrackEvent{");
        sb.append("event_group='");
        sb.append(this.event_group);
        sb.append('\'');
        sb.append(", event_id='");
        sb.append(this.event_id);
        sb.append('\'');
        sb.append(", app_id='");
        sb.append(this.app_id);
        sb.append('\'');
        sb.append(", event_time=");
        sb.append(this.event_time);
        sb.append(", event_time_type=");
        sb.append(this.event_time_type);
        sb.append(", session_id='");
        sb.append(this.session_id);
        sb.append('\'');
        sb.append(", sequence_id='");
        sb.append(this.sequence_id);
        sb.append('\'');
        sb.append(", source_sdk=");
        sb.append(this.source_sdk);
        sb.append(", sdk_version=");
        sb.append(this.sdk_version);
        sb.append(", event_info_size=");
        Map<String, Object> map = this.event_info;
        sb.append(map != null ? map.size() : 0);
        sb.append(", extra_data_size=");
        Map<String, Object> map2 = this.extra_data;
        sb.append(map2 != null ? map2.size() : 0);
        if (this.pkgName != null) {
            sb.append(", pkgName='");
            sb.append(this.pkgName);
            sb.append('\'');
        }
        if (this.channel != null) {
            sb.append(", channel='");
            sb.append(this.channel);
            sb.append('\'');
        }
        if (this.app_key != null) {
            sb.append(", app_key='");
            sb.append(this.app_key);
            sb.append('\'');
        }
        if (this.duid != null) {
            sb.append(", duid='");
            sb.append(this.duid);
            sb.append('\'');
        }
        if (this.ouid != null) {
            sb.append(", ouid='");
            sb.append(this.ouid);
            sb.append('\'');
        }
        if (this.uuid != null) {
            sb.append(", uuid='");
            sb.append(this.uuid);
            sb.append('\'');
        }
        sb.append('}');
        return sb.toString();
    }

    @NonNull
    public String toTrackBeanJson() {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("$event_group", this.event_group);
            jSONObject.put("$event_id", this.event_id);
            jSONObject.put("$event_time", this.event_time);
            jSONObject.put("$event_time_type", this.event_time_type);
            jSONObject.put("$session_id", this.session_id);
            jSONObject.put("$sequence_id", this.sequence_id);
            jSONObject.put("$event_info", getEventInfoAsString());
            return jSONObject.toString();
        } catch (JSONException unused) {
            return "{}";
        }
    }

    public boolean validate() {
        return v8d.f(this);
    }

    private OTrackEvent(a aVar) {
        this.event_group = aVar.a;
        this.event_id = aVar.b;
        this.event_info = aVar.f19769c;
        this.app_id = aVar.d;
        this.event_time = aVar.g;
        this.event_time_type = aVar.h;
        this.session_id = aVar.i;
        this.sequence_id = aVar.f19771j;
        this.source_sdk = aVar.f19770e;
        this.sdk_version = aVar.f;
        this.extra_data = aVar.k;
        this.app_key = aVar.f19772l;
        this.app_secret = aVar.m;
        this.custom_header = aVar.f19773n;
        this.channel = aVar.o;
        this.pkgName = aVar.p;
        this.pkgVersionName = aVar.q;
        this.pkgVersionCode = aVar.r;
        this.duid = aVar.s;
        this.ouid = aVar.t;
        this.uuid = aVar.u;
        this.client_id = aVar.v;
        this.client_type = aVar.w;
        this.app_uuid = aVar.x;
        this.event_access = aVar.y;
        this.user_id = aVar.z;
        this.custom_client_id = aVar.A;
        this.region = aVar.B;
        this.feedback_region = aVar.C;
        this.user_token = aVar.D;
    }
}
