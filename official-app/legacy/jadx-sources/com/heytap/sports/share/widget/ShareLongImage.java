package com.heytap.sports.share.widget;

import android.content.Context;
import android.graphics.Bitmap;
import android.opengl.EGL14;
import android.opengl.EGLConfig;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import android.opengl.GLES20;
import android.util.AttributeSet;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.compose.runtime.internal.StabilityInferred;
import com.oplus.aiunit.vision.a7b;
import com.oplus.aiunit.vision.k18;
import java.util.ArrayList;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.collections.CollectionsKt__CollectionsJVMKt;
import p010kotlin.jvm.JvmOverloads;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes2.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0013\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0004\u001a\u00020\u0002H\u0002J\u000e\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005J\u001e\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00050\u000b2\u0006\u0010\t\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\u0002H\u0002R\u0014\u0010\u0010\u001a\u00020\r8\u0002X\u0082D¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f¨\u0006\u0018"}, d2 = {"Lcom/heytap/sports/share/widget/ShareLongImage;", "Landroid/widget/LinearLayout;", "", "getMaxTextureSize", "getMaxTextureEgl14", "Landroid/graphics/Bitmap;", "bitmap", "", "a", "fullBitmap", "segmentHeight", "", "b", "", "i", "Ljava/lang/String;", "TAG", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "sport_impl_release"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nShareLongImage.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ShareLongImage.kt\ncom/heytap/sports/share/widget/ShareLongImage\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,148:1\n1855#2,2:149\n*S KotlinDebug\n*F\n+ 1 ShareLongImage.kt\ncom/heytap/sports/share/widget/ShareLongImage\n*L\n45#1:149,2\n*E\n"})
public final class ShareLongImage extends LinearLayout {
    public static final int $stable = 0;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @NotNull
    public final String TAG;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public ShareLongImage(@NotNull Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    private final int getMaxTextureEgl14() {
        EGLDisplay eGLDisplayEglGetDisplay = EGL14.eglGetDisplay(0);
        int[] iArr = new int[2];
        EGL14.eglInitialize(eGLDisplayEglGetDisplay, iArr, 0, iArr, 1);
        EGLConfig[] eGLConfigArr = new EGLConfig[1];
        int[] iArr2 = new int[1];
        EGL14.eglChooseConfig(eGLDisplayEglGetDisplay, new int[]{12351, 12430, 12329, 0, 12352, 4, 12339, 1, 12344}, 0, eGLConfigArr, 0, 1, iArr2, 0);
        if (iArr2[0] == 0) {
            return 0;
        }
        EGLConfig eGLConfig = eGLConfigArr[0];
        Intrinsics.checkNotNull(eGLConfig);
        EGLSurface eGLSurfaceEglCreatePbufferSurface = EGL14.eglCreatePbufferSurface(eGLDisplayEglGetDisplay, eGLConfig, new int[]{12375, 64, 12374, 64, 12344}, 0);
        EGLContext eGLContextEglCreateContext = EGL14.eglCreateContext(eGLDisplayEglGetDisplay, eGLConfig, EGL14.EGL_NO_CONTEXT, new int[]{12440, 2, 12344}, 0);
        EGL14.eglMakeCurrent(eGLDisplayEglGetDisplay, eGLSurfaceEglCreatePbufferSurface, eGLSurfaceEglCreatePbufferSurface, eGLContextEglCreateContext);
        int[] iArr3 = new int[1];
        GLES20.glGetIntegerv(k18.GL_MAX_TEXTURE_SIZE, iArr3, 0);
        EGLSurface eGLSurface = EGL14.EGL_NO_SURFACE;
        EGL14.eglMakeCurrent(eGLDisplayEglGetDisplay, eGLSurface, eGLSurface, EGL14.EGL_NO_CONTEXT);
        EGL14.eglDestroySurface(eGLDisplayEglGetDisplay, eGLSurfaceEglCreatePbufferSurface);
        EGL14.eglDestroyContext(eGLDisplayEglGetDisplay, eGLContextEglCreateContext);
        EGL14.eglTerminate(eGLDisplayEglGetDisplay);
        return iArr3[0];
    }

    private final int getMaxTextureSize() {
        try {
            return getMaxTextureEgl14();
        } catch (Exception unused) {
            return 0;
        }
    }

    public final boolean a(@NotNull Bitmap bitmap) {
        List<Bitmap> listListOf;
        boolean z;
        Intrinsics.checkNotNullParameter(bitmap, "bitmap");
        removeAllViews();
        int maxTextureSize = getMaxTextureSize();
        a7b.f(this.TAG, "setBitmap. segmentHeight: " + maxTextureSize);
        if (maxTextureSize <= 0 || bitmap.getHeight() <= maxTextureSize) {
            listListOf = CollectionsKt__CollectionsJVMKt.listOf(bitmap);
            z = false;
        } else {
            listListOf = b(bitmap, maxTextureSize);
            z = true;
        }
        for (Bitmap bitmap2 : listListOf) {
            ImageView imageView = new ImageView(getContext());
            imageView.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
            imageView.setAdjustViewBounds(true);
            imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
            imageView.setImageBitmap(bitmap2);
            imageView.setForceDarkAllowed(false);
            addView(imageView);
        }
        return z;
    }

    public final List<Bitmap> b(Bitmap fullBitmap, int segmentHeight) {
        ArrayList arrayList = new ArrayList();
        int height = fullBitmap.getHeight();
        int i = 0;
        while (i < height) {
            int iMin = Math.min(segmentHeight, height - i);
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(fullBitmap, 0, i, fullBitmap.getWidth(), iMin);
            Intrinsics.checkNotNullExpressionValue(bitmapCreateBitmap, "createBitmap(\n          …    // 子图高度\n            )");
            arrayList.add(bitmapCreateBitmap);
            i += iMin;
        }
        return arrayList;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public ShareLongImage(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public /* synthetic */ ShareLongImage(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public ShareLongImage(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        this.TAG = "ShareLongImage";
        setOrientation(1);
    }
}
