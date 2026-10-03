package com.heytap.health.watchface.business.creation.category.video.view;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.NinePatch;
import android.graphics.Paint;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import androidx.exifinterface.media.ExifInterface;
import com.heytap.databaseengine.model.UserInfo;
import com.heytap.health.watchface.R$dimen;
import com.heytap.health.watchface.R$drawable;
import com.heytap.log.formatter.LogFieldKey;
import com.oplus.aiunit.vision.b2n;
import com.oplus.aiunit.vision.c8l;
import com.oplus.aiunit.vision.ltl;
import io.protostuff.MapSchema;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.math.MathKt__MathJVMKt;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b&\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 e2\u00020\u0001:\u0002\u001d\u0016B\u0011\b\u0016\u0012\u0006\u0010]\u001a\u00020\\¢\u0006\u0004\b^\u0010_B\u001b\b\u0016\u0012\u0006\u0010]\u001a\u00020\\\u0012\b\u0010a\u001a\u0004\u0018\u00010`¢\u0006\u0004\b^\u0010bB#\b\u0016\u0012\u0006\u0010]\u001a\u00020\\\u0012\b\u0010a\u001a\u0004\u0018\u00010`\u0012\u0006\u0010c\u001a\u00020\u001f¢\u0006\u0004\b^\u0010dJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J&\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u0006J\u000e\u0010\r\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u0006J\u0010\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u000eH\u0014J\u0010\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u0011H\u0016J\b\u0010\u0015\u001a\u00020\u0004H\u0002J\u0010\u0010\u0016\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u000eH\u0002J\u0010\u0010\u0017\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u000eH\u0002J\u0010\u0010\u0018\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u000eH\u0002J\b\u0010\u0019\u001a\u00020\u0004H\u0002J\u0010\u0010\u001a\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u0011H\u0002J\u0010\u0010\u001d\u001a\u00020\u00132\u0006\u0010\u001c\u001a\u00020\u001bH\u0002J\u0010\u0010\u001e\u001a\u00020\u00042\u0006\u0010\u001c\u001a\u00020\u001bH\u0002R\u0014\u0010!\u001a\u00020\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010 R\u0014\u0010\"\u001a\u00020\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010 R\u0014\u0010$\u001a\u00020\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010 R\u0014\u0010&\u001a\u00020\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010 R\u0014\u0010*\u001a\u00020'8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)R\u0014\u0010.\u001a\u00020+8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010-R\u0014\u00102\u001a\u00020/8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u00101R\u0014\u00104\u001a\u00020\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u0010 R\u0014\u00108\u001a\u0002058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b6\u00107R\u0016\u0010:\u001a\u00020\u001f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b9\u0010 R\u0016\u0010<\u001a\u00020\u001f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b;\u0010 R\u0016\u0010>\u001a\u00020\u001f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b=\u0010 R\u0016\u0010A\u001a\u00020\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b?\u0010@R\u0016\u0010C\u001a\u00020\u001f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bB\u0010 R\u0016\u0010E\u001a\u00020\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bD\u0010@R\u0016\u0010G\u001a\u00020\u001f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bF\u0010 R\u0016\u0010I\u001a\u00020\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bH\u0010@R\u0016\u0010K\u001a\u00020\u001f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bJ\u0010 R\u0016\u0010N\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bL\u0010MR\u0016\u0010P\u001a\u00020\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bO\u0010@R\u0016\u0010R\u001a\u00020\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bQ\u0010@R\u0016\u0010T\u001a\u00020\u001f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bS\u0010 R\u0016\u0010W\u001a\u00020\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bU\u0010VR\u0016\u0010X\u001a\u00020\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b@\u0010VR\u0018\u0010[\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bY\u0010Z¨\u0006f"}, d2 = {"Lcom/heytap/health/watchface/business/creation/category/video/view/VideoTrimTouchView;", "Landroid/view/View;", "Lcom/heytap/health/watchface/business/creation/category/video/view/VideoTrimTouchView$b;", "listener", "", "setTrimPositionChangeListener", "", "duration", "currentPos", "leftTrim", "rightTrim", "i", "currentTime", "j", "Landroid/graphics/Canvas;", "canvas", "onDraw", "Landroid/view/MotionEvent;", "event", "", "onTouchEvent", "f", "b", "d", "c", b2n.g, b2n.f, "", "touchDownX", "a", MapSchema.FIELD_NAME_ENTRY, "", "I", "mAutoMoveGap", "mThumbnailViewPadding", MapSchema.FIELD_NAME_KEY, "mTrimPadding", LogFieldKey.LEVEL_KEY, "mTrimFrame", "Landroid/graphics/NinePatch;", LogFieldKey.MESSAGE_KEY, "Landroid/graphics/NinePatch;", "mTrimDrawable", "Landroid/graphics/Bitmap;", "n", "Landroid/graphics/Bitmap;", "mPosBitmap", "Landroid/graphics/Rect;", "o", "Landroid/graphics/Rect;", "mSrcRect", LogFieldKey.PROCESS_NAME_KEY, "mCurrentPosGap", "Landroid/graphics/Paint;", "q", "Landroid/graphics/Paint;", "mBorderBgPaint", "r", "mViewWidth", "s", "mViewHeight", "t", "mTrimMinGap", "u", UserInfo.SEX_FEMALE, "mTrimMinPercent", "v", "mLeftBorderPos", "w", "mInitLeftPosPercent", "x", "mRightBorderPos", "y", "mInitRightPosPercent", "z", "mCurrentPlayPos", "A", "J", "mShowTime", c8l.KEY_B, "mCurrentPlayPercent", "C", "mTouchDownX", "D", "mCurrentTouchIndex", ExifInterface.LONGITUDE_EAST, "Z", "mShowPlayPos", "mInit", "G", "Lcom/heytap/health/watchface/business/creation/category/video/view/VideoTrimTouchView$b;", "mListener", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Landroid/util/AttributeSet;", "attrs", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Companion", "watchface_impl_release"}, k = 1, mv = {1, 8, 0})
public final class VideoTrimTouchView extends View {

