package com.oplusos.vfxmodelviewer.filament;

import androidx.annotation.NonNull;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes8.dex */
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

    public Fence(long j) {
        this.mNativeObject = j;
    }

    private static native int nWait(long j, int i, long j2);

    private static native int nWaitAndDestroy(long j, int i);

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
        long j = this.mNativeObject;
        if (j != 0) {
            return j;
        }
        throw new IllegalStateException("Calling method on destroyed Fence");
    }

    public FenceStatus wait(@NonNull Mode mode, long j) {
        int iNWait = nWait(getNativeObject(), mode.ordinal(), j);
        if (iNWait == -1) {
            return FenceStatus.ERROR;
        }
        if (iNWait != 0) {
            return iNWait != 1 ? FenceStatus.ERROR : FenceStatus.TIMEOUT_EXPIRED;
        }
        return FenceStatus.CONDITION_SATISFIED;
    }
}
