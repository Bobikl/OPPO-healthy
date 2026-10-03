package com.oppo.obus.common.configmetadata.core.entity.common;

import com.oppo.obus.common.configmetadata.core.concept.entity.ConfigFacade;
import com.oppo.obus.common.protobuf.ProtobufSerializable;

/* JADX INFO: loaded from: classes9.dex */
public class CommonConfigFacade implements ConfigFacade, ProtobufSerializable {
    private static final long serialVersionUID = -7031554678022464214L;
    private MinCommonConfig common;

    public CommonConfigFacade() {
    }

    public CommonConfigFacade(MinCommonConfig minCommonConfig) {
        this.common = minCommonConfig;
    }

    public boolean canEqual(Object obj) {
        return obj instanceof CommonConfigFacade;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CommonConfigFacade)) {
            return false;
        }
        CommonConfigFacade commonConfigFacade = (CommonConfigFacade) obj;
        if (!commonConfigFacade.canEqual(this)) {
            return false;
        }
        MinCommonConfig common = getCommon();
        MinCommonConfig common2 = commonConfigFacade.getCommon();
        return common != null ? common.equals(common2) : common2 == null;
    }

    public MinCommonConfig getCommon() {
        return this.common;
    }

    public int hashCode() {
        MinCommonConfig common = getCommon();
        return 59 + (common == null ? 43 : common.hashCode());
    }

    public CommonConfigFacade setCommon(MinCommonConfig minCommonConfig) {
        this.common = minCommonConfig;
        return this;
    }

    public String toString() {
        return "CommonConfigFacade(common=" + getCommon() + ")";
    }
}
