package com.oppo.obus.common.configmetadata.core.entity;

import com.oppo.obus.common.configmetadata.core.concept.entity.ConfigFacade;
import com.oppo.obus.common.configmetadata.core.entity.common.MinCommonConfig;
import com.oppo.obus.common.configmetadata.core.entity.event.MinAppEventConfig;
import com.oppo.obus.common.configmetadata.core.entity.host.MinHostConfig;
import com.oppo.obus.common.configmetadata.core.entity.sample.MinAppSampleConfig;
import com.oppo.obus.common.protobuf.ProtobufSerializable;
import io.protostuff.Tag;
import java.util.List;

/* JADX INFO: loaded from: classes9.dex */
public class AreaConfig implements ConfigFacade, ProtobufSerializable {
    private static final long serialVersionUID = 4953805320823373984L;

    @Tag(1)
    private MinCommonConfig common;

    @Tag(3)
    private List<MinAppEventConfig> event;

    @Tag(2)
    private MinHostConfig host;

    @Tag(4)
    private List<MinAppSampleConfig> sample;

    public AreaConfig() {
    }

    public AreaConfig(MinCommonConfig minCommonConfig, MinHostConfig minHostConfig, List<MinAppEventConfig> list, List<MinAppSampleConfig> list2) {
        this.common = minCommonConfig;
        this.host = minHostConfig;
        this.event = list;
        this.sample = list2;
    }

    public boolean canEqual(Object obj) {
        return obj instanceof AreaConfig;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AreaConfig)) {
            return false;
        }
        AreaConfig areaConfig = (AreaConfig) obj;
        if (!areaConfig.canEqual(this)) {
            return false;
        }
        MinCommonConfig common = getCommon();
        MinCommonConfig common2 = areaConfig.getCommon();
        if (common != null ? !common.equals(common2) : common2 != null) {
            return false;
        }
        MinHostConfig host = getHost();
        MinHostConfig host2 = areaConfig.getHost();
        if (host != null ? !host.equals(host2) : host2 != null) {
            return false;
        }
        List<MinAppEventConfig> event = getEvent();
        List<MinAppEventConfig> event2 = areaConfig.getEvent();
        if (event != null ? !event.equals(event2) : event2 != null) {
            return false;
        }
        List<MinAppSampleConfig> sample = getSample();
        List<MinAppSampleConfig> sample2 = areaConfig.getSample();
        return sample != null ? sample.equals(sample2) : sample2 == null;
    }

    public MinCommonConfig getCommon() {
        return this.common;
    }

    public List<MinAppEventConfig> getEvent() {
        return this.event;
    }

    public MinHostConfig getHost() {
        return this.host;
    }

    public List<MinAppSampleConfig> getSample() {
        return this.sample;
    }

    public int hashCode() {
        MinCommonConfig common = getCommon();
        int iHashCode = common == null ? 43 : common.hashCode();
        MinHostConfig host = getHost();
        int iHashCode2 = ((iHashCode + 59) * 59) + (host == null ? 43 : host.hashCode());
        List<MinAppEventConfig> event = getEvent();
        int i = iHashCode2 * 59;
        int iHashCode3 = event == null ? 43 : event.hashCode();
        List<MinAppSampleConfig> sample = getSample();
        return ((i + iHashCode3) * 59) + (sample != null ? sample.hashCode() : 43);
    }

    public AreaConfig setCommon(MinCommonConfig minCommonConfig) {
        this.common = minCommonConfig;
        return this;
    }

    public AreaConfig setEvent(List<MinAppEventConfig> list) {
        this.event = list;
        return this;
    }

    public AreaConfig setHost(MinHostConfig minHostConfig) {
        this.host = minHostConfig;
        return this;
    }

    public AreaConfig setSample(List<MinAppSampleConfig> list) {
        this.sample = list;
        return this;
    }

    public String toString() {
        return "AreaConfig(common=" + getCommon() + ", host=" + getHost() + ", event=" + getEvent() + ", sample=" + getSample() + ")";
    }
}
