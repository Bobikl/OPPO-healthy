package com.oplus.aiunit.vision;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.Size;

/* JADX INFO: loaded from: classes15.dex */
public class qv8 extends Thread {
    @Deprecated
    public qv8() {
        super(apj.c(apj.Thread_Type_Thread_Alone, null));
    }

    @Deprecated
    public qv8(@Nullable Runnable runnable) {
        super(runnable, apj.c(apj.Thread_Type_Thread_Alone, null));
    }

    public qv8(@NonNull @Size(max = apj.MAX_CALLER_LENGTH) String str) {
        super(apj.c(apj.Thread_Type_Thread_Alone, str));
    }

    public qv8(@Nullable Runnable runnable, @NonNull @Size(max = apj.MAX_CALLER_LENGTH) String str) {
        super(runnable, apj.c(apj.Thread_Type_Thread_Alone, str));
    }
}
