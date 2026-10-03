package com.afollestad.assent.internal;

import androidx.lifecycle.LifecycleObserver;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.OnLifecycleEvent;
import io.protostuff.MapSchema;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.Unit;
import p010kotlin.collections.ArraysKt___ArraysKt;
import p010kotlin.jvm.functions.Function1;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B7\u0012\b\u0010\f\u001a\u0004\u0018\u00010\t\u0012\u000e\u0010\u0011\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u000e0\r\u0012\u0014\u0010\u0015\u001a\u0010\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0012¢\u0006\u0004\b\u0016\u0010\u0017J\b\u0010\u0003\u001a\u00020\u0002H\u0007J\b\u0010\u0004\u001a\u00020\u0002H\u0007J\b\u0010\u0005\u001a\u00020\u0002H\u0007J\b\u0010\u0006\u001a\u00020\u0002H\u0007J\b\u0010\u0007\u001a\u00020\u0002H\u0007J\b\u0010\b\u001a\u00020\u0002H\u0007R\u0018\u0010\f\u001a\u0004\u0018\u00010\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u001e\u0010\u0011\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u000e0\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R$\u0010\u0015\u001a\u0010\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014¨\u0006\u0018"}, d2 = {"Lcom/afollestad/assent/internal/Lifecycle;", "Landroidx/lifecycle/LifecycleObserver;", "", "onCreate", "onStart", "onResume", "onPause", "onStop", "onDestroy", "Landroidx/lifecycle/LifecycleOwner;", "i", "Landroidx/lifecycle/LifecycleOwner;", "lifecycleOwner", "", "Landroidx/lifecycle/Lifecycle$Event;", "j", "[Landroidx/lifecycle/Lifecycle$Event;", "watchFor", "Lkotlin/Function1;", MapSchema.FIELD_NAME_KEY, "Lkotlin/jvm/functions/Function1;", "onEvent", "<init>", "(Landroidx/lifecycle/LifecycleOwner;[Landroidx/lifecycle/Lifecycle$Event;Lkotlin/jvm/functions/Function1;)V", "core"}, k = 1, mv = {1, 4, 0})
public final class Lifecycle implements LifecycleObserver {

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    public LifecycleOwner lifecycleOwner;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    public androidx.lifecycle.Lifecycle.Event[] watchFor;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    public Function1<? super androidx.lifecycle.Lifecycle.Event, Unit> onEvent;

    public Lifecycle(@Nullable LifecycleOwner lifecycleOwner, @NotNull androidx.lifecycle.Lifecycle.Event[] watchFor, @Nullable Function1<? super androidx.lifecycle.Lifecycle.Event, Unit> function1) {
        androidx.lifecycle.Lifecycle lifecycle;
        Intrinsics.checkParameterIsNotNull(watchFor, "watchFor");
        this.lifecycleOwner = lifecycleOwner;
        this.watchFor = watchFor;
        this.onEvent = function1;
        if (lifecycleOwner == null || (lifecycle = lifecycleOwner.getLifecycle()) == null) {
            return;
        }
        lifecycle.addObserver(this);
    }

    @OnLifecycleEvent(androidx.lifecycle.Lifecycle.Event.ON_CREATE)
    public final void onCreate() {
        Function1<? super androidx.lifecycle.Lifecycle.Event, Unit> function1;
        androidx.lifecycle.Lifecycle.Event[] eventArr = this.watchFor;
        if (((eventArr.length == 0) || ArraysKt___ArraysKt.contains(eventArr, androidx.lifecycle.Lifecycle.Event.ON_CREATE)) && (function1 = this.onEvent) != null) {
            function1.invoke(androidx.lifecycle.Lifecycle.Event.ON_CREATE);
        }
    }

    @OnLifecycleEvent(androidx.lifecycle.Lifecycle.Event.ON_DESTROY)
    public final void onDestroy() {
        Function1<? super androidx.lifecycle.Lifecycle.Event, Unit> function1;
        androidx.lifecycle.Lifecycle lifecycle;
        LifecycleOwner lifecycleOwner = this.lifecycleOwner;
        if (lifecycleOwner != null && (lifecycle = lifecycleOwner.getLifecycle()) != null) {
            lifecycle.removeObserver(this);
        }
        this.lifecycleOwner = null;
        androidx.lifecycle.Lifecycle.Event[] eventArr = this.watchFor;
        if (((eventArr.length == 0) || ArraysKt___ArraysKt.contains(eventArr, androidx.lifecycle.Lifecycle.Event.ON_DESTROY)) && (function1 = this.onEvent) != null) {
            function1.invoke(androidx.lifecycle.Lifecycle.Event.ON_DESTROY);
        }
        this.onEvent = null;
    }

    @OnLifecycleEvent(androidx.lifecycle.Lifecycle.Event.ON_PAUSE)
    public final void onPause() {
        Function1<? super androidx.lifecycle.Lifecycle.Event, Unit> function1;
        androidx.lifecycle.Lifecycle.Event[] eventArr = this.watchFor;
        if (((eventArr.length == 0) || ArraysKt___ArraysKt.contains(eventArr, androidx.lifecycle.Lifecycle.Event.ON_PAUSE)) && (function1 = this.onEvent) != null) {
            function1.invoke(androidx.lifecycle.Lifecycle.Event.ON_PAUSE);
        }
    }

    @OnLifecycleEvent(androidx.lifecycle.Lifecycle.Event.ON_RESUME)
    public final void onResume() {
        Function1<? super androidx.lifecycle.Lifecycle.Event, Unit> function1;
        androidx.lifecycle.Lifecycle.Event[] eventArr = this.watchFor;
        if (((eventArr.length == 0) || ArraysKt___ArraysKt.contains(eventArr, androidx.lifecycle.Lifecycle.Event.ON_RESUME)) && (function1 = this.onEvent) != null) {
            function1.invoke(androidx.lifecycle.Lifecycle.Event.ON_RESUME);
        }
    }

    @OnLifecycleEvent(androidx.lifecycle.Lifecycle.Event.ON_START)
    public final void onStart() {
        Function1<? super androidx.lifecycle.Lifecycle.Event, Unit> function1;
        androidx.lifecycle.Lifecycle.Event[] eventArr = this.watchFor;
        if (((eventArr.length == 0) || ArraysKt___ArraysKt.contains(eventArr, androidx.lifecycle.Lifecycle.Event.ON_START)) && (function1 = this.onEvent) != null) {
            function1.invoke(androidx.lifecycle.Lifecycle.Event.ON_START);
        }
    }

    @OnLifecycleEvent(androidx.lifecycle.Lifecycle.Event.ON_STOP)
    public final void onStop() {
        Function1<? super androidx.lifecycle.Lifecycle.Event, Unit> function1;
        androidx.lifecycle.Lifecycle.Event[] eventArr = this.watchFor;
        if (((eventArr.length == 0) || ArraysKt___ArraysKt.contains(eventArr, androidx.lifecycle.Lifecycle.Event.ON_STOP)) && (function1 = this.onEvent) != null) {
            function1.invoke(androidx.lifecycle.Lifecycle.Event.ON_STOP);
        }
    }
}
