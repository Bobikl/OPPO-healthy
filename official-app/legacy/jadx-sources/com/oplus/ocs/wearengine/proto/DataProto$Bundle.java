package com.oplus.ocs.wearengine.proto;

import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.MapEntryLite;
import com.google.protobuf.MapFieldLite;
import com.google.protobuf.Parser;
import com.google.protobuf.WireFormat;
import com.oplus.aiunit.vision.vu4;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.Map;

/* JADX INFO: loaded from: classes8.dex */
public final class DataProto$Bundle extends GeneratedMessageLite<DataProto$Bundle, Builder> implements DataProto$BundleOrBuilder {
    public static final int BOOLS_FIELD_NUMBER = 1;
    public static final int BUNDLES_FIELD_NUMBER = 9;
    public static final int BYTES_FIELD_NUMBER = 7;
    public static final int BYTE_ARRAYS_FIELD_NUMBER = 8;
    private static final DataProto$Bundle DEFAULT_INSTANCE;
    public static final int DOUBLES_FIELD_NUMBER = 6;
    public static final int FLOATS_FIELD_NUMBER = 5;
    public static final int INTS_FIELD_NUMBER = 3;
    public static final int LONGS_FIELD_NUMBER = 4;
    private static volatile Parser<DataProto$Bundle> PARSER = null;
    public static final int STRINGS_FIELD_NUMBER = 2;
    private MapFieldLite<String, Boolean> bools_ = MapFieldLite.emptyMapField();
    private MapFieldLite<String, String> strings_ = MapFieldLite.emptyMapField();
    private MapFieldLite<String, Integer> ints_ = MapFieldLite.emptyMapField();
    private MapFieldLite<String, Long> longs_ = MapFieldLite.emptyMapField();
    private MapFieldLite<String, Float> floats_ = MapFieldLite.emptyMapField();
    private MapFieldLite<String, Double> doubles_ = MapFieldLite.emptyMapField();
    private MapFieldLite<String, Integer> bytes_ = MapFieldLite.emptyMapField();
    private MapFieldLite<String, ByteString> byteArrays_ = MapFieldLite.emptyMapField();
    private MapFieldLite<String, DataProto$Bundle> bundles_ = MapFieldLite.emptyMapField();

    public static final class Builder extends GeneratedMessageLite.Builder<DataProto$Bundle, Builder> implements DataProto$BundleOrBuilder {
        public Builder clearBools() {
            copyOnWrite();
            ((DataProto$Bundle) this.instance).getMutableBoolsMap().clear();
            return this;
        }

        public Builder clearBundles() {
            copyOnWrite();
            ((DataProto$Bundle) this.instance).getMutableBundlesMap().clear();
            return this;
        }

        public Builder clearByteArrays() {
            copyOnWrite();
            ((DataProto$Bundle) this.instance).getMutableByteArraysMap().clear();
            return this;
        }

        public Builder clearBytes() {
            copyOnWrite();
            ((DataProto$Bundle) this.instance).getMutableBytesMap().clear();
            return this;
        }

        public Builder clearDoubles() {
            copyOnWrite();
            ((DataProto$Bundle) this.instance).getMutableDoublesMap().clear();
            return this;
        }

        public Builder clearFloats() {
            copyOnWrite();
            ((DataProto$Bundle) this.instance).getMutableFloatsMap().clear();
            return this;
        }

        public Builder clearInts() {
            copyOnWrite();
            ((DataProto$Bundle) this.instance).getMutableIntsMap().clear();
            return this;
        }

        public Builder clearLongs() {
            copyOnWrite();
            ((DataProto$Bundle) this.instance).getMutableLongsMap().clear();
            return this;
        }

        public Builder clearStrings() {
            copyOnWrite();
            ((DataProto$Bundle) this.instance).getMutableStringsMap().clear();
            return this;
        }

        @Override // com.oplus.ocs.wearengine.proto.DataProto$BundleOrBuilder
        public boolean containsBools(String str) {
            str.getClass();
            return ((DataProto$Bundle) this.instance).getBoolsMap().containsKey(str);
        }

        @Override // com.oplus.ocs.wearengine.proto.DataProto$BundleOrBuilder
        public boolean containsBundles(String str) {
            str.getClass();
            return ((DataProto$Bundle) this.instance).getBundlesMap().containsKey(str);
        }

        @Override // com.oplus.ocs.wearengine.proto.DataProto$BundleOrBuilder
        public boolean containsByteArrays(String str) {
            str.getClass();
            return ((DataProto$Bundle) this.instance).getByteArraysMap().containsKey(str);
        }

        @Override // com.oplus.ocs.wearengine.proto.DataProto$BundleOrBuilder
        public boolean containsBytes(String str) {
            str.getClass();
            return ((DataProto$Bundle) this.instance).getBytesMap().containsKey(str);
        }

        @Override // com.oplus.ocs.wearengine.proto.DataProto$BundleOrBuilder
        public boolean containsDoubles(String str) {
            str.getClass();
            return ((DataProto$Bundle) this.instance).getDoublesMap().containsKey(str);
        }

        @Override // com.oplus.ocs.wearengine.proto.DataProto$BundleOrBuilder
        public boolean containsFloats(String str) {
            str.getClass();
            return ((DataProto$Bundle) this.instance).getFloatsMap().containsKey(str);
        }

        @Override // com.oplus.ocs.wearengine.proto.DataProto$BundleOrBuilder
        public boolean containsInts(String str) {
            str.getClass();
            return ((DataProto$Bundle) this.instance).getIntsMap().containsKey(str);
        }

        @Override // com.oplus.ocs.wearengine.proto.DataProto$BundleOrBuilder
        public boolean containsLongs(String str) {
            str.getClass();
            return ((DataProto$Bundle) this.instance).getLongsMap().containsKey(str);
        }

        @Override // com.oplus.ocs.wearengine.proto.DataProto$BundleOrBuilder
        public boolean containsStrings(String str) {
            str.getClass();
            return ((DataProto$Bundle) this.instance).getStringsMap().containsKey(str);
        }

