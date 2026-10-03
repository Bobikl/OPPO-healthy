package com.oplus.aiunit.vision;

import android.text.SpannableString;
import androidx.lifecycle.MutableLiveData;

/* JADX INFO: loaded from: classes16.dex */
public final /* synthetic */ class dy8 implements o14 {
    public final /* synthetic */ MutableLiveData i;

    @Override // com.oplus.aiunit.vision.o14
    public final void accept(Object obj) {
        this.i.postValue((SpannableString) obj);
    }
}
