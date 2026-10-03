package com.heytap.wearable.support.watchface.common.vector;

import android.annotation.SuppressLint;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Xml;
import androidx.annotation.DrawableRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.collection.ArrayMap;
import androidx.core.graphics.drawable.DrawableCompat;
import com.heytap.wearable.support.watchface.common.log.SdkDebugLog;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Stack;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes2.dex */
public class VectorDrawableCompatLocal extends VectorDrawableCommonLocal {
    private static final float ALPHA_END = 255.0f;
    private static final PorterDuff.Mode DEFAULT_TINT_MODE = PorterDuff.Mode.SRC_IN;
    private static final float END = 1.0f;
    private static final int LINE_CAP_BUTT = 0;
    private static final int LINE_CAP_ROUND = 1;
    private static final int LINE_CAP_SQUARE = 2;
    private static final int LINE_JOIN_BEVEL = 2;
    private static final int LINE_JOIN_MITER = 0;
    private static final int LINE_JOIN_ROUND = 1;
    private static final int MAX_CACHED_BITMAP_SIZE = 2048;
    private static final int MODE_14 = 14;
    private static final int MODE_15 = 15;
    private static final int MODE_16 = 16;
    private static final int MODE_3 = 3;
    private static final int MODE_5 = 5;
    private static final int MODE_9 = 9;
    private static final float SCALE_END = 1.0f;
    private static final String SHAPE_CLIP_PATH = "clip-path";
    private static final String SHAPE_GROUP = "group";
    private static final String SHAPE_PATH = "path";
    private static final float START = 0.0f;
    private static final String TAG = "VectorLocal";
    private boolean mAllowCaching;
    private ColorFilter mColorFilter;
    private boolean mMutated;
    private PorterDuffColorFilter mTintFilter;
    private final Rect mTmpBounds;
    private final float[] mTmpFloats;
    private final Matrix mTmpMatrix;
    private VectorDrawableCompatState mVectorState;

    public static class VClipPath extends VPath {
        public VClipPath() {
        }

        private void updateStateFromTypedArray(TypedArray typedArray) {
            String string = typedArray.getString(0);
            if (string != null) {
                this.mPathName = string;
            }
            String string2 = typedArray.getString(1);
            if (string2 != null) {
                this.mNodes = VectorPathParser.createNodesFromPathData(string2);
            }
        }

        public void inflate(Resources resources, AttributeSet attributeSet, Resources.Theme theme, XmlPullParser xmlPullParser) {
            if (AndroidTypedArrayUtils.hasAttribute(xmlPullParser, "pathData")) {
                TypedArray typedArrayObtainAttributesExtra = VectorDrawableCommonLocal.obtainAttributesExtra(resources, theme, attributeSet, AndroidResources.styleable_VectorDrawableClipPath);
                updateStateFromTypedArray(typedArrayObtainAttributesExtra);
                typedArrayObtainAttributesExtra.recycle();
            }
        }

        @Override // com.heytap.wearable.support.watchface.common.vector.VectorDrawableCompatLocal.VPath
        public boolean isClipPath() {
            return true;
        }

        public VClipPath(VClipPath vClipPath) {
            super(vClipPath);
        }
    }

    public static class VectorDrawableCompatState extends Drawable.ConstantState {
        boolean mAutoMirrored;
        boolean mCacheDirty;
        boolean mCachedAutoMirrored;
        Bitmap mCachedBitmap;
        int mCachedRootAlpha;
        ColorStateList mCachedTint;
        PorterDuff.Mode mCachedTintMode;
        int mChangingConfigurations;
        Paint mTempPaint;
        ColorStateList mTint;
        PorterDuff.Mode mTintMode;
        VPathRenderer mVPathRenderer;

        public VectorDrawableCompatState(VectorDrawableCompatState vectorDrawableCompatState) {
            this.mTint = null;
            this.mTintMode = VectorDrawableCompatLocal.DEFAULT_TINT_MODE;
            if (vectorDrawableCompatState != null) {
                this.mChangingConfigurations = vectorDrawableCompatState.mChangingConfigurations;
                this.mVPathRenderer = new VPathRenderer(vectorDrawableCompatState.mVPathRenderer);
                if (vectorDrawableCompatState.mVPathRenderer.mFillPaint != null) {
                    this.mVPathRenderer.mFillPaint = new Paint(vectorDrawableCompatState.mVPathRenderer.mFillPaint);
                }
                if (vectorDrawableCompatState.mVPathRenderer.mStrokePaint != null) {
                    this.mVPathRenderer.mStrokePaint = new Paint(vectorDrawableCompatState.mVPathRenderer.mStrokePaint);
                }
                this.mTint = vectorDrawableCompatState.mTint;
                this.mTintMode = vectorDrawableCompatState.mTintMode;
                this.mAutoMirrored = vectorDrawableCompatState.mAutoMirrored;
            }
        }

        public boolean canReuseBitmap(int i, int i2) {
            return i == this.mCachedBitmap.getWidth() && i2 == this.mCachedBitmap.getHeight();
        }

        public boolean canReuseCache() {
            return !this.mCacheDirty && this.mCachedTint == this.mTint && this.mCachedTintMode == this.mTintMode && this.mCachedAutoMirrored == this.mAutoMirrored && this.mCachedRootAlpha == this.mVPathRenderer.getRootAlpha();
        }

        public void createCachedBitmapIfNeeded(int i, int i2) {
            if (this.mCachedBitmap == null || !canReuseBitmap(i, i2)) {
                this.mCachedBitmap = Bitmap.createBitmap(i, i2, Bitmap.Config.ARGB_8888);
                this.mCacheDirty = true;
            }
        }

        public void drawCachedBitmapWithRootAlpha(Canvas canvas, ColorFilter colorFilter, Rect rect) {
            canvas.drawBitmap(this.mCachedBitmap, (Rect) null, rect, getPaint(colorFilter));
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return this.mChangingConfigurations;
        }

        public Paint getPaint(ColorFilter colorFilter) {
            if (!hasTranslucentRoot() && colorFilter == null) {
                return null;
            }
            if (this.mTempPaint == null) {
                Paint paint = new Paint();
                this.mTempPaint = paint;
                paint.setFilterBitmap(true);
            }
            this.mTempPaint.setAlpha(this.mVPathRenderer.getRootAlpha());
            this.mTempPaint.setColorFilter(colorFilter);
            return this.mTempPaint;
        }