        @Override // com.oplus.ocs.wearengine.proto.DataProto$BundleOrBuilder
        @Deprecated
        public Map<String, Boolean> getBools() {
            return getBoolsMap();
        }

        @Override // com.oplus.ocs.wearengine.proto.DataProto$BundleOrBuilder
        public int getBoolsCount() {
            return ((DataProto$Bundle) this.instance).getBoolsMap().size();
        }

        @Override // com.oplus.ocs.wearengine.proto.DataProto$BundleOrBuilder
        public Map<String, Boolean> getBoolsMap() {
            return Collections.unmodifiableMap(((DataProto$Bundle) this.instance).getBoolsMap());
        }

        @Override // com.oplus.ocs.wearengine.proto.DataProto$BundleOrBuilder
        public boolean getBoolsOrDefault(String str, boolean z) {
            str.getClass();
            Map<String, Boolean> boolsMap = ((DataProto$Bundle) this.instance).getBoolsMap();
            return boolsMap.containsKey(str) ? boolsMap.get(str).booleanValue() : z;
        }

        @Override // com.oplus.ocs.wearengine.proto.DataProto$BundleOrBuilder
        public boolean getBoolsOrThrow(String str) {
            str.getClass();
            Map<String, Boolean> boolsMap = ((DataProto$Bundle) this.instance).getBoolsMap();
            if (boolsMap.containsKey(str)) {
                return boolsMap.get(str).booleanValue();
            }
            throw new IllegalArgumentException();
        }

        @Override // com.oplus.ocs.wearengine.proto.DataProto$BundleOrBuilder
        @Deprecated
        public Map<String, DataProto$Bundle> getBundles() {
            return getBundlesMap();
        }

        @Override // com.oplus.ocs.wearengine.proto.DataProto$BundleOrBuilder
        public int getBundlesCount() {
            return ((DataProto$Bundle) this.instance).getBundlesMap().size();
        }

        @Override // com.oplus.ocs.wearengine.proto.DataProto$BundleOrBuilder
        public Map<String, DataProto$Bundle> getBundlesMap() {
            return Collections.unmodifiableMap(((DataProto$Bundle) this.instance).getBundlesMap());
        }

        @Override // com.oplus.ocs.wearengine.proto.DataProto$BundleOrBuilder
        public DataProto$Bundle getBundlesOrDefault(String str, DataProto$Bundle dataProto$Bundle) {
            str.getClass();
            Map<String, DataProto$Bundle> bundlesMap = ((DataProto$Bundle) this.instance).getBundlesMap();
            return bundlesMap.containsKey(str) ? bundlesMap.get(str) : dataProto$Bundle;
        }

        @Override // com.oplus.ocs.wearengine.proto.DataProto$BundleOrBuilder
        public DataProto$Bundle getBundlesOrThrow(String str) {
            str.getClass();
            Map<String, DataProto$Bundle> bundlesMap = ((DataProto$Bundle) this.instance).getBundlesMap();
            if (bundlesMap.containsKey(str)) {
                return bundlesMap.get(str);
            }
            throw new IllegalArgumentException();
        }

        @Override // com.oplus.ocs.wearengine.proto.DataProto$BundleOrBuilder
        @Deprecated
        public Map<String, ByteString> getByteArrays() {
            return getByteArraysMap();
        }

        @Override // com.oplus.ocs.wearengine.proto.DataProto$BundleOrBuilder
        public int getByteArraysCount() {
            return ((DataProto$Bundle) this.instance).getByteArraysMap().size();
        }

        @Override // com.oplus.ocs.wearengine.proto.DataProto$BundleOrBuilder
        public Map<String, ByteString> getByteArraysMap() {
            return Collections.unmodifiableMap(((DataProto$Bundle) this.instance).getByteArraysMap());
        }

        @Override // com.oplus.ocs.wearengine.proto.DataProto$BundleOrBuilder
        public ByteString getByteArraysOrDefault(String str, ByteString byteString) {
            str.getClass();
            Map<String, ByteString> byteArraysMap = ((DataProto$Bundle) this.instance).getByteArraysMap();
            return byteArraysMap.containsKey(str) ? byteArraysMap.get(str) : byteString;
        }

        @Override // com.oplus.ocs.wearengine.proto.DataProto$BundleOrBuilder
        public ByteString getByteArraysOrThrow(String str) {
            str.getClass();
            Map<String, ByteString> byteArraysMap = ((DataProto$Bundle) this.instance).getByteArraysMap();
            if (byteArraysMap.containsKey(str)) {
                return byteArraysMap.get(str);
            }
            throw new IllegalArgumentException();
        }

        @Override // com.oplus.ocs.wearengine.proto.DataProto$BundleOrBuilder
        @Deprecated
        public Map<String, Integer> getBytes() {
            return getBytesMap();
        }

        @Override // com.oplus.ocs.wearengine.proto.DataProto$BundleOrBuilder
        public int getBytesCount() {
            return ((DataProto$Bundle) this.instance).getBytesMap().size();
        }

        @Override // com.oplus.ocs.wearengine.proto.DataProto$BundleOrBuilder
        public Map<String, Integer> getBytesMap() {
            return Collections.unmodifiableMap(((DataProto$Bundle) this.instance).getBytesMap());
        }

        @Override // com.oplus.ocs.wearengine.proto.DataProto$BundleOrBuilder
        public int getBytesOrDefault(String str, int i) {
            str.getClass();
            Map<String, Integer> bytesMap = ((DataProto$Bundle) this.instance).getBytesMap();
            return bytesMap.containsKey(str) ? bytesMap.get(str).intValue() : i;
        }

        @Override // com.oplus.ocs.wearengine.proto.DataProto$BundleOrBuilder
        public int getBytesOrThrow(String str) {
            str.getClass();
            Map<String, Integer> bytesMap = ((DataProto$Bundle) this.instance).getBytesMap();
            if (bytesMap.containsKey(str)) {
                return bytesMap.get(str).intValue();
            }
            throw new IllegalArgumentException();
        }

