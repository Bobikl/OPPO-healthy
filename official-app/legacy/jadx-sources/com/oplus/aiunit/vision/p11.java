package com.oplus.aiunit.vision;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.exifinterface.media.ExifInterface;
import io.protostuff.MapSchema;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes16.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u0019\b\u0004\u0012\u0006\u0010\u0013\u001a\u00028\u0000\u0012\u0006\u0010\u0019\u001a\u00020\f¢\u0006\u0004\b\u001a\u0010\u001bJ\u0006\u0010\u0004\u001a\u00020\u0003J\u0006\u0010\u0005\u001a\u00020\u0003J\u0006\u0010\u0006\u001a\u00020\u0003J\u0006\u0010\b\u001a\u00020\u0007J\u0006\u0010\n\u001a\u00020\tJ\u0006\u0010\u000b\u001a\u00020\u0003J\b\u0010\r\u001a\u00020\fH\u0016R\"\u0010\u0013\u001a\u00028\u00008\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\b\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\"\u0010\u0019\u001a\u00020\f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018\u0082\u0001\u0003\u001c\u0007\t¨\u0006\u001d"}, d2 = {"Lcom/oplus/aiunit/vision/p11;", ExifInterface.GPS_DIRECTION_TRUE, "", "", b2n.f, MapSchema.FIELD_NAME_ENTRY, b2n.g, "Lcom/oplus/aiunit/vision/sil;", "a", "Lcom/oplus/aiunit/vision/sql;", "b", "f", "", "toString", "Ljava/lang/Object;", "d", "()Ljava/lang/Object;", "setData", "(Ljava/lang/Object;)V", "data", "Ljava/lang/String;", "c", "()Ljava/lang/String;", "i", "(Ljava/lang/String;)V", "currDeviceMac", "<init>", "(Ljava/lang/Object;Ljava/lang/String;)V", "Lcom/oplus/aiunit/vision/i32;", "device_settings_impl_release"}, k = 1, mv = {1, 8, 0})
public abstract class p11<T> {
    public static final int $stable = 8;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public T data;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public String currDeviceMac;

    public /* synthetic */ p11(Object obj, String str, DefaultConstructorMarker defaultConstructorMarker) {
        this(obj, str);
    }

    @NotNull
    public final sil a() {
        Intrinsics.checkNotNull(this, "null cannot be cast to non-null type com.heytap.health.device.tab.bean.WearableDevice");
        return (sil) this;
    }

    @NotNull
    public final sql b() {
        Intrinsics.checkNotNull(this, "null cannot be cast to non-null type com.heytap.health.device.tab.bean.WeightScaleDevice");
        return (sql) this;
    }

    @NotNull
    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getCurrDeviceMac() {
        return this.currDeviceMac;
    }

    public final T d() {
        return this.data;
    }

    public final boolean e() {
        return this instanceof i32;
    }

    public final boolean f() {
        return !g();
    }

    public final boolean g() {
        return this instanceof sil;
    }

    public final boolean h() {
        return this instanceof sql;
    }

    public final void i(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.currDeviceMac = str;
    }

    @NotNull
    public String toString() {
        String str;
        if (e()) {
            str = "BpgDevice";
        } else {
            str = h() ? "WeightScaleDevice" : "WearableDevice";
        }
        return n04.OPEN_BRACE_REGEX + str + " mac:" + gdb.a(this.currDeviceMac) + "}";
    }

    public p11(T t, String str) {
        this.data = t;
        this.currDeviceMac = str;
    }
}
