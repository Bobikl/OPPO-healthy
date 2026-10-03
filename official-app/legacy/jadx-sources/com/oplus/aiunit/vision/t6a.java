package com.oplus.aiunit.vision;

import android.graphics.drawable.Drawable;
import com.heytap.databaseengine.model.healtharchive.IndicatorTrend;
import com.heytap.databaseengine.model.healtharchive.IndicatorTrendTag;
import com.heytap.health.health_archives.R$drawable;
import com.heytap.health.health_archives.R$string;
import com.heytap.health.health_archives.bean.HealthIndicatorTagType;
import com.heytap.health.health_archives.bean.IndicatorTagBean;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes16.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\u0018\u0000 \u000e2\u00020\u0001:\u0001\bB\u0007¢\u0006\u0004\b\f\u0010\rJ\"\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00042\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004J\u0014\u0010\u000b\u001a\u0004\u0018\u00010\u00072\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0002¨\u0006\u000f"}, d2 = {"Lcom/oplus/aiunit/vision/t6a;", "", "Lcom/heytap/databaseengine/model/healtharchive/IndicatorTrend;", "indicatorTrend", "", "Lcom/heytap/databaseengine/model/healtharchive/IndicatorTrendTag;", "trendTags", "Lcom/heytap/health/health_archives/bean/IndicatorTagBean;", "a", "", "tagCode", "b", "<init>", "()V", "Companion", "health_archives_release"}, k = 1, mv = {1, 8, 0})
public final class t6a {
    @NotNull
    public final List<IndicatorTagBean> a(@NotNull IndicatorTrend indicatorTrend, @NotNull List<IndicatorTrendTag> trendTags) {
        Intrinsics.checkNotNullParameter(indicatorTrend, "indicatorTrend");
        Intrinsics.checkNotNullParameter(trendTags, "trendTags");
        ArrayList arrayList = new ArrayList();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        if (indicatorTrend.getRiskRank() == 2) {
            String strL = qtf.l(R$string.health_archives_indicator_focus_tag);
            Drawable drawableH = qtf.h(R$drawable.health_archives_ff9440_radius_3);
            Intrinsics.checkNotNull(drawableH);
            arrayList.add(new IndicatorTagBean(strL, drawableH));
            linkedHashSet.add(strL);
        }
        for (IndicatorTrendTag indicatorTrendTag : trendTags) {
            if (arrayList.size() >= 3) {
                break;
            }
            IndicatorTagBean indicatorTagBeanB = b(indicatorTrendTag.getTagCode());
            if (indicatorTagBeanB != null && !linkedHashSet.contains(indicatorTagBeanB.getTagText())) {
                arrayList.add(indicatorTagBeanB);
                linkedHashSet.add(indicatorTagBeanB.getTagText());
            }
        }
        return arrayList;
    }

    public final IndicatorTagBean b(String tagCode) {
        if (Intrinsics.areEqual(tagCode, HealthIndicatorTagType.INDICATOR_REGULAR_REVIEW.getCode())) {
            String strL = qtf.l(R$string.health_archives_indicator_focus_tag);
            Drawable drawableH = qtf.h(R$drawable.health_archives_ff9440_radius_3);
            Intrinsics.checkNotNull(drawableH);
            return new IndicatorTagBean(strL, drawableH);
        }
        if (Intrinsics.areEqual(tagCode, HealthIndicatorTagType.INDICATOR_ATTENTION_REQUIRED.getCode())) {
            String strL2 = qtf.l(R$string.health_archives_indicator_tag_attention_required);
            Drawable drawableH2 = qtf.h(R$drawable.health_archives_ffb200_radius_3);
            Intrinsics.checkNotNull(drawableH2);
            return new IndicatorTagBean(strL2, drawableH2);
        }
        if (Intrinsics.areEqual(tagCode, HealthIndicatorTagType.INDICATOR_APPROACH_ABNORMAL.getCode())) {
            String strL3 = qtf.l(R$string.health_archives_indicator_tag_terminate);
            Drawable drawableH3 = qtf.h(R$drawable.health_archives_e56e56_radius_3);
            Intrinsics.checkNotNull(drawableH3);
            return new IndicatorTagBean(strL3, drawableH3);
        }
        if (Intrinsics.areEqual(tagCode, HealthIndicatorTagType.INDICATOR_UPWARD_TREND.getCode())) {
            String strL4 = qtf.l(R$string.health_archives_indicator_tag_increase);
            Drawable drawableH4 = qtf.h(R$drawable.health_archives_909af4_radius_3);
            Intrinsics.checkNotNull(drawableH4);
            return new IndicatorTagBean(strL4, drawableH4);
        }
        if (Intrinsics.areEqual(tagCode, HealthIndicatorTagType.INDICATOR_DOWNWARD_TREND.getCode())) {
            String strL5 = qtf.l(R$string.health_archives_indicator_tag_decrease);
            Drawable drawableH5 = qtf.h(R$drawable.health_archives_909af4_radius_3);
            Intrinsics.checkNotNull(drawableH5);
            return new IndicatorTagBean(strL5, drawableH5);
        }
        if (Intrinsics.areEqual(tagCode, HealthIndicatorTagType.INDICATOR_STABLE.getCode())) {
            String strL6 = qtf.l(R$string.health_archives_indicator_tag_stable);
            Drawable drawableH6 = qtf.h(R$drawable.health_archives_00bd13_radius_3);
            Intrinsics.checkNotNull(drawableH6);
            return new IndicatorTagBean(strL6, drawableH6);
        }
        if (!Intrinsics.areEqual(tagCode, HealthIndicatorTagType.INDICATOR_NORMAL_TREND.getCode())) {
            return null;
        }
        String strL7 = qtf.l(R$string.health_archives_indicator_tag_normal);
        Drawable drawableH7 = qtf.h(R$drawable.health_archives_00bd13_radius_3);
        Intrinsics.checkNotNull(drawableH7);
        return new IndicatorTagBean(strL7, drawableH7);
    }
}
