package com.heytap.health.bloodoxygen.view;

import android.content.Context;
import android.text.format.DateFormat;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.heytap.databaseengine.model.bloodoxygensaturation.BloodOxygenSaturation;
import com.heytap.health.bloodoxygen.R$id;
import com.heytap.health.bloodoxygen.R$layout;
import com.heytap.health.bloodoxygen.R$string;
import com.heytap.health.bloodoxygen.view.Spo2DetailView;
import com.heytap.log.formatter.LogFieldKey;
import com.oplus.aiunit.vision.v05;
import com.oplus.smartenginehelper.entity.ClickApiEntity;
import io.protostuff.MapSchema;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Lazy;
import p010kotlin.LazyKt__LazyJVMKt;
import p010kotlin.Metadata;
import p010kotlin.Unit;
import p010kotlin.jvm.functions.Function0;
import p010kotlin.jvm.functions.Function3;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\r\n\u0002\b\r\u0018\u00002\u00020\u0001B\u0011\b\u0016\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b7\u00108B\u001b\b\u0016\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b7\u00109B#\b\u0016\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010:\u001a\u00020$¢\u0006\u0004\b7\u0010;J\u0010\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002J\u001a\u0010\n\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0002R\u0018\u0010\u000e\u001a\u0004\u0018\u00010\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001b\u0010\u0014\u001a\u00020\u000f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001b\u0010\u0017\u001a\u00020\u000f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0015\u0010\u0011\u001a\u0004\b\u0016\u0010\u0013R\u001b\u0010\u001c\u001a\u00020\u00188BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0019\u0010\u0011\u001a\u0004\b\u001a\u0010\u001bR\u0018\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eRi\u0010.\u001aI\u0012\u0013\u0012\u00110 ¢\u0006\f\b!\u0012\b\b\"\u0012\u0004\b\b(#\u0012\u0013\u0012\u00110$¢\u0006\f\b!\u0012\b\b\"\u0012\u0004\b\b(%\u0012\u0013\u0012\u00110&¢\u0006\f\b!\u0012\b\b\"\u0012\u0004\b\b('\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u001f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+\"\u0004\b,\u0010-R\u001c\u00103\u001a\n 0*\u0004\u0018\u00010/0/8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b1\u00102R\u0014\u00106\u001a\u00020&8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b4\u00105¨\u0006<"}, d2 = {"Lcom/heytap/health/bloodoxygen/view/Spo2DetailView;", "Landroid/widget/FrameLayout;", "Lcom/heytap/databaseengine/model/bloodoxygensaturation/BloodOxygenSaturation;", "detailData", "", "setDeatilData", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "b", "Landroid/widget/LinearLayout;", "i", "Landroid/widget/LinearLayout;", "rootView", "Landroid/widget/TextView;", "j", "Lkotlin/Lazy;", "getTvLabel", "()Landroid/widget/TextView;", "tvLabel", MapSchema.FIELD_NAME_KEY, "getTvValue", "tvValue", "Landroid/widget/ImageView;", LogFieldKey.LEVEL_KEY, "getIvIconGo", "()Landroid/widget/ImageView;", "ivIconGo", LogFieldKey.MESSAGE_KEY, "Lcom/heytap/databaseengine/model/bloodoxygensaturation/BloodOxygenSaturation;", "Lkotlin/Function3;", "Landroid/view/View;", "Lkotlin/ParameterName;", "name", "v", "", "value", "", ClickApiEntity.TIME, "n", "Lkotlin/jvm/functions/Function3;", "getClickCallBack", "()Lkotlin/jvm/functions/Function3;", "setClickCallBack", "(Lkotlin/jvm/functions/Function3;)V", "clickCallBack", "", "kotlin.jvm.PlatformType", "getTimeStr", "()Ljava/lang/CharSequence;", "timeStr", "getSp2Value", "()Ljava/lang/String;", "sp2Value", "<init>", "(Landroid/content/Context;)V", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "blood_oxygen_release"}, k = 1, mv = {1, 8, 0})
public final class Spo2DetailView extends FrameLayout {

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @Nullable
    public LinearLayout rootView;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final Lazy tvLabel;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    @NotNull
    public final Lazy tvValue;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final Lazy ivIconGo;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    @Nullable
    public BloodOxygenSaturation detailData;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public Function3<? super View, ? super Integer, ? super String, Unit> clickCallBack;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Spo2DetailView(@NotNull Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        this.tvLabel = LazyKt__LazyJVMKt.lazy(new Function0<TextView>() { // from class: com.heytap.health.bloodoxygen.view.Spo2DetailView$tvLabel$2
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // p010kotlin.jvm.functions.Function0
            public final TextView invoke() {
                return (TextView) this.this$0.findViewById(R$id.tv_time_range);
            }
        });
        this.tvValue = LazyKt__LazyJVMKt.lazy(new Function0<TextView>() { // from class: com.heytap.health.bloodoxygen.view.Spo2DetailView$tvValue$2
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // p010kotlin.jvm.functions.Function0
            public final TextView invoke() {
                return (TextView) this.this$0.findViewById(R$id.tv_warning_value);
            }
        });
        this.ivIconGo = LazyKt__LazyJVMKt.lazy(new Function0<ImageView>() { // from class: com.heytap.health.bloodoxygen.view.Spo2DetailView$ivIconGo$2
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // p010kotlin.jvm.functions.Function0
            public final ImageView invoke() {
                return (ImageView) this.this$0.findViewById(R$id.iv_go);
            }
        });
        b(context, null);
    }

