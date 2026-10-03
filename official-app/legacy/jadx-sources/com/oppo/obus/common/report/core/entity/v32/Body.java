package com.oppo.obus.common.report.core.entity.v32;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.gson.annotations.SerializedName;
import io.protostuff.Tag;
import java.util.Map;

/* JADX INFO: loaded from: classes9.dex */
public class Body {

    @SerializedName("$event_access")
    @JsonProperty("$event_access")
    @Tag(5)
    private String eventAccess;

    @SerializedName("$event_code")
    @JsonProperty("$event_code")
    @Tag(8)
    private Integer eventCode;

    @SerializedName("$event_count")
    @JsonProperty("$event_count")
    @Tag(4)
    private long eventCount;

    @SerializedName("$event_group")
    @JsonProperty("$event_group")
    @Tag(9)
    private String eventGroup;

    @SerializedName("$event_id")
    @JsonProperty("$event_id")
    @Tag(10)
    private String eventId;

    @SerializedName("$event_info")
    @JsonProperty("$event_info")
    @Tag(7)
    private Map<String, Object> eventInfo;

    @SerializedName("$event_time")
    @JsonProperty("$event_time")
    @Tag(3)
    private long eventTime;

    @SerializedName("$event_time_type")
    @JsonProperty("$event_time_type")
    @Tag(2)
    private int eventTimeType;

    @SerializedName("$sequence_id")
    @JsonProperty("$sequence_id")
    @Tag(1)
    private String sequenceId;

    @SerializedName("$session_id")
    @JsonProperty("$session_id")
    @Tag(6)
    private String sessionId;

    public Body() {
    }

    public Body(String str, int i, long j2, long j3, String str2, String str3, Map<String, Object> map, Integer num, String str4, String str5) {
        this.sequenceId = str;
        this.eventTimeType = i;
        this.eventTime = j2;
        this.eventCount = j3;
        this.eventAccess = str2;
        this.sessionId = str3;
        this.eventInfo = map;
        this.eventCode = num;
        this.eventGroup = str4;
        this.eventId = str5;
    }

