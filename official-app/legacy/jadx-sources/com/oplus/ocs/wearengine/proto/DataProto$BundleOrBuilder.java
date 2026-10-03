package com.oplus.ocs.wearengine.proto;

import com.google.protobuf.ByteString;
import com.google.protobuf.MessageLiteOrBuilder;
import java.util.Map;

/* JADX INFO: loaded from: classes8.dex */
public interface DataProto$BundleOrBuilder extends MessageLiteOrBuilder {
    boolean containsBools(String str);

    boolean containsBundles(String str);

    boolean containsByteArrays(String str);

    boolean containsBytes(String str);

    boolean containsDoubles(String str);

    boolean containsFloats(String str);

    boolean containsInts(String str);

    boolean containsLongs(String str);

    boolean containsStrings(String str);

    @Deprecated
    Map<String, Boolean> getBools();

    int getBoolsCount();

    Map<String, Boolean> getBoolsMap();

    boolean getBoolsOrDefault(String str, boolean z);

    boolean getBoolsOrThrow(String str);

    @Deprecated
    Map<String, DataProto$Bundle> getBundles();

    int getBundlesCount();

    Map<String, DataProto$Bundle> getBundlesMap();

    DataProto$Bundle getBundlesOrDefault(String str, DataProto$Bundle dataProto$Bundle);

    DataProto$Bundle getBundlesOrThrow(String str);

    @Deprecated
    Map<String, ByteString> getByteArrays();

    int getByteArraysCount();

    Map<String, ByteString> getByteArraysMap();

    ByteString getByteArraysOrDefault(String str, ByteString byteString);

    ByteString getByteArraysOrThrow(String str);

    @Deprecated
    Map<String, Integer> getBytes();

    int getBytesCount();

    Map<String, Integer> getBytesMap();

    int getBytesOrDefault(String str, int i);

    int getBytesOrThrow(String str);

    @Deprecated
    Map<String, Double> getDoubles();

    int getDoublesCount();

    Map<String, Double> getDoublesMap();

    double getDoublesOrDefault(String str, double d);

    double getDoublesOrThrow(String str);

    @Deprecated
    Map<String, Float> getFloats();

    int getFloatsCount();

    Map<String, Float> getFloatsMap();

    float getFloatsOrDefault(String str, float f);

    float getFloatsOrThrow(String str);

    @Deprecated
    Map<String, Integer> getInts();

    int getIntsCount();

    Map<String, Integer> getIntsMap();

    int getIntsOrDefault(String str, int i);

    int getIntsOrThrow(String str);

    @Deprecated
    Map<String, Long> getLongs();

    int getLongsCount();

    Map<String, Long> getLongsMap();

    long getLongsOrDefault(String str, long j2);

    long getLongsOrThrow(String str);

    @Deprecated
    Map<String, String> getStrings();

    int getStringsCount();

    Map<String, String> getStringsMap();

    String getStringsOrDefault(String str, String str2);

    String getStringsOrThrow(String str);
}
