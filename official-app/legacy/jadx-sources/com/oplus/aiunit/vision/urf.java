package com.oplus.aiunit.vision;

import io.protostuff.MapSchema;
import java.util.Arrays;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes16.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u0000 \t2\u00020\u0001:\u0005\u0003\n\u000b\f\rB\u0011\b\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0003\u0010\u0005\u0082\u0001\u0004\u000e\u000f\u0010\u0011¨\u0006\u0012"}, d2 = {"Lcom/oplus/aiunit/vision/urf;", "", "", "a", "I", "()I", "eventType", "<init>", "(I)V", "Companion", "b", "c", "d", MapSchema.FIELD_NAME_ENTRY, "Lcom/oplus/aiunit/vision/urf$b;", "Lcom/oplus/aiunit/vision/urf$c;", "Lcom/oplus/aiunit/vision/urf$d;", "Lcom/oplus/aiunit/vision/urf$e;", "device_pair_release"}, k = 1, mv = {1, 8, 0})
public abstract class urf {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public final int eventType;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0006"}, d2 = {"Lcom/oplus/aiunit/vision/urf$b;", "Lcom/oplus/aiunit/vision/urf;", "", "toString", "<init>", "()V", "device_pair_release"}, k = 1, mv = {1, 8, 0})
    public static final class b extends urf {

        @NotNull
        public static final b INSTANCE = new b();

        public b() {
            super(1, null);
        }

        @NotNull
        public String toString() {
            return "DownloadTypeAllByAppLaunch";
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0006"}, d2 = {"Lcom/oplus/aiunit/vision/urf$c;", "Lcom/oplus/aiunit/vision/urf;", "", "toString", "<init>", "()V", "device_pair_release"}, k = 1, mv = {1, 8, 0})
    public static final class c extends urf {

        @NotNull
        public static final c INSTANCE = new c();

        public c() {
            super(3, null);
        }

        @NotNull
        public String toString() {
            return "DownloadTypeAllByCamera";
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\b\u001a\u00020\u0004¢\u0006\u0004\b\t\u0010\nJ\b\u0010\u0003\u001a\u00020\u0002H\u0016R\u0017\u0010\b\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0005\u0010\u0007¨\u0006\u000b"}, d2 = {"Lcom/oplus/aiunit/vision/urf$d;", "Lcom/oplus/aiunit/vision/urf;", "", "toString", "", "b", "I", "()I", "deviceType", "<init>", "(I)V", "device_pair_release"}, k = 1, mv = {1, 8, 0})
    public static final class d extends urf {

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        public final int deviceType;

        public d(int i) {
            super(2, null);
            this.deviceType = i;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final int getDeviceType() {
            return this.deviceType;
        }

        @NotNull
        public String toString() {
            return "DownloadTypeByDeviceType deviceType:" + this.deviceType;
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u001b\u0012\u0012\u0010\b\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00020\u0004\"\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\b\u0010\u0003\u001a\u00020\u0002H\u0016R\u001f\u0010\b\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0005\u0010\u0007¨\u0006\u000b"}, d2 = {"Lcom/oplus/aiunit/vision/urf$e;", "Lcom/oplus/aiunit/vision/urf;", "", "toString", "", "b", "[Ljava/lang/String;", "()[Ljava/lang/String;", "deviceModel", "<init>", "([Ljava/lang/String;)V", "device_pair_release"}, k = 1, mv = {1, 8, 0})
    public static final class e extends urf {

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        @NotNull
        public final String[] deviceModel;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(@NotNull String... deviceModel) {
            super(5, null);
            Intrinsics.checkNotNullParameter(deviceModel, "deviceModel");
            this.deviceModel = deviceModel;
        }

        @NotNull
        /* JADX INFO: renamed from: b, reason: from getter */
        public final String[] getDeviceModel() {
            return this.deviceModel;
        }

        @NotNull
        public String toString() {
            String string = Arrays.toString(this.deviceModel);
            Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
            return "DownloadTypeByModel deviceModel:" + string;
        }
    }

    public /* synthetic */ urf(int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(i);
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final int getEventType() {
        return this.eventType;
    }

    public urf(int i) {
        this.eventType = i;
    }
}
