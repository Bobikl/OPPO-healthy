package com.heytap.health.watchface.business.creation.category.video.view;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import com.heytap.databaseengine.model.UserInfo;
import com.heytap.health.watchface.R$dimen;
import com.heytap.health.watchface.R$drawable;
import com.heytap.log.formatter.LogFieldKey;
import com.oplus.smartenginehelper.entity.ClickApiEntity;
import io.protostuff.MapSchema;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.JvmOverloads;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.math.MathKt__MathJVMKt;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u0001\u0016B'\b\u0007\u0012\u0006\u00106\u001a\u000205\u0012\n\b\u0002\u00108\u001a\u0004\u0018\u000107\u0012\b\b\u0002\u00109\u001a\u00020#¢\u0006\u0004\b:\u0010;J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006J\u000e\u0010\n\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u0006J\u0010\u0010\r\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u000bH\u0014J\u0010\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u000eH\u0016J\b\u0010\u0012\u001a\u00020\u0004H\u0002J\u0010\u0010\u0013\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u000bH\u0002J\u0010\u0010\u0016\u001a\u00020\u00102\u0006\u0010\u0015\u001a\u00020\u0014H\u0002J\u0010\u0010\u0017\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u000eH\u0002R\u0018\u0010\u001a\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001e\u001a\u00020\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0014\u0010\"\u001a\u00020\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u0014\u0010&\u001a\u00020#8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u0016\u0010(\u001a\u00020#8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b'\u0010%R\u0016\u0010*\u001a\u00020#8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b)\u0010%R\u0016\u0010-\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b+\u0010,R\u0016\u0010/\u001a\u00020#8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b.\u0010%R\u0016\u00102\u001a\u00020\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b0\u00101R\u0016\u00104\u001a\u00020\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b3\u00101¨\u0006<"}, d2 = {"Lcom/heytap/health/watchface/business/creation/category/video/view/VideoPositionView;", "Landroid/view/View;", "Lcom/heytap/health/watchface/business/creation/category/video/view/VideoPositionView$a;", "listener", "", "setListener", "", "duration", "setDuration", "currentTime", MapSchema.FIELD_NAME_ENTRY, "Landroid/graphics/Canvas;", "canvas", "onDraw", "Landroid/view/MotionEvent;", "event", "", "onTouchEvent", "c", "b", "", "touchDownX", "a", "d", "i", "Lcom/heytap/health/watchface/business/creation/category/video/view/VideoPositionView$a;", "mListener", "Landroid/graphics/Bitmap;", "j", "Landroid/graphics/Bitmap;", "mPosBitmap", "Landroid/graphics/Rect;", MapSchema.FIELD_NAME_KEY, "Landroid/graphics/Rect;", "mSrcRect", "", LogFieldKey.LEVEL_KEY, "I", "mCurrentPosGap", LogFieldKey.MESSAGE_KEY, "mViewWidth", "n", "mViewHeight", "o", "J", "mDuration", LogFieldKey.PROCESS_NAME_KEY, "mCurrentPlayPos", "q", UserInfo.SEX_FEMALE, "mCurrentPlayPercent", "r", "mTouchDownX", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "watchface_impl_release"}, k = 1, mv = {1, 8, 0})
public final class VideoPositionView extends View {

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @Nullable
    public a mListener;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final Bitmap mPosBitmap;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    @NotNull
    public final Rect mSrcRect;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    public final int mCurrentPosGap;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    public int mViewWidth;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    public int mViewHeight;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    public long mDuration;

    /* JADX INFO: renamed from: p, reason: from kotlin metadata */
    public int mCurrentPlayPos;

    /* JADX INFO: renamed from: q, reason: from kotlin metadata */
    public float mCurrentPlayPercent;

