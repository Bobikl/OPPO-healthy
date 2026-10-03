package com.oplus.nearx.cloudconfig.bean;

import com.oplus.aiunit.vision.e1f;
import com.oplus.aiunit.vision.qam;
import com.oplus.nearx.protobuff.wire.FieldEncoding;
import com.oplus.nearx.protobuff.wire.Message;
import com.oplus.nearx.protobuff.wire.ProtoAdapter;
import com.oplus.nearx.protobuff.wire.b;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import okio.ByteString;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Deprecated;
import p010kotlin.DeprecationLevel;
import p010kotlin.Metadata;
import p010kotlin.Unit;
import p010kotlin.collections.CollectionsKt__CollectionsKt;
import p010kotlin.collections.CollectionsKt___CollectionsKt;
import p010kotlin.jvm.JvmField;
import p010kotlin.jvm.functions.Function1;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.jvm.internal.Ref;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0015\u0018\u0000 '2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001(B]\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\b\u0012\u000e\b\u0002\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\b\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b%\u0010&J\b\u0010\u0003\u001a\u00020\u0002H\u0017J\u0013\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0096\u0002J\b\u0010\t\u001a\u00020\bH\u0016J\b\u0010\u000b\u001a\u00020\nH\u0016Jc\u0010\u0016\u001a\u00020\u00002\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\b2\u000e\b\u0002\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0016\u0010\u0017R\u001c\u0010\f\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u001c\u0010\r\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR \u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0018\u001a\u0004\b!\u0010\u001aR\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010\"\u001a\u0004\b\u0012\u0010#R\u001c\u0010\u0013\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u001b\u001a\u0004\b$\u0010\u001d¨\u0006)"}, d2 = {"Lcom/oplus/nearx/cloudconfig/bean/TapManifest;", "Lcom/oplus/nearx/protobuff/wire/Message;", "", "newBuilder", "", "other", "", "equals", "", "hashCode", "", "toString", "artifactId", "artifactVersion", "", "Lcom/oplus/nearx/cloudconfig/bean/PluginInfo;", "pluginList", qam.y, "isEnable", "exceptionStateCode", "Lokio/ByteString;", "unknownFields", "copy", "(Ljava/lang/String;Ljava/lang/Integer;Ljava/util/List;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Integer;Lokio/ByteString;)Lcom/oplus/nearx/cloudconfig/bean/TapManifest;", "Ljava/lang/String;", "getArtifactId", "()Ljava/lang/String;", "Ljava/lang/Integer;", "getArtifactVersion", "()Ljava/lang/Integer;", "Ljava/util/List;", "getPluginList", "()Ljava/util/List;", "getExtInfo", "Ljava/lang/Boolean;", "()Ljava/lang/Boolean;", "getExceptionStateCode", "<init>", "(Ljava/lang/String;Ljava/lang/Integer;Ljava/util/List;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Integer;Lokio/ByteString;)V", "Companion", "a", "com.oplus.nearx.cloudconfig-proto-wire"}, k = 1, mv = {1, 4, 0})
public final class TapManifest extends Message {

    @JvmField
    @NotNull
    public static final ProtoAdapter<TapManifest> ADAPTER;

    @Nullable
    private final String artifactId;

    @Nullable
    private final Integer artifactVersion;

    @Nullable
    private final Integer exceptionStateCode;

    @Nullable
    private final String extInfo;

    @Nullable
    private final Boolean isEnable;

