package com.oplus.aiunit.vision;

import io.protostuff.MapSchema;
import java.util.ArrayList;
import java.util.List;
import okhttp3.httpdns.IpInfo;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\b\n\u0002\b\u0010\u0018\u0000 .2\u00020\u0001:\u0002\u0002\u0011BY\b\u0002\u0012\u0006\u0010\u0010\u001a\u00020\f\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0000\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\u0000\u0012\u000e\u0010\u001e\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u0012\u0006\u0010\"\u001a\u00020\u001f\u0012\u0006\u0010&\u001a\u00020\n\u0012\b\u0010*\u001a\u0004\u0018\u00010\u0001\u0012\b\b\u0002\u0010+\u001a\u00020\u001f¢\u0006\u0004\b,\u0010-J\b\u0010\u0002\u001a\u0004\u0018\u00010\u0000J\u0006\u0010\u0004\u001a\u00020\u0003J\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005J\u0006\u0010\t\u001a\u00020\bJ\b\u0010\u000b\u001a\u00020\nH\u0016R\u0017\u0010\u0010\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\u0002\u0010\r\u001a\u0004\b\u000e\u0010\u000fR$\u0010\u0017\u001a\u0004\u0018\u00010\u00008\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R$\u0010\u001a\u001a\u0004\u0018\u00010\u00008\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010\u0012\u001a\u0004\b\u0018\u0010\u0014\"\u0004\b\u0019\u0010\u0016R\u001f\u0010\u001e\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001b\u0010\u001dR\u0017\u0010\"\u001a\u00020\u001f8\u0006¢\u0006\f\n\u0004\b\u0018\u0010 \u001a\u0004\b\u0011\u0010!R\u0017\u0010&\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b#\u0010%R\u0019\u0010*\u001a\u0004\u0018\u00010\u00018\u0006¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b'\u0010)¨\u0006/"}, d2 = {"Lcom/oplus/aiunit/vision/yx5;", "", "a", "", "j", "", "Lokhttp3/httpdns/IpInfo;", "i", "Lcom/oplus/aiunit/vision/yx5$a;", MapSchema.FIELD_NAME_KEY, "", "toString", "Lcom/oplus/aiunit/vision/wx5;", "Lcom/oplus/aiunit/vision/wx5;", b2n.g, "()Lcom/oplus/aiunit/vision/wx5;", "source", "b", "Lcom/oplus/aiunit/vision/yx5;", "c", "()Lcom/oplus/aiunit/vision/yx5;", "setDnsResult", "(Lcom/oplus/aiunit/vision/yx5;)V", "dnsResult", MapSchema.FIELD_NAME_ENTRY, "setIpResult", "ipResult", "d", "Ljava/util/List;", "()Ljava/util/List;", "ipInfoList", "", "I", "()I", "code", "f", "Ljava/lang/String;", "()Ljava/lang/String;", "message", b2n.f, "Ljava/lang/Object;", "()Ljava/lang/Object;", "obj", "type", "<init>", "(Lcom/oplus/aiunit/vision/wx5;Lcom/oplus/aiunit/vision/yx5;Lcom/oplus/aiunit/vision/yx5;Ljava/util/List;ILjava/lang/String;Ljava/lang/Object;I)V", "Companion", "com.heytap.nearx.common"}, k = 1, mv = {1, 4, 0})
public final class yx5 {
    public static final int CODE_DEFAULT_DNS = 101;
    public static final int CODE_FINISH = 100;
    public static final int CODE_UNAVAILABLE = 103;
    public static final int TYPE_DEFAULT = 0;
    public static final int TYPE_DNS_RESULT = 1;
    public static final int TYPE_IP_RESULT = 3;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final DnsRequest source;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @Nullable
    public yx5 dnsResult;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public yx5 ipResult;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @Nullable
    public final List<IpInfo> ipInfoList;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    public final int code;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @NotNull
    public final String message;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @Nullable
    public final Object obj;

    public yx5(DnsRequest dnsRequest, yx5 yx5Var, yx5 yx5Var2, List<IpInfo> list, int i, String str, Object obj, int i2) {
        this.source = dnsRequest;
        this.dnsResult = yx5Var;
        this.ipResult = yx5Var2;
        this.ipInfoList = list;
        this.code = i;
        this.message = str;
        this.obj = obj;
        if (i2 == 1) {
            this.dnsResult = this;
        } else {
            if (i2 != 3) {
                return;
            }
            this.ipResult = this;
        }
    }

