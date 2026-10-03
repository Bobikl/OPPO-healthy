package com.oplus.aiunit.vision;

import com.heytap.health.base.task.ThreadUtils;
import com.heytap.health.base.track.quality.QualityTrack;
import com.heytap.health.base.track.quality.Scenes;
import io.protostuff.MapSchema;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.jvm.JvmStatic;
import p010kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u0000 \u00022\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/oplus/aiunit/vision/ty4;", "", "Companion", "a", "device_data_sync_impl_release"}, k = 1, mv = {1, 8, 0})
public final class ty4 {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    public static final String TAG = "DataSyncReportHelper";

    /* JADX INFO: renamed from: com.oplus.aiunit.vision.ty4$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0018\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0007J \u0010\t\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007H\u0007J \u0010\u000b\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0007J\u0010\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u0002H\u0002R\u0014\u0010\u000f\u001a\u00020\r8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010¨\u0006\u0013"}, d2 = {"Lcom/oplus/aiunit/vision/ty4$a;", "", "", y15.PARAMS_DATA_TYPE, "triggerType", "", b2n.f, "", "isFetchedNewData", "i", "resultCode", MapSchema.FIELD_NAME_ENTRY, "code", "", "d", "TAG", "Ljava/lang/String;", "<init>", "()V", "device_data_sync_impl_release"}, k = 1, mv = {1, 8, 0})
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static final void f(int i, int i2, int i3) {
            String str = "dataType=" + vdi.a(i) + "&reason=" + ty4.INSTANCE.d(i2) + "&triggerType=" + kz4.a(i3);
            a7b.f(ty4.TAG, "reportFail " + str);
            QualityTrack.INSTANCE.e(Scenes.DATA_SYNC, str);
        }

        public static final void h(int i, int i2) {
            String str = "dataType=" + vdi.a(i) + "&triggerType=" + kz4.a(i2);
            a7b.f(ty4.TAG, "reportStartDataSync " + str);
            QualityTrack.INSTANCE.c(Scenes.DATA_SYNC, str);
        }

        public static final void j(int i, int i2, boolean z) {
            String str = "dataType=" + vdi.a(i) + "&triggerType=" + kz4.a(i2) + "&isFetchedNewData=" + z;
            a7b.f(ty4.TAG, "reportSuccess " + str);
            QualityTrack.INSTANCE.g(Scenes.DATA_SYNC, str);
        }

        public final String d(int code) {
            if (code == 1) {
                return "SUCCESS";
            }
            if (code == 2) {
                return "RESULT_ERROR_BT";
            }
            if (code == 3) {
                return "RESULT_ERROR_DATA";
            }
            if (code != 4) {
                return code != 5 ? "UN_KNOWN" : "RESULT_TIMEOUT";
            }
            return "RESULT_ERROR_SAVE";
        }

        @JvmStatic
        public final void e(final int dataType, final int resultCode, final int triggerType) {
            ThreadUtils.doInBackground(new Runnable() { // from class: com.oplus.aiunit.vision.sy4
                @Override // java.lang.Runnable
                public final void run() {
                    ty4.Companion.f(dataType, resultCode, triggerType);
                }
            });
        }

        @JvmStatic
        public final void g(final int dataType, final int triggerType) {
            ThreadUtils.doInBackground(new Runnable() { // from class: com.oplus.aiunit.vision.qy4
                @Override // java.lang.Runnable
                public final void run() {
                    ty4.Companion.h(dataType, triggerType);
                }
            });
        }

        @JvmStatic
        public final void i(final int dataType, final int triggerType, final boolean isFetchedNewData) {
            ThreadUtils.doInBackground(new Runnable() { // from class: com.oplus.aiunit.vision.ry4
                @Override // java.lang.Runnable
                public final void run() {
                    ty4.Companion.j(dataType, triggerType, isFetchedNewData);
                }
            });
        }
    }

    @JvmStatic
    public static final void a(int i, int i2, int i3) {
        INSTANCE.e(i, i2, i3);
    }

    @JvmStatic
    public static final void b(int i, int i2) {
        INSTANCE.g(i, i2);
    }

    @JvmStatic
    public static final void c(int i, int i2, boolean z) {
        INSTANCE.i(i, i2, z);
    }
}
