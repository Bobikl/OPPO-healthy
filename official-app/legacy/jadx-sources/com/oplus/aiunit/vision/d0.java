package com.oplus.aiunit.vision;

import android.os.Looper;
import androidx.annotation.Nullable;
import com.oplus.aiunit.core.ConfigPackage;
import com.oplus.aiunit.core.FramePackage;
import com.oplus.aiunit.core.FrameUnit;
import com.oplus.aiunit.core.ShareMemoryHolder;

/* JADX INFO: loaded from: classes3.dex */
public abstract class d0 {
    public static final String DEFAULT_USAGE = "3_0_0";
    private static final String TAG = "AIDetectorContext";
    private ConfigPackage mConfigPackage;
    private int[] mMemoryPool = null;

    @Nullable
    public synchronized FramePackage applyFramePackage() {
        if (this.mConfigPackage == null) {
            i0.c(TAG, "config package is null when applying package.");
            return null;
        }
        return new FramePackage(this.mConfigPackage.getUuid());
    }

    public synchronized FrameUnit applyFrameUnit(int i) {
        ConfigPackage configPackage = this.mConfigPackage;
        if (configPackage == null) {
            i0.n(TAG, "config package is null when applying frame unit");
            return null;
        }
        ShareMemoryHolder shareMemoryHolderApplyShareMemoryHolder = configPackage.applyShareMemoryHolder(i);
        if (shareMemoryHolderApplyShareMemoryHolder == null) {
            i0.c(TAG, "share memory holder apply failed.");
            return null;
        }
        return new FrameUnit(shareMemoryHolderApplyShareMemoryHolder);
    }

    public void checkMainThread() {
        if (Thread.currentThread() == Looper.getMainLooper().getThread()) {
            throw new RuntimeException("The call must be in a worker thread");
        }
    }

    public synchronized ConfigPackage createConfigPackage() {
        if (this.mConfigPackage != null) {
            i0.a(TAG, "createConfigPackage destroy last");
            destroyConfigPackage();
        }
        ConfigPackage configPackage = new ConfigPackage();
        this.mConfigPackage = configPackage;
        configPackage.allocateShareMemoryByFlagList(getConfigMemoryPool());
        return this.mConfigPackage;
    }

    public synchronized String destroyConfigPackage() {
        i0.a(TAG, "destroyConfigPackage");
        ConfigPackage configPackage = this.mConfigPackage;
        if (configPackage == null) {
            i0.n(TAG, "config package is null when destroying package");
            return "";
        }
        configPackage.cleanSharedMemoryHolder();
        String uuid = this.mConfigPackage.getUuid();
        this.mConfigPackage = null;
        return uuid;
    }

    public synchronized void freeAllShareMemoryHolder() {
        ConfigPackage configPackage = this.mConfigPackage;
        if (configPackage == null) {
            i0.c(TAG, "config package is null when free AllShareMemoryHolder");
        } else {
            configPackage.freeAllShareMemoryHolder();
        }
    }

    public synchronized void freeFrameUnit(FrameUnit frameUnit) {
        if (this.mConfigPackage == null) {
            i0.c(TAG, "config package is null when free frame unit");
        } else if (frameUnit == null) {
            i0.c(TAG, "frame unit is null when free frame unit");
        } else {
            frameUnit.clear(Boolean.FALSE);
            this.mConfigPackage.freeShareMemoryHolder(frameUnit.getUUID());
        }
    }

    public synchronized void freeShareMemoryHolder(String str) {
        ConfigPackage configPackage = this.mConfigPackage;
        if (configPackage == null) {
            i0.c(TAG, "config package is null when free ShareMemoryHolder");
        } else {
            configPackage.freeShareMemoryHolder(str);
        }
    }

    public int[] getConfigMemoryPool() {
        int[] iArr = this.mMemoryPool;
        return iArr != null ? iArr : new int[]{1024, 1024, 3072, 3072};
    }

    public synchronized ConfigPackage getConfigPackage() {
        return this.mConfigPackage;
    }

    public abstract void process(FramePackage framePackage);

    public void setConfigMemoryPool(int[] iArr) {
        this.mMemoryPool = iArr;
    }
}