    /* JADX INFO: renamed from: A, reason: from kotlin metadata */
    public long mShowTime;

    /* JADX INFO: renamed from: B, reason: from kotlin metadata */
    public float mCurrentPlayPercent;

    /* JADX INFO: renamed from: C, reason: from kotlin metadata */
    public float mTouchDownX;

    /* JADX INFO: renamed from: D, reason: from kotlin metadata */
    public int mCurrentTouchIndex;

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    public boolean mShowPlayPos;

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    public boolean mInit;

    /* JADX INFO: renamed from: G, reason: from kotlin metadata */
    @Nullable
    public b mListener;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    public final int mAutoMoveGap;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    public final int mThumbnailViewPadding;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    public final int mTrimPadding;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    public final int mTrimFrame;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    @NotNull
    public final NinePatch mTrimDrawable;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final Bitmap mPosBitmap;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    @NotNull
    public final Rect mSrcRect;

    /* JADX INFO: renamed from: p, reason: from kotlin metadata */
    public final int mCurrentPosGap;

    /* JADX INFO: renamed from: q, reason: from kotlin metadata */
    @NotNull
    public final Paint mBorderBgPaint;

    /* JADX INFO: renamed from: r, reason: from kotlin metadata */
    public int mViewWidth;

    /* JADX INFO: renamed from: s, reason: from kotlin metadata */
    public int mViewHeight;

    /* JADX INFO: renamed from: t, reason: from kotlin metadata */
    public int mTrimMinGap;

    /* JADX INFO: renamed from: u, reason: from kotlin metadata */
    public float mTrimMinPercent;

    /* JADX INFO: renamed from: v, reason: from kotlin metadata */
    public int mLeftBorderPos;