        public boolean hasTranslucentRoot() {
            return ((float) this.mVPathRenderer.getRootAlpha()) < 255.0f;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        @NonNull
        public Drawable newDrawable() {
            return new VectorDrawableCompatLocal(this);
        }

        public void updateCacheStates() {
            this.mCachedTint = this.mTint;
            this.mCachedTintMode = this.mTintMode;
            this.mCachedRootAlpha = this.mVPathRenderer.getRootAlpha();
            this.mCachedAutoMirrored = this.mAutoMirrored;
            this.mCacheDirty = false;
        }

        public void updateCachedBitmap(int i, int i2) {
            this.mCachedBitmap.eraseColor(0);
            this.mVPathRenderer.draw(new Canvas(this.mCachedBitmap), i, i2, null);
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        @NonNull
        public Drawable newDrawable(Resources resources) {
            return new VectorDrawableCompatLocal(this);
        }

        public VectorDrawableCompatState() {
            this.mTint = null;
            this.mTintMode = VectorDrawableCompatLocal.DEFAULT_TINT_MODE;
            this.mVPathRenderer = new VPathRenderer();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int applyAlpha(int i, float f) {
        return (i & 16777215) | (((int) (Color.alpha(i) * f)) << 24);
    }

    @Nullable
    public static VectorDrawableCompatLocal create(@NonNull Resources resources, @DrawableRes int i, @Nullable Resources.Theme theme) {
        try {
            XmlResourceParser xml = resources.getXml(i);
            AttributeSet attributeSetAsAttributeSet = Xml.asAttributeSet(xml);
            int next = 0;
            while (next != 2 && next != 1) {
                if (xml != null) {
                    next = xml.next();
                }
            }
            if (next == 2) {
                return createFromXmlInner(resources, (XmlPullParser) xml, attributeSetAsAttributeSet, theme);
            }
            throw new XmlPullParserException("No start tag found");
        } catch (IOException unused) {
            SdkDebugLog.e(TAG, "[create] --> IOException");
            return null;
        } catch (XmlPullParserException unused2) {
            SdkDebugLog.e(TAG, "[create] --> XmlPullParserException");
            return null;
        }
    }

    @NonNull
    public static VectorDrawableCompatLocal createFromXmlInner(@NonNull Resources resources, @NonNull XmlPullParser xmlPullParser, @NonNull AttributeSet attributeSet, Resources.Theme theme) {
        VectorDrawableCompatLocal vectorDrawableCompatLocal = new VectorDrawableCompatLocal();
        vectorDrawableCompatLocal.inflate(resources, xmlPullParser, attributeSet, theme);
        return vectorDrawableCompatLocal;
    }

    private void inflateInternal(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        VectorDrawableCompatState vectorDrawableCompatState = this.mVectorState;
        VPathRenderer vPathRenderer = vectorDrawableCompatState.mVPathRenderer;
        Stack stack = new Stack();
        stack.push(vPathRenderer.mRootGroup);
        int eventType = xmlPullParser.getEventType();
        int depth = xmlPullParser.getDepth() + 1;
        while (eventType != 1) {
            if (xmlPullParser.getDepth() < depth && eventType == 3) {
                return;
            }
            if (eventType == 2) {
                String name = xmlPullParser.getName();
                VGroup vGroup = (VGroup) stack.peek();
                if (TextUtils.equals("path", name)) {
                    VFullPath vFullPath = new VFullPath();
                    vFullPath.inflate(resources, attributeSet, theme, xmlPullParser);
                    vGroup.mChildren.add(vFullPath);
                    if (vFullPath.getPathName() != null) {
                        vPathRenderer.mVGTargetsMap.put(vFullPath.getPathName(), vFullPath);
                    }
                    vectorDrawableCompatState.mChangingConfigurations = vFullPath.mChangingConfigurations | vectorDrawableCompatState.mChangingConfigurations;
                } else if (TextUtils.equals(SHAPE_CLIP_PATH, name)) {
                    VClipPath vClipPath = new VClipPath();
                    vClipPath.inflate(resources, attributeSet, theme, xmlPullParser);
                    vGroup.mChildren.add(vClipPath);
                    if (vClipPath.getPathName() != null) {
                        vPathRenderer.mVGTargetsMap.put(vClipPath.getPathName(), vClipPath);
                    }
                    vectorDrawableCompatState.mChangingConfigurations = vClipPath.mChangingConfigurations | vectorDrawableCompatState.mChangingConfigurations;
                } else if (TextUtils.equals(SHAPE_GROUP, name)) {
                    VGroup vGroup2 = new VGroup();
                    vGroup2.inflate(resources, attributeSet, theme, xmlPullParser);
                    vGroup.mChildren.add(vGroup2);
                    stack.push(vGroup2);
                    if (vGroup2.getGroupName() != null) {
                        vPathRenderer.mVGTargetsMap.put(vGroup2.getGroupName(), vGroup2);
                    }
                    vectorDrawableCompatState.mChangingConfigurations = vGroup2.mChangingConfigurations | vectorDrawableCompatState.mChangingConfigurations;
                }
            } else if (eventType == 3 && SHAPE_GROUP.equals(xmlPullParser.getName())) {
                stack.pop();
            }
            eventType = xmlPullParser.next();
        }
    }

    @SuppressLint({"NewApi", "WrongConstant"})
    private boolean needMirroring() {
        return isAutoMirrored() && getLayoutDirection() == 1;
    }

    private static PorterDuff.Mode parseTintModeCompat(int i) {
        if (i == 3) {
            return PorterDuff.Mode.SRC_OVER;
        }
        if (i == 5) {
            return PorterDuff.Mode.SRC_IN;
        }
        if (i == 9) {
            return PorterDuff.Mode.SRC_ATOP;
        }
        switch (i) {
            case 14:
                return PorterDuff.Mode.MULTIPLY;
            case 15:
                return PorterDuff.Mode.SCREEN;
            case 16:
                return PorterDuff.Mode.ADD;
            default:
                return PorterDuff.Mode.SRC_IN;
        }
    }

    private void updateStateFromTypedArray(TypedArray typedArray, XmlPullParser xmlPullParser) throws XmlPullParserException {
        VectorDrawableCompatState vectorDrawableCompatState = this.mVectorState;
        VPathRenderer vPathRenderer = vectorDrawableCompatState.mVPathRenderer;
        vectorDrawableCompatState.mTintMode = parseTintModeCompat(AndroidTypedArrayUtils.getNamedInt(typedArray, xmlPullParser, "tintMode", 6));
        ColorStateList colorStateList = typedArray.getColorStateList(1);
        if (colorStateList != null) {
            vectorDrawableCompatState.mTint = colorStateList;
        }
        vectorDrawableCompatState.mAutoMirrored = AndroidTypedArrayUtils.getNamedBoolean(typedArray, xmlPullParser, "autoMirrored", 5, vectorDrawableCompatState.mAutoMirrored);
        vPathRenderer.mViewportWidth = AndroidTypedArrayUtils.getNamedFloat(typedArray, xmlPullParser, "viewportWidth", 7, vPathRenderer.mViewportWidth);
        vPathRenderer.mViewportHeight = AndroidTypedArrayUtils.getNamedFloat(typedArray, xmlPullParser, "viewportHeight", 8, vPathRenderer.mViewportHeight);
        if (vPathRenderer.mViewportWidth <= 0.0f) {
            throw new XmlPullParserException(typedArray.getPositionDescription() + "<vector> tag requires viewportWidth > 0");
        }
        if (vPathRenderer.mViewportHeight <= 0.0f) {
            throw new XmlPullParserException(typedArray.getPositionDescription() + "<vector> tag requires viewportHeight > 0");
        }
        vPathRenderer.mBaseWidth = typedArray.getDimension(3, vPathRenderer.mBaseWidth);
        vPathRenderer.mBaseHeight = typedArray.getDimension(2, vPathRenderer.mBaseHeight);
        if (vPathRenderer.mBaseWidth <= 0.0f) {
            throw new XmlPullParserException(typedArray.getPositionDescription() + "<vector> tag requires width > 0");
        }
        if (vPathRenderer.mBaseHeight <= 0.0f) {
            throw new XmlPullParserException(typedArray.getPositionDescription() + "<vector> tag requires height > 0");
        }
        vPathRenderer.setAlpha(AndroidTypedArrayUtils.getNamedFloat(typedArray, xmlPullParser, "alpha", 4, vPathRenderer.getAlpha()));
        String string = typedArray.getString(0);
        if (string != null) {
            vPathRenderer.mRootName = string;
            vPathRenderer.mVGTargetsMap.put(string, vPathRenderer);
        }
    }

    private PorterDuffColorFilter updateTintFilter(ColorStateList colorStateList, PorterDuff.Mode mode) {
        if (colorStateList == null || mode == null) {
            return null;
        }
        return new PorterDuffColorFilter(colorStateList.getColorForState(getState(), 0), mode);
    }

    @Override // com.heytap.wearable.support.watchface.common.vector.VectorDrawableCommonLocal, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void applyTheme(@NonNull Resources.Theme theme) {
        super.applyTheme(theme);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean canApplyTheme() {
        Drawable drawable = this.mDelegateDrawable;
        if (drawable == null) {
            return false;
        }
        DrawableCompat.canApplyTheme(drawable);
        return false;
    }

    @Override // com.heytap.wearable.support.watchface.common.vector.VectorDrawableCommonLocal, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void clearColorFilter() {
        super.clearColorFilter();
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(@NonNull Canvas canvas) {
        Drawable drawable = this.mDelegateDrawable;
        if (drawable != null) {
            drawable.draw(canvas);
            return;
        }
        copyBounds(this.mTmpBounds);
        if (this.mTmpBounds.width() <= 0 || this.mTmpBounds.height() <= 0) {
            return;
        }
        ColorFilter colorFilter = this.mColorFilter;
        if (colorFilter == null) {
            colorFilter = this.mTintFilter;
        }
        canvas.getMatrix(this.mTmpMatrix);
        this.mTmpMatrix.getValues(this.mTmpFloats);
        float fAbs = Math.abs(this.mTmpFloats[0]);
        float fAbs2 = Math.abs(this.mTmpFloats[4]);
        float fAbs3 = Math.abs(this.mTmpFloats[1]);
        float fAbs4 = Math.abs(this.mTmpFloats[3]);
        if (fAbs3 != 0.0f || fAbs4 != 0.0f) {
            fAbs = 1.0f;
            fAbs2 = 1.0f;
        }
        int iWidth = (int) (this.mTmpBounds.width() * fAbs);
        int iHeight = (int) (this.mTmpBounds.height() * fAbs2);
        int iMin = Math.min(2048, iWidth);
        int iMin2 = Math.min(2048, iHeight);
        if (iMin <= 0 || iMin2 <= 0) {
            return;
        }
        int iSave = canvas.save();
        Rect rect = this.mTmpBounds;
        canvas.translate(rect.left, rect.top);
        if (needMirroring()) {
            canvas.translate(this.mTmpBounds.width(), 0.0f);
            canvas.scale(-1.0f, 1.0f);
        }
        this.mTmpBounds.offsetTo(0, 0);
        this.mVectorState.createCachedBitmapIfNeeded(iMin, iMin2);
        if (!this.mAllowCaching) {
            this.mVectorState.updateCachedBitmap(iMin, iMin2);
        } else if (!this.mVectorState.canReuseCache()) {
            this.mVectorState.updateCachedBitmap(iMin, iMin2);
            this.mVectorState.updateCacheStates();
        }
        this.mVectorState.drawCachedBitmapWithRootAlpha(canvas, colorFilter, this.mTmpBounds);
        canvas.restoreToCount(iSave);
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        Drawable drawable = this.mDelegateDrawable;
        return drawable != null ? DrawableCompat.getAlpha(drawable) : this.mVectorState.mVPathRenderer.getRootAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    public int getChangingConfigurations() {
        Drawable drawable = this.mDelegateDrawable;
        if (drawable != null) {
            return drawable.getChangingConfigurations();
        }
        return this.mVectorState.getChangingConfigurations() | super.getChangingConfigurations();
    }

    @Override // com.heytap.wearable.support.watchface.common.vector.VectorDrawableCommonLocal, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ ColorFilter getColorFilter() {
        return super.getColorFilter();
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable.ConstantState getConstantState() {
        if (this.mDelegateDrawable != null) {
            return new VectorDrawableDelegateState(this.mDelegateDrawable.getConstantState());
        }
        this.mVectorState.mChangingConfigurations = getChangingConfigurations();
        return this.mVectorState;
    }

    @Override // com.heytap.wearable.support.watchface.common.vector.VectorDrawableCommonLocal, android.graphics.drawable.Drawable
    @NonNull
    public /* bridge */ /* synthetic */ Drawable getCurrent() {
        return super.getCurrent();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        Drawable drawable = this.mDelegateDrawable;
        return drawable != null ? drawable.getIntrinsicHeight() : (int) this.mVectorState.mVPathRenderer.mBaseHeight;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        Drawable drawable = this.mDelegateDrawable;
        return drawable != null ? drawable.getIntrinsicWidth() : (int) this.mVectorState.mVPathRenderer.mBaseWidth;
    }

    @Override // com.heytap.wearable.support.watchface.common.vector.VectorDrawableCommonLocal, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ int getMinimumHeight() {
        return super.getMinimumHeight();
    }

    @Override // com.heytap.wearable.support.watchface.common.vector.VectorDrawableCommonLocal, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ int getMinimumWidth() {
        return super.getMinimumWidth();
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        Drawable drawable = this.mDelegateDrawable;
        if (drawable != null) {
            return drawable.getOpacity();
        }
        return -3;
    }

    @Override // com.heytap.wearable.support.watchface.common.vector.VectorDrawableCommonLocal, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ boolean getPadding(@NonNull Rect rect) {
        return super.getPadding(rect);
    }

    @Override // com.heytap.wearable.support.watchface.common.vector.VectorDrawableCommonLocal, android.graphics.drawable.Drawable
    @NonNull
    public /* bridge */ /* synthetic */ int[] getState() {
        return super.getState();
    }

    public Object getTargetByName(String str) {
        return this.mVectorState.mVPathRenderer.mVGTargetsMap.get(str);
    }

    @Override // com.heytap.wearable.support.watchface.common.vector.VectorDrawableCommonLocal, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ Region getTransparentRegion() {
        return super.getTransparentRegion();
    }

