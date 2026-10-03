package com.heytap.omas.proto;

import android.text.TextUtils;
import com.heytap.omas.a.e.h;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes19.dex */
public class Omkms3 {

    public static class CMSEncryptedData {
        private final String aad;
        private final String alg;
        private final String encrypted_data;
        private final String iv;
        private final String padding;
        private final String tag;

        public static class Builder {
            private String aad;
            private String alg;
            private String encrypted_data;
            private String iv;
            private String padding;
            private String tag;

            private Builder() {
            }

            public CMSEncryptedData build() {
                return new CMSEncryptedData(this);
            }

            public Builder setAad(String str) {
                this.aad = str;
                return this;
            }

            public Builder setAlg(String str) {
                this.alg = str;
                return this;
            }

            public Builder setEncryptedData(String str) {
                this.encrypted_data = str;
                return this;
            }

            public Builder setIv(String str) {
                this.iv = str;
                return this;
            }

            public Builder setPadding(String str) {
                this.padding = str;
                return this;
            }

            public Builder setTag(String str) {
                this.tag = str;
                return this;
            }
        }

        private CMSEncryptedData(Builder builder) {
            this.alg = builder.alg;
            this.padding = builder.padding;
            this.iv = builder.iv;
            this.aad = builder.aad;
            this.tag = builder.tag;
            this.encrypted_data = builder.encrypted_data;
        }

        public static Builder newBuilder() {
            return new Builder();
        }

        public String getAad() {
            return this.aad;
        }

        public String getAlg() {
            return this.alg;
        }

        public String getEncryptedData() {
            return this.encrypted_data;
        }

        public String getIv() {
            return this.iv;
        }

        public String getPadding() {
            return this.padding;
        }

        public String getTag() {
            return this.tag;
        }

        public String toString() {
            return "CMSEncryptedData{alg='" + this.alg + "', padding='" + this.padding + "', iv='" + this.iv + "', aad='" + this.aad + "', tag='" + this.tag + "', encrypted_data='" + this.encrypted_data + "'}";
        }
    }

    public static class CMSSignedData {
        private final String hash_id;
        private final String sign_alg;
        private final String signed_content;

        public static class Builder {
            private String hash_id;
            private String sign_alg;
            private String signed_content;

            private Builder() {
            }

            public CMSSignedData build() {
                return new CMSSignedData(this);
            }

            public Builder setHashId(String str) {
                this.hash_id = str;
                return this;
            }

            public Builder setSignAlg(String str) {
                this.sign_alg = str;
                return this;
            }

            public Builder setSignedContent(String str) {
                this.signed_content = str;
                return this;
            }
        }

        private CMSSignedData(Builder builder) {
            this.sign_alg = builder.sign_alg;
            this.hash_id = builder.hash_id;
            this.signed_content = builder.signed_content;
        }

        public static Builder newBuilder() {
            return new Builder();
        }

        public String getHashId() {
            return this.hash_id;
        }

        public String getSignAlg() {
            return this.sign_alg;
        }

        public String getSignedContent() {
            return this.signed_content;
        }

        public String toString() {
            return "CMSSignedData{sign_alg='" + this.sign_alg + "', hash_id='" + this.hash_id + "', signed_content='" + this.signed_content + "'}";
        }
    }

    public static class EnKmsSessionInfo {
        private final long begin_time;
        private final String en_session_info;
        private final long end_time;
        private final String iv;
        private final String user_init_info;

        public static class Builder {
            private long begin_time;
            private String en_session_info;
            private long end_time;
            private String iv;
            private String user_init_info;

            private Builder() {
            }

            public EnKmsSessionInfo build() {
                return new EnKmsSessionInfo(this);
            }

            public Builder setBeginTime(long j2) {
                this.begin_time = j2;
                return this;
            }

            public Builder setEnSessionInfo(String str) {
                this.en_session_info = str;
                return this;
            }

            public Builder setEndTime(long j2) {
                this.end_time = j2;
                return this;
            }

            public Builder setIv(String str) {
                this.iv = str;
                return this;
            }

