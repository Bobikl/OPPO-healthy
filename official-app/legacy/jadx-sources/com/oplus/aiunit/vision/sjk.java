package com.oplus.aiunit.vision;

import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes16.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u0000 \t2\u00020\u0001:\u0003\u0003\n\u000bB\u0011\b\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0003\u0010\u0005\u0082\u0001\u0002\f\r¨\u0006\u000e"}, d2 = {"Lcom/oplus/aiunit/vision/sjk;", "", "", "a", "I", "()I", "type", "<init>", "(I)V", "Companion", "b", "c", "Lcom/oplus/aiunit/vision/sjk$a;", "Lcom/oplus/aiunit/vision/sjk$c;", "device_manager_release"}, k = 1, mv = {1, 8, 0})
public abstract class sjk {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public final int type;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0006"}, d2 = {"Lcom/oplus/aiunit/vision/sjk$a;", "Lcom/oplus/aiunit/vision/sjk;", "", "toString", "<init>", "()V", "device_manager_release"}, k = 1, mv = {1, 8, 0})
    public static final class a extends sjk {

        @NotNull
        public static final a INSTANCE = new a();

        public a() {
            super(2, null);
        }

        @NotNull
        public String toString() {
            return "Cloud";
        }
    }

    /* JADX INFO: renamed from: com.oplus.aiunit.vision.sjk$b, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002¨\u0006\b"}, d2 = {"Lcom/oplus/aiunit/vision/sjk$b;", "", "", "type", "Lcom/oplus/aiunit/vision/sjk;", "a", "<init>", "()V", "device_manager_release"}, k = 1, mv = {1, 8, 0})
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final sjk a(int type) {
            return type == 1 ? c.INSTANCE : a.INSTANCE;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0006"}, d2 = {"Lcom/oplus/aiunit/vision/sjk$c;", "Lcom/oplus/aiunit/vision/sjk;", "", "toString", "<init>", "()V", "device_manager_release"}, k = 1, mv = {1, 8, 0})
    public static final class c extends sjk {

        @NotNull
        public static final c INSTANCE = new c();

        public c() {
            super(1, null);
        }

        @NotNull
        public String toString() {
            return "Local";
        }
    }

    public /* synthetic */ sjk(int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(i);
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final int getType() {
        return this.type;
    }

    public sjk(int i) {
        this.type = i;
    }
}