    public boolean canEqual(Object obj) {
        return obj instanceof Body;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Body)) {
            return false;
        }
        Body body = (Body) obj;
        if (!body.canEqual(this) || getEventTimeType() != body.getEventTimeType() || getEventTime() != body.getEventTime() || getEventCount() != body.getEventCount()) {
            return false;
        }
        Integer eventCode = getEventCode();
        Integer eventCode2 = body.getEventCode();
        if (eventCode != null ? !eventCode.equals(eventCode2) : eventCode2 != null) {
            return false;
        }
        String sequenceId = getSequenceId();
        String sequenceId2 = body.getSequenceId();
        if (sequenceId != null ? !sequenceId.equals(sequenceId2) : sequenceId2 != null) {
            return false;
        }
        String eventAccess = getEventAccess();
        String eventAccess2 = body.getEventAccess();
        if (eventAccess != null ? !eventAccess.equals(eventAccess2) : eventAccess2 != null) {
            return false;
        }
        String sessionId = getSessionId();
        String sessionId2 = body.getSessionId();
        if (sessionId != null ? !sessionId.equals(sessionId2) : sessionId2 != null) {
            return false;
        }
        Map<String, Object> eventInfo = getEventInfo();
        Map<String, Object> eventInfo2 = body.getEventInfo();
        if (eventInfo != null ? !eventInfo.equals(eventInfo2) : eventInfo2 != null) {
            return false;
        }
        String eventGroup = getEventGroup();
        String eventGroup2 = body.getEventGroup();
        if (eventGroup != null ? !eventGroup.equals(eventGroup2) : eventGroup2 != null) {
            return false;
        }
        String eventId = getEventId();
        String eventId2 = body.getEventId();
        return eventId != null ? eventId.equals(eventId2) : eventId2 == null;
    }

    public String getEventAccess() {
        return this.eventAccess;
    }

    public Integer getEventCode() {
        return this.eventCode;
    }

    public long getEventCount() {
        return this.eventCount;
    }

    public String getEventGroup() {
        return this.eventGroup;
    }

    public String getEventId() {
        return this.eventId;
    }

    public Map<String, Object> getEventInfo() {
        return this.eventInfo;
    }

    public long getEventTime() {
        return this.eventTime;
    }

    public int getEventTimeType() {
        return this.eventTimeType;
    }

    public String getSequenceId() {
        return this.sequenceId;
    }

    public String getSessionId() {
        return this.sessionId;
    }

    public int hashCode() {
        int eventTimeType = getEventTimeType() + 59;
        long eventTime = getEventTime();
        int i = (eventTimeType * 59) + ((int) (eventTime ^ (eventTime >>> 32)));
        long eventCount = getEventCount();
        int i2 = (i * 59) + ((int) (eventCount ^ (eventCount >>> 32)));
        Integer eventCode = getEventCode();
        int iHashCode = (i2 * 59) + (eventCode == null ? 43 : eventCode.hashCode());
        String sequenceId = getSequenceId();
        int iHashCode2 = (iHashCode * 59) + (sequenceId == null ? 43 : sequenceId.hashCode());
        String eventAccess = getEventAccess();
        int iHashCode3 = (iHashCode2 * 59) + (eventAccess == null ? 43 : eventAccess.hashCode());
        String sessionId = getSessionId();
        int iHashCode4 = (iHashCode3 * 59) + (sessionId == null ? 43 : sessionId.hashCode());
        Map<String, Object> eventInfo = getEventInfo();
        int iHashCode5 = (iHashCode4 * 59) + (eventInfo == null ? 43 : eventInfo.hashCode());
        String eventGroup = getEventGroup();
        int i3 = iHashCode5 * 59;
        int iHashCode6 = eventGroup == null ? 43 : eventGroup.hashCode();
        String eventId = getEventId();
        return ((i3 + iHashCode6) * 59) + (eventId != null ? eventId.hashCode() : 43);
    }

    @JsonProperty("$event_access")
    public Body setEventAccess(String str) {
        this.eventAccess = str;
        return this;
    }

    @JsonProperty("$event_code")
    public Body setEventCode(Integer num) {
        this.eventCode = num;
        return this;
    }

    @JsonProperty("$event_count")
    public Body setEventCount(long j2) {
        this.eventCount = j2;
        return this;
    }

    @JsonProperty("$event_group")
    public Body setEventGroup(String str) {
        this.eventGroup = str;
        return this;
    }

    @JsonProperty("$event_id")
    public Body setEventId(String str) {
        this.eventId = str;
        return this;
    }

    @JsonProperty("$event_info")
    public Body setEventInfo(Map<String, Object> map) {
        this.eventInfo = map;
        return this;
    }

    @JsonProperty("$event_time")
    public Body setEventTime(long j2) {
        this.eventTime = j2;
        return this;
    }

    @JsonProperty("$event_time_type")
    public Body setEventTimeType(int i) {
        this.eventTimeType = i;
        return this;
    }

    @JsonProperty("$sequence_id")
    public Body setSequenceId(String str) {
        this.sequenceId = str;
        return this;
    }

    @JsonProperty("$session_id")
    public Body setSessionId(String str) {
        this.sessionId = str;
        return this;
    }

    public String toString() {
        return "Body(sequenceId=" + getSequenceId() + ", eventTimeType=" + getEventTimeType() + ", eventTime=" + getEventTime() + ", eventCount=" + getEventCount() + ", eventAccess=" + getEventAccess() + ", sessionId=" + getSessionId() + ", eventInfo=" + getEventInfo() + ", eventCode=" + getEventCode() + ", eventGroup=" + getEventGroup() + ", eventId=" + getEventId() + ")";
    }
}