            public Builder setUserInitInfo(String str) {
                this.user_init_info = str;
                return this;
            }
        }

        private EnKmsSessionInfo(Builder builder) {
            this.user_init_info = builder.user_init_info;
            this.begin_time = builder.begin_time;
            this.end_time = builder.end_time;
            this.en_session_info = builder.en_session_info;
            this.iv = builder.iv;
        }

        public static Builder newBuilder() {
            return new Builder();
        }

        public long getBeginTime() {
            return this.begin_time;
        }

        public String getEnSessionInfo() {
            return this.en_session_info;
        }

        public long getEndTime() {
            return this.end_time;
        }

        public String getIv() {
            return this.iv;
        }

        public String getUserInitInfo() {
            return this.user_init_info;
        }

        public String toString() {
            return "EnKmsSessionInfo{user_init_info='" + this.user_init_info + "', begin_time=" + this.begin_time + ", end_time=" + this.end_time + ", en_session_info='" + this.en_session_info + "', iv='" + this.iv + "'}";
        }
    }

    public static class EnServiceSessionInfo {
        private final long begin_time;
        private final String en_session_info;
        private final long end_time;
        private final String iv;
        private final String user_init_info;

        public static class Builder {
            private long begin_time;
            private String en_session_info;
            private long end_time;
            private String iv;
            private String user_init_info;

            private Builder() {
            }

            public EnServiceSessionInfo build() {
                return new EnServiceSessionInfo(this);
            }

            public Builder setBeginTime(long j2) {
                this.begin_time = j2;
                return this;
            }

            public Builder setEnSessionInfo(String str) {
                this.en_session_info = str;
                return this;
            }

            public Builder setEndTime(long j2) {
                this.end_time = j2;
                return this;
            }

            public Builder setIv(String str) {
                this.iv = str;
                return this;
            }

            public Builder setUserInitInfo(String str) {
                this.user_init_info = str;
                return this;
            }
        }

        private EnServiceSessionInfo(Builder builder) {
            this.user_init_info = builder.user_init_info;
            this.begin_time = builder.begin_time;
            this.end_time = builder.end_time;
            this.en_session_info = builder.en_session_info;
            this.iv = builder.iv;
        }

        public static Builder newBuilder() {
            return new Builder();
        }

        public long getBeginTime() {
            return this.begin_time;
        }

        public String getEnSessionInfo() {
            return this.en_session_info;
        }

        public long getEndTime() {
            return this.end_time;
        }

        public String getIv() {
            return this.iv;
        }

        public String getUserInitInfo() {
            return this.user_init_info;
        }
    }

    public static class Header {
        private final String enc_type;
        private final String key_type;
        private final String nonce;
        private final String request_id;
        private final String sig_type;
        private final String ticket;
        private final long timestamp;
        private final UAKIndex uak_index;
        private final String username;
        private final int version;
        private final WBKeyIndex wb_key_index;

        public static class Builder {
            private String enc_type;
            private String key_type;
            private String nonce;
            private String request_id;
            private String sig_type;
            private String ticket;
            private long timestamp;
            private UAKIndex uak_index;
            private String username;
            private int version;
            private WBKeyIndex wb_key_index;

            private Builder() {
            }

            public Header build() {
                return new Header(this);
            }

            public Builder setEncType(String str) {
                Omkms3.checkParameters(str);
                this.enc_type = str;
                return this;
            }

            public Builder setKeyType(String str) {
                Omkms3.checkParameters(str);
                this.key_type = str;
                return this;
            }

            public Builder setNonce(String str) {
                Omkms3.checkParameters(str);
                this.nonce = str;
                return this;
            }

            public Builder setRequestId(String str) {
                Omkms3.checkParameters(str);
                this.request_id = str;
                return this;
            }

            public Builder setSigType(String str) {
                Omkms3.checkParameters(str);
                this.sig_type = str;
                return this;
            }

            public Builder setTicket(String str) {
                Omkms3.checkParameters(str);
                this.ticket = str;
                return this;
            }

            public Builder setTimestamp(long j2) {
                this.timestamp = j2;
                return this;
            }

