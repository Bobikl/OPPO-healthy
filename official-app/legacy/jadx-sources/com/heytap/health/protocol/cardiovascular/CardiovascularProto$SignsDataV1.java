package com.heytap.health.protocol.cardiovascular;

import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.Internal;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.Parser;
import com.oplus.aiunit.vision.z23;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes17.dex */
public final class CardiovascularProto$SignsDataV1 extends GeneratedMessageLite<CardiovascularProto$SignsDataV1, Builder> implements CardiovascularProto$SignsDataV1OrBuilder {
    public static final int BASELINES_FIELD_NUMBER = 5;
    public static final int CURRENTDAYS_FIELD_NUMBER = 9;
    private static final CardiovascularProto$SignsDataV1 DEFAULT_INSTANCE;
    public static final int LEGEND_FIELD_NUMBER = 2;
    private static volatile Parser<CardiovascularProto$SignsDataV1> PARSER = null;
    public static final int SAFELOWERLIMIT_FIELD_NUMBER = 7;
    public static final int SAFEUPPERLIMIT_FIELD_NUMBER = 6;
    public static final int TIMELIST_FIELD_NUMBER = 3;
    public static final int TOTALDAYS_FIELD_NUMBER = 8;
    public static final int TYPE_FIELD_NUMBER = 1;
    public static final int VALUES_FIELD_NUMBER = 4;
    private int currentDays_;
    private int totalDays_;
    private int type_;
    private int timeListMemoizedSerializedSize = -1;
    private int valuesMemoizedSerializedSize = -1;
    private int baselinesMemoizedSerializedSize = -1;
    private int safeUpperLimitMemoizedSerializedSize = -1;
    private int safeLowerLimitMemoizedSerializedSize = -1;
    private String legend_ = "";
    private Internal.IntList timeList_ = GeneratedMessageLite.emptyIntList();
    private Internal.IntList values_ = GeneratedMessageLite.emptyIntList();
    private Internal.IntList baselines_ = GeneratedMessageLite.emptyIntList();
    private Internal.IntList safeUpperLimit_ = GeneratedMessageLite.emptyIntList();
    private Internal.IntList safeLowerLimit_ = GeneratedMessageLite.emptyIntList();

    public static final class Builder extends GeneratedMessageLite.Builder<CardiovascularProto$SignsDataV1, Builder> implements CardiovascularProto$SignsDataV1OrBuilder {
        public Builder addAllBaselines(Iterable<? extends Integer> iterable) {
            copyOnWrite();
            ((CardiovascularProto$SignsDataV1) this.instance).addAllBaselines(iterable);
            return this;
        }

        public Builder addAllSafeLowerLimit(Iterable<? extends Integer> iterable) {
            copyOnWrite();
            ((CardiovascularProto$SignsDataV1) this.instance).addAllSafeLowerLimit(iterable);
            return this;
        }

        public Builder addAllSafeUpperLimit(Iterable<? extends Integer> iterable) {
            copyOnWrite();
            ((CardiovascularProto$SignsDataV1) this.instance).addAllSafeUpperLimit(iterable);
            return this;
        }

        public Builder addAllTimeList(Iterable<? extends Integer> iterable) {
            copyOnWrite();
            ((CardiovascularProto$SignsDataV1) this.instance).addAllTimeList(iterable);
            return this;
        }

        public Builder addAllValues(Iterable<? extends Integer> iterable) {
            copyOnWrite();
            ((CardiovascularProto$SignsDataV1) this.instance).addAllValues(iterable);
            return this;
        }

        public Builder addBaselines(int i) {
            copyOnWrite();
            ((CardiovascularProto$SignsDataV1) this.instance).addBaselines(i);
            return this;
        }

        public Builder addSafeLowerLimit(int i) {
            copyOnWrite();
            ((CardiovascularProto$SignsDataV1) this.instance).addSafeLowerLimit(i);
            return this;
        }

        public Builder addSafeUpperLimit(int i) {
            copyOnWrite();
            ((CardiovascularProto$SignsDataV1) this.instance).addSafeUpperLimit(i);
            return this;
        }

