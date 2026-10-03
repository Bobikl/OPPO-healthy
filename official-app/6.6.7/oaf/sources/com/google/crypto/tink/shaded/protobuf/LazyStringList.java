package com.google.crypto.tink.shaded.protobuf;

import java.util.Collection;
import java.util.List;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes14.dex */
public interface LazyStringList extends ProtocolStringList {
    void add(ByteString byteString);

    void add(byte[] bArr);

    boolean addAllByteArray(Collection<byte[]> collection);

    boolean addAllByteString(Collection<? extends ByteString> collection);

    List<byte[]> asByteArrayList();

    byte[] getByteArray(int i);

    ByteString getByteString(int i);

    Object getRaw(int i);

    List<?> getUnderlyingElements();

    LazyStringList getUnmodifiableView();

    void mergeFrom(LazyStringList lazyStringList);

    void set(int i, ByteString byteString);

    void set(int i, byte[] bArr);
}
