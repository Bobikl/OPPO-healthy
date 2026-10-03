package com.heytap.health.heartrate.measure.ui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Button;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.heytap.health.heartrate.R$id;
import com.heytap.health.heartrate.R$layout;
import com.heytap.health.heartrate.measure.ui.HeartMeasureCard;
import com.oplus.smartenginehelper.ParserTag;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes16.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0012B!\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fB\u001b\b\u0016\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u000e\u0010\u0010B\u0011\b\u0016\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u000e\u0010\u0011J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002R\u0016\u0010\u0003\u001a\u00020\u00028\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007¨\u0006\u0013"}, d2 = {"Lcom/heytap/health/heartrate/measure/ui/HeartMeasureCard;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Lcom/heytap/health/heartrate/measure/ui/HeartMeasureCard$a;", "listener", "", "setClickListener", "i", "Lcom/heytap/health/heartrate/measure/ui/HeartMeasureCard$a;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "(Landroid/content/Context;)V", "a", "heartrate_release"}, k = 1, mv = {1, 8, 0})
public final class HeartMeasureCard extends ConstraintLayout {

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    public a listener;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H&¨\u0006\u0004"}, d2 = {"Lcom/heytap/health/heartrate/measure/ui/HeartMeasureCard$a;", "", "", ParserTag.TAG_ONCLICK, "heartrate_release"}, k = 1, mv = {1, 8, 0})
    public interface a {
        void onClick();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HeartMeasureCard(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        View.inflate(context, R$layout.health_heart_rate_view_messure, this);
        ((Button) findViewById(R$id.btnMeasureCard)).setOnClickListener(new View.OnClickListener() { // from class: com.oplus.aiunit.vision.o19
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                HeartMeasureCard.f(this.i, view);
            }
        });
    }

    public static final void f(HeartMeasureCard this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        a aVar = this$0.listener;
        if (aVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("listener");
            aVar = null;
        }
        aVar.onClick();
    }

    public final void setClickListener(@NotNull a listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.listener = listener;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public HeartMeasureCard(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public HeartMeasureCard(@NotNull Context context) {
        this(context, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }
}
