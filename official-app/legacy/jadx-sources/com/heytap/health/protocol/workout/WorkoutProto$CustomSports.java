package com.heytap.health.protocol.workout;

import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.Internal;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.Parser;
import com.oplus.aiunit.vision.yzl;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes17.dex */
public final class WorkoutProto$CustomSports extends GeneratedMessageLite<WorkoutProto$CustomSports, Builder> implements WorkoutProto$CustomSportsOrBuilder {
    private static final WorkoutProto$CustomSports DEFAULT_INSTANCE;
    public static final int ID_FIELD_NUMBER = 1;
    public static final int MAX_SELECT_FIELD_NUMBER = 7;
    public static final int NAME_FIELD_NUMBER = 2;
    public static final int NORMAL_SLECTEDDATA_FIELD_NUMBER = 6;
    private static volatile Parser<WorkoutProto$CustomSports> PARSER = null;
    public static final int SLECTEDDATA_FIELD_NUMBER = 4;
    public static final int SPORTCATEGORY_FIELD_NUMBER = 3;
    public static final int SUPPORTDATA_FIELD_NUMBER = 5;
    private int maxSelect_;
    private int sportCategory_;
    private String id_ = "";
    private String name_ = "";
    private Internal.ProtobufList<WorkoutProto$SportsPageData> slectedData_ = GeneratedMessageLite.emptyProtobufList();
    private Internal.ProtobufList<WorkoutProto$SportsDataItem> supportData_ = GeneratedMessageLite.emptyProtobufList();
    private Internal.ProtobufList<WorkoutProto$SportsPageData> normalSlectedData_ = GeneratedMessageLite.emptyProtobufList();

    public static final class Builder extends GeneratedMessageLite.Builder<WorkoutProto$CustomSports, Builder> implements WorkoutProto$CustomSportsOrBuilder {
        public Builder addAllNormalSlectedData(Iterable<? extends WorkoutProto$SportsPageData> iterable) {
            copyOnWrite();
            ((WorkoutProto$CustomSports) this.instance).addAllNormalSlectedData(iterable);
            return this;
        }

        public Builder addAllSlectedData(Iterable<? extends WorkoutProto$SportsPageData> iterable) {
            copyOnWrite();
            ((WorkoutProto$CustomSports) this.instance).addAllSlectedData(iterable);
            return this;
        }

        public Builder addAllSupportData(Iterable<? extends WorkoutProto$SportsDataItem> iterable) {
            copyOnWrite();
            ((WorkoutProto$CustomSports) this.instance).addAllSupportData(iterable);
            return this;
        }

        public Builder addNormalSlectedData(WorkoutProto$SportsPageData workoutProto$SportsPageData) {
            copyOnWrite();
            ((WorkoutProto$CustomSports) this.instance).addNormalSlectedData(workoutProto$SportsPageData);
            return this;
        }

        public Builder addSlectedData(WorkoutProto$SportsPageData workoutProto$SportsPageData) {
            copyOnWrite();
            ((WorkoutProto$CustomSports) this.instance).addSlectedData(workoutProto$SportsPageData);
            return this;
        }

        public Builder addSupportData(WorkoutProto$SportsDataItem workoutProto$SportsDataItem) {
            copyOnWrite();
            ((WorkoutProto$CustomSports) this.instance).addSupportData(workoutProto$SportsDataItem);
            return this;
        }

        public Builder clearId() {
            copyOnWrite();
            ((WorkoutProto$CustomSports) this.instance).clearId();
            return this;
        }

        public Builder clearMaxSelect() {
            copyOnWrite();
            ((WorkoutProto$CustomSports) this.instance).clearMaxSelect();
            return this;
        }

        public Builder clearName() {
            copyOnWrite();
            ((WorkoutProto$CustomSports) this.instance).clearName();
            return this;
        }

        public Builder clearNormalSlectedData() {
            copyOnWrite();
            ((WorkoutProto$CustomSports) this.instance).clearNormalSlectedData();
            return this;
        }

        public Builder clearSlectedData() {
            copyOnWrite();
            ((WorkoutProto$CustomSports) this.instance).clearSlectedData();
            return this;
        }

