package com.heytap.sports.coach.tips.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import androidx.compose.runtime.internal.StabilityInferred;
import com.heytap.databaseengine.model.UserInfo;
import com.heytap.log.formatter.LogFieldKey;
import com.oplus.aiunit.vision.ejg;
import io.protostuff.MapSchema;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u0015\n\u0002\b\u0010\n\u0002\u0010\u0007\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0011\b\u0016\u0012\u0006\u00107\u001a\u000206¢\u0006\u0004\b8\u00109B\u001b\b\u0016\u0012\u0006\u00107\u001a\u000206\u0012\b\u0010;\u001a\u0004\u0018\u00010:¢\u0006\u0004\b8\u0010<B#\b\u0016\u0012\u0006\u00107\u001a\u000206\u0012\b\u0010;\u001a\u0004\u0018\u00010:\u0012\u0006\u0010=\u001a\u00020\u0006¢\u0006\u0004\b8\u0010>J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0014J\u000e\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006J\u000e\u0010\n\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u0006J\u0010\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\f\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002R\u0014\u0010\u0010\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0012\u001a\u00020\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010\u000fR\u0016\u0010\u0014\u001a\u00020\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010\u000fR\u0016\u0010\u0017\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0016\u0010\u0019\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010\u0016R\u0016\u0010\u001b\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010\u0016R\u0016\u0010\u001d\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010\u0016R\u0016\u0010!\u001a\u00020\u001e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0014\u0010#\u001a\u00020\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010 R\u0016\u0010%\u001a\u00020\u001e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b$\u0010 R\u0014\u0010)\u001a\u00020&8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(R\u0014\u0010+\u001a\u00020&8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010(R\u0014\u0010-\u001a\u00020\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010 R\u0014\u0010/\u001a\u00020\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010 R\u0014\u00103\u001a\u0002008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u00102R\u0014\u00105\u001a\u0002008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b4\u00102¨\u0006?"}, d2 = {"Lcom/heytap/sports/coach/tips/view/LevelRangeView;", "Landroid/view/View;", "Landroid/graphics/Canvas;", "canvas", "", "onDraw", "", "color", "setIndicatorColor", "level", "setLevel", "a", "b", "", "i", "[I", "defaultLevelColors", "j", "levelArray", MapSchema.FIELD_NAME_KEY, "backgroundColors", LogFieldKey.LEVEL_KEY, "I", "indicatorColor", LogFieldKey.MESSAGE_KEY, "minLevel", "n", "maxLevel", "o", "currentLevel", "", LogFieldKey.PROCESS_NAME_KEY, UserInfo.SEX_FEMALE, "currentLevelX", "q", "levelDividerWidth", "r", "levelScale", "Landroid/graphics/Paint;", "s", "Landroid/graphics/Paint;", "levelPaint", "t", "indicatorPaint", "u", "indicatorOffset", "v", "indicatorWidth", "Landroid/graphics/RectF;", "w", "Landroid/graphics/RectF;", "indicatorBgRectF", "x", "indicatorRectF", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Landroid/util/AttributeSet;", "attrs", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "sport_impl_release"}, k = 1, mv = {1, 8, 0})
public final class LevelRangeView extends View {
    public static final int $stable = 8;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @NotNull
    public final int[] defaultLevelColors;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public int[] levelArray;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    @NotNull
    public int[] backgroundColors;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    public int indicatorColor;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    public int minLevel;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    public int maxLevel;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    public int currentLevel;

    /* JADX INFO: renamed from: p, reason: from kotlin metadata */
    public float currentLevelX;

    /* JADX INFO: renamed from: q, reason: from kotlin metadata */
    public final float levelDividerWidth;

    /* JADX INFO: renamed from: r, reason: from kotlin metadata */
    public float levelScale;

    /* JADX INFO: renamed from: s, reason: from kotlin metadata */
    @NotNull
    public final Paint levelPaint;

    /* JADX INFO: renamed from: t, reason: from kotlin metadata */
    @NotNull
    public final Paint indicatorPaint;

    /* JADX INFO: renamed from: u, reason: from kotlin metadata */
    public final float indicatorOffset;

    /* JADX INFO: renamed from: v, reason: from kotlin metadata */
    public final float indicatorWidth;

    /* JADX INFO: renamed from: w, reason: from kotlin metadata */
    @NotNull
    public final RectF indicatorBgRectF;

    /* JADX INFO: renamed from: x, reason: from kotlin metadata */
    @NotNull
    public final RectF indicatorRectF;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LevelRangeView(@NotNull Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        int[] iArr = {Color.parseColor("#FFE928"), Color.parseColor("#FFC424"), Color.parseColor("#FF8C19"), Color.parseColor("#FF6332"), Color.parseColor("#F13B3B")};
        this.defaultLevelColors = iArr;
        this.levelArray = new int[]{0, 20, 40, 60, 80, 100};
        this.backgroundColors = iArr;
        this.indicatorColor = -16777216;
        this.maxLevel = 100;
        this.currentLevel = -1;
        this.levelDividerWidth = ejg.a(getContext(), 1.0f);
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        paint.setStyle(Paint.Style.FILL);
        this.levelPaint = paint;
        Paint paint2 = new Paint();
        paint2.setAntiAlias(true);
        paint2.setStyle(Paint.Style.FILL);
        this.indicatorPaint = paint2;
        this.indicatorOffset = ejg.a(getContext(), 3.0f);
        this.indicatorWidth = ejg.a(getContext(), 4.0f);
        this.indicatorBgRectF = new RectF();
        this.indicatorRectF = new RectF();
    }

