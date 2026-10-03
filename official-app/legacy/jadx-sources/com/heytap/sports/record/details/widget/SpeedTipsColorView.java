package com.heytap.sports.record.details.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Shader;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View;
import androidx.compose.runtime.internal.StabilityInferred;
import com.heytap.databaseengine.model.UserInfo;
import com.heytap.health.watchface.business.legacy.main.bean.WatchFaceBean;
import com.heytap.log.formatter.LogFieldKey;
import com.heytap.sports.R$styleable;
import com.oplus.aiunit.vision.b2n;
import com.oplus.aiunit.vision.lo9;
import com.oplus.aiunit.vision.y04;
import io.protostuff.MapSchema;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0010\u0015\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u001b\u0012\b\u00101\u001a\u0004\u0018\u000100\u0012\b\u00103\u001a\u0004\u0018\u000102¢\u0006\u0004\b4\u00105J(\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0002H\u0014J\u0010\u0010\u000b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0014R\u0014\u0010\u000f\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0018\u0010\u0013\u001a\u0004\u0018\u00010\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0017\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0019\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0016R\u0014\u0010\u001b\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u0016R\u0016\u0010\u001f\u001a\u00020\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0016\u0010!\u001a\u00020\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u0010\u001eR\u0016\u0010%\u001a\u00020\"8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b#\u0010$R\u0016\u0010'\u001a\u00020\"8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b&\u0010$R\u0016\u0010+\u001a\u00020(8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b)\u0010*R\u0016\u0010-\u001a\u00020\"8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b,\u0010$R\u0016\u0010/\u001a\u00020\"8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b.\u0010$¨\u00066"}, d2 = {"Lcom/heytap/sports/record/details/widget/SpeedTipsColorView;", "Landroid/view/View;", "", "w", b2n.g, "oldw", "oldh", "", "onSizeChanged", "Landroid/graphics/Canvas;", "canvas", "onDraw", "Landroid/graphics/Paint;", "i", "Landroid/graphics/Paint;", lo9.TAG_DEFAULT_CREATION_PAINT, "Landroid/graphics/LinearGradient;", "j", "Landroid/graphics/LinearGradient;", "linearGradient", "Landroid/graphics/Path;", MapSchema.FIELD_NAME_KEY, "Landroid/graphics/Path;", "path", LogFieldKey.LEVEL_KEY, "mLeftTextPath", LogFieldKey.MESSAGE_KEY, "mRightTextPath", "", "n", "Ljava/lang/String;", "mLeftText", "o", "mRightText", "", LogFieldKey.PROCESS_NAME_KEY, UserInfo.SEX_FEMALE, "mTextPadding", "q", "mTextSize", "", "r", "[I", WatchFaceBean.TAG_M_COLORS, "s", "mLinePadding", "t", "mLineWidth", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "sport_impl_release"}, k = 1, mv = {1, 8, 0})
public final class SpeedTipsColorView extends View {
    public static final int $stable = 8;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @NotNull
    public final Paint paint;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public LinearGradient linearGradient;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    @NotNull
    public final Path path;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final Path mLeftTextPath;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    @NotNull
    public final Path mRightTextPath;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public String mLeftText;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    @NotNull
    public String mRightText;

    /* JADX INFO: renamed from: p, reason: from kotlin metadata */
    public float mTextPadding;

    /* JADX INFO: renamed from: q, reason: from kotlin metadata */
    public float mTextSize;

    /* JADX INFO: renamed from: r, reason: from kotlin metadata */
    @NotNull
    public int[] mColors;

    /* JADX INFO: renamed from: s, reason: from kotlin metadata */
    public float mLinePadding;

    /* JADX INFO: renamed from: t, reason: from kotlin metadata */
    public float mLineWidth;