    @NotNull
    private final List<PluginInfo> pluginList;

    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final Class<?> cls = companion.getClass();
        ADAPTER = new ProtoAdapter<TapManifest>(fieldEncoding, cls) { // from class: com.oplus.nearx.cloudconfig.bean.TapManifest$Companion$ADAPTER$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.oplus.nearx.protobuff.wire.ProtoAdapter
            @NotNull
            /* JADX INFO: renamed from: u, reason: merged with bridge method [inline-methods] */
            public TapManifest e(@NotNull final e1f reader) {
                Intrinsics.checkParameterIsNotNull(reader, "reader");
                final Ref.ObjectRef objectRef = new Ref.ObjectRef();
                objectRef.element = null;
                final Ref.ObjectRef objectRef2 = new Ref.ObjectRef();
                objectRef2.element = null;
                final ArrayList arrayList = new ArrayList();
                final Ref.ObjectRef objectRef3 = new Ref.ObjectRef();
                objectRef3.element = null;
                final Ref.ObjectRef objectRef4 = new Ref.ObjectRef();
                objectRef4.element = null;
                final Ref.ObjectRef objectRef5 = new Ref.ObjectRef();
                objectRef5.element = null;
                return new TapManifest((String) objectRef.element, (Integer) objectRef2.element, arrayList, (String) objectRef3.element, (Boolean) objectRef4.element, (Integer) objectRef5.element, WireUtilKt.forEachTag(reader, new Function1<Integer, Object>() { // from class: com.oplus.nearx.cloudconfig.bean.TapManifest$Companion$ADAPTER$1$decode$unknownFields$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // p010kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Object invoke(Integer num) {
                        return invoke(num.intValue());
                    }

                    /* JADX WARN: Type inference failed for: r1v15, types: [T, java.lang.String] */
                    /* JADX WARN: Type inference failed for: r1v19, types: [T, java.lang.Boolean] */
                    /* JADX WARN: Type inference failed for: r1v23, types: [T, java.lang.Integer] */
                    /* JADX WARN: Type inference failed for: r1v3, types: [T, java.lang.String] */
                    /* JADX WARN: Type inference failed for: r1v7, types: [T, java.lang.Integer] */
                    @NotNull
                    public final Object invoke(int i) throws IOException {
                        switch (i) {
                            case 1:
                                objectRef.element = ProtoAdapter.STRING.e(reader);
                                return Unit.INSTANCE;
                            case 2:
                                objectRef2.element = ProtoAdapter.INT32.e(reader);
                                return Unit.INSTANCE;
                            case 3:
                                List list = arrayList;
                                PluginInfo pluginInfoE = PluginInfo.ADAPTER.e(reader);
                                Intrinsics.checkExpressionValueIsNotNull(pluginInfoE, "PluginInfo.ADAPTER.decode(reader)");
                                return Boolean.valueOf(list.add(pluginInfoE));
                            case 4:
                                objectRef3.element = ProtoAdapter.STRING.e(reader);
                                return Unit.INSTANCE;
                            case 5:
                                objectRef4.element = ProtoAdapter.BOOL.e(reader);
                                return Unit.INSTANCE;
                            case 6:
                                objectRef5.element = ProtoAdapter.INT32.e(reader);
                                return Unit.INSTANCE;
                            default:
                                WireUtilKt.readUnknownField(reader, i);
                                return Unit.INSTANCE;
                        }
                    }
                }));
            }

            @Override // com.oplus.nearx.protobuff.wire.ProtoAdapter
            /* JADX INFO: renamed from: v, reason: merged with bridge method [inline-methods] */
            public void h(@NotNull b writer, @NotNull TapManifest value) throws IOException {
                Intrinsics.checkParameterIsNotNull(writer, "writer");
                Intrinsics.checkParameterIsNotNull(value, "value");
                ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
                protoAdapter.l(writer, 1, value.getArtifactId());
                ProtoAdapter<Integer> protoAdapter2 = ProtoAdapter.INT32;
                protoAdapter2.l(writer, 2, value.getArtifactVersion());
                PluginInfo.ADAPTER.b().l(writer, 3, value.getPluginList());
                protoAdapter.l(writer, 4, value.getExtInfo());
                ProtoAdapter.BOOL.l(writer, 5, value.getIsEnable());
                protoAdapter2.l(writer, 6, value.getExceptionStateCode());
                writer.k(value.unknownFields());
            }