            public Builder setUakIndex(UAKIndex uAKIndex) {
                if (uAKIndex == null) {
                    throw new IllegalArgumentException("Parameter cannot be null.");
                }
                this.uak_index = uAKIndex;
                return this;
            }

            public Builder setUsername(String str) {
                Omkms3.checkParameters(str);
                this.username = str;
                return this;
            }

            public Builder setVersion(int i) {
                this.version = i;
                return this;
            }

            public Builder setWbKeyIndex(WBKeyIndex wBKeyIndex) {
                if (wBKeyIndex == null) {
                    throw new IllegalArgumentException("Parameter cannot be null.");
                }
                this.wb_key_index = wBKeyIndex;
                return this;
            }
        }

        private Header(Builder builder) {
            this.request_id = builder.request_id;
            this.version = builder.version;
            this.enc_type = builder.enc_type;
            this.sig_type = builder.sig_type;
            this.key_type = builder.key_type;
            this.wb_key_index = builder.wb_key_index;
            this.uak_index = builder.uak_index;
            this.username = builder.username;
            this.timestamp = builder.timestamp;
            this.nonce = builder.nonce;
            this.ticket = builder.ticket;
        }

        public static Builder newBuilder() {
            return new Builder();
        }

        public String getEncType() {
            return this.enc_type;
        }

        public String getKeyType() {
            return this.key_type;
        }

        public String getNonce() {
            return this.nonce;
        }

        public String getRequestId() {
            return this.request_id;
        }

        public String getSigType() {
            return this.sig_type;
        }

        public String getTicket() {
            return this.ticket;
        }

        public long getTimestamp() {
            return this.timestamp;
        }

        public UAKIndex getUakIndex() {
            return this.uak_index;
        }

        public String getUsername() {
            return this.username;
        }

        public int getVersion() {
            return this.version;
        }

        public WBKeyIndex getWbKeyIndex() {
            return this.wb_key_index;
        }

        public String toString() {
            return "Header{request_id='" + this.request_id + "', version=" + this.version + ", enc_type='" + this.enc_type + "', sig_type='" + this.sig_type + "', key_type='" + this.key_type + "', wb_key_index=" + this.wb_key_index + ", uak_index=" + this.uak_index + ", username='" + this.username + "', timestamp=" + this.timestamp + ", nonce='" + this.nonce + "', ticket='" + this.ticket + "'}";
        }
    }

    public static class KMSError {
        private final int code;
        private final String message;
        private final String request_id;

        public static class Builder {
            private int code;
            private String message;
            private String request_id;

            private Builder() {
            }

            public KMSError build() {
                return new KMSError(this);
            }

            public Builder setCode(int i) {
                this.code = i;
                return this;
            }

            public Builder setMessage(String str) {
                this.message = str;
                return this;
            }

            public Builder setRequestId(String str) {
                this.request_id = str;
                return this;
            }
        }

        private KMSError(Builder builder) {
            this.request_id = builder.request_id;
            this.code = builder.code;
            this.message = builder.message;
        }

        public static Builder builder() {
            return new Builder();
        }

        public int getCode() {
            return this.code;
        }

        public String getMessage() {
            return this.message;
        }

        public String getRequestId() {
            return this.request_id;
        }
    }

    public static class KeyStats {
        private final String app_name;
        private final long decrypt_count;
        private final long encrypt_count;
        private final String key_id;
        private final String wb_id;

        public static class Builder {
            private String app_name;
            private long decrypt_count;
            private long encrypt_count;
            private String key_id;
            private String wb_id;

            private Builder() {
            }

            public KeyStats build() {
                return new KeyStats(this);
            }

            public Builder setAppName(String str) {
                this.app_name = str;
                return this;
            }

            public Builder setDecryptCount(long j2) {
                this.decrypt_count = j2;
                return this;
            }

            public Builder setEncryptCount(long j2) {
                this.encrypt_count = j2;
                return this;
            }

            public Builder setKeyId(String str) {
                this.key_id = str;
                return this;
            }