        @Override // com.oplus.ocs.wearengine.proto.DataProto$BundleOrBuilder
        @Deprecated
        public Map<String, Double> getDoubles() {
            return getDoublesMap();
        }

        @Override // com.oplus.ocs.wearengine.proto.DataProto$BundleOrBuilder
        public int getDoublesCount() {
            return ((DataProto$Bundle) this.instance).getDoublesMap().size();
        }

        @Override // com.oplus.ocs.wearengine.proto.DataProto$BundleOrBuilder
        public Map<String, Double> getDoublesMap() {
            return Collections.unmodifiableMap(((DataProto$Bundle) this.instance).getDoublesMap());
        }

        @Override // com.oplus.ocs.wearengine.proto.DataProto$BundleOrBuilder
        public double getDoublesOrDefault(String str, double d) {
            str.getClass();
            Map<String, Double> doublesMap = ((DataProto$Bundle) this.instance).getDoublesMap();
            return doublesMap.containsKey(str) ? doublesMap.get(str).doubleValue() : d;
        }

        @Override // com.oplus.ocs.wearengine.proto.DataProto$BundleOrBuilder
        public double getDoublesOrThrow(String str) {
            str.getClass();
            Map<String, Double> doublesMap = ((DataProto$Bundle) this.instance).getDoublesMap();
            if (doublesMap.containsKey(str)) {
                return doublesMap.get(str).doubleValue();
            }
            throw new IllegalArgumentException();
        }

        @Override // com.oplus.ocs.wearengine.proto.DataProto$BundleOrBuilder
        @Deprecated
        public Map<String, Float> getFloats() {
            return getFloatsMap();
        }

        @Override // com.oplus.ocs.wearengine.proto.DataProto$BundleOrBuilder
        public int getFloatsCount() {
            return ((DataProto$Bundle) this.instance).getFloatsMap().size();
        }

        @Override // com.oplus.ocs.wearengine.proto.DataProto$BundleOrBuilder
        public Map<String, Float> getFloatsMap() {
            return Collections.unmodifiableMap(((DataProto$Bundle) this.instance).getFloatsMap());
        }

        @Override // com.oplus.ocs.wearengine.proto.DataProto$BundleOrBuilder
        public float getFloatsOrDefault(String str, float f) {
            str.getClass();
            Map<String, Float> floatsMap = ((DataProto$Bundle) this.instance).getFloatsMap();
            return floatsMap.containsKey(str) ? floatsMap.get(str).floatValue() : f;
        }

        @Override // com.oplus.ocs.wearengine.proto.DataProto$BundleOrBuilder
        public float getFloatsOrThrow(String str) {
            str.getClass();
            Map<String, Float> floatsMap = ((DataProto$Bundle) this.instance).getFloatsMap();
            if (floatsMap.containsKey(str)) {
                return floatsMap.get(str).floatValue();
            }
            throw new IllegalArgumentException();
        }

        @Override // com.oplus.ocs.wearengine.proto.DataProto$BundleOrBuilder
        @Deprecated
        public Map<String, Integer> getInts() {
            return getIntsMap();
        }

        @Override // com.oplus.ocs.wearengine.proto.DataProto$BundleOrBuilder
        public int getIntsCount() {
            return ((DataProto$Bundle) this.instance).getIntsMap().size();
        }

        @Override // com.oplus.ocs.wearengine.proto.DataProto$BundleOrBuilder
        public Map<String, Integer> getIntsMap() {
            return Collections.unmodifiableMap(((DataProto$Bundle) this.instance).getIntsMap());
        }

        @Override // com.oplus.ocs.wearengine.proto.DataProto$BundleOrBuilder
        public int getIntsOrDefault(String str, int i) {
            str.getClass();
            Map<String, Integer> intsMap = ((DataProto$Bundle) this.instance).getIntsMap();
            return intsMap.containsKey(str) ? intsMap.get(str).intValue() : i;
        }

        @Override // com.oplus.ocs.wearengine.proto.DataProto$BundleOrBuilder
        public int getIntsOrThrow(String str) {
            str.getClass();
            Map<String, Integer> intsMap = ((DataProto$Bundle) this.instance).getIntsMap();
            if (intsMap.containsKey(str)) {
                return intsMap.get(str).intValue();
            }
            throw new IllegalArgumentException();
        }

        @Override // com.oplus.ocs.wearengine.proto.DataProto$BundleOrBuilder
        @Deprecated
        public Map<String, Long> getLongs() {
            return getLongsMap();
        }

        @Override // com.oplus.ocs.wearengine.proto.DataProto$BundleOrBuilder
        public int getLongsCount() {
            return ((DataProto$Bundle) this.instance).getLongsMap().size();
        }

        @Override // com.oplus.ocs.wearengine.proto.DataProto$BundleOrBuilder
        public Map<String, Long> getLongsMap() {
            return Collections.unmodifiableMap(((DataProto$Bundle) this.instance).getLongsMap());
        }

        @Override // com.oplus.ocs.wearengine.proto.DataProto$BundleOrBuilder
        public long getLongsOrDefault(String str, long j2) {
            str.getClass();
            Map<String, Long> longsMap = ((DataProto$Bundle) this.instance).getLongsMap();
            return longsMap.containsKey(str) ? longsMap.get(str).longValue() : j2;
        }

        @Override // com.oplus.ocs.wearengine.proto.DataProto$BundleOrBuilder
        public long getLongsOrThrow(String str) {
            str.getClass();
            Map<String, Long> longsMap = ((DataProto$Bundle) this.instance).getLongsMap();
            if (longsMap.containsKey(str)) {
                return longsMap.get(str).longValue();
            }
            throw new IllegalArgumentException();
        }

        @Override // com.oplus.ocs.wearengine.proto.DataProto$BundleOrBuilder
        @Deprecated
        public Map<String, String> getStrings() {
            return getStringsMap();
        }

        @Override // com.oplus.ocs.wearengine.proto.DataProto$BundleOrBuilder
        public int getStringsCount() {
            return ((DataProto$Bundle) this.instance).getStringsMap().size();
        }

