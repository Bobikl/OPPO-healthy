package com.oplus.aiunit.vision;

import androidx.annotation.NonNull;
import com.heytap.health.base.cache.model.DataModel;

/* JADX INFO: loaded from: classes15.dex */
public abstract class g3<REQUEST, RESPONSE> {
    public static final String TAG = "BaseAsyncCacheLoader";
    private t3<RESPONSE> mDataCache;
    protected REQUEST mRequest;

    public g3() {
        t3<RESPONSE> dataCache = getDataCache();
        this.mDataCache = dataCache;
        if (dataCache == null) {
            throw new RuntimeException("DataCache must setInstance.");
        }
    }

    private void clearCache(String str) {
        putCache(str, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: emitCacheOnNext, reason: merged with bridge method [inline-methods] */
    public void lambda$getCacheObs$0(String str, DataModel<RESPONSE> dataModel, ccd<RESPONSE> ccdVar) {
        try {
            ccdVar.onNext(dataModel.getData());
        } catch (Exception e2) {
            a7b.m(TAG, "[emitCacheOnNext] exception " + e2.getMessage());
            clearCache(str);
            ccdVar.onError(new Exception("emitCacheOnNext cache exception."));
        }
    }

    private lbd<RESPONSE> getAsyncObs(REQUEST request, String str) {
        StringBuilder sb = new StringBuilder();
        sb.append("[getAsyncObs] request ");
        sb.append(request);
        sb.append(",cacheKey ");
        sb.append(str);
        return getSource(request).L0(su8.c()).n0(su8.c()).J(refreshCache(str));
    }

    private DataModel<RESPONSE> getCache(String str) {
        return (DataModel) this.mDataCache.get(str);
    }

    private lbd<RESPONSE> getCacheObs(final REQUEST request, final String str, final DataModel<RESPONSE> dataModel) {
        StringBuilder sb = new StringBuilder();
        sb.append("[getCacheObs] request ");
        sb.append(request);
        sb.append(",cacheKey ");
        sb.append(str);
        sb.append(",cacheValue ");
        sb.append(dataModel);
        return lbd.w(new bdd() { // from class: com.oplus.aiunit.vision.e3
            @Override // com.oplus.aiunit.vision.bdd
            public final void a(ccd ccdVar) throws Throwable {
                this.a.lambda$getCacheObs$0(str, dataModel, ccdVar);
            }
        }).L0(su8.c()).n0(su8.c()).J(new o14() { // from class: com.oplus.aiunit.vision.f3
            @Override // com.oplus.aiunit.vision.o14
            public final void accept(Object obj) throws Throwable {
                this.i.lambda$getCacheObs$1(request, str, obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ void lambda$getCacheObs$1(Object obj, String str, Object obj2) throws Throwable {
        getAsyncObs(obj, str).c();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$refreshCache$2(String str, Object obj) throws Throwable {
        try {
            putCache(str, new DataModel<>(System.currentTimeMillis(), obj));
            onCacheComplete();
        } catch (Exception e2) {
            a7b.m(TAG, "[refreshCache] exception " + e2.getMessage());
            clearCache(str);
        }
    }

    private void putCache(String str, DataModel<RESPONSE> dataModel) {
        this.mDataCache.a(str, dataModel);
    }

    @NonNull
    private o14<RESPONSE> refreshCache(final String str) {
        return new o14() { // from class: com.oplus.aiunit.vision.d3
            @Override // com.oplus.aiunit.vision.o14
            public final void accept(Object obj) throws Throwable {
                this.i.lambda$refreshCache$2(str, obj);
            }
        };
    }

    public abstract String getCacheKey();

    public abstract t3<RESPONSE> getDataCache();

    public abstract lbd<RESPONSE> getSource(REQUEST request);

    public boolean isUseCache(String str, DataModel<RESPONSE> dataModel) {
        return dataModel != null;
    }

    public void onCacheComplete() {
    }

    public void setRequest(REQUEST request) {
        this.mRequest = request;
    }

    public lbd<RESPONSE> start() {
        String cacheKey = getCacheKey();
        DataModel<RESPONSE> cache = getCache(cacheKey);
        StringBuilder sb = new StringBuilder();
        sb.append("[start] cacheKey ");
        sb.append(cacheKey);
        sb.append("cacheValue ");
        sb.append(cache);
        return isUseCache(cacheKey, cache) ? getCacheObs(this.mRequest, cacheKey, cache) : getAsyncObs(this.mRequest, cacheKey);
    }
}
