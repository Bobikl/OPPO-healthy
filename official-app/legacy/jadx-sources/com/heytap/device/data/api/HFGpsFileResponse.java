package com.heytap.device.data.api;

import androidx.annotation.Keep;
import com.heytap.health.network.core.BaseResponse;
import com.heytap.log.consts.LogSenderConst;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes15.dex */
@Keep
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u000e\u0012\n\u0012\b\u0018\u00010\u0002R\u00020\u00000\u0001:\u0002\u0004\u0005B\u0005¢\u0006\u0002\u0010\u0003¨\u0006\u0006"}, d2 = {"Lcom/heytap/device/data/api/HFGpsFileResponse;", "Lcom/heytap/health/network/core/BaseResponse;", "Lcom/heytap/device/data/api/HFGpsFileResponse$HFGpsFileInfo;", "()V", "HFGpsFileInfo", "HFGpsFileItem", "device_data_sync_impl_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class HFGpsFileResponse extends BaseResponse<HFGpsFileInfo> {

    @Keep
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010!\n\u0000\b\u0087\u0004\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00050\u000eR&\u0010\u0003\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR&\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\u0007\"\u0004\b\f\u0010\t¨\u0006\u000f"}, d2 = {"Lcom/heytap/device/data/api/HFGpsFileResponse$HFGpsFileInfo;", "", "(Lcom/heytap/device/data/api/HFGpsFileResponse;)V", "validHfFileList", "", "Lcom/heytap/device/data/api/HFGpsFileResponse$HFGpsFileItem;", "getValidHfFileList", "()Ljava/util/List;", "setValidHfFileList", "(Ljava/util/List;)V", "verifyHfFileList", "getVerifyHfFileList", "setVerifyHfFileList", "allHfFileList", "", "device_data_sync_impl_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    @SourceDebugExtension({"SMAP\nHFGpsFileEntity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HFGpsFileEntity.kt\ncom/heytap/device/data/api/HFGpsFileResponse$HFGpsFileInfo\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,95:1\n1855#2,2:96\n1855#2,2:98\n*S KotlinDebug\n*F\n+ 1 HFGpsFileEntity.kt\ncom/heytap/device/data/api/HFGpsFileResponse$HFGpsFileInfo\n*L\n33#1:96,2\n36#1:98,2\n*E\n"})
    public final class HFGpsFileInfo {

        @Keep
        @Nullable
        private List<HFGpsFileItem> validHfFileList;

        @Keep
        @Nullable
        private List<HFGpsFileItem> verifyHfFileList;

        public HFGpsFileInfo() {
        }

        @NotNull
        public final List<HFGpsFileItem> allHfFileList() {
            boolean z;
            ArrayList arrayList = new ArrayList();
            List<HFGpsFileItem> list = this.validHfFileList;
            if (list != null) {
                Iterator<T> it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add((HFGpsFileItem) it.next());
                }
            }
            List<HFGpsFileItem> list2 = this.verifyHfFileList;
            if (list2 != null) {
                for (HFGpsFileItem hFGpsFileItem : list2) {
                    Iterator it2 = arrayList.iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            z = false;
                            break;
                        }
                        if (Intrinsics.areEqual(((HFGpsFileItem) it2.next()).getHfFileName(), hFGpsFileItem.getHfFileName())) {
                            z = true;
                            break;
                        }
                    }
                    if (!z) {
                        arrayList.add(hFGpsFileItem);
                    }
                }
            }
            return arrayList;
        }

        @Nullable
        public final List<HFGpsFileItem> getValidHfFileList() {
            return this.validHfFileList;
        }

        @Nullable
        public final List<HFGpsFileItem> getVerifyHfFileList() {
            return this.verifyHfFileList;
        }

        public final void setValidHfFileList(@Nullable List<HFGpsFileItem> list) {
            this.validHfFileList = list;
        }

        public final void setVerifyHfFileList(@Nullable List<HFGpsFileItem> list) {
            this.verifyHfFileList = list;
        }
    }

    @Keep
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\n\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0006\u0010\u001f\u001a\u00020\u0010J\b\u0010 \u001a\u00020\u0004H\u0016R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001c\u0010\t\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\bR\u001c\u0010\f\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u0006\"\u0004\b\u000e\u0010\bR\u0011\u0010\u000f\u001a\u00020\u00108F¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0011R\u0011\u0010\u0012\u001a\u00020\u00108F¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0011R\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0006\"\u0004\b\u0015\u0010\bR\u001a\u0010\u0016\u001a\u00020\u0017X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\u001a\u0010\u001c\u001a\u00020\u0017X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u0019\"\u0004\b\u001e\u0010\u001b¨\u0006!"}, d2 = {"Lcom/heytap/device/data/api/HFGpsFileResponse$HFGpsFileItem;", "", "()V", "aesKey", "", "getAesKey", "()Ljava/lang/String;", "setAesKey", "(Ljava/lang/String;)V", LogSenderConst.FILENAME, "getFileName", "setFileName", "fileUrl", "getFileUrl", "setFileUrl", "isInvalid", "", "()Z", "isValid", "md5", "getMd5", "setMd5", "size", "", "getSize", "()I", "setSize", "(I)V", "status", "getStatus", "setStatus", "isFieldOK", "toString", "device_data_sync_impl_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class HFGpsFileItem {

        /* JADX INFO: renamed from: aesKey, reason: from kotlin metadata and from toString */
        @Nullable
        private String key;

        /* JADX INFO: renamed from: fileName, reason: from kotlin metadata and from toString */
        @Nullable
        private String hfFileName;

        @Nullable
        private String fileUrl;

        @Nullable
        private String md5;
        private int size;
        private int status;

        @Nullable
        /* JADX INFO: renamed from: getAesKey, reason: from getter */
        public final String getKey() {
            return this.key;
        }

        @Nullable
        /* JADX INFO: renamed from: getFileName, reason: from getter */
        public final String getHfFileName() {
            return this.hfFileName;
        }

        @Nullable
        public final String getFileUrl() {
            return this.fileUrl;
        }

        @Nullable
        public final String getMd5() {
            return this.md5;
        }

        public final int getSize() {
            return this.size;
        }

        public final int getStatus() {
            return this.status;
        }

        public final boolean isFieldOK() {
            String str = this.hfFileName;
            if ((str == null || str.length() == 0) || this.size <= 0) {
                return false;
            }
            String str2 = this.fileUrl;
            if (str2 == null || str2.length() == 0) {
                return false;
            }
            String str3 = this.md5;
            if (str3 == null || str3.length() == 0) {
                return false;
            }
            String str4 = this.key;
            return !(str4 == null || str4.length() == 0);
        }

        public final boolean isInvalid() {
            return this.status == 0;
        }

        public final boolean isValid() {
            return this.status == 1;
        }

        public final void setAesKey(@Nullable String str) {
            this.key = str;
        }

        public final void setFileName(@Nullable String str) {
            this.hfFileName = str;
        }

        public final void setFileUrl(@Nullable String str) {
            this.fileUrl = str;
        }

        public final void setMd5(@Nullable String str) {
            this.md5 = str;
        }

        public final void setSize(int i) {
            this.size = i;
        }

        public final void setStatus(int i) {
            this.status = i;
        }

        @NotNull
        public String toString() {
            return "HFGpsFileItem(hfFileName=" + this.hfFileName + ", size=" + this.size + ", status=" + this.status + ", md5=" + this.md5 + ", key=" + this.key + ")";
        }
    }
}