        public Builder addTimeList(int i) {
            copyOnWrite();
            ((CardiovascularProto$SignsDataV1) this.instance).addTimeList(i);
            return this;
        }

        public Builder addValues(int i) {
            copyOnWrite();
            ((CardiovascularProto$SignsDataV1) this.instance).addValues(i);
            return this;
        }

        public Builder clearBaselines() {
            copyOnWrite();
            ((CardiovascularProto$SignsDataV1) this.instance).clearBaselines();
            return this;
        }

        public Builder clearCurrentDays() {
            copyOnWrite();
            ((CardiovascularProto$SignsDataV1) this.instance).clearCurrentDays();
            return this;
        }

        public Builder clearLegend() {
            copyOnWrite();
            ((CardiovascularProto$SignsDataV1) this.instance).clearLegend();
            return this;
        }

        public Builder clearSafeLowerLimit() {
            copyOnWrite();
            ((CardiovascularProto$SignsDataV1) this.instance).clearSafeLowerLimit();
            return this;
        }

        public Builder clearSafeUpperLimit() {
            copyOnWrite();
            ((CardiovascularProto$SignsDataV1) this.instance).clearSafeUpperLimit();
            return this;
        }

        public Builder clearTimeList() {
            copyOnWrite();
            ((CardiovascularProto$SignsDataV1) this.instance).clearTimeList();
            return this;
        }

        public Builder clearTotalDays() {
            copyOnWrite();
            ((CardiovascularProto$SignsDataV1) this.instance).clearTotalDays();
            return this;
        }

        public Builder clearType() {
            copyOnWrite();
            ((CardiovascularProto$SignsDataV1) this.instance).clearType();
            return this;
        }

        public Builder clearValues() {
            copyOnWrite();
            ((CardiovascularProto$SignsDataV1) this.instance).clearValues();
            return this;
        }

        @Override // com.heytap.health.protocol.cardiovascular.CardiovascularProto$SignsDataV1OrBuilder
        public int getBaselines(int i) {
            return ((CardiovascularProto$SignsDataV1) this.instance).getBaselines(i);
        }

        @Override // com.heytap.health.protocol.cardiovascular.CardiovascularProto$SignsDataV1OrBuilder
        public int getBaselinesCount() {
            return ((CardiovascularProto$SignsDataV1) this.instance).getBaselinesCount();
        }

        @Override // com.heytap.health.protocol.cardiovascular.CardiovascularProto$SignsDataV1OrBuilder
        public List<Integer> getBaselinesList() {
            return Collections.unmodifiableList(((CardiovascularProto$SignsDataV1) this.instance).getBaselinesList());
        }

        @Override // com.heytap.health.protocol.cardiovascular.CardiovascularProto$SignsDataV1OrBuilder
        public int getCurrentDays() {
            return ((CardiovascularProto$SignsDataV1) this.instance).getCurrentDays();
        }

        @Override // com.heytap.health.protocol.cardiovascular.CardiovascularProto$SignsDataV1OrBuilder
        public String getLegend() {
            return ((CardiovascularProto$SignsDataV1) this.instance).getLegend();
        }

        @Override // com.heytap.health.protocol.cardiovascular.CardiovascularProto$SignsDataV1OrBuilder
        public ByteString getLegendBytes() {
            return ((CardiovascularProto$SignsDataV1) this.instance).getLegendBytes();
        }

        @Override // com.heytap.health.protocol.cardiovascular.CardiovascularProto$SignsDataV1OrBuilder
        public int getSafeLowerLimit(int i) {
            return ((CardiovascularProto$SignsDataV1) this.instance).getSafeLowerLimit(i);
        }

        @Override // com.heytap.health.protocol.cardiovascular.CardiovascularProto$SignsDataV1OrBuilder
        public int getSafeLowerLimitCount() {
            return ((CardiovascularProto$SignsDataV1) this.instance).getSafeLowerLimitCount();
        }

