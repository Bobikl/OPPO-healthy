package com.oplus.aiunit.vision;

import com.heytap.health.devicemanager.processor.bean.UserDeviceInfo;
import com.heytap.health.oobe.Variants;
import com.heytap.health.oobe.dto.DeviceDetailInfo;
import io.protostuff.MapSchema;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes17.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001BS\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u000e\u001a\u00020\b\u0012\b\b\u0002\u0010\u0011\u001a\u00020\b\u0012\b\b\u0002\u0010\u0015\u001a\u00020\b\u0012\b\b\u0002\u0010\u001c\u001a\u00020\u0016\u0012\u0010\b\u0002\u0010#\u001a\n\u0012\u0004\u0012\u00020\u001e\u0018\u00010\u001d\u0012\b\b\u0002\u0010)\u001a\u00020$¢\u0006\u0004\b*\u0010+R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\"\u0010\u000e\u001a\u00020\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\t\u0010\n\u001a\u0004\b\u0003\u0010\u000b\"\u0004\b\f\u0010\rR\"\u0010\u0011\u001a\u00020\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010\n\u001a\u0004\b\u000f\u0010\u000b\"\u0004\b\u0010\u0010\rR\"\u0010\u0015\u001a\u00020\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010\n\u001a\u0004\b\u0013\u0010\u000b\"\u0004\b\u0014\u0010\rR\"\u0010\u001c\u001a\u00020\u00168\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR*\u0010#\u001a\n\u0012\u0004\u0012\u00020\u001e\u0018\u00010\u001d8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\f\u0010\u001f\u001a\u0004\b\t\u0010 \"\u0004\b!\u0010\"R\"\u0010)\u001a\u00020$8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b!\u0010%\u001a\u0004\b\u0012\u0010&\"\u0004\b'\u0010(¨\u0006,"}, d2 = {"Lcom/oplus/aiunit/vision/h6e;", "Lcom/oplus/aiunit/vision/cqf;", "Lcom/heytap/health/oobe/OOBEPairingData;", "a", "Lcom/heytap/health/oobe/OOBEPairingData;", MapSchema.FIELD_NAME_ENTRY, "()Lcom/heytap/health/oobe/OOBEPairingData;", "pairingData", "", "b", "Ljava/lang/String;", "()Ljava/lang/String;", "f", "(Ljava/lang/String;)V", "bindKey", "c", "i", "deviceBindKey", "d", "getKsc", "setKsc", "ksc", "", "Z", "getCloudBindSuccess", "()Z", b2n.g, "(Z)V", "cloudBindSuccess", "", "Lcom/heytap/health/devicemanager/processor/bean/UserDeviceInfo;", "Ljava/util/List;", "()Ljava/util/List;", b2n.f, "(Ljava/util/List;)V", "bondedDevices", "Lcom/heytap/health/oobe/dto/DeviceDetailInfo;", "Lcom/heytap/health/oobe/dto/DeviceDetailInfo;", "()Lcom/heytap/health/oobe/dto/DeviceDetailInfo;", "j", "(Lcom/heytap/health/oobe/dto/DeviceDetailInfo;)V", "deviceInfo", "<init>", "(Lcom/heytap/health/oobe/OOBEPairingData;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/util/List;Lcom/heytap/health/oobe/dto/DeviceDetailInfo;)V", "device_pair_impl_release"}, k = 1, mv = {1, 8, 0})
public final class h6e implements cqf {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final Variants pairingData;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public String bindKey;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public String deviceBindKey;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    public String ksc;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    public boolean cloudBindSuccess;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @Nullable
    public List<? extends UserDeviceInfo> bondedDevices;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @NotNull
    public DeviceDetailInfo deviceInfo;

    public h6e(@NotNull Variants pairingData, @NotNull String bindKey, @NotNull String deviceBindKey, @NotNull String ksc, boolean z, @Nullable List<? extends UserDeviceInfo> list, @NotNull DeviceDetailInfo deviceInfo) {
        Intrinsics.checkNotNullParameter(pairingData, "pairingData");
        Intrinsics.checkNotNullParameter(bindKey, "bindKey");
        Intrinsics.checkNotNullParameter(deviceBindKey, "deviceBindKey");
        Intrinsics.checkNotNullParameter(ksc, "ksc");
        Intrinsics.checkNotNullParameter(deviceInfo, "deviceInfo");
        this.pairingData = pairingData;
        this.bindKey = bindKey;
        this.deviceBindKey = deviceBindKey;
        this.ksc = ksc;
        this.cloudBindSuccess = z;
        this.bondedDevices = list;
        this.deviceInfo = deviceInfo;
    }

    @NotNull
    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getBindKey() {
        return this.bindKey;
    }

    @Nullable
    public final List<UserDeviceInfo> b() {
        return this.bondedDevices;
    }

    @NotNull
    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getDeviceBindKey() {
        return this.deviceBindKey;
    }

    @NotNull
    /* JADX INFO: renamed from: d, reason: from getter */
    public final DeviceDetailInfo getDeviceInfo() {
        return this.deviceInfo;
    }

    @NotNull
    /* JADX INFO: renamed from: e, reason: from getter */
    public final Variants getPairingData() {
        return this.pairingData;
    }

    public final void f(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.bindKey = str;
    }

    public final void g(@Nullable List<? extends UserDeviceInfo> list) {
        this.bondedDevices = list;
    }

    public final void h(boolean z) {
        this.cloudBindSuccess = z;
    }

    public final void i(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.deviceBindKey = str;
    }

    public final void j(@NotNull DeviceDetailInfo deviceDetailInfo) {
        Intrinsics.checkNotNullParameter(deviceDetailInfo, "<set-?>");
        this.deviceInfo = deviceDetailInfo;
    }

    public /* synthetic */ h6e(Variants variants, String str, String str2, String str3, boolean z, List list, DeviceDetailInfo deviceDetailInfo, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(variants, (i & 2) != 0 ? "" : str, (i & 4) != 0 ? "" : str2, (i & 8) == 0 ? str3 : "", (i & 16) != 0 ? false : z, (i & 32) != 0 ? null : list, (i & 64) != 0 ? new DeviceDetailInfo(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1, 7, null) : deviceDetailInfo);
    }
}
