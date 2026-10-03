package com.heytap.connect.service.proto;

import androidx.core.app.FrameMetricsAggregator;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireField;
import java.io.IOException;
import java.util.ArrayList;
import okio.ByteString;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Deprecated;
import p010kotlin.DeprecationLevel;
import p010kotlin.Metadata;
import p010kotlin.collections.CollectionsKt___CollectionsKt;
import p010kotlin.jvm.JvmField;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.jvm.internal.Reflection;
import p010kotlin.reflect.KClass;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0011\u0018\u0000 )2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001)B}\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\r\u0012\b\b\u0002\u0010\u001a\u001a\u00020\u0019¢\u0006\u0004\b'\u0010(J\u000f\u0010\u0003\u001a\u00020\u0002H\u0017¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0096\u0002¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0083\u0001\u0010\u001b\u001a\u00020\u00002\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\r2\b\b\u0002\u0010\u001a\u001a\u00020\u0019¢\u0006\u0004\b\u001b\u0010\u001cR\u001e\u0010\u0012\u001a\u0004\u0018\u00010\r8\u0006@\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u001d\u001a\u0004\b\u001e\u0010\u000fR\u001e\u0010\u0015\u001a\u0004\u0018\u00010\r8\u0006@\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u001d\u001a\u0004\b\u001f\u0010\u000fR\u001e\u0010\u0011\u001a\u0004\u0018\u00010\r8\u0006@\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u001d\u001a\u0004\b \u0010\u000fR\u001e\u0010\u0016\u001a\u0004\u0018\u00010\r8\u0006@\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u001d\u001a\u0004\b!\u0010\u000fR\u001e\u0010\u0017\u001a\u0004\u0018\u00010\r8\u0006@\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u001d\u001a\u0004\b\"\u0010\u000fR\u001e\u0010\u0013\u001a\u0004\u0018\u00010\r8\u0006@\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u001d\u001a\u0004\b#\u0010\u000fR\u001e\u0010\u0014\u001a\u0004\u0018\u00010\r8\u0006@\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u001d\u001a\u0004\b$\u0010\u000fR\u001e\u0010\u0018\u001a\u0004\u0018\u00010\r8\u0006@\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u001d\u001a\u0004\b%\u0010\u000fR\u001e\u0010\u0010\u001a\u0004\u0018\u00010\r8\u0006@\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u001d\u001a\u0004\b&\u0010\u000f¨\u0006*"}, d2 = {"Lcom/heytap/connect/service/proto/UplinkData;", "Lcom/squareup/wire/Message;", "", "newBuilder", "()Ljava/lang/Void;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "serverName", "cmd", "clientId", "clientIp", "clientPort", "connectIp", "connectPort", "dataPayload", "messageId", "Lokio/ByteString;", "unknownFields", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lokio/ByteString;)Lcom/heytap/connect/service/proto/UplinkData;", "Ljava/lang/String;", "getClientId", "getConnectIp", "getCmd", "getConnectPort", "getDataPayload", "getClientIp", "getClientPort", "getMessageId", "getServerName", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lokio/ByteString;)V", "Companion", "connect_release"}, k = 1, mv = {1, 5, 1})
public final class UplinkData extends Message {