    public final void a(Canvas canvas) {
        float height = getHeight();
        float f = this.indicatorOffset;
        float f2 = 2;
        float f3 = this.currentLevelX;
        float f4 = this.indicatorWidth;
        float f5 = f3 - (f4 / f2);
        float f6 = f3 + (f4 / f2);
        float f7 = (height - (f * f2)) + (f * f2);
        RectF rectF = this.indicatorBgRectF;
        float f8 = this.levelDividerWidth;
        rectF.set(f5 - f8, 0.0f, f8 + f6, getHeight());
        this.indicatorPaint.setColor(-1);
        canvas.drawRect(this.indicatorBgRectF, this.indicatorPaint);
        this.indicatorRectF.set(f5, 0.0f, f6, f7);
        this.indicatorPaint.setColor(this.indicatorColor);
        RectF rectF2 = this.indicatorRectF;
        float f9 = this.indicatorOffset;
        canvas.drawRoundRect(rectF2, f9, f9, this.indicatorPaint);
    }

    public final void b(Canvas canvas) {
        float f = this.indicatorOffset;
        float height = getHeight() - (this.indicatorOffset * 2);
        int length = this.levelArray.length - 1;
        float width = (getWidth() - (this.levelDividerWidth * 4.0f)) / length;
        float f2 = 0.0f;
        RectF rectF = new RectF(0.0f, f, width + 0.0f, height + f);
        for (int i = 0; i < length; i++) {
            this.levelPaint.setColor(this.backgroundColors[i]);
            canvas.drawRect(rectF, this.levelPaint);
            f2 += this.levelDividerWidth + width;
            rectF.left = f2;
            rectF.right = f2 + width;
        }
    }

    @Override // android.view.View
    public void onDraw(@NotNull Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        super.onDraw(canvas);
        b(canvas);
        int i = this.currentLevel;
        if (i >= 0) {
            int i2 = this.minLevel;
            this.levelScale = (i - i2) / (this.maxLevel - i2);
            this.currentLevelX = getWidth() * this.levelScale;
            a(canvas);
        }
    }

    public final void setIndicatorColor(int color) {
        this.indicatorColor = color;
    }

    public final void setLevel(int level) {
        int i = this.minLevel;
        if (level < i) {
            level = i;
        }
        int i2 = this.maxLevel;
        if (level > i2) {
            level = i2;
        }
        this.currentLevel = level;
        requestLayout();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LevelRangeView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        int[] iArr = {Color.parseColor("#FFE928"), Color.parseColor("#FFC424"), Color.parseColor("#FF8C19"), Color.parseColor("#FF6332"), Color.parseColor("#F13B3B")};
        this.defaultLevelColors = iArr;
        this.levelArray = new int[]{0, 20, 40, 60, 80, 100};
        this.backgroundColors = iArr;
        this.indicatorColor = -16777216;
        this.maxLevel = 100;
        this.currentLevel = -1;
        this.levelDividerWidth = ejg.a(getContext(), 1.0f);
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        paint.setStyle(Paint.Style.FILL);
        this.levelPaint = paint;
        Paint paint2 = new Paint();
        paint2.setAntiAlias(true);
        paint2.setStyle(Paint.Style.FILL);
        this.indicatorPaint = paint2;
        this.indicatorOffset = ejg.a(getContext(), 3.0f);
        this.indicatorWidth = ejg.a(getContext(), 4.0f);
        this.indicatorBgRectF = new RectF();
        this.indicatorRectF = new RectF();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LevelRangeView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        int[] iArr = {Color.parseColor("#FFE928"), Color.parseColor("#FFC424"), Color.parseColor("#FF8C19"), Color.parseColor("#FF6332"), Color.parseColor("#F13B3B")};
        this.defaultLevelColors = iArr;
        this.levelArray = new int[]{0, 20, 40, 60, 80, 100};
        this.backgroundColors = iArr;
        this.indicatorColor = -16777216;
        this.maxLevel = 100;
        this.currentLevel = -1;
        this.levelDividerWidth = ejg.a(getContext(), 1.0f);
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        paint.setStyle(Paint.Style.FILL);
        this.levelPaint = paint;
        Paint paint2 = new Paint();
        paint2.setAntiAlias(true);
        paint2.setStyle(Paint.Style.FILL);
        this.indicatorPaint = paint2;
        this.indicatorOffset = ejg.a(getContext(), 3.0f);
        this.indicatorWidth = ejg.a(getContext(), 4.0f);
        this.indicatorBgRectF = new RectF();
        this.indicatorRectF = new RectF();
    }
}