        @Override // com.heytap.health.protocol.cardiovascular.CardiovascularProto$SignsDataV1OrBuilder
        public List<Integer> getSafeLowerLimitList() {
            return Collections.unmodifiableList(((CardiovascularProto$SignsDataV1) this.instance).getSafeLowerLimitList());
        }

        @Override // com.heytap.health.protocol.cardiovascular.CardiovascularProto$SignsDataV1OrBuilder
        public int getSafeUpperLimit(int i) {
            return ((CardiovascularProto$SignsDataV1) this.instance).getSafeUpperLimit(i);
        }

        @Override // com.heytap.health.protocol.cardiovascular.CardiovascularProto$SignsDataV1OrBuilder
        public int getSafeUpperLimitCount() {
            return ((CardiovascularProto$SignsDataV1) this.instance).getSafeUpperLimitCount();
        }

        @Override // com.heytap.health.protocol.cardiovascular.CardiovascularProto$SignsDataV1OrBuilder
        public List<Integer> getSafeUpperLimitList() {
            return Collections.unmodifiableList(((CardiovascularProto$SignsDataV1) this.instance).getSafeUpperLimitList());
        }

        @Override // com.heytap.health.protocol.cardiovascular.CardiovascularProto$SignsDataV1OrBuilder
        public int getTimeList(int i) {
            return ((CardiovascularProto$SignsDataV1) this.instance).getTimeList(i);
        }

        @Override // com.heytap.health.protocol.cardiovascular.CardiovascularProto$SignsDataV1OrBuilder
        public int getTimeListCount() {
            return ((CardiovascularProto$SignsDataV1) this.instance).getTimeListCount();
        }

        @Override // com.heytap.health.protocol.cardiovascular.CardiovascularProto$SignsDataV1OrBuilder
        public List<Integer> getTimeListList() {
            return Collections.unmodifiableList(((CardiovascularProto$SignsDataV1) this.instance).getTimeListList());
        }

        @Override // com.heytap.health.protocol.cardiovascular.CardiovascularProto$SignsDataV1OrBuilder
        public int getTotalDays() {
            return ((CardiovascularProto$SignsDataV1) this.instance).getTotalDays();
        }

        @Override // com.heytap.health.protocol.cardiovascular.CardiovascularProto$SignsDataV1OrBuilder
        public int getType() {
            return ((CardiovascularProto$SignsDataV1) this.instance).getType();
        }

        @Override // com.heytap.health.protocol.cardiovascular.CardiovascularProto$SignsDataV1OrBuilder
        public int getValues(int i) {
            return ((CardiovascularProto$SignsDataV1) this.instance).getValues(i);
        }

        @Override // com.heytap.health.protocol.cardiovascular.CardiovascularProto$SignsDataV1OrBuilder
        public int getValuesCount() {
            return ((CardiovascularProto$SignsDataV1) this.instance).getValuesCount();
        }

        @Override // com.heytap.health.protocol.cardiovascular.CardiovascularProto$SignsDataV1OrBuilder
        public List<Integer> getValuesList() {
            return Collections.unmodifiableList(((CardiovascularProto$SignsDataV1) this.instance).getValuesList());
        }

        public Builder setBaselines(int i, int i2) {
            copyOnWrite();
            ((CardiovascularProto$SignsDataV1) this.instance).setBaselines(i, i2);
            return this;
        }

        public Builder setCurrentDays(int i) {
            copyOnWrite();
            ((CardiovascularProto$SignsDataV1) this.instance).setCurrentDays(i);
            return this;
        }

        public Builder setLegend(String str) {
            copyOnWrite();
            ((CardiovascularProto$SignsDataV1) this.instance).setLegend(str);
            return this;
        }

        public Builder setLegendBytes(ByteString byteString) {
            copyOnWrite();
            ((CardiovascularProto$SignsDataV1) this.instance).setLegendBytes(byteString);
            return this;
        }

        public Builder setSafeLowerLimit(int i, int i2) {
            copyOnWrite();
            ((CardiovascularProto$SignsDataV1) this.instance).setSafeLowerLimit(i, i2);
            return this;
        }

