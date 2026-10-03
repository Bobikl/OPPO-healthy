package com.heytap.sports.record.details.cards.widget;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.widget.RelativeLayout;
import androidx.compose.runtime.internal.StabilityInferred;
import com.oplus.aiunit.vision.lo9;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0013\b\u0016\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012¢\u0006\u0004\b\u0014\u0010\u0015B\u001d\b\u0016\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016¢\u0006\u0004\b\u0014\u0010\u0018B%\b\u0016\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016\u0012\u0006\u0010\u001a\u001a\u00020\u0019¢\u0006\u0004\b\u0014\u0010\u001bB-\b\u0016\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016\u0012\u0006\u0010\u001a\u001a\u00020\u0019\u0012\u0006\u0010\u001c\u001a\u00020\u0019¢\u0006\u0004\b\u0014\u0010\u001dJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0014R\u0014\u0010\t\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\bR$\u0010\u0011\u001a\u0004\u0018\u00010\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010¨\u0006\u001e"}, d2 = {"Lcom/heytap/sports/record/details/cards/widget/MapContainer;", "Landroid/widget/RelativeLayout;", "Landroid/graphics/Canvas;", "canvas", "", "dispatchDraw", "Landroid/graphics/Paint;", "i", "Landroid/graphics/Paint;", lo9.TAG_DEFAULT_CREATION_PAINT, "Landroid/graphics/Bitmap;", "j", "Landroid/graphics/Bitmap;", "getMapBitmap", "()Landroid/graphics/Bitmap;", "setMapBitmap", "(Landroid/graphics/Bitmap;)V", "mapBitmap", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Landroid/util/AttributeSet;", "attrs", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "defStyleRes", "(Landroid/content/Context;Landroid/util/AttributeSet;II)V", "sport_impl_release"}, k = 1, mv = {1, 8, 0})
public final class MapContainer extends RelativeLayout {
    public static final int $stable = 8;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @NotNull
    public final Paint paint;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public Bitmap mapBitmap;

    public MapContainer(@Nullable Context context) {
        this(context, null);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(@NotNull Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        super.dispatchDraw(canvas);
        Bitmap bitmap = this.mapBitmap;
        if ((bitmap != null ? bitmap.getWidth() : 0) > 0) {
            Bitmap bitmap2 = this.mapBitmap;
            Intrinsics.checkNotNull(bitmap2);
            if (bitmap2.getWidth() == getWidth()) {
                Bitmap bitmap3 = this.mapBitmap;
                Intrinsics.checkNotNull(bitmap3);
                canvas.drawBitmap(bitmap3, 0.0f, 0.0f, this.paint);
                return;
            }
            canvas.save();
            float width = getWidth() * 1.0f;
            Bitmap bitmap4 = this.mapBitmap;
            Intrinsics.checkNotNull(bitmap4);
            float width2 = width / bitmap4.getWidth();
            canvas.scale(width2, width2);
            Bitmap bitmap5 = this.mapBitmap;
            Intrinsics.checkNotNull(bitmap5);
            canvas.drawBitmap(bitmap5, 0.0f, 0.0f, this.paint);
            canvas.restore();
        }
    }

    @Nullable
    public final Bitmap getMapBitmap() {
        return this.mapBitmap;
    }

    public final void setMapBitmap(@Nullable Bitmap bitmap) {
        this.mapBitmap = bitmap;
    }

    public MapContainer(@Nullable Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public MapContainer(@Nullable Context context, @Nullable AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0);
    }

    public MapContainer(@Nullable Context context, @Nullable AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        this.paint = paint;
    }
}
