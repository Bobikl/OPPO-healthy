package com.oplus.aiunit.vision;

import android.os.IInterface;
import android.os.RemoteCallbackList;
import androidx.exifinterface.media.ExifInterface;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes16.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u00032\u00020\u0004B\u0007¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0006\u001a\u00020\u0005H\u0096\u0001J\t\u0010\u0007\u001a\u00020\u0005H\u0096\u0001J\t\u0010\b\u001a\u00020\u0005H\u0096\u0001J\t\u0010\t\u001a\u00020\u0005H\u0096\u0001¨\u0006\f"}, d2 = {"Lcom/oplus/aiunit/vision/t5b;", "Landroid/os/IInterface;", ExifInterface.GPS_DIRECTION_TRUE, "Landroid/os/RemoteCallbackList;", "Lcom/oplus/aiunit/vision/ll4;", "", "readLock", "readUnLock", "writeLock", "writeUnLock", "<init>", "()V", "device_manager_release"}, k = 1, mv = {1, 8, 0})
public final class t5b<T extends IInterface> extends RemoteCallbackList<T> implements ll4 {
    public final /* synthetic */ jo4 i = new jo4();

    @Override // com.oplus.aiunit.vision.ll4
    public void readLock() {
        this.i.readLock();
    }

    @Override // com.oplus.aiunit.vision.ll4
    public void readUnLock() {
        this.i.readUnLock();
    }

    @Override // com.oplus.aiunit.vision.ll4
    public void writeLock() {
        this.i.writeLock();
    }

    @Override // com.oplus.aiunit.vision.ll4
    public void writeUnLock() {
        this.i.writeUnLock();
    }
}
