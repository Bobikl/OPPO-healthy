package com.heytap.sports.track.data;

import android.annotation.SuppressLint;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.widget.ImageView;
import androidx.annotation.ColorInt;
import androidx.annotation.DrawableRes;
import androidx.compose.runtime.internal.StabilityInferred;
import com.google.gson.annotations.SerializedName;
import com.heytap.databaseengine.model.UserInfo;
import com.heytap.log.formatter.LogFieldKey;
import com.heytap.sporthealth.blib.adapter.face.OnViewClickListener;
import com.heytap.sporthealth.blib.adapter.holder.JViewHolder;
import com.heytap.sporthealth.blib.adapter.vb.JViewBean;
import com.heytap.sports.R$drawable;
import com.heytap.sports.R$id;
import com.heytap.sports.R$layout;
import com.heytap.sports.R$string;
import com.heytap.sports.track.TrackAniViewModelKt;
import com.heytap.sports.track.widget.SImageView;
import com.oplus.aiunit.vision.b2n;
import com.oplus.aiunit.vision.b78;
import com.oplus.aiunit.vision.hqf;
import com.oplus.aiunit.vision.jb3;
import com.oplus.aiunit.vision.kf1;
import com.oplus.aiunit.vision.ph2;
import com.oplus.aiunit.vision.qtf;
import com.oplus.aiunit.vision.rg7;
import com.oplus.aiunit.vision.wq8;
import com.oplus.aiunit.vision.yha;
import io.protostuff.MapSchema;
import java.util.List;
import kotlinx.coroutines.BuildersKt;
import org.hapjs.card.sdk.CardServiceDelegator;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.ResultKt;
import p010kotlin.coroutines.Continuation;
import p010kotlin.coroutines.CoroutineContext;
import p010kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.text.StringsKt__StringsJVMKt;
import p010kotlin.text.StringsKt__StringsKt;

