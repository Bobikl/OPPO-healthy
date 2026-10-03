package com.oplus.aiunit.core;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.SharedMemory;
import android.system.ErrnoException;
import com.oplus.aiunit.core.FramePackage;
import com.oplus.aiunit.core.ShareMemoryHolder;
import com.oplus.aiunit.core.protocol.common.ErrorCode;
import com.oplus.aiunit.vision.i0;
import com.oplus.aiunit.vision.rjg;
import com.oplus.aiunit.vision.vy7;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.function.BiConsumer;
import p010kotlin.text.Charsets;

/* JADX INFO: loaded from: classes3.dex */
public class FramePackage implements Parcelable {
    public static final String JSON_RESULT_NAME = "package::json_result";
    public static final String JSON_SOURCE_NAME = "package::json_source";
    private static final String TAG = "FramePackage";
    private final Map<String, ShareMemoryHolder> mBigDataMap;
    private final List<FrameUnit> mFrameUnitList;
    private final ParamPackage mParamPackage;
    private static final Long DATA_SIZE_THRESHOLD = 512000L;
    public static final Parcelable.Creator<FramePackage> CREATOR = new a();

    public class a implements Parcelable.Creator<FramePackage> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public FramePackage createFromParcel(Parcel parcel) {
            return new FramePackage(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public FramePackage[] newArray(int i) {
            return new FramePackage[i];
        }
    }

    public FramePackage() {
        this.mFrameUnitList = new ArrayList();
        this.mParamPackage = new ParamPackage();
        this.mBigDataMap = new HashMap();
    }

