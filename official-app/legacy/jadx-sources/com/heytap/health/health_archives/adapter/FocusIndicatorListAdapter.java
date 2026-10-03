package com.heytap.health.health_archives.adapter;

import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.method.LinkMovementMethod;
import android.text.style.ClickableSpan;
import android.view.View;
import androidx.appcompat.widget.AppCompatTextView;
import com.heytap.databaseengine.model.healtharchive.HealthIndicatorFocus;
import com.heytap.health.base.base.BaseRecyclerAdapter;
import com.heytap.health.base.base.BaseViewHolder;
import com.heytap.health.health_archives.R$color;
import com.heytap.health.health_archives.R$id;
import com.heytap.health.health_archives.R$layout;
import com.heytap.health.wallet.ui.adapter.BaseRecyclerViewHolder;
import com.heytap.log.formatter.LogFieldKey;
import com.oplus.aiunit.vision.qtf;
import com.oplus.smartenginehelper.ParserTag;
import io.protostuff.MapSchema;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes16.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0005\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0015B\u0015\u0012\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00020\u0011¢\u0006\u0004\b\u0013\u0010\u0014J\u0018\u0010\b\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\u000e\u0010\u000b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tJ\u0010\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u0002H\u0002R\u0018\u0010\u0010\u001a\u0004\u0018\u00010\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f¨\u0006\u0016"}, d2 = {"Lcom/heytap/health/health_archives/adapter/FocusIndicatorListAdapter;", "Lcom/heytap/health/base/base/BaseRecyclerAdapter;", "Lcom/heytap/databaseengine/model/healtharchive/HealthIndicatorFocus;", "Lcom/heytap/health/base/base/BaseViewHolder;", BaseRecyclerViewHolder.HOLDER_TAG_HEADER, "", "position", "", MapSchema.FIELD_NAME_ENTRY, "Lcom/heytap/health/health_archives/adapter/FocusIndicatorListAdapter$a;", "listener", "setOnIndicatorClickListener", "indicatorFocus", "Landroid/text/SpannableStringBuilder;", LogFieldKey.MESSAGE_KEY, "Lcom/heytap/health/health_archives/adapter/FocusIndicatorListAdapter$a;", "mOnIndicatorClickListener", "", "data", "<init>", "(Ljava/util/List;)V", "a", "health_archives_release"}, k = 1, mv = {1, 8, 0})
public final class FocusIndicatorListAdapter extends BaseRecyclerAdapter<HealthIndicatorFocus> {

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    @Nullable
    public a mOnIndicatorClickListener;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¨\u0006\u0006"}, d2 = {"Lcom/heytap/health/health_archives/adapter/FocusIndicatorListAdapter$a;", "", "", "indicatorName", "", "a", "health_archives_release"}, k = 1, mv = {1, 8, 0})
    public interface a {
        void a(@NotNull String indicatorName);
    }

    @Metadata(d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¨\u0006\t"}, d2 = {"com/heytap/health/health_archives/adapter/FocusIndicatorListAdapter$b", "Landroid/text/style/ClickableSpan;", "Landroid/view/View;", "widget", "", ParserTag.TAG_ONCLICK, "Landroid/text/TextPaint;", "ds", "updateDrawState", "health_archives_release"}, k = 1, mv = {1, 8, 0})
    public static final class b extends ClickableSpan {

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final /* synthetic */ HealthIndicatorFocus f4310j;

        public b(HealthIndicatorFocus healthIndicatorFocus) {
            this.f4310j = healthIndicatorFocus;
        }

        @Override // android.text.style.ClickableSpan
        public void onClick(@NotNull View widget) {
            Intrinsics.checkNotNullParameter(widget, "widget");
            a aVar = FocusIndicatorListAdapter.this.mOnIndicatorClickListener;
            if (aVar != null) {
                aVar.a(this.f4310j.getName());
            }
        }

        @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
        public void updateDrawState(@NotNull TextPaint ds) {
            Intrinsics.checkNotNullParameter(ds, "ds");
            ds.setColor(qtf.d().getColor(R$color.health_archives_0066FF));
            ds.setUnderlineText(false);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FocusIndicatorListAdapter(@NotNull List<HealthIndicatorFocus> data) {
        super(data, R$layout.health_archives_focus_indicator_item);
        Intrinsics.checkNotNullParameter(data, "data");
    }

    @Override // com.heytap.health.base.base.BaseRecyclerAdapter
    public void e(@NotNull BaseViewHolder holder, int position) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        AppCompatTextView appCompatTextView = (AppCompatTextView) holder.getView(R$id.tv_indicator_focus);
        appCompatTextView.setMovementMethod(LinkMovementMethod.getInstance());
        HealthIndicatorFocus healthIndicatorFocus = getData().get(position);
        Intrinsics.checkNotNullExpressionValue(healthIndicatorFocus, "data[position]");
        appCompatTextView.setText(m(healthIndicatorFocus));
    }

    public final SpannableStringBuilder m(HealthIndicatorFocus indicatorFocus) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) indicatorFocus.getName());
        spannableStringBuilder.append((CharSequence) indicatorFocus.getSummary());
        spannableStringBuilder.setSpan(new b(indicatorFocus), 0, indicatorFocus.getName().length(), 33);
        return spannableStringBuilder;
    }

    public final void setOnIndicatorClickListener(@NotNull a listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.mOnIndicatorClickListener = listener;
    }
}
