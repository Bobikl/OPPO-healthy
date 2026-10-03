package com.heytap.nearx.tangramconfig.observable;

import androidx.exifinterface.media.ExifInterface;
import p010kotlin.Metadata;
import p010kotlin.Unit;
import p010kotlin.jvm.functions.Function1;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.jvm.internal.Lambda;

/* JADX INFO: Add missing generic type declarations: [T] */
/* JADX INFO: loaded from: classes17.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0003\u001a\u0002H\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", ExifInterface.GPS_DIRECTION_TRUE, "it", "invoke", "(Ljava/lang/Object;)V"}, k = 3, mv = {1, 7, 1}, xi = 48)
public final class Observable$subscribeOn$2$call$1<T> extends Lambda implements Function1<T, Unit> {
    final /* synthetic */ Function1<T, Unit> $subscriber;
    final /* synthetic */ Observable<T> this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public Observable$subscribeOn$2$call$1(Observable<T> observable, Function1<? super T, Unit> function1) {
        super(1);
        this.this$0 = observable;
        this.$subscriber = function1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void invoke$lambda$0(Function1 subscriber, Object obj) {
        Intrinsics.checkNotNullParameter(subscriber, "$subscriber");
        Observable.INSTANCE.safeInvoke(subscriber, obj);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p010kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Object obj) {
        invoke2(obj);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(final T t) {
        Scheduler scheduler = ((Observable) this.this$0).subscriberScheduler;
        Intrinsics.checkNotNull(scheduler);
        Scheduler.Worker workerCreateWorker = scheduler.createWorker();
        final Function1<T, Unit> function1 = this.$subscriber;
        workerCreateWorker.schedule(new Runnable() { // from class: com.heytap.nearx.tangramconfig.observable.b
            @Override // java.lang.Runnable
            public final void run() {
                Observable$subscribeOn$2$call$1.invoke$lambda$0(function1, t);
            }
        });
    }
}
