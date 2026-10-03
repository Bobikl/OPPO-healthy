package com.heytap.health.devicemanager.lock;

import androidx.exifinterface.media.ExifInterface;
import com.oplus.aiunit.vision.jo4;
import com.oplus.aiunit.vision.ll4;
import java.util.Comparator;
import java.util.TreeSet;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes16.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\u00020\u0003B#\u0012\u001a\u0010\u000b\u001a\u0016\u0012\u0006\b\u0000\u0012\u00028\u00000\tj\n\u0012\u0006\b\u0000\u0012\u00028\u0000`\n¢\u0006\u0004\b\f\u0010\rJ\t\u0010\u0005\u001a\u00020\u0004H\u0096\u0001J\t\u0010\u0006\u001a\u00020\u0004H\u0096\u0001J\t\u0010\u0007\u001a\u00020\u0004H\u0096\u0001J\t\u0010\b\u001a\u00020\u0004H\u0096\u0001¨\u0006\u000e"}, d2 = {"Lcom/heytap/health/devicemanager/lock/LockSortTreeSet;", ExifInterface.GPS_DIRECTION_TRUE, "Ljava/util/TreeSet;", "Lcom/oplus/aiunit/vision/ll4;", "", "readLock", "readUnLock", "writeLock", "writeUnLock", "Ljava/util/Comparator;", "Lkotlin/Comparator;", "comparator", "<init>", "(Ljava/util/Comparator;)V", "device_manager_release"}, k = 1, mv = {1, 8, 0})
public final class LockSortTreeSet<T> extends TreeSet<T> implements ll4 {
    private final /* synthetic */ jo4 $$delegate_0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LockSortTreeSet(@NotNull Comparator<? super T> comparator) {
        super(comparator);
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        this.$$delegate_0 = new jo4();
    }

    public /* bridge */ int getSize() {
        return super.size();
    }

    @Override // com.oplus.aiunit.vision.ll4
    public void readLock() {
        this.$$delegate_0.readLock();
    }

    @Override // com.oplus.aiunit.vision.ll4
    public void readUnLock() {
        this.$$delegate_0.readUnLock();
    }

    @Override // java.util.TreeSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final /* bridge */ int size() {
        return getSize();
    }

    @Override // com.oplus.aiunit.vision.ll4
    public void writeLock() {
        this.$$delegate_0.writeLock();
    }

    @Override // com.oplus.aiunit.vision.ll4
    public void writeUnLock() {
        this.$$delegate_0.writeUnLock();
    }
}
