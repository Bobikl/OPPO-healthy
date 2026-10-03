package com.oplus.aiunit.core;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.SharedMemory;
import com.oplus.aiunit.vision.i0;
import com.oplus.aiunit.vision.rjg;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;

/* JADX INFO: loaded from: classes3.dex */
public class ConfigPackage implements Parcelable {
    private static final String CONFIG_UUID_PARAM = "package::config_uuid";
    public static final Parcelable.Creator<ConfigPackage> CREATOR = new a();
    private static final String DETECTOR_USAGE_PARAM = "package::detector_usage";
    public static final int FRAME_SIZE_0 = 0;
    public static final int FRAME_SIZE_1 = 512;
    public static final int FRAME_SIZE_2 = 1024;
    public static final int FRAME_SIZE_3 = 2048;
    public static final int FRAME_SIZE_4 = 3072;
    public static final int FRAME_SIZE_5 = 4096;
    public static final int FRAME_SIZE_6 = 8192;
    private static final String TAG = "ConfigPackage";
    private final List<ShareMemoryHolder> mMemoryHolderList;
    private final ParamPackage mParamPackage;

    public class a implements Parcelable.Creator<ConfigPackage> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public ConfigPackage createFromParcel(Parcel parcel) {
            return new ConfigPackage(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public ConfigPackage[] newArray(int i) {
            return new ConfigPackage[i];
        }
    }

    public ConfigPackage(Parcel parcel) {
        this.mMemoryHolderList = new ArrayList();
        this.mParamPackage = new ParamPackage();
        readFromParcel(parcel);
    }

    public void allocateShareMemoryByFlagList(int[] iArr) {
        i0.a(TAG, "allocate share memory size list " + Arrays.toString(iArr));
        for (int i : iArr) {
            ShareMemoryHolder shareMemoryHolderCreate = ShareMemoryHolder.create(i);
            if (shareMemoryHolderCreate != null) {
                this.mMemoryHolderList.add(shareMemoryHolderCreate);
            } else {
                i0.a(TAG, "invalid flag while allocating share memory " + i);
            }
        }
    }

    public synchronized ShareMemoryHolder applyShareMemoryHolder(int i) {
        i0.f(TAG, "apply share memory holder size is " + i);
        for (ShareMemoryHolder shareMemoryHolder : this.mMemoryHolderList) {
            int size = shareMemoryHolder.getSharedMemory().getSize();
            int useFlag = shareMemoryHolder.getUseFlag();
            i0.f(TAG, "applyShareMemoryHolder: " + size + ", " + useFlag);
            if (size >= i && useFlag == 0) {
                shareMemoryHolder.setUseFlag(1);
                return shareMemoryHolder;
            }
        }
        i0.n(TAG, "no share memory holder found.");
        return null;
    }

    public synchronized void cleanSharedMemoryHolder() {
        i0.a(TAG, "cleanSharedMemoryHolder");
        for (ShareMemoryHolder shareMemoryHolder : this.mMemoryHolderList) {
            shareMemoryHolder.setUseFlag(2);
            shareMemoryHolder.getSharedMemory().close();
        }
        this.mMemoryHolderList.clear();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public synchronized ShareMemoryHolder electShareMemoryHolder(String str) {
        for (ShareMemoryHolder shareMemoryHolder : this.mMemoryHolderList) {
            if (shareMemoryHolder.getUUID().equals(str)) {
                return shareMemoryHolder;
            }
        }
        return null;
    }

    public synchronized void freeAllShareMemoryHolder() {
        i0.a(TAG, "freeAllShareMemoryHolder");
        Iterator<ShareMemoryHolder> it = this.mMemoryHolderList.iterator();
        while (it.hasNext()) {
            it.next().setUseFlag(0);
        }
    }

    public synchronized void freeShareMemoryHolder(String str) {
        i0.a(TAG, "freeShareMemoryHolder");
        for (ShareMemoryHolder shareMemoryHolder : this.mMemoryHolderList) {
            if (shareMemoryHolder.getUUID().equals(str)) {
                shareMemoryHolder.setUseFlag(0);
                return;
            }
        }
    }

    public int getDetectorType() {
        return this.mParamPackage.getParamInt("package::detector_type");
    }

    public String getDetectorUsage() {
        return this.mParamPackage.getParamStr(DETECTOR_USAGE_PARAM);
    }

    public ParamPackage getParamPackage() {
        return this.mParamPackage;
    }

    public SharedMemory getShareMemoryHolder(String str) {
        if (str == null) {
            i0.c(TAG, "share memory uuid is null");
            return null;
        }
        for (ShareMemoryHolder shareMemoryHolder : this.mMemoryHolderList) {
            if (str.equals(shareMemoryHolder.getUUID())) {
                return shareMemoryHolder.getSharedMemory();
            }
        }
        i0.n(TAG, "can't find any share memory holder while getting");
        return null;
    }

    public List<ShareMemoryHolder> getShareMemoryHolderList() {
        return this.mMemoryHolderList;
    }

    public String getUuid() {
        return this.mParamPackage.getParamStr(CONFIG_UUID_PARAM);
    }

    public void readFromParcel(Parcel parcel) {
        parcel.readTypedList(this.mMemoryHolderList, ShareMemoryHolder.CREATOR);
        parcel.readMap(this.mParamPackage.getParamMap(), null);
        rjg.a(this.mParamPackage.getParamMap());
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeTypedList(this.mMemoryHolderList);
        parcel.writeMap(this.mParamPackage.getParamMap());
    }

    public ConfigPackage() {
        this.mMemoryHolderList = new ArrayList();
        ParamPackage paramPackage = new ParamPackage();
        this.mParamPackage = paramPackage;
        paramPackage.setParam(CONFIG_UUID_PARAM, UUID.randomUUID().toString());
    }
}
