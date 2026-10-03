package com.oppo.obus.common.report.core.entity.v32;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.gson.annotations.SerializedName;
import io.protostuff.Tag;
import java.util.Map;

/* JADX INFO: loaded from: classes9.dex */
public class DataItem {

    @SerializedName("body")
    @JsonProperty("body")
    @Tag(3)
    private Body body;

    @SerializedName("$custom_client_id")
    @JsonProperty("$custom_client_id")
    @Tag(1)
    private String customClientId;

    @SerializedName("$custom_head")
    @JsonProperty("$custom_head")
    @Tag(2)
    private Map<String, Object> customHead;

    public DataItem() {
    }

    public DataItem(String str, Map<String, Object> map, Body body) {
        this.customClientId = str;
        this.customHead = map;
        this.body = body;
    }

    public boolean canEqual(Object obj) {
        return obj instanceof DataItem;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof DataItem)) {
            return false;
        }
        DataItem dataItem = (DataItem) obj;
        if (!dataItem.canEqual(this)) {
            return false;
        }
        String customClientId = getCustomClientId();
        String customClientId2 = dataItem.getCustomClientId();
        if (customClientId != null ? !customClientId.equals(customClientId2) : customClientId2 != null) {
            return false;
        }
        Map<String, Object> customHead = getCustomHead();
        Map<String, Object> customHead2 = dataItem.getCustomHead();
        if (customHead != null ? !customHead.equals(customHead2) : customHead2 != null) {
            return false;
        }
        Body body = getBody();
        Body body2 = dataItem.getBody();
        return body != null ? body.equals(body2) : body2 == null;
    }

    public Body getBody() {
        return this.body;
    }

    public String getCustomClientId() {
        return this.customClientId;
    }

    public Map<String, Object> getCustomHead() {
        return this.customHead;
    }

    public int hashCode() {
        String customClientId = getCustomClientId();
        int iHashCode = customClientId == null ? 43 : customClientId.hashCode();
        Map<String, Object> customHead = getCustomHead();
        int i = (iHashCode + 59) * 59;
        int iHashCode2 = customHead == null ? 43 : customHead.hashCode();
        Body body = getBody();
        return ((i + iHashCode2) * 59) + (body != null ? body.hashCode() : 43);
    }

    @JsonProperty("body")
    public DataItem setBody(Body body) {
        this.body = body;
        return this;
    }

    @JsonProperty("$custom_client_id")
    public DataItem setCustomClientId(String str) {
        this.customClientId = str;
        return this;
    }

    @JsonProperty("$custom_head")
    public DataItem setCustomHead(Map<String, Object> map) {
        this.customHead = map;
        return this;
    }

    public String toString() {
        return "DataItem(customClientId=" + getCustomClientId() + ", customHead=" + getCustomHead() + ", body=" + getBody() + ")";
    }
}