            public Builder setWbId(String str) {
                this.wb_id = str;
                return this;
            }
        }

        private KeyStats(Builder builder) {
            this.key_id = builder.key_id;
            this.app_name = builder.app_name;
            this.wb_id = builder.wb_id;
            this.decrypt_count = builder.decrypt_count;
            this.encrypt_count = builder.encrypt_count;
        }

        public static Builder newBuilder() {
            return new Builder();
        }

        public String getAppName() {
            return this.app_name;
        }

        public long getDecryptCount() {
            return this.decrypt_count;
        }

        public long getEncryptCount() {
            return this.encrypt_count;
        }

        public String getKeyId() {
            return this.key_id;
        }

        public String getWbId() {
            return this.wb_id;
        }
    }

    public static class KmsSessionInfo {
        private final long begin_time;
        private final String dek;
        private final long end_time;
        private final Header header;
        private final String mk;
        private final String ticket;
        private final String user_init_info;

        public static class Builder {
            private long begin_time;
            private String dek;
            private long end_time;
            private Header header;
            private String mk;
            private String ticket;
            private String user_init_info;

            private Builder() {
            }

            public KmsSessionInfo build() {
                return new KmsSessionInfo(this);
            }

            public Builder setBeginTime(long j2) {
                this.begin_time = j2;
                return this;
            }

            public Builder setDek(String str) {
                this.dek = str;
                return this;
            }

            public Builder setEndTime(long j2) {
                this.end_time = j2;
                return this;
            }

            public Builder setHeader(Header header) {
                this.header = header;
                return this;
            }

            public Builder setMk(String str) {
                this.mk = str;
                return this;
            }

            public Builder setTicket(String str) {
                this.ticket = str;
                return this;
            }

            public Builder setUserInitInfo(String str) {
                this.user_init_info = str;
                return this;
            }
        }

        private KmsSessionInfo(Builder builder) {
            this.header = builder.header;
            this.user_init_info = builder.user_init_info;
            this.begin_time = builder.begin_time;
            this.end_time = builder.end_time;
            this.mk = builder.mk;
            this.dek = builder.dek;
            this.ticket = builder.ticket;
        }

        public static Builder newBuilder() {
            return new Builder();
        }

        public long getBeginTime() {
            return this.begin_time;
        }

        public String getDek() {
            return this.dek;
        }

        public long getEndTime() {
            return this.end_time;
        }

        public Header getHeader() {
            return this.header;
        }

        public String getMk() {
            return this.mk;
        }

        public String getTicket() {
            return this.ticket;
        }

        public String getUserInitInfo() {
            return this.user_init_info;
        }
    }

    public static final class NonceClass {
        private final String encrypted_dek;
        private final String encrypted_mk;

        public static class Builder {
            private String encrypted_dek;
            private String encrypted_mk;

            private Builder() {
            }

            public NonceClass build() {
                return new NonceClass(this);
            }

            public Builder setEncryptedDekString(String str) {
                Omkms3.checkParameters(str);
                this.encrypted_dek = str;
                return this;
            }

            public Builder setEncryptedMkString(String str) {
                Omkms3.checkParameters(str);
                this.encrypted_mk = str;
                return this;
            }
        }

        private NonceClass(Builder builder) {
            this.encrypted_mk = builder.encrypted_mk;
            this.encrypted_dek = builder.encrypted_dek;
        }

        public static Builder newBuilder() {
            return new Builder();
        }

        public CMSEncryptedData getEncryptedDek() {
            if (TextUtils.isEmpty(this.encrypted_dek)) {
                return null;
            }
            return (CMSEncryptedData) h.a(this.encrypted_dek, CMSEncryptedData.class);
        }

        public String getEncryptedDekJsonString() {
            return this.encrypted_dek;
        }

        public CMSEncryptedData getEncryptedMk() {
            if (TextUtils.isEmpty(this.encrypted_mk)) {
                return null;
            }
            return (CMSEncryptedData) h.a(this.encrypted_mk, CMSEncryptedData.class);
        }

