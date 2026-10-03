package com.heytap.nearx.tangramconfig.bean;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireField;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import okio.ByteString;

/* JADX INFO: loaded from: classes17.dex */
public final class UpdateConfigItem extends Message<UpdateConfigItem, Builder> {
    public static final String DEFAULT_CONFIG_CODE = "";
    public static final String DEFAULT_PUB_KEY = "";
    public static final String DEFAULT_URL = "";
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 1)
    public final String config_code;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", tag = 8)
    public final Integer config_version;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BYTES", tag = 9)
    public final ByteString content;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", tag = 7)
    public final Integer download_under_wifi;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", tag = 5)
    public final Integer interval_time;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 4)
    public final String pub_key;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", tag = 6)
    public final Integer type;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 3)
    public final String url;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", tag = 2)
    public final Integer version;
    public static final ProtoAdapter<UpdateConfigItem> ADAPTER = new ProtoAdapter_UpdateConfigItem();
    public static final Integer DEFAULT_VERSION = 0;
    public static final Integer DEFAULT_INTERVAL_TIME = 0;
    public static final Integer DEFAULT_TYPE = 0;
    public static final Integer DEFAULT_DOWNLOAD_UNDER_WIFI = 0;
    public static final Integer DEFAULT_CONFIG_VERSION = 0;
    public static final ByteString DEFAULT_CONTENT = ByteString.EMPTY;

    public static final class Builder extends Message.Builder<UpdateConfigItem, Builder> {
        public String config_code;
        public Integer config_version;
        public ByteString content;
        public Integer download_under_wifi;
        public Integer interval_time;
        public String pub_key;
        public Integer type;
        public String url;
        public Integer version;

        public Builder config_code(String str) {
            this.config_code = str;
            return this;
        }

        public Builder config_version(Integer num) {
            this.config_version = num;
            return this;
        }

        public Builder content(ByteString byteString) {
            this.content = byteString;
            return this;
        }

        public Builder download_under_wifi(Integer num) {
            this.download_under_wifi = num;
            return this;
        }

        public Builder interval_time(Integer num) {
            this.interval_time = num;
            return this;
        }

        public Builder pub_key(String str) {
            this.pub_key = str;
            return this;
        }

        public Builder type(Integer num) {
            this.type = num;
            return this;
        }

        public Builder url(String str) {
            this.url = str;
            return this;
        }

        public Builder version(Integer num) {
            this.version = num;
            return this;
        }

        @Override // com.squareup.wire.Message.Builder
        public UpdateConfigItem build() {
            return new UpdateConfigItem(this.config_code, this.version, this.url, this.pub_key, this.interval_time, this.type, this.download_under_wifi, this.config_version, this.content, super.buildUnknownFields());
        }
    }

    public static final class ProtoAdapter_UpdateConfigItem extends ProtoAdapter<UpdateConfigItem> {
        public ProtoAdapter_UpdateConfigItem() {
            super(FieldEncoding.LENGTH_DELIMITED, (Class<?>) UpdateConfigItem.class);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.squareup.wire.ProtoAdapter
        public UpdateConfigItem decode(ProtoReader protoReader) throws IOException {
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
                        builder.config_code(ProtoAdapter.STRING.decode(protoReader));
                        break;
                    case 2:
                        builder.version(ProtoAdapter.INT32.decode(protoReader));
                        break;
                    case 3:
                        builder.url(ProtoAdapter.STRING.decode(protoReader));
                        break;
                    case 4:
                        builder.pub_key(ProtoAdapter.STRING.decode(protoReader));
                        break;
                    case 5:
                        builder.interval_time(ProtoAdapter.INT32.decode(protoReader));
                        break;
                    case 6:
                        builder.type(ProtoAdapter.INT32.decode(protoReader));
                        break;
                    case 7:
                        builder.download_under_wifi(ProtoAdapter.INT32.decode(protoReader));
                        break;
                    case 8:
                        builder.config_version(ProtoAdapter.INT32.decode(protoReader));
                        break;
                    case 9:
                        builder.content(ProtoAdapter.BYTES.decode(protoReader));
                        break;
                    default:
                        FieldEncoding nextFieldEncoding = protoReader.getNextFieldEncoding();
                        builder.addUnknownField(iNextTag, nextFieldEncoding, nextFieldEncoding.rawProtoAdapter().decode(protoReader));
                        break;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public void encode(ProtoWriter protoWriter, UpdateConfigItem updateConfigItem) throws IOException {
            String str = updateConfigItem.config_code;
            if (str != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, str);
            }
            Integer num = updateConfigItem.version;
            if (num != null) {
                ProtoAdapter.INT32.encodeWithTag(protoWriter, 2, num);
            }
            String str2 = updateConfigItem.url;
            if (str2 != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 3, str2);
            }
            String str3 = updateConfigItem.pub_key;
            if (str3 != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 4, str3);
            }
            Integer num2 = updateConfigItem.interval_time;
            if (num2 != null) {
                ProtoAdapter.INT32.encodeWithTag(protoWriter, 5, num2);
            }
            Integer num3 = updateConfigItem.type;
            if (num3 != null) {
                ProtoAdapter.INT32.encodeWithTag(protoWriter, 6, num3);
            }
            Integer num4 = updateConfigItem.download_under_wifi;
            if (num4 != null) {
                ProtoAdapter.INT32.encodeWithTag(protoWriter, 7, num4);
            }
            Integer num5 = updateConfigItem.config_version;
            if (num5 != null) {
                ProtoAdapter.INT32.encodeWithTag(protoWriter, 8, num5);
            }
            ByteString byteString = updateConfigItem.content;
            if (byteString != null) {
                ProtoAdapter.BYTES.encodeWithTag(protoWriter, 9, byteString);
            }
            protoWriter.writeBytes(updateConfigItem.getUnknownFields());
        }

        @Override // com.squareup.wire.ProtoAdapter
        public int encodedSize(UpdateConfigItem updateConfigItem) {
            String str = updateConfigItem.config_code;
            int iEncodedSizeWithTag = str != null ? ProtoAdapter.STRING.encodedSizeWithTag(1, str) : 0;
            Integer num = updateConfigItem.version;
            int iEncodedSizeWithTag2 = iEncodedSizeWithTag + (num != null ? ProtoAdapter.INT32.encodedSizeWithTag(2, num) : 0);
            String str2 = updateConfigItem.url;
            int iEncodedSizeWithTag3 = iEncodedSizeWithTag2 + (str2 != null ? ProtoAdapter.STRING.encodedSizeWithTag(3, str2) : 0);
            String str3 = updateConfigItem.pub_key;
            int iEncodedSizeWithTag4 = iEncodedSizeWithTag3 + (str3 != null ? ProtoAdapter.STRING.encodedSizeWithTag(4, str3) : 0);
            Integer num2 = updateConfigItem.interval_time;
            int iEncodedSizeWithTag5 = iEncodedSizeWithTag4 + (num2 != null ? ProtoAdapter.INT32.encodedSizeWithTag(5, num2) : 0);
            Integer num3 = updateConfigItem.type;
            int iEncodedSizeWithTag6 = iEncodedSizeWithTag5 + (num3 != null ? ProtoAdapter.INT32.encodedSizeWithTag(6, num3) : 0);
            Integer num4 = updateConfigItem.download_under_wifi;
            int iEncodedSizeWithTag7 = iEncodedSizeWithTag6 + (num4 != null ? ProtoAdapter.INT32.encodedSizeWithTag(7, num4) : 0);
            Integer num5 = updateConfigItem.config_version;
            int iEncodedSizeWithTag8 = iEncodedSizeWithTag7 + (num5 != null ? ProtoAdapter.INT32.encodedSizeWithTag(8, num5) : 0);
            ByteString byteString = updateConfigItem.content;
            return iEncodedSizeWithTag8 + (byteString != null ? ProtoAdapter.BYTES.encodedSizeWithTag(9, byteString) : 0) + updateConfigItem.getUnknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public UpdateConfigItem redact(UpdateConfigItem updateConfigItem) {
            Builder builderNewBuilder = updateConfigItem.newBuilder();
            builderNewBuilder.clearUnknownFields();
            return builderNewBuilder.build();
        }
    }

    public UpdateConfigItem(String str, Integer num, String str2, String str3, Integer num2, Integer num3, Integer num4, Integer num5, ByteString byteString) {
        this(str, num, str2, str3, num2, num3, num4, num5, byteString, ByteString.EMPTY);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof UpdateConfigItem)) {
            return false;
        }
        UpdateConfigItem updateConfigItem = (UpdateConfigItem) obj;
        return getUnknownFields().equals(updateConfigItem.getUnknownFields()) && Internal.equals(this.config_code, updateConfigItem.config_code) && Internal.equals(this.version, updateConfigItem.version) && Internal.equals(this.url, updateConfigItem.url) && Internal.equals(this.pub_key, updateConfigItem.pub_key) && Internal.equals(this.interval_time, updateConfigItem.interval_time) && Internal.equals(this.type, updateConfigItem.type) && Internal.equals(this.download_under_wifi, updateConfigItem.download_under_wifi) && Internal.equals(this.config_version, updateConfigItem.config_version) && Internal.equals(this.content, updateConfigItem.content);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = getUnknownFields().hashCode() * 37;
        String str = this.config_code;
        int iHashCode2 = (iHashCode + (str != null ? str.hashCode() : 0)) * 37;
        Integer num = this.version;
        int iHashCode3 = (iHashCode2 + (num != null ? num.hashCode() : 0)) * 37;
        String str2 = this.url;
        int iHashCode4 = (iHashCode3 + (str2 != null ? str2.hashCode() : 0)) * 37;
        String str3 = this.pub_key;
        int iHashCode5 = (iHashCode4 + (str3 != null ? str3.hashCode() : 0)) * 37;
        Integer num2 = this.interval_time;
        int iHashCode6 = (iHashCode5 + (num2 != null ? num2.hashCode() : 0)) * 37;
        Integer num3 = this.type;
        int iHashCode7 = (iHashCode6 + (num3 != null ? num3.hashCode() : 0)) * 37;
        Integer num4 = this.download_under_wifi;
        int iHashCode8 = (iHashCode7 + (num4 != null ? num4.hashCode() : 0)) * 37;
        Integer num5 = this.config_version;
        int iHashCode9 = (iHashCode8 + (num5 != null ? num5.hashCode() : 0)) * 37;
        ByteString byteString = this.content;
        int iHashCode10 = iHashCode9 + (byteString != null ? byteString.hashCode() : 0);
        this.hashCode = iHashCode10;
        return iHashCode10;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.config_code != null) {
            sb.append(", config_code=");
            sb.append(this.config_code);
        }
        if (this.version != null) {
            sb.append(", version=");
            sb.append(this.version);
        }
        if (this.url != null) {
            sb.append(", url=");
            sb.append(this.url);
        }
        if (this.pub_key != null) {
            sb.append(", pub_key=");
            sb.append(this.pub_key);
        }
        if (this.interval_time != null) {
            sb.append(", interval_time=");
            sb.append(this.interval_time);
        }
        if (this.type != null) {
            sb.append(", type=");
            sb.append(this.type);
        }
        if (this.download_under_wifi != null) {
            sb.append(", download_under_wifi=");
            sb.append(this.download_under_wifi);
        }
        if (this.config_version != null) {
            sb.append(", config_version=");
            sb.append(this.config_version);
        }
        if (this.content != null) {
            sb.append(", content=");
            sb.append(this.content);
        }
        StringBuilder sbReplace = sb.replace(0, 2, "UpdateConfigItem{");
        sbReplace.append('}');
        return sbReplace.toString();
    }

    public UpdateConfigItem(String str, Integer num, String str2, String str3, Integer num2, Integer num3, Integer num4, Integer num5, ByteString byteString, ByteString byteString2) {
        super(ADAPTER, byteString2);
        this.config_code = str;
        this.version = num;
        this.url = str2;
        this.pub_key = str3;
        this.interval_time = num2;
        this.type = num3;
        this.download_under_wifi = num4;
        this.config_version = num5;
        this.content = byteString;
    }

    @Override // com.squareup.wire.Message
    public Builder newBuilder() {
        Builder builder = new Builder();
        builder.config_code = this.config_code;
        builder.version = this.version;
        builder.url = this.url;
        builder.pub_key = this.pub_key;
        builder.interval_time = this.interval_time;
        builder.type = this.type;
        builder.download_under_wifi = this.download_under_wifi;
        builder.config_version = this.config_version;
        builder.content = this.content;
        builder.addUnknownFields(getUnknownFields());
        return builder;
    }
}