        @Override // com.oplus.ocs.wearengine.proto.DataProto$BundleOrBuilder
        public Map<String, String> getStringsMap() {
            return Collections.unmodifiableMap(((DataProto$Bundle) this.instance).getStringsMap());
        }

        @Override // com.oplus.ocs.wearengine.proto.DataProto$BundleOrBuilder
        public String getStringsOrDefault(String str, String str2) {
            str.getClass();
            Map<String, String> stringsMap = ((DataProto$Bundle) this.instance).getStringsMap();
            return stringsMap.containsKey(str) ? stringsMap.get(str) : str2;
        }

        @Override // com.oplus.ocs.wearengine.proto.DataProto$BundleOrBuilder
        public String getStringsOrThrow(String str) {
            str.getClass();
            Map<String, String> stringsMap = ((DataProto$Bundle) this.instance).getStringsMap();
            if (stringsMap.containsKey(str)) {
                return stringsMap.get(str);
            }
            throw new IllegalArgumentException();
        }

        public Builder putAllBools(Map<String, Boolean> map) {
            copyOnWrite();
            ((DataProto$Bundle) this.instance).getMutableBoolsMap().putAll(map);
            return this;
        }

        public Builder putAllBundles(Map<String, DataProto$Bundle> map) {
            copyOnWrite();
            ((DataProto$Bundle) this.instance).getMutableBundlesMap().putAll(map);
            return this;
        }

        public Builder putAllByteArrays(Map<String, ByteString> map) {
            copyOnWrite();
            ((DataProto$Bundle) this.instance).getMutableByteArraysMap().putAll(map);
            return this;
        }

        public Builder putAllBytes(Map<String, Integer> map) {
            copyOnWrite();
            ((DataProto$Bundle) this.instance).getMutableBytesMap().putAll(map);
            return this;
        }

        public Builder putAllDoubles(Map<String, Double> map) {
            copyOnWrite();
            ((DataProto$Bundle) this.instance).getMutableDoublesMap().putAll(map);
            return this;
        }

        public Builder putAllFloats(Map<String, Float> map) {
            copyOnWrite();
            ((DataProto$Bundle) this.instance).getMutableFloatsMap().putAll(map);
            return this;
        }

        public Builder putAllInts(Map<String, Integer> map) {
            copyOnWrite();
            ((DataProto$Bundle) this.instance).getMutableIntsMap().putAll(map);
            return this;
        }

        public Builder putAllLongs(Map<String, Long> map) {
            copyOnWrite();
            ((DataProto$Bundle) this.instance).getMutableLongsMap().putAll(map);
            return this;
        }

        public Builder putAllStrings(Map<String, String> map) {
            copyOnWrite();
            ((DataProto$Bundle) this.instance).getMutableStringsMap().putAll(map);
            return this;
        }

        public Builder putBools(String str, boolean z) {
            str.getClass();
            copyOnWrite();
            ((DataProto$Bundle) this.instance).getMutableBoolsMap().put(str, Boolean.valueOf(z));
            return this;
        }

        public Builder putBundles(String str, DataProto$Bundle dataProto$Bundle) {
            str.getClass();
            dataProto$Bundle.getClass();
            copyOnWrite();
            ((DataProto$Bundle) this.instance).getMutableBundlesMap().put(str, dataProto$Bundle);
            return this;
        }

        public Builder putByteArrays(String str, ByteString byteString) {
            str.getClass();
            byteString.getClass();
            copyOnWrite();
            ((DataProto$Bundle) this.instance).getMutableByteArraysMap().put(str, byteString);
            return this;
        }

        public Builder putBytes(String str, int i) {
            str.getClass();
            copyOnWrite();
            ((DataProto$Bundle) this.instance).getMutableBytesMap().put(str, Integer.valueOf(i));
            return this;
        }

        public Builder putDoubles(String str, double d) {
            str.getClass();
            copyOnWrite();
            ((DataProto$Bundle) this.instance).getMutableDoublesMap().put(str, Double.valueOf(d));
            return this;
        }

        public Builder putFloats(String str, float f) {
            str.getClass();
            copyOnWrite();
            ((DataProto$Bundle) this.instance).getMutableFloatsMap().put(str, Float.valueOf(f));
            return this;
        }

        public Builder putInts(String str, int i) {
            str.getClass();
            copyOnWrite();
            ((DataProto$Bundle) this.instance).getMutableIntsMap().put(str, Integer.valueOf(i));
            return this;
        }

        public Builder putLongs(String str, long j2) {
            str.getClass();
            copyOnWrite();
            ((DataProto$Bundle) this.instance).getMutableLongsMap().put(str, Long.valueOf(j2));
            return this;
        }

        public Builder putStrings(String str, String str2) {
            str.getClass();
            str2.getClass();
            copyOnWrite();
            ((DataProto$Bundle) this.instance).getMutableStringsMap().put(str, str2);
            return this;
        }

        public Builder removeBools(String str) {
            str.getClass();
            copyOnWrite();
            ((DataProto$Bundle) this.instance).getMutableBoolsMap().remove(str);
            return this;
        }

        public Builder removeBundles(String str) {
            str.getClass();
            copyOnWrite();
            ((DataProto$Bundle) this.instance).getMutableBundlesMap().remove(str);
            return this;
        }

        public Builder removeByteArrays(String str) {
            str.getClass();
            copyOnWrite();
            ((DataProto$Bundle) this.instance).getMutableByteArraysMap().remove(str);
            return this;
        }

        public Builder removeBytes(String str) {
            str.getClass();
            copyOnWrite();
            ((DataProto$Bundle) this.instance).getMutableBytesMap().remove(str);
            return this;
        }

        public Builder removeDoubles(String str) {
            str.getClass();
            copyOnWrite();
            ((DataProto$Bundle) this.instance).getMutableDoublesMap().remove(str);
            return this;
        }

        public Builder removeFloats(String str) {
            str.getClass();
            copyOnWrite();
            ((DataProto$Bundle) this.instance).getMutableFloatsMap().remove(str);
            return this;
        }