    /* JADX INFO: renamed from: w, reason: from kotlin metadata */
    public float mInitLeftPosPercent;

    /* JADX INFO: renamed from: x, reason: from kotlin metadata */
    public int mRightBorderPos;

    /* JADX INFO: renamed from: y, reason: from kotlin metadata */
    public float mInitRightPosPercent;

    /* JADX INFO: renamed from: z, reason: from kotlin metadata */
    public int mCurrentPlayPos;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001J \u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0002H&J\u0010\u0010\t\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0002H&J\u0010\u0010\n\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H&¨\u0006\u000b"}, d2 = {"Lcom/heytap/health/watchface/business/creation/category/video/view/VideoTrimTouchView$b;", "", "", "timePadding", "startTime", "endTime", "", "a", "startTimePadding", "c", "b", "watchface_impl_release"}, k = 1, mv = {1, 8, 0})
    public interface b {
        void a(long timePadding, long startTime, long endTime);

        void b(long timePadding);

        void c(long startTimePadding);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VideoTrimTouchView(@NotNull Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        Paint paint = new Paint();
        paint.setColor(-16777216);
        paint.setAntiAlias(true);
        paint.setAlpha(90);
        this.mBorderBgPaint = paint;
        this.mInitLeftPosPercent = -1.0f;
        this.mInitRightPosPercent = -1.0f;
        this.mShowPlayPos = true;
        this.mInit = true;
        this.mAutoMoveGap = getResources().getDimensionPixelSize(R$dimen.watch_face_video_edit_trim_auto_move_gap);
        this.mThumbnailViewPadding = getResources().getDimensionPixelSize(R$dimen.watch_face_video_edit_trim_thumbnail_view_padding);
        this.mTrimPadding = getResources().getDimensionPixelSize(R$dimen.watch_face_video_edit_trim_window_width);
        this.mTrimFrame = getResources().getDimensionPixelSize(R$dimen.watch_face_video_edit_trim_frame_view_height);
        Bitmap bitmapDecodeResource = BitmapFactory.decodeResource(getResources(), R$drawable.watch_face_video_editor_trim);
        this.mTrimDrawable = new NinePatch(bitmapDecodeResource, bitmapDecodeResource.getNinePatchChunk());
        Bitmap bitmapDecodeResource2 = BitmapFactory.decodeResource(getResources(), R$drawable.watch_face_video_edit_pos);
        Intrinsics.checkNotNullExpressionValue(bitmapDecodeResource2, "decodeResource(resources…atch_face_video_edit_pos)");
        this.mPosBitmap = bitmapDecodeResource2;
        this.mSrcRect = new Rect(0, 0, bitmapDecodeResource2.getWidth(), bitmapDecodeResource2.getHeight());
        this.mCurrentPosGap = getResources().getDimensionPixelSize(R$dimen.watch_face_video_edit_trim_pos_with_window_gap);
    }

    public final boolean a(float touchDownX) {
        if (this.mShowPlayPos) {
            int i = this.mCurrentPlayPos;
            int i2 = this.mCurrentPosGap;
            if (touchDownX >= i - (i2 * 2) && touchDownX <= i + (i2 * 2)) {
                return true;
            }
        }
        int i3 = this.mLeftBorderPos;
        if (touchDownX >= i3 && touchDownX <= i3 + this.mTrimPadding) {
            return true;
        }
        int i4 = this.mRightBorderPos;
        return touchDownX >= ((float) i4) && touchDownX <= ((float) (i4 + this.mTrimPadding));
    }

    public final void b(Canvas canvas) {
        canvas.drawRect(new Rect(0, (this.mPosBitmap.getHeight() - this.mViewHeight) / 2, this.mLeftBorderPos + this.mTrimPadding, (this.mPosBitmap.getHeight() + this.mViewHeight) / 2), this.mBorderBgPaint);
        canvas.drawRect(new Rect(this.mRightBorderPos, (this.mPosBitmap.getHeight() - this.mViewHeight) / 2, this.mViewWidth + (this.mThumbnailViewPadding * 2), (this.mPosBitmap.getHeight() + this.mViewHeight) / 2), this.mBorderBgPaint);
    }