/* JADX INFO: loaded from: classes2.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0010\u0007\n\u0002\b\u0017\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0087\b\u0018\u00002\u00020\u0001BO\u0012\b\b\u0003\u0010\u0004\u001a\u00020\u0015\u0012\b\b\u0003\u0010!\u001a\u00020\u0015\u0012\b\b\u0003\u0010#\u001a\u00020\u0015\u0012\n\b\u0002\u0010&\u001a\u0004\u0018\u00010\u0015\u0012\b\b\u0002\u0010,\u001a\u00020'\u0012\b\b\u0002\u0010/\u001a\u00020'\u0012\b\b\u0002\u00102\u001a\u00020\u0015¢\u0006\u0004\bM\u0010NJ\u001f\u0010\u0005\u001a\u00020\u0002*\u00020\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J6\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u00032\u000e\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n2\f\u0010\u000e\u001a\b\u0012\u0002\b\u0003\u0018\u00010\rH\u0016J\b\u0010\u0011\u001a\u00020\u0003H\u0016J\u0013\u0010\u0012\u001a\u00020\u0002H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0012\u0010\u0013J\u0013\u0010\u0014\u001a\u00020\u0002H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0014\u0010\u0013J\t\u0010\u0016\u001a\u00020\u0015HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0003HÖ\u0001J\u0013\u0010\u001a\u001a\u00020\u00192\b\u0010\u0018\u001a\u0004\u0018\u00010\u000bHÖ\u0003R\u001a\u0010\u0004\u001a\u00020\u00158\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u001a\u0010!\u001a\u00020\u00158\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001f\u0010\u001c\u001a\u0004\b \u0010\u001eR\u001a\u0010#\u001a\u00020\u00158\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\"\u0010\u001c\u001a\u0004\b\u001f\u0010\u001eR\u001c\u0010&\u001a\u0004\u0018\u00010\u00158\u0006X\u0087\u0004¢\u0006\f\n\u0004\b$\u0010\u001c\u001a\u0004\b%\u0010\u001eR\u001a\u0010,\u001a\u00020'8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+R\u001a\u0010/\u001a\u00020'8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b-\u0010)\u001a\u0004\b.\u0010+R\u001a\u00102\u001a\u00020\u00158\u0006X\u0087\u0004¢\u0006\f\n\u0004\b0\u0010\u001c\u001a\u0004\b1\u0010\u001eR\u0014\u00104\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u00103R\u0014\u00106\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b5\u00103R$\u0010;\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b \u00107\u001a\u0004\b5\u00108\"\u0004\b9\u0010:R$\u0010>\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b<\u00107\u001a\u0004\b\"\u00108\"\u0004\b=\u0010:R\u001e\u0010B\u001a\b\u0012\u0004\u0012\u00020@0?*\u00020\u00158BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b$\u0010AR\u0018\u0010D\u001a\u00020\u0019*\u00020\u00158BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b<\u0010CR\u001a\u0010F\u001a\u0004\u0018\u00010\u0002*\u00020\u00158BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b0\u0010ER\u001a\u0010G\u001a\u0004\u0018\u00010\u0002*\u00020\u00158BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b-\u0010ER\"\u0010H\u001a\u00020\u00038F@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bH\u00103\u001a\u0004\bI\u0010J\"\u0004\bK\u0010L\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006O"}, d2 = {"Lcom/heytap/sports/track/data/TraceStyle;", "Lcom/heytap/sporthealth/blib/adapter/vb/JViewBean;", "Landroid/graphics/Bitmap;", "", "color", "c", "(Landroid/graphics/Bitmap;Ljava/lang/Integer;)Landroid/graphics/Bitmap;", "Lcom/heytap/sporthealth/blib/adapter/holder/JViewHolder;", "viewHolder", "p1", "", "", "p2", "Lcom/heytap/sporthealth/blib/adapter/face/OnViewClickListener;", "p3", "", "onBindViewHolder", "bindLayout", "v", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", MapSchema.FIELD_NAME_ENTRY, "", "toString", "hashCode", "other", "", "equals", "i", "Ljava/lang/String;", "getColor", "()Ljava/lang/String;", "j", "r", "startMarker", MapSchema.FIELD_NAME_KEY, "endMarker", LogFieldKey.LEVEL_KEY, "getCover", "cover", "", LogFieldKey.MESSAGE_KEY, UserInfo.SEX_FEMALE, "f", "()F", "anchorX", "n", b2n.f, "anchorY", "o", LogFieldKey.PROCESS_NAME_KEY, "name", "I", "dp36", "q", "dp1_5", "Landroid/graphics/Bitmap;", "()Landroid/graphics/Bitmap;", "u", "(Landroid/graphics/Bitmap;)V", "startBitmap", "s", "t", "finishBitmap", "Lcom/oplus/aiunit/vision/hqf;", "Landroid/graphics/drawable/Drawable;", "(Ljava/lang/String;)Lcom/oplus/aiunit/vision/hqf;", "glide", "(Ljava/lang/String;)Z", "isAvatar", "(Ljava/lang/String;)Landroid/graphics/Bitmap;", "glideLoadStart", "glideLoadFinish", CardServiceDelegator.KEY_COLOR_INT, b2n.g, "()I", "setColorInt", "(I)V", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;FFLjava/lang/String;)V", "sport_impl_release"}, k = 1, mv = {1, 8, 0})
@SuppressLint({"SupportAnnotationUsage"})
public final /* data */ class TraceStyle extends JViewBean {
    public static final int $stable = 8;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata and from toString */
    @SerializedName("color")
    @NotNull
    private final String color;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata and from toString */
    @SerializedName("startMarker")
    @NotNull
    private final String startMarker;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata and from toString */
    @SerializedName("endMarker")
    @NotNull
    private final String endMarker;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata and from toString */
    @SerializedName("cover")
    @Nullable
    private final String cover;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata and from toString */
    @SerializedName("anchorX")
    private final float anchorX;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata and from toString */
    @SerializedName("anchorY")
    private final float anchorY;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata and from toString */
    @SerializedName("name")
    @NotNull
    private final String name;

    /* JADX INFO: renamed from: p, reason: from kotlin metadata */
    public final int dp36;

    /* JADX INFO: renamed from: q, reason: from kotlin metadata */
    public final int dp1_5;

    /* JADX INFO: renamed from: r, reason: from kotlin metadata */
    @Nullable
    public transient Bitmap startBitmap;

    /* JADX INFO: renamed from: s, reason: from kotlin metadata */
    @Nullable
    public transient Bitmap finishBitmap;

    @Metadata(d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J(\u0010\t\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006H\u0014¨\u0006\n"}, d2 = {"com/heytap/sports/track/data/TraceStyle$a", "Lcom/oplus/aiunit/vision/jb3;", "Lcom/oplus/aiunit/vision/kf1;", "pool", "Landroid/graphics/Bitmap;", "toTransform", "", "outWidth", "outHeight", "a", "sport_impl_release"}, k = 1, mv = {1, 8, 0})
    public static final class a extends jb3 {
        public a() {
        }

        @Override // com.oplus.aiunit.vision.jb3, com.oplus.aiunit.vision.sf1
        @NotNull
        public Bitmap a(@NotNull kf1 pool, @NotNull Bitmap toTransform, int outWidth, int outHeight) {
            Intrinsics.checkNotNullParameter(pool, "pool");
            Intrinsics.checkNotNullParameter(toTransform, "toTransform");
            TraceStyle traceStyle = TraceStyle.this;
            Bitmap bitmapA = super.a(pool, toTransform, outWidth, outHeight);
            Intrinsics.checkNotNullExpressionValue(bitmapA, "super.transform(pool, to…orm, outWidth, outHeight)");
            return TraceStyle.d(traceStyle, bitmapA, null, 1, null);
        }
    }

    public TraceStyle() {
        this(null, null, null, null, 0.0f, 0.0f, null, 127, null);
    }

    public static /* synthetic */ Bitmap d(TraceStyle traceStyle, Bitmap bitmap, Integer num, int i, Object obj) {
        if ((i & 1) != 0) {
            num = null;
        }
        return traceStyle.c(bitmap, num);
    }

    @Override // com.heytap.sporthealth.blib.adapter.vb.JViewBean
    public int bindLayout() {
        return R$layout.track_custom_style_item;
    }

    public final Bitmap c(Bitmap bitmap, Integer num) {
        float width;
        float strokeWidth;
        Bitmap asShared = bitmap.copy(Bitmap.Config.ARGB_8888, true);
        Canvas canvas = new Canvas(asShared);
        Paint paint = new Paint(1);
        paint.setColor(-1);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(this.dp1_5);
        if (num == null) {
            width = canvas.getWidth() / 2.0f;
            strokeWidth = paint.getStrokeWidth();
        } else {
            width = (canvas.getWidth() / 2.0f) - paint.getStrokeWidth();
            strokeWidth = paint.getStrokeWidth();
        }
        canvas.drawCircle(canvas.getWidth() / 2.0f, canvas.getHeight() / 2.0f, width - (strokeWidth / 2), paint);
        if (num != null) {
            float width2 = (canvas.getWidth() / 2.0f) - (paint.getStrokeWidth() / 2);
            paint.setColor(num.intValue());
            canvas.drawCircle(canvas.getWidth() / 2.0f, canvas.getHeight() / 2.0f, width2, paint);
        }
        Intrinsics.checkNotNullExpressionValue(asShared, "asShared");
        return asShared;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    public final Object e(@NotNull Continuation<? super Bitmap> continuation) throws Throwable {
        TraceStyle$finishBitmap$1 traceStyle$finishBitmap$1;
        if (continuation instanceof TraceStyle$finishBitmap$1) {
            traceStyle$finishBitmap$1 = (TraceStyle$finishBitmap$1) continuation;
            int i = traceStyle$finishBitmap$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                traceStyle$finishBitmap$1.label = i - Integer.MIN_VALUE;
            } else {
                traceStyle$finishBitmap$1 = new TraceStyle$finishBitmap$1(this, continuation);
            }
        } else {
            traceStyle$finishBitmap$1 = new TraceStyle$finishBitmap$1(this, continuation);
        }
        Object objWithContext = traceStyle$finishBitmap$1.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = traceStyle$finishBitmap$1.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objWithContext);
            CoroutineContext coroutineContextE = wq8.INSTANCE.e();
            TraceStyle$finishBitmap$2 traceStyle$finishBitmap$2 = new TraceStyle$finishBitmap$2(this, null);
            traceStyle$finishBitmap$1.label = 1;
            objWithContext = BuildersKt.withContext(coroutineContextE, traceStyle$finishBitmap$2, traceStyle$finishBitmap$1);
            if (objWithContext == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objWithContext);
        }
        Intrinsics.checkNotNullExpressionValue(objWithContext, "suspend fun finishBitmap…        }\n        }\n    }");
        return objWithContext;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TraceStyle)) {
            return false;
        }
        TraceStyle traceStyle = (TraceStyle) other;
        return Intrinsics.areEqual(this.color, traceStyle.color) && Intrinsics.areEqual(this.startMarker, traceStyle.startMarker) && Intrinsics.areEqual(this.endMarker, traceStyle.endMarker) && Intrinsics.areEqual(this.cover, traceStyle.cover) && Float.compare(this.anchorX, traceStyle.anchorX) == 0 && Float.compare(this.anchorY, traceStyle.anchorY) == 0 && Intrinsics.areEqual(this.name, traceStyle.name);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final float getAnchorX() {
        return this.anchorX;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final float getAnchorY() {
        return this.anchorY;
    }

    public final int h() {
        boolean zStartsWith$default = StringsKt__StringsJVMKt.startsWith$default(this.color, "#", false, 2, null);
        String str = this.color;
        return zStartsWith$default ? Color.parseColor(str) : Integer.parseInt(str);
    }

    public int hashCode() {
        int iHashCode = ((((this.color.hashCode() * 31) + this.startMarker.hashCode()) * 31) + this.endMarker.hashCode()) * 31;
        String str = this.cover;
        return ((((((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + Float.hashCode(this.anchorX)) * 31) + Float.hashCode(this.anchorY)) * 31) + this.name.hashCode();
    }

    @NotNull
    /* JADX INFO: renamed from: j, reason: from getter */
    public final String getEndMarker() {
        return this.endMarker;
    }

    @Nullable
    /* JADX INFO: renamed from: k, reason: from getter */
    public final Bitmap getFinishBitmap() {
        return this.finishBitmap;
    }

    public final hqf<Drawable> l(String str) {
        if (StringsKt__StringsJVMKt.startsWith$default(str, "http", false, 2, null)) {
            hqf<Drawable> hqfVarQ = com.bumptech.glide.a.v(b78.a()).q(str);
            Intrinsics.checkNotNullExpressionValue(hqfVarQ, "{\n                Glide.….load(this)\n            }");
            return hqfVarQ;
        }
        hqf<Drawable> hqfVarO = com.bumptech.glide.a.v(b78.a()).o(Integer.valueOf(Integer.parseInt(str)));
        Intrinsics.checkNotNullExpressionValue(hqfVarO, "{\n                Glide.…is.toInt())\n            }");
        return hqfVarO;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Bitmap n(String str) {
        try {
            if (s(str)) {
                R r = com.bumptech.glide.a.v(b78.a()).b().Y0(str).w0(new jb3()).f0(this.dp36).e1().get();
                Intrinsics.checkNotNullExpressionValue(r, "with(GlobalApplicationHo…ride(dp36).submit().get()");
                return c((Bitmap) r, Integer.valueOf(Color.parseColor("#EC3E3E")));
            }
            if (StringsKt__StringsJVMKt.startsWith$default(str, "http", false, 2, null)) {
                return (Bitmap) com.bumptech.glide.a.v(b78.a()).b().Y0(str).f0(this.dp36).e1().get();
            }
            return null;
        } catch (Exception e2) {
            yha.j(e2);
            return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Bitmap o(String str) {
        try {
            if (s(str)) {
                R r = com.bumptech.glide.a.v(b78.a()).b().Y0(str).w0(new jb3()).f0(this.dp36).e1().get();
                Intrinsics.checkNotNullExpressionValue(r, "with(GlobalApplicationHo…ride(dp36).submit().get()");
                return c((Bitmap) r, Integer.valueOf(Color.parseColor("#29CD68")));
            }
            if (StringsKt__StringsJVMKt.startsWith$default(str, "http", false, 2, null)) {
                return (Bitmap) com.bumptech.glide.a.v(b78.a()).b().Y0(str).f0(this.dp36).e1().get();
            }
            return null;
        } catch (Exception e2) {
            yha.j(e2);
            return null;
        }
    }

    @Override // com.heytap.sporthealth.blib.adapter.face.IRecvData
    public void onBindViewHolder(@NotNull JViewHolder viewHolder, int p1, @Nullable List<Object> p2, @Nullable OnViewClickListener<?> p3) {
        Intrinsics.checkNotNullParameter(viewHolder, "viewHolder");
        String str = this.cover;
        if (str != null) {
            ImageView imageView = (SImageView) viewHolder.getView(R$id.custom_style_item_ic);
            if (s(str)) {
                imageView.setBackgroundResource(R$drawable.ic_track_style_bg);
                int iB = qtf.b(18.0f);
                imageView.setPadding(iB, iB, iB, iB);
                l(str).w0(new a()).f0(this.dp36).Q0(imageView);
            } else {
                GradientDrawable gradientDrawable = new GradientDrawable();
                gradientDrawable.setColor(Color.parseColor(ph2.a(viewHolder.getActivity()) ? "#5C5C5C" : "#EDEDED"));
                gradientDrawable.setCornerRadius(qtf.c(18.0f));
                imageView.setBackground(gradientDrawable);
                l(str).f0(this.dp36).Q0(imageView);
            }
        }
        viewHolder.itemView.setEnabled(!Intrinsics.areEqual(TrackAniViewModelKt.a().getTraceStyle().name, this.name));
        ((ImageView) viewHolder.getView(R$id.custom_style_item_ic)).setSelected(Intrinsics.areEqual(TrackAniViewModelKt.a().getTraceStyle().name, this.name));
        viewHolder.setText(R$id.custom_style_item_name, this.name);
    }

    @NotNull
    /* JADX INFO: renamed from: p, reason: from getter */
    public final String getName() {
        return this.name;
    }

    @Nullable
    /* JADX INFO: renamed from: q, reason: from getter */
    public final Bitmap getStartBitmap() {
        return this.startBitmap;
    }

    @NotNull
    /* JADX INFO: renamed from: r, reason: from getter */
    public final String getStartMarker() {
        return this.startMarker;
    }

    public final boolean s(String str) {
        return StringsKt__StringsKt.contains$default((CharSequence) str, (CharSequence) "usercenter-avatar", false, 2, (Object) null);
    }

    public final void t(@Nullable Bitmap bitmap) {
        this.finishBitmap = bitmap;
    }

    @NotNull
    public String toString() {
        return "TraceStyle(color=" + this.color + ", startMarker=" + this.startMarker + ", endMarker=" + this.endMarker + ", cover=" + this.cover + ", anchorX=" + this.anchorX + ", anchorY=" + this.anchorY + ", name=" + this.name + ")";
    }

    public final void u(@Nullable Bitmap bitmap) {
        this.startBitmap = bitmap;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    public final Object v(@NotNull Continuation<? super Bitmap> continuation) throws Throwable {
        TraceStyle$startBitmap$1 traceStyle$startBitmap$1;
        if (continuation instanceof TraceStyle$startBitmap$1) {
            traceStyle$startBitmap$1 = (TraceStyle$startBitmap$1) continuation;
            int i = traceStyle$startBitmap$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                traceStyle$startBitmap$1.label = i - Integer.MIN_VALUE;
            } else {
                traceStyle$startBitmap$1 = new TraceStyle$startBitmap$1(this, continuation);
            }
        } else {
            traceStyle$startBitmap$1 = new TraceStyle$startBitmap$1(this, continuation);
        }
        Object objWithContext = traceStyle$startBitmap$1.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = traceStyle$startBitmap$1.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objWithContext);
            CoroutineContext coroutineContextE = wq8.INSTANCE.e();
            TraceStyle$startBitmap$2 traceStyle$startBitmap$2 = new TraceStyle$startBitmap$2(this, null);
            traceStyle$startBitmap$1.label = 1;
            objWithContext = BuildersKt.withContext(coroutineContextE, traceStyle$startBitmap$2, traceStyle$startBitmap$1);
            if (objWithContext == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objWithContext);
        }
        Intrinsics.checkNotNullExpressionValue(objWithContext, "suspend fun startBitmap(…        }\n        }\n    }");
        return objWithContext;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ TraceStyle(String str, String str2, String str3, String str4, float f, float f2, String str5, int i, DefaultConstructorMarker defaultConstructorMarker) {
        str = (i & 1) != 0 ? "#29CD68" : str;
        String strValueOf = (i & 2) != 0 ? String.valueOf(R$drawable.ic_line_start_run) : str2;
        String strValueOf2 = (i & 4) != 0 ? String.valueOf(R$drawable.ic_line_finish) : str3;
        String strValueOf3 = (i & 8) != 0 ? String.valueOf(R$drawable.ic_track_style_def) : str4;
        float f3 = (i & 16) != 0 ? 0.5f : f;
        float f4 = (i & 32) != 0 ? 0.8f : f2;
        if ((i & 64) != 0) {
            str5 = rg7.e(R$string.sports_track_style_default);
            Intrinsics.checkNotNullExpressionValue(str5, "findString(R.string.sports_track_style_default)");
        }
        this(str, strValueOf, strValueOf2, strValueOf3, f3, f4, str5);
    }

    public TraceStyle(@ColorInt @NotNull String color, @DrawableRes @NotNull String startMarker, @DrawableRes @NotNull String endMarker, @Nullable String str, float f, float f2, @NotNull String name) {
        Intrinsics.checkNotNullParameter(color, "color");
        Intrinsics.checkNotNullParameter(startMarker, "startMarker");
        Intrinsics.checkNotNullParameter(endMarker, "endMarker");
        Intrinsics.checkNotNullParameter(name, "name");
        this.color = color;
        this.startMarker = startMarker;
        this.endMarker = endMarker;
        this.cover = str;
        this.anchorX = f;
        this.anchorY = f2;
        this.name = name;
        this.dp36 = qtf.b(36.0f);
        this.dp1_5 = qtf.b(1.5f);
    }
}