        public Builder clearSportCategory() {
            copyOnWrite();
            ((WorkoutProto$CustomSports) this.instance).clearSportCategory();
            return this;
        }

        public Builder clearSupportData() {
            copyOnWrite();
            ((WorkoutProto$CustomSports) this.instance).clearSupportData();
            return this;
        }

        @Override // com.heytap.health.protocol.workout.WorkoutProto$CustomSportsOrBuilder
        public String getId() {
            return ((WorkoutProto$CustomSports) this.instance).getId();
        }

        @Override // com.heytap.health.protocol.workout.WorkoutProto$CustomSportsOrBuilder
        public ByteString getIdBytes() {
            return ((WorkoutProto$CustomSports) this.instance).getIdBytes();
        }

        @Override // com.heytap.health.protocol.workout.WorkoutProto$CustomSportsOrBuilder
        public int getMaxSelect() {
            return ((WorkoutProto$CustomSports) this.instance).getMaxSelect();
        }

        @Override // com.heytap.health.protocol.workout.WorkoutProto$CustomSportsOrBuilder
        public String getName() {
            return ((WorkoutProto$CustomSports) this.instance).getName();
        }

        @Override // com.heytap.health.protocol.workout.WorkoutProto$CustomSportsOrBuilder
        public ByteString getNameBytes() {
            return ((WorkoutProto$CustomSports) this.instance).getNameBytes();
        }

        @Override // com.heytap.health.protocol.workout.WorkoutProto$CustomSportsOrBuilder
        public WorkoutProto$SportsPageData getNormalSlectedData(int i) {
            return ((WorkoutProto$CustomSports) this.instance).getNormalSlectedData(i);
        }

        @Override // com.heytap.health.protocol.workout.WorkoutProto$CustomSportsOrBuilder
        public int getNormalSlectedDataCount() {
            return ((WorkoutProto$CustomSports) this.instance).getNormalSlectedDataCount();
        }

        @Override // com.heytap.health.protocol.workout.WorkoutProto$CustomSportsOrBuilder
        public List<WorkoutProto$SportsPageData> getNormalSlectedDataList() {
            return Collections.unmodifiableList(((WorkoutProto$CustomSports) this.instance).getNormalSlectedDataList());
        }

        @Override // com.heytap.health.protocol.workout.WorkoutProto$CustomSportsOrBuilder
        public WorkoutProto$SportsPageData getSlectedData(int i) {
            return ((WorkoutProto$CustomSports) this.instance).getSlectedData(i);
        }

        @Override // com.heytap.health.protocol.workout.WorkoutProto$CustomSportsOrBuilder
        public int getSlectedDataCount() {
            return ((WorkoutProto$CustomSports) this.instance).getSlectedDataCount();
        }

        @Override // com.heytap.health.protocol.workout.WorkoutProto$CustomSportsOrBuilder
        public List<WorkoutProto$SportsPageData> getSlectedDataList() {
            return Collections.unmodifiableList(((WorkoutProto$CustomSports) this.instance).getSlectedDataList());
        }

        @Override // com.heytap.health.protocol.workout.WorkoutProto$CustomSportsOrBuilder
        public int getSportCategory() {
            return ((WorkoutProto$CustomSports) this.instance).getSportCategory();
        }

        @Override // com.heytap.health.protocol.workout.WorkoutProto$CustomSportsOrBuilder
        public WorkoutProto$SportsDataItem getSupportData(int i) {
            return ((WorkoutProto$CustomSports) this.instance).getSupportData(i);
        }

        @Override // com.heytap.health.protocol.workout.WorkoutProto$CustomSportsOrBuilder
        public int getSupportDataCount() {
            return ((WorkoutProto$CustomSports) this.instance).getSupportDataCount();
        }

        @Override // com.heytap.health.protocol.workout.WorkoutProto$CustomSportsOrBuilder
        public List<WorkoutProto$SportsDataItem> getSupportDataList() {
            return Collections.unmodifiableList(((WorkoutProto$CustomSports) this.instance).getSupportDataList());
        }

        public Builder removeNormalSlectedData(int i) {
            copyOnWrite();
            ((WorkoutProto$CustomSports) this.instance).removeNormalSlectedData(i);
            return this;
        }