        public Builder removeInts(String str) {
            str.getClass();
            copyOnWrite();
            ((DataProto$Bundle) this.instance).getMutableIntsMap().remove(str);
            return this;
        }

        public Builder removeLongs(String str) {
            str.getClass();
            copyOnWrite();
            ((DataProto$Bundle) this.instance).getMutableLongsMap().remove(str);
            return this;
        }

        public Builder removeStrings(String str) {
            str.getClass();
            copyOnWrite();
            ((DataProto$Bundle) this.instance).getMutableStringsMap().remove(str);
            return this;
        }

        private Builder() {
            super(DataProto$Bundle.DEFAULT_INSTANCE);
        }
    }

    public static final class a {
        public static final MapEntryLite<String, Boolean> a = MapEntryLite.newDefaultInstance(WireFormat.FieldType.STRING, "", WireFormat.FieldType.BOOL, Boolean.FALSE);
    }

    public static final class b {
        public static final MapEntryLite<String, DataProto$Bundle> a = MapEntryLite.newDefaultInstance(WireFormat.FieldType.STRING, "", WireFormat.FieldType.MESSAGE, DataProto$Bundle.getDefaultInstance());
    }

    public static final class c {
        public static final MapEntryLite<String, ByteString> a = MapEntryLite.newDefaultInstance(WireFormat.FieldType.STRING, "", WireFormat.FieldType.BYTES, ByteString.EMPTY);
    }

    public static final class d {
        public static final MapEntryLite<String, Integer> a = MapEntryLite.newDefaultInstance(WireFormat.FieldType.STRING, "", WireFormat.FieldType.INT32, 0);
    }

    public static final class e {
        public static final MapEntryLite<String, Double> a = MapEntryLite.newDefaultInstance(WireFormat.FieldType.STRING, "", WireFormat.FieldType.DOUBLE, Double.valueOf(0.0d));
    }

    public static final class f {
        public static final MapEntryLite<String, Float> a = MapEntryLite.newDefaultInstance(WireFormat.FieldType.STRING, "", WireFormat.FieldType.FLOAT, Float.valueOf(0.0f));
    }

    public static final class g {
        public static final MapEntryLite<String, Integer> a = MapEntryLite.newDefaultInstance(WireFormat.FieldType.STRING, "", WireFormat.FieldType.INT32, 0);
    }

    public static final class h {
        public static final MapEntryLite<String, Long> a = MapEntryLite.newDefaultInstance(WireFormat.FieldType.STRING, "", WireFormat.FieldType.INT64, 0L);
    }

    public static final class i {
        public static final MapEntryLite<String, String> a;

        static {
            WireFormat.FieldType fieldType = WireFormat.FieldType.STRING;
            a = MapEntryLite.newDefaultInstance(fieldType, "", fieldType, "");
        }
    }

    static {
        DataProto$Bundle dataProto$Bundle = new DataProto$Bundle();
        DEFAULT_INSTANCE = dataProto$Bundle;
        GeneratedMessageLite.registerDefaultInstance(DataProto$Bundle.class, dataProto$Bundle);
    }

    private DataProto$Bundle() {
    }

