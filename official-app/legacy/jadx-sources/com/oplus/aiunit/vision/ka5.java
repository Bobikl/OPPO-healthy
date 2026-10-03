package com.oplus.aiunit.vision;

import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.NoWhenBranchMatchedException;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes16.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u0000 \r2\u00020\u0001:\u0004\u0007\u0005\u000e\u000fB\u0011\b\u0004\u0012\u0006\u0010\n\u001a\u00020\u0006¢\u0006\u0004\b\u000b\u0010\fJ\b\u0010\u0003\u001a\u00020\u0002H\u0016J\u0006\u0010\u0005\u001a\u00020\u0004R\u0017\u0010\n\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0007\u0010\t\u0082\u0001\u0003\u0010\u0011\u0012¨\u0006\u0013"}, d2 = {"Lcom/oplus/aiunit/vision/ka5;", "", "", "toString", "", "b", "", "a", "I", "()I", "status", "<init>", "(I)V", "Companion", "c", "d", "Lcom/oplus/aiunit/vision/ka5$b;", "Lcom/oplus/aiunit/vision/ka5$c;", "Lcom/oplus/aiunit/vision/ka5$d;", "device_manager_release"}, k = 1, mv = {1, 8, 0})
public abstract class ka5 {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public final int status;

    /* JADX INFO: renamed from: com.oplus.aiunit.vision.ka5$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002¨\u0006\b"}, d2 = {"Lcom/oplus/aiunit/vision/ka5$a;", "", "", "status", "Lcom/oplus/aiunit/vision/ka5;", "a", "<init>", "()V", "device_manager_release"}, k = 1, mv = {1, 8, 0})
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final ka5 a(int status) {
            if (status != 1) {
                return status != 2 ? d.INSTANCE : c.INSTANCE;
            }
            return b.INSTANCE;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/oplus/aiunit/vision/ka5$b;", "Lcom/oplus/aiunit/vision/ka5;", "<init>", "()V", "device_manager_release"}, k = 1, mv = {1, 8, 0})
    public static final class b extends ka5 {

        @NotNull
        public static final b INSTANCE = new b();

        public b() {
            super(1, null);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/oplus/aiunit/vision/ka5$c;", "Lcom/oplus/aiunit/vision/ka5;", "<init>", "()V", "device_manager_release"}, k = 1, mv = {1, 8, 0})
    public static final class c extends ka5 {

        @NotNull
        public static final c INSTANCE = new c();

        public c() {
            super(2, null);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/oplus/aiunit/vision/ka5$d;", "Lcom/oplus/aiunit/vision/ka5;", "<init>", "()V", "device_manager_release"}, k = 1, mv = {1, 8, 0})
    public static final class d extends ka5 {

        @NotNull
        public static final d INSTANCE = new d();

        public d() {
            super(-1, null);
        }
    }

    public /* synthetic */ ka5(int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(i);
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final int getStatus() {
        return this.status;
    }

    public final boolean b() {
        return this instanceof b;
    }

    @NotNull
    public String toString() {
        if (Intrinsics.areEqual(this, b.INSTANCE)) {
            return "DeviceAppIsInstall";
        }
        if (Intrinsics.areEqual(this, c.INSTANCE)) {
            return "DeviceAppIsNotInstall";
        }
        if (Intrinsics.areEqual(this, d.INSTANCE)) {
            return "UnKnown";
        }
        throw new NoWhenBranchMatchedException();
    }

    public ka5(int i) {
        this.status = i;
    }
}
