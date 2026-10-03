package com.platform.usercenter.basic.core.mvvm.protocol;

import androidx.annotation.MainThread;
import androidx.annotation.NonNull;
import androidx.annotation.UiThread;
import androidx.annotation.WorkerThread;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Observer;
import com.platform.usercenter.BaseApp;
import com.platform.usercenter.basic.core.mvvm.AppExecutors;
import com.platform.usercenter.basic.core.mvvm.CoreResponse;
import com.platform.usercenter.basic.core.mvvm.Objects;
import com.platform.usercenter.basic.core.mvvm.Resource;
import com.platform.usercenter.tools.word.WordManager;

/* JADX INFO: loaded from: classes9.dex */
public abstract class BaseProtocolTokenHandle<ResultType> implements ProtocolCommand<ResultType> {
    private MutableLiveData<Resource<ResultType>> result = new MutableLiveData<>();
    private final AppExecutors appExecutors = AppExecutors.getInstance();

    @MainThread
    public BaseProtocolTokenHandle() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ void lambda$handle$0(Object obj) {
        saveCallResult(obj);
        postValue(Resource.success(obj));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$handle$1(CoreResponse coreResponse) {
        if (!coreResponse.isSuccess()) {
            if (coreResponse.getError() != null) {
                setValue(Resource.error(coreResponse.getError().code, coreResponse.getError().message, coreResponse.getData()));
                return;
            } else {
                int code = coreResponse.getCode();
                setValue(Resource.error(code, WordManager.getInstance().getString(BaseApp.mContext, code, coreResponse.getMessage()), coreResponse.getData()));
                return;
            }
        }
        final ResultType resulttypeProcessResponse = processResponse(parseResponse(coreResponse));
        if (!shouldSaveResult() || resulttypeProcessResponse == null) {
            setValue(Resource.success(resulttypeProcessResponse));
        } else {
            this.appExecutors.diskIO().execute(new Runnable() { // from class: com.oplus.aiunit.vision.s71
                @Override // java.lang.Runnable
                public final void run() {
                    this.i.lambda$handle$0(resulttypeProcessResponse);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$handle$2(String str) {
        createCall(str).observeForever(new Observer() { // from class: com.oplus.aiunit.vision.u71
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                this.i.lambda$handle$1((CoreResponse) obj);
            }
        });
    }

    @UiThread
    private void postValue(Resource<ResultType> resource) {
        if (Objects.equals(this.result.getValue(), resource)) {
            return;
        }
        this.result.postValue(resource);
    }

    private ResultType processResponse(CoreResponse<ResultType> coreResponse) {
        return coreResponse.getData();
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
    public abstract LiveData<CoreResponse<ResultType>> createCall(String str);

    @WorkerThread
    public abstract LiveData<String> getSecondaryToken();

    @Override // com.platform.usercenter.basic.core.mvvm.protocol.ProtocolCommand
    public void handle() {
        setValue(Resource.loading(null));
        getSecondaryToken().observeForever(new Observer() { // from class: com.oplus.aiunit.vision.t71
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                this.i.lambda$handle$2((String) obj);
            }
        });
    }

    public CoreResponse<ResultType> parseResponse(CoreResponse<ResultType> coreResponse) {
        return coreResponse;
    }

    @WorkerThread
    public void saveCallResult(@NonNull ResultType resulttype) {
    }

    public boolean shouldSaveResult() {
        return false;
    }
}