        public Builder setSafeUpperLimit(int i, int i2) {
            copyOnWrite();
            ((CardiovascularProto$SignsDataV1) this.instance).setSafeUpperLimit(i, i2);
            return this;
        }

        public Builder setTimeList(int i, int i2) {
            copyOnWrite();
            ((CardiovascularProto$SignsDataV1) this.instance).setTimeList(i, i2);
            return this;
        }

        public Builder setTotalDays(int i) {
            copyOnWrite();
            ((CardiovascularProto$SignsDataV1) this.instance).setTotalDays(i);
            return this;
        }

        public Builder setType(int i) {
            copyOnWrite();
            ((CardiovascularProto$SignsDataV1) this.instance).setType(i);
            return this;
        }

        public Builder setValues(int i, int i2) {
            copyOnWrite();
            ((CardiovascularProto$SignsDataV1) this.instance).setValues(i, i2);
            return this;
        }

        private Builder() {
            super(CardiovascularProto$SignsDataV1.DEFAULT_INSTANCE);
        }
    }

    static {
        CardiovascularProto$SignsDataV1 cardiovascularProto$SignsDataV1 = new CardiovascularProto$SignsDataV1();
        DEFAULT_INSTANCE = cardiovascularProto$SignsDataV1;
        GeneratedMessageLite.registerDefaultInstance(CardiovascularProto$SignsDataV1.class, cardiovascularProto$SignsDataV1);
    }

