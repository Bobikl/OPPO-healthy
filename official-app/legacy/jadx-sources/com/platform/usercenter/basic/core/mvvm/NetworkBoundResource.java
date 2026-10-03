package com.platform.usercenter.basic.core.mvvm;

import androidx.annotation.MainThread;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.WorkerThread;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MediatorLiveData;
import androidx.lifecycle.Observer;
import com.platform.usercenter.basic.core.mvvm.ApiResponse;

/* JADX INFO: loaded from: classes9.dex */
public abstract class NetworkBoundResource<ResultType, RequestType> {
    private LiveData<ResultType> resultSource;
    private final MediatorLiveData<Resource<ResultType>> result = new MediatorLiveData<>();
    private final AppExecutors appExecutors = AppExecutors.getInstance();

    @MainThread
    public NetworkBoundResource() {
        fetchData();
    }

    private void fetchFromNetwork(final LiveData<ResultType> liveData) {
        final LiveData<ApiResponse<RequestType>> liveDataCreateCall = createCall();
        this.result.addSource(liveData, new Observer() { // from class: com.oplus.aiunit.vision.foc
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                this.i.lambda$fetchFromNetwork$2(obj);
            }
        });
        this.result.addSource(liveDataCreateCall, new Observer() { // from class: com.oplus.aiunit.vision.goc
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                this.i.lambda$fetchFromNetwork$7(liveDataCreateCall, liveData, (ApiResponse) obj);
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
            this.result.addSource(liveData, new Observer() { // from class: com.oplus.aiunit.vision.eoc
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
        this.result.addSource(liveDataLoadFromDb, new Observer() { // from class: com.oplus.aiunit.vision.doc
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                this.i.lambda$fetchFromNetwork$3(obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$fetchFromNetwork$5(ApiResponse apiResponse) {
        saveCallResult(processResponse(apiResponse));
        this.appExecutors.mainThread().execute(new Runnable() { // from class: com.oplus.aiunit.vision.boc
            @Override // java.lang.Runnable
            public final void run() {
                this.i.lambda$fetchFromNetwork$4();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$fetchFromNetwork$6(ApiResponse apiResponse, Object obj) {
        setValue(Resource.error(apiResponse.getCode(), apiResponse.getErrorMessage(), obj));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$fetchFromNetwork$7(LiveData liveData, LiveData liveData2, final ApiResponse apiResponse) {
        this.result.removeSource(liveData);
        this.result.removeSource(liveData2);
        if (apiResponse.isSuccessful()) {
            this.appExecutors.diskIO().execute(new Runnable() { // from class: com.oplus.aiunit.vision.znc
                @Override // java.lang.Runnable
                public final void run() {
                    this.i.lambda$fetchFromNetwork$5(apiResponse);
                }
            });
            return;
        }
        onFetchFailed();
        this.resultSource = liveData2;
        this.result.addSource(liveData2, new Observer() { // from class: com.oplus.aiunit.vision.aoc
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                this.i.lambda$fetchFromNetwork$6(apiResponse, obj);
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

    public LiveData<Resource<ResultType>> asLiveData() {
        return this.result;
    }

    @NonNull
    @MainThread
    public abstract LiveData<ApiResponse<RequestType>> createCall();

    public void fetchData() {
        this.result.setValue(Resource.start(null));
        LiveData<ResultType> liveData = this.resultSource;
        if (liveData != null) {
            this.result.removeSource(liveData);
        }
        final LiveData<ResultType> liveDataLoadFromDb = loadFromDb();
        this.result.addSource(liveDataLoadFromDb, new Observer() { // from class: com.oplus.aiunit.vision.coc
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                this.i.lambda$fetchData$1(liveDataLoadFromDb, obj);
            }
        });
    }

    @NonNull
    @MainThread
    public abstract LiveData<ResultType> loadFromDb();

    public void onFetchFailed() {
    }

    @WorkerThread
    public RequestType processResponse(ApiResponse<RequestType> apiResponse) {
        return apiResponse.getBody();
    }

    @WorkerThread
    public abstract void saveCallResult(@NonNull RequestType requesttype);

    @MainThread
    public abstract boolean shouldFetch(@Nullable ResultType resulttype);
}