        public String getEncryptedMkJsonString() {
            return this.encrypted_mk;
        }
    }

    public static class Pack {
        private final String header;
        private final String payload;
        private final String signature;

        public static class Builder {
            private String header;
            private String payload;
            private String signature;

            private Builder() {
            }

            public Pack build() {
                return new Pack(this);
            }

            public Builder setHeader(String str) {
                this.header = str;
                return this;
            }

            public Builder setPayload(String str) {
                this.payload = str;
                return this;
            }

            public Builder setSignature(String str) {
                this.signature = str;
                return this;
            }
        }

        private Pack(Builder builder) {
            this.header = builder.header;
            this.payload = builder.payload;
            this.signature = builder.signature;
        }

        public static Builder newBuilder() {
            return new Builder();
        }

        public Header getHeader() {
            return (Header) h.a(this.header, Header.class);
        }

        public String getHeaderString() {
            return this.header;
        }

        public CMSEncryptedData getPayload() {
            return (CMSEncryptedData) h.a(this.payload, CMSEncryptedData.class);
        }

        public String getPayloadString() {
            return this.payload;
        }

        public CMSSignedData getSignature() {
            return (CMSSignedData) h.a(this.signature, CMSSignedData.class);
        }

        public String getSignatureString() {
            return this.signature;
        }

        public String toString() {
            return "Pack{header='" + this.header + "', payload='" + this.payload + "', signature='" + this.signature + "'}";
        }
    }

    public static class ReqGetKMSSystemTime {
        private final String account;

        public static class Builder {
            private String account;

            private Builder() {
            }

            public ReqGetKMSSystemTime build() {
                return new ReqGetKMSSystemTime(this);
            }

            public Builder setAccount(String str) {
                this.account = str;
                return this;
            }
        }

        private ReqGetKMSSystemTime(Builder builder) {
            this.account = builder.account;
        }

        public static Builder newBuilder() {
            return new Builder();
        }

        public String getAccount() {
            return this.account;
        }

        public String toString() {
            return "ReqGetKMSSystemTime{account='" + this.account + "'}";
        }
    }

    public static class ReqGetKMSTicket {
        private final String account;

        public static class Builder {
            private String account;

            private Builder() {
            }

            public ReqGetKMSTicket build() {
                return new ReqGetKMSTicket(this);
            }

            public Builder setAccount(String str) {
                this.account = str;
                return this;
            }
        }

        private ReqGetKMSTicket(Builder builder) {
            this.account = builder.account;
        }

        public static Builder newBuilder() {
            return new Builder();
        }

        public String getAccount() {
            return this.account;
        }
    }

    public static class ReqGetKmsCerts {
        private final String app_name;
        private final String device_id;

        public static class Builder {
            private String app_name;
            private String device_id;

            private Builder() {
            }

            public ReqGetKmsCerts build() {
                return new ReqGetKmsCerts(this);
            }

            public Builder setAppName(String str) {
                this.app_name = str;
                return this;
            }

            public Builder setDeviceId(String str) {
                this.device_id = str;
                return this;
            }
        }

        private ReqGetKmsCerts(Builder builder) {
            this.app_name = builder.app_name;
            this.device_id = builder.device_id;
        }

        public static Builder newBuilder() {
            return new Builder();
        }

        public String getAppName() {
            return this.app_name;
        }

        public String getDeviceId() {
            return this.device_id;
        }
    }

    public static class ReqGetServiceTicket {
        private final String app_name;
        private final String device_id;
        private final List<KeyStats> key_stats;

        public static class Builder {
            private String app_name;
            private String device_id;
            private List<KeyStats> key_stats;

            private Builder() {
                this.key_stats = new ArrayList();
            }

            public Builder addAllKeyStats(List<KeyStats> list) {
                this.key_stats = list;
                return this;
            }

            public ReqGetServiceTicket build() {
                return new ReqGetServiceTicket(this);
            }

            public Builder setAppName(String str) {
                this.app_name = str;
                return this;
            }

            public Builder setDeviceId(String str) {
                this.device_id = str;
                return this;
            }

