package com.oplus.deepthinker.sdk.app.aidl.proton.deepsleep;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public class DeepSleepPredictResultWithPercentile {
    private List<DeepSleepClusterWithPercentile> mDeepSleepClusterWithPercentiles;

    public DeepSleepPredictResultWithPercentile(List<DeepSleepClusterWithPercentile> list) {
        this.mDeepSleepClusterWithPercentiles = list;
    }

    public List<DeepSleepClusterWithPercentile> getDeepSleepClusterWithPercentiles() {
        return this.mDeepSleepClusterWithPercentiles;
    }

    public void setDeepSleepClusterWithPercentiles(List<DeepSleepClusterWithPercentile> list) {
        this.mDeepSleepClusterWithPercentiles = list;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("DeepSleepPredictResultWithPercentile:");
        List<DeepSleepClusterWithPercentile> list = this.mDeepSleepClusterWithPercentiles;
        if (list != null && list.size() > 0) {
            for (DeepSleepClusterWithPercentile deepSleepClusterWithPercentile : this.mDeepSleepClusterWithPercentiles) {
                if (deepSleepClusterWithPercentile != null) {
                    sb.append(deepSleepClusterWithPercentile);
                }
            }
        }
        return sb.toString();
    }

    public DeepSleepPredictResultWithPercentile() {
        this(new ArrayList());
    }
}
