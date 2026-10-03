package com.heytap.store.base.core.util.exposure;

import com.heytap.store.platform.tools.DeviceUtils;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.JvmOverloads;
import p010kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002¢\u0006\u0002\u0010\u0005J\u0017\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0002\u0010\tR\u000e\u0010\u0003\u001a\u00020\u0002X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0002X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/heytap/store/base/core/util/exposure/ExposureScrolledPercentsCondition;", "Lcom/heytap/store/base/core/util/exposure/IExposureCondition;", "", "delta", "orientation", "(II)V", "accept", "", "value", "(Ljava/lang/Integer;)Z", "Core_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final class ExposureScrolledPercentsCondition implements IExposureCondition<Integer> {
    private final int delta;
    private final int orientation;

    @JvmOverloads
    public ExposureScrolledPercentsCondition(int i) {
        this(i, 0, 2, null);
    }

    @JvmOverloads
    public ExposureScrolledPercentsCondition(int i, int i2) {
        this.delta = i;
        this.orientation = i2;
    }

    @Override // com.heytap.store.base.core.util.exposure.IExposureCondition
    public boolean accept(@Nullable Integer value) {
        return Math.abs(this.delta) > (this.orientation == 1 ? DeviceUtils.INSTANCE.getScreenHeight() / 5 : DeviceUtils.INSTANCE.getScreenWidth() / 5);
    }

    public /* synthetic */ ExposureScrolledPercentsCondition(int i, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, (i3 & 2) != 0 ? 1 : i2);
    }
}