    private boolean isKeyInputOrOutput(String str) {
        return str.equals(JSON_SOURCE_NAME) || str.equals(JSON_RESULT_NAME);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$clearAllBigDataShareMemory$0(String str, ShareMemoryHolder shareMemoryHolder) {
        if (shareMemoryHolder != null) {
            shareMemoryHolder.close();
        }
    }

    private String readOutputFromShareMemory(String str) {
        ShareMemoryHolder shareMemoryHolder = this.mBigDataMap.get(str);
        if (shareMemoryHolder == null) {
            return null;
        }
        if (isKeyInputOrOutput(str)) {
            try {
                SharedMemory sharedMemory = shareMemoryHolder.getSharedMemory();
                if (sharedMemory == null) {
                    i0.n(TAG, "share memory is null but big data share memory is not null");
                    return null;
                }
                ByteBuffer byteBufferMapReadOnly = sharedMemory.mapReadOnly();
                int iLimit = byteBufferMapReadOnly.limit() - byteBufferMapReadOnly.position();
                byte[] bArr = new byte[iLimit];
                byteBufferMapReadOnly.get(bArr);
                i0.a(TAG, "read " + str + " from share memory with " + iLimit);
                String str2 = new String(bArr, Charsets.UTF_8);
                this.mParamPackage.setParamStringNoPrint(str, str2);
                SharedMemory.unmap(byteBufferMapReadOnly);
                return str2;
            } catch (ErrnoException | IllegalArgumentException e2) {
                i0.d(TAG, "readOutputFromShareMemory", e2);
            }
        } else {
            i0.a(TAG, "" + str + ", " + shareMemoryHolder);
        }
        return null;
    }

    public boolean addShareMemory(String str, byte[] bArr) {
        SharedMemory sharedMemory;
        i0.f(TAG, "addShareMemory: " + str);
        if (bArr != null && bArr.length != 0) {
            ShareMemoryHolder shareMemoryHolder = this.mBigDataMap.get(str);
            if (shareMemoryHolder != null) {
                shareMemoryHolder.close();
            }
            ShareMemoryHolder shareMemoryHolderCreateBigDataShareMemory = ShareMemoryHolder.createBigDataShareMemory(bArr.length);
            if (shareMemoryHolderCreateBigDataShareMemory == null || (sharedMemory = shareMemoryHolderCreateBigDataShareMemory.getSharedMemory()) == null) {
                return false;
            }
            try {
                ByteBuffer byteBufferMapReadWrite = sharedMemory.mapReadWrite();
                byteBufferMapReadWrite.put(bArr);
                SharedMemory.unmap(byteBufferMapReadWrite);
                this.mBigDataMap.put(str, shareMemoryHolderCreateBigDataShareMemory);
                i0.f(TAG, "addShareMemory: " + str + " success");
                return true;
            } catch (ErrnoException | IllegalArgumentException e2) {
                i0.c(TAG, "addShareMemory: " + str + " failed. " + e2.getMessage());
            }
        }
        return false;
    }

    public boolean attachConfigPackage(ConfigPackage configPackage) {
        boolean z = false;
        if (configPackage == null) {
            i0.c(TAG, "invalid config package can't find.");
            return false;
        }
        if (this.mFrameUnitList.isEmpty()) {
            return true;
        }
        for (FrameUnit frameUnit : this.mFrameUnitList) {
            if (equalConfigPackage(configPackage, "package::config_uuid")) {
                SharedMemory shareMemoryHolder = configPackage.getShareMemoryHolder(frameUnit.getUUID());
                if (shareMemoryHolder != null) {
                    frameUnit.setSharedMemory(shareMemoryHolder);
                    z = true;
                }
            } else {
                i0.c(TAG, "invalid uuid from while attach, means start != process");
            }
        }
        return z;
    }

    public void clearAllBigDataShareMemory() {
        this.mBigDataMap.forEach(new BiConsumer() { // from class: com.oplus.aiunit.vision.sy7
            @Override // java.util.function.BiConsumer
            public final void accept(Object obj, Object obj2) {
                FramePackage.lambda$clearAllBigDataShareMemory$0((String) obj, (ShareMemoryHolder) obj2);
            }
        });
        this.mBigDataMap.clear();
    }

    public void clearBigDataShareMemory(String str) {
        ShareMemoryHolder shareMemoryHolder = this.mBigDataMap.get(str);
        if (shareMemoryHolder != null) {
            shareMemoryHolder.close();
            this.mBigDataMap.remove(str);
        }
    }

    public void clearJsonMemory() {
        String[] strArr = {JSON_SOURCE_NAME, JSON_RESULT_NAME};
        for (int i = 0; i < 2; i++) {
            String str = strArr[i];
            ShareMemoryHolder shareMemoryHolder = this.mBigDataMap.get(str);
            if (shareMemoryHolder != null) {
                shareMemoryHolder.close();
                this.mBigDataMap.remove(str);
            }
        }
    }

    public void deepCopy(FramePackage framePackage) {
        this.mFrameUnitList.clear();
        this.mFrameUnitList.addAll(framePackage.getFrameUnitList());
        this.mParamPackage.cleanParam();
        this.mParamPackage.mergeParam(framePackage.getParamPackage());
        this.mBigDataMap.clear();
        this.mBigDataMap.putAll(framePackage.getBigDataMap());
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equalConfigPackage(ConfigPackage configPackage, String str) {
        return configPackage.getParamPackage().getParam(str).equals(this.mParamPackage.getParam(str));
    }

    public void fromConfigPackage(ConfigPackage configPackage, String str) {
        this.mParamPackage.setParam(str, configPackage.getParamPackage().getParam(str));
    }

    public Map<String, ShareMemoryHolder> getBigDataMap() {
        return this.mBigDataMap;
    }

    public ErrorCode getErrorCode() {
        String paramStr = this.mParamPackage.getParamStr("package::error_code");
        return (paramStr == null || paramStr.isEmpty()) ? ErrorCode.kErrorNone : ErrorCode.find(Integer.parseInt(paramStr));
    }

    public String getErrorMessage() {
        return this.mParamPackage.getParamStr("package::error_message");
    }

    public FrameUnit getFrameUnit(int i) {
        if (this.mFrameUnitList.size() <= i) {
            return null;
        }
        return this.mFrameUnitList.get(i);
    }

    public FrameUnit getFrameUnitByTag(String str, String str2) {
        Iterator<Map.Entry<Integer, vy7>> it = vy7.g(getParamStr("package::frame_tag_group"), str2).entrySet().iterator();
        while (it.hasNext()) {
            vy7 value = it.next().getValue();
            if (value != null && value.d.equals(str)) {
                return getFrameUnit(value.a.intValue());
            }
        }
        return null;
    }

    public List<FrameUnit> getFrameUnitList() {
        return this.mFrameUnitList;
    }

    public int getIntErrorCode() {
        String paramStr = this.mParamPackage.getParamStr("package::error_code");
        if (paramStr == null || paramStr.isEmpty()) {
            return ErrorCode.kErrorNone.value();
        }
        try {
            return Integer.parseInt(paramStr);
        } catch (NumberFormatException unused) {
            i0.c(TAG, "invalid error code");
            return ErrorCode.kErrorInvalidParam.value();
        }
    }

    public float getParamFloat(String str) {
        return this.mParamPackage.getParamFloat(str);
    }

    public int getParamInt(String str) {
        return this.mParamPackage.getParamInt(str);
    }

    public ParamPackage getParamPackage() {
        return this.mParamPackage;
    }

    public String getParamStr(String str) {
        return this.mParamPackage.getParamStr(str);
    }

    public void mergeParam(ParamPackage paramPackage) {
        this.mParamPackage.mergeParam(paramPackage);
    }

    public boolean moveBigDataToShareMemory(String str) {
        ShareMemoryHolder shareMemoryHolderMoveBigDataToShareMemory = moveBigDataToShareMemory(str, this.mBigDataMap.get(str));
        this.mBigDataMap.put(str, shareMemoryHolderMoveBigDataToShareMemory);
        return shareMemoryHolderMoveBigDataToShareMemory != null;
    }

    public boolean moveInOutBigDataToShareMemory() {
        return moveBigDataToShareMemory(JSON_RESULT_NAME) || moveBigDataToShareMemory(JSON_SOURCE_NAME);
    }

    public void readFromParcel(Parcel parcel) {
        parcel.readTypedList(this.mFrameUnitList, FrameUnit.CREATOR);
        parcel.readMap(this.mParamPackage.getParamMap(), null);
        rjg.a(this.mParamPackage.getParamMap());
        parcel.readMap(this.mBigDataMap, getClass().getClassLoader());
        try {
            this.mParamPackage.setParamExtra(parcel.readBundle(getClass().getClassLoader()));
        } catch (IllegalStateException e2) {
            i0.c(TAG, "readFromParcel: " + e2);
        }
    }

    public boolean readInOutBigDataFromShareMemory() {
        return readOutputFromShareMemory(JSON_RESULT_NAME) != null || (readOutputFromShareMemory(JSON_SOURCE_NAME) != null);
    }

    public byte[] removeShareMemory(String str) {
        i0.f(TAG, "removeShareMemory: " + str);
        ShareMemoryHolder shareMemoryHolder = this.mBigDataMap.get(str);
        if (shareMemoryHolder == null) {
            i0.n(TAG, "removeShareMemory: not found for " + str);
            return null;
        }
        try {
            SharedMemory sharedMemory = shareMemoryHolder.getSharedMemory();
            if (sharedMemory == null) {
                return null;
            }
            ByteBuffer byteBufferMapReadOnly = sharedMemory.mapReadOnly();
            byte[] bArr = new byte[byteBufferMapReadOnly.limit() - byteBufferMapReadOnly.position()];
            byteBufferMapReadOnly.get(bArr);
            SharedMemory.unmap(byteBufferMapReadOnly);
            i0.f(TAG, "removeShareMemory: " + str + " success");
            return bArr;
        } catch (ErrnoException | IllegalArgumentException e2) {
            i0.c(TAG, "removeShareMemory: " + str + " failed. " + e2.getMessage());
            return null;
        }
    }

    public void restoreParcelableFrameUnit(FrameUnit frameUnit) {
        for (FrameUnit frameUnit2 : this.mFrameUnitList) {
            if (frameUnit2.getUUID().equals(frameUnit.getUUID())) {
                i0.a(TAG, "restoreParcelableFrameUnit: tag = " + frameUnit2.getTag());
                frameUnit2.restoreFrameUnit(frameUnit);
                return;
            }
        }
    }

    public void setErrorCode(ErrorCode errorCode) {
        this.mParamPackage.setParam("package::error_code", Integer.valueOf(errorCode.value()));
    }

    public void setErrorMessage(String str) {
        this.mParamPackage.setParam("package::error_message", str);
    }

    public void setFrameUnit(int i, FrameUnit frameUnit) {
        if (i == this.mFrameUnitList.size()) {
            this.mFrameUnitList.add(frameUnit);
        } else {
            if (i >= this.mFrameUnitList.size() || i < 0) {
                return;
            }
            this.mFrameUnitList.set(i, frameUnit);
        }
    }

    public void setIntErrorCode(int i) {
        this.mParamPackage.setParam("package::error_code", Integer.valueOf(i));
    }

    public void setJsonResultParam(String str) {
        this.mParamPackage.setParamStr(JSON_RESULT_NAME, str);
    }

    public <E> void setParam(String str, E e2) {
        this.mParamPackage.setParam(str, e2);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeTypedList(this.mFrameUnitList);
        parcel.writeMap(this.mParamPackage.getParamMap());
        parcel.writeMap(this.mBigDataMap);
        parcel.writeBundle(this.mParamPackage.getParamExtra());
    }

    private ShareMemoryHolder moveBigDataToShareMemory(String str, ShareMemoryHolder shareMemoryHolder) {
        String paramStr = this.mParamPackage.getParamStr(str);
        if (paramStr == null) {
            i0.a(TAG, "moveBigStringToShareMemory skip due to null");
            return null;
        }
        Charset charset = Charsets.UTF_8;
        int length = paramStr.getBytes(charset).length;
        if (length < DATA_SIZE_THRESHOLD.longValue()) {
            i0.a(TAG, "moveBigStringToShareMemory " + str + " skip due to size " + length);
            return null;
        }
        this.mParamPackage.removeParamStr(str);
        if (shareMemoryHolder != null) {
            shareMemoryHolder.close();
        }
        ShareMemoryHolder shareMemoryHolderCreateBigDataShareMemory = ShareMemoryHolder.createBigDataShareMemory(paramStr.getBytes(charset).length);
        if (shareMemoryHolderCreateBigDataShareMemory == null) {
            i0.c(TAG, "moveBigStringToShareMemory create failed");
            return null;
        }
        SharedMemory sharedMemory = shareMemoryHolderCreateBigDataShareMemory.getSharedMemory();
        if (sharedMemory == null) {
            i0.c(TAG, "moveBigStringToShareMemory share memory allocate failed");
            return null;
        }
        try {
            ByteBuffer byteBufferMapReadWrite = sharedMemory.mapReadWrite();
            byteBufferMapReadWrite.put(paramStr.getBytes(charset));
            i0.a(TAG, "move " + str + " to share memory with " + length);
            SharedMemory.unmap(byteBufferMapReadWrite);
            return shareMemoryHolderCreateBigDataShareMemory;
        } catch (ErrnoException | IllegalArgumentException e2) {
            i0.d(TAG, "moveBigStringToShareMemory", e2);
            return null;
        }
    }

    public FramePackage(String str) {
        this.mFrameUnitList = new ArrayList();
        ParamPackage paramPackage = new ParamPackage();
        this.mParamPackage = paramPackage;
        this.mBigDataMap = new HashMap();
        paramPackage.setParam("package::config_uuid", str);
    }

    public FramePackage(Parcel parcel) {
        this.mFrameUnitList = new ArrayList();
        this.mParamPackage = new ParamPackage();
        this.mBigDataMap = new HashMap();
        readFromParcel(parcel);
    }
}
