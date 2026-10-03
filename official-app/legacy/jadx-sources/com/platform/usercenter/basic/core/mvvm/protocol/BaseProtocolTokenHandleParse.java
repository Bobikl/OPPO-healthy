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
public abstract class BaseProtocolTokenHandleParse<ResultType, ParseResultType> implements ProtocolCommand<ParseResultType> {
    private MutableLiveData<Resource<ParseResultType>> result = new MutableLiveData<>();
    private final AppExecutors appExecutors = AppExecutors.getInstance();

    @MainThread
    public BaseProtocolTokenHandleParse() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ void lambda$handle$0(Object obj, Object obj2) {
        saveCallResult(obj);
        postValue(Resource.success(obj2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$handle$1(CoreResponse coreResponse) {
        if (coreResponse.isSuccess()) {
            final ResultType resulttypeProcessResponse = processResponse(parseResponse(coreResponse));
            final ParseResultType coreResponse2 = parseCoreResponse(resulttypeProcessResponse);
            if (!shouldSaveResult() || resulttypeProcessResponse == null) {
                setValue(Resource.success(coreResponse2));
                return;
            } else {
                this.appExecutors.diskIO().execute(new Runnable() { // from class: com.oplus.aiunit.vision.g81
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.i.lambda$handle$0(resulttypeProcessResponse, coreResponse2);
                    }
                });
                return;
            }
        }
        ParseResultType coreResponse3 = parseCoreResponse(processResponse(coreResponse));
        if (coreResponse.getError() != null) {
            setValue(Resource.error(coreResponse.getError().code, coreResponse.getError().message, coreResponse3));
            return;
        }
        setValue(Resource.error(coreResponse.getCode(), WordManager.getInstance().getString(BaseApp.mContext, coreResponse.getCode(), coreResponse.getMessage()), coreResponse3));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$handle$2(String str) {
        createCall(str).observeForever(new Observer() { // from class: com.oplus.aiunit.vision.e81
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                this.i.lambda$handle$1((CoreResponse) obj);
            }
        });
    }

    @UiThread
    private void postValue(Resource<ParseResultType> resource) {
        if (Objects.equals(this.result.getValue(), resource)) {
            return;
        }
        this.result.postValue(resource);
    }

    private ResultType processResponse(CoreResponse<ResultType> coreResponse) {
        return coreResponse.getData();
    }

    @MainThread
    private void setValue(Resource<ParseResultType> resource) {
        if (Objects.equals(this.result.getValue(), resource)) {
            return;
        }
        this.result.setValue(resource);
    }

    @Override // com.platform.usercenter.basic.core.mvvm.protocol.ProtocolCommand
    public LiveData<Resource<ParseResultType>> asLiveData() {
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
        getSecondaryToken().observeForever(new Observer() { // from class: com.oplus.aiunit.vision.f81
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                this.i.lambda$handle$2((String) obj);
            }
        });
    }

    public abstract ParseResultType parseCoreResponse(ResultType resulttype);

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
