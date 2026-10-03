package com.heytap.nearx.cloudconfig.bean;

import com.heytap.nearx.tangramconfig.strategy.Fields;
import com.oplus.aiunit.vision.qam;
import java.lang.reflect.Type;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.collections.CollectionsKt__CollectionsKt;
import p010kotlin.collections.CollectionsKt___CollectionsKt;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes17.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010%\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001Bk\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0014\b\u0002\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0005\u0012\u0014\b\u0002\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0001\u0012\u0014\b\u0002\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u0005\u0012\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n¢\u0006\u0002\u0010\fJ\u0016\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u00032\u0006\u0010\u001c\u001a\u00020\u0003J\u0016\u0010\u001d\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u00032\u0006\u0010\u001c\u001a\u00020\u0003J\t\u0010\u001e\u001a\u00020\u0003HÆ\u0003J\u0015\u0010\u001f\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0005HÆ\u0003J\u0015\u0010 \u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0005HÆ\u0003J\u000b\u0010!\u001a\u0004\u0018\u00010\u0001HÆ\u0003J\u0015\u0010\"\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u0005HÆ\u0003J\u000f\u0010#\u001a\b\u0012\u0004\u0012\u00020\u000b0\nHÆ\u0003Jq\u0010$\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u0014\b\u0002\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u00052\u0014\b\u0002\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00012\u0014\b\u0002\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u00052\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\nHÆ\u0001J\u0006\u0010\t\u001a\u00020\u000bJ\u0013\u0010%\u001a\u00020&2\b\u0010'\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\u0016\u0010(\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u00032\u0006\u0010\u001c\u001a\u00020\u0001J\t\u0010)\u001a\u00020*HÖ\u0001J\u0006\u0010+\u001a\u00020\u000bJ\t\u0010,\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u0001X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u0017\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u001d\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u001d\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0016R\u001d\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0016¨\u0006-"}, d2 = {"Lcom/heytap/nearx/cloudconfig/bean/EntityQueryParams;", "", Fields.CONFIG_CODE, "", "queryMap", "", "queryLike", "defaultValue", qam.y, "entityType", "", "Ljava/lang/reflect/Type;", "(Ljava/lang/String;Ljava/util/Map;Ljava/util/Map;Ljava/lang/Object;Ljava/util/Map;Ljava/util/List;)V", "getConfigCode", "()Ljava/lang/String;", "getDefaultValue", "()Ljava/lang/Object;", "setDefaultValue", "(Ljava/lang/Object;)V", "getEntityType", "()Ljava/util/List;", "getExtInfo", "()Ljava/util/Map;", "getQueryLike", "getQueryMap", "appendLikeParam", "", "key", "value", "appendParam", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "extParam", "hashCode", "", "resultType", "toString", "com.heytap.nearx.cloudconfig"}, k = 1, mv = {1, 1, 16})
public final /* data */ class EntityQueryParams {

    @NotNull
    private final String configCode;

    @Nullable
    private Object defaultValue;

    @NotNull
    private final List<Type> entityType;

    @NotNull
    private final Map<String, Object> extInfo;

    @NotNull
    private final Map<String, String> queryLike;

    @NotNull
    private final Map<String, String> queryMap;

    /* JADX WARN: Multi-variable type inference failed */
    public EntityQueryParams(@NotNull String configCode, @NotNull Map<String, String> queryMap, @NotNull Map<String, String> queryLike, @Nullable Object obj, @NotNull Map<String, Object> extInfo, @NotNull List<? extends Type> entityType) {
        Intrinsics.checkParameterIsNotNull(configCode, "configCode");
        Intrinsics.checkParameterIsNotNull(queryMap, "queryMap");
        Intrinsics.checkParameterIsNotNull(queryLike, "queryLike");
        Intrinsics.checkParameterIsNotNull(extInfo, "extInfo");
        Intrinsics.checkParameterIsNotNull(entityType, "entityType");
        this.configCode = configCode;
        this.queryMap = queryMap;
        this.queryLike = queryLike;
        this.defaultValue = obj;
        this.extInfo = extInfo;
        this.entityType = entityType;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ EntityQueryParams copy$default(EntityQueryParams entityQueryParams, String str, Map map, Map map2, Object obj, Map map3, List list, int i, Object obj2) {
        if ((i & 1) != 0) {
            str = entityQueryParams.configCode;
        }
        if ((i & 2) != 0) {
            map = entityQueryParams.queryMap;
        }
        Map map4 = map;
        if ((i & 4) != 0) {
            map2 = entityQueryParams.queryLike;
        }
        Map map5 = map2;
        if ((i & 8) != 0) {
            obj = entityQueryParams.defaultValue;
        }
        Object obj3 = obj;
        if ((i & 16) != 0) {
            map3 = entityQueryParams.extInfo;
        }
        Map map6 = map3;
        if ((i & 32) != 0) {
            list = entityQueryParams.entityType;
        }
        return entityQueryParams.copy(str, map4, map5, obj3, map6, list);
    }

    public final void appendLikeParam(@NotNull String key, @NotNull String value) {
        Intrinsics.checkParameterIsNotNull(key, "key");
        Intrinsics.checkParameterIsNotNull(value, "value");
        this.queryLike.put(key, value);
    }

    public final void appendParam(@NotNull String key, @NotNull String value) {
        Intrinsics.checkParameterIsNotNull(key, "key");
        Intrinsics.checkParameterIsNotNull(value, "value");
        this.queryMap.put(key, value);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getConfigCode() {
        return this.configCode;
    }

    @NotNull
    public final Map<String, String> component2() {
        return this.queryMap;
    }

    @NotNull
    public final Map<String, String> component3() {
        return this.queryLike;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final Object getDefaultValue() {
        return this.defaultValue;
    }

    @NotNull
    public final Map<String, Object> component5() {
        return this.extInfo;
    }

    @NotNull
    public final List<Type> component6() {
        return this.entityType;
    }

    @NotNull
    public final EntityQueryParams copy(@NotNull String configCode, @NotNull Map<String, String> queryMap, @NotNull Map<String, String> queryLike, @Nullable Object defaultValue, @NotNull Map<String, Object> extInfo, @NotNull List<? extends Type> entityType) {
        Intrinsics.checkParameterIsNotNull(configCode, "configCode");
        Intrinsics.checkParameterIsNotNull(queryMap, "queryMap");
        Intrinsics.checkParameterIsNotNull(queryLike, "queryLike");
        Intrinsics.checkParameterIsNotNull(extInfo, "extInfo");
        Intrinsics.checkParameterIsNotNull(entityType, "entityType");
        return new EntityQueryParams(configCode, queryMap, queryLike, defaultValue, extInfo, entityType);
    }

    @NotNull
    public final Type entityType() {
        return (Type) CollectionsKt___CollectionsKt.last((List) this.entityType);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof EntityQueryParams)) {
            return false;
        }
        EntityQueryParams entityQueryParams = (EntityQueryParams) other;
        return Intrinsics.areEqual(this.configCode, entityQueryParams.configCode) && Intrinsics.areEqual(this.queryMap, entityQueryParams.queryMap) && Intrinsics.areEqual(this.queryLike, entityQueryParams.queryLike) && Intrinsics.areEqual(this.defaultValue, entityQueryParams.defaultValue) && Intrinsics.areEqual(this.extInfo, entityQueryParams.extInfo) && Intrinsics.areEqual(this.entityType, entityQueryParams.entityType);
    }

    public final void extParam(@NotNull String key, @NotNull Object value) {
        Intrinsics.checkParameterIsNotNull(key, "key");
        Intrinsics.checkParameterIsNotNull(value, "value");
        this.extInfo.put(key, value);
    }

    @NotNull
    public final String getConfigCode() {
        return this.configCode;
    }

    @Nullable
    public final Object getDefaultValue() {
        return this.defaultValue;
    }

    @NotNull
    public final List<Type> getEntityType() {
        return this.entityType;
    }

    @NotNull
    public final Map<String, Object> getExtInfo() {
        return this.extInfo;
    }

    @NotNull
    public final Map<String, String> getQueryLike() {
        return this.queryLike;
    }

    @NotNull
    public final Map<String, String> getQueryMap() {
        return this.queryMap;
    }

    public int hashCode() {
        String str = this.configCode;
        int iHashCode = (str != null ? str.hashCode() : 0) * 31;
        Map<String, String> map = this.queryMap;
        int iHashCode2 = (iHashCode + (map != null ? map.hashCode() : 0)) * 31;
        Map<String, String> map2 = this.queryLike;
        int iHashCode3 = (iHashCode2 + (map2 != null ? map2.hashCode() : 0)) * 31;
        Object obj = this.defaultValue;
        int iHashCode4 = (iHashCode3 + (obj != null ? obj.hashCode() : 0)) * 31;
        Map<String, Object> map3 = this.extInfo;
        int iHashCode5 = (iHashCode4 + (map3 != null ? map3.hashCode() : 0)) * 31;
        List<Type> list = this.entityType;
        return iHashCode5 + (list != null ? list.hashCode() : 0);
    }

    @NotNull
    public final Type resultType() {
        return this.entityType.get(1);
    }

    public final void setDefaultValue(@Nullable Object obj) {
        this.defaultValue = obj;
    }

    @NotNull
    public String toString() {
        return "EntityQueryParams(configCode=" + this.configCode + ", queryMap=" + this.queryMap + ", queryLike=" + this.queryLike + ", defaultValue=" + this.defaultValue + ", extInfo=" + this.extInfo + ", entityType=" + this.entityType + ")";
    }

    public /* synthetic */ EntityQueryParams(String str, Map map, Map map2, Object obj, Map map3, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? new ConcurrentHashMap() : map, (i & 4) != 0 ? new ConcurrentHashMap() : map2, (i & 8) != 0 ? null : obj, (i & 16) != 0 ? new ConcurrentHashMap() : map3, (i & 32) != 0 ? CollectionsKt__CollectionsKt.emptyList() : list);
    }
}
