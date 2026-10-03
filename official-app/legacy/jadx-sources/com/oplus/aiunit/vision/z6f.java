package com.oplus.aiunit.vision;

import androidx.exifinterface.media.ExifInterface;
import java.util.ArrayList;
import java.util.List;
import p010kotlin.Metadata;
import p010kotlin.collections.CollectionsKt___CollectionsKt;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\b\u0007\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0012\u0010\u0013J\u0015\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00028\u0000¢\u0006\u0004\b\u0005\u0010\u0006J\r\u0010\u0007\u001a\u00028\u0000¢\u0006\u0004\b\u0007\u0010\bJ\u0006\u0010\t\u001a\u00020\u0004J\u0018\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00028\u0000H\u0086\u0002¢\u0006\u0004\b\u000b\u0010\fR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u000eR\u0014\u0010\u0011\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u0010¨\u0006\u0014"}, d2 = {"Lcom/oplus/aiunit/vision/z6f;", ExifInterface.GPS_DIRECTION_TRUE, "", "item", "", "d", "(Ljava/lang/Object;)Z", "c", "()Ljava/lang/Object;", "a", "", "b", "(Ljava/lang/Object;)V", "", "Ljava/util/List;", "data", "Ljava/lang/Object;", "lock", "<init>", "()V", "core"}, k = 1, mv = {1, 4, 0})
public final class z6f<T> {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public final List<T> data = new ArrayList();

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public final Object lock = new Object();

    public final boolean a() {
        return !this.data.isEmpty();
    }

    public final void b(T item) {
        d(item);
    }

    public final T c() {
        T t;
        synchronized (this.lock) {
            t = (T) CollectionsKt___CollectionsKt.firstOrNull((List) this.data);
            if (t == null) {
                throw new IllegalStateException("Queue is empty, cannot pop.".toString());
            }
            this.data.remove(0);
        }
        return t;
    }

    public final boolean d(T item) {
        boolean zAdd;
        synchronized (this.lock) {
            zAdd = this.data.add(item);
        }
        return zAdd;
    }
}
