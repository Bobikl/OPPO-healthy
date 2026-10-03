package com.heytap.store.homemodule.utils;

import android.os.CountDownTimer;
import android.text.SpannableStringBuilder;
import android.widget.TextView;
import androidx.core.content.ContextCompat;
import com.heytap.store.home.R;
import com.heytap.store.homemodule.widget.RoundBackgroundSpan;
import com.heytap.store.platform.tools.ContextGetterUtils;
import com.heytap.store.platform.tools.SizeUtils;
import com.oplus.smartenginehelper.ParserTag;
import com.oplus.smartenginehelper.entity.ClickApiEntity;
import com.platform.account.webview.constant.Constants;
import java.lang.ref.WeakReference;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.text.StringsKt__StringsKt;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\r\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u00019B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\b\u0010/\u001a\u000200H\u0016J\u0010\u00101\u001a\u0002002\u0006\u00102\u001a\u00020\u0003H\u0016J\u000e\u00103\u001a\u0002002\u0006\u00104\u001a\u00020,J\u0010\u00105\u001a\u0002062\u0006\u00102\u001a\u00020\u0003H\u0002J\u0010\u00107\u001a\u0002062\u0006\u00102\u001a\u00020\u0003H\u0002J\u0010\u00108\u001a\u0002062\u0006\u00102\u001a\u00020\u0003H\u0002R\u001a\u0010\b\u001a\u00020\tX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u001a\u0010\u000e\u001a\u00020\u000fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0013\u001a\u00020\u0014X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u001a\u0010\u0019\u001a\u00020\tX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u000b\"\u0004\b\u001b\u0010\rR\u001a\u0010\u001c\u001a\u00020\tX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u000b\"\u0004\b\u001e\u0010\rR\u001a\u0010\u001f\u001a\u00020\tX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b \u0010\u000b\"\u0004\b!\u0010\rR\u001a\u0010\"\u001a\u00020\tX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b#\u0010\u000b\"\u0004\b$\u0010\rR\"\u0010%\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010&X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b'\u0010(\"\u0004\b)\u0010*R\"\u0010+\u001a\n\u0012\u0004\u0012\u00020,\u0018\u00010&X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b-\u0010(\"\u0004\b.\u0010*¨\u0006:"}, d2 = {"Lcom/heytap/store/homemodule/utils/CountTimerUtil;", "Landroid/os/CountDownTimer;", "millisInFuture", "", "countDownInterval", "textView", "Landroid/widget/TextView;", "(JJLandroid/widget/TextView;)V", "bgColor", "", "getBgColor", "()I", "setBgColor", "(I)V", "isCountDownWithUnit", "", "()Z", "setCountDownWithUnit", "(Z)V", "radius", "", "getRadius", "()F", "setRadius", "(F)V", ParserTag.TAG_TEXT_COLOR, "getTextColor", ClickApiEntity.SET_TEXT_COLOR, "textPaddingX", "getTextPaddingX", "setTextPaddingX", "textPaddingY", "getTextPaddingY", "setTextPaddingY", "textSpace", "getTextSpace", "setTextSpace", "weakReferenceTextView", "Ljava/lang/ref/WeakReference;", "getWeakReferenceTextView", "()Ljava/lang/ref/WeakReference;", "setWeakReferenceTextView", "(Ljava/lang/ref/WeakReference;)V", "weakStatusListener", "Lcom/heytap/store/homemodule/utils/CountTimerUtil$StatusUpdateListener;", "getWeakStatusListener", "setWeakStatusListener", Constants.JsbConstants.METHOD_FINISH, "", "onTick", "millisUntilFinished", "setListener", "listener", "updateText", "", "updateTextNoUnit", "updateTextWithUnit", "StatusUpdateListener", "com.heytap.store.business.home-impl"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final class CountTimerUtil extends CountDownTimer {
    private int bgColor;
    private boolean isCountDownWithUnit;
    private float radius;
    private int textColor;
    private int textPaddingX;
    private int textPaddingY;
    private int textSpace;

    @Nullable
    private WeakReference<TextView> weakReferenceTextView;

    @Nullable
    private WeakReference<StatusUpdateListener> weakStatusListener;

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\b\u0010\u0004\u001a\u00020\u0003H\u0016¨\u0006\u0005À\u0006\u0003"}, d2 = {"Lcom/heytap/store/homemodule/utils/CountTimerUtil$StatusUpdateListener;", "", Constants.JsbConstants.METHOD_FINISH, "", "onTick", "com.heytap.store.business.home-impl"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public interface StatusUpdateListener {

        @Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
        public static final class DefaultImpls {
            @Deprecated
            public static void onFinish(@NotNull StatusUpdateListener statusUpdateListener) {
                Intrinsics.checkNotNullParameter(statusUpdateListener, "this");
                StatusUpdateListener.super.onFinish();
            }

            @Deprecated
            public static void onTick(@NotNull StatusUpdateListener statusUpdateListener) {
                Intrinsics.checkNotNullParameter(statusUpdateListener, "this");
                StatusUpdateListener.super.onTick();
            }
        }

        default void onFinish() {
        }

        default void onTick() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CountTimerUtil(long j2, long j3, @NotNull TextView textView) {
        super(j2, j3);
        Intrinsics.checkNotNullParameter(textView, "textView");
        ContextGetterUtils contextGetterUtils = ContextGetterUtils.INSTANCE;
        this.bgColor = ContextCompat.getColor(contextGetterUtils.getApp(), R.color.transparent);
        this.textColor = ContextCompat.getColor(contextGetterUtils.getApp(), R.color.black);
        this.textSpace = SizeUtils.INSTANCE.dp2px(3.0f);
        this.weakReferenceTextView = new WeakReference<>(textView);
    }

    private final CharSequence updateText(long millisUntilFinished) {
        return this.isCountDownWithUnit ? updateTextWithUnit(millisUntilFinished) : updateTextNoUnit(millisUntilFinished);
    }

    private final CharSequence updateTextNoUnit(long millisUntilFinished) {
        String time3 = TimeUtils.INSTANCE.getTime3(millisUntilFinished);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(time3);
        int i = 0;
        int iIndexOf$default = StringsKt__StringsKt.indexOf$default((CharSequence) time3, ":", 0, false, 4, (Object) null);
        while (iIndexOf$default >= 0) {
            spannableStringBuilder.setSpan(new RoundBackgroundSpan(this.bgColor, this.radius, this.textColor, this.textSpace, this.textPaddingX, this.textPaddingY), i, iIndexOf$default, 33);
            i = iIndexOf$default + 1;
            iIndexOf$default = StringsKt__StringsKt.indexOf$default((CharSequence) time3, ":", i, false, 4, (Object) null);
            if (iIndexOf$default == -1) {
                spannableStringBuilder.setSpan(new RoundBackgroundSpan(this.bgColor, this.radius, this.textColor, this.textSpace, this.textPaddingX, this.textPaddingY), i, time3.length(), 33);
                iIndexOf$default = -1;
            }
        }
        return spannableStringBuilder;
    }

    private final CharSequence updateTextWithUnit(long millisUntilFinished) {
        String timeWithUnit = TimeUtils.INSTANCE.getTimeWithUnit(millisUntilFinished);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(timeWithUnit);
        int iIndexOf$default = StringsKt__StringsKt.indexOf$default((CharSequence) timeWithUnit, "天", 0, false, 6, (Object) null);
        int i = 0;
        if (iIndexOf$default >= 0) {
            spannableStringBuilder.setSpan(new RoundBackgroundSpan(this.bgColor, this.radius, this.textColor, this.textSpace, this.textPaddingX, this.textPaddingY), 0, iIndexOf$default, 33);
            i = iIndexOf$default + 1;
        }
        int iIndexOf$default2 = StringsKt__StringsKt.indexOf$default((CharSequence) timeWithUnit, "时", 0, false, 6, (Object) null);
        spannableStringBuilder.setSpan(new RoundBackgroundSpan(this.bgColor, this.radius, this.textColor, this.textSpace, this.textPaddingX, this.textPaddingY), i, iIndexOf$default2, 33);
        int i2 = iIndexOf$default2 + 1;
        int iIndexOf$default3 = StringsKt__StringsKt.indexOf$default((CharSequence) timeWithUnit, "分", 0, false, 6, (Object) null);
        spannableStringBuilder.setSpan(new RoundBackgroundSpan(this.bgColor, this.radius, this.textColor, this.textSpace, this.textPaddingX, this.textPaddingY), i2, iIndexOf$default3, 33);
        spannableStringBuilder.setSpan(new RoundBackgroundSpan(this.bgColor, this.radius, this.textColor, this.textSpace, this.textPaddingX, this.textPaddingY), iIndexOf$default3 + 1, StringsKt__StringsKt.indexOf$default((CharSequence) timeWithUnit, "秒", 0, false, 6, (Object) null), 33);
        return spannableStringBuilder;
    }

    public final int getBgColor() {
        return this.bgColor;
    }

    public final float getRadius() {
        return this.radius;
    }

    public final int getTextColor() {
        return this.textColor;
    }

    public final int getTextPaddingX() {
        return this.textPaddingX;
    }

    public final int getTextPaddingY() {
        return this.textPaddingY;
    }

    public final int getTextSpace() {
        return this.textSpace;
    }

    @Nullable
    public final WeakReference<TextView> getWeakReferenceTextView() {
        return this.weakReferenceTextView;
    }

    @Nullable
    public final WeakReference<StatusUpdateListener> getWeakStatusListener() {
        return this.weakStatusListener;
    }

    /* JADX INFO: renamed from: isCountDownWithUnit, reason: from getter */
    public final boolean getIsCountDownWithUnit() {
        return this.isCountDownWithUnit;
    }

    @Override // android.os.CountDownTimer
    public void onFinish() {
        StatusUpdateListener statusUpdateListener;
        WeakReference<TextView> weakReference = this.weakReferenceTextView;
        TextView textView = weakReference == null ? null : weakReference.get();
        if (textView != null) {
            textView.setVisibility(8);
        }
        WeakReference<StatusUpdateListener> weakReference2 = this.weakStatusListener;
        if (weakReference2 == null || (statusUpdateListener = weakReference2.get()) == null) {
            return;
        }
        statusUpdateListener.onFinish();
    }

    @Override // android.os.CountDownTimer
    public void onTick(long millisUntilFinished) {
        TextView textView;
        WeakReference<TextView> weakReference = this.weakReferenceTextView;
        if ((weakReference == null ? null : weakReference.get()) == null) {
            cancel();
            return;
        }
        WeakReference<TextView> weakReference2 = this.weakReferenceTextView;
        if (weakReference2 == null || (textView = weakReference2.get()) == null) {
            return;
        }
        textView.setText(updateText(millisUntilFinished));
        textView.setVisibility(0);
    }

    public final void setBgColor(int i) {
        this.bgColor = i;
    }

    public final void setCountDownWithUnit(boolean z) {
        this.isCountDownWithUnit = z;
    }

    public final void setListener(@NotNull StatusUpdateListener listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.weakStatusListener = new WeakReference<>(listener);
    }

    public final void setRadius(float f) {
        this.radius = f;
    }

    public final void setTextColor(int i) {
        this.textColor = i;
    }

    public final void setTextPaddingX(int i) {
        this.textPaddingX = i;
    }

    public final void setTextPaddingY(int i) {
        this.textPaddingY = i;
    }

    public final void setTextSpace(int i) {
        this.textSpace = i;
    }

    public final void setWeakReferenceTextView(@Nullable WeakReference<TextView> weakReference) {
        this.weakReferenceTextView = weakReference;
    }

    public final void setWeakStatusListener(@Nullable WeakReference<StatusUpdateListener> weakReference) {
        this.weakStatusListener = weakReference;
    }
}
