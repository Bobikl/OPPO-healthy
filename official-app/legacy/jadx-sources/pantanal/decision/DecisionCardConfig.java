package pantanal.decision;

import androidx.annotation.Keep;
import com.heytap.databaseengineservice.db.table.healtharchives.DBHealthReviewPlan;
import com.heytap.store.business.rn.service.RnConstant;
import com.oplus.pantanal.seedling.constants.Constants;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
@Keep
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b/\b\u0087\b\u0018\u00002\u00020\u0001B\u009b\u0001\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003\u0012\b\b\u0002\u0010\b\u001a\u00020\u0005\u0012\b\b\u0002\u0010\t\u001a\u00020\u0003\u0012\b\b\u0002\u0010\n\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0005\u0012\b\b\u0002\u0010\f\u001a\u00020\r\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0013\u001a\u00020\r¢\u0006\u0002\u0010\u0014J\t\u0010'\u001a\u00020\u0003HÆ\u0003J\t\u0010(\u001a\u00020\u0005HÆ\u0003J\t\u0010)\u001a\u00020\u0005HÆ\u0003J\t\u0010*\u001a\u00020\u0005HÆ\u0003J\t\u0010+\u001a\u00020\u0005HÆ\u0003J\t\u0010,\u001a\u00020\u0003HÆ\u0003J\t\u0010-\u001a\u00020\rHÆ\u0003J\t\u0010.\u001a\u00020\u0005HÆ\u0003J\t\u0010/\u001a\u00020\u0003HÆ\u0003J\t\u00100\u001a\u00020\u0003HÆ\u0003J\t\u00101\u001a\u00020\u0005HÆ\u0003J\t\u00102\u001a\u00020\u0003HÆ\u0003J\t\u00103\u001a\u00020\u0003HÆ\u0003J\t\u00104\u001a\u00020\u0005HÆ\u0003J\t\u00105\u001a\u00020\rHÆ\u0003J\u009f\u0001\u00106\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00052\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\u00052\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\u00052\b\b\u0002\u0010\u000f\u001a\u00020\u00052\b\b\u0002\u0010\u0010\u001a\u00020\u00052\b\b\u0002\u0010\u0011\u001a\u00020\u00052\b\b\u0002\u0010\u0012\u001a\u00020\u00032\b\b\u0002\u0010\u0013\u001a\u00020\rHÆ\u0001J\u0013\u00107\u001a\u00020\r2\b\u00108\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00109\u001a\u00020\u0005HÖ\u0001J\u0006\u0010:\u001a\u00020\rJ\t\u0010;\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u000b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\n\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0018R\u0011\u0010\u0012\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0018R\u0011\u0010\u0010\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0016R\u0011\u0010\u000e\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0016R\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0018R\u0011\u0010\t\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0018R\u0011\u0010\u0011\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u0018R\u0011\u0010\b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u0016R\u0011\u0010\f\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010#R\u0011\u0010\u0013\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b$\u0010#R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b%\u0010\u0016R\u0011\u0010\u000f\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b&\u0010\u0016¨\u0006<"}, d2 = {"Lpantanal/decision/DecisionCardConfig;", "", "serviceId", "", "type", "", "name", DBHealthReviewPlan.DESC, "size", "packageName", RnConstant.KEY_COMPONENT_NAME, "category", "supportActiveUpdate", "", "minActiveUpdateInterval", "updatePriority", "maxUpdateFrequency", "protocol", "instantCardUrl", Constants.SUPPORT_SUPER_CHANNEL, "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;IZIIIILjava/lang/String;Z)V", "getCategory", "()I", "getComponentName", "()Ljava/lang/String;", "getDesc", "getInstantCardUrl", "getMaxUpdateFrequency", "getMinActiveUpdateInterval", "getName", "getPackageName", "getProtocol", "getServiceId", "getSize", "getSupportActiveUpdate", "()Z", "getSupportSuperChannel", "getType", "getUpdatePriority", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "other", "hashCode", "isValid", "toString", "pantanal-interface_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class DecisionCardConfig {
    private final int category;

    @NotNull
    private final String componentName;

    @NotNull
    private final String desc;

    @NotNull
    private final String instantCardUrl;
    private final int maxUpdateFrequency;
    private final int minActiveUpdateInterval;

    @NotNull
    private final String name;

    @NotNull
    private final String packageName;
    private final int protocol;

    @NotNull
    private final String serviceId;
    private final int size;
    private final boolean supportActiveUpdate;
    private final boolean supportSuperChannel;
    private final int type;
    private final int updatePriority;

    public DecisionCardConfig() {
        this(null, 0, null, null, 0, null, null, 0, false, 0, 0, 0, 0, null, false, 32767, null);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getServiceId() {
        return this.serviceId;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final int getMinActiveUpdateInterval() {
        return this.minActiveUpdateInterval;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final int getUpdatePriority() {
        return this.updatePriority;
    }

    /* JADX INFO: renamed from: component12, reason: from getter */
    public final int getMaxUpdateFrequency() {
        return this.maxUpdateFrequency;
    }

    /* JADX INFO: renamed from: component13, reason: from getter */
    public final int getProtocol() {
        return this.protocol;
    }

    @NotNull
    /* JADX INFO: renamed from: component14, reason: from getter */
    public final String getInstantCardUrl() {
        return this.instantCardUrl;
    }

    /* JADX INFO: renamed from: component15, reason: from getter */
    public final boolean getSupportSuperChannel() {
        return this.supportSuperChannel;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getType() {
        return this.type;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getName() {
        return this.name;
    }

    @NotNull
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getDesc() {
        return this.desc;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final int getSize() {
        return this.size;
    }

    @NotNull
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getPackageName() {
        return this.packageName;
    }

    @NotNull
    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getComponentName() {
        return this.componentName;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final int getCategory() {
        return this.category;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final boolean getSupportActiveUpdate() {
        return this.supportActiveUpdate;
    }

    @NotNull
    public final DecisionCardConfig copy(@NotNull String serviceId, int type, @NotNull String name, @NotNull String desc, int size, @NotNull String packageName, @NotNull String componentName, int category, boolean supportActiveUpdate, int minActiveUpdateInterval, int updatePriority, int maxUpdateFrequency, int protocol, @NotNull String instantCardUrl, boolean supportSuperChannel) {
        Intrinsics.checkNotNullParameter(serviceId, "serviceId");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(desc, "desc");
        Intrinsics.checkNotNullParameter(packageName, "packageName");
        Intrinsics.checkNotNullParameter(componentName, "componentName");
        Intrinsics.checkNotNullParameter(instantCardUrl, "instantCardUrl");
        return new DecisionCardConfig(serviceId, type, name, desc, size, packageName, componentName, category, supportActiveUpdate, minActiveUpdateInterval, updatePriority, maxUpdateFrequency, protocol, instantCardUrl, supportSuperChannel);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DecisionCardConfig)) {
            return false;
        }
        DecisionCardConfig decisionCardConfig = (DecisionCardConfig) other;
        return Intrinsics.areEqual(this.serviceId, decisionCardConfig.serviceId) && this.type == decisionCardConfig.type && Intrinsics.areEqual(this.name, decisionCardConfig.name) && Intrinsics.areEqual(this.desc, decisionCardConfig.desc) && this.size == decisionCardConfig.size && Intrinsics.areEqual(this.packageName, decisionCardConfig.packageName) && Intrinsics.areEqual(this.componentName, decisionCardConfig.componentName) && this.category == decisionCardConfig.category && this.supportActiveUpdate == decisionCardConfig.supportActiveUpdate && this.minActiveUpdateInterval == decisionCardConfig.minActiveUpdateInterval && this.updatePriority == decisionCardConfig.updatePriority && this.maxUpdateFrequency == decisionCardConfig.maxUpdateFrequency && this.protocol == decisionCardConfig.protocol && Intrinsics.areEqual(this.instantCardUrl, decisionCardConfig.instantCardUrl) && this.supportSuperChannel == decisionCardConfig.supportSuperChannel;
    }

    public final int getCategory() {
        return this.category;
    }

    @NotNull
    public final String getComponentName() {
        return this.componentName;
    }

    @NotNull
    public final String getDesc() {
        return this.desc;
    }

    @NotNull
    public final String getInstantCardUrl() {
        return this.instantCardUrl;
    }

    public final int getMaxUpdateFrequency() {
        return this.maxUpdateFrequency;
    }

    public final int getMinActiveUpdateInterval() {
        return this.minActiveUpdateInterval;
    }

    @NotNull
    public final String getName() {
        return this.name;
    }

    @NotNull
    public final String getPackageName() {
        return this.packageName;
    }

    public final int getProtocol() {
        return this.protocol;
    }

    @NotNull
    public final String getServiceId() {
        return this.serviceId;
    }

    public final int getSize() {
        return this.size;
    }

    public final boolean getSupportActiveUpdate() {
        return this.supportActiveUpdate;
    }

    public final boolean getSupportSuperChannel() {
        return this.supportSuperChannel;
    }

    public final int getType() {
        return this.type;
    }

    public final int getUpdatePriority() {
        return this.updatePriority;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v17, types: [int] */
    /* JADX WARN: Type inference failed for: r0v29, types: [int] */
    /* JADX WARN: Type inference failed for: r1v15, types: [int] */
    /* JADX WARN: Type inference failed for: r1v26 */
    /* JADX WARN: Type inference failed for: r1v27 */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1, types: [int] */
    /* JADX WARN: Type inference failed for: r2v2 */
    public int hashCode() {
        int iHashCode = ((((((((((((((this.serviceId.hashCode() * 31) + Integer.hashCode(this.type)) * 31) + this.name.hashCode()) * 31) + this.desc.hashCode()) * 31) + Integer.hashCode(this.size)) * 31) + this.packageName.hashCode()) * 31) + this.componentName.hashCode()) * 31) + Integer.hashCode(this.category)) * 31;
        boolean z = this.supportActiveUpdate;
        ?? r1 = z;
        if (z) {
            r1 = 1;
        }
        int iHashCode2 = (((((((((((iHashCode + r1) * 31) + Integer.hashCode(this.minActiveUpdateInterval)) * 31) + Integer.hashCode(this.updatePriority)) * 31) + Integer.hashCode(this.maxUpdateFrequency)) * 31) + Integer.hashCode(this.protocol)) * 31) + this.instantCardUrl.hashCode()) * 31;
        boolean z2 = this.supportSuperChannel;
        return iHashCode2 + (z2 ? 1 : z2);
    }

    public final boolean isValid() {
        if (this.type == -1) {
            return false;
        }
        if (this.packageName.length() > 0) {
            return this.componentName.length() > 0;
        }
        return false;
    }

    @NotNull
    public String toString() {
        return "DecisionCardConfig(serviceId=" + this.serviceId + ", type=" + this.type + ", name=" + this.name + ", desc=" + this.desc + ", size=" + this.size + ", packageName=" + this.packageName + ", componentName=" + this.componentName + ", category=" + this.category + ", supportActiveUpdate=" + this.supportActiveUpdate + ", minActiveUpdateInterval=" + this.minActiveUpdateInterval + ", updatePriority=" + this.updatePriority + ", maxUpdateFrequency=" + this.maxUpdateFrequency + ", protocol=" + this.protocol + ", instantCardUrl=" + this.instantCardUrl + ", supportSuperChannel=" + this.supportSuperChannel + ")";
    }

    public DecisionCardConfig(@NotNull String serviceId, int i, @NotNull String name, @NotNull String desc, int i2, @NotNull String packageName, @NotNull String componentName, int i3, boolean z, int i4, int i5, int i6, int i7, @NotNull String instantCardUrl, boolean z2) {
        Intrinsics.checkNotNullParameter(serviceId, "serviceId");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(desc, "desc");
        Intrinsics.checkNotNullParameter(packageName, "packageName");
        Intrinsics.checkNotNullParameter(componentName, "componentName");
        Intrinsics.checkNotNullParameter(instantCardUrl, "instantCardUrl");
        this.serviceId = serviceId;
        this.type = i;
        this.name = name;
        this.desc = desc;
        this.size = i2;
        this.packageName = packageName;
        this.componentName = componentName;
        this.category = i3;
        this.supportActiveUpdate = z;
        this.minActiveUpdateInterval = i4;
        this.updatePriority = i5;
        this.maxUpdateFrequency = i6;
        this.protocol = i7;
        this.instantCardUrl = instantCardUrl;
        this.supportSuperChannel = z2;
    }

    public /* synthetic */ DecisionCardConfig(String str, int i, String str2, String str3, int i2, String str4, String str5, int i3, boolean z, int i4, int i5, int i6, int i7, String str6, boolean z2, int i8, DefaultConstructorMarker defaultConstructorMarker) {
        this((i8 & 1) != 0 ? "" : str, (i8 & 2) != 0 ? -1 : i, (i8 & 4) != 0 ? "" : str2, (i8 & 8) != 0 ? "" : str3, (i8 & 16) != 0 ? 2 : i2, (i8 & 32) != 0 ? "" : str4, (i8 & 64) != 0 ? "" : str5, (i8 & 128) == 0 ? i3 : 2, (i8 & 256) != 0 ? false : z, (i8 & 512) == 0 ? i4 : -1, (i8 & 1024) != 0 ? 1 : i5, (i8 & 2048) != 0 ? 1 : i6, (i8 & 4096) == 0 ? i7 : 1, (i8 & 8192) == 0 ? str6 : "", (i8 & 16384) != 0 ? false : z2);
    }
}
