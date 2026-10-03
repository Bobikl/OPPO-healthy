package com.oplus.aiunit.vision;

import com.heytap.device.data.sporthealth.pull.fetcher.h;
import com.heytap.health.protocol.fitness.FitnessProto;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes15.dex */
public abstract class s2k extends h {
    public int n = -1;
    public int o = -1;

    public void A(int i) {
        this.o = i;
    }

    public void B(int i) {
        this.n = i;
    }

    public FitnessProto.TimeRangeRequest z(int i) {
        if (this.n == -1) {
            this.n = qx4.e(i, this.f, this.g);
        }
        if (this.o == -1) {
            this.o = (int) (System.currentTimeMillis() / 1000);
        }
        return FitnessProto.TimeRangeRequest.newBuilder().setStartTimestamp(this.n).setEndTimestamp(this.o).build();
    }
}