package com.heytap.health.devicemanager.lock;

import androidx.exifinterface.media.ExifInterface;
import com.oplus.aiunit.vision.jo4;
import com.oplus.aiunit.vision.ll4;
import java.util.TreeSet;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes16.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\u00020\u0003B\u0007¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0005\u001a\u00020\u0004H\u0096\u0001J\t\u0010\u0006\u001a\u00020\u0004H\u0096\u0001J\t\u0010\u0007\u001a\u00020\u0004H\u0096\u0001J\t\u0010\b\u001a\u00020\u0004H\u0096\u0001¨\u0006\u000b"}, d2 = {"Lcom/heytap/health/devicemanager/lock/LockTreeSet;", ExifInterface.GPS_DIRECTION_TRUE, "Ljava/util/TreeSet;", "Lcom/oplus/aiunit/vision/ll4;", "", "readLock", "readUnLock", "writeLock", "writeUnLock", "<init>", "()V", "device_manager_release"}, k = 1, mv = {1, 8, 0})
public final class LockTreeSet<T> extends TreeSet<T> implements ll4 {
    private final /* synthetic */ jo4 $$delegate_0 = new jo4();

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