    @Override // android.graphics.drawable.Drawable
    public void inflate(@NonNull Resources resources, @NonNull XmlPullParser xmlPullParser, @NonNull AttributeSet attributeSet) {
        Drawable drawable = this.mDelegateDrawable;
        if (drawable == null) {
            inflate(resources, xmlPullParser, attributeSet, null);
            return;
        }
        try {
            drawable.inflate(resources, xmlPullParser, attributeSet);
        } catch (IOException | XmlPullParserException unused) {
            SdkDebugLog.e(TAG, "[inflate] --> IOException | XmlPullParserException");
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void invalidateSelf() {
        Drawable drawable = this.mDelegateDrawable;
        if (drawable != null) {
            drawable.invalidateSelf();
        } else {
            super.invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isAutoMirrored() {
        Drawable drawable = this.mDelegateDrawable;
        return drawable != null ? DrawableCompat.isAutoMirrored(drawable) : this.mVectorState.mAutoMirrored;
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        VectorDrawableCompatState vectorDrawableCompatState;
        ColorStateList colorStateList;
        Drawable drawable = this.mDelegateDrawable;
        if (drawable != null) {
            return drawable.isStateful();
        }
        return super.isStateful() || !((vectorDrawableCompatState = this.mVectorState) == null || (colorStateList = vectorDrawableCompatState.mTint) == null || !colorStateList.isStateful());
    }

    @Override // com.heytap.wearable.support.watchface.common.vector.VectorDrawableCommonLocal, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void jumpToCurrentState() {
        super.jumpToCurrentState();
    }

    @Override // android.graphics.drawable.Drawable
    @NonNull
    public Drawable mutate() {
        Drawable drawable = this.mDelegateDrawable;
        if (drawable != null) {
            drawable.mutate();
            return this;
        }
        if (!this.mMutated && super.mutate() == this) {
            this.mVectorState = new VectorDrawableCompatState(this.mVectorState);
            this.mMutated = true;
        }
        return this;
    }

    @Override // com.heytap.wearable.support.watchface.common.vector.VectorDrawableCommonLocal, android.graphics.drawable.Drawable
    public void onBoundsChange(Rect rect) {
        Drawable drawable = this.mDelegateDrawable;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onStateChange(int[] iArr) {
        PorterDuff.Mode mode;
        Drawable drawable = this.mDelegateDrawable;
        if (drawable != null) {
            return drawable.setState(iArr);
        }
        VectorDrawableCompatState vectorDrawableCompatState = this.mVectorState;
        ColorStateList colorStateList = vectorDrawableCompatState.mTint;
        if (colorStateList == null || (mode = vectorDrawableCompatState.mTintMode) == null) {
            return false;
        }
        this.mTintFilter = updateTintFilter(colorStateList, mode);
        invalidateSelf();
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public void scheduleSelf(@NonNull Runnable runnable, long j2) {
        Drawable drawable = this.mDelegateDrawable;
        if (drawable != null) {
            drawable.scheduleSelf(runnable, j2);
        } else {
            super.scheduleSelf(runnable, j2);
        }
    }

    public void setAllowCaching(boolean z) {
        this.mAllowCaching = z;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        Drawable drawable = this.mDelegateDrawable;
        if (drawable != null) {
            drawable.setAlpha(i);
        } else if (this.mVectorState.mVPathRenderer.getRootAlpha() != i) {
            this.mVectorState.mVPathRenderer.setRootAlpha(i);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setAutoMirrored(boolean z) {
        Drawable drawable = this.mDelegateDrawable;
        if (drawable != null) {
            DrawableCompat.setAutoMirrored(drawable, z);
        } else {
            this.mVectorState.mAutoMirrored = z;
        }
    }

    @Override // com.heytap.wearable.support.watchface.common.vector.VectorDrawableCommonLocal, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setChangingConfigurations(int i) {
        super.setChangingConfigurations(i);
    }

    @Override // com.heytap.wearable.support.watchface.common.vector.VectorDrawableCommonLocal, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setColorFilter(int i, @NonNull PorterDuff.Mode mode) {
        super.setColorFilter(i, mode);
    }

    @Override // com.heytap.wearable.support.watchface.common.vector.VectorDrawableCommonLocal, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setFilterBitmap(boolean z) {
        super.setFilterBitmap(z);
    }

    @Override // com.heytap.wearable.support.watchface.common.vector.VectorDrawableCommonLocal, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setHotspot(float f, float f2) {
        super.setHotspot(f, f2);
    }

    @Override // com.heytap.wearable.support.watchface.common.vector.VectorDrawableCommonLocal, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setHotspotBounds(int i, int i2, int i3, int i4) {
        super.setHotspotBounds(i, i2, i3, i4);
    }

    @Override // com.heytap.wearable.support.watchface.common.vector.VectorDrawableCommonLocal, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ boolean setState(@NonNull int[] iArr) {
        return super.setState(iArr);
    }

    @Override // android.graphics.drawable.Drawable, androidx.core.graphics.drawable.TintAwareDrawable
    public void setTint(int i) {
        Drawable drawable = this.mDelegateDrawable;
        if (drawable != null) {
            DrawableCompat.setTint(drawable, i);
        } else {
            setTintList(ColorStateList.valueOf(i));
        }
    }

    @Override // android.graphics.drawable.Drawable, androidx.core.graphics.drawable.TintAwareDrawable
    public void setTintList(ColorStateList colorStateList) {
        Drawable drawable = this.mDelegateDrawable;
        if (drawable != null) {
            DrawableCompat.setTintList(drawable, colorStateList);
            return;
        }
        VectorDrawableCompatState vectorDrawableCompatState = this.mVectorState;
        if (vectorDrawableCompatState.mTint != colorStateList) {
            vectorDrawableCompatState.mTint = colorStateList;
            this.mTintFilter = updateTintFilter(colorStateList, vectorDrawableCompatState.mTintMode);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable, androidx.core.graphics.drawable.TintAwareDrawable
    public void setTintMode(@NonNull PorterDuff.Mode mode) {
        Drawable drawable = this.mDelegateDrawable;
        if (drawable != null) {
            DrawableCompat.setTintMode(drawable, mode);
            return;
        }
        VectorDrawableCompatState vectorDrawableCompatState = this.mVectorState;
        if (vectorDrawableCompatState.mTintMode != mode) {
            vectorDrawableCompatState.mTintMode = mode;
            this.mTintFilter = updateTintFilter(vectorDrawableCompatState.mTint, mode);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean z, boolean z2) {
        Drawable drawable = this.mDelegateDrawable;
        return drawable != null ? drawable.setVisible(z, z2) : super.setVisible(z, z2);
    }

    @Override // android.graphics.drawable.Drawable
    public void unscheduleSelf(@NonNull Runnable runnable) {
        Drawable drawable = this.mDelegateDrawable;
        if (drawable != null) {
            drawable.unscheduleSelf(runnable);
        } else {
            super.unscheduleSelf(runnable);
        }
    }

    public static class VPath {
        int mChangingConfigurations;
        VectorPathParser.PathDataNode[] mNodes;
        String mPathName;

        public VPath() {
            this.mNodes = null;
        }

        public void applyTheme(Resources.Theme theme) {
        }

        public boolean canApplyTheme() {
            return false;
        }

        public String getPathName() {
            return this.mPathName;
        }

        public boolean isClipPath() {
            return false;
        }

        public void toPath(Path path) {
            path.reset();
            VectorPathParser.PathDataNode[] pathDataNodeArr = this.mNodes;
            if (pathDataNodeArr != null) {
                VectorPathParser.PathDataNode.nodesToPath(pathDataNodeArr, path);
            }
        }

        public VPath(VPath vPath) {
            this.mNodes = null;
            this.mPathName = vPath.mPathName;
            this.mChangingConfigurations = vPath.mChangingConfigurations;
            this.mNodes = VectorPathParser.deepCopyNodes(vPath.mNodes);
        }
    }

    public static class VectorDrawableDelegateState extends Drawable.ConstantState {
        private final Drawable.ConstantState mDelegateState;

        public VectorDrawableDelegateState(Drawable.ConstantState constantState) {
            this.mDelegateState = constantState;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public boolean canApplyTheme() {
            return this.mDelegateState.canApplyTheme();
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return this.mDelegateState.getChangingConfigurations();
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        @NonNull
        public Drawable newDrawable() {
            VectorDrawableCompatLocal vectorDrawableCompatLocal = new VectorDrawableCompatLocal();
            vectorDrawableCompatLocal.mDelegateDrawable = this.mDelegateState.newDrawable();
            return vectorDrawableCompatLocal;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        @NonNull
        public Drawable newDrawable(Resources resources) {
            VectorDrawableCompatLocal vectorDrawableCompatLocal = new VectorDrawableCompatLocal();
            vectorDrawableCompatLocal.mDelegateDrawable = this.mDelegateState.newDrawable(resources);
            return vectorDrawableCompatLocal;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        @NonNull
        public Drawable newDrawable(Resources resources, Resources.Theme theme) {
            VectorDrawableCompatLocal vectorDrawableCompatLocal = new VectorDrawableCompatLocal();
            vectorDrawableCompatLocal.mDelegateDrawable = this.mDelegateState.newDrawable(resources, theme);
            return vectorDrawableCompatLocal;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        Drawable drawable = this.mDelegateDrawable;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
        } else {
            this.mColorFilter = colorFilter;
            invalidateSelf();
        }
    }

    private VectorDrawableCompatLocal() {
        this.mTmpFloats = new float[9];
        this.mTmpMatrix = new Matrix();
        this.mTmpBounds = new Rect();
        this.mAllowCaching = true;
        this.mVectorState = new VectorDrawableCompatState();
    }

    @Override // android.graphics.drawable.Drawable
    public void inflate(@NonNull Resources resources, @NonNull XmlPullParser xmlPullParser, @NonNull AttributeSet attributeSet, Resources.Theme theme) {
        TypedArray typedArrayObtainAttributesExtra = null;
        try {
            try {
                Drawable drawable = this.mDelegateDrawable;
                if (drawable != null) {
                    DrawableCompat.inflate(drawable, resources, xmlPullParser, attributeSet, theme);
                    return;
                }
                VectorDrawableCompatState vectorDrawableCompatState = this.mVectorState;
                vectorDrawableCompatState.mVPathRenderer = new VPathRenderer();
                typedArrayObtainAttributesExtra = VectorDrawableCommonLocal.obtainAttributesExtra(resources, theme, attributeSet, AndroidResources.styleable_VectorDrawableTypeArray);
                updateStateFromTypedArray(typedArrayObtainAttributesExtra, xmlPullParser);
                vectorDrawableCompatState.mChangingConfigurations = getChangingConfigurations();
                vectorDrawableCompatState.mCacheDirty = true;
                inflateInternal(resources, xmlPullParser, attributeSet, theme);
                this.mTintFilter = updateTintFilter(vectorDrawableCompatState.mTint, vectorDrawableCompatState.mTintMode);
                if (typedArrayObtainAttributesExtra == null) {
                    return;
                }
                typedArrayObtainAttributesExtra.recycle();
            } catch (IOException | XmlPullParserException unused) {
                SdkDebugLog.e(TAG, "[inflate] --> IOException | XmlPullParserException");
                if (0 == 0) {
                }
            }
        } catch (Throwable th) {
            if (0 != 0) {
                typedArrayObtainAttributesExtra.recycle();
            }
            throw th;
        }
    }

    private VectorDrawableCompatLocal(@NonNull VectorDrawableCompatState vectorDrawableCompatState) {
        this.mTmpFloats = new float[9];
        this.mTmpMatrix = new Matrix();
        this.mTmpBounds = new Rect();
        this.mAllowCaching = true;
        this.mVectorState = vectorDrawableCompatState;
        this.mTintFilter = updateTintFilter(vectorDrawableCompatState.mTint, vectorDrawableCompatState.mTintMode);
    }

    public static class VFullPath extends VPath {
        float mFillAlpha;
        int mFillColor;
        int mFillRule;
        float mStrokeAlpha;
        int mStrokeColor;
        Paint.Cap mStrokeLineCap;
        Paint.Join mStrokeLineJoin;
        float mStrokeMiterLimit;
        float mStrokeWidth;
        private int[] mThemeAttrs;
        float mTrimPathEnd;
        float mTrimPathOffset;
        float mTrimPathStart;

        public VFullPath() {
            this.mStrokeColor = 0;
            this.mStrokeWidth = 0.0f;
            this.mFillColor = 0;
            this.mStrokeAlpha = 1.0f;
            this.mFillAlpha = 1.0f;
            this.mTrimPathStart = 0.0f;
            this.mTrimPathEnd = 1.0f;
            this.mTrimPathOffset = 0.0f;
            this.mStrokeLineCap = Paint.Cap.BUTT;
            this.mStrokeLineJoin = Paint.Join.MITER;
            this.mStrokeMiterLimit = 4.0f;
        }

        private Paint.Cap getStrokeLineCap(int i, Paint.Cap cap) {
            if (i == 0) {
                return Paint.Cap.BUTT;
            }
            if (i != 1) {
                return i != 2 ? cap : Paint.Cap.SQUARE;
            }
            return Paint.Cap.ROUND;
        }

        private Paint.Join getStrokeLineJoin(int i, Paint.Join join) {
            if (i == 0) {
                return Paint.Join.MITER;
            }
            if (i != 1) {
                return i != 2 ? join : Paint.Join.BEVEL;
            }
            return Paint.Join.ROUND;
        }

        private void updateStateFromTypedArray(TypedArray typedArray, XmlPullParser xmlPullParser) {
            this.mThemeAttrs = null;
            if (AndroidTypedArrayUtils.hasAttribute(xmlPullParser, "pathData")) {
                String string = typedArray.getString(0);
                if (string != null) {
                    this.mPathName = string;
                }
                String string2 = typedArray.getString(2);
                if (string2 != null) {
                    this.mNodes = VectorPathParser.createNodesFromPathData(string2);
                }
                int namedInt = AndroidTypedArrayUtils.getNamedInt(typedArray, xmlPullParser, "strokeLineJoin", 9);
                int namedInt2 = AndroidTypedArrayUtils.getNamedInt(typedArray, xmlPullParser, "strokeLineCap", 8);
                this.mFillColor = AndroidTypedArrayUtils.getNamedColor(typedArray, xmlPullParser, "fillColor", 1, this.mFillColor);
                this.mFillAlpha = AndroidTypedArrayUtils.getNamedFloat(typedArray, xmlPullParser, "fillAlpha", 12, this.mFillAlpha);
                this.mStrokeLineCap = getStrokeLineCap(namedInt2, this.mStrokeLineCap);
                this.mStrokeLineJoin = getStrokeLineJoin(namedInt, this.mStrokeLineJoin);
                this.mStrokeMiterLimit = AndroidTypedArrayUtils.getNamedFloat(typedArray, xmlPullParser, "strokeMiterLimit", 10, this.mStrokeMiterLimit);
                this.mStrokeColor = AndroidTypedArrayUtils.getNamedColor(typedArray, xmlPullParser, "strokeColor", 3, this.mStrokeColor);
                this.mStrokeAlpha = AndroidTypedArrayUtils.getNamedFloat(typedArray, xmlPullParser, "strokeAlpha", 11, this.mStrokeAlpha);
                this.mStrokeWidth = AndroidTypedArrayUtils.getNamedFloat(typedArray, xmlPullParser, "strokeWidth", 4, this.mStrokeWidth);
                this.mTrimPathEnd = AndroidTypedArrayUtils.getNamedFloat(typedArray, xmlPullParser, "trimPathEnd", 6, this.mTrimPathEnd);
                this.mTrimPathOffset = AndroidTypedArrayUtils.getNamedFloat(typedArray, xmlPullParser, "trimPathOffset", 7, this.mTrimPathOffset);
                this.mTrimPathStart = AndroidTypedArrayUtils.getNamedFloat(typedArray, xmlPullParser, "trimPathStart", 5, this.mTrimPathStart);
            }
        }

        @Override // com.heytap.wearable.support.watchface.common.vector.VectorDrawableCompatLocal.VPath
        public void applyTheme(Resources.Theme theme) {
        }

        @Override // com.heytap.wearable.support.watchface.common.vector.VectorDrawableCompatLocal.VPath
        public boolean canApplyTheme() {
            return this.mThemeAttrs != null;
        }

        public float getFillAlpha() {
            return this.mFillAlpha;
        }

        public int getFillColor() {
            return this.mFillColor;
        }

        @Override // com.heytap.wearable.support.watchface.common.vector.VectorDrawableCompatLocal.VPath
        public /* bridge */ /* synthetic */ String getPathName() {
            return super.getPathName();
        }

        public float getStrokeAlpha() {
            return this.mStrokeAlpha;
        }

        public int getStrokeColor() {
            return this.mStrokeColor;
        }

        public float getStrokeWidth() {
            return this.mStrokeWidth;
        }

        public float getTrimPathEnd() {
            return this.mTrimPathEnd;
        }

        public float getTrimPathOffset() {
            return this.mTrimPathOffset;
        }

        public float getTrimPathStart() {
            return this.mTrimPathStart;
        }

        public void inflate(Resources resources, AttributeSet attributeSet, Resources.Theme theme, XmlPullParser xmlPullParser) {
            TypedArray typedArrayObtainAttributesExtra = VectorDrawableCommonLocal.obtainAttributesExtra(resources, theme, attributeSet, AndroidResources.styleable_VectorDrawablePath);
            updateStateFromTypedArray(typedArrayObtainAttributesExtra, xmlPullParser);
            typedArrayObtainAttributesExtra.recycle();
        }

        @Override // com.heytap.wearable.support.watchface.common.vector.VectorDrawableCompatLocal.VPath
        public /* bridge */ /* synthetic */ boolean isClipPath() {
            return super.isClipPath();
        }

        public void setFillAlpha(float f) {
            this.mFillAlpha = f;
        }

        public void setFillColor(int i) {
            this.mFillColor = i;
        }

        public void setStrokeAlpha(float f) {
            this.mStrokeAlpha = f;
        }

        public void setStrokeColor(int i) {
            this.mStrokeColor = i;
        }

        public void setStrokeWidth(float f) {
            this.mStrokeWidth = f;
        }

        public void setTrimPathEnd(float f) {
            this.mTrimPathEnd = f;
        }

        public void setTrimPathOffset(float f) {
            this.mTrimPathOffset = f;
        }

        public void setTrimPathStart(float f) {
            this.mTrimPathStart = f;
        }

        @Override // com.heytap.wearable.support.watchface.common.vector.VectorDrawableCompatLocal.VPath
        public /* bridge */ /* synthetic */ void toPath(Path path) {
            super.toPath(path);
        }

        public VFullPath(VFullPath vFullPath) {
            super(vFullPath);
            this.mStrokeColor = 0;
            this.mStrokeWidth = 0.0f;
            this.mFillColor = 0;
            this.mStrokeAlpha = 1.0f;
            this.mFillAlpha = 1.0f;
            this.mTrimPathStart = 0.0f;
            this.mTrimPathEnd = 1.0f;
            this.mTrimPathOffset = 0.0f;
            this.mStrokeLineCap = Paint.Cap.BUTT;
            this.mStrokeLineJoin = Paint.Join.MITER;
            this.mStrokeMiterLimit = 4.0f;
            this.mThemeAttrs = vFullPath.mThemeAttrs;
            this.mStrokeColor = vFullPath.mStrokeColor;
            this.mStrokeWidth = vFullPath.mStrokeWidth;
            this.mStrokeAlpha = vFullPath.mStrokeAlpha;
            this.mFillColor = vFullPath.mFillColor;
            this.mFillRule = vFullPath.mFillRule;
            this.mFillAlpha = vFullPath.mFillAlpha;
            this.mTrimPathStart = vFullPath.mTrimPathStart;
            this.mTrimPathEnd = vFullPath.mTrimPathEnd;
            this.mTrimPathOffset = vFullPath.mTrimPathOffset;
            this.mStrokeLineCap = vFullPath.mStrokeLineCap;
            this.mStrokeLineJoin = vFullPath.mStrokeLineJoin;
            this.mStrokeMiterLimit = vFullPath.mStrokeMiterLimit;
        }
    }

    public static class VPathRenderer {
        private static final Matrix IDENTITY_MATRIX = new Matrix();
        private float mBaseHeight;
        private float mBaseWidth;
        private int mChangingConfigurations;
        private Paint mFillPaint;
        private final Matrix mFinalPathMatrix;
        private final Path mPath;
        private PathMeasure mPathMeasure;
        private final Path mRenderPath;
        private int mRootAlpha;
        final VGroup mRootGroup;
        private String mRootName;
        private Paint mStrokePaint;
        final ArrayMap<String, Object> mVGTargetsMap;
        private float mViewportHeight;
        private float mViewportWidth;

        public VPathRenderer() {
            this.mVGTargetsMap = new ArrayMap<>();
            this.mFinalPathMatrix = new Matrix();
            this.mRootName = null;
            this.mBaseWidth = 0.0f;
            this.mBaseHeight = 0.0f;
            this.mViewportWidth = 0.0f;
            this.mViewportHeight = 0.0f;
            this.mRootAlpha = 255;
            this.mRootGroup = new VGroup();
            this.mPath = new Path();
            this.mRenderPath = new Path();
        }

        private static float cross(float f, float f2, float f3, float f4) {
            return (f * f4) - (f2 * f3);
        }

        private void drawGroupTree(VGroup vGroup, Matrix matrix, Canvas canvas, int i, int i2, ColorFilter colorFilter) {
            vGroup.mStackedMatrix.set(matrix);
            vGroup.mStackedMatrix.preConcat(vGroup.mLocalMatrix);
            canvas.save();
            for (int i3 = 0; i3 < vGroup.mChildren.size(); i3++) {
                Object obj = vGroup.mChildren.get(i3);
                if (obj instanceof VGroup) {
                    drawGroupTree((VGroup) obj, vGroup.mStackedMatrix, canvas, i, i2, colorFilter);
                } else if (obj instanceof VPath) {
                    drawPath(vGroup, (VPath) obj, canvas, i, i2, colorFilter);
                }
            }
            canvas.restore();
        }

        private void drawPath(VGroup vGroup, VPath vPath, Canvas canvas, int i, int i2, ColorFilter colorFilter) {
            float f = i / this.mViewportWidth;
            float f2 = i2 / this.mViewportHeight;
            float fMin = Math.min(f, f2);
            Matrix matrix = vGroup.mStackedMatrix;
            this.mFinalPathMatrix.set(matrix);
            this.mFinalPathMatrix.postScale(f, f2);
            float matrixScale = getMatrixScale(matrix);
            if (matrixScale == 0.0f) {
                return;
            }
            vPath.toPath(this.mPath);
            Path path = this.mPath;
            this.mRenderPath.reset();
            if (vPath.isClipPath()) {
                this.mRenderPath.addPath(path, this.mFinalPathMatrix);
                canvas.clipPath(this.mRenderPath);
                return;
            }
            VFullPath vFullPath = (VFullPath) vPath;
            float f3 = vFullPath.mTrimPathStart;
            if (f3 != 0.0f || vFullPath.mTrimPathEnd != 1.0f) {
                float f4 = vFullPath.mTrimPathOffset;
                float f5 = (f3 + f4) % 1.0f;
                float f6 = (vFullPath.mTrimPathEnd + f4) % 1.0f;
                if (this.mPathMeasure == null) {
                    this.mPathMeasure = new PathMeasure();
                }
                this.mPathMeasure.setPath(this.mPath, false);
                float length = this.mPathMeasure.getLength();
                float f7 = f5 * length;
                float f8 = f6 * length;
                path.reset();
                if (f7 > f8) {
                    this.mPathMeasure.getSegment(f7, length, path, true);
                    this.mPathMeasure.getSegment(0.0f, f8, path, true);
                } else {
                    this.mPathMeasure.getSegment(f7, f8, path, true);
                }
                path.rLineTo(0.0f, 0.0f);
            }
            this.mRenderPath.addPath(path, this.mFinalPathMatrix);
            if (vFullPath.mFillColor != 0) {
                if (this.mFillPaint == null) {
                    Paint paint = new Paint();
                    this.mFillPaint = paint;
                    paint.setStyle(Paint.Style.FILL);
                    this.mFillPaint.setAntiAlias(true);
                }
                Paint paint2 = this.mFillPaint;
                paint2.setColor(VectorDrawableCompatLocal.applyAlpha(vFullPath.mFillColor, vFullPath.mFillAlpha));
                paint2.setColorFilter(colorFilter);
                canvas.drawPath(this.mRenderPath, paint2);
            }
            if (vFullPath.mStrokeColor != 0) {
                if (this.mStrokePaint == null) {
                    Paint paint3 = new Paint();
                    this.mStrokePaint = paint3;
                    paint3.setStyle(Paint.Style.STROKE);
                    this.mStrokePaint.setAntiAlias(true);
                }
                Paint paint4 = this.mStrokePaint;
                Paint.Join join = vFullPath.mStrokeLineJoin;
                if (join != null) {
                    paint4.setStrokeJoin(join);
                }
                Paint.Cap cap = vFullPath.mStrokeLineCap;
                if (cap != null) {
                    paint4.setStrokeCap(cap);
                }
                paint4.setStrokeMiter(vFullPath.mStrokeMiterLimit);
                paint4.setColor(VectorDrawableCompatLocal.applyAlpha(vFullPath.mStrokeColor, vFullPath.mStrokeAlpha));
                paint4.setColorFilter(colorFilter);
                paint4.setStrokeWidth(vFullPath.mStrokeWidth * fMin * matrixScale);
                canvas.drawPath(this.mRenderPath, paint4);
            }
        }

        private float getMatrixScale(Matrix matrix) {
            float[] fArr = {0.0f, 1.0f, 1.0f, 0.0f};
            matrix.mapVectors(fArr);
            float fHypot = (float) Math.hypot(fArr[0], fArr[1]);
            float fHypot2 = (float) Math.hypot(fArr[2], fArr[3]);
            float fCross = cross(fArr[0], fArr[1], fArr[2], fArr[3]);
            float fMax = Math.max(fHypot, fHypot2);
            if (fMax > 0.0f) {
                return Math.abs(fCross) / fMax;
            }
            return 0.0f;
        }

        public void draw(Canvas canvas, int i, int i2, ColorFilter colorFilter) {
            drawGroupTree(this.mRootGroup, IDENTITY_MATRIX, canvas, i, i2, colorFilter);
        }

        public float getAlpha() {
            return getRootAlpha() / 255.0f;
        }

        public int getRootAlpha() {
            return this.mRootAlpha;
        }

        public void setAlpha(float f) {
            setRootAlpha((int) (f * 255.0f));
        }

        public void setRootAlpha(int i) {
            this.mRootAlpha = i;
        }

        public VPathRenderer(VPathRenderer vPathRenderer) {
            ArrayMap<String, Object> arrayMap = new ArrayMap<>();
            this.mVGTargetsMap = arrayMap;
            this.mFinalPathMatrix = new Matrix();
            this.mRootName = null;
            this.mBaseWidth = 0.0f;
            this.mBaseHeight = 0.0f;
            this.mViewportWidth = 0.0f;
            this.mViewportHeight = 0.0f;
            this.mRootAlpha = 255;
            this.mRootGroup = new VGroup(vPathRenderer.mRootGroup, arrayMap);
            this.mPath = new Path(vPathRenderer.mPath);
            this.mRenderPath = new Path(vPathRenderer.mRenderPath);
            this.mBaseWidth = vPathRenderer.mBaseWidth;
            this.mBaseHeight = vPathRenderer.mBaseHeight;
            this.mViewportWidth = vPathRenderer.mViewportWidth;
            this.mViewportHeight = vPathRenderer.mViewportHeight;
            this.mChangingConfigurations = vPathRenderer.mChangingConfigurations;
            this.mRootAlpha = vPathRenderer.mRootAlpha;
            this.mRootName = vPathRenderer.mRootName;
            String str = vPathRenderer.mRootName;
            if (str != null) {
                arrayMap.put(str, this);
            }
        }
    }

    public static class VGroup {
        int mChangingConfigurations;
        final ArrayList<Object> mChildren;
        private String mGroupName;
        private final Matrix mLocalMatrix;
        private float mPivotX;
        private float mPivotY;
        float mRotate;
        private float mScaleX;
        private float mScaleY;
        private final Matrix mStackedMatrix;
        private int[] mThemeAttrs;
        private float mTranslateX;
        private float mTranslateY;

        public VGroup(VGroup vGroup, ArrayMap<String, Object> arrayMap) {
            VPath vClipPath;
            this.mChildren = new ArrayList<>();
            this.mRotate = 0.0f;
            Matrix matrix = new Matrix();
            this.mLocalMatrix = matrix;
            this.mStackedMatrix = new Matrix();
            this.mPivotX = 0.0f;
            this.mPivotY = 0.0f;
            this.mScaleX = 1.0f;
            this.mScaleY = 1.0f;
            this.mTranslateX = 0.0f;
            this.mTranslateY = 0.0f;
            this.mGroupName = null;
            this.mRotate = vGroup.mRotate;
            this.mPivotX = vGroup.mPivotX;
            this.mPivotY = vGroup.mPivotY;
            this.mScaleX = vGroup.mScaleX;
            this.mScaleY = vGroup.mScaleY;
            this.mTranslateX = vGroup.mTranslateX;
            this.mTranslateY = vGroup.mTranslateY;
            this.mThemeAttrs = vGroup.mThemeAttrs;
            String str = vGroup.mGroupName;
            this.mGroupName = str;
            this.mChangingConfigurations = vGroup.mChangingConfigurations;
            if (str != null) {
                arrayMap.put(str, this);
            }
            matrix.set(vGroup.mLocalMatrix);
            ArrayList<Object> arrayList = vGroup.mChildren;
            for (int i = 0; i < arrayList.size(); i++) {
                Object obj = arrayList.get(i);
                if (obj instanceof VGroup) {
                    this.mChildren.add(new VGroup((VGroup) obj, arrayMap));
                } else {
                    if (obj instanceof VFullPath) {
                        vClipPath = new VFullPath((VFullPath) obj);
                    } else {
                        if (!(obj instanceof VClipPath)) {
                            throw new IllegalStateException("Unknown object in the tree!");
                        }
                        vClipPath = new VClipPath((VClipPath) obj);
                    }
                    this.mChildren.add(vClipPath);
                    String str2 = vClipPath.mPathName;
                    if (str2 != null) {
                        arrayMap.put(str2, vClipPath);
                    }
                }
            }
        }

        private void updateLocalMatrix() {
            this.mLocalMatrix.reset();
            this.mLocalMatrix.postTranslate(-this.mPivotX, -this.mPivotY);
            this.mLocalMatrix.postScale(this.mScaleX, this.mScaleY);
            this.mLocalMatrix.postRotate(this.mRotate, 0.0f, 0.0f);
            this.mLocalMatrix.postTranslate(this.mTranslateX + this.mPivotX, this.mTranslateY + this.mPivotY);
        }

        private void updateStateFromTypedArray(TypedArray typedArray, XmlPullParser xmlPullParser) {
            this.mThemeAttrs = null;
            this.mRotate = AndroidTypedArrayUtils.getNamedFloat(typedArray, xmlPullParser, "rotation", 5, this.mRotate);
            this.mPivotX = typedArray.getFloat(1, this.mPivotX);
            this.mPivotY = typedArray.getFloat(2, this.mPivotY);
            this.mScaleX = AndroidTypedArrayUtils.getNamedFloat(typedArray, xmlPullParser, "scaleX", 3, this.mScaleX);
            this.mScaleY = AndroidTypedArrayUtils.getNamedFloat(typedArray, xmlPullParser, "scaleY", 4, this.mScaleY);
            this.mTranslateX = AndroidTypedArrayUtils.getNamedFloat(typedArray, xmlPullParser, "translateX", 6, this.mTranslateX);
            this.mTranslateY = AndroidTypedArrayUtils.getNamedFloat(typedArray, xmlPullParser, "translateY", 7, this.mTranslateY);
            String string = typedArray.getString(0);
            if (string != null) {
                this.mGroupName = string;
            }
            updateLocalMatrix();
        }

        public ArrayList<Object> getChildren() {
            return this.mChildren;
        }

        public String getGroupName() {
            return this.mGroupName;
        }

        public float getPivotX() {
            return this.mPivotX;
        }

        public float getPivotY() {
            return this.mPivotY;
        }

        public float getRotation() {
            return this.mRotate;
        }

        public float getScaleX() {
            return this.mScaleX;
        }

        public float getScaleY() {
            return this.mScaleY;
        }

        public float getTranslateX() {
            return this.mTranslateX;
        }

        public float getTranslateY() {
            return this.mTranslateY;
        }

        public void inflate(Resources resources, AttributeSet attributeSet, Resources.Theme theme, XmlPullParser xmlPullParser) {
            TypedArray typedArrayObtainAttributesExtra = VectorDrawableCommonLocal.obtainAttributesExtra(resources, theme, attributeSet, AndroidResources.styleable_VectorDrawableGroup);
            updateStateFromTypedArray(typedArrayObtainAttributesExtra, xmlPullParser);
            typedArrayObtainAttributesExtra.recycle();
        }

        public void setPivotX(float f) {
            if (f != this.mPivotX) {
                this.mPivotX = f;
                updateLocalMatrix();
            }
        }

        public void setPivotY(float f) {
            if (f != this.mPivotY) {
                this.mPivotY = f;
                updateLocalMatrix();
            }
        }

        public void setRotation(float f) {
            if (f != this.mRotate) {
                this.mRotate = f;
                updateLocalMatrix();
            }
        }

        public void setScaleX(float f) {
            if (f != this.mScaleX) {
                this.mScaleX = f;
                updateLocalMatrix();
            }
        }

        public void setScaleY(float f) {
            if (f != this.mScaleY) {
                this.mScaleY = f;
                updateLocalMatrix();
            }
        }

        public void setTranslateX(float f) {
            if (f != this.mTranslateX) {
                this.mTranslateX = f;
                updateLocalMatrix();
            }
        }

        public void setTranslateY(float f) {
            if (f != this.mTranslateY) {
                this.mTranslateY = f;
                updateLocalMatrix();
            }
        }

        public VGroup() {
            this.mChildren = new ArrayList<>();
            this.mRotate = 0.0f;
            this.mLocalMatrix = new Matrix();
            this.mStackedMatrix = new Matrix();
            this.mPivotX = 0.0f;
            this.mPivotY = 0.0f;
            this.mScaleX = 1.0f;
            this.mScaleY = 1.0f;
            this.mTranslateX = 0.0f;
            this.mTranslateY = 0.0f;
            this.mGroupName = null;
        }
    }
}
