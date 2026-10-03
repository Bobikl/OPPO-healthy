package com.heytap.health.oobe.repo;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import androidx.core.app.FrameMetricsAggregator;
import com.google.gson.annotations.SerializedName;
import com.heytap.databaseengine.model.UserInfo;
import com.heytap.health.watchpair.R$string;
import com.heytap.nearx.tangramconfig.strategy.Fields;
import com.oplus.aiunit.vision.j3d;
import com.oplus.aiunit.vision.oei;
import com.oplus.aiunit.vision.qtf;
import com.oplus.aiunit.vision.rc4;
import com.oplus.aiunit.vision.t04;
import com.oplus.aiunit.vision.yo3;
import com.oplus.pantaconnect.sdk.discovery.fusion.ServiceNodeBundleKeys;
import com.oplus.utrace.db.UTraceSQLiteHelperKt;
import kotlinx.parcelize.Parcelize;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.ResultKt;
import p010kotlin.Unit;
import p010kotlin.coroutines.Continuation;
import p010kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import p010kotlin.coroutines.jvm.internal.ContinuationImpl;
import p010kotlin.coroutines.jvm.internal.DebugMetadata;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes17.dex */
@Parcelize
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u001a\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B_\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003\u0012\b\b\u0002\u0010\b\u001a\u00020\u0003\u0012\b\b\u0002\u0010\t\u001a\u00020\u0003\u0012\b\b\u0002\u0010\n\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u000b\u001a\u00020\f¢\u0006\u0002\u0010\rJ\u0011\u0010&\u001a\u00020'H\u0086@ø\u0001\u0000¢\u0006\u0002\u0010(J\t\u0010)\u001a\u00020\fHÖ\u0001J\u0006\u0010*\u001a\u00020\u0003J\u0006\u0010+\u001a\u00020,J\u0006\u0010-\u001a\u00020,J\u0006\u0010.\u001a\u00020,J\u0006\u0010/\u001a\u00020\u0003J\u0006\u00100\u001a\u00020\u0003J\u0019\u00101\u001a\u00020'2\u0006\u00102\u001a\u0002032\u0006\u00104\u001a\u00020\fHÖ\u0001J\f\u0010.\u001a\u00020,*\u00020\u0003H\u0002R\u0014\u0010\u000e\u001a\u00020\fX\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u001e\u0010\u000b\u001a\u00020\f8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0010\"\u0004\b\u0012\u0010\u0013R\u001e\u0010\b\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u001e\u0010\u0004\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0015\"\u0004\b\u0019\u0010\u0017R\u001e\u0010\u0005\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u0015\"\u0004\b\u001b\u0010\u0017R\u001e\u0010\t\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u0015\"\u0004\b\u001d\u0010\u0017R\u001e\u0010\u0006\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u0015\"\u0004\b\u001f\u0010\u0017R\u001e\u0010\u0007\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b \u0010\u0015\"\u0004\b!\u0010\u0017R\u001e\u0010\u0002\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010\u0015\"\u0004\b#\u0010\u0017R\u001e\u0010\n\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b$\u0010\u0015\"\u0004\b%\u0010\u0017\u0082\u0002\u0004\n\u0002\b\u0019¨\u00065"}, d2 = {"Lcom/heytap/health/oobe/repo/VirtualAccount;", "Landroid/os/Parcelable;", "virtualSsoid", "", ServiceNodeBundleKeys.DEVICE_NAME, t04.DEVICE_UNIQUE_ID, "nikcName", "sex", "birthday", Fields.HEIGHT_FIELD, "weight", "bindStatus", "", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V", "STATUS_BIND", "getSTATUS_BIND", "()I", "getBindStatus", "setBindStatus", "(I)V", "getBirthday", "()Ljava/lang/String;", "setBirthday", "(Ljava/lang/String;)V", "getDeviceName", "setDeviceName", "getDeviceUniqueId", "setDeviceUniqueId", "getHeight", "setHeight", "getNikcName", "setNikcName", "getSex", "setSex", "getVirtualSsoid", "setVirtualSsoid", "getWeight", "setWeight", "bindDevice", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "describeContents", "heightOrDefault", "isBindDevice", "", "isDataOk", "isReset", "summary", "weightOrDefault", "writeToParcel", "parcel", "Landroid/os/Parcel;", UTraceSQLiteHelperKt.COL_FLAGS, "device_pair_impl_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class VirtualAccount implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<VirtualAccount> CREATOR = new a();
    private final int STATUS_BIND;

    @SerializedName("bindStatus")
    private int bindStatus;

    @SerializedName("birthday")
    @NotNull
    private String birthday;

    @SerializedName(ServiceNodeBundleKeys.DEVICE_NAME)
    @NotNull
    private String deviceName;

    @SerializedName(t04.DEVICE_UNIQUE_ID)
    @NotNull
    private String deviceUniqueId;

    @SerializedName(Fields.HEIGHT_FIELD)
    @NotNull
    private String height;

    @SerializedName("nickname")
    @NotNull
    private String nikcName;

    @SerializedName("sex")
    @NotNull
    private String sex;

    @SerializedName("virtualSsoid")
    @NotNull
    private String virtualSsoid;

    @SerializedName("weight")
    @NotNull
    private String weight;

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<VirtualAccount> {
        @Override // android.os.Parcelable.Creator
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final VirtualAccount createFromParcel(@NotNull Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new VirtualAccount(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        @NotNull
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final VirtualAccount[] newArray(int i) {
            return new VirtualAccount[i];
        }
    }

    /* JADX INFO: renamed from: com.heytap.health.oobe.repo.VirtualAccount$bindDevice$1, reason: invalid class name */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @DebugMetadata(c = "com.heytap.health.oobe.repo.VirtualAccount", f = "OOBE.kt", i = {0, 1, 2, 3}, l = {222, oei.TAI_CHI, 229, yo3.FILE_SEND_FAIL}, m = "bindDevice", n = {"this", "this", "this", "this"}, s = {"L$0", "L$0", "L$0", "L$0"})
    public static final class AnonymousClass1 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        public AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(continuation);
        }

        @Override // p010kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return VirtualAccount.this.bindDevice(this);
        }
    }

    public VirtualAccount() {
        this(null, null, null, null, null, null, null, null, 0, FrameMetricsAggregator.EVERY_DURATION, null);
    }

    private final boolean isReset(String str) {
        return TextUtils.isEmpty(str) || Intrinsics.areEqual(str, "0");
    }

    /* JADX WARN: Code duplicated, block: B:28:0x00a6 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:29:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:37:0x00e9 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    public final Object bindDevice(@NotNull Continuation<? super Unit> continuation) {
        AnonymousClass1 anonymousClass1;
        VirtualAccount virtualAccount;
        OOBEDevice oOBEDevice;
        OOBEDevice oOBEDevice2;
        if (continuation instanceof AnonymousClass1) {
            anonymousClass1 = (AnonymousClass1) continuation;
            int i = anonymousClass1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                anonymousClass1.label = i - Integer.MIN_VALUE;
            } else {
                anonymousClass1 = new AnonymousClass1(continuation);
            }
        } else {
            anonymousClass1 = new AnonymousClass1(continuation);
        }
        Object objF = anonymousClass1.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = anonymousClass1.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objF);
            if (TextUtils.isEmpty(this.virtualSsoid)) {
                OOBENetSource oOBENetSource = OOBENetSource.INSTANCE;
                anonymousClass1.L$0 = this;
                anonymousClass1.L$1 = this;
                anonymousClass1.label = 1;
                objF = oOBENetSource.f(this, anonymousClass1);
                if (objF == coroutine_suspended) {
                    return coroutine_suspended;
                }
                virtualAccount = this;
                this.virtualSsoid = ((rc4) objF).getVirtualSsoid();
                j3d.INSTANCE.c("Family", "family " + virtualAccount.nikcName + " bindDevice success by createVirtualAccount");
                oOBEDevice = OOBEDevice.INSTANCE;
                anonymousClass1.L$0 = virtualAccount;
                anonymousClass1.L$1 = null;
                anonymousClass1.label = 2;
                if (oOBEDevice.r(virtualAccount, anonymousClass1) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                this = virtualAccount;
            } else if (isBindDevice()) {
                j3d.INSTANCE.b("Family", "current family has already bind device");
            } else {
                this.bindStatus = this.STATUS_BIND;
                OOBENetSource oOBENetSource2 = OOBENetSource.INSTANCE;
                anonymousClass1.L$0 = this;
                anonymousClass1.label = 3;
                if (oOBENetSource2.f(this, anonymousClass1) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                j3d.INSTANCE.c("Family", "family: " + this.nikcName + " bindDevice success by updateVirtualAccount");
                oOBEDevice2 = OOBEDevice.INSTANCE;
                anonymousClass1.L$0 = this;
                anonymousClass1.label = 4;
                if (oOBEDevice2.r(this, anonymousClass1) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
        } else if (i2 != 1) {
            if (i2 != 2) {
                if (i2 == 3) {
                    this = (VirtualAccount) anonymousClass1.L$0;
                    ResultKt.throwOnFailure(objF);
                    j3d.INSTANCE.c("Family", "family: " + this.nikcName + " bindDevice success by updateVirtualAccount");
                    oOBEDevice2 = OOBEDevice.INSTANCE;
                    anonymousClass1.L$0 = this;
                    anonymousClass1.label = 4;
                    if (oOBEDevice2.r(this, anonymousClass1) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else if (i2 != 4) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }
            this = (VirtualAccount) anonymousClass1.L$0;
            ResultKt.throwOnFailure(objF);
        } else {
            this = (VirtualAccount) anonymousClass1.L$1;
            virtualAccount = (VirtualAccount) anonymousClass1.L$0;
            ResultKt.throwOnFailure(objF);
            this.virtualSsoid = ((rc4) objF).getVirtualSsoid();
            j3d.INSTANCE.c("Family", "family " + virtualAccount.nikcName + " bindDevice success by createVirtualAccount");
            oOBEDevice = OOBEDevice.INSTANCE;
            anonymousClass1.L$0 = virtualAccount;
            anonymousClass1.L$1 = null;
            anonymousClass1.label = 2;
            if (oOBEDevice.r(virtualAccount, anonymousClass1) == coroutine_suspended) {
                return coroutine_suspended;
            }
            this = virtualAccount;
        }
        this.bindStatus = 1;
        return Unit.INSTANCE;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public final int getBindStatus() {
        return this.bindStatus;
    }

    @NotNull
    public final String getBirthday() {
        return this.birthday;
    }

    @NotNull
    public final String getDeviceName() {
        return this.deviceName;
    }

    @NotNull
    public final String getDeviceUniqueId() {
        return this.deviceUniqueId;
    }

    @NotNull
    public final String getHeight() {
        return this.height;
    }

    @NotNull
    public final String getNikcName() {
        return this.nikcName;
    }

    public final int getSTATUS_BIND() {
        return this.STATUS_BIND;
    }

    @NotNull
    public final String getSex() {
        return this.sex;
    }

    @NotNull
    public final String getVirtualSsoid() {
        return this.virtualSsoid;
    }

    @NotNull
    public final String getWeight() {
        return this.weight;
    }

    @NotNull
    public final String heightOrDefault() {
        return isReset(this.height) ? UserInfo.HEIGHT_DEFAULT : this.height;
    }

    public final boolean isBindDevice() {
        return this.bindStatus == 1;
    }

    public final boolean isDataOk() {
        return (TextUtils.isEmpty(this.nikcName) || TextUtils.isEmpty(this.sex) || TextUtils.isEmpty(this.birthday)) ? false : true;
    }

    public final void setBindStatus(int i) {
        this.bindStatus = i;
    }

    public final void setBirthday(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.birthday = str;
    }

    public final void setDeviceName(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.deviceName = str;
    }

    public final void setDeviceUniqueId(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.deviceUniqueId = str;
    }

    public final void setHeight(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.height = str;
    }

    public final void setNikcName(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.nikcName = str;
    }

    public final void setSex(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.sex = str;
    }

    public final void setVirtualSsoid(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.virtualSsoid = str;
    }

    public final void setWeight(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.weight = str;
    }

    @NotNull
    public final String summary() {
        return isBindDevice() ? qtf.p(R$string.oobe_device_colon_new, qtf.l(R$string.oobe_manual_pair_device), this.deviceName) : qtf.l(R$string.oobe_family_not_bind_device);
    }

    @NotNull
    public final String weightOrDefault() {
        return isReset(this.weight) ? "60000" : this.weight;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int flags) {
        Intrinsics.checkNotNullParameter(parcel, "out");
        parcel.writeString(this.virtualSsoid);
        parcel.writeString(this.deviceName);
        parcel.writeString(this.deviceUniqueId);
        parcel.writeString(this.nikcName);
        parcel.writeString(this.sex);
        parcel.writeString(this.birthday);
        parcel.writeString(this.height);
        parcel.writeString(this.weight);
        parcel.writeInt(this.bindStatus);
    }

    public VirtualAccount(@NotNull String virtualSsoid, @NotNull String deviceName, @NotNull String deviceUniqueId, @NotNull String nikcName, @NotNull String sex, @NotNull String birthday, @NotNull String height, @NotNull String weight, int i) {
        Intrinsics.checkNotNullParameter(virtualSsoid, "virtualSsoid");
        Intrinsics.checkNotNullParameter(deviceName, "deviceName");
        Intrinsics.checkNotNullParameter(deviceUniqueId, "deviceUniqueId");
        Intrinsics.checkNotNullParameter(nikcName, "nikcName");
        Intrinsics.checkNotNullParameter(sex, "sex");
        Intrinsics.checkNotNullParameter(birthday, "birthday");
        Intrinsics.checkNotNullParameter(height, "height");
        Intrinsics.checkNotNullParameter(weight, "weight");
        this.virtualSsoid = virtualSsoid;
        this.deviceName = deviceName;
        this.deviceUniqueId = deviceUniqueId;
        this.nikcName = nikcName;
        this.sex = sex;
        this.birthday = birthday;
        this.height = height;
        this.weight = weight;
        this.bindStatus = i;
        this.STATUS_BIND = 1;
    }

    public final boolean isReset() {
        return isReset(this.weight) || isReset(this.height) || !isDataOk();
    }

    public /* synthetic */ VirtualAccount(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? "" : str, (i2 & 2) != 0 ? "" : str2, (i2 & 4) != 0 ? "" : str3, (i2 & 8) != 0 ? "" : str4, (i2 & 16) != 0 ? "" : str5, (i2 & 32) != 0 ? "" : str6, (i2 & 64) != 0 ? "" : str7, (i2 & 128) != 0 ? "" : str8, (i2 & 256) != 0 ? 0 : i);
    }
}
