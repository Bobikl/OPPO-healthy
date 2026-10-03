package com.oplus.seedling.sdk.seedling;

import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes8.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001Bo\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0016\b\u0002\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u0012\u0016\b\u0002\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\b\u0018\u00010\u0005\u0012\u0016\b\u0002\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\n\u0018\u00010\u0005\u0012\u0016\b\u0002\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0005¢\u0006\u0002\u0010\fJ\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0017\u0010\u0015\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005HÆ\u0003J\u0017\u0010\u0016\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\b\u0018\u00010\u0005HÆ\u0003J\u0017\u0010\u0017\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\n\u0018\u00010\u0005HÆ\u0003J\u0017\u0010\u0018\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0005HÆ\u0003Ju\u0010\u0019\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0016\b\u0002\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00052\u0016\b\u0002\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\b\u0018\u00010\u00052\u0016\b\u0002\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\n\u0018\u00010\u00052\u0016\b\u0002\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001d\u001a\u00020\u001eHÖ\u0001J\t\u0010\u001f\u001a\u00020\u0003HÖ\u0001R\u001f\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u001f\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\b\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u001f\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\n\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000eR\u001f\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000eR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006 "}, d2 = {"Lcom/oplus/seedling/sdk/seedling/RemoteViewUIData;", "", "version", "", "textDataMap", "", "Lcom/oplus/seedling/sdk/seedling/RemoteViewText;", "imageDataMap", "Lcom/oplus/seedling/sdk/seedling/RemoteViewImage;", "progressDataMap", "Lcom/oplus/seedling/sdk/seedling/RemoteViewProgress;", "extraMap", "(Ljava/lang/String;Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;)V", "getExtraMap", "()Ljava/util/Map;", "getImageDataMap", "getProgressDataMap", "getTextDataMap", "getVersion", "()Ljava/lang/String;", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "foundation-interface_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class RemoteViewUIData {

    @Nullable
    private final Map<String, String> extraMap;

    @Nullable
    private final Map<String, RemoteViewImage> imageDataMap;

    @Nullable
    private final Map<String, RemoteViewProgress> progressDataMap;

    @Nullable
    private final Map<String, RemoteViewText> textDataMap;

    @Nullable
    private final String version;

    public RemoteViewUIData(@Nullable String str, @Nullable Map<String, RemoteViewText> map, @Nullable Map<String, RemoteViewImage> map2, @Nullable Map<String, RemoteViewProgress> map3, @Nullable Map<String, String> map4) {
        this.version = str;
        this.textDataMap = map;
        this.imageDataMap = map2;
        this.progressDataMap = map3;
        this.extraMap = map4;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ RemoteViewUIData copy$default(RemoteViewUIData remoteViewUIData, String str, Map map, Map map2, Map map3, Map map4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = remoteViewUIData.version;
        }
        if ((i & 2) != 0) {
            map = remoteViewUIData.textDataMap;
        }
        Map map5 = map;
        if ((i & 4) != 0) {
            map2 = remoteViewUIData.imageDataMap;
        }
        Map map6 = map2;
        if ((i & 8) != 0) {
            map3 = remoteViewUIData.progressDataMap;
        }
        Map map7 = map3;
        if ((i & 16) != 0) {
            map4 = remoteViewUIData.extraMap;
        }
        return remoteViewUIData.copy(str, map5, map6, map7, map4);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getVersion() {
        return this.version;
    }

    @Nullable
    public final Map<String, RemoteViewText> component2() {
        return this.textDataMap;
    }

    @Nullable
    public final Map<String, RemoteViewImage> component3() {
        return this.imageDataMap;
    }

    @Nullable
    public final Map<String, RemoteViewProgress> component4() {
        return this.progressDataMap;
    }

    @Nullable
    public final Map<String, String> component5() {
        return this.extraMap;
    }

    @NotNull
    public final RemoteViewUIData copy(@Nullable String version, @Nullable Map<String, RemoteViewText> textDataMap, @Nullable Map<String, RemoteViewImage> imageDataMap, @Nullable Map<String, RemoteViewProgress> progressDataMap, @Nullable Map<String, String> extraMap) {
        return new RemoteViewUIData(version, textDataMap, imageDataMap, progressDataMap, extraMap);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RemoteViewUIData)) {
            return false;
        }
        RemoteViewUIData remoteViewUIData = (RemoteViewUIData) other;
        return Intrinsics.areEqual(this.version, remoteViewUIData.version) && Intrinsics.areEqual(this.textDataMap, remoteViewUIData.textDataMap) && Intrinsics.areEqual(this.imageDataMap, remoteViewUIData.imageDataMap) && Intrinsics.areEqual(this.progressDataMap, remoteViewUIData.progressDataMap) && Intrinsics.areEqual(this.extraMap, remoteViewUIData.extraMap);
    }

    @Nullable
    public final Map<String, String> getExtraMap() {
        return this.extraMap;
    }

    @Nullable
    public final Map<String, RemoteViewImage> getImageDataMap() {
        return this.imageDataMap;
    }

    @Nullable
    public final Map<String, RemoteViewProgress> getProgressDataMap() {
        return this.progressDataMap;
    }

    @Nullable
    public final Map<String, RemoteViewText> getTextDataMap() {
        return this.textDataMap;
    }

    @Nullable
    public final String getVersion() {
        return this.version;
    }

    public int hashCode() {
        String str = this.version;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Map<String, RemoteViewText> map = this.textDataMap;
        int iHashCode2 = (iHashCode + (map == null ? 0 : map.hashCode())) * 31;
        Map<String, RemoteViewImage> map2 = this.imageDataMap;
        int iHashCode3 = (iHashCode2 + (map2 == null ? 0 : map2.hashCode())) * 31;
        Map<String, RemoteViewProgress> map3 = this.progressDataMap;
        int iHashCode4 = (iHashCode3 + (map3 == null ? 0 : map3.hashCode())) * 31;
        Map<String, String> map4 = this.extraMap;
        return iHashCode4 + (map4 != null ? map4.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "RemoteViewUIData(version=" + this.version + ", textDataMap=" + this.textDataMap + ", imageDataMap=" + this.imageDataMap + ", progressDataMap=" + this.progressDataMap + ", extraMap=" + this.extraMap + ")";
    }

    public /* synthetic */ RemoteViewUIData(String str, Map map, Map map2, Map map3, Map map4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? null : map, (i & 4) != 0 ? null : map2, (i & 8) != 0 ? null : map3, (i & 16) != 0 ? null : map4);
    }
}