    @JvmField
    @NotNull
    public static final ProtoAdapter<UplinkData> ADAPTER;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 3)
    @Nullable
    private final String clientId;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 4)
    @Nullable
    private final String clientIp;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 5)
    @Nullable
    private final String clientPort;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 2)
    @Nullable
    private final String cmd;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 6)
    @Nullable
    private final String connectIp;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 7)
    @Nullable
    private final String connectPort;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 8)
    @Nullable
    private final String dataPayload;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 9)
    @Nullable
    private final String messageId;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 1)
    @Nullable
    private final String serverName;

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(UplinkData.class);
        ADAPTER = new ProtoAdapter<UplinkData>(fieldEncoding, orCreateKotlinClass) { // from class: com.heytap.connect.service.proto.UplinkData$Companion$ADAPTER$1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            @NotNull
            public UplinkData decode(@NotNull ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                long jBeginMessage = reader.beginMessage();
                String strDecode = null;
                String strDecode2 = null;
                String strDecode3 = null;
                String strDecode4 = null;
                String strDecode5 = null;
                String strDecode6 = null;
                String strDecode7 = null;
                String strDecode8 = null;
                String strDecode9 = null;
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag != -1) {
                        switch (iNextTag) {
                            case 1:
                                strDecode9 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 2:
                                strDecode8 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 3:
                                strDecode7 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 4:
                                strDecode6 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 5:
                                strDecode5 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 6:
                                strDecode4 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 7:
                                strDecode3 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 8:
                                strDecode2 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 9:
                                strDecode = ProtoAdapter.STRING.decode(reader);
                                break;
                            default:
                                reader.readUnknownField(iNextTag);
                                break;
                        }
                    } else {
                        return new UplinkData(strDecode9, strDecode8, strDecode7, strDecode6, strDecode5, strDecode4, strDecode3, strDecode2, strDecode, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(@NotNull ProtoWriter writer, @NotNull UplinkData value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
                protoAdapter.encodeWithTag(writer, 1, value.getServerName());
                protoAdapter.encodeWithTag(writer, 2, value.getCmd());
                protoAdapter.encodeWithTag(writer, 3, value.getClientId());
                protoAdapter.encodeWithTag(writer, 4, value.getClientIp());
                protoAdapter.encodeWithTag(writer, 5, value.getClientPort());
                protoAdapter.encodeWithTag(writer, 6, value.getConnectIp());
                protoAdapter.encodeWithTag(writer, 7, value.getConnectPort());
                protoAdapter.encodeWithTag(writer, 8, value.getDataPayload());
                protoAdapter.encodeWithTag(writer, 9, value.getMessageId());
                writer.writeBytes(value.getUnknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(@NotNull UplinkData value) {
                Intrinsics.checkNotNullParameter(value, "value");
                ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
                return protoAdapter.encodedSizeWithTag(1, value.getServerName()) + protoAdapter.encodedSizeWithTag(2, value.getCmd()) + protoAdapter.encodedSizeWithTag(3, value.getClientId()) + protoAdapter.encodedSizeWithTag(4, value.getClientIp()) + protoAdapter.encodedSizeWithTag(5, value.getClientPort()) + protoAdapter.encodedSizeWithTag(6, value.getConnectIp()) + protoAdapter.encodedSizeWithTag(7, value.getConnectPort()) + protoAdapter.encodedSizeWithTag(8, value.getDataPayload()) + protoAdapter.encodedSizeWithTag(9, value.getMessageId()) + value.getUnknownFields().size();
            }

            @Override // com.squareup.wire.ProtoAdapter
            @NotNull
            public UplinkData redact(@NotNull UplinkData value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return value.copy((FrameMetricsAggregator.EVERY_DURATION & 1) != 0 ? value.serverName : null, (FrameMetricsAggregator.EVERY_DURATION & 2) != 0 ? value.cmd : null, (FrameMetricsAggregator.EVERY_DURATION & 4) != 0 ? value.clientId : null, (FrameMetricsAggregator.EVERY_DURATION & 8) != 0 ? value.clientIp : null, (FrameMetricsAggregator.EVERY_DURATION & 16) != 0 ? value.clientPort : null, (FrameMetricsAggregator.EVERY_DURATION & 32) != 0 ? value.connectIp : null, (FrameMetricsAggregator.EVERY_DURATION & 64) != 0 ? value.connectPort : null, (FrameMetricsAggregator.EVERY_DURATION & 128) != 0 ? value.dataPayload : null, (FrameMetricsAggregator.EVERY_DURATION & 256) != 0 ? value.messageId : null, (FrameMetricsAggregator.EVERY_DURATION & 512) != 0 ? value.getUnknownFields() : ByteString.EMPTY);
            }
        };
    }

    public UplinkData() {
        this(null, null, null, null, null, null, null, null, null, null, 1023, null);
    }

    @NotNull
    public final UplinkData copy(@Nullable String serverName, @Nullable String cmd, @Nullable String clientId, @Nullable String clientIp, @Nullable String clientPort, @Nullable String connectIp, @Nullable String connectPort, @Nullable String dataPayload, @Nullable String messageId, @NotNull ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new UplinkData(serverName, cmd, clientId, clientIp, clientPort, connectIp, connectPort, dataPayload, messageId, unknownFields);
    }

    public boolean equals(@Nullable Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof UplinkData)) {
            return false;
        }
        UplinkData uplinkData = (UplinkData) other;
        return Intrinsics.areEqual(getUnknownFields(), uplinkData.getUnknownFields()) && Intrinsics.areEqual(this.serverName, uplinkData.serverName) && Intrinsics.areEqual(this.cmd, uplinkData.cmd) && Intrinsics.areEqual(this.clientId, uplinkData.clientId) && Intrinsics.areEqual(this.clientIp, uplinkData.clientIp) && Intrinsics.areEqual(this.clientPort, uplinkData.clientPort) && Intrinsics.areEqual(this.connectIp, uplinkData.connectIp) && Intrinsics.areEqual(this.connectPort, uplinkData.connectPort) && Intrinsics.areEqual(this.dataPayload, uplinkData.dataPayload) && Intrinsics.areEqual(this.messageId, uplinkData.messageId);
    }

    @Nullable
    public final String getClientId() {
        return this.clientId;
    }

    @Nullable
    public final String getClientIp() {
        return this.clientIp;
    }

    @Nullable
    public final String getClientPort() {
        return this.clientPort;
    }

    @Nullable
    public final String getCmd() {
        return this.cmd;
    }

    @Nullable
    public final String getConnectIp() {
        return this.connectIp;
    }

    @Nullable
    public final String getConnectPort() {
        return this.connectPort;
    }

    @Nullable
    public final String getDataPayload() {
        return this.dataPayload;
    }

    @Nullable
    public final String getMessageId() {
        return this.messageId;
    }

    @Nullable
    public final String getServerName() {
        return this.serverName;
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        String str = this.serverName;
        int iHashCode = (str != null ? str.hashCode() : 0) * 37;
        String str2 = this.cmd;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 37;
        String str3 = this.clientId;
        int iHashCode3 = (iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 37;
        String str4 = this.clientIp;
        int iHashCode4 = (iHashCode3 + (str4 != null ? str4.hashCode() : 0)) * 37;
        String str5 = this.clientPort;
        int iHashCode5 = (iHashCode4 + (str5 != null ? str5.hashCode() : 0)) * 37;
        String str6 = this.connectIp;
        int iHashCode6 = (iHashCode5 + (str6 != null ? str6.hashCode() : 0)) * 37;
        String str7 = this.connectPort;
        int iHashCode7 = (iHashCode6 + (str7 != null ? str7.hashCode() : 0)) * 37;
        String str8 = this.dataPayload;
        int iHashCode8 = (iHashCode7 + (str8 != null ? str8.hashCode() : 0)) * 37;
        String str9 = this.messageId;
        int iHashCode9 = iHashCode8 + (str9 != null ? str9.hashCode() : 0);
        this.hashCode = iHashCode9;
        return iHashCode9;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m4609newBuilder();
    }

    @Override // com.squareup.wire.Message
    @NotNull
    public String toString() {
        ArrayList arrayList = new ArrayList();
        String str = this.serverName;
        if (str != null) {
            arrayList.add(Intrinsics.stringPlus("serverName=", str));
        }
        String str2 = this.cmd;
        if (str2 != null) {
            arrayList.add(Intrinsics.stringPlus("cmd=", str2));
        }
        String str3 = this.clientId;
        if (str3 != null) {
            arrayList.add(Intrinsics.stringPlus("clientId=", str3));
        }
        String str4 = this.clientIp;
        if (str4 != null) {
            arrayList.add(Intrinsics.stringPlus("clientIp=", str4));
        }
        String str5 = this.clientPort;
        if (str5 != null) {
            arrayList.add(Intrinsics.stringPlus("clientPort=", str5));
        }
        String str6 = this.connectIp;
        if (str6 != null) {
            arrayList.add(Intrinsics.stringPlus("connectIp=", str6));
        }
        String str7 = this.connectPort;
        if (str7 != null) {
            arrayList.add(Intrinsics.stringPlus("connectPort=", str7));
        }
        String str8 = this.dataPayload;
        if (str8 != null) {
            arrayList.add(Intrinsics.stringPlus("dataPayload=", str8));
        }
        String str9 = this.messageId;
        if (str9 != null) {
            arrayList.add(Intrinsics.stringPlus("messageId=", str9));
        }
        return CollectionsKt___CollectionsKt.joinToString$default(arrayList, ", ", "UplinkData{", "}", 0, null, null, 56, null);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UplinkData(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable String str6, @Nullable String str7, @Nullable String str8, @Nullable String str9, @NotNull ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.serverName = str;
        this.cmd = str2;
        this.clientId = str3;
        this.clientIp = str4;
        this.clientPort = str5;
        this.connectIp = str6;
        this.connectPort = str7;
        this.dataPayload = str8;
        this.messageId = str9;
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Shouldn't be used in Kotlin")
    /* JADX INFO: renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m4609newBuilder() {
        throw new AssertionError();
    }

    public /* synthetic */ UplinkData(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : str5, (i & 32) != 0 ? null : str6, (i & 64) != 0 ? null : str7, (i & 128) != 0 ? null : str8, (i & 256) != 0 ? null : str9, (i & 512) != 0 ? ByteString.EMPTY : byteString);
    }
}
