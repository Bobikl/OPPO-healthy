package com.platform.usercenter.basic.core.mvvm;

import androidx.annotation.MainThread;
import androidx.annotation.NonNull;
import androidx.annotation.WorkerThread;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MediatorLiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Observer;
import com.platform.usercenter.basic.core.mvvm.ApiResponse;

/* JADX INFO: loaded from: classes9.dex */
public abstract class NetworkResource<ResultType> {
    private final MediatorLiveData<Resource<ResultType>> result = new MediatorLiveData<>();
    private MutableLiveData<ResultType> resultSource = new MutableLiveData<>();
    private final AppExecutors appExecutors = AppExecutors.getInstance();

    @MainThread
    public NetworkResource() {
        fetchData();
    }

    private void fetchFromNetwork() {
        final LiveData<ApiResponse<ResultType>> liveDataCreateCall = createCall();
        this.result.addSource(liveDataCreateCall, new Observer() { // from class: com.oplus.aiunit.vision.mpc
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                this.i.lambda$fetchFromNetwork$3(liveDataCreateCall, (ApiResponse) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$fetchFromNetwork$0(Object obj) {
        setValue(Resource.success(obj));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$fetchFromNetwork$1(ApiResponse apiResponse, Object obj) {
        setValue(Resource.error(apiResponse.getCode(), apiResponse.getErrorMessage(), obj));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$fetchFromNetwork$2(final ApiResponse apiResponse) {
        if (!apiResponse.isSuccessful()) {
            this.result.addSource(this.resultSource, new Observer() { // from class: com.oplus.aiunit.vision.lpc
                @Override // androidx.lifecycle.Observer
                public final void onChanged(Object obj) {
                    this.i.lambda$fetchFromNetwork$1(apiResponse, obj);
                }
            });
        } else {
            this.resultSource.setValue(processResponse(apiResponse));
            this.result.addSource(this.resultSource, new Observer() { // from class: com.oplus.aiunit.vision.kpc
                @Override // androidx.lifecycle.Observer
                public final void onChanged(Object obj) {
                    this.i.lambda$fetchFromNetwork$0(obj);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$fetchFromNetwork$3(LiveData liveData, final ApiResponse apiResponse) {
        this.result.removeSource(liveData);
        this.appExecutors.mainThread().execute(new Runnable() { // from class: com.oplus.aiunit.vision.npc
            @Override // java.lang.Runnable
            public final void run() {
                this.i.lambda$fetchFromNetwork$2(apiResponse);
            }
        });
    }

    @WorkerThread
    private ResultType processResponse(ApiResponse<ResultType> apiResponse) {
        return apiResponse.getBody();
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
    public abstract LiveData<ApiResponse<ResultType>> createCall();

    public void fetchData() {
        this.result.setValue(Resource.loading(null));
        this.result.removeSource(this.resultSource);
        fetchFromNetwork();
    }
}