    public static DataProto$Bundle getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Map<String, Boolean> getMutableBoolsMap() {
        return internalGetMutableBools();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Map<String, DataProto$Bundle> getMutableBundlesMap() {
        return internalGetMutableBundles();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Map<String, ByteString> getMutableByteArraysMap() {
        return internalGetMutableByteArrays();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Map<String, Integer> getMutableBytesMap() {
        return internalGetMutableBytes();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Map<String, Double> getMutableDoublesMap() {
        return internalGetMutableDoubles();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Map<String, Float> getMutableFloatsMap() {
        return internalGetMutableFloats();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Map<String, Integer> getMutableIntsMap() {
        return internalGetMutableInts();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Map<String, Long> getMutableLongsMap() {
        return internalGetMutableLongs();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Map<String, String> getMutableStringsMap() {
        return internalGetMutableStrings();
    }

    private MapFieldLite<String, Boolean> internalGetBools() {
        return this.bools_;
    }

    private MapFieldLite<String, DataProto$Bundle> internalGetBundles() {
        return this.bundles_;
    }

    private MapFieldLite<String, ByteString> internalGetByteArrays() {
        return this.byteArrays_;
    }

    private MapFieldLite<String, Integer> internalGetBytes() {
        return this.bytes_;
    }

    private MapFieldLite<String, Double> internalGetDoubles() {
        return this.doubles_;
    }

    private MapFieldLite<String, Float> internalGetFloats() {
        return this.floats_;
    }

    private MapFieldLite<String, Integer> internalGetInts() {
        return this.ints_;
    }

    private MapFieldLite<String, Long> internalGetLongs() {
        return this.longs_;
    }

    private MapFieldLite<String, Boolean> internalGetMutableBools() {
        if (!this.bools_.isMutable()) {
            this.bools_ = this.bools_.mutableCopy();
        }
        return this.bools_;
    }

    private MapFieldLite<String, DataProto$Bundle> internalGetMutableBundles() {
        if (!this.bundles_.isMutable()) {
            this.bundles_ = this.bundles_.mutableCopy();
        }
        return this.bundles_;
    }

    private MapFieldLite<String, ByteString> internalGetMutableByteArrays() {
        if (!this.byteArrays_.isMutable()) {
            this.byteArrays_ = this.byteArrays_.mutableCopy();
        }
        return this.byteArrays_;
    }

    private MapFieldLite<String, Integer> internalGetMutableBytes() {
        if (!this.bytes_.isMutable()) {
            this.bytes_ = this.bytes_.mutableCopy();
        }
        return this.bytes_;
    }

    private MapFieldLite<String, Double> internalGetMutableDoubles() {
        if (!this.doubles_.isMutable()) {
            this.doubles_ = this.doubles_.mutableCopy();
        }
        return this.doubles_;
    }

    private MapFieldLite<String, Float> internalGetMutableFloats() {
        if (!this.floats_.isMutable()) {
            this.floats_ = this.floats_.mutableCopy();
        }
        return this.floats_;
    }

    private MapFieldLite<String, Integer> internalGetMutableInts() {
        if (!this.ints_.isMutable()) {
            this.ints_ = this.ints_.mutableCopy();
        }
        return this.ints_;
    }

    private MapFieldLite<String, Long> internalGetMutableLongs() {
        if (!this.longs_.isMutable()) {
            this.longs_ = this.longs_.mutableCopy();
        }
        return this.longs_;
    }

    private MapFieldLite<String, String> internalGetMutableStrings() {
        if (!this.strings_.isMutable()) {
            this.strings_ = this.strings_.mutableCopy();
        }
        return this.strings_;
    }

    private MapFieldLite<String, String> internalGetStrings() {
        return this.strings_;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static DataProto$Bundle parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (DataProto$Bundle) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static DataProto$Bundle parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (DataProto$Bundle) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<DataProto$Bundle> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    @Override // com.oplus.ocs.wearengine.proto.DataProto$BundleOrBuilder
    public boolean containsBools(String str) {
        str.getClass();
        return internalGetBools().containsKey(str);
    }

    @Override // com.oplus.ocs.wearengine.proto.DataProto$BundleOrBuilder
    public boolean containsBundles(String str) {
        str.getClass();
        return internalGetBundles().containsKey(str);
    }

    @Override // com.oplus.ocs.wearengine.proto.DataProto$BundleOrBuilder
    public boolean containsByteArrays(String str) {
        str.getClass();
        return internalGetByteArrays().containsKey(str);
    }

    @Override // com.oplus.ocs.wearengine.proto.DataProto$BundleOrBuilder
    public boolean containsBytes(String str) {
        str.getClass();
        return internalGetBytes().containsKey(str);
    }

    @Override // com.oplus.ocs.wearengine.proto.DataProto$BundleOrBuilder
    public boolean containsDoubles(String str) {
        str.getClass();
        return internalGetDoubles().containsKey(str);
    }

    @Override // com.oplus.ocs.wearengine.proto.DataProto$BundleOrBuilder
    public boolean containsFloats(String str) {
        str.getClass();
        return internalGetFloats().containsKey(str);
    }

    @Override // com.oplus.ocs.wearengine.proto.DataProto$BundleOrBuilder
    public boolean containsInts(String str) {
        str.getClass();
        return internalGetInts().containsKey(str);
    }

    @Override // com.oplus.ocs.wearengine.proto.DataProto$BundleOrBuilder
    public boolean containsLongs(String str) {
        str.getClass();
        return internalGetLongs().containsKey(str);
    }

    @Override // com.oplus.ocs.wearengine.proto.DataProto$BundleOrBuilder
    public boolean containsStrings(String str) {
        str.getClass();
        return internalGetStrings().containsKey(str);
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (vu4.a[methodToInvoke.ordinal()]) {
            case 1:
                return new DataProto$Bundle();
            case 2:
                return new Builder();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\t\u0000\u0000\u0001\t\t\t\u0000\u0000\u00012\u00022\u00032\u00042\u00052\u00062\u00072\b2\t2", new Object[]{"bools_", a.a, "strings_", i.a, "ints_", g.a, "longs_", h.a, "floats_", f.a, "doubles_", e.a, "bytes_", d.a, "byteArrays_", c.a, "bundles_", b.a});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<DataProto$Bundle> defaultInstanceBasedParser = PARSER;
                if (defaultInstanceBasedParser == null) {
                    synchronized (DataProto$Bundle.class) {
                        defaultInstanceBasedParser = PARSER;
                        if (defaultInstanceBasedParser == null) {
                            defaultInstanceBasedParser = new GeneratedMessageLite.DefaultInstanceBasedParser<>(DEFAULT_INSTANCE);
                            PARSER = defaultInstanceBasedParser;
                        }
                        break;
                    }
                }
                return defaultInstanceBasedParser;
            case 6:
                return (byte) 1;
            case 7:
                return null;
            default:
                throw new UnsupportedOperationException();
        }
    }

    @Override // com.oplus.ocs.wearengine.proto.DataProto$BundleOrBuilder
    @Deprecated
    public Map<String, Boolean> getBools() {
        return getBoolsMap();
    }

    @Override // com.oplus.ocs.wearengine.proto.DataProto$BundleOrBuilder
    public int getBoolsCount() {
        return internalGetBools().size();
    }

    @Override // com.oplus.ocs.wearengine.proto.DataProto$BundleOrBuilder
    public Map<String, Boolean> getBoolsMap() {
        return Collections.unmodifiableMap(internalGetBools());
    }

    @Override // com.oplus.ocs.wearengine.proto.DataProto$BundleOrBuilder
    public boolean getBoolsOrDefault(String str, boolean z) {
        str.getClass();
        MapFieldLite<String, Boolean> mapFieldLiteInternalGetBools = internalGetBools();
        return mapFieldLiteInternalGetBools.containsKey(str) ? mapFieldLiteInternalGetBools.get(str).booleanValue() : z;
    }

    @Override // com.oplus.ocs.wearengine.proto.DataProto$BundleOrBuilder
    public boolean getBoolsOrThrow(String str) {
        str.getClass();
        MapFieldLite<String, Boolean> mapFieldLiteInternalGetBools = internalGetBools();
        if (mapFieldLiteInternalGetBools.containsKey(str)) {
            return mapFieldLiteInternalGetBools.get(str).booleanValue();
        }
        throw new IllegalArgumentException();
    }

    @Override // com.oplus.ocs.wearengine.proto.DataProto$BundleOrBuilder
    @Deprecated
    public Map<String, DataProto$Bundle> getBundles() {
        return getBundlesMap();
    }

    @Override // com.oplus.ocs.wearengine.proto.DataProto$BundleOrBuilder
    public int getBundlesCount() {
        return internalGetBundles().size();
    }

    @Override // com.oplus.ocs.wearengine.proto.DataProto$BundleOrBuilder
    public Map<String, DataProto$Bundle> getBundlesMap() {
        return Collections.unmodifiableMap(internalGetBundles());
    }

    @Override // com.oplus.ocs.wearengine.proto.DataProto$BundleOrBuilder
    public DataProto$Bundle getBundlesOrDefault(String str, DataProto$Bundle dataProto$Bundle) {
        str.getClass();
        MapFieldLite<String, DataProto$Bundle> mapFieldLiteInternalGetBundles = internalGetBundles();
        return mapFieldLiteInternalGetBundles.containsKey(str) ? mapFieldLiteInternalGetBundles.get(str) : dataProto$Bundle;
    }

    @Override // com.oplus.ocs.wearengine.proto.DataProto$BundleOrBuilder
    public DataProto$Bundle getBundlesOrThrow(String str) {
        str.getClass();
        MapFieldLite<String, DataProto$Bundle> mapFieldLiteInternalGetBundles = internalGetBundles();
        if (mapFieldLiteInternalGetBundles.containsKey(str)) {
            return mapFieldLiteInternalGetBundles.get(str);
        }
        throw new IllegalArgumentException();
    }

    @Override // com.oplus.ocs.wearengine.proto.DataProto$BundleOrBuilder
    @Deprecated
    public Map<String, ByteString> getByteArrays() {
        return getByteArraysMap();
    }

    @Override // com.oplus.ocs.wearengine.proto.DataProto$BundleOrBuilder
    public int getByteArraysCount() {
        return internalGetByteArrays().size();
    }

    @Override // com.oplus.ocs.wearengine.proto.DataProto$BundleOrBuilder
    public Map<String, ByteString> getByteArraysMap() {
        return Collections.unmodifiableMap(internalGetByteArrays());
    }

    @Override // com.oplus.ocs.wearengine.proto.DataProto$BundleOrBuilder
    public ByteString getByteArraysOrDefault(String str, ByteString byteString) {
        str.getClass();
        MapFieldLite<String, ByteString> mapFieldLiteInternalGetByteArrays = internalGetByteArrays();
        return mapFieldLiteInternalGetByteArrays.containsKey(str) ? mapFieldLiteInternalGetByteArrays.get(str) : byteString;
    }

    @Override // com.oplus.ocs.wearengine.proto.DataProto$BundleOrBuilder
    public ByteString getByteArraysOrThrow(String str) {
        str.getClass();
        MapFieldLite<String, ByteString> mapFieldLiteInternalGetByteArrays = internalGetByteArrays();
        if (mapFieldLiteInternalGetByteArrays.containsKey(str)) {
            return mapFieldLiteInternalGetByteArrays.get(str);
        }
        throw new IllegalArgumentException();
    }

    @Override // com.oplus.ocs.wearengine.proto.DataProto$BundleOrBuilder
    @Deprecated
    public Map<String, Integer> getBytes() {
        return getBytesMap();
    }

    @Override // com.oplus.ocs.wearengine.proto.DataProto$BundleOrBuilder
    public int getBytesCount() {
        return internalGetBytes().size();
    }

    @Override // com.oplus.ocs.wearengine.proto.DataProto$BundleOrBuilder
    public Map<String, Integer> getBytesMap() {
        return Collections.unmodifiableMap(internalGetBytes());
    }

    @Override // com.oplus.ocs.wearengine.proto.DataProto$BundleOrBuilder
    public int getBytesOrDefault(String str, int i2) {
        str.getClass();
        MapFieldLite<String, Integer> mapFieldLiteInternalGetBytes = internalGetBytes();
        return mapFieldLiteInternalGetBytes.containsKey(str) ? mapFieldLiteInternalGetBytes.get(str).intValue() : i2;
    }

    @Override // com.oplus.ocs.wearengine.proto.DataProto$BundleOrBuilder
    public int getBytesOrThrow(String str) {
        str.getClass();
        MapFieldLite<String, Integer> mapFieldLiteInternalGetBytes = internalGetBytes();
        if (mapFieldLiteInternalGetBytes.containsKey(str)) {
            return mapFieldLiteInternalGetBytes.get(str).intValue();
        }
        throw new IllegalArgumentException();
    }

    @Override // com.oplus.ocs.wearengine.proto.DataProto$BundleOrBuilder
    @Deprecated
    public Map<String, Double> getDoubles() {
        return getDoublesMap();
    }

    @Override // com.oplus.ocs.wearengine.proto.DataProto$BundleOrBuilder
    public int getDoublesCount() {
        return internalGetDoubles().size();
    }

    @Override // com.oplus.ocs.wearengine.proto.DataProto$BundleOrBuilder
    public Map<String, Double> getDoublesMap() {
        return Collections.unmodifiableMap(internalGetDoubles());
    }

    @Override // com.oplus.ocs.wearengine.proto.DataProto$BundleOrBuilder
    public double getDoublesOrDefault(String str, double d2) {
        str.getClass();
        MapFieldLite<String, Double> mapFieldLiteInternalGetDoubles = internalGetDoubles();
        return mapFieldLiteInternalGetDoubles.containsKey(str) ? mapFieldLiteInternalGetDoubles.get(str).doubleValue() : d2;
    }

    @Override // com.oplus.ocs.wearengine.proto.DataProto$BundleOrBuilder
    public double getDoublesOrThrow(String str) {
        str.getClass();
        MapFieldLite<String, Double> mapFieldLiteInternalGetDoubles = internalGetDoubles();
        if (mapFieldLiteInternalGetDoubles.containsKey(str)) {
            return mapFieldLiteInternalGetDoubles.get(str).doubleValue();
        }
        throw new IllegalArgumentException();
    }

    @Override // com.oplus.ocs.wearengine.proto.DataProto$BundleOrBuilder
    @Deprecated
    public Map<String, Float> getFloats() {
        return getFloatsMap();
    }

    @Override // com.oplus.ocs.wearengine.proto.DataProto$BundleOrBuilder
    public int getFloatsCount() {
        return internalGetFloats().size();
    }

    @Override // com.oplus.ocs.wearengine.proto.DataProto$BundleOrBuilder
    public Map<String, Float> getFloatsMap() {
        return Collections.unmodifiableMap(internalGetFloats());
    }

    @Override // com.oplus.ocs.wearengine.proto.DataProto$BundleOrBuilder
    public float getFloatsOrDefault(String str, float f2) {
        str.getClass();
        MapFieldLite<String, Float> mapFieldLiteInternalGetFloats = internalGetFloats();
        return mapFieldLiteInternalGetFloats.containsKey(str) ? mapFieldLiteInternalGetFloats.get(str).floatValue() : f2;
    }

    @Override // com.oplus.ocs.wearengine.proto.DataProto$BundleOrBuilder
    public float getFloatsOrThrow(String str) {
        str.getClass();
        MapFieldLite<String, Float> mapFieldLiteInternalGetFloats = internalGetFloats();
        if (mapFieldLiteInternalGetFloats.containsKey(str)) {
            return mapFieldLiteInternalGetFloats.get(str).floatValue();
        }
        throw new IllegalArgumentException();
    }

    @Override // com.oplus.ocs.wearengine.proto.DataProto$BundleOrBuilder
    @Deprecated
    public Map<String, Integer> getInts() {
        return getIntsMap();
    }

    @Override // com.oplus.ocs.wearengine.proto.DataProto$BundleOrBuilder
    public int getIntsCount() {
        return internalGetInts().size();
    }

    @Override // com.oplus.ocs.wearengine.proto.DataProto$BundleOrBuilder
    public Map<String, Integer> getIntsMap() {
        return Collections.unmodifiableMap(internalGetInts());
    }

    @Override // com.oplus.ocs.wearengine.proto.DataProto$BundleOrBuilder
    public int getIntsOrDefault(String str, int i2) {
        str.getClass();
        MapFieldLite<String, Integer> mapFieldLiteInternalGetInts = internalGetInts();
        return mapFieldLiteInternalGetInts.containsKey(str) ? mapFieldLiteInternalGetInts.get(str).intValue() : i2;
    }

    @Override // com.oplus.ocs.wearengine.proto.DataProto$BundleOrBuilder
    public int getIntsOrThrow(String str) {
        str.getClass();
        MapFieldLite<String, Integer> mapFieldLiteInternalGetInts = internalGetInts();
        if (mapFieldLiteInternalGetInts.containsKey(str)) {
            return mapFieldLiteInternalGetInts.get(str).intValue();
        }
        throw new IllegalArgumentException();
    }

    @Override // com.oplus.ocs.wearengine.proto.DataProto$BundleOrBuilder
    @Deprecated
    public Map<String, Long> getLongs() {
        return getLongsMap();
    }

    @Override // com.oplus.ocs.wearengine.proto.DataProto$BundleOrBuilder
    public int getLongsCount() {
        return internalGetLongs().size();
    }

    @Override // com.oplus.ocs.wearengine.proto.DataProto$BundleOrBuilder
    public Map<String, Long> getLongsMap() {
        return Collections.unmodifiableMap(internalGetLongs());
    }

    @Override // com.oplus.ocs.wearengine.proto.DataProto$BundleOrBuilder
    public long getLongsOrDefault(String str, long j2) {
        str.getClass();
        MapFieldLite<String, Long> mapFieldLiteInternalGetLongs = internalGetLongs();
        return mapFieldLiteInternalGetLongs.containsKey(str) ? mapFieldLiteInternalGetLongs.get(str).longValue() : j2;
    }

    @Override // com.oplus.ocs.wearengine.proto.DataProto$BundleOrBuilder
    public long getLongsOrThrow(String str) {
        str.getClass();
        MapFieldLite<String, Long> mapFieldLiteInternalGetLongs = internalGetLongs();
        if (mapFieldLiteInternalGetLongs.containsKey(str)) {
            return mapFieldLiteInternalGetLongs.get(str).longValue();
        }
        throw new IllegalArgumentException();
    }

    @Override // com.oplus.ocs.wearengine.proto.DataProto$BundleOrBuilder
    @Deprecated
    public Map<String, String> getStrings() {
        return getStringsMap();
    }

    @Override // com.oplus.ocs.wearengine.proto.DataProto$BundleOrBuilder
    public int getStringsCount() {
        return internalGetStrings().size();
    }

    @Override // com.oplus.ocs.wearengine.proto.DataProto$BundleOrBuilder
    public Map<String, String> getStringsMap() {
        return Collections.unmodifiableMap(internalGetStrings());
    }

    @Override // com.oplus.ocs.wearengine.proto.DataProto$BundleOrBuilder
    public String getStringsOrDefault(String str, String str2) {
        str.getClass();
        MapFieldLite<String, String> mapFieldLiteInternalGetStrings = internalGetStrings();
        return mapFieldLiteInternalGetStrings.containsKey(str) ? mapFieldLiteInternalGetStrings.get(str) : str2;
    }

    @Override // com.oplus.ocs.wearengine.proto.DataProto$BundleOrBuilder
    public String getStringsOrThrow(String str) {
        str.getClass();
        MapFieldLite<String, String> mapFieldLiteInternalGetStrings = internalGetStrings();
        if (mapFieldLiteInternalGetStrings.containsKey(str)) {
            return mapFieldLiteInternalGetStrings.get(str);
        }
        throw new IllegalArgumentException();
    }

    public static Builder newBuilder(DataProto$Bundle dataProto$Bundle) {
        return DEFAULT_INSTANCE.createBuilder(dataProto$Bundle);
    }

    public static DataProto$Bundle parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (DataProto$Bundle) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static DataProto$Bundle parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (DataProto$Bundle) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static DataProto$Bundle parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (DataProto$Bundle) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static DataProto$Bundle parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (DataProto$Bundle) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static DataProto$Bundle parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (DataProto$Bundle) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static DataProto$Bundle parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (DataProto$Bundle) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static DataProto$Bundle parseFrom(InputStream inputStream) throws IOException {
        return (DataProto$Bundle) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static DataProto$Bundle parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (DataProto$Bundle) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static DataProto$Bundle parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (DataProto$Bundle) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static DataProto$Bundle parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (DataProto$Bundle) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
