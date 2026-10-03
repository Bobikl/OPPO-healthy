package com.oplus.pantaconnect.fusionservice;

import com.google.protobuf.ByteString;
import com.google.protobuf.MessageOrBuilder;
import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
public interface DiscoveryFilterParamsOrBuilder extends MessageOrBuilder {
    int getFilterType();

    ByteString getLeScanFilters(int i);

    int getLeScanFiltersCount();

    List<ByteString> getLeScanFiltersList();
}
