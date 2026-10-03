package com.heytap.nearx.cloudconfig.observable;

import androidx.exifinterface.media.ExifInterface;
import io.protostuff.MapSchema;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.Unit;
import p010kotlin.jvm.JvmOverloads;
import p010kotlin.jvm.functions.Function0;
import p010kotlin.jvm.functions.Function1;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes17.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 %*\u0004\b\u0000\u0010\u00012\u00020\u0002:\u0001%B'\b\u0002\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006¢\u0006\u0002\u0010\bJ\r\u0010\u000e\u001a\u00020\u0007H\u0000¢\u0006\u0002\b\u000fJ\u0015\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0002H\u0000¢\u0006\u0002\b\u0013J&\u0010\u0014\u001a\b\u0012\u0004\u0012\u0002H\u00150\u0000\"\u0004\b\u0001\u0010\u00152\u0012\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u0002H\u00150\u0017J\u0014\u0010\u0018\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010\u0019\u001a\u00020\rJ\u0015\u0010\u001a\u001a\u00020\u00072\u0006\u0010\u001b\u001a\u00020\u001cH\u0000¢\u0006\u0002\b\u001dJ\u001a\u0010\u001e\u001a\u00020\u001f2\u0012\u0010 \u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00070\u0017J2\u0010\u001e\u001a\u00020\u001f2\u0012\u0010 \u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00070\u00172\u0016\b\u0002\u0010!\u001a\u0010\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0017J\u001e\u0010\u001e\u001a\u00020\u001f2\f\u0010 \u001a\b\u0012\u0004\u0012\u00028\u00000\u000b2\b\b\u0002\u0010\"\u001a\u00020\u0011J\u0014\u0010#\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010\u0019\u001a\u00020\rJ\u001a\u0010$\u001a\u00020\u001f2\u0012\u0010 \u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00070\u0017J2\u0010$\u001a\u00020\u001f2\u0012\u0010 \u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00070\u00172\u0016\b\u0002\u0010!\u001a\u0010\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0017R\u001a\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u000b0\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\f\u001a\u0004\u0018\u00010\rX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006&"}, d2 = {"Lcom/heytap/nearx/cloudconfig/observable/Observable;", ExifInterface.GPS_DIRECTION_TRUE, "", "onSubscribe", "Lcom/heytap/nearx/cloudconfig/observable/OnSubscribe;", "onDispose", "Lkotlin/Function0;", "", "(Lcom/heytap/nearx/cloudconfig/observable/OnSubscribe;Lkotlin/jvm/functions/Function0;)V", "innerSubscribers", "", "Lcom/heytap/nearx/cloudconfig/observable/Subscriber;", "subscriberScheduler", "Lcom/heytap/nearx/cloudconfig/observable/Scheduler;", "dispose", "dispose$com_heytap_nearx_cloudconfig", "invoke", "", "result", "invoke$com_heytap_nearx_cloudconfig", "map", "R", "transformer", "Lkotlin/Function1;", "observeOn", "scheduler", "onError", MapSchema.FIELD_NAME_ENTRY, "", "onError$com_heytap_nearx_cloudconfig", "subscribe", "Lcom/heytap/nearx/cloudconfig/observable/Disposable;", "subscriber", "error", "once", "subscribeOn", "subscribeOnce", "Companion", "com.heytap.nearx.cloudconfig"}, k = 1, mv = {1, 1, 16})
public final class Observable<T> {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final List<Subscriber<T>> innerSubscribers;
    private final Function0<Unit> onDispose;
    private final OnSubscribe<T> onSubscribe;
    private Scheduler subscriberScheduler;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J4\u0010\u0003\u001a\b\u0012\u0004\u0012\u0002H\u00050\u0004\"\u0004\b\u0001\u0010\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u0002H\u00050\u00072\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\tH\u0007J\u0012\u0010\u000b\u001a\b\u0012\u0004\u0012\u0002H\u00050\u0004\"\u0004\b\u0001\u0010\u0005J \u0010\f\u001a\b\u0012\u0004\u0012\u0002H\u00050\u0004\"\u0004\b\u0001\u0010\u00052\f\u0010\r\u001a\b\u0012\u0004\u0012\u0002H\u00050\tJ-\u0010\u000e\u001a\u00020\n\"\u0004\b\u0001\u0010\u0005*\u0010\u0012\u0004\u0012\u0002H\u0005\u0012\u0004\u0012\u00020\n\u0018\u00010\u000f2\u0006\u0010\u0010\u001a\u0002H\u0005H\u0002¢\u0006\u0002\u0010\u0011¨\u0006\u0012"}, d2 = {"Lcom/heytap/nearx/cloudconfig/observable/Observable$Companion;", "", "()V", "create", "Lcom/heytap/nearx/cloudconfig/observable/Observable;", ExifInterface.GPS_DIRECTION_TRUE, "onSubscribe", "Lcom/heytap/nearx/cloudconfig/observable/OnSubscribe;", "onDispose", "Lkotlin/Function0;", "", "empty", "just", "action", "safeInvoke", "Lkotlin/Function1;", "result", "(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V", "com.heytap.nearx.cloudconfig"}, k = 1, mv = {1, 1, 16})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Observable create$default(Companion companion, OnSubscribe onSubscribe, Function0 function0, int i, Object obj) {
            if ((i & 2) != 0) {
                function0 = null;
            }
            return companion.create(onSubscribe, function0);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Multi-variable type inference failed */
        public final <T> void safeInvoke(@Nullable Function1<? super T, Unit> function1, T t) {
            if (t == 0 || function1 == null) {
                return;
            }
            function1.invoke(t);
        }

        @JvmOverloads
        @NotNull
        public final <T> Observable<T> create(@NotNull OnSubscribe<T> onSubscribe) {
            return create$default(this, onSubscribe, null, 2, null);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @NotNull
        public final <T> Observable<T> empty() {
            return new Observable<>(new OnSubscribe<T>() { // from class: com.heytap.nearx.cloudconfig.observable.Observable$Companion$empty$1
                @Override // com.heytap.nearx.cloudconfig.observable.OnSubscribe
                public void call(@NotNull Function1<? super T, Unit> subscriber) {
                    Intrinsics.checkParameterIsNotNull(subscriber, "subscriber");
                }
            }, null, 2, 0 == true ? 1 : 0);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @NotNull
        public final <T> Observable<T> just(@NotNull final Function0<? extends T> action) {
            Intrinsics.checkParameterIsNotNull(action, "action");
            return new Observable<>(new OnSubscribe<T>() { // from class: com.heytap.nearx.cloudconfig.observable.Observable$Companion$just$1
                @Override // com.heytap.nearx.cloudconfig.observable.OnSubscribe
                public void call(@NotNull Function1<? super T, Unit> subscriber) {
                    Intrinsics.checkParameterIsNotNull(subscriber, "subscriber");
                    Observable.INSTANCE.safeInvoke(subscriber, action.invoke());
                }
            }, null, 2, 0 == true ? 1 : 0);
        }

        @JvmOverloads
        @NotNull
        public final <T> Observable<T> create(@NotNull OnSubscribe<T> onSubscribe, @Nullable Function0<Unit> onDispose) {
            Intrinsics.checkParameterIsNotNull(onSubscribe, "onSubscribe");
            return new Observable<>(onSubscribe, onDispose, null);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [R] */
    /* JADX INFO: renamed from: com.heytap.nearx.cloudconfig.observable.Observable$map$1, reason: invalid class name */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001c\u0010\u0002\u001a\u00020\u00032\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00030\u0005H\u0016¨\u0006\u0006"}, d2 = {"com/heytap/nearx/cloudconfig/observable/Observable$map$1", "Lcom/heytap/nearx/cloudconfig/observable/OnSubscribe;", "call", "", "subscriber", "Lkotlin/Function1;", "com.heytap.nearx.cloudconfig"}, k = 1, mv = {1, 1, 16})
    public static final class AnonymousClass1<R> implements OnSubscribe<R> {
        final /* synthetic */ Function1 $transformer;

        public AnonymousClass1(Function1 function1) {
            this.$transformer = function1;
        }

        @Override // com.heytap.nearx.cloudconfig.observable.OnSubscribe
        public void call(@NotNull final Function1<? super R, Unit> subscriber) {
            Intrinsics.checkParameterIsNotNull(subscriber, "subscriber");
            Observable.this.subscribe(new Function1<T, Unit>() { // from class: com.heytap.nearx.cloudconfig.observable.Observable$map$1$call$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                /* JADX WARN: Multi-variable type inference failed */
                @Override // p010kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(Object obj) {
                    invoke2(obj);
                    return Unit.INSTANCE;
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(T t) {
                    Observable.INSTANCE.safeInvoke(subscriber, this.this$0.$transformer.invoke(t));
                }
            }, new Function1<Throwable, Unit>() { // from class: com.heytap.nearx.cloudconfig.observable.Observable$map$1$call$2
                {
                    super(1);
                }

                @Override // p010kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
                    invoke2(th);
                    return Unit.INSTANCE;
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull Throwable it) {
                    Intrinsics.checkParameterIsNotNull(it, "it");
                    Function1 function1 = subscriber;
                    if (function1 instanceof OnErrorSubscriber) {
                        ((OnErrorSubscriber) function1).onError(it);
                    }
                }
            });
        }
    }

    /* JADX INFO: renamed from: com.heytap.nearx.cloudconfig.observable.Observable$observeOn$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001c\u0010\u0002\u001a\u00020\u00032\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00030\u0005H\u0016¨\u0006\u0006"}, d2 = {"com/heytap/nearx/cloudconfig/observable/Observable$observeOn$1", "Lcom/heytap/nearx/cloudconfig/observable/OnSubscribe;", "call", "", "subscriber", "Lkotlin/Function1;", "com.heytap.nearx.cloudconfig"}, k = 1, mv = {1, 1, 16})
    public static final class C15681 implements OnSubscribe<T> {
        final /* synthetic */ Scheduler $scheduler;

        public C15681(Scheduler scheduler) {
            this.$scheduler = scheduler;
        }

        @Override // com.heytap.nearx.cloudconfig.observable.OnSubscribe
        public void call(@NotNull final Function1<? super T, Unit> subscriber) {
            Intrinsics.checkParameterIsNotNull(subscriber, "subscriber");
            Observable.this.subscribe(new Function1<T, Unit>() { // from class: com.heytap.nearx.cloudconfig.observable.Observable$observeOn$1$call$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                /* JADX WARN: Multi-variable type inference failed */
                @Override // p010kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(Object obj) {
                    invoke2(obj);
                    return Unit.INSTANCE;
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(final T t) {
                    this.this$0.$scheduler.createWorker().schedule(new Runnable() { // from class: com.heytap.nearx.cloudconfig.observable.Observable$observeOn$1$call$1.1
                        @Override // java.lang.Runnable
                        public final void run() {
                            Observable.INSTANCE.safeInvoke(subscriber, t);
                        }
                    });
                }
            }, new Function1<Throwable, Unit>() { // from class: com.heytap.nearx.cloudconfig.observable.Observable$observeOn$1$call$2
                {
                    super(1);
                }

                @Override // p010kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
                    invoke2(th);
                    return Unit.INSTANCE;
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull Throwable it) {
                    Intrinsics.checkParameterIsNotNull(it, "it");
                    Function1 function1 = subscriber;
                    if (function1 instanceof OnErrorSubscriber) {
                        ((OnErrorSubscriber) function1).onError(it);
                    }
                }
            });
        }
    }

    /* JADX INFO: renamed from: com.heytap.nearx.cloudconfig.observable.Observable$subscribeOn$2, reason: invalid class name and case insensitive filesystem */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001c\u0010\u0002\u001a\u00020\u00032\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00030\u0005H\u0016¨\u0006\u0006"}, d2 = {"com/heytap/nearx/cloudconfig/observable/Observable$subscribeOn$2", "Lcom/heytap/nearx/cloudconfig/observable/OnSubscribe;", "call", "", "subscriber", "Lkotlin/Function1;", "com.heytap.nearx.cloudconfig"}, k = 1, mv = {1, 1, 16})
    public static final class C15702 implements OnSubscribe<T> {
        public C15702() {
        }

        @Override // com.heytap.nearx.cloudconfig.observable.OnSubscribe
        public void call(@NotNull final Function1<? super T, Unit> subscriber) {
            Intrinsics.checkParameterIsNotNull(subscriber, "subscriber");
            Observable.this.subscribe(new Function1<T, Unit>() { // from class: com.heytap.nearx.cloudconfig.observable.Observable$subscribeOn$2$call$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                /* JADX WARN: Multi-variable type inference failed */
                @Override // p010kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(Object obj) {
                    invoke2(obj);
                    return Unit.INSTANCE;
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(final T t) {
                    Scheduler scheduler = Observable.this.subscriberScheduler;
                    if (scheduler == null) {
                        Intrinsics.throwNpe();
                    }
                    scheduler.createWorker().schedule(new Runnable() { // from class: com.heytap.nearx.cloudconfig.observable.Observable$subscribeOn$2$call$1.1
                        @Override // java.lang.Runnable
                        public final void run() {
                            Observable.INSTANCE.safeInvoke(subscriber, t);
                        }
                    });
                }
            }, new Function1<Throwable, Unit>() { // from class: com.heytap.nearx.cloudconfig.observable.Observable$subscribeOn$2$call$2
                {
                    super(1);
                }

                @Override // p010kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
                    invoke2(th);
                    return Unit.INSTANCE;
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull Throwable it) {
                    Intrinsics.checkParameterIsNotNull(it, "it");
                    Function1 function1 = subscriber;
                    if (function1 instanceof OnErrorSubscriber) {
                        ((OnErrorSubscriber) function1).onError(it);
                    }
                }
            });
        }
    }

    private Observable(OnSubscribe<T> onSubscribe, Function0<Unit> function0) {
        this.onSubscribe = onSubscribe;
        this.onDispose = function0;
        this.innerSubscribers = new CopyOnWriteArrayList();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Disposable subscribe$default(Observable observable, Function1 function1, Function1 function2, int i, Object obj) {
        if ((i & 2) != 0) {
            function2 = null;
        }
        return observable.subscribe(function1, (Function1<? super Throwable, Unit>) function2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Disposable subscribeOnce$default(Observable observable, Function1 function1, Function1 function2, int i, Object obj) {
        if ((i & 2) != 0) {
            function2 = null;
        }
        return observable.subscribeOnce(function1, function2);
    }

    public final void dispose$com_heytap_nearx_cloudconfig() {
        this.innerSubscribers.clear();
        Function0<Unit> function0 = this.onDispose;
        if (function0 != null) {
            function0.invoke();
        }
    }

    public final boolean invoke$com_heytap_nearx_cloudconfig(@NotNull Object result) {
        Intrinsics.checkParameterIsNotNull(result, "result");
        List<Subscriber<T>> list = this.innerSubscribers;
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            INSTANCE.safeInvoke((Subscriber) it.next(), result);
        }
        return !list.isEmpty();
    }

    @NotNull
    public final <R> Observable<R> map(@NotNull Function1<? super T, ? extends R> transformer) {
        Intrinsics.checkParameterIsNotNull(transformer, "transformer");
        Observable<R> observableCreate = INSTANCE.create(new AnonymousClass1(transformer), new Function0<Unit>() { // from class: com.heytap.nearx.cloudconfig.observable.Observable.map.2
            {
                super(0);
            }

            @Override // p010kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                Observable.this.dispose$com_heytap_nearx_cloudconfig();
            }
        });
        Scheduler scheduler = this.subscriberScheduler;
        if (scheduler != null) {
            if (scheduler == null) {
                Intrinsics.throwNpe();
            }
            observableCreate.subscribeOn(scheduler);
        }
        return observableCreate;
    }

    @NotNull
    public final Observable<T> observeOn(@NotNull Scheduler scheduler) {
        Intrinsics.checkParameterIsNotNull(scheduler, "scheduler");
        Observable<T> observableCreate = INSTANCE.create(new C15681(scheduler), new Function0<Unit>() { // from class: com.heytap.nearx.cloudconfig.observable.Observable.observeOn.2
            {
                super(0);
            }

            @Override // p010kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                Observable.this.dispose$com_heytap_nearx_cloudconfig();
            }
        });
        Scheduler scheduler2 = this.subscriberScheduler;
        if (scheduler2 != null) {
            if (scheduler2 == null) {
                Intrinsics.throwNpe();
            }
            observableCreate.subscribeOn(scheduler2);
        }
        return observableCreate;
    }

    public final void onError$com_heytap_nearx_cloudconfig(@NotNull Throwable e2) {
        Intrinsics.checkParameterIsNotNull(e2, "e");
        Iterator<T> it = this.innerSubscribers.iterator();
        while (it.hasNext()) {
            ((Subscriber) it.next()).onError(e2);
        }
    }

    @NotNull
    public final Disposable subscribe(@NotNull Function1<? super T, Unit> subscriber) {
        Intrinsics.checkParameterIsNotNull(subscriber, "subscriber");
        return subscribe$default((Observable) this, (Subscriber) new RealSubscriber(subscriber, null), false, 2, (Object) null);
    }

    @NotNull
    public final Observable<T> subscribeOn(@NotNull Scheduler scheduler) {
        Intrinsics.checkParameterIsNotNull(scheduler, "scheduler");
        if (!(this.subscriberScheduler == null)) {
            throw new IllegalArgumentException("you already had set target scheduler for subscriber!!".toString());
        }
        this.subscriberScheduler = scheduler;
        return INSTANCE.create(new C15702(), new Function0<Unit>() { // from class: com.heytap.nearx.cloudconfig.observable.Observable.subscribeOn.3
            {
                super(0);
            }

            @Override // p010kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                Observable.this.dispose$com_heytap_nearx_cloudconfig();
            }
        });
    }

    @NotNull
    public final Disposable subscribeOnce(@NotNull Function1<? super T, Unit> subscriber) {
        Intrinsics.checkParameterIsNotNull(subscriber, "subscriber");
        return subscribe((Subscriber) new RealSubscriber(subscriber, null), true);
    }

    public static /* synthetic */ Disposable subscribe$default(Observable observable, Subscriber subscriber, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return observable.subscribe(subscriber, z);
    }

    @NotNull
    public final Disposable subscribe(@NotNull Function1<? super T, Unit> subscriber, @Nullable Function1<? super Throwable, Unit> error) {
        Intrinsics.checkParameterIsNotNull(subscriber, "subscriber");
        return subscribe$default((Observable) this, (Subscriber) new RealSubscriber(subscriber, error), false, 2, (Object) null);
    }

    @NotNull
    public final Disposable subscribeOnce(@NotNull Function1<? super T, Unit> subscriber, @Nullable Function1<? super Throwable, Unit> error) {
        Intrinsics.checkParameterIsNotNull(subscriber, "subscriber");
        return subscribe((Subscriber) new RealSubscriber(subscriber, error), true);
    }

    public /* synthetic */ Observable(OnSubscribe onSubscribe, Function0 function0, DefaultConstructorMarker defaultConstructorMarker) {
        this(onSubscribe, function0);
    }

    @NotNull
    public final Disposable subscribe(@NotNull final Subscriber<T> subscriber, final boolean once) {
        Intrinsics.checkParameterIsNotNull(subscriber, "subscriber");
        if (!this.innerSubscribers.contains(subscriber)) {
            this.innerSubscribers.add(subscriber);
        }
        try {
            this.onSubscribe.call(subscriber);
        } catch (Exception e2) {
            onError$com_heytap_nearx_cloudconfig(e2);
        }
        Disposable disposable = new Disposable() { // from class: com.heytap.nearx.cloudconfig.observable.Observable$subscribe$$inlined$let$lambda$1
            @Override // com.heytap.nearx.cloudconfig.observable.Disposable
            public void dispose() {
                Function0 function0;
                List list = this.$it.innerSubscribers;
                synchronized (list) {
                    if (list.indexOf(subscriber) > 0) {
                        list.remove(subscriber);
                    }
                    Unit unit = Unit.INSTANCE;
                }
                if (!list.isEmpty() || (function0 = this.$it.onDispose) == null) {
                    return;
                }
            }
        };
        if (once) {
            if (subscriber instanceof RealSubscriber) {
                ((RealSubscriber) subscriber).bind(disposable);
            } else {
                disposable.dispose();
            }
        }
        return disposable;
    }

    public /* synthetic */ Observable(OnSubscribe onSubscribe, Function0 function0, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(onSubscribe, (i & 2) != 0 ? null : function0);
    }
}
