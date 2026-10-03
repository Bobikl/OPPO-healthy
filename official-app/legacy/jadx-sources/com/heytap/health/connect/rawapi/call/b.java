package com.heytap.health.connect.rawapi.call;

import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0003\u0004\u000b\fB\u0011\b\u0004\u0012\u0006\u0010\b\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\b\u0010\u0003\u001a\u00020\u0002H\u0016R\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007\u0082\u0001\u0003\r\u000e\u000f¨\u0006\u0010"}, d2 = {"Lcom/heytap/health/connect/rawapi/call/b;", "", "", "toString", "a", "Ljava/lang/String;", "getMsg", "()Ljava/lang/String;", "msg", "<init>", "(Ljava/lang/String;)V", "b", "c", "Lcom/heytap/health/connect/rawapi/call/b$a;", "Lcom/heytap/health/connect/rawapi/call/b$b;", "Lcom/heytap/health/connect/rawapi/call/b$c;", "lib_heytapconnect_release"}, k = 1, mv = {1, 8, 0})
public abstract class b {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final String msg;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/heytap/health/connect/rawapi/call/b$a;", "Lcom/heytap/health/connect/rawapi/call/b;", "<init>", "()V", "lib_heytapconnect_release"}, k = 1, mv = {1, 8, 0})
    public static final class a extends b {

        @NotNull
        public static final a INSTANCE = new a();

        public a() {
            super("Disconnect", null);
        }
    }

    /* JADX INFO: renamed from: com.heytap.health.connect.rawapi.call.b$b, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/heytap/health/connect/rawapi/call/b$b;", "Lcom/heytap/health/connect/rawapi/call/b;", "<init>", "()V", "lib_heytapconnect_release"}, k = 1, mv = {1, 8, 0})
    public static final class C0326b extends b {

        @NotNull
        public static final C0326b INSTANCE = new C0326b();

        public C0326b() {
            super("SendError", null);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/heytap/health/connect/rawapi/call/b$c;", "Lcom/heytap/health/connect/rawapi/call/b;", "<init>", "()V", "lib_heytapconnect_release"}, k = 1, mv = {1, 8, 0})
    public static final class c extends b {

        @NotNull
        public static final c INSTANCE = new c();

        public c() {
            super("TimeOut", null);
        }
    }

    public /* synthetic */ b(String str, DefaultConstructorMarker defaultConstructorMarker) {
        this(str);
    }

    @NotNull
    /* JADX INFO: renamed from: toString, reason: from getter */
    public String getMsg() {
        return this.msg;
    }

    public b(String str) {
        this.msg = str;
    }
}
