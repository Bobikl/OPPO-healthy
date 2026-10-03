package com.heytap.store.business.component.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import com.heytap.store.apm.PageTrackBean;
import com.heytap.store.base.core.util.statistics.bean.SensorsBean;
import com.heytap.store.business.component.utils.LoadPageStatusData;
import com.heytap.store.business.component.utils.LoadPageTimeRecordManager;
import com.heytap.store.business.component.utils.statictis.OStoreComponentReportUtilKt;
import java.util.LinkedHashMap;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.JvmOverloads;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B%\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u0012\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u0014J\b\u0010\u0011\u001a\u00020\u000eH\u0002R\u000e\u0010\t\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"Lcom/heytap/store/business/component/widget/HomeRootLoadCollectViewGroup;", "Landroid/widget/FrameLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defaultStyle", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", SensorsBean.PAGE_CACHE_RENDER_TIME, "", SensorsBean.PAGE_DATA_RENDER_TIME, SensorsBean.PAGE_FIRST_RENDER_TIME, "dispatchDraw", "", "canvas", "Landroid/graphics/Canvas;", PageTrackBean.PAGE_END, "widget_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final class HomeRootLoadCollectViewGroup extends FrameLayout {

    @NotNull
    public Map<Integer, View> _$_findViewCache;
    private long cacheRenderTime;
    private long dataRenderTime;
    private long firstRenderTime;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public HomeRootLoadCollectViewGroup(@NotNull Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    private final void pageEnd() {
        LoadPageStatusData value;
        Object tag = getTag();
        String str = tag instanceof String ? (String) tag : null;
        if (str == null || str.length() == 0) {
            return;
        }
        LoadPageTimeRecordManager loadPageTimeRecordManager = LoadPageTimeRecordManager.INSTANCE;
        if (!loadPageTimeRecordManager.isHaveKey(str) || (value = loadPageTimeRecordManager.getValue(str)) == null || value.isReport()) {
            return;
        }
        if (this.firstRenderTime == 0) {
            this.firstRenderTime = System.currentTimeMillis() - value.getStartTime();
            return;
        }
        if (value.isCacheLoad()) {
            this.cacheRenderTime = (System.currentTimeMillis() - value.getStartTime()) - this.firstRenderTime;
        } else if (value.isOnLineDate()) {
            this.dataRenderTime = ((System.currentTimeMillis() - value.getStartTime()) - this.firstRenderTime) - this.cacheRenderTime;
        }
        if (!value.isLoadComplete() || value.isReport()) {
            return;
        }
        if (value.getPage_name().length() > 0) {
            value.setReport(true);
            OStoreComponentReportUtilKt.reportLoadPageData(value.getPage_name(), this.firstRenderTime, this.cacheRenderTime, this.dataRenderTime, loadPageTimeRecordManager.getNetworkLoadTime(str), value.isNetWorkSuccess(), value.getApiUrl());
        }
    }

    public void _$_clearFindViewByIdCache() {
        this._$_findViewCache.clear();
    }

    @Nullable
    public View _$_findCachedViewById(int i) {
        Map<Integer, View> map = this._$_findViewCache;
        View view = map.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View viewFindViewById = findViewById(i);
        if (viewFindViewById == null) {
            return null;
        }
        map.put(Integer.valueOf(i), viewFindViewById);
        return viewFindViewById;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(@Nullable Canvas canvas) {
        super.dispatchDraw(canvas);
        pageEnd();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public HomeRootLoadCollectViewGroup(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public /* synthetic */ HomeRootLoadCollectViewGroup(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public HomeRootLoadCollectViewGroup(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        this._$_findViewCache = new LinkedHashMap();
    }
}
