package com.oplus.nearx.cloudconfig.bean;

import com.oplus.aiunit.vision.e1f;
import com.oplus.nearx.protobuff.wire.FieldEncoding;
import com.oplus.nearx.protobuff.wire.Message;
import com.oplus.nearx.protobuff.wire.ProtoAdapter;
import com.oplus.nearx.protobuff.wire.b;
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

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0013\u0018\u0000 $2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001%Be\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\b\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\"\u0010#J\b\u0010\u0003\u001a\u00020\u0002H\u0017J\u0013\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0096\u0002J\b\u0010\t\u001a\u00020\bH\u0016J\b\u0010\u000b\u001a\u00020\nH\u0016Jk\u0010\u0015\u001a\u00020\u00002\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0015\u0010\u0016R\u001c\u0010\f\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001c\u0010\r\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u001c\u0010\u000e\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u0017\u001a\u0004\b\u001d\u0010\u0019R\u001c\u0010\u000f\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0017\u001a\u0004\b\u001e\u0010\u0019R\u001c\u0010\u0010\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u001a\u001a\u0004\b\u001f\u0010\u001cR\u001c\u0010\u0011\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u001a\u001a\u0004\b \u0010\u001cR\u001c\u0010\u0012\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u001a\u001a\u0004\b!\u0010\u001c¨\u0006&"}, d2 = {"Lcom/oplus/nearx/cloudconfig/bean/UpdateConfigItem;", "Lcom/oplus/nearx/protobuff/wire/Message;", "", "newBuilder", "", "other", "", "equals", "", "hashCode", "", "toString", "config_code", "version", "url", "pub_key", "interval_time", "type", "download_under_wifi", "Lokio/ByteString;", "unknownFields", "copy", "(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Lokio/ByteString;)Lcom/oplus/nearx/cloudconfig/bean/UpdateConfigItem;", "Ljava/lang/String;", "getConfig_code", "()Ljava/lang/String;", "Ljava/lang/Integer;", "getVersion", "()Ljava/lang/Integer;", "getUrl", "getPub_key", "getInterval_time", "getType", "getDownload_under_wifi", "<init>", "(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Lokio/ByteString;)V", "Companion", "a", "com.oplus.nearx.cloudconfig-proto-wire"}, k = 1, mv = {1, 4, 0})
public final class UpdateConfigItem extends Message {

    @JvmField
    @NotNull
    public static final ProtoAdapter<UpdateConfigItem> ADAPTER;

    @Nullable
    private final String config_code;

    @Nullable
    private final Integer download_under_wifi;

    @Nullable
    private final Integer interval_time;

    @Nullable
    private final String pub_key;

    @Nullable
    private final Integer type;

    @Nullable
    private final String url;

    @Nullable
    private final Integer version;

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final Class<UpdateConfigItem> cls = UpdateConfigItem.class;
        ADAPTER = new ProtoAdapter<UpdateConfigItem>(fieldEncoding, cls) { // from class: com.oplus.nearx.cloudconfig.bean.UpdateConfigItem$Companion$ADAPTER$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.oplus.nearx.protobuff.wire.ProtoAdapter
            @NotNull
            /* JADX INFO: renamed from: u, reason: merged with bridge method [inline-methods] */
            public UpdateConfigItem e(@NotNull final e1f reader) {
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
                return new UpdateConfigItem((String) objectRef.element, (Integer) objectRef2.element, (String) objectRef3.element, (String) objectRef4.element, (Integer) objectRef5.element, (Integer) objectRef6.element, (Integer) objectRef7.element, WireUtilKt.forEachTag(reader, new Function1<Integer, Unit>() { // from class: com.oplus.nearx.cloudconfig.bean.UpdateConfigItem$Companion$ADAPTER$1$decode$unknownFields$1
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
                                objectRef.element = ProtoAdapter.STRING.e(reader);
                                break;
                            case 2:
                                objectRef2.element = ProtoAdapter.INT32.e(reader);
                                break;
                            case 3:
                                objectRef3.element = ProtoAdapter.STRING.e(reader);
                                break;
                            case 4:
                                objectRef4.element = ProtoAdapter.STRING.e(reader);
                                break;
                            case 5:
                                objectRef5.element = ProtoAdapter.INT32.e(reader);
                                break;
                            case 6:
                                objectRef6.element = ProtoAdapter.INT32.e(reader);
                                break;
                            case 7:
                                objectRef7.element = ProtoAdapter.INT32.e(reader);
                                break;
                            default:
                                WireUtilKt.readUnknownField(reader, i);
                                break;
                        }
                    }
                }));
            }

            @Override // com.oplus.nearx.protobuff.wire.ProtoAdapter
            /* JADX INFO: renamed from: v, reason: merged with bridge method [inline-methods] */
            public void h(@NotNull b writer, @NotNull UpdateConfigItem value) throws IOException {
                Intrinsics.checkParameterIsNotNull(writer, "writer");
                Intrinsics.checkParameterIsNotNull(value, "value");
                ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
                protoAdapter.l(writer, 1, value.getConfig_code());
                ProtoAdapter<Integer> protoAdapter2 = ProtoAdapter.INT32;
                protoAdapter2.l(writer, 2, value.getVersion());
                protoAdapter.l(writer, 3, value.getUrl());
                protoAdapter.l(writer, 4, value.getPub_key());
                protoAdapter2.l(writer, 5, value.getInterval_time());
                protoAdapter2.l(writer, 6, value.getType());
                protoAdapter2.l(writer, 7, value.getDownload_under_wifi());
                writer.k(value.unknownFields());
            }

            @Override // com.oplus.nearx.protobuff.wire.ProtoAdapter
            /* JADX INFO: renamed from: w, reason: merged with bridge method [inline-methods] */
            public int m(@NotNull UpdateConfigItem value) {
                Intrinsics.checkParameterIsNotNull(value, "value");
                ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
                int iN = protoAdapter.n(1, value.getConfig_code());
                ProtoAdapter<Integer> protoAdapter2 = ProtoAdapter.INT32;
                int iN2 = iN + protoAdapter2.n(2, value.getVersion()) + protoAdapter.n(3, value.getUrl()) + protoAdapter.n(4, value.getPub_key()) + protoAdapter2.n(5, value.getInterval_time()) + protoAdapter2.n(6, value.getType()) + protoAdapter2.n(7, value.getDownload_under_wifi());
                ByteString byteStringUnknownFields = value.unknownFields();
                Intrinsics.checkExpressionValueIsNotNull(byteStringUnknownFields, "value.unknownFields()");
                return iN2 + Okio_api_250Kt.sizes(byteStringUnknownFields);
            }

            @Override // com.oplus.nearx.protobuff.wire.ProtoAdapter
            @NotNull
            /* JADX INFO: renamed from: x, reason: merged with bridge method [inline-methods] */
            public UpdateConfigItem r(@NotNull UpdateConfigItem value) {
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

    @Override // com.oplus.nearx.protobuff.wire.Message
    public /* bridge */ /* synthetic */ Message.a newBuilder() {
        return (Message.a) m5188newBuilder();
    }

    @Override // com.oplus.nearx.protobuff.wire.Message
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
    public /* synthetic */ Void m5188newBuilder() {
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
