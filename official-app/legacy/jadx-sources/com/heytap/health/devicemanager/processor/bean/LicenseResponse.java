package com.heytap.health.devicemanager.processor.bean;

import androidx.annotation.Keep;
import com.oplus.aiunit.vision.va5;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes16.dex */
@Keep
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0002\u0010\bJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0006HÆ\u0003J1\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0006HÖ\u0001R\u0011\u0010\u0007\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\r¨\u0006\u0019"}, d2 = {"Lcom/heytap/health/devicemanager/processor/bean/LicenseResponse;", "", "product_id", "", "key_version", va5.TAG_DEVICE_SN, "", "device_signature", "(IILjava/lang/String;Ljava/lang/String;)V", "getDevice_signature", "()Ljava/lang/String;", "getDevice_sn", "getKey_version", "()I", "getProduct_id", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "toString", "device_manager_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class LicenseResponse {

    @NotNull
    private final String device_signature;

    @NotNull
    private final String device_sn;
    private final int key_version;
    private final int product_id;

    public LicenseResponse(int i, int i2, @NotNull String device_sn, @NotNull String device_signature) {
        Intrinsics.checkNotNullParameter(device_sn, "device_sn");
        Intrinsics.checkNotNullParameter(device_signature, "device_signature");
        this.product_id = i;
        this.key_version = i2;
        this.device_sn = device_sn;
        this.device_signature = device_signature;
    }

    public static /* synthetic */ LicenseResponse copy$default(LicenseResponse licenseResponse, int i, int i2, String str, String str2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = licenseResponse.product_id;
        }
        if ((i3 & 2) != 0) {
            i2 = licenseResponse.key_version;
        }
        if ((i3 & 4) != 0) {
            str = licenseResponse.device_sn;
        }
        if ((i3 & 8) != 0) {
            str2 = licenseResponse.device_signature;
        }
        return licenseResponse.copy(i, i2, str, str2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getProduct_id() {
        return this.product_id;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getKey_version() {
        return this.key_version;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getDevice_sn() {
        return this.device_sn;
    }

    @NotNull
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getDevice_signature() {
        return this.device_signature;
    }

    @NotNull
    public final LicenseResponse copy(int product_id, int key_version, @NotNull String device_sn, @NotNull String device_signature) {
        Intrinsics.checkNotNullParameter(device_sn, "device_sn");
        Intrinsics.checkNotNullParameter(device_signature, "device_signature");
        return new LicenseResponse(product_id, key_version, device_sn, device_signature);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof LicenseResponse)) {
            return false;
        }
        LicenseResponse licenseResponse = (LicenseResponse) other;
        return this.product_id == licenseResponse.product_id && this.key_version == licenseResponse.key_version && Intrinsics.areEqual(this.device_sn, licenseResponse.device_sn) && Intrinsics.areEqual(this.device_signature, licenseResponse.device_signature);
    }

    @NotNull
    public final String getDevice_signature() {
        return this.device_signature;
    }

    @NotNull
    public final String getDevice_sn() {
        return this.device_sn;
    }

    public final int getKey_version() {
        return this.key_version;
    }

    public final int getProduct_id() {
        return this.product_id;
    }

    public int hashCode() {
        return (((((Integer.hashCode(this.product_id) * 31) + Integer.hashCode(this.key_version)) * 31) + this.device_sn.hashCode()) * 31) + this.device_signature.hashCode();
    }

    @NotNull
    public String toString() {
        return "LicenseResponse(product_id=" + this.product_id + ", key_version=" + this.key_version + ", device_sn=" + this.device_sn + ", device_signature=" + this.device_signature + ")";
    }
}
