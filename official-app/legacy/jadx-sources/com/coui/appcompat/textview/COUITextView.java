package com.coui.appcompat.textview;

import android.R;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatTextView;
import com.heytap.webview.extension.activity.FragmentStyle;
import com.support.appcompat.R$styleable;

/* JADX INFO: loaded from: classes13.dex */
public class COUITextView extends AppCompatTextView {
    public final Context i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f2134j;

    public COUITextView(Context context) {
        this(context, null);
    }

    public static boolean b(@NonNull Context context, @NonNull Resources.Theme theme, @Nullable AttributeSet attributeSet, int i, int i2) {
        TypedArray typedArrayObtainStyledAttributes = theme.obtainStyledAttributes(attributeSet, R$styleable.COUITextView, i, i2);
        float f = typedArrayObtainStyledAttributes.getFloat(R$styleable.COUITextView_android_lineSpacingMultiplier, 1.0f);
        typedArrayObtainStyledAttributes.recycle();
        return f != 1.0f;
    }

    public static int findViewAppearanceResourceId(@NonNull Resources.Theme theme, @Nullable AttributeSet attributeSet, int i, int i2) {
        TypedArray typedArrayObtainStyledAttributes = theme.obtainStyledAttributes(attributeSet, R$styleable.COUITextView, i, i2);
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(R$styleable.COUITextView_android_textAppearance, -1);
        typedArrayObtainStyledAttributes.recycle();
        return resourceId;
    }

    public final void a(@NonNull Resources.Theme theme, int i) {
        TypedArray typedArrayObtainStyledAttributes = theme.obtainStyledAttributes(i, R$styleable.COUITextAppearance);
        float f = typedArrayObtainStyledAttributes.getFloat(R$styleable.COUITextAppearance_android_lineSpacingMultiplier, 1.0f);
        if (f >= 1.0f) {
            setLineSpacing(0.0f, f);
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    public void setDebug(Boolean bool) {
        this.f2134j = bool.booleanValue();
    }

    @Override // android.widget.TextView
    public void setTextAppearance(int i) {
        super.setTextAppearance(i);
        a(this.i.getTheme(), i);
    }

    public COUITextView(Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.textViewStyle);
    }

    public COUITextView(Context context, @Nullable AttributeSet attributeSet, int i) {
        int iFindViewAppearanceResourceId;
        super(context, attributeSet, i);
        this.f2134j = false;
        this.i = context;
        if (FragmentStyle.DEBUG.equals((String) getTag())) {
            setDebug(Boolean.TRUE);
        }
        if (!b(context, context.getTheme(), attributeSet, i, -1) && (iFindViewAppearanceResourceId = findViewAppearanceResourceId(context.getTheme(), attributeSet, i, -1)) != -1) {
            a(context.getTheme(), iFindViewAppearanceResourceId);
        }
        if (this.f2134j) {
            int fontMetricsInt = getPaint().getFontMetricsInt(null);
            Log.i("COUITextViewDebug", "textSize: " + getTextSize() + ", lineHeight: " + getLineHeight() + ", fontHeight: " + fontMetricsInt + ", Multiplier: " + getLineSpacingMultiplier());
        }
    }
}
