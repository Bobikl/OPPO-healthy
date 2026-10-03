package com.oplus.aiunit.vision;

import android.util.Property;
import androidx.exifinterface.media.ExifInterface;
import com.oplus.aiunit.vision.w4;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b&\u0018\u0000*\u000e\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u00028\u00010\u0001*\u0004\b\u0001\u0010\u00032\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0004B\u0015\u0012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00010\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u0018\u0010\u0006\u001a\u00028\u00012\u0006\u0010\u0005\u001a\u00028\u0000H\u0086\u0002¢\u0006\u0004\b\u0006\u0010\u0007J \u0010\n\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00028\u00002\u0006\u0010\b\u001a\u00028\u0001H\u0086\u0002¢\u0006\u0004\b\n\u0010\u000b¨\u0006\u0010"}, d2 = {"Lcom/oplus/aiunit/vision/x4;", "Lcom/oplus/aiunit/vision/w4;", ExifInterface.GPS_DIRECTION_TRUE, ExifInterface.GPS_MEASUREMENT_INTERRUPTED, "Landroid/util/Property;", "parameter", "a", "(Lcom/oplus/aiunit/vision/w4;)Ljava/lang/Object;", "value", "", "b", "(Lcom/oplus/aiunit/vision/w4;Ljava/lang/Object;)V", "Ljava/lang/Class;", "type", "<init>", "(Ljava/lang/Class;)V", "coecommon.1.1.0_release"}, k = 1, mv = {1, 9, 0})
public abstract class x4<T extends w4<V>, V> extends Property<T, V> {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x4(@NotNull Class<V> type) {
        super(type, "Parameter");
        Intrinsics.checkNotNullParameter(type, "type");
    }

    @Override // android.util.Property
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final V get(@NotNull T parameter) {
        Intrinsics.checkNotNullParameter(parameter, "parameter");
        return (V) parameter.h();
    }

    @Override // android.util.Property
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final void set(@NotNull T parameter, V value) {
        Intrinsics.checkNotNullParameter(parameter, "parameter");
        if (Intrinsics.areEqual(parameter.h(), value)) {
            return;
        }
        parameter.j(value);
    }
}
