package com.oplus.aiunit.vision;

import androidx.exifinterface.media.ExifInterface;
import com.heytap.health.watchface.business.creation.category.flexible.bean.DofTemplateBean;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b&\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H&J\b\u0010\u0007\u001a\u00020\u0005H&J\u0010\u0010\n\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\bH&J\b\u0010\u000b\u001a\u00020\u0005H&J\u001e\u0010\u0010\u001a\u00020\u00052\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\b0\f2\u0006\u0010\u000f\u001a\u00020\u000eH&¨\u0006\u0013"}, d2 = {"Lcom/oplus/aiunit/vision/zy5;", "Lcom/oplus/aiunit/vision/qa1;", "Lcom/oplus/aiunit/vision/az5;", "Lcom/heytap/health/watchface/business/creation/category/flexible/bean/DofTemplateBean;", kvi.FLEXIBLE_TEMPLATE_RES_DIR_NAME, "", "U", ExifInterface.GPS_MEASUREMENT_INTERRUPTED, "Lcom/oplus/aiunit/vision/vd4;", "record", "S", ExifInterface.GPS_DIRECTION_TRUE, "", "selectedRecords", "", "isDeleteAll", "R", "<init>", "()V", "watchface_impl_release"}, k = 1, mv = {1, 8, 0})
public abstract class zy5 extends qa1<az5> {
    public abstract void R(@NotNull List<? extends vd4> selectedRecords, boolean isDeleteAll);

    public abstract void S(@NotNull vd4 record);

    public abstract void T();

    public abstract void U(@NotNull DofTemplateBean template);

    public abstract void V();
}