        public Builder removeSlectedData(int i) {
            copyOnWrite();
            ((WorkoutProto$CustomSports) this.instance).removeSlectedData(i);
            return this;
        }

        public Builder removeSupportData(int i) {
            copyOnWrite();
            ((WorkoutProto$CustomSports) this.instance).removeSupportData(i);
            return this;
        }

        public Builder setId(String str) {
            copyOnWrite();
            ((WorkoutProto$CustomSports) this.instance).setId(str);
            return this;
        }

        public Builder setIdBytes(ByteString byteString) {
            copyOnWrite();
            ((WorkoutProto$CustomSports) this.instance).setIdBytes(byteString);
            return this;
        }

        public Builder setMaxSelect(int i) {
            copyOnWrite();
            ((WorkoutProto$CustomSports) this.instance).setMaxSelect(i);
            return this;
        }

        public Builder setName(String str) {
            copyOnWrite();
            ((WorkoutProto$CustomSports) this.instance).setName(str);
            return this;
        }

        public Builder setNameBytes(ByteString byteString) {
            copyOnWrite();
            ((WorkoutProto$CustomSports) this.instance).setNameBytes(byteString);
            return this;
        }

        public Builder setNormalSlectedData(int i, WorkoutProto$SportsPageData workoutProto$SportsPageData) {
            copyOnWrite();
            ((WorkoutProto$CustomSports) this.instance).setNormalSlectedData(i, workoutProto$SportsPageData);
            return this;
        }

        public Builder setSlectedData(int i, WorkoutProto$SportsPageData workoutProto$SportsPageData) {
            copyOnWrite();
            ((WorkoutProto$CustomSports) this.instance).setSlectedData(i, workoutProto$SportsPageData);
            return this;
        }

        public Builder setSportCategory(int i) {
            copyOnWrite();
            ((WorkoutProto$CustomSports) this.instance).setSportCategory(i);
            return this;
        }

        public Builder setSupportData(int i, WorkoutProto$SportsDataItem workoutProto$SportsDataItem) {
            copyOnWrite();
            ((WorkoutProto$CustomSports) this.instance).setSupportData(i, workoutProto$SportsDataItem);
            return this;
        }

        private Builder() {
            super(WorkoutProto$CustomSports.DEFAULT_INSTANCE);
        }

        public Builder addNormalSlectedData(int i, WorkoutProto$SportsPageData workoutProto$SportsPageData) {
            copyOnWrite();
            ((WorkoutProto$CustomSports) this.instance).addNormalSlectedData(i, workoutProto$SportsPageData);
            return this;
        }

        public Builder addSlectedData(int i, WorkoutProto$SportsPageData workoutProto$SportsPageData) {
            copyOnWrite();
            ((WorkoutProto$CustomSports) this.instance).addSlectedData(i, workoutProto$SportsPageData);
            return this;
        }

        public Builder addSupportData(int i, WorkoutProto$SportsDataItem workoutProto$SportsDataItem) {
            copyOnWrite();
            ((WorkoutProto$CustomSports) this.instance).addSupportData(i, workoutProto$SportsDataItem);
            return this;
        }

        public Builder setNormalSlectedData(int i, WorkoutProto$SportsPageData.Builder builder) {
            copyOnWrite();
            ((WorkoutProto$CustomSports) this.instance).setNormalSlectedData(i, builder.build());
            return this;
        }

        public Builder setSlectedData(int i, WorkoutProto$SportsPageData.Builder builder) {
            copyOnWrite();
            ((WorkoutProto$CustomSports) this.instance).setSlectedData(i, builder.build());
            return this;
        }

        public Builder setSupportData(int i, WorkoutProto$SportsDataItem.Builder builder) {
            copyOnWrite();
            ((WorkoutProto$CustomSports) this.instance).setSupportData(i, builder.build());
            return this;
        }

        public Builder addNormalSlectedData(WorkoutProto$SportsPageData.Builder builder) {
            copyOnWrite();
            ((WorkoutProto$CustomSports) this.instance).addNormalSlectedData(builder.build());
            return this;
        }

