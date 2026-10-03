package com.heytap.health.devicemanager.lock;

import androidx.exifinterface.media.ExifInterface;
import com.oplus.aiunit.vision.jo4;
import com.oplus.aiunit.vision.ll4;
import java.util.LinkedHashSet;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes16.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\u0018\u0000*\u0004\b\u0000\u0010\u00012\u0012\u0012\u0004\u0012\u00028\u00000\u0002j\b\u0012\u0004\u0012\u00028\u0000`\u00032\u00020\u0004B\u0007¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0006\u001a\u00020\u0005H\u0096\u0001J\t\u0010\u0007\u001a\u00020\u0005H\u0096\u0001J\t\u0010\b\u001a\u00020\u0005H\u0096\u0001J\t\u0010\t\u001a\u00020\u0005H\u0096\u0001¨\u0006\f"}, d2 = {"Lcom/heytap/health/devicemanager/lock/LocKDMHashSet;", ExifInterface.GPS_DIRECTION_TRUE, "Ljava/util/LinkedHashSet;", "Lkotlin/collections/LinkedHashSet;", "Lcom/oplus/aiunit/vision/ll4;", "", "readLock", "readUnLock", "writeLock", "writeUnLock", "<init>", "()V", "device_manager_release"}, k = 1, mv = {1, 8, 0})
public final class LocKDMHashSet<T> extends LinkedHashSet<T> implements ll4 {
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

    @Override // java.util.HashSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
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
