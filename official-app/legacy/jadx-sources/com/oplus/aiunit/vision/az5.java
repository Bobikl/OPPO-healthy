package com.oplus.aiunit.vision;

import com.heytap.health.watchface.business.creation.category.flexible.bean.DofTemplateBean;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\bf\u0018\u00002\u00020\u0001J$\u0010\b\u001a\u00020\u00072\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0002H&J\b\u0010\t\u001a\u00020\u0007H&J\u0016\u0010\f\u001a\u00020\u00072\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u0002H&J\b\u0010\r\u001a\u00020\u0007H&J\u0010\u0010\u000f\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\u0005H&J\b\u0010\u0010\u001a\u00020\u0007H&¨\u0006\u0011"}, d2 = {"Lcom/oplus/aiunit/vision/az5;", "Lcom/oplus/aiunit/vision/mm9;", "", "Lcom/heytap/health/watchface/business/creation/category/flexible/bean/DofTemplateBean;", "templates", "", "previewPaths", "", "z6", "H4", "Lcom/oplus/aiunit/vision/vd4;", "records", "r0", "j5", "text", "l3", "d", "watchface_impl_release"}, k = 1, mv = {1, 8, 0})
public interface az5 extends mm9 {
    void H4();

    void d();

    void j5();

    void l3(@NotNull String text);

    void r0(@NotNull List<? extends vd4> records);

    void z6(@NotNull List<DofTemplateBean> templates, @NotNull List<String> previewPaths);
}
