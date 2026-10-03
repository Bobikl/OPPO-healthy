package com.coui.appcompat.panel;

import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.ViewOutlineProvider;
import android.view.WindowInsets;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.coui.appcompat.grid.COUIPercentWidthFrameLayout;
import com.coui.appcompat.grid.COUIResponsiveUtils;
import com.oplus.aiunit.vision.bj2;
import com.oplus.aiunit.vision.bn2;
import com.oplus.aiunit.vision.byf;
import com.oplus.aiunit.vision.ifk;
import com.oplus.aiunit.vision.lh2;
import com.oplus.aiunit.vision.xl2;
import com.oplus.graphics.OplusOutline;
import com.oplus.graphics.OplusOutlineAdapter;
import com.support.appcompat.R$attr;
import com.support.panel.R$dimen;
import com.support.panel.R$styleable;

/* JADX INFO: loaded from: classes13.dex */
public class COUIPanelPercentFrameLayout extends COUIPercentWidthFrameLayout {
    public static final float MEDIUM_AND_LARGE_SCREEN = 2.0f;
    private static final float OS_16_1_WEIGHT = 3.0f;
    public static final float SMALL_SCREEN = 1.0f;
    private static final String TAG = "COUIPanelPercentFrameLayout";
    private static final int UNSET_WIDTH = -1;
    private Bitmap mBitmap;
    private int mBottomDiff;
    private final Paint mClipPaint;
    private boolean mHasAnchor;
    private boolean mIsHandlePanel;
    private boolean mIsSupportSmoothRoundCorner;
    private int mMaxHeight;
    private int mMaxHeightOfAttr;
    private int mMaxWidth;
    private final Rect mMeasureRect;
    private Rect mOplusOutLineRect;
    private OplusOutlineAdapter mOplusOutline;
    private ViewOutlineProvider mOutlineProvider;
    private final Path mPath;
    private int mPreferWidth;
    private float mRadius;
    private int mRadius28dpForOS16_1;
    private float mRatio;
    private final RectF mRectF;
    private float mWeight;

    public COUIPanelPercentFrameLayout(@NonNull Context context) {
        this(context, null);
    }

