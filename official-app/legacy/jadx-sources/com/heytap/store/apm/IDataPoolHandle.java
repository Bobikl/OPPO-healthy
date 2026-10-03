package com.heytap.store.apm;

import com.heytap.store.apm.Net.data.NetworkFeedBean;
import com.heytap.store.apm.Net.data.NetworkTraceBean;
import java.util.HashMap;

/* JADX INFO: loaded from: classes19.dex */
public interface IDataPoolHandle {
    void addNetworkFeedData(String str, NetworkFeedBean networkFeedBean);

    void clearDataPool();

    HashMap<String, NetworkFeedBean> getNetworkFeedMap();

    NetworkFeedBean getNetworkFeedModel(String str);

    NetworkTraceBean getNetworkTraceModel(String str);

    PageTrackBean getPageTrackModel(String str);

    void initDataPool();

    void removeTrackModel(String str);

    void removedTraceData(String str);
}