            @Override // com.oplus.nearx.protobuff.wire.ProtoAdapter
            /* JADX INFO: renamed from: w, reason: merged with bridge method [inline-methods] */
            public int m(@NotNull TapManifest value) {
                Intrinsics.checkParameterIsNotNull(value, "value");
                ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
                int iN = protoAdapter.n(1, value.getArtifactId());
                ProtoAdapter<Integer> protoAdapter2 = ProtoAdapter.INT32;
                int iN2 = iN + protoAdapter2.n(2, value.getArtifactVersion()) + PluginInfo.ADAPTER.b().n(3, value.getPluginList()) + protoAdapter.n(4, value.getExtInfo()) + ProtoAdapter.BOOL.n(5, value.getIsEnable()) + protoAdapter2.n(6, value.getExceptionStateCode());
                ByteString byteStringUnknownFields = value.unknownFields();
                Intrinsics.checkExpressionValueIsNotNull(byteStringUnknownFields, "value.unknownFields()");
                return iN2 + Okio_api_250Kt.sizes(byteStringUnknownFields);
            }

            @Override // com.oplus.nearx.protobuff.wire.ProtoAdapter
            @NotNull
            /* JADX INFO: renamed from: x, reason: merged with bridge method [inline-methods] */
            public TapManifest r(@NotNull TapManifest value) {
                Intrinsics.checkParameterIsNotNull(value, "value");
                return TapManifest.copy$default(value, null, null, WireUtilKt.redactElements(value.getPluginList(), PluginInfo.ADAPTER), null, null, null, ByteString.EMPTY, 59, null);
            }
        };
    }

    public TapManifest() {
        this(null, null, null, null, null, null, null, 127, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ TapManifest copy$default(TapManifest tapManifest, String str, Integer num, List list, String str2, Boolean bool, Integer num2, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            str = tapManifest.artifactId;
        }
        if ((i & 2) != 0) {
            num = tapManifest.artifactVersion;
        }
        Integer num3 = num;
        if ((i & 4) != 0) {
            list = tapManifest.pluginList;
        }
        List list2 = list;
        if ((i & 8) != 0) {
            str2 = tapManifest.extInfo;
        }
        String str3 = str2;
        if ((i & 16) != 0) {
            bool = tapManifest.isEnable;
        }
        Boolean bool2 = bool;
        if ((i & 32) != 0) {
            num2 = tapManifest.exceptionStateCode;
        }
        Integer num4 = num2;
        if ((i & 64) != 0) {
            byteString = tapManifest.unknownFields();
            Intrinsics.checkExpressionValueIsNotNull(byteString, "this.unknownFields()");
        }
        return tapManifest.copy(str, num3, list2, str3, bool2, num4, byteString);
    }

    @NotNull
    public final TapManifest copy(@Nullable String artifactId, @Nullable Integer artifactVersion, @NotNull List<PluginInfo> pluginList, @Nullable String extInfo, @Nullable Boolean isEnable, @Nullable Integer exceptionStateCode, @NotNull ByteString unknownFields) {
        Intrinsics.checkParameterIsNotNull(pluginList, "pluginList");
        Intrinsics.checkParameterIsNotNull(unknownFields, "unknownFields");
        return new TapManifest(artifactId, artifactVersion, pluginList, extInfo, isEnable, exceptionStateCode, unknownFields);
    }

    public boolean equals(@Nullable Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof TapManifest)) {
            return false;
        }
        TapManifest tapManifest = (TapManifest) other;
        return Intrinsics.areEqual(unknownFields(), tapManifest.unknownFields()) && Intrinsics.areEqual(this.artifactId, tapManifest.artifactId) && Intrinsics.areEqual(this.artifactVersion, tapManifest.artifactVersion) && Intrinsics.areEqual(this.pluginList, tapManifest.pluginList) && Intrinsics.areEqual(this.extInfo, tapManifest.extInfo) && Intrinsics.areEqual(this.isEnable, tapManifest.isEnable) && Intrinsics.areEqual(this.exceptionStateCode, tapManifest.exceptionStateCode);
    }

    @Nullable
    public final String getArtifactId() {
        return this.artifactId;
    }

    @Nullable
    public final Integer getArtifactVersion() {
        return this.artifactVersion;
    }

    @Nullable
    public final Integer getExceptionStateCode() {
        return this.exceptionStateCode;
    }

    @Nullable
    public final String getExtInfo() {
        return this.extInfo;
    }

    @NotNull
    public final List<PluginInfo> getPluginList() {
        return this.pluginList;
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        String str = this.artifactId;
        int iHashCode = (str != null ? str.hashCode() : 0) * 37;
        Integer num = this.artifactVersion;
        int iHashCode2 = (((iHashCode + (num != null ? num.hashCode() : 0)) * 37) + this.pluginList.hashCode()) * 37;
        String str2 = this.extInfo;
        int iHashCode3 = (iHashCode2 + (str2 != null ? str2.hashCode() : 0)) * 37;
        Boolean bool = this.isEnable;
        int iHashCode4 = (iHashCode3 + (bool != null ? bool.hashCode() : 0)) * 37;
        Integer num2 = this.exceptionStateCode;
        int iHashCode5 = iHashCode4 + (num2 != null ? num2.hashCode() : 0);
        this.hashCode = iHashCode5;
        return iHashCode5;
    }

    @Nullable
    /* JADX INFO: renamed from: isEnable, reason: from getter */
    public final Boolean getIsEnable() {
        return this.isEnable;
    }

    @Override // com.oplus.nearx.protobuff.wire.Message
    public /* bridge */ /* synthetic */ Message.a newBuilder() {
        return (Message.a) m5187newBuilder();
    }

    @Override // com.oplus.nearx.protobuff.wire.Message
    @NotNull
    public String toString() {
        ArrayList arrayList = new ArrayList();
        if (this.artifactId != null) {
            arrayList.add("artifactId=" + this.artifactId);
        }
        if (this.artifactVersion != null) {
            arrayList.add("artifactVersion=" + this.artifactVersion);
        }
        if (!this.pluginList.isEmpty()) {
            arrayList.add("pluginList=" + this.pluginList);
        }
        if (this.extInfo != null) {
            arrayList.add("extInfo=" + this.extInfo);
        }
        if (this.isEnable != null) {
            arrayList.add("isEnable=" + this.isEnable);
        }
        if (this.exceptionStateCode != null) {
            arrayList.add("exceptionStateCode=" + this.exceptionStateCode);
        }
        return CollectionsKt___CollectionsKt.joinToString$default(arrayList, ", ", "TapManifest{", "}", 0, null, null, 56, null);
    }

    public /* synthetic */ TapManifest(String str, Integer num, List list, String str2, Boolean bool, Integer num2, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : num, (i & 4) != 0 ? CollectionsKt__CollectionsKt.emptyList() : list, (i & 8) != 0 ? null : str2, (i & 16) != 0 ? null : bool, (i & 32) != 0 ? null : num2, (i & 64) != 0 ? ByteString.EMPTY : byteString);
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Shouldn't be used in Kotlin")
    @NotNull
    /* JADX INFO: renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m5187newBuilder() {
        throw new AssertionError();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TapManifest(@Nullable String str, @Nullable Integer num, @NotNull List<PluginInfo> pluginList, @Nullable String str2, @Nullable Boolean bool, @Nullable Integer num2, @NotNull ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkParameterIsNotNull(pluginList, "pluginList");
        Intrinsics.checkParameterIsNotNull(unknownFields, "unknownFields");
        this.artifactId = str;
        this.artifactVersion = num;
        this.pluginList = pluginList;
        this.extInfo = str2;
        this.isEnable = bool;
        this.exceptionStateCode = num2;
    }
}
