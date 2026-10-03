package com.heytap.nearx.cloudconfig.observable;

import androidx.exifinterface.media.ExifInterface;
import io.protostuff.MapSchema;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.Unit;
import p010kotlin.jvm.functions.Function1;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes17.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002B/\u0012\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0014\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004¢\u0006\u0002\u0010\bJ\u000e\u0010\u000b\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\nJ\u0016\u0010\f\u001a\u00020\u00052\u0006\u0010\r\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0002\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u00052\u0006\u0010\u0010\u001a\u00020\u0007H\u0016R\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u001c\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0011"}, d2 = {"Lcom/heytap/nearx/cloudconfig/observable/RealSubscriber;", ExifInterface.GPS_DIRECTION_TRUE, "Lcom/heytap/nearx/cloudconfig/observable/Subscriber;", "subscriber", "Lkotlin/Function1;", "", "error", "", "(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V", "disposable", "Lcom/heytap/nearx/cloudconfig/observable/Disposable;", "bind", "invoke", "result", "(Ljava/lang/Object;)V", "onError", MapSchema.FIELD_NAME_ENTRY, "com.heytap.nearx.cloudconfig"}, k = 1, mv = {1, 1, 16})
public final class RealSubscriber<T> implements Subscriber<T> {
    private Disposable disposable;
    private final Function1<Throwable, Unit> error;
    private final Function1<T, Unit> subscriber;

    /* JADX WARN: Multi-variable type inference failed */
    public RealSubscriber(@NotNull Function1<? super T, Unit> subscriber, @Nullable Function1<? super Throwable, Unit> function1) {
        Intrinsics.checkParameterIsNotNull(subscriber, "subscriber");
        this.subscriber = subscriber;
        this.error = function1;
    }

    public final void bind(@NotNull Disposable disposable) {
        Intrinsics.checkParameterIsNotNull(disposable, "disposable");
        this.disposable = disposable;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p010kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Object obj) {
        invoke2(obj);
        return Unit.INSTANCE;
    }

    @Override // com.heytap.nearx.cloudconfig.observable.OnErrorSubscriber
    public void onError(@NotNull Throwable e2) {
        Intrinsics.checkParameterIsNotNull(e2, "e");
        Function1<Throwable, Unit> function1 = this.error;
        if (function1 != null) {
            function1.invoke(e2);
        }
        Disposable disposable = this.disposable;
        if (disposable != null) {
            disposable.dispose();
        }
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public void invoke2(T result) {
        this.subscriber.invoke(result);
        Disposable disposable = this.disposable;
        if (disposable != null) {
            disposable.dispose();
        }
    }
}