            public Builder setKeyStats(KeyStats keyStats) {
                this.key_stats.add(keyStats);
                return this;
            }
        }

        private ReqGetServiceTicket(Builder builder) {
            this.app_name = builder.app_name;
            this.device_id = builder.device_id;
            this.key_stats = builder.key_stats;
        }

        public static Builder newBuilder() {
            return new Builder();
        }

        public String getAppName() {
            return this.app_name;
        }

        public String getDeviceId() {
            return this.device_id;
        }

        public List<KeyStats> getKeyStats() {
            return this.key_stats;
        }
    }

    public static class ResGetKMSSystemTime {
        private final long timestamp;

        public static class Builder {
            private long timestamp;

            private Builder() {
            }

            public ResGetKMSSystemTime build() {
                return new ResGetKMSSystemTime(this);
            }

            public Builder setTimestamp(long j2) {
                this.timestamp = j2;
                return this;
            }
        }

        private ResGetKMSSystemTime(Builder builder) {
            this.timestamp = builder.timestamp;
        }

        public static Builder builder() {
            return new Builder();
        }

        public long getTimestamp() {
            return this.timestamp;
        }
    }

    public static class ResGetKMSTicket {
        private final String account;
        private final long begin_time;
        private final String dek;
        private final long end_time;
        private final String mk;
        private final String ticket;

        public static class Builder {
            private String account;
            private long begin_time;
            private String dek;
            private long end_time;
            private String mk;
            private String ticket;

            private Builder() {
            }

            public ResGetKMSTicket build() {
                return new ResGetKMSTicket(this);
            }

            public Builder setAccount(String str) {
                this.account = str;
                return this;
            }

            public Builder setBeginTime(long j2) {
                this.begin_time = j2;
                return this;
            }

            public Builder setDek(String str) {
                this.dek = str;
                return this;
            }

            public Builder setEndTime(long j2) {
                this.end_time = j2;
                return this;
            }

            public Builder setMk(String str) {
                this.mk = str;
                return this;
            }

            public Builder setTicket(String str) {
                this.ticket = str;
                return this;
            }
        }

        private ResGetKMSTicket(Builder builder) {
            this.account = builder.account;
            this.begin_time = builder.begin_time;
            this.end_time = builder.end_time;
            this.mk = builder.mk;
            this.dek = builder.dek;
            this.ticket = builder.ticket;
        }

        public static Builder builder() {
            return new Builder();
        }

        public String getAccount() {
            return this.account;
        }

        public long getBeginTime() {
            return this.begin_time;
        }

        public String getDek() {
            return this.dek;
        }

        public long getEndTime() {
            return this.end_time;
        }

        public String getMk() {
            return this.mk;
        }

        public String getTicket() {
            return this.ticket;
        }
    }

    public static class ResGetKmsCerts {
        private final String appName;
        private List<String> kms_cert_chain;

        public static class Builder {
            private String appName;
            private List<String> kms_cert_chain;

            private Builder() {
                this.kms_cert_chain = Collections.emptyList();
            }

            public ResGetKmsCerts build() {
                return new ResGetKmsCerts(this);
            }

            public Builder setAppName(String str) {
                this.appName = str;
                return this;
            }

            public Builder setKmsCertChain(List<String> list) {
                this.kms_cert_chain = list;
                return this;
            }
        }

        private ResGetKmsCerts(Builder builder) {
            this.kms_cert_chain = new ArrayList();
            this.appName = builder.appName;
            this.kms_cert_chain = builder.kms_cert_chain;
        }

        public static Builder newBuilder() {
            return new Builder();
        }

        public String getAppName() {
            return this.appName;
        }

        public List<String> getKmsCertChain() {
            return this.kms_cert_chain;
        }
    }

    public static class ResGetServiceTicket {
        private final String app_name;
        private final long begin_time;
        private final String dek;
        private final long end_time;
        private final String mk;
        private final String ticket;

        public static class Builder {
            private String app_name;
            private long begin_time;
            private String dek;
            private long end_time;
            private String mk;
            private String ticket;

            private Builder() {
            }

