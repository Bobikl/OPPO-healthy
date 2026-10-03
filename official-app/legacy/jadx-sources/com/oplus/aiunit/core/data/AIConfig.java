package com.oplus.aiunit.core.data;

import android.os.Bundle;
import com.oplus.smartenginehelper.ParserTag;
import com.oplus.utrace.db.UTraceSQLiteHelperKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;
import p010kotlin.Metadata;
import p010kotlin.jvm.JvmStatic;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0014\b\u0086\b\u0018\u0000 )2\u00020\u0001:\u0001)B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\t\u0010!\u001a\u00020\u0003HÆ\u0003J\t\u0010\"\u001a\u00020\u0005HÆ\u0003J\t\u0010#\u001a\u00020\u0007HÆ\u0003J'\u0010$\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010%\u001a\u00020\u00162\b\u0010&\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010'\u001a\u00020\u0005HÖ\u0001J\b\u0010(\u001a\u00020\u0003H\u0016R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u001a\u0010\r\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0012\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u000f\"\u0004\b\u0014\u0010\u0011R\u001a\u0010\u0015\u001a\u00020\u0016X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u000f\"\u0004\b\u001c\u0010\u0011R\u001a\u0010\u0006\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 ¨\u0006*"}, d2 = {"Lcom/oplus/aiunit/core/data/AIConfig;", "", "detectName", "", "unitId", "", "unitVersion", "", "(Ljava/lang/String;IJ)V", "getDetectName", "()Ljava/lang/String;", "setDetectName", "(Ljava/lang/String;)V", "minApi", "getMinApi", "()I", "setMinApi", "(I)V", "minSdk", "getMinSdk", "setMinSdk", "support", "", "getSupport", "()Z", "setSupport", "(Z)V", "getUnitId", "setUnitId", "getUnitVersion", "()J", "setUnitVersion", "(J)V", "component1", "component2", "component3", "copy", "equals", "other", "hashCode", "toString", "Companion", "aiunit.sdk.toolkits_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class AIConfig {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private String detectName;
    private int minApi;
    private int minSdk;
    private boolean support;
    private int unitId;
    private long unitVersion;

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\tH\u0007¨\u0006\n"}, d2 = {"Lcom/oplus/aiunit/core/data/AIConfig$Companion;", "", "()V", ParserTag.TAG_GET, "Lcom/oplus/aiunit/core/data/AIConfig;", UTraceSQLiteHelperKt.COL_INFO, "Landroid/os/Bundle;", "parse", "json", "Lorg/json/JSONObject;", "aiunit.sdk.toolkits_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        @NotNull
        public final AIConfig get(@NotNull Bundle info) {
            Intrinsics.checkNotNullParameter(info, "info");
            String string = info.getString("package::detect_name", "");
            Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
            AIConfig aIConfig = new AIConfig(string, info.getInt("package::unit_id", 0), info.getLong("package::unit_version", 0L));
            aIConfig.setSupport(info.getBoolean("package::unit_supported", true));
            aIConfig.setMinSdk(info.getInt("package::sdk_version", -1));
            if (aIConfig.getMinSdk() < 0) {
                aIConfig.setMinSdk(info.getInt("ai::key::client_protocol", 0));
            }
            aIConfig.setMinApi(info.getInt("package::unit_api_level", 0));
            return aIConfig;
        }

        @JvmStatic
        @NotNull
        public final AIConfig parse(@NotNull JSONObject json) {
            Intrinsics.checkNotNullParameter(json, "json");
            String strOptString = json.optString("detectName", "");
            Intrinsics.checkNotNullExpressionValue(strOptString, "optString(...)");
            AIConfig aIConfig = new AIConfig(strOptString, json.optInt("unitId", 0), json.optLong("unitVersion", 0L));
            aIConfig.setSupport(json.optBoolean("support", true));
            aIConfig.setMinSdk(json.optInt("minSdk", 0));
            aIConfig.setMinApi(json.optInt("minApi", 0));
            return aIConfig;
        }
    }

    public AIConfig(@NotNull String detectName, int i, long j2) {
        Intrinsics.checkNotNullParameter(detectName, "detectName");
        this.detectName = detectName;
        this.unitId = i;
        this.unitVersion = j2;
        this.support = true;
    }

    public static /* synthetic */ AIConfig copy$default(AIConfig aIConfig, String str, int i, long j2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = aIConfig.detectName;
        }
        if ((i2 & 2) != 0) {
            i = aIConfig.unitId;
        }
        if ((i2 & 4) != 0) {
            j2 = aIConfig.unitVersion;
        }
        return aIConfig.copy(str, i, j2);
    }

    @JvmStatic
    @NotNull
    public static final AIConfig get(@NotNull Bundle bundle) {
        return INSTANCE.get(bundle);
    }

    @JvmStatic
    @NotNull
    public static final AIConfig parse(@NotNull JSONObject jSONObject) {
        return INSTANCE.parse(jSONObject);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getDetectName() {
        return this.detectName;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getUnitId() {
        return this.unitId;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final long getUnitVersion() {
        return this.unitVersion;
    }

    @NotNull
    public final AIConfig copy(@NotNull String detectName, int unitId, long unitVersion) {
        Intrinsics.checkNotNullParameter(detectName, "detectName");
        return new AIConfig(detectName, unitId, unitVersion);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AIConfig)) {
            return false;
        }
        AIConfig aIConfig = (AIConfig) other;
        return Intrinsics.areEqual(this.detectName, aIConfig.detectName) && this.unitId == aIConfig.unitId && this.unitVersion == aIConfig.unitVersion;
    }

    @NotNull
    public final String getDetectName() {
        return this.detectName;
    }

    public final int getMinApi() {
        return this.minApi;
    }

    public final int getMinSdk() {
        return this.minSdk;
    }

    public final boolean getSupport() {
        return this.support;
    }

    public final int getUnitId() {
        return this.unitId;
    }

    public final long getUnitVersion() {
        return this.unitVersion;
    }

    public int hashCode() {
        return Long.hashCode(this.unitVersion) + ((Integer.hashCode(this.unitId) + (this.detectName.hashCode() * 31)) * 31);
    }

    public final void setDetectName(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.detectName = str;
    }

    public final void setMinApi(int i) {
        this.minApi = i;
    }

    public final void setMinSdk(int i) {
        this.minSdk = i;
    }

    public final void setSupport(boolean z) {
        this.support = z;
    }

    public final void setUnitId(int i) {
        this.unitId = i;
    }

    public final void setUnitVersion(long j2) {
        this.unitVersion = j2;
    }

    @NotNull
    public String toString() {
        return "AI(detectName=" + this.detectName + ", unitId=" + this.unitId + ", unitVersion=" + this.unitVersion + ", support=" + this.support + ", minSdk=" + this.minSdk + ", minApi=" + this.minApi + ')';
    }
}
