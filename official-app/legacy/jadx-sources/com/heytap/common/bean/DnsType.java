package com.heytap.common.bean;

import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\f\b\u0086\u0001\u0018\u0000 \n2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u000bB\u0019\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\b\u0010\tJ\u0006\u0010\u0003\u001a\u00020\u0002J\u0006\u0010\u0005\u001a\u00020\u0004R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0006R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0007j\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000f¨\u0006\u0010"}, d2 = {"Lcom/heytap/common/bean/DnsType;", "", "", "text", "", "value", "Ljava/lang/String;", "I", "<init>", "(Ljava/lang/String;ILjava/lang/String;I)V", "Companion", "a", "TYPE_LOCAL", "TYPE_HTTP", "TYPE_HTTP_ALLNET", "TYPE_DIRECT_IP", "com.heytap.nearx.common"}, k = 1, mv = {1, 4, 0})
public enum DnsType {
    TYPE_LOCAL("local", 0),
    TYPE_HTTP("http", 1),
    TYPE_HTTP_ALLNET("http_allnet", 2),
    TYPE_DIRECT_IP("direct_ip", 3);


    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final String text;
    private final int value;

    /* JADX INFO: renamed from: com.heytap.common.bean.DnsType$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002¨\u0006\b"}, d2 = {"Lcom/heytap/common/bean/DnsType$a;", "", "", "value", "Lcom/heytap/common/bean/DnsType;", "a", "<init>", "()V", "com.heytap.nearx.common"}, k = 1, mv = {1, 4, 0})
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final DnsType a(int value) {
            if (value == 1) {
                return DnsType.TYPE_HTTP;
            }
            if (value != 2) {
                return value != 3 ? DnsType.TYPE_LOCAL : DnsType.TYPE_DIRECT_IP;
            }
            return DnsType.TYPE_HTTP_ALLNET;
        }
    }

    DnsType(String str, int i) {
        this.text = str;
        this.value = i;
    }

    @NotNull
    /* JADX INFO: renamed from: text, reason: from getter */
    public final String getText() {
        return this.text;
    }

    /* JADX INFO: renamed from: value, reason: from getter */
    public final int getValue() {
        return this.value;
    }
}