    @Nullable
    /* JADX INFO: renamed from: a, reason: from getter */
    public final yx5 getDnsResult() {
        return this.dnsResult;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final int getCode() {
        return this.code;
    }

    @Nullable
    public final yx5 c() {
        return this.dnsResult;
    }

    @Nullable
    public final List<IpInfo> d() {
        return this.ipInfoList;
    }

    @Nullable
    /* JADX INFO: renamed from: e, reason: from getter */
    public final yx5 getIpResult() {
        return this.ipResult;
    }

    @NotNull
    /* JADX INFO: renamed from: f, reason: from getter */
    public final String getMessage() {
        return this.message;
    }

    @Nullable
    /* JADX INFO: renamed from: g, reason: from getter */
    public final Object getObj() {
        return this.obj;
    }

    @NotNull
    /* JADX INFO: renamed from: h, reason: from getter */
    public final DnsRequest getSource() {
        return this.source;
    }

    @NotNull
    public final List<IpInfo> i() {
        List<IpInfo> list = this.ipInfoList;
        return list != null ? list : new ArrayList();
    }

    public final boolean j() {
        return this.code == 100 && this.dnsResult != null;
    }

    @NotNull
    public final a k() {
        return new a(this);
    }

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{ code:");
        sb.append(this.code);
        sb.append(", message: ");
        sb.append(this.message);
        sb.append(",  list: <");
        sb.append(this.ipInfoList);
        sb.append(">,");
        sb.append("dnsResult: ");
        sb.append(Intrinsics.areEqual(this.dnsResult, this) ? "self" : this.dnsResult);
        sb.append(", ");
        sb.append("ipResult: ");
        sb.append(Intrinsics.areEqual(this.ipResult, this) ? "self" : this.ipResult);
        sb.append(" }");
        return sb.toString();
    }

    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u001d\u001a\u00020\u0019¢\u0006\u0004\b\u001e\u0010\u001fB\u0011\b\u0016\u0012\u0006\u0010 \u001a\u00020\f¢\u0006\u0004\b\u001e\u0010!J\u0014\u0010\u0005\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002J\u000e\u0010\b\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u0006J\u000e\u0010\n\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\tJ\u000e\u0010\u000b\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u0001J\u0006\u0010\r\u001a\u00020\fJ\u0006\u0010\u000e\u001a\u00020\fJ\u0006\u0010\u000f\u001a\u00020\fR\u0018\u0010\u0011\u001a\u0004\u0018\u00010\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\r\u0010\u0010R\u0018\u0010\u0012\u001a\u0004\u0018\u00010\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010\u0010R\u001e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010\u0013R\u0016\u0010\u0007\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\b\u0010\u0014R\u0016\u0010\u0016\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0005\u0010\u0015R\u0018\u0010\u0018\u001a\u0004\u0018\u00010\u00018\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\n\u0010\u0017R\u0017\u0010\u001d\u001a\u00020\u00198\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c¨\u0006\""}, d2 = {"Lcom/oplus/aiunit/vision/yx5$a;", "", "", "Lokhttp3/httpdns/IpInfo;", "inetAddressList", MapSchema.FIELD_NAME_ENTRY, "", "code", "d", "", "f", b2n.f, "Lcom/oplus/aiunit/vision/yx5;", "a", "b", "c", "Lcom/oplus/aiunit/vision/yx5;", "dnsResult", "ipResult", "Ljava/util/List;", "I", "Ljava/lang/String;", "message", "Ljava/lang/Object;", "obj", "Lcom/oplus/aiunit/vision/wx5;", "Lcom/oplus/aiunit/vision/wx5;", "getSource", "()Lcom/oplus/aiunit/vision/wx5;", "source", "<init>", "(Lcom/oplus/aiunit/vision/wx5;)V", "result", "(Lcom/oplus/aiunit/vision/yx5;)V", "com.heytap.nearx.common"}, k = 1, mv = {1, 4, 0})
    public static final class a {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        public yx5 dnsResult;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        public yx5 ipResult;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        public List<IpInfo> inetAddressList;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        public int code;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
        public String message;

        /* JADX INFO: renamed from: f, reason: from kotlin metadata */
        public Object obj;

        /* JADX INFO: renamed from: g, reason: from kotlin metadata */
        @NotNull
        public final DnsRequest source;

        public a(@NotNull DnsRequest source) {
            Intrinsics.checkNotNullParameter(source, "source");
            this.source = source;
            this.code = -1;
            this.message = "";
        }

        @NotNull
        public final yx5 a() {
            if (this.source != null) {
                return new yx5(this.source, this.dnsResult, this.ipResult, this.inetAddressList, this.code, this.message, this.obj, 0, 128, null);
            }
            throw new IllegalStateException("domainUnit == null");
        }

        @NotNull
        public final yx5 b() {
            if (this.source != null) {
                return new yx5(this.source, this.dnsResult, this.ipResult, this.inetAddressList, this.code, this.message, this.obj, 1, null);
            }
            throw new IllegalStateException("domainUnit == null");
        }

        @NotNull
        public final yx5 c() {
            if (this.source != null) {
                return new yx5(this.source, this.dnsResult, this.ipResult, this.inetAddressList, this.code, this.message, this.obj, 3, null);
            }
            throw new IllegalStateException("domainUnit == null");
        }

        @NotNull
        public final a d(int code) {
            this.code = code;
            return this;
        }

        @NotNull
        public final a e(@NotNull List<IpInfo> inetAddressList) {
            Intrinsics.checkNotNullParameter(inetAddressList, "inetAddressList");
            this.inetAddressList = inetAddressList;
            return this;
        }

        @NotNull
        public final a f(@NotNull String code) {
            Intrinsics.checkNotNullParameter(code, "code");
            this.message = code;
            return this;
        }

        @NotNull
        public final a g(@NotNull Object code) {
            Intrinsics.checkNotNullParameter(code, "code");
            this.obj = code;
            return this;
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public a(@NotNull yx5 result) {
            this(result.getSource());
            Intrinsics.checkNotNullParameter(result, "result");
            this.dnsResult = result.c();
            this.ipResult = result.getIpResult();
            this.inetAddressList = result.d();
            this.code = result.getCode();
            this.message = result.getMessage();
            this.obj = result.getObj();
        }
    }

    public /* synthetic */ yx5(DnsRequest dnsRequest, yx5 yx5Var, yx5 yx5Var2, List list, int i, String str, Object obj, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(dnsRequest, yx5Var, yx5Var2, list, i, str, obj, i2);
    }

    public /* synthetic */ yx5(DnsRequest dnsRequest, yx5 yx5Var, yx5 yx5Var2, List list, int i, String str, Object obj, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(dnsRequest, yx5Var, yx5Var2, list, i, str, obj, (i3 & 128) != 0 ? 0 : i2);
    }
}