    public final void c(Canvas canvas) {
        canvas.drawBitmap(this.mPosBitmap, this.mSrcRect, new Rect(this.mCurrentPlayPos - (this.mPosBitmap.getWidth() / 2), 0, this.mCurrentPlayPos + (this.mPosBitmap.getWidth() / 2), this.mSrcRect.height()), (Paint) null);
    }

    public final void d(Canvas canvas) {
        this.mTrimDrawable.draw(canvas, new Rect(this.mLeftBorderPos, (this.mPosBitmap.getHeight() - this.mTrimFrame) / 2, this.mRightBorderPos + this.mTrimPadding, (this.mPosBitmap.getHeight() + this.mTrimFrame) / 2));
    }

    /* JADX WARN: Code duplicated, block: B:9:0x0020  */
    public final void e(float touchDownX) {
        boolean z;
        if (this.mShowPlayPos) {
            int i = this.mCurrentPlayPos;
            int i2 = this.mCurrentPosGap;
            if (touchDownX < i - (i2 * 2) || touchDownX > i + (i2 * 2)) {
                z = false;
            } else {
                this.mCurrentTouchIndex = 3;
                z = true;
            }
        } else {
            z = false;
        }
        int i3 = this.mLeftBorderPos;
        if (touchDownX >= i3 && touchDownX <= this.mTrimPadding + i3) {
            if (!z || Math.abs(touchDownX - i3) <= Math.abs(touchDownX - this.mCurrentPlayPos)) {
                this.mCurrentTouchIndex = 1;
                this.mShowPlayPos = false;
            } else {
                this.mCurrentTouchIndex = 3;
            }
        }
        int i4 = this.mRightBorderPos;
        if (touchDownX < i4 || touchDownX > i4 + this.mTrimPadding) {
            return;
        }
        if (!z) {
            this.mCurrentTouchIndex = 2;
            this.mShowPlayPos = false;
        } else if (Math.abs(touchDownX - this.mCurrentPlayPos) <= Math.abs(touchDownX - this.mRightBorderPos)) {
            this.mCurrentTouchIndex = 3;
        } else {
            this.mCurrentTouchIndex = 2;
            this.mShowPlayPos = false;
        }
    }

    public final void f() {
        if (this.mViewWidth == 0 && this.mViewHeight == 0) {
            this.mViewWidth = getWidth() - (this.mThumbnailViewPadding * 2);
            this.mViewHeight = getResources().getDimensionPixelSize(R$dimen.watch_face_video_edit_trim_thumbnail_height);
        }
        if (this.mInit) {
            this.mInit = false;
            float f = this.mInitLeftPosPercent;
            if (!(f == -1.0f)) {
                if (!(this.mInitRightPosPercent == -1.0f)) {
                    this.mLeftBorderPos = MathKt__MathJVMKt.roundToInt(f * this.mViewWidth) + this.mThumbnailViewPadding;
                    int iRoundToInt = MathKt__MathJVMKt.roundToInt(this.mInitRightPosPercent * this.mViewWidth) + this.mThumbnailViewPadding;
                    int i = this.mTrimPadding;
                    this.mRightBorderPos = iRoundToInt - i;
                    float f2 = this.mCurrentPlayPercent;
                    int i2 = this.mViewWidth - (i * 2);
                    int i3 = this.mCurrentPosGap;
                    this.mCurrentPlayPos = MathKt__MathJVMKt.roundToInt((f2 * (i2 - (i3 * 2))) + this.mLeftBorderPos + i + i3);
                    this.mTrimMinGap = MathKt__MathJVMKt.roundToInt((this.mViewWidth - (this.mTrimPadding * 2)) * this.mTrimMinPercent);
                    return;
                }
            }
            int i4 = this.mViewWidth;
            int i5 = this.mThumbnailViewPadding;
            int i6 = this.mTrimPadding;
            this.mRightBorderPos = (i4 + i5) - i6;
            this.mLeftBorderPos = i5;
            this.mCurrentPlayPos = i5 + i6 + this.mCurrentPosGap;
        }
    }

