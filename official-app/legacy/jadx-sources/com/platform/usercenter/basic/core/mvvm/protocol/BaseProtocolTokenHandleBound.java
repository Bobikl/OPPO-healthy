package com.platform.usercenter.basic.core.mvvm.protocol;

import androidx.annotation.MainThread;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.WorkerThread;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MediatorLiveData;
import androidx.lifecycle.Observer;
import com.platform.usercenter.BaseApp;
import com.platform.usercenter.basic.core.mvvm.AppExecutors;
import com.platform.usercenter.basic.core.mvvm.CoreResponse;
import com.platform.usercenter.basic.core.mvvm.Objects;
import com.platform.usercenter.basic.core.mvvm.Resource;
import com.platform.usercenter.tools.word.WordManager;

/* JADX INFO: loaded from: classes9.dex */
public abstract class BaseProtocolTokenHandleBound<ResultType, RequestType> implements ProtocolCommand<ResultType> {
    private LiveData<ResultType> resultSource;
    private final MediatorLiveData<Resource<ResultType>> result = new MediatorLiveData<>();
    private final AppExecutors appExecutors = AppExecutors.getInstance();

    @MainThread
    public BaseProtocolTokenHandleBound() {
    }

    private void fetchData() {
        this.result.setValue(Resource.start(null));
        LiveData<ResultType> liveData = this.resultSource;
        if (liveData != null) {
            this.result.removeSource(liveData);
        }
        final LiveData<ResultType> liveDataLoadFromDb = loadFromDb();
        this.result.addSource(liveDataLoadFromDb, new Observer() { // from class: com.oplus.aiunit.vision.v71
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                this.i.lambda$fetchData$1(liveDataLoadFromDb, obj);
            }
        });
    }

    private void fetchFromNetwork(final LiveData<ResultType> liveData) {
        getSecondaryToken().observeForever(new Observer() { // from class: com.oplus.aiunit.vision.a81
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                this.i.lambda$fetchFromNetwork$8(liveData, (String) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$fetchData$0(Object obj) {
        setValue(Resource.success(obj));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ void lambda$fetchData$1(LiveData liveData, Object obj) {
        this.result.removeSource(liveData);
        if (shouldFetch(obj)) {
            fetchFromNetwork(liveData);
        } else {
            this.resultSource = liveData;
            this.result.addSource(liveData, new Observer() { // from class: com.oplus.aiunit.vision.z71
                @Override // androidx.lifecycle.Observer
                public final void onChanged(Object obj2) {
                    this.i.lambda$fetchData$0(obj2);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$fetchFromNetwork$2(Object obj) {
        setValue(Resource.loading(obj));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$fetchFromNetwork$3(Object obj) {
        setValue(Resource.success(obj));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$fetchFromNetwork$4() {
        LiveData<ResultType> liveDataLoadFromDb = loadFromDb();
        this.resultSource = liveDataLoadFromDb;
        this.result.addSource(liveDataLoadFromDb, new Observer() { // from class: com.oplus.aiunit.vision.d81
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                this.i.lambda$fetchFromNetwork$3(obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$fetchFromNetwork$5(CoreResponse coreResponse) {
        saveCallResult(processResponse(coreResponse));
        this.appExecutors.mainThread().execute(new Runnable() { // from class: com.oplus.aiunit.vision.w71
            @Override // java.lang.Runnable
            public final void run() {
                this.i.lambda$fetchFromNetwork$4();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$fetchFromNetwork$6(CoreResponse coreResponse, Object obj) {
        if (coreResponse.getError() != null) {
            setValue(Resource.error(coreResponse.getError().code, coreResponse.getError().message, null));
            return;
        }
        setValue(Resource.error(coreResponse.getCode(), WordManager.getInstance().getString(BaseApp.mContext, coreResponse.getCode(), coreResponse.getMessage()), null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$fetchFromNetwork$7(LiveData liveData, LiveData liveData2, final CoreResponse coreResponse) {
        this.result.removeSource(liveData);
        this.result.removeSource(liveData2);
        if (coreResponse.getData() != null) {
            this.appExecutors.diskIO().execute(new Runnable() { // from class: com.oplus.aiunit.vision.b81
                @Override // java.lang.Runnable
                public final void run() {
                    this.i.lambda$fetchFromNetwork$5(coreResponse);
                }
            });
            return;
        }
        onFetchFailed();
        this.resultSource = liveData2;
        this.result.addSource(liveData2, new Observer() { // from class: com.oplus.aiunit.vision.c81
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                this.i.lambda$fetchFromNetwork$6(coreResponse, obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$fetchFromNetwork$8(final LiveData liveData, String str) {
        final LiveData<CoreResponse<RequestType>> liveDataCreateCall = createCall(str);
        this.result.addSource(liveData, new Observer() { // from class: com.oplus.aiunit.vision.x71
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                this.i.lambda$fetchFromNetwork$2(obj);
            }
        });
        this.result.addSource(liveDataCreateCall, new Observer() { // from class: com.oplus.aiunit.vision.y71
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                this.i.lambda$fetchFromNetwork$7(liveDataCreateCall, liveData, (CoreResponse) obj);
            }
        });
    }

    @MainThread
    private void setValue(Resource<ResultType> resource) {
        if (Objects.equals(this.result.getValue(), resource)) {
            return;
        }
        this.result.setValue(resource);
    }

    @Override // com.platform.usercenter.basic.core.mvvm.protocol.ProtocolCommand
    public LiveData<Resource<ResultType>> asLiveData() {
        return this.result;
    }

    @NonNull
    @MainThread
    public abstract LiveData<CoreResponse<RequestType>> createCall(String str);

    @WorkerThread
    public abstract LiveData<String> getSecondaryToken();

    @Override // com.platform.usercenter.basic.core.mvvm.protocol.ProtocolCommand
    public void handle() {
        fetchData();
    }

    @NonNull
    @MainThread
    public abstract LiveData<ResultType> loadFromDb();

    public void onFetchFailed() {
    }

    @WorkerThread
    public RequestType processResponse(CoreResponse<RequestType> coreResponse) {
        return coreResponse.getData();
    }

    @WorkerThread
    public abstract void saveCallResult(@NonNull RequestType requesttype);

    @MainThread
    public abstract boolean shouldFetch(@Nullable ResultType resulttype);
}
