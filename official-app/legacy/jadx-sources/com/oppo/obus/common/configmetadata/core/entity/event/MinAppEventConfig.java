package com.oppo.obus.common.configmetadata.core.entity.event;

import io.protostuff.Tag;
import java.io.Serializable;
import java.util.List;

/* JADX INFO: loaded from: classes9.dex */
public class MinAppEventConfig implements Serializable {
    private static final long serialVersionUID = -942906039671257136L;

    @Tag(1)
    private String appId;

    @Tag(4)
    private List<EventInfo> events;

    @Tag(3)
    private List<String> packages;

    @Tag(2)
    private Integer v;

    public MinAppEventConfig() {
    }

    public MinAppEventConfig(String str, Integer num, List<String> list, List<EventInfo> list2) {
        this.appId = str;
        this.v = num;
        this.packages = list;
        this.events = list2;
    }

    public boolean canEqual(Object obj) {
        return obj instanceof MinAppEventConfig;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof MinAppEventConfig)) {
            return false;
        }
        MinAppEventConfig minAppEventConfig = (MinAppEventConfig) obj;
        if (!minAppEventConfig.canEqual(this)) {
            return false;
        }
        Integer v = getV();
        Integer v2 = minAppEventConfig.getV();
        if (v != null ? !v.equals(v2) : v2 != null) {
            return false;
        }
        String appId = getAppId();
        String appId2 = minAppEventConfig.getAppId();
        if (appId != null ? !appId.equals(appId2) : appId2 != null) {
            return false;
        }
        List<String> packages = getPackages();
        List<String> packages2 = minAppEventConfig.getPackages();
        if (packages != null ? !packages.equals(packages2) : packages2 != null) {
            return false;
        }
        List<EventInfo> events = getEvents();
        List<EventInfo> events2 = minAppEventConfig.getEvents();
        return events != null ? events.equals(events2) : events2 == null;
    }

    public String getAppId() {
        return this.appId;
    }

    public List<EventInfo> getEvents() {
        return this.events;
    }

    public List<String> getPackages() {
        return this.packages;
    }

    public Integer getV() {
        return this.v;
    }

    public int hashCode() {
        Integer v = getV();
        int iHashCode = v == null ? 43 : v.hashCode();
        String appId = getAppId();
        int iHashCode2 = ((iHashCode + 59) * 59) + (appId == null ? 43 : appId.hashCode());
        List<String> packages = getPackages();
        int i = iHashCode2 * 59;
        int iHashCode3 = packages == null ? 43 : packages.hashCode();
        List<EventInfo> events = getEvents();
        return ((i + iHashCode3) * 59) + (events != null ? events.hashCode() : 43);
    }

    public MinAppEventConfig setAppId(String str) {
        this.appId = str;
        return this;
    }

    public MinAppEventConfig setEvents(List<EventInfo> list) {
        this.events = list;
        return this;
    }

    public MinAppEventConfig setPackages(List<String> list) {
        this.packages = list;
        return this;
    }

    public MinAppEventConfig setV(Integer num) {
        this.v = num;
        return this;
    }

    public String toString() {
        return "MinAppEventConfig(appId=" + getAppId() + ", v=" + getV() + ", packages=" + getPackages() + ", events=" + getEvents() + ")";
    }
}
