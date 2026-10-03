package com.oplus.aiunit.vision;

import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes16.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0003\u0004\u0003\u0007B\t\b\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\u0006\u0010\u0003\u001a\u00020\u0002J\u0006\u0010\u0004\u001a\u00020\u0002\u0082\u0001\u0003\b\t\n¨\u0006\u000b"}, d2 = {"Lcom/oplus/aiunit/vision/vkd;", "", "", "b", "a", "<init>", "()V", "c", "Lcom/oplus/aiunit/vision/vkd$a;", "Lcom/oplus/aiunit/vision/vkd$b;", "Lcom/oplus/aiunit/vision/vkd$c;", "device_pair_release"}, k = 1, mv = {1, 8, 0})
public abstract class vkd {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0006"}, d2 = {"Lcom/oplus/aiunit/vision/vkd$a;", "Lcom/oplus/aiunit/vision/vkd;", "", "toString", "<init>", "()V", "device_pair_release"}, k = 1, mv = {1, 8, 0})
    public static final class a extends vkd {

        @NotNull
        public static final a INSTANCE = new a();

        public a() {
            super(null);
        }

        @NotNull
        public String toString() {
            return "DeviceModelNotSupport";
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0006"}, d2 = {"Lcom/oplus/aiunit/vision/vkd$b;", "Lcom/oplus/aiunit/vision/vkd;", "", "toString", "<init>", "()V", "device_pair_release"}, k = 1, mv = {1, 8, 0})
    public static final class b extends vkd {

        @NotNull
        public static final b INSTANCE = new b();

        public b() {
            super(null);
        }

        @NotNull
        public String toString() {
            return "DeviceSupport";
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0006"}, d2 = {"Lcom/oplus/aiunit/vision/vkd$c;", "Lcom/oplus/aiunit/vision/vkd;", "", "toString", "<init>", "()V", "device_pair_release"}, k = 1, mv = {1, 8, 0})
    public static final class c extends vkd {

        @NotNull
        public static final c INSTANCE = new c();

        public c() {
            super(null);
        }

        @NotNull
        public String toString() {
            return "DeviceVersionNotSupport";
        }
    }

    public vkd() {
    }

    public /* synthetic */ vkd(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public final boolean a() {
        return this instanceof b;
    }

    public final boolean b() {
        return this instanceof c;
    }
}
