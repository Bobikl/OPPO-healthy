package com.oplus.aiunit.vision;

import com.heytap.health.watchface.business.creation.category.flexible.bean.AlbumPhotoBean;
import com.heytap.health.watchface.business.creation.category.flexible.bean.ComplicationSummaryBean;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\bf\u0018\u00002\u00020\u0001J\u0016\u0010\u0006\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H&J\u0010\u0010\t\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H&J\u0010\u0010\f\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\nH&J\u0016\u0010\u000f\u001a\u00020\u00052\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u0002H&J(\u0010\u0017\u001a\u00020\u00052\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\n2\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0015H&J\b\u0010\u0018\u001a\u00020\u0005H&J\b\u0010\u0019\u001a\u00020\u0005H&J\b\u0010\u001a\u001a\u00020\u0005H&¨\u0006\u001b"}, d2 = {"Lcom/oplus/aiunit/vision/im9;", "Lcom/oplus/aiunit/vision/mm9;", "", "Lcom/oplus/aiunit/vision/jy;", "previewList", "", "C4", "Lcom/heytap/health/watchface/business/creation/category/flexible/bean/AlbumPhotoBean;", "photoBean", "D2", "", "styleColor", "t6", "Lcom/heytap/health/watchface/business/creation/category/flexible/bean/ComplicationSummaryBean;", "complicationSummaryBeans", "I2", "", "stage", "str", "", "progress", "", "enable", "h4", "Q1", "z3", "e6", "watchface_impl_release"}, k = 1, mv = {1, 8, 0})
public interface im9 extends mm9 {
    void C4(@NotNull List<jy> previewList);

    void D2(@NotNull AlbumPhotoBean photoBean);

    void I2(@NotNull List<ComplicationSummaryBean> complicationSummaryBeans);

    void Q1();

    void e6();

    void h4(int stage, @NotNull String str, float progress, boolean enable);

    void t6(@NotNull String styleColor);

    void z3();
}
