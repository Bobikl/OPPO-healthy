package com.heytap.health.health_archives.bean;

import androidx.annotation.Keep;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.collections.CollectionsKt__CollectionsKt;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes16.dex */
@Keep
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0002\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J#\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001R\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, d2 = {"Lcom/heytap/health/health_archives/bean/CategoryI18nConfig;", "", "version", "", "mappings", "", "Lcom/heytap/health/health_archives/bean/CategoryMapping;", "(ILjava/util/List;)V", "getMappings", "()Ljava/util/List;", "getVersion", "()I", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "", "health_archives_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class CategoryI18nConfig {

    @NotNull
    private final List<CategoryMapping> mappings;
    private final int version;

    /* JADX WARN: Multi-variable type inference failed */
    public CategoryI18nConfig() {
        this(0, null, 3, 0 == true ? 1 : 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ CategoryI18nConfig copy$default(CategoryI18nConfig categoryI18nConfig, int i, List list, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = categoryI18nConfig.version;
        }
        if ((i2 & 2) != 0) {
            list = categoryI18nConfig.mappings;
        }
        return categoryI18nConfig.copy(i, list);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getVersion() {
        return this.version;
    }

    @NotNull
    public final List<CategoryMapping> component2() {
        return this.mappings;
    }

    @NotNull
    public final CategoryI18nConfig copy(int version, @NotNull List<CategoryMapping> mappings) {
        Intrinsics.checkNotNullParameter(mappings, "mappings");
        return new CategoryI18nConfig(version, mappings);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CategoryI18nConfig)) {
            return false;
        }
        CategoryI18nConfig categoryI18nConfig = (CategoryI18nConfig) other;
        return this.version == categoryI18nConfig.version && Intrinsics.areEqual(this.mappings, categoryI18nConfig.mappings);
    }

    @NotNull
    public final List<CategoryMapping> getMappings() {
        return this.mappings;
    }

    public final int getVersion() {
        return this.version;
    }

    public int hashCode() {
        return (Integer.hashCode(this.version) * 31) + this.mappings.hashCode();
    }

    @NotNull
    public String toString() {
        return "CategoryI18nConfig(version=" + this.version + ", mappings=" + this.mappings + ")";
    }

    public CategoryI18nConfig(int i, @NotNull List<CategoryMapping> mappings) {
        Intrinsics.checkNotNullParameter(mappings, "mappings");
        this.version = i;
        this.mappings = mappings;
    }

    public /* synthetic */ CategoryI18nConfig(int i, List list, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 0 : i, (i2 & 2) != 0 ? CollectionsKt__CollectionsKt.emptyList() : list);
    }
}
