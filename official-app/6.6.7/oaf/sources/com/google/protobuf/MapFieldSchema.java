package com.google.protobuf;

import java.util.Map;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes14.dex */
@CheckReturnValue
interface MapFieldSchema {
    Map<?, ?> forMapData(Object obj);

    MapEntryLite.Metadata<?, ?> forMapMetadata(Object obj);

    Map<?, ?> forMutableMapData(Object obj);

    int getSerializedSize(int i, Object obj, Object obj2);

    boolean isImmutable(Object obj);

    @CanIgnoreReturnValue
    Object mergeFrom(Object obj, Object obj2);

    Object newMapField(Object obj);

    Object toImmutable(Object obj);
}
