package com.omron;

import android.os.Message;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;

/* JADX INFO: loaded from: classes5.dex */
public abstract class er {
    public void a() {
    }

    @NonNull
    public String b() {
        String name = getClass().getName();
        return name.substring(name.lastIndexOf(36) + 1);
    }

    public void a(@Nullable Object[] objArr) {
    }

    public boolean a(@NonNull Message message) {
        return false;
    }
}
