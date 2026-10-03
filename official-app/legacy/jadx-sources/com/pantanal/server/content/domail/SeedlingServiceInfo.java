package com.pantanal.server.content.domail;

import android.graphics.drawable.Drawable;
import androidx.annotation.Keep;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.JvmStatic;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
@Keep
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u001d2\u00020\u0001:\u0001\u001dB/\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0002\u0010\tJ\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\bHÆ\u0003J=\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\bHÆ\u0001J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001J\t\u0010\u001c\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\r¨\u0006\u001e"}, d2 = {"Lcom/pantanal/server/content/domail/SeedlingServiceInfo;", "", "serviceId", "", "name", "subDomain", "subDomainDesc", "icon", "Landroid/graphics/drawable/Drawable;", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Landroid/graphics/drawable/Drawable;)V", "getIcon", "()Landroid/graphics/drawable/Drawable;", "getName", "()Ljava/lang/String;", "getServiceId", "getSubDomain", "getSubDomainDesc", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "Companion", "staticmanagersdk_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final /* data */ class SeedlingServiceInfo {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @Nullable
    private final Drawable icon;

    @NotNull
    private final String name;

    @NotNull
    private final String serviceId;

    @NotNull
    private final String subDomain;

    @NotNull
    private final String subDomainDesc;

    @Keep
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0007¨\u0006\u0005"}, d2 = {"Lcom/pantanal/server/content/domail/SeedlingServiceInfo$Companion;", "", "()V", "empty", "Lcom/pantanal/server/content/domail/SeedlingServiceInfo;", "staticmanagersdk_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        @NotNull
        public final SeedlingServiceInfo empty() {
            return new SeedlingServiceInfo("", "", "", "", null);
        }
    }

    public SeedlingServiceInfo(@NotNull String serviceId, @NotNull String name, @NotNull String subDomain, @NotNull String subDomainDesc, @Nullable Drawable drawable) {
        Intrinsics.checkNotNullParameter(serviceId, "serviceId");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(subDomain, "subDomain");
        Intrinsics.checkNotNullParameter(subDomainDesc, "subDomainDesc");
        this.serviceId = serviceId;
        this.name = name;
        this.subDomain = subDomain;
        this.subDomainDesc = subDomainDesc;
        this.icon = drawable;
    }

    public static /* synthetic */ SeedlingServiceInfo copy$default(SeedlingServiceInfo seedlingServiceInfo, String str, String str2, String str3, String str4, Drawable drawable, int i, Object obj) {
        if ((i & 1) != 0) {
            str = seedlingServiceInfo.serviceId;
        }
        if ((i & 2) != 0) {
            str2 = seedlingServiceInfo.name;
        }
        String str5 = str2;
        if ((i & 4) != 0) {
            str3 = seedlingServiceInfo.subDomain;
        }
        String str6 = str3;
        if ((i & 8) != 0) {
            str4 = seedlingServiceInfo.subDomainDesc;
        }
        String str7 = str4;
        if ((i & 16) != 0) {
            drawable = seedlingServiceInfo.icon;
        }
        return seedlingServiceInfo.copy(str, str5, str6, str7, drawable);
    }

    @JvmStatic
    @NotNull
    public static final SeedlingServiceInfo empty() {
        return INSTANCE.empty();
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getServiceId() {
        return this.serviceId;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getName() {
        return this.name;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getSubDomain() {
        return this.subDomain;
    }

    @NotNull
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getSubDomainDesc() {
        return this.subDomainDesc;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final Drawable getIcon() {
        return this.icon;
    }

    @NotNull
    public final SeedlingServiceInfo copy(@NotNull String serviceId, @NotNull String name, @NotNull String subDomain, @NotNull String subDomainDesc, @Nullable Drawable icon) {
        Intrinsics.checkNotNullParameter(serviceId, "serviceId");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(subDomain, "subDomain");
        Intrinsics.checkNotNullParameter(subDomainDesc, "subDomainDesc");
        return new SeedlingServiceInfo(serviceId, name, subDomain, subDomainDesc, icon);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SeedlingServiceInfo)) {
            return false;
        }
        SeedlingServiceInfo seedlingServiceInfo = (SeedlingServiceInfo) other;
        return Intrinsics.areEqual(this.serviceId, seedlingServiceInfo.serviceId) && Intrinsics.areEqual(this.name, seedlingServiceInfo.name) && Intrinsics.areEqual(this.subDomain, seedlingServiceInfo.subDomain) && Intrinsics.areEqual(this.subDomainDesc, seedlingServiceInfo.subDomainDesc) && Intrinsics.areEqual(this.icon, seedlingServiceInfo.icon);
    }

    @Nullable
    public final Drawable getIcon() {
        return this.icon;
    }

    @NotNull
    public final String getName() {
        return this.name;
    }

    @NotNull
    public final String getServiceId() {
        return this.serviceId;
    }

    @NotNull
    public final String getSubDomain() {
        return this.subDomain;
    }

    @NotNull
    public final String getSubDomainDesc() {
        return this.subDomainDesc;
    }

    public int hashCode() {
        int iHashCode = ((((((this.serviceId.hashCode() * 31) + this.name.hashCode()) * 31) + this.subDomain.hashCode()) * 31) + this.subDomainDesc.hashCode()) * 31;
        Drawable drawable = this.icon;
        return iHashCode + (drawable == null ? 0 : drawable.hashCode());
    }

    @NotNull
    public String toString() {
        return "SeedlingServiceInfo(serviceId=" + this.serviceId + ", name=" + this.name + ", subDomain=" + this.subDomain + ", subDomainDesc=" + this.subDomainDesc + ", icon=" + this.icon + ')';
    }
}
