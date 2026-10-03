package com.heytap.nearx.cloudconfig.bean;

import com.heytap.nearx.protobuff.wire.FieldEncoding;
import com.heytap.nearx.protobuff.wire.Message;
import com.heytap.nearx.protobuff.wire.ProtoAdapter;
import com.heytap.nearx.protobuff.wire.WireField;
import com.heytap.nearx.protobuff.wire.b;
import com.oplus.aiunit.vision.f1f;
import io.netty.util.internal.StringUtil;
import java.io.IOException;
import java.util.ArrayList;
import okio.ByteString;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Deprecated;
import p010kotlin.DeprecationLevel;
import p010kotlin.Metadata;
import p010kotlin.Unit;
import p010kotlin.collections.CollectionsKt___CollectionsKt;
import p010kotlin.jvm.JvmField;
import p010kotlin.jvm.functions.Function1;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.jvm.internal.Ref;

/* JADX INFO: loaded from: classes17.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0005\u0018\u0000 \"2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\"Bc\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\f\u001a\u00020\r¢\u0006\u0002\u0010\u000eJi\u0010\u0019\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\f\u001a\u00020\r¢\u0006\u0002\u0010\u001aJ\u0013\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eH\u0096\u0002J\b\u0010\u001f\u001a\u00020\u0006H\u0016J\b\u0010 \u001a\u00020\u0002H\u0017J\b\u0010!\u001a\u00020\u0004H\u0016R\u0018\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u001a\u0010\u000b\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u0013\u001a\u0004\b\u0011\u0010\u0012R\u001a\u0010\t\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u0013\u001a\u0004\b\u0014\u0010\u0012R\u0018\u0010\b\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0010R\u001a\u0010\n\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u0013\u001a\u0004\b\u0016\u0010\u0012R\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0010R\u001a\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u0013\u001a\u0004\b\u0018\u0010\u0012¨\u0006#"}, d2 = {"Lcom/heytap/nearx/cloudconfig/bean/UpdateConfigItem;", "Lcom/heytap/nearx/protobuff/wire/Message;", "", "config_code", "", "version", "", "url", "pub_key", "interval_time", "type", "download_under_wifi", "unknownFields", "Lokio/ByteString;", "(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Lokio/ByteString;)V", "getConfig_code", "()Ljava/lang/String;", "getDownload_under_wifi", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getInterval_time", "getPub_key", "getType", "getUrl", "getVersion", "copy", "(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Lokio/ByteString;)Lcom/heytap/nearx/cloudconfig/bean/UpdateConfigItem;", "equals", "", "other", "", "hashCode", "newBuilder", "toString", "Companion", "cloudconfig-proto"}, k = 1, mv = {1, 1, 16})
public final class UpdateConfigItem extends Message {

    @JvmField
    @NotNull
    public static final ProtoAdapter<UpdateConfigItem> ADAPTER;

    @WireField(adapter = "com.heytap.nearx.protobuff.wire.ProtoAdapter#STRING", tag = 1)
    @Nullable
    private final String config_code;

    @WireField(adapter = "com.heytap.nearx.protobuff.wire.ProtoAdapter#INT32", tag = 7)
    @Nullable
    private final Integer download_under_wifi;

    @WireField(adapter = "com.heytap.nearx.protobuff.wire.ProtoAdapter#INT32", tag = 5)
    @Nullable
    private final Integer interval_time;

    @WireField(adapter = "com.heytap.nearx.protobuff.wire.ProtoAdapter#STRING", tag = 4)
    @Nullable
    private final String pub_key;

    @WireField(adapter = "com.heytap.nearx.protobuff.wire.ProtoAdapter#INT32", tag = 6)
    @Nullable
    private final Integer type;

    @WireField(adapter = "com.heytap.nearx.protobuff.wire.ProtoAdapter#STRING", tag = 3)
    @Nullable
    private final String url;

    @WireField(adapter = "com.heytap.nearx.protobuff.wire.ProtoAdapter#INT32", tag = 2)
    @Nullable
    private final Integer version;

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final Class<UpdateConfigItem> cls = UpdateConfigItem.class;
        ADAPTER = new ProtoAdapter<UpdateConfigItem>(fieldEncoding, cls) { // from class: com.heytap.nearx.cloudconfig.bean.UpdateConfigItem$Companion$ADAPTER$1
            /* JADX WARN: Can't rename method to resolve collision */
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.heytap.nearx.protobuff.wire.ProtoAdapter
            @NotNull
            public UpdateConfigItem decode(@NotNull final f1f reader) {
                Intrinsics.checkParameterIsNotNull(reader, "reader");
                final Ref.ObjectRef objectRef = new Ref.ObjectRef();
                objectRef.element = null;
                final Ref.ObjectRef objectRef2 = new Ref.ObjectRef();
                objectRef2.element = null;
                final Ref.ObjectRef objectRef3 = new Ref.ObjectRef();
                objectRef3.element = null;
                final Ref.ObjectRef objectRef4 = new Ref.ObjectRef();
                objectRef4.element = null;
                final Ref.ObjectRef objectRef5 = new Ref.ObjectRef();
                objectRef5.element = null;
                final Ref.ObjectRef objectRef6 = new Ref.ObjectRef();
                objectRef6.element = null;
                final Ref.ObjectRef objectRef7 = new Ref.ObjectRef();
                objectRef7.element = null;
                return new UpdateConfigItem((String) objectRef.element, (Integer) objectRef2.element, (String) objectRef3.element, (String) objectRef4.element, (Integer) objectRef5.element, (Integer) objectRef6.element, (Integer) objectRef7.element, WireUtilKt.forEachTag(reader, new Function1<Integer, Unit>() { // from class: com.heytap.nearx.cloudconfig.bean.UpdateConfigItem$Companion$ADAPTER$1$decode$unknownFields$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // p010kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(Integer num) {
                        invoke(num.intValue());
                        return Unit.INSTANCE;
                    }

                    /* JADX WARN: Type inference failed for: r1v12, types: [T, java.lang.String] */
                    /* JADX WARN: Type inference failed for: r1v15, types: [T, java.lang.Integer] */
                    /* JADX WARN: Type inference failed for: r1v18, types: [T, java.lang.Integer] */
                    /* JADX WARN: Type inference failed for: r1v21, types: [T, java.lang.Integer] */
                    /* JADX WARN: Type inference failed for: r1v3, types: [T, java.lang.String] */
                    /* JADX WARN: Type inference failed for: r1v6, types: [T, java.lang.Integer] */
                    /* JADX WARN: Type inference failed for: r1v9, types: [T, java.lang.String] */
                    public final void invoke(int i) {
                        switch (i) {
                            case 1:
                                objectRef.element = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 2:
                                objectRef2.element = ProtoAdapter.INT32.decode(reader);
                                break;
                            case 3:
                                objectRef3.element = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 4:
                                objectRef4.element = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 5:
                                objectRef5.element = ProtoAdapter.INT32.decode(reader);
                                break;
                            case 6:
                                objectRef6.element = ProtoAdapter.INT32.decode(reader);
                                break;
                            case 7:
                                objectRef7.element = ProtoAdapter.INT32.decode(reader);
                                break;
                            default:
                                WireUtilKt.readUnknownField(reader, i);
                                break;
                        }
                    }
                }));
            }

            @Override // com.heytap.nearx.protobuff.wire.ProtoAdapter
            public void encode(@NotNull b writer, @NotNull UpdateConfigItem value) throws IOException {
                Intrinsics.checkParameterIsNotNull(writer, "writer");
                Intrinsics.checkParameterIsNotNull(value, "value");
                ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
                protoAdapter.encodeWithTag(writer, 1, value.getConfig_code());
                ProtoAdapter<Integer> protoAdapter2 = ProtoAdapter.INT32;
                protoAdapter2.encodeWithTag(writer, 2, value.getVersion());
                protoAdapter.encodeWithTag(writer, 3, value.getUrl());
                protoAdapter.encodeWithTag(writer, 4, value.getPub_key());
                protoAdapter2.encodeWithTag(writer, 5, value.getInterval_time());
                protoAdapter2.encodeWithTag(writer, 6, value.getType());
                protoAdapter2.encodeWithTag(writer, 7, value.getDownload_under_wifi());
                writer.k(value.unknownFields());
            }

            @Override // com.heytap.nearx.protobuff.wire.ProtoAdapter
            public int encodedSize(@NotNull UpdateConfigItem value) {
                Intrinsics.checkParameterIsNotNull(value, "value");
                ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
                int iEncodedSizeWithTag = protoAdapter.encodedSizeWithTag(1, value.getConfig_code());
                ProtoAdapter<Integer> protoAdapter2 = ProtoAdapter.INT32;
                int iEncodedSizeWithTag2 = iEncodedSizeWithTag + protoAdapter2.encodedSizeWithTag(2, value.getVersion()) + protoAdapter.encodedSizeWithTag(3, value.getUrl()) + protoAdapter.encodedSizeWithTag(4, value.getPub_key()) + protoAdapter2.encodedSizeWithTag(5, value.getInterval_time()) + protoAdapter2.encodedSizeWithTag(6, value.getType()) + protoAdapter2.encodedSizeWithTag(7, value.getDownload_under_wifi());
                ByteString byteStringUnknownFields = value.unknownFields();
                Intrinsics.checkExpressionValueIsNotNull(byteStringUnknownFields, "value.unknownFields()");
                return iEncodedSizeWithTag2 + Okio_api_250Kt.sizes(byteStringUnknownFields);
            }

            @Override // com.heytap.nearx.protobuff.wire.ProtoAdapter
            @NotNull
            public UpdateConfigItem redact(@NotNull UpdateConfigItem value) {
                Intrinsics.checkParameterIsNotNull(value, "value");
                return UpdateConfigItem.copy$default(value, null, null, null, null, null, null, null, ByteString.EMPTY, 127, null);
            }
        };
    }

    public UpdateConfigItem() {
        this(null, null, null, null, null, null, null, null, 255, null);
    }

    public static /* synthetic */ UpdateConfigItem copy$default(UpdateConfigItem updateConfigItem, String str, Integer num, String str2, String str3, Integer num2, Integer num3, Integer num4, ByteString byteString, int i, Object obj) {
        ByteString byteStringUnknownFields;
        String str4 = (i & 1) != 0 ? updateConfigItem.config_code : str;
        Integer num5 = (i & 2) != 0 ? updateConfigItem.version : num;
        String str5 = (i & 4) != 0 ? updateConfigItem.url : str2;
        String str6 = (i & 8) != 0 ? updateConfigItem.pub_key : str3;
        Integer num6 = (i & 16) != 0 ? updateConfigItem.interval_time : num2;
        Integer num7 = (i & 32) != 0 ? updateConfigItem.type : num3;
        Integer num8 = (i & 64) != 0 ? updateConfigItem.download_under_wifi : num4;
        if ((i & 128) != 0) {
            byteStringUnknownFields = updateConfigItem.unknownFields();
            Intrinsics.checkExpressionValueIsNotNull(byteStringUnknownFields, "this.unknownFields()");
        } else {
            byteStringUnknownFields = byteString;
        }
        return updateConfigItem.copy(str4, num5, str5, str6, num6, num7, num8, byteStringUnknownFields);
    }

    @NotNull
    public final UpdateConfigItem copy(@Nullable String config_code, @Nullable Integer version, @Nullable String url, @Nullable String pub_key, @Nullable Integer interval_time, @Nullable Integer type, @Nullable Integer download_under_wifi, @NotNull ByteString unknownFields) {
        Intrinsics.checkParameterIsNotNull(unknownFields, "unknownFields");
        return new UpdateConfigItem(config_code, version, url, pub_key, interval_time, type, download_under_wifi, unknownFields);
    }

    public boolean equals(@Nullable Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof UpdateConfigItem)) {
            return false;
        }
        UpdateConfigItem updateConfigItem = (UpdateConfigItem) other;
        return Intrinsics.areEqual(unknownFields(), updateConfigItem.unknownFields()) && Intrinsics.areEqual(this.config_code, updateConfigItem.config_code) && Intrinsics.areEqual(this.version, updateConfigItem.version) && Intrinsics.areEqual(this.url, updateConfigItem.url) && Intrinsics.areEqual(this.pub_key, updateConfigItem.pub_key) && Intrinsics.areEqual(this.interval_time, updateConfigItem.interval_time) && Intrinsics.areEqual(this.type, updateConfigItem.type) && Intrinsics.areEqual(this.download_under_wifi, updateConfigItem.download_under_wifi);
    }

    @Nullable
    public final String getConfig_code() {
        return this.config_code;
    }

    @Nullable
    public final Integer getDownload_under_wifi() {
        return this.download_under_wifi;
    }

    @Nullable
    public final Integer getInterval_time() {
        return this.interval_time;
    }

    @Nullable
    public final String getPub_key() {
        return this.pub_key;
    }

    @Nullable
    public final Integer getType() {
        return this.type;
    }

    @Nullable
    public final String getUrl() {
        return this.url;
    }

    @Nullable
    public final Integer getVersion() {
        return this.version;
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        String str = this.config_code;
        int iHashCode = (str != null ? str.hashCode() : 0) * 37;
        Integer num = this.version;
        int iHashCode2 = (iHashCode + (num != null ? num.hashCode() : 0)) * 37;
        String str2 = this.url;
        int iHashCode3 = (iHashCode2 + (str2 != null ? str2.hashCode() : 0)) * 37;
        String str3 = this.pub_key;
        int iHashCode4 = (iHashCode3 + (str3 != null ? str3.hashCode() : 0)) * 37;
        Integer num2 = this.interval_time;
        int iHashCode5 = (iHashCode4 + (num2 != null ? num2.hashCode() : 0)) * 37;
        Integer num3 = this.type;
        int iHashCode6 = (iHashCode5 + (num3 != null ? num3.hashCode() : 0)) * 37;
        Integer num4 = this.download_under_wifi;
        int iHashCode7 = iHashCode6 + (num4 != null ? num4.hashCode() : 0);
        this.hashCode = iHashCode7;
        return iHashCode7;
    }

    @Override // com.heytap.nearx.protobuff.wire.Message
    public /* bridge */ /* synthetic */ Message.a newBuilder() {
        return (Message.a) m4667newBuilder();
    }

    @Override // com.heytap.nearx.protobuff.wire.Message
    @NotNull
    public String toString() {
        ArrayList arrayList = new ArrayList();
        if (this.config_code != null) {
            arrayList.add("config_code=" + this.config_code);
        }
        if (this.version != null) {
            arrayList.add("version=" + this.version);
        }
        if (this.url != null) {
            arrayList.add("url=" + this.url);
        }
        if (this.pub_key != null) {
            arrayList.add("pub_key=" + this.pub_key);
        }
        if (this.interval_time != null) {
            arrayList.add("interval_time=" + this.interval_time);
        }
        if (this.type != null) {
            arrayList.add("type=" + this.type);
        }
        if (this.download_under_wifi != null) {
            arrayList.add("download_under_wifi =" + this.download_under_wifi + StringUtil.SPACE);
        }
        return CollectionsKt___CollectionsKt.joinToString$default(arrayList, ", ", "UpdateConfigItem{", "}", 0, null, null, 56, null);
    }

    public /* synthetic */ UpdateConfigItem(String str, Integer num, String str2, String str3, Integer num2, Integer num3, Integer num4, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : num, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? null : str3, (i & 16) != 0 ? null : num2, (i & 32) != 0 ? null : num3, (i & 64) != 0 ? null : num4, (i & 128) != 0 ? ByteString.EMPTY : byteString);
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Shouldn't be used in Kotlin")
    @NotNull
    /* JADX INFO: renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m4667newBuilder() {
        throw new AssertionError();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UpdateConfigItem(@Nullable String str, @Nullable Integer num, @Nullable String str2, @Nullable String str3, @Nullable Integer num2, @Nullable Integer num3, @Nullable Integer num4, @NotNull ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkParameterIsNotNull(unknownFields, "unknownFields");
        this.config_code = str;
        this.version = num;
        this.url = str2;
        this.pub_key = str3;
        this.interval_time = num2;
        this.type = num3;
        this.download_under_wifi = num4;
    }
}