    /* JADX WARN: Code duplicated, block: B:17:0x004c  */
    public final void g(MotionEvent event) {
        int i;
        long j2;
        b bVar;
        float x = event.getX();
        int i2 = this.mCurrentTouchIndex;
        if (i2 == 1) {
            int i3 = this.mThumbnailViewPadding;
            if (x <= i3) {
                x = i3;
            }
            int i4 = this.mRightBorderPos;
            int i5 = this.mTrimMinGap;
            if (x > i4 - i5) {
                x = i4 - i5;
            }
            int iRoundToInt = MathKt__MathJVMKt.roundToInt(x);
            this.mLeftBorderPos = iRoundToInt;
            int i6 = this.mThumbnailViewPadding;
            int i7 = this.mViewWidth;
            int i8 = this.mTrimPadding;
            float f = (iRoundToInt - i6) / (i7 - (i8 * 2));
            this.mCurrentPlayPercent = f;
            this.mCurrentPlayPos = iRoundToInt + i8 + this.mCurrentPosGap;
            long j3 = this.mShowTime;
            long j4 = (long) (f * j3);
            long j5 = (((long) ((this.mRightBorderPos - i6) - i8)) * j3) / ((long) (i7 - (i8 * 2)));
            b bVar2 = this.mListener;
            if (bVar2 != null) {
                bVar2.a(j4, j4, j5);
            }
            invalidate();
            return;
        }
        if (i2 == 2) {
            int i9 = this.mLeftBorderPos;
            int i10 = this.mTrimPadding;
            int i11 = this.mTrimMinGap;
            if (x < i9 + i10 + i11) {
                x = i9 + i10 + i11;
            }
            int i12 = this.mViewWidth;
            int i13 = this.mThumbnailViewPadding;
            if (x > (i12 + i13) - i10) {
                x = (i12 + i13) - i10;
            }
            int iRoundToInt2 = MathKt__MathJVMKt.roundToInt(x);
            this.mRightBorderPos = iRoundToInt2;
            int i14 = this.mThumbnailViewPadding;
            int i15 = this.mTrimPadding;
            int i16 = this.mViewWidth;
            float f2 = ((iRoundToInt2 - i14) - i15) / (i16 - (i15 * 2));
            this.mCurrentPlayPercent = f2;
            this.mCurrentPlayPos = iRoundToInt2 - this.mCurrentPosGap;
            long j6 = this.mShowTime;
            long j7 = (long) (f2 * j6);
            long j8 = (((long) ((this.mLeftBorderPos - i14) + i15)) * j6) / ((long) (i16 - (i15 * 2)));
            b bVar3 = this.mListener;
            if (bVar3 != null) {
                bVar3.a(j7, j8, j7);
            }
            invalidate();
            return;
        }
        if (i2 != 3) {
            return;
        }
        int i17 = this.mLeftBorderPos;
        int i18 = this.mTrimPadding;
        int i19 = this.mCurrentPosGap;
        if (x >= i17 + i18 + i19) {
            int i20 = this.mRightBorderPos;
            if (x > i20 - i19) {
                i = i20 - i19;
            }
            int iRoundToInt3 = MathKt__MathJVMKt.roundToInt(x);
            this.mCurrentPlayPos = iRoundToInt3;
            int i21 = iRoundToInt3 - this.mLeftBorderPos;
            int i22 = this.mTrimPadding;
            float f3 = (i21 - i22) / (this.mViewWidth - (i22 * 2));
            this.mCurrentPlayPercent = f3;
            j2 = (long) (f3 * this.mShowTime);
            bVar = this.mListener;
            if (bVar != null) {
                bVar.a(j2, -1L, -1L);
            }
            this.mCurrentPlayPos = MathKt__MathJVMKt.roundToInt(x);
            invalidate();
        }
        i = i17 + i18 + i19;
        x = i;
        int iRoundToInt4 = MathKt__MathJVMKt.roundToInt(x);
        this.mCurrentPlayPos = iRoundToInt4;
        int i23 = iRoundToInt4 - this.mLeftBorderPos;
        int i24 = this.mTrimPadding;
        float f4 = (i23 - i24) / (this.mViewWidth - (i24 * 2));
        this.mCurrentPlayPercent = f4;
        j2 = (long) (f4 * this.mShowTime);
        bVar = this.mListener;
        if (bVar != null) {
            bVar.a(j2, -1L, -1L);
        }
        this.mCurrentPlayPos = MathKt__MathJVMKt.roundToInt(x);
        invalidate();
    }

