package com.oplus.ocs.wearengine.data;

import com.oplus.ocs.wearengine.proto.DataProto$DataPointAccuracy;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.NoWhenBranchMatchedException;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b&\u0018\u0000 \u00072\u00020\u0001:\u0001\u0007B\u0005¢\u0006\u0002\u0010\u0002R\u0014\u0010\u0003\u001a\u00020\u00048@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"Lcom/oplus/ocs/wearengine/data/DataPointAccuracy;", "", "()V", "proto", "Lcom/oplus/ocs/wearengine/proto/DataProto$DataPointAccuracy;", "getProto$thirdparty_impl_release", "()Lcom/oplus/ocs/wearengine/proto/DataProto$DataPointAccuracy;", "Companion", "thirdparty_impl_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public abstract class DataPointAccuracy {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0080\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0015\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0000¢\u0006\u0002\b\u0007¨\u0006\b"}, d2 = {"Lcom/oplus/ocs/wearengine/data/DataPointAccuracy$Companion;", "", "()V", "fromProto", "Lcom/oplus/ocs/wearengine/data/DataPointAccuracy;", "proto", "Lcom/oplus/ocs/wearengine/proto/DataProto$DataPointAccuracy;", "fromProto$thirdparty_impl_release", "thirdparty_impl_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {

        @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
        public /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[DataProto$DataPointAccuracy.AccuracyCase.values().length];
                try {
                    iArr[DataProto$DataPointAccuracy.AccuracyCase.LOCATION_ACCURACY.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[DataProto$DataPointAccuracy.AccuracyCase.ACCURACY_NOT_SET.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final DataPointAccuracy fromProto$thirdparty_impl_release(@NotNull DataProto$DataPointAccuracy proto) {
            Intrinsics.checkNotNullParameter(proto, "proto");
            DataProto$DataPointAccuracy.AccuracyCase accuracyCase = proto.getAccuracyCase();
            int i = accuracyCase == null ? -1 : WhenMappings.$EnumSwitchMapping$0[accuracyCase.ordinal()];
            if (i != -1) {
                if (i == 1) {
                    return new LocationAccuracy(proto);
                }
                if (i != 2) {
                    throw new NoWhenBranchMatchedException();
                }
            }
            throw new IllegalStateException("Accuracy not set on " + proto);
        }
    }

    @NotNull
    public final DataProto$DataPointAccuracy getProto$thirdparty_impl_release() {
        if (this instanceof LocationAccuracy) {
            return ((LocationAccuracy) this).getDataPointAccuracyProto$thirdparty_impl_release();
        }
        throw new IllegalStateException("No serialization available for this type.");
    }
}