        public Builder addSlectedData(WorkoutProto$SportsPageData.Builder builder) {
            copyOnWrite();
            ((WorkoutProto$CustomSports) this.instance).addSlectedData(builder.build());
            return this;
        }

        public Builder addSupportData(WorkoutProto$SportsDataItem.Builder builder) {
            copyOnWrite();
            ((WorkoutProto$CustomSports) this.instance).addSupportData(builder.build());
            return this;
        }

        public Builder addNormalSlectedData(int i, WorkoutProto$SportsPageData.Builder builder) {
            copyOnWrite();
            ((WorkoutProto$CustomSports) this.instance).addNormalSlectedData(i, builder.build());
            return this;
        }

        public Builder addSlectedData(int i, WorkoutProto$SportsPageData.Builder builder) {
            copyOnWrite();
            ((WorkoutProto$CustomSports) this.instance).addSlectedData(i, builder.build());
            return this;
        }

        public Builder addSupportData(int i, WorkoutProto$SportsDataItem.Builder builder) {
            copyOnWrite();
            ((WorkoutProto$CustomSports) this.instance).addSupportData(i, builder.build());
            return this;
        }
    }

    static {
        WorkoutProto$CustomSports workoutProto$CustomSports = new WorkoutProto$CustomSports();
        DEFAULT_INSTANCE = workoutProto$CustomSports;
        GeneratedMessageLite.registerDefaultInstance(WorkoutProto$CustomSports.class, workoutProto$CustomSports);
    }

