package org.hapjs.card.sdk;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u001d\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B=\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\b¢\u0006\u0002\u0010\u000bJ\t\u0010\u001d\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001f\u001a\u00020\u0003HÆ\u0003J\t\u0010 \u001a\u00020\u0003HÆ\u0003J\t\u0010!\u001a\u00020\bHÆ\u0003J\t\u0010\"\u001a\u00020\u0003HÆ\u0003J\t\u0010#\u001a\u00020\bHÆ\u0003JO\u0010$\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\bHÆ\u0001J\u0013\u0010%\u001a\u00020&2\b\u0010'\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010(\u001a\u00020\bHÖ\u0001J\t\u0010)\u001a\u00020\u0003HÖ\u0001R\u001a\u0010\n\u001a\u00020\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0010\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0012R\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0012R\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0012R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0012R\u001a\u0010\u0007\u001a\u00020\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\r\"\u0004\b\u001a\u0010\u000fR\u001a\u0010\t\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u0012\"\u0004\b\u001c\u0010\u0014¨\u0006*"}, d2 = {"Lorg/hapjs/card/sdk/CardPluginInfo;", "", "sourceDir", "", "nativeLibraries", "optimizedDir", "packageName", "versionCode", "", "versionName", CardServiceLoader.KEY_ENGINE_CODE, "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;I)V", "getEngineCode", "()I", "setEngineCode", "(I)V", "entryClass", "getEntryClass", "()Ljava/lang/String;", "setEntryClass", "(Ljava/lang/String;)V", "getNativeLibraries", "getOptimizedDir", "getPackageName", "getSourceDir", "getVersionCode", "setVersionCode", "getVersionName", "setVersionName", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "", "other", "hashCode", "toString", "card-sdk_liteRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class CardPluginInfo {
    private int engineCode;

    @NotNull
    private String entryClass;

    @NotNull
    private final String nativeLibraries;

    @NotNull
    private final String optimizedDir;

    @NotNull
    private final String packageName;

    @NotNull
    private final String sourceDir;
    private int versionCode;

    @NotNull
    private String versionName;

    public CardPluginInfo(@NotNull String sourceDir, @NotNull String nativeLibraries, @NotNull String optimizedDir, @NotNull String packageName, int i, @NotNull String versionName, int i2) {
        Intrinsics.checkNotNullParameter(sourceDir, "sourceDir");
        Intrinsics.checkNotNullParameter(nativeLibraries, "nativeLibraries");
        Intrinsics.checkNotNullParameter(optimizedDir, "optimizedDir");
        Intrinsics.checkNotNullParameter(packageName, "packageName");
        Intrinsics.checkNotNullParameter(versionName, "versionName");
        this.sourceDir = sourceDir;
        this.nativeLibraries = nativeLibraries;
        this.optimizedDir = optimizedDir;
        this.packageName = packageName;
        this.versionCode = i;
        this.versionName = versionName;
        this.engineCode = i2;
        this.entryClass = "";
    }

    public static /* synthetic */ CardPluginInfo copy$default(CardPluginInfo cardPluginInfo, String str, String str2, String str3, String str4, int i, String str5, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            str = cardPluginInfo.sourceDir;
        }
        if ((i3 & 2) != 0) {
            str2 = cardPluginInfo.nativeLibraries;
        }
        String str6 = str2;
        if ((i3 & 4) != 0) {
            str3 = cardPluginInfo.optimizedDir;
        }
        String str7 = str3;
        if ((i3 & 8) != 0) {
            str4 = cardPluginInfo.packageName;
        }
        String str8 = str4;
        if ((i3 & 16) != 0) {
            i = cardPluginInfo.versionCode;
        }
        int i4 = i;
        if ((i3 & 32) != 0) {
            str5 = cardPluginInfo.versionName;
        }
        String str9 = str5;
        if ((i3 & 64) != 0) {
            i2 = cardPluginInfo.engineCode;
        }
        return cardPluginInfo.copy(str, str6, str7, str8, i4, str9, i2);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getSourceDir() {
        return this.sourceDir;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getNativeLibraries() {
        return this.nativeLibraries;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getOptimizedDir() {
        return this.optimizedDir;
    }

    @NotNull
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getPackageName() {
        return this.packageName;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final int getVersionCode() {
        return this.versionCode;
    }

    @NotNull
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getVersionName() {
        return this.versionName;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final int getEngineCode() {
        return this.engineCode;
    }

    @NotNull
    public final CardPluginInfo copy(@NotNull String sourceDir, @NotNull String nativeLibraries, @NotNull String optimizedDir, @NotNull String packageName, int versionCode, @NotNull String versionName, int engineCode) {
        Intrinsics.checkNotNullParameter(sourceDir, "sourceDir");
        Intrinsics.checkNotNullParameter(nativeLibraries, "nativeLibraries");
        Intrinsics.checkNotNullParameter(optimizedDir, "optimizedDir");
        Intrinsics.checkNotNullParameter(packageName, "packageName");
        Intrinsics.checkNotNullParameter(versionName, "versionName");
        return new CardPluginInfo(sourceDir, nativeLibraries, optimizedDir, packageName, versionCode, versionName, engineCode);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CardPluginInfo)) {
            return false;
        }
        CardPluginInfo cardPluginInfo = (CardPluginInfo) other;
        return Intrinsics.areEqual(this.sourceDir, cardPluginInfo.sourceDir) && Intrinsics.areEqual(this.nativeLibraries, cardPluginInfo.nativeLibraries) && Intrinsics.areEqual(this.optimizedDir, cardPluginInfo.optimizedDir) && Intrinsics.areEqual(this.packageName, cardPluginInfo.packageName) && this.versionCode == cardPluginInfo.versionCode && Intrinsics.areEqual(this.versionName, cardPluginInfo.versionName) && this.engineCode == cardPluginInfo.engineCode;
    }

    public final int getEngineCode() {
        return this.engineCode;
    }

    @NotNull
    public final String getEntryClass() {
        return this.entryClass;
    }

    @NotNull
    public final String getNativeLibraries() {
        return this.nativeLibraries;
    }

    @NotNull
    public final String getOptimizedDir() {
        return this.optimizedDir;
    }

    @NotNull
    public final String getPackageName() {
        return this.packageName;
    }

    @NotNull
    public final String getSourceDir() {
        return this.sourceDir;
    }

    public final int getVersionCode() {
        return this.versionCode;
    }

    @NotNull
    public final String getVersionName() {
        return this.versionName;
    }

    public int hashCode() {
        return (((((((((((this.sourceDir.hashCode() * 31) + this.nativeLibraries.hashCode()) * 31) + this.optimizedDir.hashCode()) * 31) + this.packageName.hashCode()) * 31) + Integer.hashCode(this.versionCode)) * 31) + this.versionName.hashCode()) * 31) + Integer.hashCode(this.engineCode);
    }

    public final void setEngineCode(int i) {
        this.engineCode = i;
    }

    public final void setEntryClass(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.entryClass = str;
    }

    public final void setVersionCode(int i) {
        this.versionCode = i;
    }

    public final void setVersionName(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.versionName = str;
    }

    @NotNull
    public String toString() {
        return "CardPluginInfo(sourceDir=" + this.sourceDir + ", nativeLibraries=" + this.nativeLibraries + ", optimizedDir=" + this.optimizedDir + ", packageName=" + this.packageName + ", versionCode=" + this.versionCode + ", versionName=" + this.versionName + ", engineCode=" + this.engineCode + ')';
    }
}
