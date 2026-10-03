package com.oplus.drs.core.track;

import com.oplus.aiunit.vision.of5;
import com.oplus.aiunit.vision.xvg;
import com.oplus.aiunit.vision.z6b;
import com.oplus.drs.base.util.NetworkUtils;
import com.oplus.nearx.track.internal.remoteconfig.cloudconfig.entity.EventRuleEntity;
import java.util.Objects;
import java.util.UUID;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public class TrackBean {
    private static final String TAG = "TrackBean";
    private String appId;
    private int data_type;
    public String duid;
    private String event_access;
    private int event_cache_status;
    private final String event_group;
    private final String event_id;
    private String event_info;
    private EventNetType event_net_type;
    private String event_sample_intervals;
    private final long event_time;
    private final int event_time_type;
    private long head_switch;
    private String ipcSessionId;
    private boolean is_realtime;
    public String ouid;
    private long seqNumber;
    private String sequence_id;
    private String session_id;
    public String tackInfoId;
    private int track_type;
    private int upload_type;

    public TrackBean(long j2, String str, String str2, long j3, String str3, int i, EventNetType eventNetType, String str4, String str5, String str6, long j4, int i2, boolean z, int i3, int i4, String str7, int i5) {
        this.event_net_type = EventNetType.NET_TYPE_ALL_NET;
        this.event_access = NetworkUtils.j();
        this.session_id = xvg.a();
        this.sequence_id = UUID.randomUUID().toString();
        this.event_sample_intervals = EventRuleEntity.DEFAULT_SAMPLING_INTERVAL;
        this.event_cache_status = 0;
        this.seqNumber = -1L;
        this.ipcSessionId = UUID.randomUUID().toString();
        this.event_group = str;
        this.event_id = str2;
        this.event_time = j3;
        this.event_info = str3;
        this.event_time_type = i;
        this.event_net_type = eventNetType;
        this.event_access = str4;
        this.session_id = str5;
        this.sequence_id = str6;
        this.head_switch = j4;
        this.track_type = i2;
        this.is_realtime = z;
        this.upload_type = i3;
        this.data_type = i4;
        this.event_sample_intervals = str7;
        this.event_cache_status = i5;
    }

    public static TrackBean fromJson(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            return new TrackBean(jSONObject.optLong(getJsonName("appId")), jSONObject.optString(getJsonName("event_group")), jSONObject.optString(getJsonName(of5.ARG_EVENT_ID)), jSONObject.optLong(getJsonName("event_time")), jSONObject.optJSONObject(getJsonName("event_info")).toString(), jSONObject.optInt(getJsonName("event_time_type")), EventNetType.NET_TYPE_ALL_NET, NetworkUtils.j(), jSONObject.optString(getJsonName("session_id")), jSONObject.optString(getJsonName("sequence_id")), 0L, 1, true, UploadType.REALTIME.value(), DataType.BIZ.value(), EventRuleEntity.DEFAULT_SAMPLING_INTERVAL, 0);
        } catch (Exception e2) {
            e2.printStackTrace();
            return null;
        }
    }

    public static String getJsonName(String str) {
        return "$" + str;
    }

    private static Object string2Json(String str) {
        try {
            return new JSONObject(str);
        } catch (JSONException unused) {
            return str;
        }
    }

    public static JSONObject toJson(TrackBean trackBean) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(getJsonName("appId"), trackBean.appId);
            jSONObject.put(getJsonName("event_group"), trackBean.event_group);
            jSONObject.put(getJsonName(of5.ARG_EVENT_ID), trackBean.event_id);
            jSONObject.put(getJsonName("event_time"), trackBean.event_time);
            jSONObject.put(getJsonName("event_time_type"), trackBean.event_time_type);
            jSONObject.put(getJsonName("session_id"), trackBean.session_id);
            jSONObject.put(getJsonName("sequence_id"), trackBean.sequence_id);
            jSONObject.put(getJsonName("event_info"), string2Json(trackBean.event_info));
            jSONObject.put("head_switch", trackBean.head_switch);
        } catch (JSONException e2) {
            z6b.p(TAG, "TrackBean toJson", e2);
        }
        return jSONObject;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        TrackBean trackBean = (TrackBean) obj;
        return this.event_time == trackBean.event_time && this.event_time_type == trackBean.event_time_type && this.head_switch == trackBean.head_switch && this.track_type == trackBean.track_type && this.is_realtime == trackBean.is_realtime && this.upload_type == trackBean.upload_type && this.data_type == trackBean.data_type && this.event_cache_status == trackBean.event_cache_status && Objects.equals(this.event_group, trackBean.event_group) && Objects.equals(this.event_id, trackBean.event_id) && Objects.equals(this.event_info, trackBean.event_info) && this.event_net_type == trackBean.event_net_type && Objects.equals(this.event_access, trackBean.event_access) && Objects.equals(this.session_id, trackBean.session_id) && Objects.equals(this.sequence_id, trackBean.sequence_id) && Objects.equals(this.event_sample_intervals, trackBean.event_sample_intervals);
    }

    public String getAppId() {
        return this.appId;
    }

    public int getDataType() {
        return this.data_type;
    }

    public String getDuid() {
        return this.duid;
    }

    public String getEventAccess() {
        return this.event_access;
    }

    public int getEventCacheStatus() {
        return this.event_cache_status;
    }

    public String getEventGroup() {
        return this.event_group;
    }

    public String getEventId() {
        return this.event_id;
    }

    public String getEventInfo() {
        return this.event_info;
    }

    public String getEventSampleIntervals() {
        return this.event_sample_intervals;
    }

    public long getEventTime() {
        return this.event_time;
    }

    public int getEventTimeType() {
        return this.event_time_type;
    }

    public long getHeadSwitch() {
        return this.head_switch;
    }

    public String getIpcSessionId() {
        return this.ipcSessionId;
    }

    public String getOuid() {
        return this.ouid;
    }

    public long getSeqNumber() {
        return this.seqNumber;
    }

    public String getSequenceId() {
        return this.sequence_id;
    }

    public String getSessionId() {
        return this.session_id;
    }

    public String getTackInfoId() {
        return this.tackInfoId;
    }

    public int getTrackType() {
        return this.track_type;
    }

    public int getUploadType() {
        return this.upload_type;
    }

    public int hashCode() {
        return Objects.hash(this.event_group, this.event_id, Long.valueOf(this.event_time), this.event_info, Integer.valueOf(this.event_time_type), this.event_net_type, this.event_access, this.session_id, this.sequence_id, Long.valueOf(this.head_switch), Integer.valueOf(this.track_type), Boolean.valueOf(this.is_realtime), Integer.valueOf(this.upload_type), Integer.valueOf(this.data_type), this.event_sample_intervals, Integer.valueOf(this.event_cache_status));
    }

    public boolean isIsRealtime() {
        return this.is_realtime;
    }

    public void setAppId(String str) {
        this.appId = str;
    }

    public void setDataType(int i) {
        this.data_type = i;
    }

    public void setDuid(String str) {
        this.duid = str;
    }

    public void setEventCacheStatus(int i) {
        this.event_cache_status = i;
    }

    public void setEventInfo(String str) {
        this.event_info = str;
    }

    public EventNetType setEventNetType() {
        return this.event_net_type;
    }

    public void setEventSampleIntervals(String str) {
        this.event_sample_intervals = str;
    }

    public void setHeadSwitch(long j2) {
        this.head_switch = j2;
    }

    public void setIpcSessionId(String str) {
        this.ipcSessionId = str;
    }

    public void setIsRealtime(boolean z) {
        this.is_realtime = z;
    }

    public void setOuid(String str) {
        this.ouid = str;
    }

    public void setSeqNumber(long j2) {
        this.seqNumber = j2;
    }

    public void setTackInfoId(String str) {
        this.tackInfoId = str;
    }

    public void setTrackType(int i) {
        this.track_type = i;
    }

    public void setUploadType(int i) {
        this.upload_type = i;
    }

    public String toString() {
        return "TrackBean{appId='" + this.appId + "'event_group='" + this.event_group + "', event_id='" + this.event_id + "', event_time=" + this.event_time + ", event_info='" + this.event_info + "', event_time_type=" + this.event_time_type + ", event_net_type=" + this.event_net_type + ", event_access='" + this.event_access + "', session_id='" + this.session_id + "', sequence_id='" + this.sequence_id + "', head_switch=" + this.head_switch + ", track_type=" + this.track_type + ", is_realtime=" + this.is_realtime + ", upload_type=" + this.upload_type + ", data_type=" + this.data_type + ", event_sample_intervals='" + this.event_sample_intervals + "', event_cache_status=" + this.event_cache_status + '}';
    }

    public void setEventNetType(EventNetType eventNetType) {
        this.event_net_type = eventNetType;
    }

    public TrackBean(long j2, String str, String str2, long j3, String str3, int i, int i2, long j4) {
        this.event_net_type = EventNetType.NET_TYPE_ALL_NET;
        this.event_access = NetworkUtils.j();
        this.session_id = xvg.a();
        this.sequence_id = UUID.randomUUID().toString();
        this.event_sample_intervals = EventRuleEntity.DEFAULT_SAMPLING_INTERVAL;
        this.event_cache_status = 0;
        this.seqNumber = -1L;
        this.ipcSessionId = UUID.randomUUID().toString();
        this.event_group = str;
        this.event_id = str2;
        this.event_time = j3;
        this.event_info = str3;
        this.event_time_type = i;
        this.event_cache_status = i2;
        this.seqNumber = j4;
    }
}
