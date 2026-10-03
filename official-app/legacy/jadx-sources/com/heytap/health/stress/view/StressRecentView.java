package com.heytap.health.stress.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.heytap.health.stress.R$id;
import com.heytap.health.stress.R$layout;
import com.heytap.health.stress.R$string;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes18.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004B\u0017\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007B\u001f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/heytap/health/stress/view/StressRecentView;", "Landroid/widget/LinearLayout;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "attr", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "stress_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class StressRecentView extends LinearLayout {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StressRecentView(@NotNull Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        View.inflate(getContext(), R$layout.health_stress_recent_view, this);
        TextView textView = (TextView) findViewById(R$id.tv_health_stress_description_relax);
        textView.setText(textView.getContext().getString(R$string.health_stress_relax) + ": 1-29");
        TextView textView2 = (TextView) findViewById(R$id.tv_health_stress_description_normal);
        textView2.setText(textView2.getContext().getString(R$string.health_stress_normal) + ": 30-59");
        TextView textView3 = (TextView) findViewById(R$id.tv_health_stress_description_medium);
        textView3.setText(textView3.getContext().getString(R$string.health_stress_medium) + ": 60-79");
        TextView textView4 = (TextView) findViewById(R$id.tv_health_stress_description_high);
        textView4.setText(textView4.getContext().getString(R$string.health_stress_high) + ": 80-100");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StressRecentView(@NotNull Context context, @NotNull AttributeSet attr) {
        super(context, attr);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(attr, "attr");
        View.inflate(getContext(), R$layout.health_stress_recent_view, this);
        TextView textView = (TextView) findViewById(R$id.tv_health_stress_description_relax);
        textView.setText(textView.getContext().getString(R$string.health_stress_relax) + ": 1-29");
        TextView textView2 = (TextView) findViewById(R$id.tv_health_stress_description_normal);
        textView2.setText(textView2.getContext().getString(R$string.health_stress_normal) + ": 30-59");
        TextView textView3 = (TextView) findViewById(R$id.tv_health_stress_description_medium);
        textView3.setText(textView3.getContext().getString(R$string.health_stress_medium) + ": 60-79");
        TextView textView4 = (TextView) findViewById(R$id.tv_health_stress_description_high);
        textView4.setText(textView4.getContext().getString(R$string.health_stress_high) + ": 80-100");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StressRecentView(@NotNull Context context, @NotNull AttributeSet attr, int i) {
        super(context, attr, i);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(attr, "attr");
        View.inflate(getContext(), R$layout.health_stress_recent_view, this);
        TextView textView = (TextView) findViewById(R$id.tv_health_stress_description_relax);
        textView.setText(textView.getContext().getString(R$string.health_stress_relax) + ": 1-29");
        TextView textView2 = (TextView) findViewById(R$id.tv_health_stress_description_normal);
        textView2.setText(textView2.getContext().getString(R$string.health_stress_normal) + ": 30-59");
        TextView textView3 = (TextView) findViewById(R$id.tv_health_stress_description_medium);
        textView3.setText(textView3.getContext().getString(R$string.health_stress_medium) + ": 60-79");
        TextView textView4 = (TextView) findViewById(R$id.tv_health_stress_description_high);
        textView4.setText(textView4.getContext().getString(R$string.health_stress_high) + ": 80-100");
    }
}
