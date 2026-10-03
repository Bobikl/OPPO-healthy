package com.oplus.aiunit.vision;

import androidx.lifecycle.MutableLiveData;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.jvm.functions.Function1;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes17.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/oplus/aiunit/vision/y2b;", "", "device_pair_impl_release"}, k = 1, mv = {1, 8, 0})
public interface y2b {

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class a {
        public static <D> void a(@NotNull y2b y2bVar, @NotNull MutableLiveData<D> receiver, @NotNull Function1<? super D, ? extends D> change) {
            Intrinsics.checkNotNullParameter(receiver, "$receiver");
            Intrinsics.checkNotNullParameter(change, "change");
            D value = receiver.getValue();
            Intrinsics.checkNotNull(value);
            receiver.setValue(change.invoke(value));
        }
    }
}
