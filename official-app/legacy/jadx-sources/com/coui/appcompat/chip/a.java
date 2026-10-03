package com.coui.appcompat.chip;

import android.widget.Checkable;
import androidx.annotation.IdRes;
import androidx.annotation.Nullable;
import com.coui.appcompat.chip.a;

/* JADX INFO: loaded from: classes13.dex */
public interface a<T extends a<T>> extends Checkable {

    /* JADX INFO: renamed from: com.coui.appcompat.chip.a$a, reason: collision with other inner class name */
    public interface InterfaceC0198a<C> {
        void onCheckedChanged(C c2, boolean z);
    }

    @IdRes
    int getId();

    void setInternalOnCheckedChangeListener(@Nullable InterfaceC0198a<T> interfaceC0198a);
}
