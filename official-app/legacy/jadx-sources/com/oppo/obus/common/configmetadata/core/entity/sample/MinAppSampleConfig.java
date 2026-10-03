package com.oppo.obus.common.configmetadata.core.entity.sample;

import com.google.gson.annotations.SerializedName;
import com.oplus.aiunit.vision.vja;
import com.oplus.drs.core.config.entity.DebugModeEntity;
import com.sensorsdata.analytics.android.sdk.data.adapter.DbParams;
import io.protostuff.MapSchema;
import io.protostuff.Tag;
import java.io.Serializable;
import java.util.Map;

/* JADX INFO: loaded from: classes9.dex */
public class MinAppSampleConfig implements Serializable {
    private static final long serialVersionUID = 4977155955973213725L;

    @SerializedName(alternate = {"a"}, value = "appId")
    @vja({"a"})
    @Tag(1)
    private String appId;

    @SerializedName(alternate = {MapSchema.FIELD_NAME_ENTRY}, value = DbParams.TABLE_EVENTS)
    @vja({MapSchema.FIELD_NAME_ENTRY})
    @Tag(4)
    private Map<Integer, EventSample> events;

    @SerializedName(alternate = {"s"}, value = DebugModeEntity.KEY_SAMPLE)
    @vja({"s"})
    @Tag(3)
    private Long sample;

    @Tag(2)
    private Integer v;

    public MinAppSampleConfig() {
    }

    public MinAppSampleConfig(String str, Integer num, Long l2, Map<Integer, EventSample> map) {
        this.appId = str;
        this.v = num;
        this.sample = l2;
        this.events = map;
    }

    public boolean canEqual(Object obj) {
        return obj instanceof MinAppSampleConfig;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof MinAppSampleConfig)) {
            return false;
        }
        MinAppSampleConfig minAppSampleConfig = (MinAppSampleConfig) obj;
        if (!minAppSampleConfig.canEqual(this)) {
            return false;
        }
        Integer v = getV();
        Integer v2 = minAppSampleConfig.getV();
        if (v != null ? !v.equals(v2) : v2 != null) {
            return false;
        }
        Long sample = getSample();
        Long sample2 = minAppSampleConfig.getSample();
        if (sample != null ? !sample.equals(sample2) : sample2 != null) {
            return false;
        }
        String appId = getAppId();
        String appId2 = minAppSampleConfig.getAppId();
        if (appId != null ? !appId.equals(appId2) : appId2 != null) {
            return false;
        }
        Map<Integer, EventSample> events = getEvents();
        Map<Integer, EventSample> events2 = minAppSampleConfig.getEvents();
        return events != null ? events.equals(events2) : events2 == null;
    }

    public String getAppId() {
        return this.appId;
    }

    public Map<Integer, EventSample> getEvents() {
        return this.events;
    }

    public Long getSample() {
        return this.sample;
    }

    public Integer getV() {
        return this.v;
    }

    public int hashCode() {
        Integer v = getV();
        int iHashCode = v == null ? 43 : v.hashCode();
        Long sample = getSample();
        int iHashCode2 = ((iHashCode + 59) * 59) + (sample == null ? 43 : sample.hashCode());
        String appId = getAppId();
        int i = iHashCode2 * 59;
        int iHashCode3 = appId == null ? 43 : appId.hashCode();
        Map<Integer, EventSample> events = getEvents();
        return ((i + iHashCode3) * 59) + (events != null ? events.hashCode() : 43);
    }

    @vja({"a"})
    public MinAppSampleConfig setAppId(String str) {
        this.appId = str;
        return this;
    }

    @vja({MapSchema.FIELD_NAME_ENTRY})
    public MinAppSampleConfig setEvents(Map<Integer, EventSample> map) {
        this.events = map;
        return this;
    }

    @vja({"s"})
    public MinAppSampleConfig setSample(Long l2) {
        this.sample = l2;
        return this;
    }

    public MinAppSampleConfig setV(Integer num) {
        this.v = num;
        return this;
    }

    public String toString() {
        return "MinAppSampleConfig(appId=" + getAppId() + ", v=" + getV() + ", sample=" + getSample() + ", events=" + getEvents() + ")";
    }
}
