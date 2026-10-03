package com.heytap.store.business.component.widget.hotzone;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.appcompat.widget.AppCompatImageView;
import com.bumptech.glide.a;
import com.heytap.nearx.tangramconfig.strategy.Fields;
import com.heytap.store.base.core.util.ImageSizeUtil;
import com.heytap.store.business.component.entity.HotZoneCarouserEntity;
import com.heytap.store.business.component.entity.HotZoneItemEntity;
import com.heytap.store.business.component.entity.HotZonePicEntity;
import com.heytap.store.business.component.view.OStoreReserveView;
import com.heytap.store.business.component.widget.OStoreProductBannerView;
import com.heytap.store.platform.imageloader.ImageLoader;
import com.heytap.store.platform.imageloader.LoadStep;
import com.heytap.store.platform.tools.LogUtils;
import com.oplus.aiunit.vision.eg4;
import com.oplus.aiunit.vision.oak;
import com.oplus.drs.core.config.entity.DebugModeEntity;
import com.oplus.smartenginehelper.entity.ClickApiEntity;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Lazy;
import p010kotlin.LazyKt__LazyJVMKt;
import p010kotlin.Metadata;
import p010kotlin.Unit;
import p010kotlin.jvm.JvmOverloads;
import p010kotlin.jvm.functions.Function0;
import p010kotlin.jvm.functions.Function1;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\b\u0018\u00002\u00020\u0001B%\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\b\u0010 \u001a\u00020\u000bH\u0002J\u0014\u0010!\u001a\u00020\u000b2\f\u0010\"\u001a\b\u0012\u0004\u0012\u00020$0#J\u0014\u0010%\u001a\u00020\u000b2\f\u0010&\u001a\b\u0012\u0004\u0012\u00020'0#J\u001a\u0010(\u001a\u0004\u0018\u00010\u001b2\u0006\u0010)\u001a\u00020\u00172\u0006\u0010*\u001a\u00020\u0017H\u0002J\u0010\u0010+\u001a\u00020,2\u0006\u0010-\u001a\u00020.H\u0016J\u0006\u0010/\u001a\u00020\u000bJ\u0006\u00100\u001a\u00020\u000bJ\u0012\u00101\u001a\u00020\u000b2\b\u00102\u001a\u0004\u0018\u000103H\u0002J\u0016\u00104\u001a\u00020\u000b2\u0006\u00105\u001a\u00020\u00072\u0006\u00106\u001a\u00020\u0007J8\u00107\u001a\u00020\u000b2\b\u00102\u001a\u0004\u0018\u0001032\u000e\u00108\u001a\n\u0012\u0004\u0012\u00020\u001b\u0018\u00010#2\u0016\b\u0002\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u000b\u0018\u00010\nJ\u0006\u00109\u001a\u00020\u000bJ\u0006\u0010:\u001a\u00020\u000bR(\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u000b\u0018\u00010\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u000e\u0010\u0016\u001a\u00020\u0017X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0017X\u0082\u000e¢\u0006\u0002\n\u0000R!\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001a8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b\u001c\u0010\u001d¨\u0006;"}, d2 = {"Lcom/heytap/store/business/component/widget/hotzone/HotZoneLayout;", "Landroid/widget/FrameLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defaultStyle", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "areaClickCallback", "Lkotlin/Function1;", "", "getAreaClickCallback", "()Lkotlin/jvm/functions/Function1;", "setAreaClickCallback", "(Lkotlin/jvm/functions/Function1;)V", "bgImg", "Landroidx/appcompat/widget/AppCompatImageView;", "getBgImg", "()Landroidx/appcompat/widget/AppCompatImageView;", "setBgImg", "(Landroidx/appcompat/widget/AppCompatImageView;)V", "downX", "", "downY", "mHotZoneClickAreaLists", "", "Lcom/heytap/store/business/component/entity/HotZoneItemEntity;", "getMHotZoneClickAreaLists", "()Ljava/util/List;", "mHotZoneClickAreaLists$delegate", "Lkotlin/Lazy;", "addBackGroundView", "addCarouserView", "lists", "", "Lcom/heytap/store/business/component/entity/HotZoneCarouserEntity;", "addPicView", "picLists", "Lcom/heytap/store/business/component/entity/HotZonePicEntity;", "checkIsHaveHotZoneArea", "x", "y", "onTouchEvent", "", "event", "Landroid/view/MotionEvent;", "removeAllReserveBtn", "reset", ClickApiEntity.SET_BACKGROUND, "url", "", "setBackgroundParams", Fields.WIDTH_FIELD, Fields.HEIGHT_FIELD, "setData", "areaClickLists", "startBanner", "stopBanner", "widget_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final class HotZoneLayout extends FrameLayout {

    @NotNull
    public Map<Integer, View> _$_findViewCache;

    @Nullable
    private Function1<? super Integer, Unit> areaClickCallback;

    @Nullable
    private AppCompatImageView bgImg;
    private float downX;
    private float downY;

    /* JADX INFO: renamed from: mHotZoneClickAreaLists$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy mHotZoneClickAreaLists;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public HotZoneLayout(@NotNull Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    private final void addBackGroundView() {
        AppCompatImageView appCompatImageView = new AppCompatImageView(getContext());
        this.bgImg = appCompatImageView;
        appCompatImageView.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        AppCompatImageView appCompatImageView2 = this.bgImg;
        if (appCompatImageView2 != null) {
            appCompatImageView2.setScaleType(ImageView.ScaleType.CENTER_CROP);
        }
        addView(this.bgImg);
    }

    private final HotZoneItemEntity checkIsHaveHotZoneArea(float x, float y) {
        List<HotZoneItemEntity> mHotZoneClickAreaLists = getMHotZoneClickAreaLists();
        int i = 0;
        HotZoneItemEntity hotZoneItemEntity = null;
        if (mHotZoneClickAreaLists == null || mHotZoneClickAreaLists.isEmpty()) {
            return null;
        }
        int size = getMHotZoneClickAreaLists().size();
        while (i < size) {
            int i2 = i + 1;
            HotZoneItemEntity hotZoneItemEntity2 = getMHotZoneClickAreaLists().get(i);
            LogUtils logUtils = LogUtils.INSTANCE;
            logUtils.e(DebugModeEntity.KEY_AREA, "x:" + x + "--y:" + y);
            logUtils.e(DebugModeEntity.KEY_AREA, hotZoneItemEntity2.getStartX() + "---" + hotZoneItemEntity2.getStartY() + "---" + hotZoneItemEntity2.getEndX() + "-----" + hotZoneItemEntity2.getEndY());
            if (x >= hotZoneItemEntity2.getStartX() && x <= hotZoneItemEntity2.getEndX() && y >= hotZoneItemEntity2.getStartY() && y <= hotZoneItemEntity2.getEndY() && (hotZoneItemEntity == null || hotZoneItemEntity2.getLevel() > hotZoneItemEntity.getLevel())) {
                hotZoneItemEntity = hotZoneItemEntity2;
            }
            i = i2;
        }
        return hotZoneItemEntity;
    }

    private final List<HotZoneItemEntity> getMHotZoneClickAreaLists() {
        return (List) this.mHotZoneClickAreaLists.getValue();
    }

    private final void setBackground(String url) {
        AppCompatImageView appCompatImageView = this.bgImg;
        if (appCompatImageView == null) {
            return;
        }
        if (url == null) {
            url = "";
        }
        ImageLoader.load(url, appCompatImageView);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void setData$default(HotZoneLayout hotZoneLayout, String str, List list, Function1 function1, int i, Object obj) {
        if ((i & 4) != 0) {
            function1 = null;
        }
        hotZoneLayout.setData(str, list, function1);
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

    public final void addCarouserView(@NotNull List<HotZoneCarouserEntity> lists) {
        Intrinsics.checkNotNullParameter(lists, "lists");
        ArrayList<OStoreProductBannerView> arrayList = new ArrayList();
        int childCount = getChildCount();
        int i = 0;
        while (i < childCount) {
            int i2 = i + 1;
            if (getChildAt(i) instanceof OStoreProductBannerView) {
                View childAt = getChildAt(i);
                if (childAt == null) {
                    throw new NullPointerException("null cannot be cast to non-null type com.heytap.store.business.component.widget.OStoreProductBannerView");
                }
                arrayList.add((OStoreProductBannerView) childAt);
            }
            i = i2;
        }
        for (OStoreProductBannerView oStoreProductBannerView : arrayList) {
            oStoreProductBannerView.recycle();
            removeView(oStoreProductBannerView);
        }
        for (HotZoneCarouserEntity hotZoneCarouserEntity : lists) {
            List<String> urlLists = hotZoneCarouserEntity.getUrlLists();
            if (!(urlLists == null || urlLists.isEmpty())) {
                FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(hotZoneCarouserEntity.getViewWidth(), hotZoneCarouserEntity.getViewWidth());
                layoutParams.leftMargin = (int) hotZoneCarouserEntity.getStartX();
                layoutParams.topMargin = (int) hotZoneCarouserEntity.getStartY();
                Context context = getContext();
                Intrinsics.checkNotNullExpressionValue(context, "this.context");
                OStoreProductBannerView oStoreProductBannerView2 = new OStoreProductBannerView(context, null, 0, 6, null);
                oStoreProductBannerView2.setLayoutParams(layoutParams);
                oStoreProductBannerView2.setBannerData(hotZoneCarouserEntity.getUrlLists());
                addView(oStoreProductBannerView2);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:27:0x006d  */
    public final void addPicView(@NotNull List<HotZonePicEntity> picLists) {
        boolean z;
        Intrinsics.checkNotNullParameter(picLists, "picLists");
        ArrayList arrayList = new ArrayList();
        int childCount = getChildCount();
        int i = 0;
        while (i < childCount) {
            int i2 = i + 1;
            if (getChildAt(i) instanceof HotZonePicImageView) {
                View childAt = getChildAt(i);
                if (childAt == null) {
                    throw new NullPointerException("null cannot be cast to non-null type com.heytap.store.business.component.widget.hotzone.HotZonePicImageView");
                }
                arrayList.add((HotZonePicImageView) childAt);
            }
            i = i2;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            removeView((HotZonePicImageView) it.next());
        }
        for (final HotZonePicEntity hotZonePicEntity : picLists) {
            String url = hotZonePicEntity.getUrl();
            if (url != null) {
                int[] imageSize = ImageSizeUtil.getImageSize(url);
                if (imageSize[0] != 0) {
                    z = imageSize[1] != 0;
                }
                if (z) {
                    FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(hotZonePicEntity.getImgWidth(), hotZonePicEntity.getImgHeight());
                    layoutParams.leftMargin = (int) hotZonePicEntity.getStartX();
                    layoutParams.topMargin = (int) hotZonePicEntity.getStartY();
                    Context context = getContext();
                    Intrinsics.checkNotNullExpressionValue(context, "this.context");
                    HotZonePicImageView hotZonePicImageView = new HotZonePicImageView(context, null, 0, 6, null);
                    hotZonePicImageView.setLayoutParams(layoutParams);
                    LoadStep.into$default(ImageLoader.load(url), hotZonePicImageView, null, 2, null);
                    addView(hotZonePicImageView);
                } else {
                    FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(hotZonePicEntity.getImgWidth(), -2);
                    layoutParams2.leftMargin = (int) hotZonePicEntity.getStartX();
                    layoutParams2.topMargin = (int) hotZonePicEntity.getStartY();
                    Context context2 = getContext();
                    Intrinsics.checkNotNullExpressionValue(context2, "this.context");
                    final HotZonePicImageView hotZonePicImageView2 = new HotZonePicImageView(context2, null, 0, 6, null);
                    hotZonePicImageView2.setLayoutParams(layoutParams2);
                    a.v(getContext()).b().Y0(url).N0(new eg4<Bitmap>() { // from class: com.heytap.store.business.component.widget.hotzone.HotZoneLayout$addPicView$2$1$1
                        @Override // com.oplus.aiunit.vision.boj
                        public void onLoadCleared(@Nullable Drawable placeholder) {
                        }

                        @Override // com.oplus.aiunit.vision.boj
                        public /* bridge */ /* synthetic */ void onResourceReady(Object obj, oak oakVar) {
                            onResourceReady((Bitmap) obj, (oak<? super Bitmap>) oakVar);
                        }

                        public void onResourceReady(@NotNull Bitmap resource, @Nullable oak<? super Bitmap> transition) {
                            Intrinsics.checkNotNullParameter(resource, "resource");
                            hotZonePicImageView2.setImageBitmap(resource);
                            int width = resource.getWidth();
                            int height = resource.getHeight();
                            ViewGroup.LayoutParams layoutParams3 = hotZonePicImageView2.getLayoutParams();
                            if (width != 0) {
                                layoutParams3.width = hotZonePicEntity.getImgWidth();
                                layoutParams3.height = (hotZonePicEntity.getImgWidth() * height) / width;
                                hotZonePicImageView2.setLayoutParams(layoutParams3);
                            }
                        }
                    });
                    addView(hotZonePicImageView2);
                }
            }
        }
    }

    @Nullable
    public final Function1<Integer, Unit> getAreaClickCallback() {
        return this.areaClickCallback;
    }

    @Nullable
    public final AppCompatImageView getBgImg() {
        return this.bgImg;
    }

    @Override // android.view.View
    public boolean onTouchEvent(@NotNull MotionEvent event) {
        HotZoneItemEntity hotZoneItemEntityCheckIsHaveHotZoneArea;
        Function1<Integer, Unit> areaClickCallback;
        Intrinsics.checkNotNullParameter(event, "event");
        int action = event.getAction();
        if (action == 0) {
            this.downX = event.getX();
            this.downY = event.getY();
            LogUtils.INSTANCE.e("actionDown", "x:" + event.getX() + "--y:" + event.getY() + "-------HotZone:" + getX() + "----" + getY());
        } else if (action == 1) {
            float x = event.getX();
            float y = event.getY();
            LogUtils.INSTANCE.e("actionUp", "x:" + event.getX() + "--y:" + event.getY() + "-------HotZone:" + x + "----" + y);
            if (Math.abs(x - this.downX) < 10.0f && Math.abs(y - this.downY) < 10.0f && (hotZoneItemEntityCheckIsHaveHotZoneArea = checkIsHaveHotZoneArea(x, y)) != null && (areaClickCallback = getAreaClickCallback()) != null) {
                areaClickCallback.invoke(Integer.valueOf(hotZoneItemEntityCheckIsHaveHotZoneArea.getOriginalPosition()));
            }
        }
        return true;
    }

    public final void removeAllReserveBtn() {
        if (getChildCount() != 0) {
            ArrayList arrayList = new ArrayList();
            int childCount = getChildCount();
            int i = 0;
            while (i < childCount) {
                int i2 = i + 1;
                View childAt = getChildAt(i);
                OStoreReserveView oStoreReserveView = childAt instanceof OStoreReserveView ? (OStoreReserveView) childAt : null;
                if (oStoreReserveView != null) {
                    arrayList.add(oStoreReserveView);
                }
                i = i2;
            }
            if (arrayList.size() != 0) {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    removeView((OStoreReserveView) it.next());
                }
            }
        }
    }

    public final void reset() {
        int childCount = getChildCount();
        int i = 0;
        while (i < childCount) {
            int i2 = i + 1;
            if (getChildAt(i) instanceof OStoreProductBannerView) {
                View childAt = getChildAt(i);
                if (childAt == null) {
                    throw new NullPointerException("null cannot be cast to non-null type com.heytap.store.business.component.widget.OStoreProductBannerView");
                }
                ((OStoreProductBannerView) childAt).reset();
            }
            i = i2;
        }
    }

    public final void setAreaClickCallback(@Nullable Function1<? super Integer, Unit> function1) {
        this.areaClickCallback = function1;
    }

    public final void setBackgroundParams(int width, int height) {
        AppCompatImageView appCompatImageView = this.bgImg;
        ViewGroup.LayoutParams layoutParams = appCompatImageView == null ? null : appCompatImageView.getLayoutParams();
        if (layoutParams != null) {
            layoutParams.width = width;
        }
        AppCompatImageView appCompatImageView2 = this.bgImg;
        ViewGroup.LayoutParams layoutParams2 = appCompatImageView2 != null ? appCompatImageView2.getLayoutParams() : null;
        if (layoutParams2 == null) {
            return;
        }
        layoutParams2.height = height;
    }

    public final void setBgImg(@Nullable AppCompatImageView appCompatImageView) {
        this.bgImg = appCompatImageView;
    }

    public final void setData(@Nullable String url, @Nullable List<HotZoneItemEntity> areaClickLists, @Nullable Function1<? super Integer, Unit> areaClickCallback) {
        this.areaClickCallback = areaClickCallback;
        setBackground(url);
        getMHotZoneClickAreaLists().clear();
        List<HotZoneItemEntity> list = areaClickLists;
        if (list == null || list.isEmpty()) {
            return;
        }
        getMHotZoneClickAreaLists().addAll(list);
    }

    public final void startBanner() {
        int childCount = getChildCount();
        int i = 0;
        while (i < childCount) {
            int i2 = i + 1;
            if (getChildAt(i) instanceof OStoreProductBannerView) {
                View childAt = getChildAt(i);
                if (childAt == null) {
                    throw new NullPointerException("null cannot be cast to non-null type com.heytap.store.business.component.widget.OStoreProductBannerView");
                }
                ((OStoreProductBannerView) childAt).startBanner();
            }
            i = i2;
        }
    }

    public final void stopBanner() {
        int childCount = getChildCount();
        int i = 0;
        while (i < childCount) {
            int i2 = i + 1;
            if (getChildAt(i) instanceof OStoreProductBannerView) {
                View childAt = getChildAt(i);
                if (childAt == null) {
                    throw new NullPointerException("null cannot be cast to non-null type com.heytap.store.business.component.widget.OStoreProductBannerView");
                }
                ((OStoreProductBannerView) childAt).stopBanner();
            }
            i = i2;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public HotZoneLayout(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public /* synthetic */ HotZoneLayout(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public HotZoneLayout(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        addBackGroundView();
        this.mHotZoneClickAreaLists = LazyKt__LazyJVMKt.lazy(new Function0<List<HotZoneItemEntity>>() { // from class: com.heytap.store.business.component.widget.hotzone.HotZoneLayout$mHotZoneClickAreaLists$2
            @Override // p010kotlin.jvm.functions.Function0
            @NotNull
            public final List<HotZoneItemEntity> invoke() {
                return new ArrayList();
            }
        });
        this._$_findViewCache = new LinkedHashMap();
    }
}