    public final void h() {
        b bVar;
        int i = this.mCurrentTouchIndex;
        if (i == 1) {
            b bVar2 = this.mListener;
            if (bVar2 != null) {
                bVar2.c((((long) (this.mLeftBorderPos - this.mThumbnailViewPadding)) * this.mShowTime) / ((long) (this.mViewWidth - (this.mTrimPadding * 2))));
                return;
            }
            return;
        }
        if (i == 2 && (bVar = this.mListener) != null) {
            int i2 = this.mRightBorderPos - this.mLeftBorderPos;
            int i3 = this.mTrimPadding;
            bVar.b((((long) (i2 - i3)) * this.mShowTime) / ((long) (this.mViewWidth - (i3 * 2))));
        }
    }

    public final void i(long duration, long currentPos, long leftTrim, long rightTrim) {
        if (duration == 0) {
            ltl.b("VideoTrimTouchView", "[setInitPos]--> duration = 0");
            return;
        }
        this.mShowTime = duration;
        float f = duration;
        this.mCurrentPlayPercent = currentPos / f;
        this.mInitLeftPosPercent = leftTrim / f;
        this.mInitRightPosPercent = rightTrim / f;
        this.mTrimMinPercent = 1010 > duration ? 1.0f : 1010.0f / f;
        this.mInit = true;
        postInvalidate();
    }

    public final void j(long currentTime) {
        float f = currentTime / this.mShowTime;
        this.mCurrentPlayPercent = f;
        int i = this.mViewWidth;
        int i2 = this.mTrimPadding;
        this.mCurrentPlayPos = MathKt__MathJVMKt.roundToInt((f * (i - (i2 * 2))) + this.mLeftBorderPos + i2);
        if (this.mShowPlayPos) {
            postInvalidate();
        }
    }

