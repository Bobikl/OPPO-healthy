package com.oplus.aiunit.vision;

import android.content.ComponentName;
import android.util.Pair;
import com.heytap.log.formatter.LogFieldKey;
import com.heytap.nearx.tangramconfig.strategy.Fields;
import com.heytap.store.business.rn.service.RnConstant;
import com.heytap.wearable.oms.common.Status;
import io.protostuff.MapSchema;
import java.util.ArrayList;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.oplus.aiunit.vision.qf3, reason: from toString */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b&\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B¡\u0001\u0012\u0006\u0010\f\u001a\u00020\u0002\u0012\u0006\u0010\u000f\u001a\u00020\u0002\u0012\u0006\u0010\u0012\u001a\u00020\u0002\u0012\u0006\u0010\u0015\u001a\u00020\u0002\u0012\u0006\u0010\u001a\u001a\u00020\u0004\u0012\b\u0010\u001c\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010!\u001a\u00020\u0002\u0012\u0006\u0010%\u001a\u00020\u0002\u0012\u0006\u0010(\u001a\u00020\u0002\u0012\u0006\u0010*\u001a\u00020\u0002\u0012\u0006\u0010-\u001a\u00020\u0002\u0012\b\u00101\u001a\u0004\u0018\u00010.\u0012\u0016\u00106\u001a\u0012\u0012\u0004\u0012\u00020\u000202j\b\u0012\u0004\u0012\u00020\u0002`3\u0012\u0012\u0010:\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u000207\u0012\b\b\u0002\u0010=\u001a\u00020\u0004¢\u0006\u0004\bA\u0010BJ\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\f\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\t\u0010\u000bR\u0017\u0010\u000f\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\r\u0010\n\u001a\u0004\b\u000e\u0010\u000bR\u0017\u0010\u0012\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\n\u001a\u0004\b\u0011\u0010\u000bR\u0017\u0010\u0015\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\n\u001a\u0004\b\u0014\u0010\u000bR\u0017\u0010\u001a\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0019\u0010\u001c\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u000e\u0010\n\u001a\u0004\b\u001b\u0010\u000bR\"\u0010!\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001d\u0010\n\u001a\u0004\b\u001e\u0010\u000b\"\u0004\b\u001f\u0010 R\"\u0010%\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\"\u0010\n\u001a\u0004\b#\u0010\u000b\"\u0004\b$\u0010 R\"\u0010(\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010\n\u001a\u0004\b&\u0010\u000b\"\u0004\b'\u0010 R\"\u0010*\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010\n\u001a\u0004\b\u0013\u0010\u000b\"\u0004\b)\u0010 R\"\u0010-\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b+\u0010\n\u001a\u0004\b\u0016\u0010\u000b\"\u0004\b,\u0010 R\u0019\u00101\u001a\u0004\u0018\u00010.8\u0006¢\u0006\f\n\u0004\b\u001e\u0010/\u001a\u0004\b\u0010\u00100R'\u00106\u001a\u0012\u0012\u0004\u0012\u00020\u000202j\b\u0012\u0004\u0012\u00020\u0002`38\u0006¢\u0006\f\n\u0004\b#\u00104\u001a\u0004\b\u001d\u00105R#\u0010:\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0002078\u0006¢\u0006\f\n\u0004\b&\u00108\u001a\u0004\b\r\u00109R\"\u0010=\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0018\u0010\u0017\u001a\u0004\b\"\u0010\u0019\"\u0004\b;\u0010<R\u0011\u0010@\u001a\u00020>8F¢\u0006\u0006\u001a\u0004\b+\u0010?¨\u0006C"}, d2 = {"Lcom/oplus/aiunit/vision/qf3;", "", "", "toString", "", "hashCode", "other", "", "equals", "a", "Ljava/lang/String;", "()Ljava/lang/String;", "appName", "b", "f", "packageName", "c", "i", "signatureMD5", "d", "j", "signatureSHA256", MapSchema.FIELD_NAME_ENTRY, "I", "o", "()I", "versionCode", LogFieldKey.PROCESS_NAME_KEY, "versionName", b2n.f, LogFieldKey.LEVEL_KEY, "setTargetPackageName", "(Ljava/lang/String;)V", ebe.TARGET_PACKAGE_NAME, b2n.g, LogFieldKey.MESSAGE_KEY, "setTargetSignatureMD5", "targetSignatureMD5", "n", "setTargetSignatureSHA256", "targetSignatureSHA256", "setMcuTargetPackageName", "mcuTargetPackageName", MapSchema.FIELD_NAME_KEY, "setMcuTargetSignatureSHA256", "mcuTargetSignatureSHA256", "Landroid/content/ComponentName;", "Landroid/content/ComponentName;", "()Landroid/content/ComponentName;", RnConstant.KEY_COMPONENT_NAME, "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "Ljava/util/ArrayList;", "()Ljava/util/ArrayList;", "privacyPermission", "Landroid/util/Pair;", "Landroid/util/Pair;", "()Landroid/util/Pair;", "authPair", "q", "(I)V", Fields.SDK_VERSION, "Lcom/heytap/wearable/oms/common/Status;", "()Lcom/heytap/wearable/oms/common/Status;", "status", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Landroid/content/ComponentName;Ljava/util/ArrayList;Landroid/util/Pair;I)V", "thirdparty_impl_release"}, k = 1, mv = {1, 8, 0})
public final /* data */ class ClientInfo {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    @NotNull
    public final String appName;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    @NotNull
    public final String packageName;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    @NotNull
    public final String signatureMD5;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata and from toString */
    @NotNull
    public final String signatureSHA256;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    public final int versionCode;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata and from toString */
    @Nullable
    public final String versionName;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata and from toString */
    @NotNull
    public String targetPackageName;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata and from toString */
    @NotNull
    public String targetSignatureMD5;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata and from toString */
    @NotNull
    public String targetSignatureSHA256;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata and from toString */
    @NotNull
    public String mcuTargetPackageName;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata and from toString */
    @NotNull
    public String mcuTargetSignatureSHA256;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata and from toString */
    @Nullable
    public final ComponentName componentName;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata and from toString */
    @NotNull
    public final ArrayList<String> privacyPermission;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata and from toString */
    @NotNull
    public final Pair<Integer, String> authPair;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata and from toString */
    public int sdkVersion;

    public ClientInfo(@NotNull String appName, @NotNull String packageName, @NotNull String signatureMD5, @NotNull String signatureSHA256, int i, @Nullable String str, @NotNull String targetPackageName, @NotNull String targetSignatureMD5, @NotNull String targetSignatureSHA256, @NotNull String mcuTargetPackageName, @NotNull String mcuTargetSignatureSHA256, @Nullable ComponentName componentName, @NotNull ArrayList<String> privacyPermission, @NotNull Pair<Integer, String> authPair, int i2) {
        Intrinsics.checkNotNullParameter(appName, "appName");
        Intrinsics.checkNotNullParameter(packageName, "packageName");
        Intrinsics.checkNotNullParameter(signatureMD5, "signatureMD5");
        Intrinsics.checkNotNullParameter(signatureSHA256, "signatureSHA256");
        Intrinsics.checkNotNullParameter(targetPackageName, "targetPackageName");
        Intrinsics.checkNotNullParameter(targetSignatureMD5, "targetSignatureMD5");
        Intrinsics.checkNotNullParameter(targetSignatureSHA256, "targetSignatureSHA256");
        Intrinsics.checkNotNullParameter(mcuTargetPackageName, "mcuTargetPackageName");
        Intrinsics.checkNotNullParameter(mcuTargetSignatureSHA256, "mcuTargetSignatureSHA256");
        Intrinsics.checkNotNullParameter(privacyPermission, "privacyPermission");
        Intrinsics.checkNotNullParameter(authPair, "authPair");
        this.appName = appName;
        this.packageName = packageName;
        this.signatureMD5 = signatureMD5;
        this.signatureSHA256 = signatureSHA256;
        this.versionCode = i;
        this.versionName = str;
        this.targetPackageName = targetPackageName;
        this.targetSignatureMD5 = targetSignatureMD5;
        this.targetSignatureSHA256 = targetSignatureSHA256;
        this.mcuTargetPackageName = mcuTargetPackageName;
        this.mcuTargetSignatureSHA256 = mcuTargetSignatureSHA256;
        this.componentName = componentName;
        this.privacyPermission = privacyPermission;
        this.authPair = authPair;
        this.sdkVersion = i2;
    }

    @NotNull
    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getAppName() {
        return this.appName;
    }

    @NotNull
    public final Pair<Integer, String> b() {
        return this.authPair;
    }

    @Nullable
    /* JADX INFO: renamed from: c, reason: from getter */
    public final ComponentName getComponentName() {
        return this.componentName;
    }

    @NotNull
    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getMcuTargetPackageName() {
        return this.mcuTargetPackageName;
    }

    @NotNull
    /* JADX INFO: renamed from: e, reason: from getter */
    public final String getMcuTargetSignatureSHA256() {
        return this.mcuTargetSignatureSHA256;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ClientInfo)) {
            return false;
        }
        ClientInfo clientInfo = (ClientInfo) other;
        return Intrinsics.areEqual(this.appName, clientInfo.appName) && Intrinsics.areEqual(this.packageName, clientInfo.packageName) && Intrinsics.areEqual(this.signatureMD5, clientInfo.signatureMD5) && Intrinsics.areEqual(this.signatureSHA256, clientInfo.signatureSHA256) && this.versionCode == clientInfo.versionCode && Intrinsics.areEqual(this.versionName, clientInfo.versionName) && Intrinsics.areEqual(this.targetPackageName, clientInfo.targetPackageName) && Intrinsics.areEqual(this.targetSignatureMD5, clientInfo.targetSignatureMD5) && Intrinsics.areEqual(this.targetSignatureSHA256, clientInfo.targetSignatureSHA256) && Intrinsics.areEqual(this.mcuTargetPackageName, clientInfo.mcuTargetPackageName) && Intrinsics.areEqual(this.mcuTargetSignatureSHA256, clientInfo.mcuTargetSignatureSHA256) && Intrinsics.areEqual(this.componentName, clientInfo.componentName) && Intrinsics.areEqual(this.privacyPermission, clientInfo.privacyPermission) && Intrinsics.areEqual(this.authPair, clientInfo.authPair) && this.sdkVersion == clientInfo.sdkVersion;
    }

    @NotNull
    /* JADX INFO: renamed from: f, reason: from getter */
    public final String getPackageName() {
        return this.packageName;
    }

    @NotNull
    public final ArrayList<String> g() {
        return this.privacyPermission;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final int getSdkVersion() {
        return this.sdkVersion;
    }

    public int hashCode() {
        int iHashCode = ((((((((this.appName.hashCode() * 31) + this.packageName.hashCode()) * 31) + this.signatureMD5.hashCode()) * 31) + this.signatureSHA256.hashCode()) * 31) + Integer.hashCode(this.versionCode)) * 31;
        String str = this.versionName;
        int iHashCode2 = (((((((((((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + this.targetPackageName.hashCode()) * 31) + this.targetSignatureMD5.hashCode()) * 31) + this.targetSignatureSHA256.hashCode()) * 31) + this.mcuTargetPackageName.hashCode()) * 31) + this.mcuTargetSignatureSHA256.hashCode()) * 31;
        ComponentName componentName = this.componentName;
        return ((((((iHashCode2 + (componentName != null ? componentName.hashCode() : 0)) * 31) + this.privacyPermission.hashCode()) * 31) + this.authPair.hashCode()) * 31) + Integer.hashCode(this.sdkVersion);
    }

    @NotNull
    /* JADX INFO: renamed from: i, reason: from getter */
    public final String getSignatureMD5() {
        return this.signatureMD5;
    }

    @NotNull
    /* JADX INFO: renamed from: j, reason: from getter */
    public final String getSignatureSHA256() {
        return this.signatureSHA256;
    }

    @NotNull
    public final Status k() {
        if (this.targetPackageName.length() == 0) {
            if (this.mcuTargetPackageName.length() == 0) {
                return new Status(23, null, 2, null);
            }
        }
        if (this.targetSignatureMD5.length() == 0) {
            if (this.targetSignatureSHA256.length() == 0) {
                if (this.mcuTargetSignatureSHA256.length() == 0) {
                    return new Status(24, null, 2, null);
                }
            }
        }
        return new Status(0, null, 2, null);
    }

    @NotNull
    /* JADX INFO: renamed from: l, reason: from getter */
    public final String getTargetPackageName() {
        return this.targetPackageName;
    }

    @NotNull
    /* JADX INFO: renamed from: m, reason: from getter */
    public final String getTargetSignatureMD5() {
        return this.targetSignatureMD5;
    }

    @NotNull
    /* JADX INFO: renamed from: n, reason: from getter */
    public final String getTargetSignatureSHA256() {
        return this.targetSignatureSHA256;
    }

    /* JADX INFO: renamed from: o, reason: from getter */
    public final int getVersionCode() {
        return this.versionCode;
    }

    @Nullable
    /* JADX INFO: renamed from: p, reason: from getter */
    public final String getVersionName() {
        return this.versionName;
    }

    public final void q(int i) {
        this.sdkVersion = i;
    }

    @NotNull
    public String toString() {
        return "ClientInfo(appName=" + this.appName + ", packageName=" + this.packageName + ", signatureMD5=" + this.signatureMD5 + ", signatureSHA256=" + this.signatureSHA256 + ", versionCode=" + this.versionCode + ", versionName=" + this.versionName + ", targetPackageName=" + this.targetPackageName + ", targetSignatureMD5=" + this.targetSignatureMD5 + ", targetSignatureSHA256=" + this.targetSignatureSHA256 + ", mcuTargetPackageName=" + this.mcuTargetPackageName + ", mcuTargetSignatureSHA256=" + this.mcuTargetSignatureSHA256 + ", componentName=" + this.componentName + ", privacyPermission=" + this.privacyPermission + ", authPair=" + this.authPair + ", sdkVersion=" + this.sdkVersion + ")";
    }

    public /* synthetic */ ClientInfo(String str, String str2, String str3, String str4, int i, String str5, String str6, String str7, String str8, String str9, String str10, ComponentName componentName, ArrayList arrayList, Pair pair, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, str4, i, str5, str6, str7, str8, str9, str10, componentName, arrayList, pair, (i3 & 16384) != 0 ? 0 : i2);
    }
}
