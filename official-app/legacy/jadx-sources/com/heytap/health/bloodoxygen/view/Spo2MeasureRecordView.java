package com.heytap.health.bloodoxygen.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.heytap.health.bloodoxygen.R$id;
import com.heytap.health.bloodoxygen.R$layout;
import com.heytap.health.bloodoxygen.adapter.Spo2MeasureRecordAdapter;
import com.heytap.health.core.widget.charts.data.TimeStampedData;
import com.heytap.log.formatter.LogFieldKey;
import io.protostuff.MapSchema;
import java.util.ArrayList;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Lazy;
import p010kotlin.LazyKt__LazyJVMKt;
import p010kotlin.Metadata;
import p010kotlin.jvm.functions.Function0;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0011\b\u0016\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b(\u0010)B\u001b\b\u0016\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b(\u0010*B#\b\u0016\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\u0006\u0010,\u001a\u00020+¢\u0006\u0004\b(\u0010-J\u001c\u0010\b\u001a\u00020\u00072\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0006\u001a\u00020\u0005J\u001a\u0010\r\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0002R\u001b\u0010\u0013\u001a\u00020\u000e8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u001b\u0010\u0018\u001a\u00020\u00148BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0015\u0010\u0010\u001a\u0004\b\u0016\u0010\u0017R\u001b\u0010\u001d\u001a\u00020\u00198BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001a\u0010\u0010\u001a\u0004\b\u001b\u0010\u001cR\u0016\u0010!\u001a\u00020\u001e8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u001c\u0010%\u001a\b\u0012\u0004\u0012\u00020\u00030\"8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b#\u0010$R\u0016\u0010\u0006\u001a\u00020\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b&\u0010'¨\u0006."}, d2 = {"Lcom/heytap/health/bloodoxygen/view/Spo2MeasureRecordView;", "Landroid/widget/FrameLayout;", "", "Lcom/heytap/health/core/widget/charts/data/TimeStampedData;", "data", "", "dayStartTimeStamp", "", "b", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "a", "Landroid/widget/LinearLayout;", "i", "Lkotlin/Lazy;", "getRootView", "()Landroid/widget/LinearLayout;", "rootView", "Landroid/widget/TextView;", "j", "getTvNoRecord", "()Landroid/widget/TextView;", "tvNoRecord", "Landroidx/recyclerview/widget/RecyclerView;", MapSchema.FIELD_NAME_KEY, "getRecyclerView", "()Landroidx/recyclerview/widget/RecyclerView;", "recyclerView", "Lcom/heytap/health/bloodoxygen/adapter/Spo2MeasureRecordAdapter;", LogFieldKey.LEVEL_KEY, "Lcom/heytap/health/bloodoxygen/adapter/Spo2MeasureRecordAdapter;", "adapter", "", LogFieldKey.MESSAGE_KEY, "Ljava/util/List;", "dataList", "n", "J", "<init>", "(Landroid/content/Context;)V", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "blood_oxygen_release"}, k = 1, mv = {1, 8, 0})
public final class Spo2MeasureRecordView extends FrameLayout {

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @NotNull
    public final Lazy rootView;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final Lazy tvNoRecord;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    @NotNull
    public final Lazy recyclerView;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    public Spo2MeasureRecordAdapter adapter;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    @NotNull
    public List<TimeStampedData> dataList;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    public long dayStartTimeStamp;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Spo2MeasureRecordView(@NotNull Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        this.rootView = LazyKt__LazyJVMKt.lazy(new Function0<LinearLayout>() { // from class: com.heytap.health.bloodoxygen.view.Spo2MeasureRecordView$rootView$2
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // p010kotlin.jvm.functions.Function0
            public final LinearLayout invoke() {
                return (LinearLayout) this.this$0.findViewById(R$id.rootView);
            }
        });
        this.tvNoRecord = LazyKt__LazyJVMKt.lazy(new Function0<TextView>() { // from class: com.heytap.health.bloodoxygen.view.Spo2MeasureRecordView$tvNoRecord$2
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // p010kotlin.jvm.functions.Function0
            public final TextView invoke() {
                return (TextView) this.this$0.findViewById(R$id.tv_no_record);
            }
        });
        this.recyclerView = LazyKt__LazyJVMKt.lazy(new Function0<RecyclerView>() { // from class: com.heytap.health.bloodoxygen.view.Spo2MeasureRecordView$recyclerView$2
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // p010kotlin.jvm.functions.Function0
            public final RecyclerView invoke() {
                return (RecyclerView) this.this$0.findViewById(R$id.recyclerView);
            }
        });
        this.dataList = new ArrayList();
        a(context, null);
    }

    private final RecyclerView getRecyclerView() {
        Object value = this.recyclerView.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "<get-recyclerView>(...)");
        return (RecyclerView) value;
    }

    private final LinearLayout getRootView() {
        Object value = this.rootView.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "<get-rootView>(...)");
        return (LinearLayout) value;
    }

    private final TextView getTvNoRecord() {
        Object value = this.tvNoRecord.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "<get-tvNoRecord>(...)");
        return (TextView) value;
    }

    public final void a(final Context context, AttributeSet attrs) {
        View.inflate(context, R$layout.health_spo2_measure_record_view, this);
        this.adapter = new Spo2MeasureRecordAdapter(context, this.dataList);
        getRecyclerView().setLayoutManager(new LinearLayoutManager(context) { // from class: com.heytap.health.bloodoxygen.view.Spo2MeasureRecordView$initView$1
            @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
            public boolean canScrollVertically() {
                return false;
            }
        });
        RecyclerView recyclerView = getRecyclerView();
        Spo2MeasureRecordAdapter spo2MeasureRecordAdapter = this.adapter;
        if (spo2MeasureRecordAdapter == null) {
            Intrinsics.throwUninitializedPropertyAccessException("adapter");
            spo2MeasureRecordAdapter = null;
        }
        recyclerView.setAdapter(spo2MeasureRecordAdapter);
    }

    public final void b(@NotNull List<? extends TimeStampedData> data, long dayStartTimeStamp) {
        Intrinsics.checkNotNullParameter(data, "data");
        this.dayStartTimeStamp = dayStartTimeStamp;
        this.dataList.clear();
        List<? extends TimeStampedData> list = data;
        this.dataList.addAll(list);
        if (!(!list.isEmpty())) {
            getTvNoRecord().setVisibility(0);
            getRecyclerView().setVisibility(8);
            return;
        }
        getTvNoRecord().setVisibility(8);
        getRecyclerView().setVisibility(0);
        Spo2MeasureRecordAdapter spo2MeasureRecordAdapter = this.adapter;
        if (spo2MeasureRecordAdapter == null) {
            Intrinsics.throwUninitializedPropertyAccessException("adapter");
            spo2MeasureRecordAdapter = null;
        }
        spo2MeasureRecordAdapter.notifyDataSetChanged();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Spo2MeasureRecordView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        this.rootView = LazyKt__LazyJVMKt.lazy(new Function0<LinearLayout>() { // from class: com.heytap.health.bloodoxygen.view.Spo2MeasureRecordView$rootView$2
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // p010kotlin.jvm.functions.Function0
            public final LinearLayout invoke() {
                return (LinearLayout) this.this$0.findViewById(R$id.rootView);
            }
        });
        this.tvNoRecord = LazyKt__LazyJVMKt.lazy(new Function0<TextView>() { // from class: com.heytap.health.bloodoxygen.view.Spo2MeasureRecordView$tvNoRecord$2
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // p010kotlin.jvm.functions.Function0
            public final TextView invoke() {
                return (TextView) this.this$0.findViewById(R$id.tv_no_record);
            }
        });
        this.recyclerView = LazyKt__LazyJVMKt.lazy(new Function0<RecyclerView>() { // from class: com.heytap.health.bloodoxygen.view.Spo2MeasureRecordView$recyclerView$2
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // p010kotlin.jvm.functions.Function0
            public final RecyclerView invoke() {
                return (RecyclerView) this.this$0.findViewById(R$id.recyclerView);
            }
        });
        this.dataList = new ArrayList();
        a(context, attributeSet);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Spo2MeasureRecordView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        this.rootView = LazyKt__LazyJVMKt.lazy(new Function0<LinearLayout>() { // from class: com.heytap.health.bloodoxygen.view.Spo2MeasureRecordView$rootView$2
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // p010kotlin.jvm.functions.Function0
            public final LinearLayout invoke() {
                return (LinearLayout) this.this$0.findViewById(R$id.rootView);
            }
        });
        this.tvNoRecord = LazyKt__LazyJVMKt.lazy(new Function0<TextView>() { // from class: com.heytap.health.bloodoxygen.view.Spo2MeasureRecordView$tvNoRecord$2
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // p010kotlin.jvm.functions.Function0
            public final TextView invoke() {
                return (TextView) this.this$0.findViewById(R$id.tv_no_record);
            }
        });
        this.recyclerView = LazyKt__LazyJVMKt.lazy(new Function0<RecyclerView>() { // from class: com.heytap.health.bloodoxygen.view.Spo2MeasureRecordView$recyclerView$2
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // p010kotlin.jvm.functions.Function0
            public final RecyclerView invoke() {
                return (RecyclerView) this.this$0.findViewById(R$id.recyclerView);
            }
        });
        this.dataList = new ArrayList();
        a(context, attributeSet);
    }
}
