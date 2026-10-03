package com.heytap.store.homemodule.data.livehomepb;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireField;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import okio.ByteString;

/* JADX INFO: loaded from: classes5.dex */
public final class LiveInfoVT extends Message<LiveInfoVT, Builder> {
    public static final String DEFAULT_LINK = "";
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", tag = 3)
    public final Integer isAdvance;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", tag = 5)
    public final Integer jumpType;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 6)
    public final String link;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", tag = 1)
    public final Integer liveSource;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", tag = 4)
    public final Integer liveStyle;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", tag = 2)
    public final Long roomId;
    public static final ProtoAdapter<LiveInfoVT> ADAPTER = new ProtoAdapter_LiveInfoVT();
    public static final Integer DEFAULT_LIVESOURCE = 0;
    public static final Long DEFAULT_ROOMID = 0L;
    public static final Integer DEFAULT_ISADVANCE = 0;
    public static final Integer DEFAULT_LIVESTYLE = 0;
    public static final Integer DEFAULT_JUMPTYPE = 0;

    public static final class Builder extends Message.Builder<LiveInfoVT, Builder> {
        public Integer isAdvance;
        public Integer jumpType;
        public String link;
        public Integer liveSource;
        public Integer liveStyle;
        public Long roomId;

        public Builder isAdvance(Integer num) {
            this.isAdvance = num;
            return this;
        }

        public Builder jumpType(Integer num) {
            this.jumpType = num;
            return this;
        }

        public Builder link(String str) {
            this.link = str;
            return this;
        }

        public Builder liveSource(Integer num) {
            this.liveSource = num;
            return this;
        }

        public Builder liveStyle(Integer num) {
            this.liveStyle = num;
            return this;
        }

        public Builder roomId(Long l2) {
            this.roomId = l2;
            return this;
        }

        @Override // com.squareup.wire.Message.Builder
        public LiveInfoVT build() {
            return new LiveInfoVT(this.liveSource, this.roomId, this.isAdvance, this.liveStyle, this.jumpType, this.link, super.buildUnknownFields());
        }
    }

    public static final class ProtoAdapter_LiveInfoVT extends ProtoAdapter<LiveInfoVT> {
        public ProtoAdapter_LiveInfoVT() {
            super(FieldEncoding.LENGTH_DELIMITED, (Class<?>) LiveInfoVT.class);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.squareup.wire.ProtoAdapter
        public LiveInfoVT decode(ProtoReader protoReader) throws IOException {
            Builder builder = new Builder();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag == -1) {
                    protoReader.endMessage(jBeginMessage);
                    return builder.build();
                }
                switch (iNextTag) {
                    case 1:
                        builder.liveSource(ProtoAdapter.INT32.decode(protoReader));
                        break;
                    case 2:
                        builder.roomId(ProtoAdapter.INT64.decode(protoReader));
                        break;
                    case 3:
                        builder.isAdvance(ProtoAdapter.INT32.decode(protoReader));
                        break;
                    case 4:
                        builder.liveStyle(ProtoAdapter.INT32.decode(protoReader));
                        break;
                    case 5:
                        builder.jumpType(ProtoAdapter.INT32.decode(protoReader));
                        break;
                    case 6:
                        builder.link(ProtoAdapter.STRING.decode(protoReader));
                        break;
                    default:
                        FieldEncoding nextFieldEncoding = protoReader.getNextFieldEncoding();
                        builder.addUnknownField(iNextTag, nextFieldEncoding, nextFieldEncoding.rawProtoAdapter().decode(protoReader));
                        break;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public void encode(ProtoWriter protoWriter, LiveInfoVT liveInfoVT) throws IOException {
            Integer num = liveInfoVT.liveSource;
            if (num != null) {
                ProtoAdapter.INT32.encodeWithTag(protoWriter, 1, num);
            }
            Long l2 = liveInfoVT.roomId;
            if (l2 != null) {
                ProtoAdapter.INT64.encodeWithTag(protoWriter, 2, l2);
            }
            Integer num2 = liveInfoVT.isAdvance;
            if (num2 != null) {
                ProtoAdapter.INT32.encodeWithTag(protoWriter, 3, num2);
            }
            Integer num3 = liveInfoVT.liveStyle;
            if (num3 != null) {
                ProtoAdapter.INT32.encodeWithTag(protoWriter, 4, num3);
            }
            Integer num4 = liveInfoVT.jumpType;
            if (num4 != null) {
                ProtoAdapter.INT32.encodeWithTag(protoWriter, 5, num4);
            }
            String str = liveInfoVT.link;
            if (str != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 6, str);
            }
            protoWriter.writeBytes(liveInfoVT.getUnknownFields());
        }

        @Override // com.squareup.wire.ProtoAdapter
        public int encodedSize(LiveInfoVT liveInfoVT) {
            Integer num = liveInfoVT.liveSource;
            int iEncodedSizeWithTag = num != null ? ProtoAdapter.INT32.encodedSizeWithTag(1, num) : 0;
            Long l2 = liveInfoVT.roomId;
            int iEncodedSizeWithTag2 = iEncodedSizeWithTag + (l2 != null ? ProtoAdapter.INT64.encodedSizeWithTag(2, l2) : 0);
            Integer num2 = liveInfoVT.isAdvance;
            int iEncodedSizeWithTag3 = iEncodedSizeWithTag2 + (num2 != null ? ProtoAdapter.INT32.encodedSizeWithTag(3, num2) : 0);
            Integer num3 = liveInfoVT.liveStyle;
            int iEncodedSizeWithTag4 = iEncodedSizeWithTag3 + (num3 != null ? ProtoAdapter.INT32.encodedSizeWithTag(4, num3) : 0);
            Integer num4 = liveInfoVT.jumpType;
            int iEncodedSizeWithTag5 = iEncodedSizeWithTag4 + (num4 != null ? ProtoAdapter.INT32.encodedSizeWithTag(5, num4) : 0);
            String str = liveInfoVT.link;
            return iEncodedSizeWithTag5 + (str != null ? ProtoAdapter.STRING.encodedSizeWithTag(6, str) : 0) + liveInfoVT.getUnknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public LiveInfoVT redact(LiveInfoVT liveInfoVT) {
            Builder builderNewBuilder = liveInfoVT.newBuilder();
            builderNewBuilder.clearUnknownFields();
            return builderNewBuilder.build();
        }
    }

    public LiveInfoVT(Integer num, Long l2, Integer num2, Integer num3, Integer num4, String str) {
        this(num, l2, num2, num3, num4, str, ByteString.EMPTY);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof LiveInfoVT)) {
            return false;
        }
        LiveInfoVT liveInfoVT = (LiveInfoVT) obj;
        return getUnknownFields().equals(liveInfoVT.getUnknownFields()) && Internal.equals(this.liveSource, liveInfoVT.liveSource) && Internal.equals(this.roomId, liveInfoVT.roomId) && Internal.equals(this.isAdvance, liveInfoVT.isAdvance) && Internal.equals(this.liveStyle, liveInfoVT.liveStyle) && Internal.equals(this.jumpType, liveInfoVT.jumpType) && Internal.equals(this.link, liveInfoVT.link);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = getUnknownFields().hashCode() * 37;
        Integer num = this.liveSource;
        int iHashCode2 = (iHashCode + (num != null ? num.hashCode() : 0)) * 37;
        Long l2 = this.roomId;
        int iHashCode3 = (iHashCode2 + (l2 != null ? l2.hashCode() : 0)) * 37;
        Integer num2 = this.isAdvance;
        int iHashCode4 = (iHashCode3 + (num2 != null ? num2.hashCode() : 0)) * 37;
        Integer num3 = this.liveStyle;
        int iHashCode5 = (iHashCode4 + (num3 != null ? num3.hashCode() : 0)) * 37;
        Integer num4 = this.jumpType;
        int iHashCode6 = (iHashCode5 + (num4 != null ? num4.hashCode() : 0)) * 37;
        String str = this.link;
        int iHashCode7 = iHashCode6 + (str != null ? str.hashCode() : 0);
        this.hashCode = iHashCode7;
        return iHashCode7;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.liveSource != null) {
            sb.append(", liveSource=");
            sb.append(this.liveSource);
        }
        if (this.roomId != null) {
            sb.append(", roomId=");
            sb.append(this.roomId);
        }
        if (this.isAdvance != null) {
            sb.append(", isAdvance=");
            sb.append(this.isAdvance);
        }
        if (this.liveStyle != null) {
            sb.append(", liveStyle=");
            sb.append(this.liveStyle);
        }
        if (this.jumpType != null) {
            sb.append(", jumpType=");
            sb.append(this.jumpType);
        }
        if (this.link != null) {
            sb.append(", link=");
            sb.append(this.link);
        }
        StringBuilder sbReplace = sb.replace(0, 2, "LiveInfoVT{");
        sbReplace.append('}');
        return sbReplace.toString();
    }

    public LiveInfoVT(Integer num, Long l2, Integer num2, Integer num3, Integer num4, String str, ByteString byteString) {
        super(ADAPTER, byteString);
        this.liveSource = num;
        this.roomId = l2;
        this.isAdvance = num2;
        this.liveStyle = num3;
        this.jumpType = num4;
        this.link = str;
    }

    @Override // com.squareup.wire.Message
    public Builder newBuilder() {
        Builder builder = new Builder();
        builder.liveSource = this.liveSource;
        builder.roomId = this.roomId;
        builder.isAdvance = this.isAdvance;
        builder.liveStyle = this.liveStyle;
        builder.jumpType = this.jumpType;
        builder.link = this.link;
        builder.addUnknownFields(getUnknownFields());
        return builder;
    }
}
