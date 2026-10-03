package com.heytap.health.devicemanager.util;

import androidx.exifinterface.media.ExifInterface;
import androidx.lifecycle.MutableLiveData;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes16.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\u0018\u0000 \r*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002:\u0001\tB\u0007¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0007\u0010\u0006J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00028\u0000H\u0002¢\u0006\u0004\b\t\u0010\n¨\u0006\u000e"}, d2 = {"Lcom/heytap/health/devicemanager/util/DuplicationLiveData;", ExifInterface.GPS_DIRECTION_TRUE, "Landroidx/lifecycle/MutableLiveData;", "value", "", "postValue", "(Ljava/lang/Object;)V", "setValue", "", "a", "(Ljava/lang/Object;)Z", "<init>", "()V", "Companion", "device_manager_release"}, k = 1, mv = {1, 8, 0})
public final class DuplicationLiveData<T> extends MutableLiveData<T> {

    @NotNull
    public static final String TAG = "DuplicationLiveData";

    public final boolean a(T value) {
        return Intrinsics.areEqual(getValue(), value);
    }

    @Override // androidx.lifecycle.MutableLiveData, androidx.lifecycle.LiveData
    public void postValue(T value) {
        if (a(value)) {
            return;
        }
        super.postValue(value);
    }

    @Override // androidx.lifecycle.MutableLiveData, androidx.lifecycle.LiveData
    public void setValue(T value) {
        if (a(value)) {
            return;
        }
        super.setValue(value);
    }
}