            public ResGetServiceTicket build() {
                return new ResGetServiceTicket(this);
            }

            public Builder setAppName(String str) {
                this.app_name = str;
                return this;
            }

            public Builder setBeginTime(long j2) {
                this.begin_time = j2;
                return this;
            }

            public Builder setDek(String str) {
                this.dek = str;
                return this;
            }

            public Builder setEndTime(long j2) {
                this.end_time = j2;
                return this;
            }

            public Builder setMk(String str) {
                this.mk = str;
                return this;
            }

            public Builder setTicket(String str) {
                this.ticket = str;
                return this;
            }
        }

        private ResGetServiceTicket(Builder builder) {
            this.app_name = builder.app_name;
            this.begin_time = builder.begin_time;
            this.end_time = builder.end_time;
            this.mk = builder.mk;
            this.dek = builder.dek;
            this.ticket = builder.ticket;
        }

        public static Builder builder() {
            return new Builder();
        }

        public String getAppName() {
            return this.app_name;
        }

        public long getBeginTime() {
            return this.begin_time;
        }

        public String getDek() {
            return this.dek;
        }

        public long getEndTime() {
            return this.end_time;
        }

        public String getMk() {
            return this.mk;
        }

        public String getTicket() {
            return this.ticket;
        }

        public String toString() {
            return "ResGetServiceTicket{app_name='" + this.app_name + "', begin_time='" + this.begin_time + "', end_time='" + this.end_time + "', mk='" + this.mk + "', dek='" + this.dek + "', ticket='" + this.ticket + "'}";
        }
    }

    public static class ServiceSessionInfo {
        private final long begin_time;
        private final String dek;
        private final long end_time;
        private final Header header;
        private final String mk;
        private final String ticket;
        private final String user_init_info;

        public static class Builder {
            private long begin_time;
            private String dek;
            private long end_time;
            private Header header;
            private String mk;
            private String ticket;
            private String user_init_info;

            private Builder() {
            }

            public ServiceSessionInfo build() {
                return new ServiceSessionInfo(this);
            }

            public Builder setBeginTime(long j2) {
                this.begin_time = j2;
                return this;
            }

            public Builder setDek(String str) {
                this.dek = str;
                return this;
            }

            public Builder setEndTime(long j2) {
                this.end_time = j2;
                return this;
            }

            public Builder setHeader(Header header) {
                this.header = header;
                return this;
            }

            public Builder setMk(String str) {
                this.mk = str;
                return this;
            }

            public Builder setTicket(String str) {
                this.ticket = str;
                return this;
            }

            public Builder setUserInitInfo(String str) {
                this.user_init_info = str;
                return this;
            }
        }

        private ServiceSessionInfo(Builder builder) {
            this.header = builder.header;
            this.user_init_info = builder.user_init_info;
            this.begin_time = builder.begin_time;
            this.end_time = builder.end_time;
            this.mk = builder.mk;
            this.dek = builder.dek;
            this.ticket = builder.ticket;
        }

        public static Builder newBuilder() {
            return new Builder();
        }

        public long getBeginTime() {
            return this.begin_time;
        }

        public String getDek() {
            return this.dek;
        }

        public long getEndTime() {
            return this.end_time;
        }

        public Header getHeader() {
            return this.header;
        }

        public String getMk() {
            return this.mk;
        }

        public String getTicket() {
            return this.ticket;
        }

        public String getUserInitInfo() {
            return this.user_init_info;
        }

        public String toString() {
            return "ServiceSessionInfo{header=" + this.header + ", user_init_info='" + this.user_init_info + "', begin_time=" + this.begin_time + ", end_time=" + this.end_time + ", mk='" + this.mk + "', dek='" + this.dek + "', ticket='" + this.ticket + "'}";
        }
    }

    public static class Ticket {
        private final long begin_time;
        private final String cname;
        private final String ctype;
        private final String dek;
        private final long end_time;
        private final String mk;
        private final String oob;
        private final String sname;
        private final String stype;
        private final int version;

