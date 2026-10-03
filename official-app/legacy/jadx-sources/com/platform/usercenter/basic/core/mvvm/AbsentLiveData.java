package com.platform.usercenter.basic.core.mvvm;

import androidx.lifecycle.LiveData;

/* JADX INFO: loaded from: classes9.dex */
public class AbsentLiveData<T> extends LiveData<T> {
    private AbsentLiveData(T t) {
        postValue(t);
    }

    public static <T> LiveData<T> create(T t) {
        return new AbsentLiveData(t);
    }
}
