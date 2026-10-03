package com.oplus.aiunit.vision;

import io.protostuff.MapSchema;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.locks.ReentrantLock;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B\u0007¢\u0006\u0004\b\u001d\u0010\u001eJ\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u001a\u0010\u000b\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00072\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0016J\b\u0010\f\u001a\u00020\u0004H\u0002R\u0014\u0010\u000f\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u000eR\u0016\u0010\u0012\u001a\u00020\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0005\u0010\u0011R\u0018\u0010\u0003\u001a\u0004\u0018\u00018\u00008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\f\u0010\u0013R\u0016\u0010\b\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0018\u0010\n\u001a\u0004\u0018\u00010\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R \u0010\u001c\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00190\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001b¨\u0006\u001f"}, d2 = {"Lcom/oplus/aiunit/vision/soj;", "TResult", "Lcom/oplus/aiunit/vision/loj;", "result", "", "b", "(Ljava/lang/Object;)V", "", "errorCode", "", "errorMessage", "a", "c", "Ljava/util/concurrent/locks/ReentrantLock;", "Ljava/util/concurrent/locks/ReentrantLock;", "lock", "", "Z", "completed", "Ljava/lang/Object;", "d", "I", MapSchema.FIELD_NAME_ENTRY, "Ljava/lang/String;", "", "Lcom/oplus/aiunit/vision/aee;", "f", "Ljava/util/List;", "pendingResults", "<init>", "()V", "com.oplus.deepthinker.sdk_release"}, k = 1, mv = {1, 6, 0})
public final class soj<TResult> extends loj<TResult> {

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public volatile boolean completed;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public volatile TResult result;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public volatile String errorMessage;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final ReentrantLock lock = new ReentrantLock();

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public volatile int errorCode = -1;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @NotNull
    public final List<aee<TResult>> pendingResults = new ArrayList();

    @Override // com.oplus.aiunit.vision.loj
    public void a(int errorCode, @Nullable String errorMessage) {
        this.lock.lock();
        try {
            this.completed = true;
            this.errorCode = errorCode;
            this.errorMessage = errorMessage;
            c();
        } finally {
            this.lock.unlock();
        }
    }

    @Override // com.oplus.aiunit.vision.loj
    public void b(TResult result) {
        this.lock.lock();
        try {
            this.completed = true;
            this.result = result;
            c();
        } finally {
            this.lock.unlock();
        }
    }

    public final void c() {
        this.lock.lock();
        try {
            Iterator<T> it = this.pendingResults.iterator();
            while (it.hasNext()) {
                ((aee) it.next()).a(this);
            }
            this.lock.unlock();
        } catch (Throwable th) {
            this.lock.unlock();
            throw th;
        }
    }
}
