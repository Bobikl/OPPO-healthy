package com.oplus.aiunit.core;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SharedMemory;
import android.system.ErrnoException;
import androidx.annotation.Keep;
import com.oplus.aiunit.vision.i0;
import java.util.UUID;

/* JADX INFO: loaded from: classes3.dex */
@Keep
public class ShareMemoryHolder implements Parcelable {
    public static final int SHM_HOLDER_FLAG_CLOSED = 2;
    public static final int SHM_HOLDER_FLAG_OCCUPY = 1;
    public static final int SHM_HOLDER_FLAG_VACANT = 0;
    private static final String TAG = "ShareMemoryHolder";
    private SharedMemory sharedMemory;
    private String strUUID;
    private int useFlag;
    private static int[] FRAME_SIZE_ARRAY = {512, 1024, 2048, 3072, 4096, 8192};
    public static final Parcelable.Creator<ShareMemoryHolder> CREATOR = new a();

    public class a implements Parcelable.Creator<ShareMemoryHolder> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public ShareMemoryHolder createFromParcel(Parcel parcel) {
            return new ShareMemoryHolder(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public ShareMemoryHolder[] newArray(int i) {
            return new ShareMemoryHolder[i];
        }
    }

    private ShareMemoryHolder() {
        this.useFlag = 1;
    }

    public static ShareMemoryHolder create(int i) {
        if (i != 512 && i != 1024 && i != 2048 && i != 3072 && i != 4096 && i != 8192) {
            return null;
        }
        try {
            ShareMemoryHolder shareMemoryHolder = new ShareMemoryHolder();
            String string = UUID.randomUUID().toString();
            shareMemoryHolder.sharedMemory = SharedMemory.create(string, i * i * 4);
            shareMemoryHolder.useFlag = 0;
            shareMemoryHolder.strUUID = string;
            return shareMemoryHolder;
        } catch (ErrnoException unused) {
            i0.c(TAG, "create SharedMemory failed. frameFlag: " + i);
            return null;
        }
    }

    @SuppressLint({"NewApi"})
    public static ShareMemoryHolder createBigDataShareMemory(int i) {
        try {
            String string = UUID.randomUUID().toString();
            ShareMemoryHolder shareMemoryHolder = new ShareMemoryHolder();
            shareMemoryHolder.sharedMemory = SharedMemory.create(string, i);
            shareMemoryHolder.useFlag = 0;
            shareMemoryHolder.strUUID = string;
            i0.f(TAG, "createBigDataShareMemory " + i);
            return shareMemoryHolder;
        } catch (Throwable th) {
            i0.c(TAG, "createBigDataShareMemory " + i + " err. " + th.getMessage());
            return null;
        }
    }

    public void close() {
        i0.a(TAG, "close share memory");
        SharedMemory sharedMemory = this.sharedMemory;
        if (sharedMemory != null) {
            sharedMemory.close();
        }
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public SharedMemory getSharedMemory() {
        return this.sharedMemory;
    }

    public String getUUID() {
        return this.strUUID;
    }

    public int getUseFlag() {
        return this.useFlag;
    }

    public void readFromParcel(Parcel parcel) {
        this.useFlag = parcel.readInt();
        this.strUUID = parcel.readString();
        if (this.useFlag != 2) {
            this.sharedMemory = (SharedMemory) parcel.readParcelable(SharedMemory.class.getClassLoader());
        } else {
            this.sharedMemory = null;
        }
    }

    public void setUseFlag(int i) {
        i0.a(TAG, "set flag " + i);
        this.useFlag = i;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.useFlag);
        parcel.writeString(this.strUUID);
        if (this.useFlag != 2) {
            parcel.writeParcelable(this.sharedMemory, i);
        }
    }

    public ShareMemoryHolder(Parcel parcel) {
        readFromParcel(parcel);
    }
}
