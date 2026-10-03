package com.oplus.aiunit.vision;

import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes16.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u0000 \f2\u00020\u0001:\u0003\u0006\u0004\rB\u0011\b\u0004\u0012\u0006\u0010\t\u001a\u00020\u0005¢\u0006\u0004\b\n\u0010\u000bJ\u000e\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00020\u0000R\u0017\u0010\t\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\u0006\u0010\b\u0082\u0001\u0002\u000e\u000f¨\u0006\u0010"}, d2 = {"Lcom/oplus/aiunit/vision/ra5;", "", "role", "", "b", "", "a", "I", "()I", "value", "<init>", "(I)V", "Companion", "c", "Lcom/oplus/aiunit/vision/ra5$a;", "Lcom/oplus/aiunit/vision/ra5$c;", "device_manager_release"}, k = 1, mv = {1, 8, 0})
public abstract class ra5 {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    public static final int NONE = 0;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public final int value;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0006"}, d2 = {"Lcom/oplus/aiunit/vision/ra5$a;", "Lcom/oplus/aiunit/vision/ra5;", "", "toString", "<init>", "()V", "device_manager_release"}, k = 1, mv = {1, 8, 0})
    public static final class a extends ra5 {

        @NotNull
        public static final a INSTANCE = new a();

        public a() {
            super(3, null);
        }

        @NotNull
        public String toString() {
            return "AllRole";
        }
    }

    /* JADX INFO: renamed from: com.oplus.aiunit.vision.ra5$b, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002R\u0014\u0010\u0006\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0007R\u0014\u0010\t\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\u0007¨\u0006\f"}, d2 = {"Lcom/oplus/aiunit/vision/ra5$b;", "", "", "roleValue", "Lcom/oplus/aiunit/vision/ra5$c;", "a", "NONE", "I", "PRIMARY", "SECONDARY", "<init>", "()V", "device_manager_release"}, k = 1, mv = {1, 8, 0})
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final c a(int roleValue) {
            return roleValue == 2 ? c.C0924c.INSTANCE : c.b.INSTANCE;
        }
    }

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u0000 \t2\u00020\u0001:\u0003\n\u000b\u0003B\u0011\b\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0006\u0010\u0003\u001a\u00020\u0002J\u0006\u0010\u0004\u001a\u00020\u0002\u0082\u0001\u0002\f\r¨\u0006\u000e"}, d2 = {"Lcom/oplus/aiunit/vision/ra5$c;", "Lcom/oplus/aiunit/vision/ra5;", "", "c", "d", "", "value", "<init>", "(I)V", "Companion", "a", "b", "Lcom/oplus/aiunit/vision/ra5$c$b;", "Lcom/oplus/aiunit/vision/ra5$c$c;", "device_manager_release"}, k = 1, mv = {1, 8, 0})
    public static abstract class c extends ra5 {

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0006"}, d2 = {"Lcom/oplus/aiunit/vision/ra5$c$b;", "Lcom/oplus/aiunit/vision/ra5$c;", "", "toString", "<init>", "()V", "device_manager_release"}, k = 1, mv = {1, 8, 0})
        public static final class b extends c {

            @NotNull
            public static final b INSTANCE = new b();

            public b() {
                super(1, null);
            }

            @NotNull
            public String toString() {
                return "PrimaryRole";
            }
        }

        /* JADX INFO: renamed from: com.oplus.aiunit.vision.ra5$c$c, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0006"}, d2 = {"Lcom/oplus/aiunit/vision/ra5$c$c;", "Lcom/oplus/aiunit/vision/ra5$c;", "", "toString", "<init>", "()V", "device_manager_release"}, k = 1, mv = {1, 8, 0})
        public static final class C0924c extends c {

            @NotNull
            public static final C0924c INSTANCE = new C0924c();

            public C0924c() {
                super(2, null);
            }

            @NotNull
            public String toString() {
                return "SecondaryRole";
            }
        }

        public /* synthetic */ c(int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(i);
        }

        public final boolean c() {
            return Intrinsics.areEqual(this, b.INSTANCE);
        }

        public final boolean d() {
            return Intrinsics.areEqual(this, C0924c.INSTANCE);
        }

        public c(int i) {
            super(i, null);
        }
    }

    public /* synthetic */ ra5(int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(i);
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final int getValue() {
        return this.value;
    }

    public final boolean b(@NotNull ra5 role) {
        Intrinsics.checkNotNullParameter(role, "role");
        return sa5.a(this.value, role);
    }

    public ra5(int i) {
        this.value = i;
    }
}