    public static final void c(Spo2DetailView this$0, View it) {
        Function3<? super View, ? super Integer, ? super String, Unit> function3;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (this$0.detailData == null || (function3 = this$0.clickCallBack) == null) {
            return;
        }
        Intrinsics.checkNotNullExpressionValue(it, "it");
        BloodOxygenSaturation bloodOxygenSaturation = this$0.detailData;
        function3.invoke(it, Integer.valueOf(bloodOxygenSaturation != null ? bloodOxygenSaturation.getBloodOxygenSaturationValue() : 0), this$0.getTimeStr().toString());
    }

    private final ImageView getIvIconGo() {
        Object value = this.ivIconGo.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "<get-ivIconGo>(...)");
        return (ImageView) value;
    }

    private final String getSp2Value() {
        BloodOxygenSaturation bloodOxygenSaturation = this.detailData;
        return (bloodOxygenSaturation != null ? Integer.valueOf(bloodOxygenSaturation.getBloodOxygenSaturationValue()) : null) + "%";
    }

    private final CharSequence getTimeStr() {
        BloodOxygenSaturation bloodOxygenSaturation = this.detailData;
        return DateFormat.format(v05.DATE_FORMAT_HOUR, bloodOxygenSaturation != null ? bloodOxygenSaturation.getDataCreatedTimestamp() : 0L);
    }

    private final TextView getTvLabel() {
        Object value = this.tvLabel.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "<get-tvLabel>(...)");
        return (TextView) value;
    }

    private final TextView getTvValue() {
        Object value = this.tvValue.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "<get-tvValue>(...)");
        return (TextView) value;
    }

    public final void b(Context context, AttributeSet attrs) {
        View.inflate(context, R$layout.health_spo2_detail_view, this);
        LinearLayout linearLayout = (LinearLayout) findViewById(R$id.rootView);
        this.rootView = linearLayout;
        if (linearLayout != null) {
            linearLayout.setOnClickListener(new View.OnClickListener() { // from class: com.oplus.aiunit.vision.q8i
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    Spo2DetailView.c(this.i, view);
                }
            });
        }
    }

    @Nullable
    public final Function3<View, Integer, String, Unit> getClickCallBack() {
        return this.clickCallBack;
    }

    public final void setClickCallBack(@Nullable Function3<? super View, ? super Integer, ? super String, Unit> function3) {
        this.clickCallBack = function3;
    }

    public final void setDeatilData(@Nullable BloodOxygenSaturation detailData) {
        this.detailData = detailData;
        if (detailData == null) {
            getTvLabel().setText(R$string.health_blood_oxygen_no_record);
            getTvValue().setText("");
            getIvIconGo().setVisibility(8);
            return;
        }
        getTvLabel().setText(R$string.health_blood_oxygen_detail_last);
        TextView tvValue = getTvValue();
        CharSequence timeStr = getTimeStr();
        tvValue.setText(((Object) timeStr) + " | " + getSp2Value());
        getIvIconGo().setVisibility(0);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Spo2DetailView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        this.tvLabel = LazyKt__LazyJVMKt.lazy(new Function0<TextView>() { // from class: com.heytap.health.bloodoxygen.view.Spo2DetailView$tvLabel$2
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // p010kotlin.jvm.functions.Function0
            public final TextView invoke() {
                return (TextView) this.this$0.findViewById(R$id.tv_time_range);
            }
        });
        this.tvValue = LazyKt__LazyJVMKt.lazy(new Function0<TextView>() { // from class: com.heytap.health.bloodoxygen.view.Spo2DetailView$tvValue$2
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // p010kotlin.jvm.functions.Function0
            public final TextView invoke() {
                return (TextView) this.this$0.findViewById(R$id.tv_warning_value);
            }
        });
        this.ivIconGo = LazyKt__LazyJVMKt.lazy(new Function0<ImageView>() { // from class: com.heytap.health.bloodoxygen.view.Spo2DetailView$ivIconGo$2
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // p010kotlin.jvm.functions.Function0
            public final ImageView invoke() {
                return (ImageView) this.this$0.findViewById(R$id.iv_go);
            }
        });
        b(context, attributeSet);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Spo2DetailView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        this.tvLabel = LazyKt__LazyJVMKt.lazy(new Function0<TextView>() { // from class: com.heytap.health.bloodoxygen.view.Spo2DetailView$tvLabel$2
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // p010kotlin.jvm.functions.Function0
            public final TextView invoke() {
                return (TextView) this.this$0.findViewById(R$id.tv_time_range);
            }
        });
        this.tvValue = LazyKt__LazyJVMKt.lazy(new Function0<TextView>() { // from class: com.heytap.health.bloodoxygen.view.Spo2DetailView$tvValue$2
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // p010kotlin.jvm.functions.Function0
            public final TextView invoke() {
                return (TextView) this.this$0.findViewById(R$id.tv_warning_value);
            }
        });
        this.ivIconGo = LazyKt__LazyJVMKt.lazy(new Function0<ImageView>() { // from class: com.heytap.health.bloodoxygen.view.Spo2DetailView$ivIconGo$2
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // p010kotlin.jvm.functions.Function0
            public final ImageView invoke() {
                return (ImageView) this.this$0.findViewById(R$id.iv_go);
            }
        });
        b(context, attributeSet);
    }
}
