package com.oplus.aiunit.vision;

import androidx.lifecycle.MutableLiveData;
import java.util.List;

/* JADX INFO: loaded from: classes16.dex */
public final /* synthetic */ class s24 implements o14 {
    public final /* synthetic */ MutableLiveData i;

    @Override // com.oplus.aiunit.vision.o14
    public final void accept(Object obj) {
        this.i.postValue((List) obj);
    }
}
