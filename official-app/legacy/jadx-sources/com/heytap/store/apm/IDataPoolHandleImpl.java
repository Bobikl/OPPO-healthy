package com.heytap.store.apm;

import android.util.Log;
import com.heytap.store.apm.Net.data.NetworkFeedBean;
import com.heytap.store.apm.Net.data.NetworkTraceBean;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes19.dex */
public class IDataPoolHandleImpl implements IDataPoolHandle {
    private static IDataPoolHandleImpl sDataPoolImpl;
    private HashMap<String, NetworkFeedBean> mNetworkFeedMap;
    private Map<String, PageTrackBean> mPageTrackMap;
    private Map<String, NetworkTraceBean> mTraceModelMap;
    private Map<String, String> mUrlRequestIdMap = new HashMap();
    private AtomicInteger mNextRequestId = new AtomicInteger(0);

    private IDataPoolHandleImpl() {
        initDataPool();
    }

    public static IDataPoolHandleImpl getInstance() {
        if (sDataPoolImpl == null) {
            sDataPoolImpl = new IDataPoolHandleImpl();
        }
        return sDataPoolImpl;
    }

    @Override // com.heytap.store.apm.IDataPoolHandle
    public void addNetworkFeedData(String str, NetworkFeedBean networkFeedBean) {
        if (this.mNetworkFeedMap == null) {
            initDataPool();
        }
        this.mNetworkFeedMap.put(str, networkFeedBean);
    }

    @Override // com.heytap.store.apm.IDataPoolHandle
    public void clearDataPool() {
        HashMap<String, NetworkFeedBean> map = this.mNetworkFeedMap;
        if (map != null) {
            map.clear();
        }
    }

    @Override // com.heytap.store.apm.IDataPoolHandle
    public HashMap<String, NetworkFeedBean> getNetworkFeedMap() {
        return this.mNetworkFeedMap;
    }

    @Override // com.heytap.store.apm.IDataPoolHandle
    public NetworkFeedBean getNetworkFeedModel(String str) {
        if (this.mNetworkFeedMap == null) {
            initDataPool();
        }
        Log.d("frytest", "集成大小 ：" + this.mNetworkFeedMap.size() + "--requestId:" + str);
        NetworkFeedBean networkFeedBean = this.mNetworkFeedMap.get(str);
        if (networkFeedBean == null) {
            networkFeedBean = new NetworkFeedBean();
            networkFeedBean.setRequestId(str);
            networkFeedBean.setCreateTime(System.currentTimeMillis());
            this.mNetworkFeedMap.put(str, networkFeedBean);
        }
        Log.d("frytest", "keyset ：" + this.mNetworkFeedMap.keySet());
        return networkFeedBean;
    }

    @Override // com.heytap.store.apm.IDataPoolHandle
    public NetworkTraceBean getNetworkTraceModel(String str) {
        if (this.mTraceModelMap == null) {
            this.mTraceModelMap = new HashMap();
        }
        if (this.mTraceModelMap.containsKey(str)) {
            return this.mTraceModelMap.get(str);
        }
        NetworkTraceBean networkTraceBean = new NetworkTraceBean();
        networkTraceBean.setId(str);
        networkTraceBean.setTime(System.currentTimeMillis());
        this.mTraceModelMap.put(str, networkTraceBean);
        return networkTraceBean;
    }

    @Override // com.heytap.store.apm.IDataPoolHandle
    public PageTrackBean getPageTrackModel(String str) {
        if (this.mPageTrackMap == null) {
            this.mPageTrackMap = new HashMap();
        }
        if (this.mPageTrackMap.containsKey(str)) {
            return this.mPageTrackMap.get(str);
        }
        PageTrackBean pageTrackBean = new PageTrackBean(str);
        this.mPageTrackMap.put(str, pageTrackBean);
        return pageTrackBean;
    }

    public String getRequestId(String str) {
        String str2 = this.mUrlRequestIdMap.get(str);
        if (str2 != null) {
            return str2;
        }
        String strValueOf = String.valueOf(this.mNextRequestId.getAndIncrement());
        this.mUrlRequestIdMap.put(str, strValueOf);
        return strValueOf;
    }

    public Map<String, NetworkTraceBean> getTraceModelMap() {
        return this.mTraceModelMap;
    }

    @Override // com.heytap.store.apm.IDataPoolHandle
    public void initDataPool() {
        if (this.mNetworkFeedMap == null) {
            this.mNetworkFeedMap = new HashMap<>();
        }
        this.mNetworkFeedMap.clear();
    }

    @Override // com.heytap.store.apm.IDataPoolHandle
    public void removeTrackModel(String str) {
        Map<String, PageTrackBean> map = this.mPageTrackMap;
        if (map != null) {
            PageTrackBean pageTrackBeanRemove = map.remove(str);
            if (ApmClient.logEnable) {
                Log.d("IDataPoolHandleImpl", "remove trackModel->" + pageTrackBeanRemove);
            }
        }
    }

    @Override // com.heytap.store.apm.IDataPoolHandle
    public void removedTraceData(String str) {
        HashMap<String, NetworkFeedBean> map = this.mNetworkFeedMap;
        if (map == null) {
            initDataPool();
            return;
        }
        if (map.containsKey(str)) {
            this.mNetworkFeedMap.remove(str);
        }
        if (this.mTraceModelMap.containsKey(str)) {
            this.mTraceModelMap.remove(str);
        }
    }
}
