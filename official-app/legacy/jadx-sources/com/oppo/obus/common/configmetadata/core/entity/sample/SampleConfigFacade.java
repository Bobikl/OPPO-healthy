package com.oppo.obus.common.configmetadata.core.entity.sample;

import com.oppo.obus.common.configmetadata.core.concept.entity.ConfigFacade;
import com.oppo.obus.common.protobuf.ProtobufSerializable;
import java.util.List;

/* JADX INFO: loaded from: classes9.dex */
public class SampleConfigFacade implements ConfigFacade, ProtobufSerializable {
    private static final long serialVersionUID = 7043115710391199796L;
    private List<MinAppSampleConfig> sample;

    public SampleConfigFacade() {
    }

    public SampleConfigFacade(List<MinAppSampleConfig> list) {
        this.sample = list;
    }

    public boolean canEqual(Object obj) {
        return obj instanceof SampleConfigFacade;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof SampleConfigFacade)) {
            return false;
        }
        SampleConfigFacade sampleConfigFacade = (SampleConfigFacade) obj;
        if (!sampleConfigFacade.canEqual(this)) {
            return false;
        }
        List<MinAppSampleConfig> sample = getSample();
        List<MinAppSampleConfig> sample2 = sampleConfigFacade.getSample();
        return sample != null ? sample.equals(sample2) : sample2 == null;
    }

    public List<MinAppSampleConfig> getSample() {
        return this.sample;
    }

    public int hashCode() {
        List<MinAppSampleConfig> sample = getSample();
        return 59 + (sample == null ? 43 : sample.hashCode());
    }

    public SampleConfigFacade setSample(List<MinAppSampleConfig> list) {
        this.sample = list;
        return this;
    }

    public String toString() {
        return "SampleConfigFacade(sample=" + getSample() + ")";
    }
}
