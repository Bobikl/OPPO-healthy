package com.platform.usercenter.basic.core.mvvm;

import androidx.annotation.MainThread;
import androidx.annotation.NonNull;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Observer;
import com.platform.usercenter.basic.core.mvvm.ApiResponse;

/* JADX INFO: loaded from: classes9.dex */
public abstract class BaseApiResponseAndErrorData<ResultType, ErrorData> {
    private MutableLiveData<CoreResponse<ResultType>> resultSource = new MutableLiveData<>();

    @MainThread
    public BaseApiResponseAndErrorData() {
        createCall().observeForever(new Observer() { // from class: com.oplus.aiunit.vision.pz0
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                this.i.lambda$new$0((ApiResponse) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$new$0(ApiResponse apiResponse) {
        CoreResponse<ResultType> coreResponse = parseCoreResponse((CoreResponseAndError) apiResponse.getBody());
        if (coreResponse != null) {
            setValue(coreResponse);
        } else {
            setValue(CoreResponse.error(apiResponse.getCode(), apiResponse.getErrorMessage()));
        }
    }

    @MainThread
    private void setValue(CoreResponse<ResultType> coreResponse) {
        if (Objects.equals(this.resultSource.getValue(), coreResponse)) {
            return;
        }
        this.resultSource.setValue(coreResponse);
    }

    public LiveData<CoreResponse<ResultType>> asLiveData() {
        return this.resultSource;
    }

    @NonNull
    @MainThread
    public abstract LiveData<ApiResponse<CoreResponseAndError<ResultType, ErrorData>>> createCall();

    public abstract CoreResponse<ResultType> parseCoreResponse(CoreResponseAndError<ResultType, ErrorData> coreResponseAndError);
}