    /* JADX INFO: renamed from: r, reason: from kotlin metadata */
    public float mTouchDownX;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¨\u0006\u0006"}, d2 = {"Lcom/heytap/health/watchface/business/creation/category/video/view/VideoPositionView$a;", "", "", ClickApiEntity.TIME, "", "a", "watchface_impl_release"}, k = 1, mv = {1, 8, 0})
    public interface a {
        void a(long time);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public VideoPositionView(@NotNull Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public final boolean a(float touchDownX) {
        int i = this.mCurrentPlayPos;
        int i2 = this.mCurrentPosGap;
        return touchDownX >= ((float) (i - (i2 * 2))) && touchDownX <= ((float) (i + (i2 * 2)));
    }

    public final void b(Canvas canvas) {
        canvas.drawBitmap(this.mPosBitmap, this.mSrcRect, new Rect(this.mCurrentPlayPos - (this.mPosBitmap.getWidth() / 2), 0, this.mCurrentPlayPos + (this.mPosBitmap.getWidth() / 2), this.mSrcRect.height()), (Paint) null);
    }

    public final void c() {
        if (this.mViewWidth == 0 && this.mViewHeight == 0) {
            this.mViewWidth = getWidth();
            this.mViewHeight = getHeight();
            float f = this.mCurrentPlayPercent;
            int i = this.mViewWidth;
            int i2 = this.mCurrentPosGap;
            this.mCurrentPlayPos = MathKt__MathJVMKt.roundToInt((f * (i - (i2 * 2))) + i2);
        }
    }

    public final void d(MotionEvent event) {
        float x = event.getX();
        int i = this.mCurrentPosGap;
        if (x < i) {
            x = i;
        } else {
            int i2 = this.mViewWidth;
            if (x > i2 - i) {
                x = i2 - i;
            }
        }
        int iRoundToInt = MathKt__MathJVMKt.roundToInt(x);
        this.mCurrentPlayPos = iRoundToInt;
        float f = iRoundToInt / this.mViewWidth;
        this.mCurrentPlayPercent = f;
        a aVar = this.mListener;
        if (aVar != null) {
            aVar.a((long) (f * this.mDuration));
        }
        invalidate();
    }

    public final void e(long currentTime) {
        long j2 = this.mDuration;
        if (j2 == 0) {
            return;
        }
        float f = currentTime / j2;
        this.mCurrentPlayPercent = f;
        this.mCurrentPlayPos = MathKt__MathJVMKt.roundToInt(f * this.mViewWidth);
        postInvalidate();
    }

    @Override // android.view.View
    public void onDraw(@NotNull Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        super.onDraw(canvas);
        c();
        b(canvas);
    }

    @Override // android.view.View
    public boolean onTouchEvent(@NotNull MotionEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        if (event.getAction() == 0 && !a(event.getX())) {
            return false;
        }
        int action = event.getAction();
        if (action == 0) {
            this.mTouchDownX = event.getX();
        } else if (action == 2 && Math.abs(event.getX() - this.mTouchDownX) > 1.0f) {
            d(event);
            getParent().getParent().getParent().getParent().requestDisallowInterceptTouchEvent(true);
        }
        return true;
    }

    public final void setDuration(long duration) {
        this.mDuration = duration;
    }

    public final void setListener(@NotNull a listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.mListener = listener;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public VideoPositionView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public /* synthetic */ VideoPositionView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public VideoPositionView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        Bitmap bitmapDecodeResource = BitmapFactory.decodeResource(getResources(), R$drawable.watch_face_video_edit_pos);
        Intrinsics.checkNotNullExpressionValue(bitmapDecodeResource, "decodeResource(resources…atch_face_video_edit_pos)");
        this.mPosBitmap = bitmapDecodeResource;
        this.mSrcRect = new Rect(0, 0, bitmapDecodeResource.getWidth(), bitmapDecodeResource.getHeight());
        this.mCurrentPosGap = getResources().getDimensionPixelSize(R$dimen.watch_face_video_edit_trim_pos_with_window_gap);
    }
}