        public static class Builder {
            private long begin_time;
            private String cname;
            private String ctype;
            private String dek;
            private long end_time;
            private String mk;
            private String oob;
            private String sname;
            private String stype;
            private int version;

            private Builder() {
            }

            public Ticket build() {
                return new Ticket(this);
            }

            public Builder setBeginTime(long j2) {
                this.begin_time = j2;
                return this;
            }

            public Builder setCname(String str) {
                this.cname = str;
                return this;
            }

            public Builder setCtype(String str) {
                this.ctype = str;
                return this;
            }

            public Builder setDek(String str) {
                this.dek = str;
                return this;
            }

            public Builder setEndTime(long j2) {
                this.end_time = j2;
                return this;
            }

            public Builder setMk(String str) {
                this.mk = str;
                return this;
            }

            public Builder setOob(String str) {
                this.oob = str;
                return this;
            }

            public Builder setSname(String str) {
                this.sname = str;
                return this;
            }

            public Builder setStype(String str) {
                this.stype = str;
                return this;
            }

            public Builder setVersion(int i) {
                this.version = i;
                return this;
            }
        }

        private Ticket(Builder builder) {
            this.version = builder.version;
            this.ctype = builder.ctype;
            this.cname = builder.cname;
            this.stype = builder.stype;
            this.sname = builder.sname;
            this.begin_time = builder.begin_time;
            this.end_time = builder.end_time;
            this.mk = builder.mk;
            this.dek = builder.dek;
            this.oob = builder.oob;
        }

        public static Builder builder() {
            return new Builder();
        }

        public long getBeginTime() {
            return this.begin_time;
        }

        public String getCname() {
            return this.cname;
        }

        public String getCtype() {
            return this.ctype;
        }

        public String getDek() {
            return this.dek;
        }

        public long getEndTime() {
            return this.end_time;
        }

        public String getMk() {
            return this.mk;
        }

        public String getOob() {
            return this.oob;
        }

        public String getSname() {
            return this.sname;
        }

        public String getStype() {
            return this.stype;
        }

        public int getVersion() {
            return this.version;
        }
    }

    public static class UAKIndex {
        private final String app_name;
        private final String uak_id;

        public static class Builder {
            private String app_name;
            private String uak_id;

            private Builder() {
            }

            public UAKIndex build() {
                return new UAKIndex(this);
            }

            public Builder setAppName(String str) {
                this.app_name = str;
                return this;
            }

            public Builder setUakId(String str) {
                this.uak_id = str;
                return this;
            }
        }

        private UAKIndex(Builder builder) {
            this.app_name = builder.app_name;
            this.uak_id = builder.uak_id;
        }

        public static Builder newBuilder() {
            return new Builder();
        }

        public String getAppName() {
            return this.app_name;
        }

        public String getUakId() {
            return this.uak_id;
        }
    }

    public static class WBKeyIndex {
        String app_name;
        String key_id;
        String wb_id;
        int wb_version;

        public static class Builder {
            private String app_name;
            private String key_id;
            private String wb_id;
            private int wb_version;

            private Builder() {
            }

            public WBKeyIndex build() {
                return new WBKeyIndex(this);
            }

            public Builder setAppName(String str) {
                this.app_name = str;
                return this;
            }

            public Builder setKeyId(String str) {
                this.key_id = str;
                return this;
            }

            public Builder setWbId(String str) {
                this.wb_id = str;
                return this;
            }

            public Builder setWbVersion(int i) {
                this.wb_version = i;
                return this;
            }
        }

        private WBKeyIndex(Builder builder) {
            this.app_name = builder.app_name;
            this.wb_id = builder.wb_id;
            this.wb_version = builder.wb_version;
            this.key_id = builder.key_id;
        }

        public static Builder newBuilder() {
            return new Builder();
        }

        public String getAppName() {
            return this.app_name;
        }

        public String getKeyId() {
            return this.key_id;
        }

        public String getWbId() {
            return this.wb_id;
        }

        public int getWbVersion() {
            return this.wb_version;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void checkParameters(String str) {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("Parameter cannot be null or empty.");
        }
    }
}