    public SpeedTipsColorView(@Nullable Context context, @Nullable AttributeSet attributeSet) {
        TypedArray typedArrayObtainStyledAttributes;
        super(context, attributeSet);
        this.paint = new Paint();
        this.path = new Path();
        this.mLeftTextPath = new Path();
        this.mRightTextPath = new Path();
        this.mLeftText = y04.TIME_STYLE_LEFT_DIR_NAME;
        this.mRightText = y04.TIME_STYLE_RIGHT_DIR_NAME;
        this.mColors = new int[]{-7940066, -1294786};
        this.mTextSize = TypedValue.applyDimension(2, 12.0f, getResources().getDisplayMetrics());
        this.mTextPadding = TypedValue.applyDimension(1, 2.0f, getResources().getDisplayMetrics());
        this.mLineWidth = TypedValue.applyDimension(1, 2.0f, getResources().getDisplayMetrics());
        if (context != null && (typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.sports_SpeedTipsColorView)) != null) {
            String text = typedArrayObtainStyledAttributes.getString(R$styleable.sports_SpeedTipsColorView_sports_leftText);
            if (text != null) {
                Intrinsics.checkNotNullExpressionValue(text, "text");
                this.mLeftText = text;
            }
            String text2 = typedArrayObtainStyledAttributes.getString(R$styleable.sports_SpeedTipsColorView_sports_rightText);
            if (text2 != null) {
                Intrinsics.checkNotNullExpressionValue(text2, "text");
                this.mRightText = text2;
            }
            this.mTextPadding = typedArrayObtainStyledAttributes.getDimension(R$styleable.sports_SpeedTipsColorView_sports_textPadding, this.mTextPadding);
            this.mTextSize = typedArrayObtainStyledAttributes.getDimension(R$styleable.sports_SpeedTipsColorView_sports_textSize, this.mTextSize);
            int resourceId = typedArrayObtainStyledAttributes.getResourceId(R$styleable.sports_SpeedTipsColorView_sports_colors, -1);
            if (resourceId != -1) {
                String[] stringArray = getResources().getStringArray(resourceId);
                Intrinsics.checkNotNullExpressionValue(stringArray, "resources.getStringArray(tempId)");
                int length = stringArray.length;
                int[] iArr = new int[length];
                for (int i = 0; i < length; i++) {
                    iArr[i] = Color.parseColor(stringArray[i]);
                }
                this.mColors = iArr;
            }
            this.mLineWidth = typedArrayObtainStyledAttributes.getDimension(R$styleable.sports_SpeedTipsColorView_sports_lineWidth, this.mLineWidth);
            this.mLinePadding = typedArrayObtainStyledAttributes.getDimension(R$styleable.sports_SpeedTipsColorView_sports_linePadding, 0.0f);
            typedArrayObtainStyledAttributes.recycle();
        }
        this.paint.setStyle(Paint.Style.FILL);
    }

    @Override // android.view.View
    public void onDraw(@NotNull Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        super.onDraw(canvas);
        this.paint.setShader(this.linearGradient);
        this.paint.setTextSize(this.mTextSize);
        float fMeasureText = this.paint.measureText(this.mLeftText);
        float fMeasureText2 = this.paint.measureText(this.mRightText);
        float paddingStart = getPaddingStart() + this.mLinePadding + this.mTextPadding;
        float width = (((getWidth() - getPaddingEnd()) - this.mLinePadding) - fMeasureText2) - this.mTextPadding;
        this.path.reset();
        this.path.addRect(getPaddingStart(), (getHeight() / 2.0f) - (this.mLineWidth / 2.0f), getWidth() - getPaddingEnd(), (this.mLineWidth / 2.0f) + (getHeight() / 2.0f), Path.Direction.CCW);
        this.mLeftTextPath.reset();
        Path path = this.mLeftTextPath;
        float f = this.mTextPadding;
        path.addRect(paddingStart - f, 0.0f, fMeasureText + paddingStart + f, getHeight(), Path.Direction.CCW);
        this.mRightTextPath.reset();
        Path path2 = this.mRightTextPath;
        float f2 = this.mTextPadding;
        path2.addRect(width - f2, 0.0f, fMeasureText2 + width + f2, getHeight(), Path.Direction.CCW);
        this.path.op(this.mLeftTextPath, Path.Op.DIFFERENCE);
        this.path.op(this.mRightTextPath, Path.Op.DIFFERENCE);
        canvas.drawPath(this.path, this.paint);
        float fMeasureText3 = this.paint.measureText("H") / 2.0f;
        canvas.drawText(this.mLeftText, paddingStart, (getHeight() / 2.0f) + fMeasureText3, this.paint);
        canvas.drawText(this.mRightText, width, (getHeight() / 2.0f) + fMeasureText3, this.paint);
    }

    @Override // android.view.View
    public void onSizeChanged(int w, int h, int oldw, int oldh) {
        super.onSizeChanged(w, h, oldw, oldh);
        if (w > 0) {
            int length = this.mColors.length;
            float[] fArr = new float[length];
            for (int i = 0; i < length; i++) {
                fArr[i] = (i * 1.0f) / this.mColors.length;
            }
            this.linearGradient = new LinearGradient(getPaddingStart(), 0.0f, getWidth() - getPaddingEnd(), 0.0f, this.mColors, fArr, Shader.TileMode.CLAMP);
        }
    }
}