    private CardiovascularProto$SignsDataV1() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllBaselines(Iterable<? extends Integer> iterable) {
        ensureBaselinesIsMutable();
        AbstractMessageLite.addAll((Iterable) iterable, (List) this.baselines_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllSafeLowerLimit(Iterable<? extends Integer> iterable) {
        ensureSafeLowerLimitIsMutable();
        AbstractMessageLite.addAll((Iterable) iterable, (List) this.safeLowerLimit_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllSafeUpperLimit(Iterable<? extends Integer> iterable) {
        ensureSafeUpperLimitIsMutable();
        AbstractMessageLite.addAll((Iterable) iterable, (List) this.safeUpperLimit_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllTimeList(Iterable<? extends Integer> iterable) {
        ensureTimeListIsMutable();
        AbstractMessageLite.addAll((Iterable) iterable, (List) this.timeList_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllValues(Iterable<? extends Integer> iterable) {
        ensureValuesIsMutable();
        AbstractMessageLite.addAll((Iterable) iterable, (List) this.values_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addBaselines(int i) {
        ensureBaselinesIsMutable();
        this.baselines_.addInt(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addSafeLowerLimit(int i) {
        ensureSafeLowerLimitIsMutable();
        this.safeLowerLimit_.addInt(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addSafeUpperLimit(int i) {
        ensureSafeUpperLimitIsMutable();
        this.safeUpperLimit_.addInt(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addTimeList(int i) {
        ensureTimeListIsMutable();
        this.timeList_.addInt(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addValues(int i) {
        ensureValuesIsMutable();
        this.values_.addInt(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearBaselines() {
        this.baselines_ = GeneratedMessageLite.emptyIntList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCurrentDays() {
        this.currentDays_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearLegend() {
        this.legend_ = getDefaultInstance().getLegend();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSafeLowerLimit() {
        this.safeLowerLimit_ = GeneratedMessageLite.emptyIntList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSafeUpperLimit() {
        this.safeUpperLimit_ = GeneratedMessageLite.emptyIntList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTimeList() {
        this.timeList_ = GeneratedMessageLite.emptyIntList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTotalDays() {
        this.totalDays_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearType() {
        this.type_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearValues() {
        this.values_ = GeneratedMessageLite.emptyIntList();
    }

    private void ensureBaselinesIsMutable() {
        Internal.IntList intList = this.baselines_;
        if (intList.isModifiable()) {
            return;
        }
        this.baselines_ = GeneratedMessageLite.mutableCopy(intList);
    }

    private void ensureSafeLowerLimitIsMutable() {
        Internal.IntList intList = this.safeLowerLimit_;
        if (intList.isModifiable()) {
            return;
        }
        this.safeLowerLimit_ = GeneratedMessageLite.mutableCopy(intList);
    }

    private void ensureSafeUpperLimitIsMutable() {
        Internal.IntList intList = this.safeUpperLimit_;
        if (intList.isModifiable()) {
            return;
        }
        this.safeUpperLimit_ = GeneratedMessageLite.mutableCopy(intList);
    }

    private void ensureTimeListIsMutable() {
        Internal.IntList intList = this.timeList_;
        if (intList.isModifiable()) {
            return;
        }
        this.timeList_ = GeneratedMessageLite.mutableCopy(intList);
    }

    private void ensureValuesIsMutable() {
        Internal.IntList intList = this.values_;
        if (intList.isModifiable()) {
            return;
        }
        this.values_ = GeneratedMessageLite.mutableCopy(intList);
    }

    public static CardiovascularProto$SignsDataV1 getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static CardiovascularProto$SignsDataV1 parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (CardiovascularProto$SignsDataV1) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static CardiovascularProto$SignsDataV1 parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (CardiovascularProto$SignsDataV1) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<CardiovascularProto$SignsDataV1> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setBaselines(int i, int i2) {
        ensureBaselinesIsMutable();
        this.baselines_.setInt(i, i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCurrentDays(int i) {
        this.currentDays_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLegend(String str) {
        str.getClass();
        this.legend_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLegendBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.legend_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSafeLowerLimit(int i, int i2) {
        ensureSafeLowerLimitIsMutable();
        this.safeLowerLimit_.setInt(i, i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSafeUpperLimit(int i, int i2) {
        ensureSafeUpperLimitIsMutable();
        this.safeUpperLimit_.setInt(i, i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTimeList(int i, int i2) {
        ensureTimeListIsMutable();
        this.timeList_.setInt(i, i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTotalDays(int i) {
        this.totalDays_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setType(int i) {
        this.type_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setValues(int i, int i2) {
        ensureValuesIsMutable();
        this.values_.setInt(i, i2);
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        int i = z23.a[methodToInvoke.ordinal()];
        switch (i) {
            case 1:
                return new CardiovascularProto$SignsDataV1();
            case 2:
                return new Builder();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\t\u0000\u0000\u0001\t\t\u0000\u0005\u0000\u0001\u000b\u0002Ȉ\u0003+\u0004+\u0005+\u0006+\u0007+\b\u000b\t\u000b", new Object[]{"type_", "legend_", "timeList_", "values_", "baselines_", "safeUpperLimit_", "safeLowerLimit_", "totalDays_", "currentDays_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<CardiovascularProto$SignsDataV1> defaultInstanceBasedParser = PARSER;
                if (defaultInstanceBasedParser == null) {
                    synchronized (CardiovascularProto$SignsDataV1.class) {
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

    @Override // com.heytap.health.protocol.cardiovascular.CardiovascularProto$SignsDataV1OrBuilder
    public int getBaselines(int i) {
        return this.baselines_.getInt(i);
    }

    @Override // com.heytap.health.protocol.cardiovascular.CardiovascularProto$SignsDataV1OrBuilder
    public int getBaselinesCount() {
        return this.baselines_.size();
    }

    @Override // com.heytap.health.protocol.cardiovascular.CardiovascularProto$SignsDataV1OrBuilder
    public List<Integer> getBaselinesList() {
        return this.baselines_;
    }

    @Override // com.heytap.health.protocol.cardiovascular.CardiovascularProto$SignsDataV1OrBuilder
    public int getCurrentDays() {
        return this.currentDays_;
    }

    @Override // com.heytap.health.protocol.cardiovascular.CardiovascularProto$SignsDataV1OrBuilder
    public String getLegend() {
        return this.legend_;
    }

    @Override // com.heytap.health.protocol.cardiovascular.CardiovascularProto$SignsDataV1OrBuilder
    public ByteString getLegendBytes() {
        return ByteString.copyFromUtf8(this.legend_);
    }

    @Override // com.heytap.health.protocol.cardiovascular.CardiovascularProto$SignsDataV1OrBuilder
    public int getSafeLowerLimit(int i) {
        return this.safeLowerLimit_.getInt(i);
    }

    @Override // com.heytap.health.protocol.cardiovascular.CardiovascularProto$SignsDataV1OrBuilder
    public int getSafeLowerLimitCount() {
        return this.safeLowerLimit_.size();
    }

    @Override // com.heytap.health.protocol.cardiovascular.CardiovascularProto$SignsDataV1OrBuilder
    public List<Integer> getSafeLowerLimitList() {
        return this.safeLowerLimit_;
    }

    @Override // com.heytap.health.protocol.cardiovascular.CardiovascularProto$SignsDataV1OrBuilder
    public int getSafeUpperLimit(int i) {
        return this.safeUpperLimit_.getInt(i);
    }

    @Override // com.heytap.health.protocol.cardiovascular.CardiovascularProto$SignsDataV1OrBuilder
    public int getSafeUpperLimitCount() {
        return this.safeUpperLimit_.size();
    }

    @Override // com.heytap.health.protocol.cardiovascular.CardiovascularProto$SignsDataV1OrBuilder
    public List<Integer> getSafeUpperLimitList() {
        return this.safeUpperLimit_;
    }

    @Override // com.heytap.health.protocol.cardiovascular.CardiovascularProto$SignsDataV1OrBuilder
    public int getTimeList(int i) {
        return this.timeList_.getInt(i);
    }

    @Override // com.heytap.health.protocol.cardiovascular.CardiovascularProto$SignsDataV1OrBuilder
    public int getTimeListCount() {
        return this.timeList_.size();
    }

    @Override // com.heytap.health.protocol.cardiovascular.CardiovascularProto$SignsDataV1OrBuilder
    public List<Integer> getTimeListList() {
        return this.timeList_;
    }

    @Override // com.heytap.health.protocol.cardiovascular.CardiovascularProto$SignsDataV1OrBuilder
    public int getTotalDays() {
        return this.totalDays_;
    }

    @Override // com.heytap.health.protocol.cardiovascular.CardiovascularProto$SignsDataV1OrBuilder
    public int getType() {
        return this.type_;
    }

    @Override // com.heytap.health.protocol.cardiovascular.CardiovascularProto$SignsDataV1OrBuilder
    public int getValues(int i) {
        return this.values_.getInt(i);
    }

    @Override // com.heytap.health.protocol.cardiovascular.CardiovascularProto$SignsDataV1OrBuilder
    public int getValuesCount() {
        return this.values_.size();
    }

    @Override // com.heytap.health.protocol.cardiovascular.CardiovascularProto$SignsDataV1OrBuilder
    public List<Integer> getValuesList() {
        return this.values_;
    }

    public static Builder newBuilder(CardiovascularProto$SignsDataV1 cardiovascularProto$SignsDataV1) {
        return DEFAULT_INSTANCE.createBuilder(cardiovascularProto$SignsDataV1);
    }

    public static CardiovascularProto$SignsDataV1 parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (CardiovascularProto$SignsDataV1) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static CardiovascularProto$SignsDataV1 parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (CardiovascularProto$SignsDataV1) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static CardiovascularProto$SignsDataV1 parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (CardiovascularProto$SignsDataV1) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static CardiovascularProto$SignsDataV1 parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (CardiovascularProto$SignsDataV1) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static CardiovascularProto$SignsDataV1 parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (CardiovascularProto$SignsDataV1) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static CardiovascularProto$SignsDataV1 parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (CardiovascularProto$SignsDataV1) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static CardiovascularProto$SignsDataV1 parseFrom(InputStream inputStream) throws IOException {
        return (CardiovascularProto$SignsDataV1) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static CardiovascularProto$SignsDataV1 parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (CardiovascularProto$SignsDataV1) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static CardiovascularProto$SignsDataV1 parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (CardiovascularProto$SignsDataV1) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static CardiovascularProto$SignsDataV1 parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (CardiovascularProto$SignsDataV1) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
