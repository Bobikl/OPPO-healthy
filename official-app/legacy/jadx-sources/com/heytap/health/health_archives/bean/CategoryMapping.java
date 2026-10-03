package com.heytap.health.health_archives.bean;

import androidx.annotation.Keep;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.collections.MapsKt__MapsKt;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes16.dex */
@Keep
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u0014\b\u0002\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u0015\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0005HÆ\u0003J)\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u0014\b\u0002\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u001d\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0014"}, d2 = {"Lcom/heytap/health/health_archives/bean/CategoryMapping;", "", "key", "", "translations", "", "(Ljava/lang/String;Ljava/util/Map;)V", "getKey", "()Ljava/lang/String;", "getTranslations", "()Ljava/util/Map;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "health_archives_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class CategoryMapping {

    @NotNull
    private final String key;

    @NotNull
    private final Map<String, String> translations;

    /* JADX WARN: Multi-variable type inference failed */
    public CategoryMapping() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ CategoryMapping copy$default(CategoryMapping categoryMapping, String str, Map map, int i, Object obj) {
        if ((i & 1) != 0) {
            str = categoryMapping.key;
        }
        if ((i & 2) != 0) {
            map = categoryMapping.translations;
        }
        return categoryMapping.copy(str, map);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getKey() {
        return this.key;
    }

    @NotNull
    public final Map<String, String> component2() {
        return this.translations;
    }

    @NotNull
    public final CategoryMapping copy(@NotNull String key, @NotNull Map<String, String> translations) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(translations, "translations");
        return new CategoryMapping(key, translations);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CategoryMapping)) {
            return false;
        }
        CategoryMapping categoryMapping = (CategoryMapping) other;
        return Intrinsics.areEqual(this.key, categoryMapping.key) && Intrinsics.areEqual(this.translations, categoryMapping.translations);
    }

    @NotNull
    public final String getKey() {
        return this.key;
    }

    @NotNull
    public final Map<String, String> getTranslations() {
        return this.translations;
    }

    public int hashCode() {
        return (this.key.hashCode() * 31) + this.translations.hashCode();
    }

    @NotNull
    public String toString() {
        return "CategoryMapping(key=" + this.key + ", translations=" + this.translations + ")";
    }

    public CategoryMapping(@NotNull String key, @NotNull Map<String, String> translations) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(translations, "translations");
        this.key = key;
        this.translations = translations;
    }

    public /* synthetic */ CategoryMapping(String str, Map map, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? MapsKt__MapsKt.emptyMap() : map);
    }
}
