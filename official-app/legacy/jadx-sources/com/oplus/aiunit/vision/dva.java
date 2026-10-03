package com.oplus.aiunit.vision;

import androidx.exifinterface.media.ExifInterface;
import com.heytap.log.config.StdDtoConst;
import java.util.concurrent.atomic.AtomicReference;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.functions.Function0;
import p010kotlin.jvm.functions.Function1;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B+\u0012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\u000b\u0012\u0014\u0010\u0010\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u000e¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0003\u001a\u0004\u0018\u00018\u0000¢\u0006\u0004\b\u0003\u0010\u0004J\r\u0010\u0005\u001a\u00028\u0000¢\u0006\u0004\b\u0005\u0010\u0004J\u0017\u0010\b\u001a\u00028\u00002\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0006\u0010\n\u001a\u00020\u0006R\u001a\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\fR\"\u0010\u0010\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u000fR\u001c\u0010\u0013\u001a\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0012¨\u0006\u0016"}, d2 = {"Lcom/oplus/aiunit/vision/dva;", ExifInterface.GPS_DIRECTION_TRUE, "", "c", "()Ljava/lang/Object;", "b", "", StdDtoConst.FORCE_KEY, "a", "(Z)Ljava/lang/Object;", "d", "Lkotlin/Function0;", "Lkotlin/jvm/functions/Function0;", "initFunction", "Lkotlin/Function1;", "Lkotlin/jvm/functions/Function1;", "releaseFunction", "Ljava/util/concurrent/atomic/AtomicReference;", "Ljava/util/concurrent/atomic/AtomicReference;", "mReference", "<init>", "(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;)V", "SpeechConversationSDK_release"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nLazyInit.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyInit.kt\ncom/heytap/speechassist/conversation/sdk/LazyInit\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,70:1\n1#2:71\n*E\n"})
public final class dva<T> {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final Function0<T> initFunction;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @Nullable
    public final Function1<T, Boolean> releaseFunction;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final AtomicReference<T> mReference;

    /* JADX WARN: Multi-variable type inference failed */
    public dva(@NotNull Function0<? extends T> initFunction, @Nullable Function1<? super T, Boolean> function1) {
        Intrinsics.checkNotNullParameter(initFunction, "initFunction");
        this.initFunction = initFunction;
        this.releaseFunction = function1;
        this.mReference = new AtomicReference<>(null);
    }

    public final T a(boolean force) {
        synchronized (this) {
            T t = this.mReference.get();
            if (!force && t != null) {
                return t;
            }
            if (t != null) {
                this.mReference.set(null);
                Function1<T, Boolean> function1 = this.releaseFunction;
                if (function1 != null) {
                    function1.invoke(t);
                }
            }
            T tInvoke = this.mReference.get();
            if (tInvoke == null) {
                tInvoke = this.initFunction.invoke();
                this.mReference.set(tInvoke);
            }
            return tInvoke;
        }
    }

    public final T b() {
        T tInvoke;
        T t = this.mReference.get();
        if (t != null) {
            return t;
        }
        synchronized (this) {
            tInvoke = this.mReference.get();
            if (tInvoke == null) {
                tInvoke = this.initFunction.invoke();
                this.mReference.set(tInvoke);
            }
        }
        return tInvoke;
    }

    @Nullable
    public final T c() {
        return this.mReference.get();
    }

    public final boolean d() {
        Boolean boolValueOf;
        boolean zBooleanValue;
        synchronized (this) {
            T t = this.mReference.get();
            if (t != null) {
                Function1<T, Boolean> function1 = this.releaseFunction;
                boolValueOf = Boolean.valueOf(function1 != null ? function1.invoke(t).booleanValue() : false);
            } else {
                boolValueOf = null;
            }
            this.mReference.set(null);
            zBooleanValue = boolValueOf != null ? boolValueOf.booleanValue() : true;
        }
        return zBooleanValue;
    }
}
