package com.amap.api.col.p0003sl;

import com.amap.api.maps.MapsInitializer;
import com.oplus.aiunit.vision.q3n;
import com.oplus.aiunit.vision.qdm;
import com.oplus.aiunit.vision.xsm;
import java.util.Map;

/* JADX INFO: loaded from: classes12.dex */
public abstract class l extends la {
    protected boolean isPostFlag = true;

    @Override // com.amap.api.col.p0003sl.la
    public Map<String, String> getParams() {
        return null;
    }

    public byte[] makeHttpRequest() throws ik {
        q3n q3nVarMakeHttpRequestNeedHeader = makeHttpRequestNeedHeader();
        if (q3nVarMakeHttpRequestNeedHeader != null) {
            return q3nVarMakeHttpRequestNeedHeader.a;
        }
        return null;
    }

    public q3n makeHttpRequestNeedHeader() throws ik {
        if (qdm.a != null && iu.a(qdm.a, xsm.t()).a != iu.c.SuccessCode) {
            return null;
        }
        setHttpProtocol(MapsInitializer.getProtocol() == 1 ? la.c.HTTP : la.c.HTTPS);
        m0.p();
        return this.isPostFlag ? i0.d(this) : m0.r(this);
    }

    public byte[] makeHttpRequestWithInterrupted() throws ik {
        setDegradeAbility(la.a.INTERRUPT_IO);
        return makeHttpRequest();
    }
}
