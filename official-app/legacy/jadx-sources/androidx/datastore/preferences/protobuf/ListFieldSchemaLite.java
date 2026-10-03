package androidx.datastore.preferences.protobuf;

import java.util.List;

/* JADX INFO: loaded from: classes12.dex */
final class ListFieldSchemaLite implements ListFieldSchema {
    public static <E> Internal.ProtobufList<E> getProtobufList(Object obj, long j2) {
        return (Internal.ProtobufList) UnsafeUtil.getObject(obj, j2);
    }

    @Override // androidx.datastore.preferences.protobuf.ListFieldSchema
    public void makeImmutableListAt(Object obj, long j2) {
        getProtobufList(obj, j2).makeImmutable();
    }

    @Override // androidx.datastore.preferences.protobuf.ListFieldSchema
    public <E> void mergeListsAt(Object obj, Object obj2, long j2) {
        Internal.ProtobufList protobufList = getProtobufList(obj, j2);
        Internal.ProtobufList protobufList2 = getProtobufList(obj2, j2);
        int size = protobufList.size();
        int size2 = protobufList2.size();
        if (size > 0 && size2 > 0) {
            if (!protobufList.isModifiable()) {
                protobufList = protobufList.mutableCopyWithCapacity2(size2 + size);
            }
            protobufList.addAll(protobufList2);
        }
        if (size > 0) {
            protobufList2 = protobufList;
        }
        UnsafeUtil.putObject(obj, j2, protobufList2);
    }

    @Override // androidx.datastore.preferences.protobuf.ListFieldSchema
    public <L> List<L> mutableListAt(Object obj, long j2) {
        Internal.ProtobufList protobufList = getProtobufList(obj, j2);
        if (protobufList.isModifiable()) {
            return protobufList;
        }
        int size = protobufList.size();
        Internal.ProtobufList protobufListMutableCopyWithCapacity2 = protobufList.mutableCopyWithCapacity2(size == 0 ? 10 : size * 2);
        UnsafeUtil.putObject(obj, j2, protobufListMutableCopyWithCapacity2);
        return protobufListMutableCopyWithCapacity2;
    }
}
