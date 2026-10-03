package com.platform.usercenter.basic.core.mvvm;

import androidx.annotation.MainThread;
import androidx.annotation.NonNull;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Observer;
import com.platform.usercenter.basic.core.mvvm.ApiResponse;

/* JADX INFO: loaded from: classes9.dex */
public abstract class BaseApiResponse<ResultType> {
    private MutableLiveData<CoreResponse<ResultType>> resultSource = new MutableLiveData<>();

    @MainThread
    public BaseApiResponse() {
        createCall().observeForever(new Observer() { // from class: com.oplus.aiunit.vision.oz0
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                this.i.lambda$new$0((ApiResponse) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$new$0(ApiResponse apiResponse) {
        String errorMessage;
        int i;
        CoreResponse<ResultType> coreResponse = (CoreResponse) apiResponse.getBody();
        boolean z = false;
        if (coreResponse == null) {
            int code = apiResponse.getCode();
            errorMessage = apiResponse.getErrorMessage();
            i = code;
        } else if (coreResponse.isSuccess()) {
            setValue(coreResponse);
            i = -1000;
            errorMessage = "";
            z = true;
        } else if (coreResponse.getError() != null) {
            i = coreResponse.getError().code;
            errorMessage = coreResponse.getError().message;
        } else {
            i = coreResponse.code;
            errorMessage = coreResponse.message;
        }
        if (z) {
            return;
        }
        setValue(CoreResponse.error(i, errorMessage));
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
    public abstract LiveData<ApiResponse<CoreResponse<ResultType>>> createCall();
}