    @Override // android.view.View
    public void onDraw(@NotNull Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        super.onDraw(canvas);
        f();
        b(canvas);
        d(canvas);
        if (this.mShowPlayPos) {
            c(canvas);
        }
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0040  */
    /* JADX WARN: Code duplicated, block: B:23:0x0044  */
    @Override // android.view.View
    public boolean onTouchEvent(@NotNull MotionEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        if (event.getAction() == 0 && !a(event.getX())) {
            return false;
        }
        int action = event.getAction();
        if (action == 0) {
            float x = event.getX();
            this.mTouchDownX = x;
            e(x);
            if (this.mCurrentTouchIndex > 0) {
                invalidate();
            }
        } else if (action == 1) {
            if (this.mCurrentTouchIndex > 0) {
                h();
                this.mShowPlayPos = true;
                invalidate();
                this.mCurrentTouchIndex = 0;
            }
        } else if (action != 2) {
            if (action == 3) {
                if (this.mCurrentTouchIndex > 0) {
                    h();
                    this.mShowPlayPos = true;
                    invalidate();
                    this.mCurrentTouchIndex = 0;
                }
            }
        } else if (this.mCurrentTouchIndex > 0 && Math.abs(event.getX() - this.mTouchDownX) > 1.0f) {
            g(event);
        }
        return super.onTouchEvent(event);
    }

    public final void setTrimPositionChangeListener(@NotNull b listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.mListener = listener;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VideoTrimTouchView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        Paint paint = new Paint();
        paint.setColor(-16777216);
        paint.setAntiAlias(true);
        paint.setAlpha(90);
        this.mBorderBgPaint = paint;
        this.mInitLeftPosPercent = -1.0f;
        this.mInitRightPosPercent = -1.0f;
        this.mShowPlayPos = true;
        this.mInit = true;
        this.mAutoMoveGap = getResources().getDimensionPixelSize(R$dimen.watch_face_video_edit_trim_auto_move_gap);
        this.mThumbnailViewPadding = getResources().getDimensionPixelSize(R$dimen.watch_face_video_edit_trim_thumbnail_view_padding);
        this.mTrimPadding = getResources().getDimensionPixelSize(R$dimen.watch_face_video_edit_trim_window_width);
        this.mTrimFrame = getResources().getDimensionPixelSize(R$dimen.watch_face_video_edit_trim_frame_view_height);
        Bitmap bitmapDecodeResource = BitmapFactory.decodeResource(getResources(), R$drawable.watch_face_video_editor_trim);
        this.mTrimDrawable = new NinePatch(bitmapDecodeResource, bitmapDecodeResource.getNinePatchChunk());
        Bitmap bitmapDecodeResource2 = BitmapFactory.decodeResource(getResources(), R$drawable.watch_face_video_edit_pos);
        Intrinsics.checkNotNullExpressionValue(bitmapDecodeResource2, "decodeResource(resources…atch_face_video_edit_pos)");
        this.mPosBitmap = bitmapDecodeResource2;
        this.mSrcRect = new Rect(0, 0, bitmapDecodeResource2.getWidth(), bitmapDecodeResource2.getHeight());
        this.mCurrentPosGap = getResources().getDimensionPixelSize(R$dimen.watch_face_video_edit_trim_pos_with_window_gap);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VideoTrimTouchView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        Paint paint = new Paint();
        paint.setColor(-16777216);
        paint.setAntiAlias(true);
        paint.setAlpha(90);
        this.mBorderBgPaint = paint;
        this.mInitLeftPosPercent = -1.0f;
        this.mInitRightPosPercent = -1.0f;
        this.mShowPlayPos = true;
        this.mInit = true;
        this.mAutoMoveGap = getResources().getDimensionPixelSize(R$dimen.watch_face_video_edit_trim_auto_move_gap);
        this.mThumbnailViewPadding = getResources().getDimensionPixelSize(R$dimen.watch_face_video_edit_trim_thumbnail_view_padding);
        this.mTrimPadding = getResources().getDimensionPixelSize(R$dimen.watch_face_video_edit_trim_window_width);
        this.mTrimFrame = getResources().getDimensionPixelSize(R$dimen.watch_face_video_edit_trim_frame_view_height);
        Bitmap bitmapDecodeResource = BitmapFactory.decodeResource(getResources(), R$drawable.watch_face_video_editor_trim);
        this.mTrimDrawable = new NinePatch(bitmapDecodeResource, bitmapDecodeResource.getNinePatchChunk());
        Bitmap bitmapDecodeResource2 = BitmapFactory.decodeResource(getResources(), R$drawable.watch_face_video_edit_pos);
        Intrinsics.checkNotNullExpressionValue(bitmapDecodeResource2, "decodeResource(resources…atch_face_video_edit_pos)");
        this.mPosBitmap = bitmapDecodeResource2;
        this.mSrcRect = new Rect(0, 0, bitmapDecodeResource2.getWidth(), bitmapDecodeResource2.getHeight());
        this.mCurrentPosGap = getResources().getDimensionPixelSize(R$dimen.watch_face_video_edit_trim_pos_with_window_gap);
    }
}
