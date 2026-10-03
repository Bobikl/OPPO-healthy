package com.heytap.health.devicemanagerimpl.processor.bean;

import androidx.annotation.Keep;
import com.heytap.health.operation.ecg.helper.EcgHelper;
import com.oplus.aiunit.vision.gdb;
import com.oplus.aiunit.vision.t04;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes16.dex */
@Keep
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0016B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÖ\u0001J\u0006\u0010\u0012\u001a\u00020\u000fJ\u0006\u0010\u0013\u001a\u00020\u000fJ\b\u0010\u0014\u001a\u00020\u0015H\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0017"}, d2 = {"Lcom/heytap/health/devicemanagerimpl/processor/bean/PushBean;", "", "messageType", "", EcgHelper.PUSHEXPERTINTERPRETATION_INTENT_KEY, "Lcom/heytap/health/devicemanagerimpl/processor/bean/PushBean$PackageObject;", "(ILcom/heytap/health/devicemanagerimpl/processor/bean/PushBean$PackageObject;)V", "getMessageType", "()I", "getPackageObject", "()Lcom/heytap/health/devicemanagerimpl/processor/bean/PushBean$PackageObject;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "isDevicePush", "isDeviceSecondaryPush", "toString", "", "PackageObject", "device_manager_impl_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class PushBean {
    private final int messageType;

    @NotNull
    private final PackageObject packageObject;

    public PushBean(int i, @NotNull PackageObject packageObject) {
        Intrinsics.checkNotNullParameter(packageObject, "packageObject");
        this.messageType = i;
        this.packageObject = packageObject;
    }

    public static /* synthetic */ PushBean copy$default(PushBean pushBean, int i, PackageObject packageObject, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = pushBean.messageType;
        }
        if ((i2 & 2) != 0) {
            packageObject = pushBean.packageObject;
        }
        return pushBean.copy(i, packageObject);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getMessageType() {
        return this.messageType;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final PackageObject getPackageObject() {
        return this.packageObject;
    }

    @NotNull
    public final PushBean copy(int messageType, @NotNull PackageObject packageObject) {
        Intrinsics.checkNotNullParameter(packageObject, "packageObject");
        return new PushBean(messageType, packageObject);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PushBean)) {
            return false;
        }
        PushBean pushBean = (PushBean) other;
        return this.messageType == pushBean.messageType && Intrinsics.areEqual(this.packageObject, pushBean.packageObject);
    }

    public final int getMessageType() {
        return this.messageType;
    }

    @NotNull
    public final PackageObject getPackageObject() {
        return this.packageObject;
    }

    public int hashCode() {
        return (Integer.hashCode(this.messageType) * 31) + this.packageObject.hashCode();
    }

    public final boolean isDevicePush() {
        return this.messageType == 100;
    }

    public final boolean isDeviceSecondaryPush() {
        return this.messageType == 101;
    }

    @NotNull
    public String toString() {
        return "PushBean(messageType=" + this.messageType + ", packageObject=" + this.packageObject + ")";
    }

    @Keep
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\bJ\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0005HÆ\u0003J\u0010\u0010\u0014\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u000fJ8\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010\u0016J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001a\u001a\u00020\u0003HÖ\u0001J\u0006\u0010\u001b\u001a\u00020\u0018J\u0006\u0010\u001c\u001a\u00020\u0018J\u0006\u0010\u001d\u001a\u00020\u0018J\u0006\u0010\u001e\u001a\u00020\u0018J\b\u0010\u001f\u001a\u00020\u0005H\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0015\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u0010\u001a\u0004\b\u000e\u0010\u000f¨\u0006 "}, d2 = {"Lcom/heytap/health/devicemanagerimpl/processor/bean/PushBean$PackageObject;", "", "deviceType", "", t04.DEVICE_UNIQUE_ID, "", "model", "operationType", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/Integer;)V", "getDeviceType", "()I", "getDeviceUniqueId", "()Ljava/lang/String;", "getModel", "getOperationType", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "component1", "component2", "component3", "component4", "copy", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/Integer;)Lcom/heytap/health/devicemanagerimpl/processor/bean/PushBean$PackageObject;", "equals", "", "other", "hashCode", "isAdminUnBind", "isBind", "isUnBind", "isUserUnBind", "toString", "device_manager_impl_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final /* data */ class PackageObject {
        private final int deviceType;

        @NotNull
        private final String deviceUniqueId;

        @NotNull
        private final String model;

        @Nullable
        private final Integer operationType;

        public PackageObject(int i, @NotNull String deviceUniqueId, @NotNull String model, @Nullable Integer num) {
            Intrinsics.checkNotNullParameter(deviceUniqueId, "deviceUniqueId");
            Intrinsics.checkNotNullParameter(model, "model");
            this.deviceType = i;
            this.deviceUniqueId = deviceUniqueId;
            this.model = model;
            this.operationType = num;
        }

        public static /* synthetic */ PackageObject copy$default(PackageObject packageObject, int i, String str, String str2, Integer num, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                i = packageObject.deviceType;
            }
            if ((i2 & 2) != 0) {
                str = packageObject.deviceUniqueId;
            }
            if ((i2 & 4) != 0) {
                str2 = packageObject.model;
            }
            if ((i2 & 8) != 0) {
                num = packageObject.operationType;
            }
            return packageObject.copy(i, str, str2, num);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final int getDeviceType() {
            return this.deviceType;
        }

        @NotNull
        /* JADX INFO: renamed from: component2, reason: from getter */
        public final String getDeviceUniqueId() {
            return this.deviceUniqueId;
        }

        @NotNull
        /* JADX INFO: renamed from: component3, reason: from getter */
        public final String getModel() {
            return this.model;
        }

        @Nullable
        /* JADX INFO: renamed from: component4, reason: from getter */
        public final Integer getOperationType() {
            return this.operationType;
        }

        @NotNull
        public final PackageObject copy(int deviceType, @NotNull String deviceUniqueId, @NotNull String model, @Nullable Integer operationType) {
            Intrinsics.checkNotNullParameter(deviceUniqueId, "deviceUniqueId");
            Intrinsics.checkNotNullParameter(model, "model");
            return new PackageObject(deviceType, deviceUniqueId, model, operationType);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof PackageObject)) {
                return false;
            }
            PackageObject packageObject = (PackageObject) other;
            return this.deviceType == packageObject.deviceType && Intrinsics.areEqual(this.deviceUniqueId, packageObject.deviceUniqueId) && Intrinsics.areEqual(this.model, packageObject.model) && Intrinsics.areEqual(this.operationType, packageObject.operationType);
        }

        public final int getDeviceType() {
            return this.deviceType;
        }

        @NotNull
        public final String getDeviceUniqueId() {
            return this.deviceUniqueId;
        }

        @NotNull
        public final String getModel() {
            return this.model;
        }

        @Nullable
        public final Integer getOperationType() {
            return this.operationType;
        }

        public int hashCode() {
            int iHashCode = ((((Integer.hashCode(this.deviceType) * 31) + this.deviceUniqueId.hashCode()) * 31) + this.model.hashCode()) * 31;
            Integer num = this.operationType;
            return iHashCode + (num == null ? 0 : num.hashCode());
        }

        public final boolean isAdminUnBind() {
            Integer num = this.operationType;
            return num != null && num.intValue() == 3;
        }

        public final boolean isBind() {
            Integer num = this.operationType;
            return num != null && num.intValue() == 1;
        }

        public final boolean isUnBind() {
            return isUserUnBind() || isAdminUnBind();
        }

        public final boolean isUserUnBind() {
            Integer num = this.operationType;
            return num != null && num.intValue() == 2;
        }

        @NotNull
        public String toString() {
            return "PackageObject(deviceType=" + this.deviceType + ", deviceUniqueId='" + gdb.a(this.deviceUniqueId) + "', model='" + this.model + "', operationType=" + this.operationType + ")";
        }

        public /* synthetic */ PackageObject(int i, String str, String str2, Integer num, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this(i, str, str2, (i2 & 8) != 0 ? 0 : num);
        }
    }
}
