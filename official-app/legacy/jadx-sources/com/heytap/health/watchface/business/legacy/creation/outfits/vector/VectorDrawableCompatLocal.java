package com.heytap.health.watchface.business.legacy.creation.outfits.vector;

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
import androidx.annotation.Keep;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.collection.ArrayMap;
import androidx.core.graphics.drawable.DrawableCompat;
import com.oplus.aiunit.vision.ltl;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Stack;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes19.dex */
@Keep
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
    private f mVectorState;

    public static class a extends d {
        public a() {
        }

        @Override // com.heytap.health.watchface.business.legacy.creation.outfits.vector.VectorDrawableCompatLocal.d
        public boolean b() {
            return true;
        }

        public void d(Resources resources, AttributeSet attributeSet, Resources.Theme theme, XmlPullParser xmlPullParser) {
            if (AndroidTypedArrayUtils.hasAttribute(xmlPullParser, "pathData")) {
                TypedArray typedArrayObtainAttributes = VectorDrawableCommonLocal.obtainAttributes(resources, theme, attributeSet, AndroidResources.STYLEABLE_VECTOR_DRAWABLE_CLIPPATH);
                e(typedArrayObtainAttributes);
                typedArrayObtainAttributes.recycle();
            }
        }

        public final void e(TypedArray typedArray) {
            String string = typedArray.getString(0);
            if (string != null) {
                this.b = string;
            }
            String string2 = typedArray.getString(1);
            if (string2 != null) {
                this.a = VectorPathParser.createNodesFromPathData(string2);
            }
        }

        public a(a aVar) {
            super(aVar);
        }
    }

    public static class f extends Drawable.ConstantState {
        public e a;
        public ColorStateList b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public Paint f6905c;
        public PorterDuff.Mode d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public Bitmap f6906e;
        public ColorStateList f;
        public PorterDuff.Mode g;
        public int h;
        public int i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public boolean f6907j;
        public boolean k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public boolean f6908l;

        public f(f fVar) {
            this.b = null;
            this.d = VectorDrawableCompatLocal.DEFAULT_TINT_MODE;
            if (fVar != null) {
                this.h = fVar.h;
                this.a = new e(fVar.a);
                if (fVar.a.g != null) {
                    this.a.g = new Paint(fVar.a.g);
                }
                if (fVar.a.f != null) {
                    this.a.f = new Paint(fVar.a.f);
                }
                this.b = fVar.b;
                this.d = fVar.d;
                this.k = fVar.k;
            }
        }

        public boolean a(int i, int i2) {
            return i == this.f6906e.getWidth() && i2 == this.f6906e.getHeight();
        }

        public boolean b() {
            return !this.f6908l && this.f == this.b && this.g == this.d && this.f6907j == this.k && this.i == this.a.t();
        }

        public void c(int i, int i2) {
            if (this.f6906e == null || !a(i, i2)) {
                this.f6906e = Bitmap.createBitmap(i, i2, Bitmap.Config.ARGB_8888);
                this.f6908l = true;
            }
        }

        public void d(Canvas canvas, ColorFilter colorFilter, Rect rect) {
            canvas.drawBitmap(this.f6906e, (Rect) null, rect, e(colorFilter));
        }

        public Paint e(ColorFilter colorFilter) {
            if (!f() && colorFilter == null) {
                return null;
            }
            if (this.f6905c == null) {
                Paint paint = new Paint();
                this.f6905c = paint;
                paint.setFilterBitmap(true);
            }
            this.f6905c.setAlpha(this.a.t());
            this.f6905c.setColorFilter(colorFilter);
            return this.f6905c;
        }

        public boolean f() {
            return ((float) this.a.t()) < 255.0f;
        }

        public void g() {
            this.f = this.b;
            this.g = this.d;
            this.i = this.a.t();
            this.f6907j = this.k;
            this.f6908l = false;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return this.h;
        }

        public void h(int i, int i2) {
            this.f6906e.eraseColor(0);
            this.a.o(new Canvas(this.f6906e), i, i2, null);
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        @NonNull
        public Drawable newDrawable() {
            return new VectorDrawableCompatLocal(this);
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        @NonNull
        public Drawable newDrawable(Resources resources) {
            return new VectorDrawableCompatLocal(this);
        }

        public f() {
            this.b = null;
            this.d = VectorDrawableCompatLocal.DEFAULT_TINT_MODE;
            this.a = new e();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int applyAlpha(int i, float f2) {
        return (i & 16777215) | (((int) (Color.alpha(i) * f2)) << 24);
    }

    @Nullable
    public static VectorDrawableCompatLocal create(@NonNull Resources resources, @DrawableRes int i, @Nullable Resources.Theme theme) {
        try {
            XmlResourceParser xml = resources.getXml(i);
            AttributeSet attributeSetAsAttributeSet = Xml.asAttributeSet(xml);
            int next = 0;
            while (next != 2 && next != 1) {
                next = xml.next();
            }
            if (next == 2) {
                return createFromXmlInner(resources, (XmlPullParser) xml, attributeSetAsAttributeSet, theme);
            }
            throw new XmlPullParserException("No start tag found");
        } catch (IOException unused) {
            ltl.b(TAG, "[create] --> IOException");
            return null;
        } catch (XmlPullParserException unused2) {
            ltl.b(TAG, "[create] --> XmlPullParserException");
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
        f fVar = this.mVectorState;
        e eVar = fVar.a;
        Stack stack = new Stack();
        stack.push(eVar.a);
        int eventType = xmlPullParser.getEventType();
        int depth = xmlPullParser.getDepth() + 1;
        while (eventType != 1) {
            if (xmlPullParser.getDepth() < depth && eventType == 3) {
                return;
            }
            if (eventType == 2) {
                String name = xmlPullParser.getName();
                c cVar = (c) stack.peek();
                if (TextUtils.equals("path", name)) {
                    b bVar = new b();
                    bVar.f(resources, attributeSet, theme, xmlPullParser);
                    cVar.a.add(bVar);
                    if (bVar.a() != null) {
                        eVar.b.put(bVar.a(), bVar);
                    }
                    fVar.h = bVar.f6899c | fVar.h;
                } else if (TextUtils.equals(SHAPE_CLIP_PATH, name)) {
                    a aVar = new a();
                    aVar.d(resources, attributeSet, theme, xmlPullParser);
                    cVar.a.add(aVar);
                    if (aVar.a() != null) {
                        eVar.b.put(aVar.a(), aVar);
                    }
                    fVar.h = aVar.f6899c | fVar.h;
                } else if (TextUtils.equals(SHAPE_GROUP, name)) {
                    c cVar2 = new c();
                    cVar2.d(resources, attributeSet, theme, xmlPullParser);
                    cVar.a.add(cVar2);
                    stack.push(cVar2);
                    if (cVar2.c() != null) {
                        eVar.b.put(cVar2.c(), cVar2);
                    }
                    fVar.h = cVar2.f6895c | fVar.h;
                }
            } else if (eventType == 3 && SHAPE_GROUP.equals(xmlPullParser.getName())) {
                stack.pop();
            }
            eventType = xmlPullParser.next();
        }
    }

    @SuppressLint({"WrongConstant"})
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
        f fVar = this.mVectorState;
        e eVar = fVar.a;
        fVar.d = parseTintModeCompat(AndroidTypedArrayUtils.getNamedInt(typedArray, xmlPullParser, "tintMode", 6));
        ColorStateList colorStateList = typedArray.getColorStateList(1);
        if (colorStateList != null) {
            fVar.b = colorStateList;
        }
        fVar.k = AndroidTypedArrayUtils.getNamedBoolean(typedArray, xmlPullParser, "autoMirrored", 5, fVar.k);
        eVar.f6903l = AndroidTypedArrayUtils.getNamedFloat(typedArray, xmlPullParser, "viewportWidth", 7, eVar.f6903l);
        eVar.m = AndroidTypedArrayUtils.getNamedFloat(typedArray, xmlPullParser, "viewportHeight", 8, eVar.m);
        if (eVar.f6903l <= 0.0f) {
            throw new XmlPullParserException(typedArray.getPositionDescription() + "<vector> tag requires viewportWidth > 0");
        }
        if (eVar.m <= 0.0f) {
            throw new XmlPullParserException(typedArray.getPositionDescription() + "<vector> tag requires viewportHeight > 0");
        }
        eVar.f6902j = typedArray.getDimension(3, eVar.f6902j);
        eVar.k = typedArray.getDimension(2, eVar.k);
        if (eVar.f6902j <= 0.0f) {
            throw new XmlPullParserException(typedArray.getPositionDescription() + "<vector> tag requires width > 0");
        }
        if (eVar.k <= 0.0f) {
            throw new XmlPullParserException(typedArray.getPositionDescription() + "<vector> tag requires height > 0");
        }
        eVar.u(AndroidTypedArrayUtils.getNamedFloat(typedArray, xmlPullParser, "alpha", 4, eVar.r()));
        String string = typedArray.getString(0);
        if (string != null) {
            eVar.i = string;
            eVar.b.put(string, eVar);
        }
    }

    private PorterDuffColorFilter updateTintFilter(ColorStateList colorStateList, PorterDuff.Mode mode) {
        if (colorStateList == null || mode == null) {
            return null;
        }
        return new PorterDuffColorFilter(colorStateList.getColorForState(getState(), 0), mode);
    }

    @Override // com.heytap.health.watchface.business.legacy.creation.outfits.vector.VectorDrawableCommonLocal, android.graphics.drawable.Drawable
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

    @Override // com.heytap.health.watchface.business.legacy.creation.outfits.vector.VectorDrawableCommonLocal, android.graphics.drawable.Drawable
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
        this.mVectorState.c(iMin, iMin2);
        if (!this.mAllowCaching) {
            this.mVectorState.h(iMin, iMin2);
        } else if (!this.mVectorState.b()) {
            this.mVectorState.h(iMin, iMin2);
            this.mVectorState.g();
        }
        this.mVectorState.d(canvas, colorFilter, this.mTmpBounds);
        canvas.restoreToCount(iSave);
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        Drawable drawable = this.mDelegateDrawable;
        return drawable != null ? DrawableCompat.getAlpha(drawable) : this.mVectorState.a.t();
    }

    @Override // android.graphics.drawable.Drawable
    public int getChangingConfigurations() {
        Drawable drawable = this.mDelegateDrawable;
        if (drawable != null) {
            return drawable.getChangingConfigurations();
        }
        return this.mVectorState.getChangingConfigurations() | super.getChangingConfigurations();
    }

    @Override // com.heytap.health.watchface.business.legacy.creation.outfits.vector.VectorDrawableCommonLocal, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ ColorFilter getColorFilter() {
        return super.getColorFilter();
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable.ConstantState getConstantState() {
        if (this.mDelegateDrawable != null) {
            return new g(this.mDelegateDrawable.getConstantState());
        }
        this.mVectorState.h = getChangingConfigurations();
        return this.mVectorState;
    }

    @Override // com.heytap.health.watchface.business.legacy.creation.outfits.vector.VectorDrawableCommonLocal, android.graphics.drawable.Drawable
    @NonNull
    public /* bridge */ /* synthetic */ Drawable getCurrent() {
        return super.getCurrent();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        Drawable drawable = this.mDelegateDrawable;
        return drawable != null ? drawable.getIntrinsicHeight() : (int) this.mVectorState.a.k;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        Drawable drawable = this.mDelegateDrawable;
        return drawable != null ? drawable.getIntrinsicWidth() : (int) this.mVectorState.a.f6902j;
    }

    @Override // com.heytap.health.watchface.business.legacy.creation.outfits.vector.VectorDrawableCommonLocal, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ int getMinimumHeight() {
        return super.getMinimumHeight();
    }

    @Override // com.heytap.health.watchface.business.legacy.creation.outfits.vector.VectorDrawableCommonLocal, android.graphics.drawable.Drawable
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

    @Override // com.heytap.health.watchface.business.legacy.creation.outfits.vector.VectorDrawableCommonLocal, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ boolean getPadding(@NonNull Rect rect) {
        return super.getPadding(rect);
    }

    @Override // com.heytap.health.watchface.business.legacy.creation.outfits.vector.VectorDrawableCommonLocal, android.graphics.drawable.Drawable
    @NonNull
    public /* bridge */ /* synthetic */ int[] getState() {
        return super.getState();
    }

    public Object getTargetByName(String str) {
        return this.mVectorState.a.b.get(str);
    }

    @Override // com.heytap.health.watchface.business.legacy.creation.outfits.vector.VectorDrawableCommonLocal, android.graphics.drawable.Drawable
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
            ltl.b(TAG, "[inflate] --> IOException | XmlPullParserException");
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
        return drawable != null ? DrawableCompat.isAutoMirrored(drawable) : this.mVectorState.k;
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        f fVar;
        ColorStateList colorStateList;
        Drawable drawable = this.mDelegateDrawable;
        if (drawable != null) {
            return drawable.isStateful();
        }
        return super.isStateful() || !((fVar = this.mVectorState) == null || (colorStateList = fVar.b) == null || !colorStateList.isStateful());
    }

    @Override // com.heytap.health.watchface.business.legacy.creation.outfits.vector.VectorDrawableCommonLocal, android.graphics.drawable.Drawable
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
            this.mVectorState = new f(this.mVectorState);
            this.mMutated = true;
        }
        return this;
    }

    @Override // com.heytap.health.watchface.business.legacy.creation.outfits.vector.VectorDrawableCommonLocal, android.graphics.drawable.Drawable
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
        f fVar = this.mVectorState;
        ColorStateList colorStateList = fVar.b;
        if (colorStateList == null || (mode = fVar.d) == null) {
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
        } else if (this.mVectorState.a.t() != i) {
            this.mVectorState.a.v(i);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setAutoMirrored(boolean z) {
        Drawable drawable = this.mDelegateDrawable;
        if (drawable != null) {
            DrawableCompat.setAutoMirrored(drawable, z);
        } else {
            this.mVectorState.k = z;
        }
    }

    @Override // com.heytap.health.watchface.business.legacy.creation.outfits.vector.VectorDrawableCommonLocal, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setChangingConfigurations(int i) {
        super.setChangingConfigurations(i);
    }

    @Override // com.heytap.health.watchface.business.legacy.creation.outfits.vector.VectorDrawableCommonLocal, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setColorFilter(int i, @NonNull PorterDuff.Mode mode) {
        super.setColorFilter(i, mode);
    }

    @Override // com.heytap.health.watchface.business.legacy.creation.outfits.vector.VectorDrawableCommonLocal, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setFilterBitmap(boolean z) {
        super.setFilterBitmap(z);
    }

    @Override // com.heytap.health.watchface.business.legacy.creation.outfits.vector.VectorDrawableCommonLocal, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setHotspot(float f2, float f3) {
        super.setHotspot(f2, f3);
    }

    @Override // com.heytap.health.watchface.business.legacy.creation.outfits.vector.VectorDrawableCommonLocal, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setHotspotBounds(int i, int i2, int i3, int i4) {
        super.setHotspotBounds(i, i2, i3, i4);
    }

    @Override // com.heytap.health.watchface.business.legacy.creation.outfits.vector.VectorDrawableCommonLocal, android.graphics.drawable.Drawable
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
        f fVar = this.mVectorState;
        if (fVar.b != colorStateList) {
            fVar.b = colorStateList;
            this.mTintFilter = updateTintFilter(colorStateList, fVar.d);
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
        f fVar = this.mVectorState;
        if (fVar.d != mode) {
            fVar.d = mode;
            this.mTintFilter = updateTintFilter(fVar.b, mode);
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

    public static class d {
        public VectorPathParser.b[] a;
        public String b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f6899c;

        public d() {
            this.a = null;
        }

        public String a() {
            return this.b;
        }

        public boolean b() {
            return false;
        }

        public void c(Path path) {
            path.reset();
            VectorPathParser.b[] bVarArr = this.a;
            if (bVarArr != null) {
                VectorPathParser.b.d(bVarArr, path);
            }
        }

        public d(d dVar) {
            this.a = null;
            this.b = dVar.b;
            this.f6899c = dVar.f6899c;
            this.a = VectorPathParser.deepCopyNodes(dVar.a);
        }
    }

    public static class g extends Drawable.ConstantState {
        public final Drawable.ConstantState a;

        public g(Drawable.ConstantState constantState) {
            this.a = constantState;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public boolean canApplyTheme() {
            return this.a.canApplyTheme();
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return this.a.getChangingConfigurations();
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        @NonNull
        public Drawable newDrawable() {
            VectorDrawableCompatLocal vectorDrawableCompatLocal = new VectorDrawableCompatLocal();
            vectorDrawableCompatLocal.mDelegateDrawable = this.a.newDrawable();
            return vectorDrawableCompatLocal;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        @NonNull
        public Drawable newDrawable(Resources resources) {
            VectorDrawableCompatLocal vectorDrawableCompatLocal = new VectorDrawableCompatLocal();
            vectorDrawableCompatLocal.mDelegateDrawable = this.a.newDrawable(resources);
            return vectorDrawableCompatLocal;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        @NonNull
        public Drawable newDrawable(Resources resources, Resources.Theme theme) {
            VectorDrawableCompatLocal vectorDrawableCompatLocal = new VectorDrawableCompatLocal();
            vectorDrawableCompatLocal.mDelegateDrawable = this.a.newDrawable(resources, theme);
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
        this.mVectorState = new f();
    }

    @Override // android.graphics.drawable.Drawable
    public void inflate(@NonNull Resources resources, @NonNull XmlPullParser xmlPullParser, @NonNull AttributeSet attributeSet, Resources.Theme theme) {
        try {
            Drawable drawable = this.mDelegateDrawable;
            if (drawable != null) {
                DrawableCompat.inflate(drawable, resources, xmlPullParser, attributeSet, theme);
                return;
            }
            f fVar = this.mVectorState;
            fVar.a = new e();
            TypedArray typedArrayObtainAttributes = VectorDrawableCommonLocal.obtainAttributes(resources, theme, attributeSet, AndroidResources.STYLEABLE_VECTOR_DRAWABLE_TYPE_ARRAY);
            updateStateFromTypedArray(typedArrayObtainAttributes, xmlPullParser);
            typedArrayObtainAttributes.recycle();
            fVar.h = getChangingConfigurations();
            fVar.f6908l = true;
            inflateInternal(resources, xmlPullParser, attributeSet, theme);
            this.mTintFilter = updateTintFilter(fVar.b, fVar.d);
        } catch (IOException | XmlPullParserException unused) {
            ltl.b(TAG, "[inflate] --> IOException | XmlPullParserException");
        }
    }

    private VectorDrawableCompatLocal(@NonNull f fVar) {
        this.mTmpFloats = new float[9];
        this.mTmpMatrix = new Matrix();
        this.mTmpBounds = new Rect();
        this.mAllowCaching = true;
        this.mVectorState = fVar;
        this.mTintFilter = updateTintFilter(fVar.b, fVar.d);
    }

    public static class b extends d {
        public int d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public float f6891e;
        public int f;
        public float g;
        public int h;
        public float i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public float f6892j;
        public float k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public float f6893l;
        public Paint.Cap m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public Paint.Join f6894n;
        public float o;
        public int[] p;

        public b() {
            this.d = 0;
            this.f6891e = 0.0f;
            this.f = 0;
            this.g = 1.0f;
            this.i = 1.0f;
            this.f6892j = 0.0f;
            this.k = 1.0f;
            this.f6893l = 0.0f;
            this.m = Paint.Cap.BUTT;
            this.f6894n = Paint.Join.MITER;
            this.o = 4.0f;
        }

        @Override // com.heytap.health.watchface.business.legacy.creation.outfits.vector.VectorDrawableCompatLocal.d
        public /* bridge */ /* synthetic */ String a() {
            return super.a();
        }

        @Override // com.heytap.health.watchface.business.legacy.creation.outfits.vector.VectorDrawableCompatLocal.d
        public /* bridge */ /* synthetic */ boolean b() {
            return super.b();
        }

        @Override // com.heytap.health.watchface.business.legacy.creation.outfits.vector.VectorDrawableCompatLocal.d
        public /* bridge */ /* synthetic */ void c(Path path) {
            super.c(path);
        }

        public final Paint.Cap d(int i, Paint.Cap cap) {
            if (i == 0) {
                return Paint.Cap.BUTT;
            }
            if (i != 1) {
                return i != 2 ? cap : Paint.Cap.SQUARE;
            }
            return Paint.Cap.ROUND;
        }

        public final Paint.Join e(int i, Paint.Join join) {
            if (i == 0) {
                return Paint.Join.MITER;
            }
            if (i != 1) {
                return i != 2 ? join : Paint.Join.BEVEL;
            }
            return Paint.Join.ROUND;
        }

        public void f(Resources resources, AttributeSet attributeSet, Resources.Theme theme, XmlPullParser xmlPullParser) {
            TypedArray typedArrayObtainAttributes = VectorDrawableCommonLocal.obtainAttributes(resources, theme, attributeSet, AndroidResources.STYLEABLE_VECTOR_DRAWABLE_PATH);
            h(typedArrayObtainAttributes, xmlPullParser);
            typedArrayObtainAttributes.recycle();
        }

        public void g(int i) {
            this.f = i;
        }

        public final void h(TypedArray typedArray, XmlPullParser xmlPullParser) {
            this.p = null;
            if (AndroidTypedArrayUtils.hasAttribute(xmlPullParser, "pathData")) {
                String string = typedArray.getString(0);
                if (string != null) {
                    this.b = string;
                }
                String string2 = typedArray.getString(2);
                if (string2 != null) {
                    this.a = VectorPathParser.createNodesFromPathData(string2);
                }
                int namedInt = AndroidTypedArrayUtils.getNamedInt(typedArray, xmlPullParser, "strokeLineJoin", 9);
                int namedInt2 = AndroidTypedArrayUtils.getNamedInt(typedArray, xmlPullParser, "strokeLineCap", 8);
                this.f = AndroidTypedArrayUtils.getNamedColor(typedArray, xmlPullParser, "fillColor", 1, this.f);
                this.i = AndroidTypedArrayUtils.getNamedFloat(typedArray, xmlPullParser, "fillAlpha", 12, this.i);
                this.m = d(namedInt2, this.m);
                this.f6894n = e(namedInt, this.f6894n);
                this.o = AndroidTypedArrayUtils.getNamedFloat(typedArray, xmlPullParser, "strokeMiterLimit", 10, this.o);
                this.d = AndroidTypedArrayUtils.getNamedColor(typedArray, xmlPullParser, "strokeColor", 3, this.d);
                this.g = AndroidTypedArrayUtils.getNamedFloat(typedArray, xmlPullParser, "strokeAlpha", 11, this.g);
                this.f6891e = AndroidTypedArrayUtils.getNamedFloat(typedArray, xmlPullParser, "strokeWidth", 4, this.f6891e);
                this.k = AndroidTypedArrayUtils.getNamedFloat(typedArray, xmlPullParser, "trimPathEnd", 6, this.k);
                this.f6893l = AndroidTypedArrayUtils.getNamedFloat(typedArray, xmlPullParser, "trimPathOffset", 7, this.f6893l);
                this.f6892j = AndroidTypedArrayUtils.getNamedFloat(typedArray, xmlPullParser, "trimPathStart", 5, this.f6892j);
            }
        }

        public b(b bVar) {
            super(bVar);
            this.d = 0;
            this.f6891e = 0.0f;
            this.f = 0;
            this.g = 1.0f;
            this.i = 1.0f;
            this.f6892j = 0.0f;
            this.k = 1.0f;
            this.f6893l = 0.0f;
            this.m = Paint.Cap.BUTT;
            this.f6894n = Paint.Join.MITER;
            this.o = 4.0f;
            this.p = bVar.p;
            this.d = bVar.d;
            this.f6891e = bVar.f6891e;
            this.g = bVar.g;
            this.f = bVar.f;
            this.h = bVar.h;
            this.i = bVar.i;
            this.f6892j = bVar.f6892j;
            this.k = bVar.k;
            this.f6893l = bVar.f6893l;
            this.m = bVar.m;
            this.f6894n = bVar.f6894n;
            this.o = bVar.o;
        }
    }

    public static class e {
        public static final Matrix p = new Matrix();
        public final c a;
        public final ArrayMap<String, Object> b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Path f6900c;
        public final Path d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final Matrix f6901e;
        public Paint f;
        public Paint g;
        public PathMeasure h;
        public String i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public float f6902j;
        public float k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public float f6903l;
        public float m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public int f6904n;
        public int o;

        public e() {
            this.b = new ArrayMap<>();
            this.f6901e = new Matrix();
            this.i = null;
            this.f6902j = 0.0f;
            this.k = 0.0f;
            this.f6903l = 0.0f;
            this.m = 0.0f;
            this.f6904n = 255;
            this.a = new c();
            this.f6900c = new Path();
            this.d = new Path();
        }

        public static float n(float f, float f2, float f3, float f4) {
            return (f * f4) - (f2 * f3);
        }

        public void o(Canvas canvas, int i, int i2, ColorFilter colorFilter) {
            p(this.a, p, canvas, i, i2, colorFilter);
        }

        public final void p(c cVar, Matrix matrix, Canvas canvas, int i, int i2, ColorFilter colorFilter) {
            cVar.f6896e.set(matrix);
            cVar.f6896e.preConcat(cVar.d);
            canvas.save();
            for (int i3 = 0; i3 < cVar.a.size(); i3++) {
                Object obj = cVar.a.get(i3);
                if (obj instanceof c) {
                    p((c) obj, cVar.f6896e, canvas, i, i2, colorFilter);
                } else if (obj instanceof d) {
                    q(cVar, (d) obj, canvas, i, i2, colorFilter);
                }
            }
            canvas.restore();
        }

        public final void q(c cVar, d dVar, Canvas canvas, int i, int i2, ColorFilter colorFilter) {
            float f = i / this.f6903l;
            float f2 = i2 / this.m;
            float fMin = Math.min(f, f2);
            Matrix matrix = cVar.f6896e;
            this.f6901e.set(matrix);
            this.f6901e.postScale(f, f2);
            float fS = s(matrix);
            if (fS == 0.0f) {
                return;
            }
            dVar.c(this.f6900c);
            Path path = this.f6900c;
            this.d.reset();
            if (dVar.b()) {
                this.d.addPath(path, this.f6901e);
                canvas.clipPath(this.d);
                return;
            }
            b bVar = (b) dVar;
            float f3 = bVar.f6892j;
            if (f3 != 0.0f || bVar.k != 1.0f) {
                float f4 = bVar.f6893l;
                float f5 = (f3 + f4) % 1.0f;
                float f6 = (bVar.k + f4) % 1.0f;
                if (this.h == null) {
                    this.h = new PathMeasure();
                }
                this.h.setPath(this.f6900c, false);
                float length = this.h.getLength();
                float f7 = f5 * length;
                float f8 = f6 * length;
                path.reset();
                if (f7 > f8) {
                    this.h.getSegment(f7, length, path, true);
                    this.h.getSegment(0.0f, f8, path, true);
                } else {
                    this.h.getSegment(f7, f8, path, true);
                }
                path.rLineTo(0.0f, 0.0f);
            }
            this.d.addPath(path, this.f6901e);
            if (bVar.f != 0) {
                if (this.g == null) {
                    Paint paint = new Paint();
                    this.g = paint;
                    paint.setStyle(Paint.Style.FILL);
                    this.g.setAntiAlias(true);
                }
                Paint paint2 = this.g;
                paint2.setColor(VectorDrawableCompatLocal.applyAlpha(bVar.f, bVar.i));
                paint2.setColorFilter(colorFilter);
                canvas.drawPath(this.d, paint2);
            }
            if (bVar.d != 0) {
                if (this.f == null) {
                    Paint paint3 = new Paint();
                    this.f = paint3;
                    paint3.setStyle(Paint.Style.STROKE);
                    this.f.setAntiAlias(true);
                }
                Paint paint4 = this.f;
                Paint.Join join = bVar.f6894n;
                if (join != null) {
                    paint4.setStrokeJoin(join);
                }
                Paint.Cap cap = bVar.m;
                if (cap != null) {
                    paint4.setStrokeCap(cap);
                }
                paint4.setStrokeMiter(bVar.o);
                paint4.setColor(VectorDrawableCompatLocal.applyAlpha(bVar.d, bVar.g));
                paint4.setColorFilter(colorFilter);
                paint4.setStrokeWidth(bVar.f6891e * fMin * fS);
                canvas.drawPath(this.d, paint4);
            }
        }

        public float r() {
            return t() / 255.0f;
        }

        public final float s(Matrix matrix) {
            float[] fArr = {0.0f, 1.0f, 1.0f, 0.0f};
            matrix.mapVectors(fArr);
            float fHypot = (float) Math.hypot(fArr[0], fArr[1]);
            float fHypot2 = (float) Math.hypot(fArr[2], fArr[3]);
            float fN = n(fArr[0], fArr[1], fArr[2], fArr[3]);
            float fMax = Math.max(fHypot, fHypot2);
            if (fMax > 0.0f) {
                return Math.abs(fN) / fMax;
            }
            return 0.0f;
        }

        public int t() {
            return this.f6904n;
        }

        public void u(float f) {
            v((int) (f * 255.0f));
        }

        public void v(int i) {
            this.f6904n = i;
        }

        public e(e eVar) {
            ArrayMap<String, Object> arrayMap = new ArrayMap<>();
            this.b = arrayMap;
            this.f6901e = new Matrix();
            this.i = null;
            this.f6902j = 0.0f;
            this.k = 0.0f;
            this.f6903l = 0.0f;
            this.m = 0.0f;
            this.f6904n = 255;
            this.a = new c(eVar.a, arrayMap);
            this.f6900c = new Path(eVar.f6900c);
            this.d = new Path(eVar.d);
            this.f6902j = eVar.f6902j;
            this.k = eVar.k;
            this.f6903l = eVar.f6903l;
            this.m = eVar.m;
            this.o = eVar.o;
            this.f6904n = eVar.f6904n;
            this.i = eVar.i;
            String str = eVar.i;
            if (str != null) {
                arrayMap.put(str, this);
            }
        }
    }

    public static class c {
        public final ArrayList<Object> a;
        public float b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f6895c;
        public final Matrix d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final Matrix f6896e;
        public float f;
        public float g;
        public float h;
        public float i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public float f6897j;
        public float k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public int[] f6898l;
        public String m;

        public c(c cVar, ArrayMap<String, Object> arrayMap) {
            d aVar;
            this.a = new ArrayList<>();
            this.b = 0.0f;
            Matrix matrix = new Matrix();
            this.d = matrix;
            this.f6896e = new Matrix();
            this.f = 0.0f;
            this.g = 0.0f;
            this.h = 1.0f;
            this.i = 1.0f;
            this.f6897j = 0.0f;
            this.k = 0.0f;
            this.m = null;
            this.b = cVar.b;
            this.f = cVar.f;
            this.g = cVar.g;
            this.h = cVar.h;
            this.i = cVar.i;
            this.f6897j = cVar.f6897j;
            this.k = cVar.k;
            this.f6898l = cVar.f6898l;
            String str = cVar.m;
            this.m = str;
            this.f6895c = cVar.f6895c;
            if (str != null) {
                arrayMap.put(str, this);
            }
            matrix.set(cVar.d);
            ArrayList<Object> arrayList = cVar.a;
            for (int i = 0; i < arrayList.size(); i++) {
                Object obj = arrayList.get(i);
                if (obj instanceof c) {
                    this.a.add(new c((c) obj, arrayMap));
                } else {
                    if (obj instanceof b) {
                        aVar = new b((b) obj);
                    } else {
                        if (!(obj instanceof a)) {
                            throw new IllegalStateException("Unknown object in the tree!");
                        }
                        aVar = new a((a) obj);
                    }
                    this.a.add(aVar);
                    String str2 = aVar.b;
                    if (str2 != null) {
                        arrayMap.put(str2, aVar);
                    }
                }
            }
        }

        public String c() {
            return this.m;
        }

        public void d(Resources resources, AttributeSet attributeSet, Resources.Theme theme, XmlPullParser xmlPullParser) {
            TypedArray typedArrayObtainAttributes = VectorDrawableCommonLocal.obtainAttributes(resources, theme, attributeSet, AndroidResources.STYLEABLE_VECTOR_DRAWABLE_GROUP);
            f(typedArrayObtainAttributes, xmlPullParser);
            typedArrayObtainAttributes.recycle();
        }

        public final void e() {
            this.d.reset();
            this.d.postTranslate(-this.f, -this.g);
            this.d.postScale(this.h, this.i);
            this.d.postRotate(this.b, 0.0f, 0.0f);
            this.d.postTranslate(this.f6897j + this.f, this.k + this.g);
        }

        public final void f(TypedArray typedArray, XmlPullParser xmlPullParser) {
            this.f6898l = null;
            this.b = AndroidTypedArrayUtils.getNamedFloat(typedArray, xmlPullParser, "rotation", 5, this.b);
            this.f = typedArray.getFloat(2, this.f);
            this.g = typedArray.getFloat(2, this.g);
            this.h = AndroidTypedArrayUtils.getNamedFloat(typedArray, xmlPullParser, "scaleX", 3, this.h);
            this.i = AndroidTypedArrayUtils.getNamedFloat(typedArray, xmlPullParser, "scaleY", 4, this.i);
            this.f6897j = AndroidTypedArrayUtils.getNamedFloat(typedArray, xmlPullParser, "translateX", 6, this.f6897j);
            this.k = AndroidTypedArrayUtils.getNamedFloat(typedArray, xmlPullParser, "translateY", 7, this.k);
            String string = typedArray.getString(0);
            if (string != null) {
                this.m = string;
            }
            e();
        }

        public c() {
            this.a = new ArrayList<>();
            this.b = 0.0f;
            this.d = new Matrix();
            this.f6896e = new Matrix();
            this.f = 0.0f;
            this.g = 0.0f;
            this.h = 1.0f;
            this.i = 1.0f;
            this.f6897j = 0.0f;
            this.k = 0.0f;
            this.m = null;
        }
    }
}
