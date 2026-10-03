package com.oplus.aiunit.vision;

import com.github.mikephil.charting.components.LimitLine;
import com.github.mikephil.charting.components.YAxis;
import com.oplus.weatherservicesdk.data.Weather;
import java.util.Iterator;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.jvm.internal.SourceDebugExtension;
import p010kotlin.text.StringsKt__StringsKt;

/* JADX INFO: loaded from: classes16.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0011\b\u0016\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\b\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0005\u001a\u00020\u0004H\u0016¨\u0006\n"}, d2 = {"Lcom/oplus/aiunit/vision/ab1;", "Lcom/github/mikephil/charting/components/YAxis;", "", "getLongestLabel", "", "needsOffset", "Lcom/github/mikephil/charting/components/YAxis$AxisDependency;", "position", "<init>", "(Lcom/github/mikephil/charting/components/YAxis$AxisDependency;)V", "lib_chart_release"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nBaseYAxis.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BaseYAxis.kt\ncom/heytap/health/core/widget/charts/components/axis/BaseYAxis\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,53:1\n1855#2:54\n1963#2,14:55\n1856#2:69\n*S KotlinDebug\n*F\n+ 1 BaseYAxis.kt\ncom/heytap/health/core/widget/charts/components/axis/BaseYAxis\n*L\n33#1:54\n34#1:55,14\n33#1:69\n*E\n"})
public final class ab1 extends YAxis {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ab1(@NotNull YAxis.AxisDependency position) {
        super(position);
        Intrinsics.checkNotNullParameter(position, "position");
    }

    @Override // com.github.mikephil.charting.components.AxisBase
    @NotNull
    public String getLongestLabel() {
        Object obj;
        int length = this.mEntries.length;
        String str = "";
        for (int i = 0; i < length; i++) {
            String formattedLabel = getFormattedLabel(i);
            if (formattedLabel != null && str.length() < formattedLabel.length()) {
                str = formattedLabel;
            }
        }
        List<LimitLine> limitLines = getLimitLines();
        Intrinsics.checkNotNullExpressionValue(limitLines, "limitLines");
        Iterator<T> it = limitLines.iterator();
        while (it.hasNext()) {
            String label = ((LimitLine) it.next()).getLabel();
            Intrinsics.checkNotNullExpressionValue(label, "limitLine.label");
            Iterator it2 = StringsKt__StringsKt.split$default((CharSequence) label, new String[]{Weather.SEPARATOR}, false, 0, 6, (Object) null).iterator();
            if (it2.hasNext()) {
                Object next = it2.next();
                if (it2.hasNext()) {
                    int length2 = ((String) next).length();
                    do {
                        Object next2 = it2.next();
                        int length3 = ((String) next2).length();
                        if (length2 < length3) {
                            next = next2;
                            length2 = length3;
                        }
                    } while (it2.hasNext());
                }
                obj = next;
            } else {
                obj = null;
            }
            String str2 = (String) obj;
            if (!(str2 == null || str2.length() == 0) && str2.length() > str.length()) {
                str = str2;
            }
        }
        return str;
    }

    @Override // com.github.mikephil.charting.components.YAxis
    public boolean needsOffset() {
        return isEnabled() && ((isDrawLabelsEnabled() && getLabelPosition() == YAxis.YAxisLabelPosition.OUTSIDE_CHART) || getLimitLines().size() > 0);
    }
}
