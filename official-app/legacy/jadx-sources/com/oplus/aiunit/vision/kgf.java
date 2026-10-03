package com.oplus.aiunit.vision;

import com.oplus.nearx.track.internal.common.DataType;
import com.oplus.nearx.track.internal.common.UploadType;
import com.oplus.nearx.track.internal.storage.db.app.track.entity.TrackEventAllNet;
import com.oplus.nearx.track.internal.storage.db.app.track.entity.TrackEventHashAllNet;
import com.oplus.nearx.track.internal.storage.db.app.track.entity.TrackEventHashWifi;
import com.oplus.nearx.track.internal.storage.db.app.track.entity.TrackEventWifi;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes8.dex */
public class kgf implements yv9 {
    public final AtomicInteger a = new AtomicInteger(-1);
    public final AtomicInteger b = new AtomicInteger(-1);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final AtomicInteger f13276c = new AtomicInteger(-1);
    public final AtomicInteger d = new AtomicInteger(-1);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final a6k f13277e;

    public kgf(a6k a6kVar) {
        this.f13277e = a6kVar;
    }

    @Override // com.oplus.aiunit.vision.yv9
    public int a(long j2, int i, int i2, int i3) {
        DataType dataType = DataType.TECH;
        if (i == dataType.getDataType()) {
            if (i2 == UploadType.TIMING.getUploadType()) {
                if (this.b.get() != -1) {
                    return this.b.addAndGet(i3);
                }
                int iF = this.f13277e.f(dataType.getDataType(), TrackEventAllNet.class) + this.f13277e.f(dataType.getDataType(), TrackEventWifi.class);
                this.b.set(iF);
                return iF;
            }
            if (i2 != UploadType.HASH.getUploadType()) {
                return i3;
            }
            if (this.d.get() != -1) {
                return this.d.addAndGet(i3);
            }
            int iF2 = this.f13277e.f(dataType.getDataType(), TrackEventHashAllNet.class) + this.f13277e.f(dataType.getDataType(), TrackEventHashWifi.class);
            this.d.set(iF2);
            return iF2;
        }
        if (i2 == UploadType.TIMING.getUploadType()) {
            if (this.a.get() != -1) {
                return this.a.addAndGet(i3);
            }
            a6k a6kVar = this.f13277e;
            DataType dataType2 = DataType.BIZ;
            int iF3 = a6kVar.f(dataType2.getDataType(), TrackEventAllNet.class) + this.f13277e.f(dataType2.getDataType(), TrackEventWifi.class);
            this.a.set(iF3);
            return iF3;
        }
        if (i2 != UploadType.HASH.getUploadType()) {
            return i3;
        }
        if (this.f13276c.get() != -1) {
            return this.f13276c.addAndGet(i3);
        }
        a6k a6kVar2 = this.f13277e;
        DataType dataType3 = DataType.BIZ;
        int iF4 = a6kVar2.f(dataType3.getDataType(), TrackEventHashAllNet.class) + this.f13277e.f(dataType3.getDataType(), TrackEventHashWifi.class);
        this.f13276c.set(iF4);
        return iF4;
    }

    @Override // com.oplus.aiunit.vision.yv9
    public void b(long j2, int i, int i2) {
        if (i == DataType.TECH.getDataType()) {
            if (i2 == UploadType.TIMING.getUploadType()) {
                this.b.set(0);
                return;
            } else {
                if (i2 == UploadType.HASH.getUploadType()) {
                    this.d.set(0);
                    return;
                }
                return;
            }
        }
        if (i2 == UploadType.TIMING.getUploadType()) {
            this.a.set(0);
        } else if (i2 == UploadType.HASH.getUploadType()) {
            this.f13276c.set(0);
        }
    }
}
