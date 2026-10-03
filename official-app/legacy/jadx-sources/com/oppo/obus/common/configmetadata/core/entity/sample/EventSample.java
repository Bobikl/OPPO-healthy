package com.oppo.obus.common.configmetadata.core.entity.sample;

import com.google.gson.annotations.SerializedName;
import com.oplus.aiunit.vision.vja;
import io.protostuff.Tag;
import java.io.Serializable;
import java.util.List;

/* JADX INFO: loaded from: classes9.dex */
public class EventSample implements Serializable {
    private static final long serialVersionUID = -4884414888516373559L;

    @SerializedName(alternate = {"c"}, value = "codes")
    @vja({"c"})
    @Tag(1)
    private List<Integer> codes;

    public EventSample() {
    }

    public EventSample(List<Integer> list) {
        this.codes = list;
    }

    public boolean canEqual(Object obj) {
        return obj instanceof EventSample;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof EventSample)) {
            return false;
        }
        EventSample eventSample = (EventSample) obj;
        if (!eventSample.canEqual(this)) {
            return false;
        }
        List<Integer> codes = getCodes();
        List<Integer> codes2 = eventSample.getCodes();
        return codes != null ? codes.equals(codes2) : codes2 == null;
    }

    public List<Integer> getCodes() {
        return this.codes;
    }

    public int hashCode() {
        List<Integer> codes = getCodes();
        return 59 + (codes == null ? 43 : codes.hashCode());
    }

    @vja({"c"})
    public EventSample setCodes(List<Integer> list) {
        this.codes = list;
        return this;
    }

    public String toString() {
        return "EventSample(codes=" + getCodes() + ")";
    }
}
