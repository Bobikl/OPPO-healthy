package com.platform.usercenter.basic.core.mvvm;

import androidx.annotation.Nullable;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.Observer;
import com.platform.usercenter.basic.core.mvvm.Resource;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes9.dex */
public class ResourceLiveData<ReturnType> extends LiveData<Resource<ReturnType>> {
    private final LiveData<Resource<ReturnType>> mCall;
    private final ProtocolHelper mHelper;
    private boolean mIsCancel;
    private final String mKey;
    private final AtomicBoolean started = new AtomicBoolean(false);

    public ResourceLiveData(ProtocolHelper protocolHelper, String str, LiveData<Resource<ReturnType>> liveData) {
        this.mHelper = protocolHelper;
        this.mKey = str;
        this.mCall = liveData;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onActive$0(Resource resource) {
        if (this.mIsCancel) {
            setValue(Resource.cancel(null));
            this.mHelper.remove(this.mKey);
        } else {
            if (Resource.isSuccessed(resource.status) || Resource.isError(resource.status)) {
                this.mHelper.remove(this.mKey);
            }
            setValue(resource);
        }
    }

    public void cancel() {
        this.mIsCancel = true;
    }

    @Override // androidx.lifecycle.LiveData
    public void onActive() {
        super.onActive();
        if (this.started.compareAndSet(false, true)) {
            this.mCall.observeForever(new Observer() { // from class: com.oplus.aiunit.vision.jtf
                @Override // androidx.lifecycle.Observer
                public final void onChanged(Object obj) {
                    this.i.lambda$onActive$0((Resource) obj);
                }
            });
        }
    }

    @Override // androidx.lifecycle.LiveData
    @Nullable
    public Resource<ReturnType> getValue() {
        return (Resource) super.getValue();
    }
}
