package com.oplusos.vfxmodelviewer.filament;

import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes9.dex */
public class Fence {
    public static final long WAIT_FOR_EVER = -1;
    private long mNativeObject;

    public enum FenceStatus {
        ERROR,
        CONDITION_SATISFIED,
        TIMEOUT_EXPIRED
    }

    public enum Mode {
        FLUSH,
        DONT_FLUSH
    }

    public Fence(long j2) {
        this.mNativeObject = j2;
    }

    private static native int nWait(long j2, int i, long j3);

    private static native int nWaitAndDestroy(long j2, int i);

    public static FenceStatus waitAndDestroy(@NonNull Fence fence, @NonNull Mode mode) {
        int iNWaitAndDestroy = nWaitAndDestroy(fence.getNativeObject(), mode.ordinal());
        if (iNWaitAndDestroy != -1 && iNWaitAndDestroy == 0) {
            return FenceStatus.CONDITION_SATISFIED;
        }
        return FenceStatus.ERROR;
    }

    public void clearNativeObject() {
        this.mNativeObject = 0L;
    }

    public long getNativeObject() {
        long j2 = this.mNativeObject;
        if (j2 != 0) {
            return j2;
        }
        throw new IllegalStateException("Calling method on destroyed Fence");
    }

    public FenceStatus wait(@NonNull Mode mode, long j2) {
        int iNWait = nWait(getNativeObject(), mode.ordinal(), j2);
        if (iNWait == -1) {
            return FenceStatus.ERROR;
        }
        if (iNWait != 0) {
            return iNWait != 1 ? FenceStatus.ERROR : FenceStatus.TIMEOUT_EXPIRED;
        }
        return FenceStatus.CONDITION_SATISFIED;
    }
}
