package com.heytap.sportwatch.proto;

import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.Internal;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.Parser;
import com.oplus.aiunit.vision.pef;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class RecommendProto$level_entry_data extends GeneratedMessageLite<RecommendProto$level_entry_data, Builder> implements RecommendProto$level_entry_dataOrBuilder {
    private static final RecommendProto$level_entry_data DEFAULT_INSTANCE;
    public static final int ENTRY_ARR_FIELD_NUMBER = 2;
    private static volatile Parser<RecommendProto$level_entry_data> PARSER = null;
    public static final int PURPOSE_FIELD_NUMBER = 1;
    private static final Internal.ListAdapter.Converter<Integer, RecommendProto$GUIDE_SPORTS_PURPOSE> purpose_converter_ = new a();
    private int purposeMemoizedSerializedSize;
    private Internal.IntList purpose_ = GeneratedMessageLite.emptyIntList();
    private Internal.ProtobufList<RecommendProto$entry_w_time> entryArr_ = GeneratedMessageLite.emptyProtobufList();

    public static final class Builder extends GeneratedMessageLite.Builder<RecommendProto$level_entry_data, Builder> implements RecommendProto$level_entry_dataOrBuilder {
        public Builder addAllEntryArr(Iterable<? extends RecommendProto$entry_w_time> iterable) {
            copyOnWrite();
            ((RecommendProto$level_entry_data) this.instance).addAllEntryArr(iterable);
            return this;
        }

        public Builder addAllPurpose(Iterable<? extends RecommendProto$GUIDE_SPORTS_PURPOSE> iterable) {
            copyOnWrite();
            ((RecommendProto$level_entry_data) this.instance).addAllPurpose(iterable);
            return this;
        }

        public Builder addAllPurposeValue(Iterable<Integer> iterable) {
            copyOnWrite();
            ((RecommendProto$level_entry_data) this.instance).addAllPurposeValue(iterable);
            return this;
        }

        public Builder addEntryArr(RecommendProto$entry_w_time recommendProto$entry_w_time) {
            copyOnWrite();
            ((RecommendProto$level_entry_data) this.instance).addEntryArr(recommendProto$entry_w_time);
            return this;
        }

        public Builder addPurpose(RecommendProto$GUIDE_SPORTS_PURPOSE recommendProto$GUIDE_SPORTS_PURPOSE) {
            copyOnWrite();
            ((RecommendProto$level_entry_data) this.instance).addPurpose(recommendProto$GUIDE_SPORTS_PURPOSE);
            return this;
        }

        public Builder addPurposeValue(int i) {
            copyOnWrite();
            ((RecommendProto$level_entry_data) this.instance).addPurposeValue(i);
            return this;
        }

        public Builder clearEntryArr() {
            copyOnWrite();
            ((RecommendProto$level_entry_data) this.instance).clearEntryArr();
            return this;
        }

        public Builder clearPurpose() {
            copyOnWrite();
            ((RecommendProto$level_entry_data) this.instance).clearPurpose();
            return this;
        }

        @Override // com.heytap.sportwatch.proto.RecommendProto$level_entry_dataOrBuilder
        public RecommendProto$entry_w_time getEntryArr(int i) {
            return ((RecommendProto$level_entry_data) this.instance).getEntryArr(i);
        }

        @Override // com.heytap.sportwatch.proto.RecommendProto$level_entry_dataOrBuilder
        public int getEntryArrCount() {
            return ((RecommendProto$level_entry_data) this.instance).getEntryArrCount();
        }

        @Override // com.heytap.sportwatch.proto.RecommendProto$level_entry_dataOrBuilder
        public List<RecommendProto$entry_w_time> getEntryArrList() {
            return Collections.unmodifiableList(((RecommendProto$level_entry_data) this.instance).getEntryArrList());
        }

        @Override // com.heytap.sportwatch.proto.RecommendProto$level_entry_dataOrBuilder
        public RecommendProto$GUIDE_SPORTS_PURPOSE getPurpose(int i) {
            return ((RecommendProto$level_entry_data) this.instance).getPurpose(i);
        }

        @Override // com.heytap.sportwatch.proto.RecommendProto$level_entry_dataOrBuilder
        public int getPurposeCount() {
            return ((RecommendProto$level_entry_data) this.instance).getPurposeCount();
        }

        @Override // com.heytap.sportwatch.proto.RecommendProto$level_entry_dataOrBuilder
        public List<RecommendProto$GUIDE_SPORTS_PURPOSE> getPurposeList() {
            return ((RecommendProto$level_entry_data) this.instance).getPurposeList();
        }

        @Override // com.heytap.sportwatch.proto.RecommendProto$level_entry_dataOrBuilder
        public int getPurposeValue(int i) {
            return ((RecommendProto$level_entry_data) this.instance).getPurposeValue(i);
        }

        @Override // com.heytap.sportwatch.proto.RecommendProto$level_entry_dataOrBuilder
        public List<Integer> getPurposeValueList() {
            return Collections.unmodifiableList(((RecommendProto$level_entry_data) this.instance).getPurposeValueList());
        }

        public Builder removeEntryArr(int i) {
            copyOnWrite();
            ((RecommendProto$level_entry_data) this.instance).removeEntryArr(i);
            return this;
        }

        public Builder setEntryArr(int i, RecommendProto$entry_w_time recommendProto$entry_w_time) {
            copyOnWrite();
            ((RecommendProto$level_entry_data) this.instance).setEntryArr(i, recommendProto$entry_w_time);
            return this;
        }

        public Builder setPurpose(int i, RecommendProto$GUIDE_SPORTS_PURPOSE recommendProto$GUIDE_SPORTS_PURPOSE) {
            copyOnWrite();
            ((RecommendProto$level_entry_data) this.instance).setPurpose(i, recommendProto$GUIDE_SPORTS_PURPOSE);
            return this;
        }

        public Builder setPurposeValue(int i, int i2) {
            copyOnWrite();
            ((RecommendProto$level_entry_data) this.instance).setPurposeValue(i, i2);
            return this;
        }

        private Builder() {
            super(RecommendProto$level_entry_data.DEFAULT_INSTANCE);
        }

        public Builder addEntryArr(int i, RecommendProto$entry_w_time recommendProto$entry_w_time) {
            copyOnWrite();
            ((RecommendProto$level_entry_data) this.instance).addEntryArr(i, recommendProto$entry_w_time);
            return this;
        }

        public Builder setEntryArr(int i, RecommendProto$entry_w_time.Builder builder) {
            copyOnWrite();
            ((RecommendProto$level_entry_data) this.instance).setEntryArr(i, builder.build());
            return this;
        }

        public Builder addEntryArr(RecommendProto$entry_w_time.Builder builder) {
            copyOnWrite();
            ((RecommendProto$level_entry_data) this.instance).addEntryArr(builder.build());
            return this;
        }

        public Builder addEntryArr(int i, RecommendProto$entry_w_time.Builder builder) {
            copyOnWrite();
            ((RecommendProto$level_entry_data) this.instance).addEntryArr(i, builder.build());
            return this;
        }
    }

    public class a implements Internal.ListAdapter.Converter<Integer, RecommendProto$GUIDE_SPORTS_PURPOSE> {
        @Override // com.google.protobuf.Internal.ListAdapter.Converter
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public RecommendProto$GUIDE_SPORTS_PURPOSE convert(Integer num) {
            RecommendProto$GUIDE_SPORTS_PURPOSE recommendProto$GUIDE_SPORTS_PURPOSEForNumber = RecommendProto$GUIDE_SPORTS_PURPOSE.forNumber(num.intValue());
            return recommendProto$GUIDE_SPORTS_PURPOSEForNumber == null ? RecommendProto$GUIDE_SPORTS_PURPOSE.UNRECOGNIZED : recommendProto$GUIDE_SPORTS_PURPOSEForNumber;
        }
    }

    static {
        RecommendProto$level_entry_data recommendProto$level_entry_data = new RecommendProto$level_entry_data();
        DEFAULT_INSTANCE = recommendProto$level_entry_data;
        GeneratedMessageLite.registerDefaultInstance(RecommendProto$level_entry_data.class, recommendProto$level_entry_data);
    }

    private RecommendProto$level_entry_data() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllEntryArr(Iterable<? extends RecommendProto$entry_w_time> iterable) {
        ensureEntryArrIsMutable();
        AbstractMessageLite.addAll((Iterable) iterable, (List) this.entryArr_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllPurpose(Iterable<? extends RecommendProto$GUIDE_SPORTS_PURPOSE> iterable) {
        ensurePurposeIsMutable();
        Iterator<? extends RecommendProto$GUIDE_SPORTS_PURPOSE> it = iterable.iterator();
        while (it.hasNext()) {
            this.purpose_.addInt(it.next().getNumber());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllPurposeValue(Iterable<Integer> iterable) {
        ensurePurposeIsMutable();
        Iterator<Integer> it = iterable.iterator();
        while (it.hasNext()) {
            this.purpose_.addInt(it.next().intValue());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addEntryArr(RecommendProto$entry_w_time recommendProto$entry_w_time) {
        recommendProto$entry_w_time.getClass();
        ensureEntryArrIsMutable();
        this.entryArr_.add(recommendProto$entry_w_time);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addPurpose(RecommendProto$GUIDE_SPORTS_PURPOSE recommendProto$GUIDE_SPORTS_PURPOSE) {
        recommendProto$GUIDE_SPORTS_PURPOSE.getClass();
        ensurePurposeIsMutable();
        this.purpose_.addInt(recommendProto$GUIDE_SPORTS_PURPOSE.getNumber());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addPurposeValue(int i) {
        ensurePurposeIsMutable();
        this.purpose_.addInt(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearEntryArr() {
        this.entryArr_ = GeneratedMessageLite.emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPurpose() {
        this.purpose_ = GeneratedMessageLite.emptyIntList();
    }

    private void ensureEntryArrIsMutable() {
        Internal.ProtobufList<RecommendProto$entry_w_time> protobufList = this.entryArr_;
        if (protobufList.isModifiable()) {
            return;
        }
        this.entryArr_ = GeneratedMessageLite.mutableCopy(protobufList);
    }

    private void ensurePurposeIsMutable() {
        Internal.IntList intList = this.purpose_;
        if (intList.isModifiable()) {
            return;
        }
        this.purpose_ = GeneratedMessageLite.mutableCopy(intList);
    }

    public static RecommendProto$level_entry_data getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static RecommendProto$level_entry_data parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (RecommendProto$level_entry_data) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static RecommendProto$level_entry_data parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (RecommendProto$level_entry_data) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<RecommendProto$level_entry_data> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeEntryArr(int i) {
        ensureEntryArrIsMutable();
        this.entryArr_.remove(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setEntryArr(int i, RecommendProto$entry_w_time recommendProto$entry_w_time) {
        recommendProto$entry_w_time.getClass();
        ensureEntryArrIsMutable();
        this.entryArr_.set(i, recommendProto$entry_w_time);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPurpose(int i, RecommendProto$GUIDE_SPORTS_PURPOSE recommendProto$GUIDE_SPORTS_PURPOSE) {
        recommendProto$GUIDE_SPORTS_PURPOSE.getClass();
        ensurePurposeIsMutable();
        this.purpose_.setInt(i, recommendProto$GUIDE_SPORTS_PURPOSE.getNumber());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPurposeValue(int i, int i2) {
        ensurePurposeIsMutable();
        this.purpose_.setInt(i, i2);
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        int i = pef.a[methodToInvoke.ordinal()];
        switch (i) {
            case 1:
                return new RecommendProto$level_entry_data();
            case 2:
                return new Builder();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0002\u0000\u0001,\u0002\u001b", new Object[]{"purpose_", "entryArr_", RecommendProto$entry_w_time.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<RecommendProto$level_entry_data> defaultInstanceBasedParser = PARSER;
                if (defaultInstanceBasedParser == null) {
                    synchronized (RecommendProto$level_entry_data.class) {
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

    @Override // com.heytap.sportwatch.proto.RecommendProto$level_entry_dataOrBuilder
    public RecommendProto$entry_w_time getEntryArr(int i) {
        return this.entryArr_.get(i);
    }

    @Override // com.heytap.sportwatch.proto.RecommendProto$level_entry_dataOrBuilder
    public int getEntryArrCount() {
        return this.entryArr_.size();
    }

    @Override // com.heytap.sportwatch.proto.RecommendProto$level_entry_dataOrBuilder
    public List<RecommendProto$entry_w_time> getEntryArrList() {
        return this.entryArr_;
    }

    public RecommendProto$entry_w_timeOrBuilder getEntryArrOrBuilder(int i) {
        return this.entryArr_.get(i);
    }

    public List<? extends RecommendProto$entry_w_timeOrBuilder> getEntryArrOrBuilderList() {
        return this.entryArr_;
    }

    @Override // com.heytap.sportwatch.proto.RecommendProto$level_entry_dataOrBuilder
    public RecommendProto$GUIDE_SPORTS_PURPOSE getPurpose(int i) {
        RecommendProto$GUIDE_SPORTS_PURPOSE recommendProto$GUIDE_SPORTS_PURPOSEForNumber = RecommendProto$GUIDE_SPORTS_PURPOSE.forNumber(this.purpose_.getInt(i));
        return recommendProto$GUIDE_SPORTS_PURPOSEForNumber == null ? RecommendProto$GUIDE_SPORTS_PURPOSE.UNRECOGNIZED : recommendProto$GUIDE_SPORTS_PURPOSEForNumber;
    }

    @Override // com.heytap.sportwatch.proto.RecommendProto$level_entry_dataOrBuilder
    public int getPurposeCount() {
        return this.purpose_.size();
    }

    @Override // com.heytap.sportwatch.proto.RecommendProto$level_entry_dataOrBuilder
    public List<RecommendProto$GUIDE_SPORTS_PURPOSE> getPurposeList() {
        return new Internal.ListAdapter(this.purpose_, purpose_converter_);
    }

    @Override // com.heytap.sportwatch.proto.RecommendProto$level_entry_dataOrBuilder
    public int getPurposeValue(int i) {
        return this.purpose_.getInt(i);
    }

    @Override // com.heytap.sportwatch.proto.RecommendProto$level_entry_dataOrBuilder
    public List<Integer> getPurposeValueList() {
        return this.purpose_;
    }

    public static Builder newBuilder(RecommendProto$level_entry_data recommendProto$level_entry_data) {
        return DEFAULT_INSTANCE.createBuilder(recommendProto$level_entry_data);
    }

    public static RecommendProto$level_entry_data parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (RecommendProto$level_entry_data) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static RecommendProto$level_entry_data parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (RecommendProto$level_entry_data) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static RecommendProto$level_entry_data parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (RecommendProto$level_entry_data) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addEntryArr(int i, RecommendProto$entry_w_time recommendProto$entry_w_time) {
        recommendProto$entry_w_time.getClass();
        ensureEntryArrIsMutable();
        this.entryArr_.add(i, recommendProto$entry_w_time);
    }

    public static RecommendProto$level_entry_data parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (RecommendProto$level_entry_data) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static RecommendProto$level_entry_data parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (RecommendProto$level_entry_data) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static RecommendProto$level_entry_data parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (RecommendProto$level_entry_data) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static RecommendProto$level_entry_data parseFrom(InputStream inputStream) throws IOException {
        return (RecommendProto$level_entry_data) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static RecommendProto$level_entry_data parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (RecommendProto$level_entry_data) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static RecommendProto$level_entry_data parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (RecommendProto$level_entry_data) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static RecommendProto$level_entry_data parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (RecommendProto$level_entry_data) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
