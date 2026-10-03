package com.heytap.store.base.widget.refresh.foot;

import android.graphics.Color;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.RecyclerView;
import com.heytap.store.base.widget.R;
import com.heytap.store.base.widget.refresh.foot.LoadMoreFootViewHold;
import com.heytap.store.base.widget.theme.OnThemeChangedListener;
import com.sensorsdata.analytics.android.autotrack.aop.SensorsDataAutoTrackHelper;
import com.sensorsdata.analytics.android.sdk.SensorsDataInstrumented;
import org.hapjs.card.sdk.CardServiceDelegator;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\b\u0018\u00002\u00020\u00012\u00020\u0002:\u0001*B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\u0016\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\tJ\u0006\u0010\u001e\u001a\u00020\u001cJ\u0012\u0010\u001f\u001a\u00020\u001c2\b\u0010 \u001a\u0004\u0018\u00010!H\u0016J\u0018\u0010\"\u001a\u00020#2\b\u0010 \u001a\u0004\u0018\u00010!2\u0006\u0010$\u001a\u00020#J\u0010\u0010%\u001a\u00020\u001c2\u0006\u0010&\u001a\u00020#H\u0002J\u0006\u0010'\u001a\u00020\tJ\u0006\u0010(\u001a\u00020\u001cJ\b\u0010)\u001a\u00020\u001cH\u0002R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R$\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\t@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u000e\u0010\u0015\u001a\u00020\u0016X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0018X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u0016X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u0016X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006+"}, d2 = {"Lcom/heytap/store/base/widget/refresh/foot/LoadMoreFootViewHold;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "Lcom/heytap/store/base/widget/theme/OnThemeChangedListener;", "itemView", "Landroid/view/View;", "(Landroid/view/View;)V", "currentType", "Lcom/heytap/store/base/widget/refresh/foot/LoadMoreFootViewHold$LoadType;", "value", "", "hasMore", "getHasMore", "()Z", "setHasMore", "(Z)V", "loadFailClickListener", "Lcom/heytap/store/base/widget/refresh/foot/OnLoadFailClickListener;", "getLoadFailClickListener", "()Lcom/heytap/store/base/widget/refresh/foot/OnLoadFailClickListener;", "setLoadFailClickListener", "(Lcom/heytap/store/base/widget/refresh/foot/OnLoadFailClickListener;)V", "mLoadMoreFailTip", "Landroid/widget/TextView;", "mLoadTips", "Landroid/widget/LinearLayout;", "mLoading", "mNoMoreTips", "finishLoadMore", "", "loadMoreSuccess", "loadMoreFail", "onTextColorChanged", "color", "", "parseColorSafely", "", "default", "setTextsColor", CardServiceDelegator.KEY_COLOR_INT, "shouldLoading", "startLoading", "updateState", "LoadType", "Widget_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final class LoadMoreFootViewHold extends RecyclerView.ViewHolder implements OnThemeChangedListener {

    @NotNull
    private LoadType currentType;
    private boolean hasMore;

    @Nullable
    private OnLoadFailClickListener loadFailClickListener;

    @NotNull
    private final TextView mLoadMoreFailTip;

    @NotNull
    private final LinearLayout mLoadTips;

    @NotNull
    private final TextView mLoading;

    @NotNull
    private final TextView mNoMoreTips;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/heytap/store/base/widget/refresh/foot/LoadMoreFootViewHold$LoadType;", "", "(Ljava/lang/String;I)V", "TYPE_NONE", "TYPE_LOAD_MORE_ING", "TYPE_LOAD_FAIL", "Widget_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public enum LoadType {
        TYPE_NONE,
        TYPE_LOAD_MORE_ING,
        TYPE_LOAD_FAIL
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LoadMoreFootViewHold(@NotNull View itemView) {
        super(itemView);
        Intrinsics.checkNotNullParameter(itemView, "itemView");
        this.hasMore = true;
        this.currentType = LoadType.TYPE_NONE;
        View viewFindViewById = itemView.findViewById(R.id.tv_load_tips);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "itemView.findViewById(R.id.tv_load_tips)");
        this.mLoadTips = (LinearLayout) viewFindViewById;
        View viewFindViewById2 = itemView.findViewById(R.id.tv_loading_text);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "itemView.findViewById(R.id.tv_loading_text)");
        this.mLoading = (TextView) viewFindViewById2;
        View viewFindViewById3 = itemView.findViewById(R.id.tv_load_end_tips);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "itemView.findViewById(R.id.tv_load_end_tips)");
        this.mNoMoreTips = (TextView) viewFindViewById3;
        View viewFindViewById4 = itemView.findViewById(R.id.tv_load_fail_tips);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById4, "itemView.findViewById(R.id.tv_load_fail_tips)");
        TextView textView = (TextView) viewFindViewById4;
        this.mLoadMoreFailTip = textView;
        textView.setOnClickListener(new View.OnClickListener() { // from class: com.oplus.aiunit.vision.e3b
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                LoadMoreFootViewHold.m4815_init_$lambda0(this.i, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    @SensorsDataInstrumented
    /* JADX INFO: renamed from: _init_$lambda-0, reason: not valid java name */
    public static final void m4815_init_$lambda0(LoadMoreFootViewHold this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (this$0.hasMore) {
            OnLoadFailClickListener onLoadFailClickListener = this$0.loadFailClickListener;
            if (onLoadFailClickListener != null) {
                onLoadFailClickListener.onClick(this$0);
            }
        } else {
            this$0.currentType = LoadType.TYPE_NONE;
            this$0.updateState();
        }
        SensorsDataAutoTrackHelper.trackViewOnClick(view);
    }

    private final void setTextsColor(int colorInt) {
        this.mLoading.setTextColor(colorInt);
        this.mNoMoreTips.setTextColor(colorInt);
        this.mLoadMoreFailTip.setTextColor(colorInt);
    }

    private final void updateState() {
        if (this.currentType == LoadType.TYPE_LOAD_FAIL) {
            this.mLoadMoreFailTip.setVisibility(0);
            this.mLoadTips.setVisibility(8);
            this.mNoMoreTips.setVisibility(8);
            return;
        }
        this.mLoadMoreFailTip.setVisibility(8);
        if (this.hasMore) {
            this.mNoMoreTips.setVisibility(8);
            this.mLoadTips.setVisibility(0);
        } else {
            this.mLoadTips.setVisibility(8);
            this.mNoMoreTips.setVisibility(0);
        }
    }

    public final void finishLoadMore(boolean loadMoreSuccess, boolean hasMore) {
        LoadType loadType;
        setHasMore(hasMore);
        if (hasMore) {
            loadType = loadMoreSuccess ? LoadType.TYPE_NONE : LoadType.TYPE_LOAD_FAIL;
        } else {
            loadType = LoadType.TYPE_LOAD_MORE_ING;
        }
        this.currentType = loadType;
        updateState();
    }

    public final boolean getHasMore() {
        return this.hasMore;
    }

    @Nullable
    public final OnLoadFailClickListener getLoadFailClickListener() {
        return this.loadFailClickListener;
    }

    public final void loadMoreFail() {
        finishLoadMore(false, this.hasMore);
    }

    @Override // com.heytap.store.base.widget.theme.OnThemeChangedListener
    public void onTextColorChanged(@Nullable String color) {
        setTextsColor(parseColorSafely(color, ContextCompat.getColor(this.itemView.getContext(), R.color.black_alpha_30)));
    }

    public final int parseColorSafely(@Nullable String color, int i) {
        try {
            return Color.parseColor(color);
        } catch (Exception unused) {
            return i;
        }
    }

    public final void setHasMore(boolean z) {
        if (this.hasMore != z) {
            this.hasMore = z;
            if (!z && this.currentType == LoadType.TYPE_LOAD_FAIL) {
                this.currentType = LoadType.TYPE_NONE;
            }
            updateState();
        }
    }

    public final void setLoadFailClickListener(@Nullable OnLoadFailClickListener onLoadFailClickListener) {
        this.loadFailClickListener = onLoadFailClickListener;
    }

    public final boolean shouldLoading() {
        return this.currentType == LoadType.TYPE_NONE && this.hasMore;
    }

    public final void startLoading() {
        if (this.hasMore) {
            this.currentType = LoadType.TYPE_LOAD_MORE_ING;
            updateState();
        }
    }
}