    private WorkoutProto$CustomSports() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllNormalSlectedData(Iterable<? extends WorkoutProto$SportsPageData> iterable) {
        ensureNormalSlectedDataIsMutable();
        AbstractMessageLite.addAll((Iterable) iterable, (List) this.normalSlectedData_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllSlectedData(Iterable<? extends WorkoutProto$SportsPageData> iterable) {
        ensureSlectedDataIsMutable();
        AbstractMessageLite.addAll((Iterable) iterable, (List) this.slectedData_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllSupportData(Iterable<? extends WorkoutProto$SportsDataItem> iterable) {
        ensureSupportDataIsMutable();
        AbstractMessageLite.addAll((Iterable) iterable, (List) this.supportData_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addNormalSlectedData(WorkoutProto$SportsPageData workoutProto$SportsPageData) {
        workoutProto$SportsPageData.getClass();
        ensureNormalSlectedDataIsMutable();
        this.normalSlectedData_.add(workoutProto$SportsPageData);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addSlectedData(WorkoutProto$SportsPageData workoutProto$SportsPageData) {
        workoutProto$SportsPageData.getClass();
        ensureSlectedDataIsMutable();
        this.slectedData_.add(workoutProto$SportsPageData);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addSupportData(WorkoutProto$SportsDataItem workoutProto$SportsDataItem) {
        workoutProto$SportsDataItem.getClass();
        ensureSupportDataIsMutable();
        this.supportData_.add(workoutProto$SportsDataItem);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearId() {
        this.id_ = getDefaultInstance().getId();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearMaxSelect() {
        this.maxSelect_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearName() {
        this.name_ = getDefaultInstance().getName();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearNormalSlectedData() {
        this.normalSlectedData_ = GeneratedMessageLite.emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSlectedData() {
        this.slectedData_ = GeneratedMessageLite.emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSportCategory() {
        this.sportCategory_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSupportData() {
        this.supportData_ = GeneratedMessageLite.emptyProtobufList();
    }

    private void ensureNormalSlectedDataIsMutable() {
        Internal.ProtobufList<WorkoutProto$SportsPageData> protobufList = this.normalSlectedData_;
        if (protobufList.isModifiable()) {
            return;
        }
        this.normalSlectedData_ = GeneratedMessageLite.mutableCopy(protobufList);
    }

    private void ensureSlectedDataIsMutable() {
        Internal.ProtobufList<WorkoutProto$SportsPageData> protobufList = this.slectedData_;
        if (protobufList.isModifiable()) {
            return;
        }
        this.slectedData_ = GeneratedMessageLite.mutableCopy(protobufList);
    }

    private void ensureSupportDataIsMutable() {
        Internal.ProtobufList<WorkoutProto$SportsDataItem> protobufList = this.supportData_;
        if (protobufList.isModifiable()) {
            return;
        }
        this.supportData_ = GeneratedMessageLite.mutableCopy(protobufList);
    }

    public static WorkoutProto$CustomSports getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static WorkoutProto$CustomSports parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (WorkoutProto$CustomSports) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static WorkoutProto$CustomSports parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (WorkoutProto$CustomSports) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<WorkoutProto$CustomSports> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeNormalSlectedData(int i) {
        ensureNormalSlectedDataIsMutable();
        this.normalSlectedData_.remove(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeSlectedData(int i) {
        ensureSlectedDataIsMutable();
        this.slectedData_.remove(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeSupportData(int i) {
        ensureSupportDataIsMutable();
        this.supportData_.remove(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setId(String str) {
        str.getClass();
        this.id_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIdBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.id_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMaxSelect(int i) {
        this.maxSelect_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setName(String str) {
        str.getClass();
        this.name_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setNameBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.name_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setNormalSlectedData(int i, WorkoutProto$SportsPageData workoutProto$SportsPageData) {
        workoutProto$SportsPageData.getClass();
        ensureNormalSlectedDataIsMutable();
        this.normalSlectedData_.set(i, workoutProto$SportsPageData);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSlectedData(int i, WorkoutProto$SportsPageData workoutProto$SportsPageData) {
        workoutProto$SportsPageData.getClass();
        ensureSlectedDataIsMutable();
        this.slectedData_.set(i, workoutProto$SportsPageData);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSportCategory(int i) {
        this.sportCategory_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSupportData(int i, WorkoutProto$SportsDataItem workoutProto$SportsDataItem) {
        workoutProto$SportsDataItem.getClass();
        ensureSupportDataIsMutable();
        this.supportData_.set(i, workoutProto$SportsDataItem);
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        int i = yzl.a[methodToInvoke.ordinal()];
        switch (i) {
            case 1:
                return new WorkoutProto$CustomSports();
            case 2:
                return new Builder();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0007\u0000\u0000\u0001\u0007\u0007\u0000\u0003\u0000\u0001Ȉ\u0002Ȉ\u0003\u0004\u0004\u001b\u0005\u001b\u0006\u001b\u0007\u0004", new Object[]{"id_", "name_", "sportCategory_", "slectedData_", WorkoutProto$SportsPageData.class, "supportData_", WorkoutProto$SportsDataItem.class, "normalSlectedData_", WorkoutProto$SportsPageData.class, "maxSelect_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<WorkoutProto$CustomSports> defaultInstanceBasedParser = PARSER;
                if (defaultInstanceBasedParser == null) {
                    synchronized (WorkoutProto$CustomSports.class) {
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

    @Override // com.heytap.health.protocol.workout.WorkoutProto$CustomSportsOrBuilder
    public String getId() {
        return this.id_;
    }

    @Override // com.heytap.health.protocol.workout.WorkoutProto$CustomSportsOrBuilder
    public ByteString getIdBytes() {
        return ByteString.copyFromUtf8(this.id_);
    }

    @Override // com.heytap.health.protocol.workout.WorkoutProto$CustomSportsOrBuilder
    public int getMaxSelect() {
        return this.maxSelect_;
    }

    @Override // com.heytap.health.protocol.workout.WorkoutProto$CustomSportsOrBuilder
    public String getName() {
        return this.name_;
    }

    @Override // com.heytap.health.protocol.workout.WorkoutProto$CustomSportsOrBuilder
    public ByteString getNameBytes() {
        return ByteString.copyFromUtf8(this.name_);
    }

    @Override // com.heytap.health.protocol.workout.WorkoutProto$CustomSportsOrBuilder
    public WorkoutProto$SportsPageData getNormalSlectedData(int i) {
        return this.normalSlectedData_.get(i);
    }

    @Override // com.heytap.health.protocol.workout.WorkoutProto$CustomSportsOrBuilder
    public int getNormalSlectedDataCount() {
        return this.normalSlectedData_.size();
    }

    @Override // com.heytap.health.protocol.workout.WorkoutProto$CustomSportsOrBuilder
    public List<WorkoutProto$SportsPageData> getNormalSlectedDataList() {
        return this.normalSlectedData_;
    }

    public WorkoutProto$SportsPageDataOrBuilder getNormalSlectedDataOrBuilder(int i) {
        return this.normalSlectedData_.get(i);
    }

    public List<? extends WorkoutProto$SportsPageDataOrBuilder> getNormalSlectedDataOrBuilderList() {
        return this.normalSlectedData_;
    }

    @Override // com.heytap.health.protocol.workout.WorkoutProto$CustomSportsOrBuilder
    public WorkoutProto$SportsPageData getSlectedData(int i) {
        return this.slectedData_.get(i);
    }

    @Override // com.heytap.health.protocol.workout.WorkoutProto$CustomSportsOrBuilder
    public int getSlectedDataCount() {
        return this.slectedData_.size();
    }

    @Override // com.heytap.health.protocol.workout.WorkoutProto$CustomSportsOrBuilder
    public List<WorkoutProto$SportsPageData> getSlectedDataList() {
        return this.slectedData_;
    }

    public WorkoutProto$SportsPageDataOrBuilder getSlectedDataOrBuilder(int i) {
        return this.slectedData_.get(i);
    }

    public List<? extends WorkoutProto$SportsPageDataOrBuilder> getSlectedDataOrBuilderList() {
        return this.slectedData_;
    }

    @Override // com.heytap.health.protocol.workout.WorkoutProto$CustomSportsOrBuilder
    public int getSportCategory() {
        return this.sportCategory_;
    }

    @Override // com.heytap.health.protocol.workout.WorkoutProto$CustomSportsOrBuilder
    public WorkoutProto$SportsDataItem getSupportData(int i) {
        return this.supportData_.get(i);
    }

    @Override // com.heytap.health.protocol.workout.WorkoutProto$CustomSportsOrBuilder
    public int getSupportDataCount() {
        return this.supportData_.size();
    }

    @Override // com.heytap.health.protocol.workout.WorkoutProto$CustomSportsOrBuilder
    public List<WorkoutProto$SportsDataItem> getSupportDataList() {
        return this.supportData_;
    }

    public WorkoutProto$SportsDataItemOrBuilder getSupportDataOrBuilder(int i) {
        return this.supportData_.get(i);
    }

    public List<? extends WorkoutProto$SportsDataItemOrBuilder> getSupportDataOrBuilderList() {
        return this.supportData_;
    }

    public static Builder newBuilder(WorkoutProto$CustomSports workoutProto$CustomSports) {
        return DEFAULT_INSTANCE.createBuilder(workoutProto$CustomSports);
    }

    public static WorkoutProto$CustomSports parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (WorkoutProto$CustomSports) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static WorkoutProto$CustomSports parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (WorkoutProto$CustomSports) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static WorkoutProto$CustomSports parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (WorkoutProto$CustomSports) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addNormalSlectedData(int i, WorkoutProto$SportsPageData workoutProto$SportsPageData) {
        workoutProto$SportsPageData.getClass();
        ensureNormalSlectedDataIsMutable();
        this.normalSlectedData_.add(i, workoutProto$SportsPageData);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addSlectedData(int i, WorkoutProto$SportsPageData workoutProto$SportsPageData) {
        workoutProto$SportsPageData.getClass();
        ensureSlectedDataIsMutable();
        this.slectedData_.add(i, workoutProto$SportsPageData);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addSupportData(int i, WorkoutProto$SportsDataItem workoutProto$SportsDataItem) {
        workoutProto$SportsDataItem.getClass();
        ensureSupportDataIsMutable();
        this.supportData_.add(i, workoutProto$SportsDataItem);
    }

    public static WorkoutProto$CustomSports parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (WorkoutProto$CustomSports) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static WorkoutProto$CustomSports parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (WorkoutProto$CustomSports) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static WorkoutProto$CustomSports parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (WorkoutProto$CustomSports) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static WorkoutProto$CustomSports parseFrom(InputStream inputStream) throws IOException {
        return (WorkoutProto$CustomSports) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static WorkoutProto$CustomSports parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (WorkoutProto$CustomSports) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static WorkoutProto$CustomSports parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (WorkoutProto$CustomSports) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static WorkoutProto$CustomSports parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (WorkoutProto$CustomSports) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
