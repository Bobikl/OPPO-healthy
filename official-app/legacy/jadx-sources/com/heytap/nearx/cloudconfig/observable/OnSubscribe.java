package com.heytap.nearx.cloudconfig.observable;

import androidx.exifinterface.media.ExifInterface;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.Unit;
import p010kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes17.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002J\u001c\u0010\u0003\u001a\u00020\u00042\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00040\u0006H&¨\u0006\u0007"}, d2 = {"Lcom/heytap/nearx/cloudconfig/observable/OnSubscribe;", ExifInterface.GPS_DIRECTION_TRUE, "", "call", "", "subscriber", "Lkotlin/Function1;", "com.heytap.nearx.cloudconfig"}, k = 1, mv = {1, 1, 16})
public interface OnSubscribe<T> {
    void call(@NotNull Function1<? super T, Unit> subscriber);
}
