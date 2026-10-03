package com.oplus.smartsdk;

import android.os.Bundle;
import com.opos.process.bridge.base.BridgeConstant;
import java.util.Arrays;
import java.util.HashMap;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b!\b\u0086\b\u0018\u00002\u00020\u0001Bk\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\u0016\b\u0002\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\t\u0018\u00010\u000b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\r\u001a\u00020\u000e\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0010¢\u0006\u0002\u0010\u0011J\t\u0010#\u001a\u00020\u0003HÆ\u0003J\u000b\u0010$\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0010\u0010%\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010!J\u0010\u0010&\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0002\u0010\u001dJ\u0017\u0010'\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\t\u0018\u00010\u000bHÆ\u0003J\u000b\u0010(\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010)\u001a\u00020\u000eHÆ\u0003J\u000b\u0010*\u001a\u0004\u0018\u00010\u0010HÆ\u0003Jv\u0010+\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\u0016\b\u0002\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\t\u0018\u00010\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\r\u001a\u00020\u000e2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0010HÆ\u0001¢\u0006\u0002\u0010,J\u0013\u0010-\u001a\u00020\u000e2\b\u0010.\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010/\u001a\u00020\tH\u0016J\t\u00100\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u0010¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\r\u001a\u00020\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u001f\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\t\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0015\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\n\n\u0002\u0010\u001e\u001a\u0004\b\u001c\u0010\u001dR\u0013\u0010\f\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0013R\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\n\n\u0002\u0010\"\u001a\u0004\b \u0010!¨\u00061"}, d2 = {"Lcom/oplus/smartsdk/SmartApiInfo;", "", "data", "", "name", "", "version", "", "themeId", "", "idMaps", "Ljava/util/HashMap;", "value", "forceChangeCardUI", "", BridgeConstant.KEY_EXTRAS, "Landroid/os/Bundle;", "([BLjava/lang/String;Ljava/lang/Long;Ljava/lang/Integer;Ljava/util/HashMap;[BZLandroid/os/Bundle;)V", "getData", "()[B", "getExtras", "()Landroid/os/Bundle;", "getForceChangeCardUI", "()Z", "getIdMaps", "()Ljava/util/HashMap;", "getName", "()Ljava/lang/String;", "getThemeId", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getValue", "getVersion", "()Ljava/lang/Long;", "Ljava/lang/Long;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "([BLjava/lang/String;Ljava/lang/Long;Ljava/lang/Integer;Ljava/util/HashMap;[BZLandroid/os/Bundle;)Lcom/oplus/smartsdk/SmartApiInfo;", "equals", "other", "hashCode", "toString", "com.oplus.smartsdk.smartenginesdk"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final /* data */ class SmartApiInfo {

    @NotNull
    private final byte[] data;

    @Nullable
    private final Bundle extras;
    private final boolean forceChangeCardUI;

    @Nullable
    private final HashMap<String, Integer> idMaps;

    @Nullable
    private final String name;

    @Nullable
    private final Integer themeId;

    @Nullable
    private final byte[] value;

    @Nullable
    private final Long version;

    public SmartApiInfo(@NotNull byte[] data, @Nullable String str, @Nullable Long l2, @Nullable Integer num, @Nullable HashMap<String, Integer> map, @Nullable byte[] bArr, boolean z, @Nullable Bundle bundle) {
        Intrinsics.checkNotNullParameter(data, "data");
        this.data = data;
        this.name = str;
        this.version = l2;
        this.themeId = num;
        this.idMaps = map;
        this.value = bArr;
        this.forceChangeCardUI = z;
        this.extras = bundle;
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final byte[] getData() {
        return this.data;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getName() {
        return this.name;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Long getVersion() {
        return this.version;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final Integer getThemeId() {
        return this.themeId;
    }

    @Nullable
    public final HashMap<String, Integer> component5() {
        return this.idMaps;
    }

    @Nullable
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final byte[] getValue() {
        return this.value;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final boolean getForceChangeCardUI() {
        return this.forceChangeCardUI;
    }

    @Nullable
    /* JADX INFO: renamed from: component8, reason: from getter */
    public final Bundle getExtras() {
        return this.extras;
    }

    @NotNull
    public final SmartApiInfo copy(@NotNull byte[] data, @Nullable String name, @Nullable Long version, @Nullable Integer themeId, @Nullable HashMap<String, Integer> idMaps, @Nullable byte[] value, boolean forceChangeCardUI, @Nullable Bundle extras) {
        Intrinsics.checkNotNullParameter(data, "data");
        return new SmartApiInfo(data, name, version, themeId, idMaps, value, forceChangeCardUI, extras);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!Intrinsics.areEqual(SmartApiInfo.class, other == null ? null : other.getClass())) {
            return false;
        }
        if (other != null) {
            return Arrays.equals(this.data, ((SmartApiInfo) other).data);
        }
        throw new NullPointerException("null cannot be cast to non-null type com.oplus.smartsdk.SmartApiInfo");
    }

    @NotNull
    public final byte[] getData() {
        return this.data;
    }

    @Nullable
    public final Bundle getExtras() {
        return this.extras;
    }

    public final boolean getForceChangeCardUI() {
        return this.forceChangeCardUI;
    }

    @Nullable
    public final HashMap<String, Integer> getIdMaps() {
        return this.idMaps;
    }

    @Nullable
    public final String getName() {
        return this.name;
    }

    @Nullable
    public final Integer getThemeId() {
        return this.themeId;
    }

    @Nullable
    public final byte[] getValue() {
        return this.value;
    }

    @Nullable
    public final Long getVersion() {
        return this.version;
    }

    public int hashCode() {
        return Arrays.hashCode(this.data);
    }

    @NotNull
    public String toString() {
        return "SmartApiInfo(data=" + Arrays.toString(this.data) + ", name=" + ((Object) this.name) + ", version=" + this.version + ", themeId=" + this.themeId + ", idMaps=" + this.idMaps + ", value=" + Arrays.toString(this.value) + ", forceChangeCardUI=" + this.forceChangeCardUI + ", extras=" + this.extras + ')';
    }

    public /* synthetic */ SmartApiInfo(byte[] bArr, String str, Long l2, Integer num, HashMap map, byte[] bArr2, boolean z, Bundle bundle, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(bArr, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : l2, (i & 8) != 0 ? null : num, (i & 16) != 0 ? null : map, (i & 32) != 0 ? null : bArr2, (i & 64) != 0 ? false : z, (i & 128) == 0 ? bundle : null);
    }
}