    private Bitmap createClipSmoothRoundBitmap() {
        if (this.mRectF.width() <= 0.0f || this.mRectF.height() <= 0.0f) {
            bj2.d(TAG, "createClipSmoothRoundBitmap return for width and height must be > 0");
            return null;
        }
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap((int) this.mRectF.width(), (int) this.mRectF.height(), Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        Paint paint = new Paint(1);
        paint.setColor(-1);
        canvas.drawPath(this.mPath, paint);
        return bitmapCreateBitmap;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void enforceChangeScreenWidth() {
        if (this.mPreferWidth == -1) {
            return;
        }
        try {
            Resources resources = getContext().getResources();
            Configuration configuration = resources.getConfiguration();
            int i = configuration.screenWidthDp;
            int i2 = this.mPreferWidth;
            if (i == i2) {
                return;
            }
            configuration.screenWidthDp = i2;
            resources.updateConfiguration(configuration, resources.getDisplayMetrics());
            Log.d(TAG, "enforceChangeScreenWidth : PreferWidth:" + this.mPreferWidth);
        } catch (Exception unused) {
            Log.d(TAG, "enforceChangeScreenWidth : failed to updateConfiguration");
        }
    }

    private void initAttr(AttributeSet attributeSet) {
        boolean z = false;
        if (getContext() != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, R$styleable.COUIPanelPercentFrameLayout);
            this.mMaxHeight = typedArrayObtainStyledAttributes.getDimensionPixelOffset(R$styleable.COUIPanelPercentFrameLayout_maxPanelHeight, 0);
            typedArrayObtainStyledAttributes.recycle();
        }
        this.mMaxHeightOfAttr = this.mMaxHeight;
        this.mRadius28dpForOS16_1 = getResources().getDimensionPixelSize(R$dimen.coui_panel_os_16_1_radius_28_dp);
        this.mRatio = COUIPanelMultiWindowUtils.isSmallScreen(getContext(), null) ? 1.0f : 2.0f;
        if (byf.c() && byf.d()) {
            z = true;
        }
        this.mIsSupportSmoothRoundCorner = z;
        if (!z) {
            this.mRadius = lh2.c(getContext(), R$attr.couiRoundCornerXL);
            this.mWeight = 0.0f;
        } else if (byf.a() == 0) {
            this.mRadius = lh2.c(getContext(), R$attr.couiRoundCornerXLRadius);
            this.mWeight = lh2.e(getContext(), R$attr.couiRoundCornerXLWeight);
        } else if (byf.a() == 1) {
            this.mRadius = lh2.c(getContext(), R$attr.couiRoundCornerXL);
            updateClipToOutline(true);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int updateBottomCornerRadius() {
        if (this.mIsHandlePanel) {
            return getContext().getResources().getDimensionPixelOffset(R$dimen.coui_bottom_sheet_bg_top_corner_radius);
        }
        int dimensionPixelOffset = getContext().getResources().getDimensionPixelOffset(R$dimen.coui_bottom_sheet_bg_bottom_corner_radius);
        Activity activityC = ifk.c(getContext());
        if (activityC != null) {
            int requestedOrientation = activityC.getRequestedOrientation();
            if (requestedOrientation == 1 && (activityC.getResources().getConfiguration().screenLayout & 48) == 32) {
                return getContext().getResources().getDimensionPixelOffset(R$dimen.coui_bottom_sheet_bg_top_corner_radius);
            }
            if (requestedOrientation == 0) {
                return 0;
            }
        }
        return dimensionPixelOffset;
    }

    private void updateClipToOutline(boolean z) {
        bj2.d(TAG, "updateClipToOutline setOutlineProvider=" + z);
        if (z) {
            super.setOutlineProvider(this.mOutlineProvider);
            setClipToOutline(true);
        } else {
            super.setOutlineProvider(null);
            setClipToOutline(false);
        }
    }

    private void updatePath() {
        this.mPath.reset();
        if (updateBottomCornerRadius() == 0) {
            xl2.c(this.mPath, this.mRectF, this.mRadius, this.mWeight);
        } else {
            xl2.d(this.mPath, this.mRectF, this.mRadius, this.mWeight, true, true, false, false);
        }
    }

    public void delPreferWidth() {
        this.mPreferWidth = -1;
        Log.d(TAG, "delPreferWidth");
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        if (getClipToOutline()) {
            super.draw(canvas);
            return;
        }
        if (this.mBitmap != null) {
            int iSaveLayer = canvas.saveLayer(null, null);
            super.draw(canvas);
            canvas.drawBitmap(this.mBitmap, 0.0f, 0.0f, this.mClipPaint);
            canvas.restoreToCount(iSaveLayer);
            return;
        }
        canvas.save();
        canvas.clipPath(this.mPath);
        super.draw(canvas);
        canvas.restore();
    }

    public int getGridNumber() {
        return this.mGridNumber;
    }

    public boolean getHasAnchor() {
        return this.mHasAnchor;
    }

    public int getPaddingSize() {
        return this.mPaddingSize;
    }

    public int getPaddingType() {
        return this.mPaddingType;
    }

    public float getRatio() {
        if (this.mIsHandlePanel) {
            return 1.0f;
        }
        return this.mRatio;
    }

    public boolean isIsHandlePanel() {
        return this.mIsHandlePanel;
    }

    @Override // android.view.View
    public WindowInsets onApplyWindowInsets(WindowInsets windowInsets) {
        int paddingBottom = getPaddingBottom();
        WindowInsets windowInsetsOnApplyWindowInsets = super.onApplyWindowInsets(windowInsets);
        if (paddingBottom != 0 && getPaddingBottom() == 0) {
            setPaddingRelative(getPaddingStart(), getPaddingTop(), getPaddingEnd(), paddingBottom);
        }
        return windowInsetsOnApplyWindowInsets;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.mRatio = COUIPanelMultiWindowUtils.isSmallScreen(getContext(), null) ? 1.0f : 2.0f;
    }

    @Override // com.coui.appcompat.grid.COUIPercentWidthFrameLayout, android.widget.FrameLayout, android.view.View
    public void onMeasure(int i, int i2) {
        getWindowVisibleDisplayFrame(this.mMeasureRect);
        int iHeight = this.mMeasureRect.height();
        int i3 = this.mMaxHeight;
        if (iHeight > i3 && i3 > 0 && i3 < View.MeasureSpec.getSize(i2)) {
            i2 = View.MeasureSpec.makeMeasureSpec(this.mMaxHeight, View.MeasureSpec.getMode(i2));
        }
        setPercentIndentEnabled(((!COUIPanelMultiWindowUtils.isSmallScreen(getContext(), null) && View.MeasureSpec.getSize(i) < this.mMeasureRect.width()) || COUIResponsiveUtils.isSmallScreen(getContext(), this.mMeasureRect.width()) || this.mMaxWidth != 0) ? false : true);
        int i4 = this.mMaxWidth;
        if (i4 != 0) {
            i = View.MeasureSpec.makeMeasureSpec(i4, View.MeasureSpec.getMode(i));
        }
        super.onMeasure(i, i2);
    }

    @Override // android.view.View
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        enforceChangeScreenWidth();
        if (getClipToOutline()) {
            return;
        }
        this.mRectF.set(0.0f, 0.0f, i, i2);
        updatePath();
        if (this.mIsSupportSmoothRoundCorner) {
            if (this.mBitmap != null && i == i3 && i2 == i4) {
                return;
            }
            this.mBitmap = createClipSmoothRoundBitmap();
        }
    }

    public void prepareForOutlineProvider() {
        super.setOutlineProvider(this.mOutlineProvider);
        setClipToOutline(true);
    }

    public void restoreDefaultMaxSize() {
        if (this.mMaxWidth == 0) {
            return;
        }
        this.mMaxWidth = 0;
        this.mMaxHeight = this.mMaxHeightOfAttr;
        requestLayout();
    }

    public void setHasAnchor(boolean z) {
        if (this.mHasAnchor != z) {
            this.mHasAnchor = z;
            updateClipToOutline(z);
        }
    }

    public void setIsHandlePanel(boolean z) {
        this.mIsHandlePanel = z;
    }

    public void setMaxHeight(int i) {
        if (this.mMaxHeight != i) {
            this.mMaxHeight = i;
            requestLayout();
        }
    }

    public void setMaxSize(int i, int i2) {
        if (i2 == this.mMaxHeight && i == this.mMaxWidth) {
            return;
        }
        this.mMaxWidth = i;
        this.mMaxHeight = i2;
        requestLayout();
    }

    public void setOutlineBottomOffset(int i) {
        this.mBottomDiff = i;
    }

    @Override // android.view.View
    public void setOutlineProvider(ViewOutlineProvider viewOutlineProvider) {
    }

    public void setPreferWidth(int i) {
        this.mPreferWidth = i;
        Log.d(TAG, "setPreferWidth =：" + this.mPreferWidth);
    }

    public void updateLayoutWhileConfigChange(Configuration configuration) {
        this.mRatio = COUIPanelMultiWindowUtils.isSmallScreen(getContext(), configuration) ? 1.0f : 2.0f;
    }

    public COUIPanelPercentFrameLayout(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public COUIPanelPercentFrameLayout(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.mPath = new Path();
        this.mRectF = new RectF();
        Paint paint = new Paint(1);
        this.mClipPaint = paint;
        this.mRatio = 1.0f;
        this.mHasAnchor = false;
        this.mPreferWidth = -1;
        this.mIsSupportSmoothRoundCorner = false;
        this.mBitmap = null;
        this.mOplusOutLineRect = new Rect();
        this.mOutlineProvider = new ViewOutlineProvider() { // from class: com.coui.appcompat.panel.COUIPanelPercentFrameLayout.1
            @Override // android.view.ViewOutlineProvider
            public void getOutline(View view, Outline outline) {
                COUIPanelPercentFrameLayout.this.enforceChangeScreenWidth();
                int iUpdateBottomCornerRadius = COUIPanelPercentFrameLayout.this.updateBottomCornerRadius();
                int height = view.getHeight() + COUIPanelPercentFrameLayout.this.mBottomDiff;
                if (!COUIPanelPercentFrameLayout.this.mIsSupportSmoothRoundCorner) {
                    outline.setRoundRect(0, 0, view.getWidth(), height + iUpdateBottomCornerRadius, COUIPanelPercentFrameLayout.this.mRadius);
                    return;
                }
                if (byf.a() == 0) {
                    new OplusOutline(outline).setSmoothRoundRect(0, 0, view.getWidth(), height + iUpdateBottomCornerRadius, COUIPanelPercentFrameLayout.this.mRadius, COUIPanelPercentFrameLayout.this.mWeight);
                    return;
                }
                if (byf.a() == 1) {
                    COUIPanelPercentFrameLayout.this.mOplusOutline = new OplusOutlineAdapter(outline, byf.a());
                    COUIPanelPercentFrameLayout.this.mOplusOutLineRect.left = 0;
                    COUIPanelPercentFrameLayout.this.mOplusOutLineRect.top = 0;
                    COUIPanelPercentFrameLayout.this.mOplusOutLineRect.right = view.getWidth();
                    COUIPanelPercentFrameLayout.this.mOplusOutLineRect.bottom = height + iUpdateBottomCornerRadius;
                    if (bn2.c() <= 37 || !COUIPanelPercentFrameLayout.this.mIsSupportSmoothRoundCorner) {
                        COUIPanelPercentFrameLayout.this.mOplusOutline.setSmoothRoundRect(COUIPanelPercentFrameLayout.this.mOplusOutLineRect, COUIPanelPercentFrameLayout.this.mRadius);
                    } else {
                        COUIPanelPercentFrameLayout.this.mOplusOutline.setSmoothRoundRect(COUIPanelPercentFrameLayout.this.mOplusOutLineRect, COUIPanelPercentFrameLayout.this.mRadius28dpForOS16_1, 3.0f);
                    }
                }
            }
        };
        initAttr(attributeSet);
        this.mMeasureRect = new Rect();
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_IN));
    }
}
