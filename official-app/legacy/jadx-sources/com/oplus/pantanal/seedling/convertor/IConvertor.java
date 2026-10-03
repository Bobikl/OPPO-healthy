package com.oplus.pantanal.seedling.convertor;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.exifinterface.media.ExifInterface;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\bf\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u00020\u0003J\u0015\u0010\u0004\u001a\u00028\u00002\u0006\u0010\u0005\u001a\u00028\u0001H&¢\u0006\u0002\u0010\u0006J\u0015\u0010\u0007\u001a\u00028\u00012\u0006\u0010\u0005\u001a\u00028\u0000H&¢\u0006\u0002\u0010\u0006¨\u0006\bÀ\u0006\u0003"}, d2 = {"Lcom/oplus/pantanal/seedling/convertor/IConvertor;", ExifInterface.GPS_DIRECTION_TRUE, "R", "", "from", "data", "(Ljava/lang/Object;)Ljava/lang/Object;", TypedValues.TransitionType.S_TO, "seedling-support_manualRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
public interface IConvertor<T, R> {
    T from(R data);

    R to(T data);
}
