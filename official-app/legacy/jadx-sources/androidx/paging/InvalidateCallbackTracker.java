package androidx.paging;

import androidx.annotation.VisibleForTesting;
import androidx.exifinterface.media.ExifInterface;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.locks.ReentrantLock;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.Unit;
import p010kotlin.collections.CollectionsKt___CollectionsKt;
import p010kotlin.jvm.functions.Function0;
import p010kotlin.jvm.functions.Function1;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\n\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B+\u0012\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007¢\u0006\u0002\u0010\tJ\r\u0010\u0012\u001a\u00020\u0013H\u0001¢\u0006\u0002\b\u0014J\r\u0010\u0015\u001a\u00020\bH\u0000¢\u0006\u0002\b\u0016J\u0017\u0010\u0017\u001a\u00020\u00052\u0006\u0010\u0018\u001a\u00028\u0000H\u0000¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001b\u001a\u00020\u00052\u0006\u0010\u0018\u001a\u00028\u0000H\u0000¢\u0006\u0004\b\u001c\u0010\u001aR\u001a\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u001e\u0010\r\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\b@BX\u0080\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001d"}, d2 = {"Landroidx/paging/InvalidateCallbackTracker;", ExifInterface.GPS_DIRECTION_TRUE, "", "callbackInvoker", "Lkotlin/Function1;", "", "invalidGetter", "Lkotlin/Function0;", "", "(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;)V", "callbacks", "", "<set-?>", "invalid", "getInvalid$paging_common", "()Z", "lock", "Ljava/util/concurrent/locks/ReentrantLock;", "callbackCount", "", "callbackCount$paging_common", "invalidate", "invalidate$paging_common", "registerInvalidatedCallback", "callback", "registerInvalidatedCallback$paging_common", "(Ljava/lang/Object;)V", "unregisterInvalidatedCallback", "unregisterInvalidatedCallback$paging_common", "paging-common"}, k = 1, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nInvalidateCallbackTracker.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InvalidateCallbackTracker.kt\nandroidx/paging/InvalidateCallbackTracker\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,89:1\n1855#2,2:90\n*S KotlinDebug\n*F\n+ 1 InvalidateCallbackTracker.kt\nandroidx/paging/InvalidateCallbackTracker\n*L\n86#1:90,2\n*E\n"})
public final class InvalidateCallbackTracker<T> {

    @NotNull
    private final Function1<T, Unit> callbackInvoker;

    @NotNull
    private final List<T> callbacks;
    private boolean invalid;

    @Nullable
    private final Function0<Boolean> invalidGetter;

    @NotNull
    private final ReentrantLock lock;

    /* JADX WARN: Multi-variable type inference failed */
    public InvalidateCallbackTracker(@NotNull Function1<? super T, Unit> callbackInvoker, @Nullable Function0<Boolean> function0) {
        Intrinsics.checkNotNullParameter(callbackInvoker, "callbackInvoker");
        this.callbackInvoker = callbackInvoker;
        this.invalidGetter = function0;
        this.lock = new ReentrantLock();
        this.callbacks = new ArrayList();
    }

    @VisibleForTesting
    public final int callbackCount$paging_common() {
        return this.callbacks.size();
    }

    /* JADX INFO: renamed from: getInvalid$paging_common, reason: from getter */
    public final boolean getInvalid() {
        return this.invalid;
    }

    public final boolean invalidate$paging_common() {
        if (this.invalid) {
            return false;
        }
        ReentrantLock reentrantLock = this.lock;
        reentrantLock.lock();
        try {
            if (this.invalid) {
                reentrantLock.unlock();
                return false;
            }
            this.invalid = true;
            List list = CollectionsKt___CollectionsKt.toList(this.callbacks);
            this.callbacks.clear();
            Unit unit = Unit.INSTANCE;
            reentrantLock.unlock();
            if (list != null) {
                Function1<T, Unit> function1 = this.callbackInvoker;
                Iterator<T> it = list.iterator();
                while (it.hasNext()) {
                    function1.invoke(it.next());
                }
            }
            return true;
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    public final void registerInvalidatedCallback$paging_common(T callback) {
        Function0<Boolean> function0 = this.invalidGetter;
        boolean z = true;
        if (function0 != null && function0.invoke().booleanValue()) {
            invalidate$paging_common();
        }
        if (this.invalid) {
            this.callbackInvoker.invoke(callback);
            return;
        }
        ReentrantLock reentrantLock = this.lock;
        reentrantLock.lock();
        try {
            if (this.invalid) {
                Unit unit = Unit.INSTANCE;
            } else {
                this.callbacks.add(callback);
                z = false;
            }
            reentrantLock.unlock();
            if (z) {
                this.callbackInvoker.invoke(callback);
            }
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    public final void unregisterInvalidatedCallback$paging_common(T callback) {
        ReentrantLock reentrantLock = this.lock;
        reentrantLock.lock();
        try {
            this.callbacks.remove(callback);
        } finally {
            reentrantLock.unlock();
        }
    }

    public /* synthetic */ InvalidateCallbackTracker(Function1 function1, Function0 function0, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(function1, (i & 2) != 0 ? null : function0);
    }
}
