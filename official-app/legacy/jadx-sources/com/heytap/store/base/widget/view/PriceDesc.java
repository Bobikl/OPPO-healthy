package com.heytap.store.base.widget.view;

import com.oplus.smartenginehelper.ParserTag;
import com.oplus.smartenginehelper.entity.ClickApiEntity;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0010\u0007\n\u0002\b4\b\u0002\u0018\u0000 E2\u00020\u0001:\u0001EB¹\u0001\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\u0003\u0012\b\b\u0002\u0010\t\u001a\u00020\u0005\u0012\b\b\u0002\u0010\n\u001a\u00020\u0007\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\f\u001a\u00020\u0003\u0012\b\b\u0002\u0010\r\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0012\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0007\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0007\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0012\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0017\u001a\u00020\u0005¢\u0006\u0002\u0010\u0018R\u001a\u0010\u0016\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\u001a\u0010\u0017\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R\u001a\u0010\u0006\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b%\u0010\u001a\"\u0004\b&\u0010\u001cR\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b'\u0010\u001e\"\u0004\b(\u0010 R\u001a\u0010\u0015\u001a\u00020\u0012X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b)\u0010*\"\u0004\b+\u0010,R\u001a\u0010\u000e\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b-\u0010\u001a\"\u0004\b.\u0010\u001cR\u001a\u0010\u000f\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b/\u0010\u001e\"\u0004\b0\u0010 R\u001a\u0010\u0014\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b1\u0010\"\"\u0004\b2\u0010$R\u001a\u0010\u0011\u001a\u00020\u0012X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b3\u0010*\"\u0004\b4\u0010,R\u001a\u0010\u0013\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b5\u0010\"\"\u0004\b6\u0010$R\u001a\u0010\n\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b7\u0010\"\"\u0004\b8\u0010$R\u001a\u0010\b\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b9\u0010\u001a\"\u0004\b:\u0010\u001cR\u001a\u0010\t\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b;\u0010\u001e\"\u0004\b<\u0010 R\u001a\u0010\u000b\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b=\u0010\"\"\u0004\b>\u0010$R\u001a\u0010\f\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b?\u0010\u001a\"\u0004\b@\u0010\u001cR\u001a\u0010\r\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bA\u0010\u001e\"\u0004\bB\u0010 R\u001a\u0010\u0010\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bC\u0010\u001e\"\u0004\bD\u0010 ¨\u0006F"}, d2 = {"Lcom/heytap/store/base/widget/view/PriceDesc;", "", "mainPrice", "", "mainPriceColor", "", "mainNeedCurrencySymbol", "", "subPrice", "subPriceColor", "subNeedCurrencySymbol", "subStrikeThru", "suffix", "suffixColor", "prefix", "prefixColor", ParserTag.TAG_TEXT_SIZE, "smallSizeRatio", "", "smallSizeRatioNotLimit", "smallMainPrice", "placeHolderWidthRatio", "currencySymbol", "gravity", "(Ljava/lang/String;IZLjava/lang/String;IZZLjava/lang/String;ILjava/lang/String;IIFZZFLjava/lang/String;I)V", "getCurrencySymbol", "()Ljava/lang/String;", "setCurrencySymbol", "(Ljava/lang/String;)V", "getGravity", "()I", "setGravity", "(I)V", "getMainNeedCurrencySymbol", "()Z", "setMainNeedCurrencySymbol", "(Z)V", "getMainPrice", "setMainPrice", "getMainPriceColor", "setMainPriceColor", "getPlaceHolderWidthRatio", "()F", "setPlaceHolderWidthRatio", "(F)V", "getPrefix", "setPrefix", "getPrefixColor", "setPrefixColor", "getSmallMainPrice", "setSmallMainPrice", "getSmallSizeRatio", "setSmallSizeRatio", "getSmallSizeRatioNotLimit", "setSmallSizeRatioNotLimit", "getSubNeedCurrencySymbol", "setSubNeedCurrencySymbol", "getSubPrice", "setSubPrice", "getSubPriceColor", "setSubPriceColor", "getSubStrikeThru", "setSubStrikeThru", "getSuffix", "setSuffix", "getSuffixColor", "setSuffixColor", "getTextSize", ClickApiEntity.SET_TEXT_SIZE, "Companion", "Widget_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
final class PriceDesc {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private String currencySymbol;
    private int gravity;
    private boolean mainNeedCurrencySymbol;

    @NotNull
    private String mainPrice;
    private int mainPriceColor;
    private float placeHolderWidthRatio;

    @NotNull
    private String prefix;
    private int prefixColor;
    private boolean smallMainPrice;
    private float smallSizeRatio;
    private boolean smallSizeRatioNotLimit;
    private boolean subNeedCurrencySymbol;

    @NotNull
    private String subPrice;
    private int subPriceColor;
    private boolean subStrikeThru;

    @NotNull
    private String suffix;
    private int suffixColor;
    private int textSize;

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0006\u0010\u0003\u001a\u00020\u0004¨\u0006\u0005"}, d2 = {"Lcom/heytap/store/base/widget/view/PriceDesc$Companion;", "", "()V", "ofDefault", "Lcom/heytap/store/base/widget/view/PriceDesc;", "Widget_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final PriceDesc ofDefault() {
            return new PriceDesc(null, 0, false, null, 0, false, false, null, 0, null, 0, 0, 0.0f, false, false, 0.0f, null, 0, 262143, null);
        }
    }

    public PriceDesc() {
        this(null, 0, false, null, 0, false, false, null, 0, null, 0, 0, 0.0f, false, false, 0.0f, null, 0, 262143, null);
    }

    @NotNull
    public final String getCurrencySymbol() {
        return this.currencySymbol;
    }

    public final int getGravity() {
        return this.gravity;
    }

    public final boolean getMainNeedCurrencySymbol() {
        return this.mainNeedCurrencySymbol;
    }

    @NotNull
    public final String getMainPrice() {
        return this.mainPrice;
    }

    public final int getMainPriceColor() {
        return this.mainPriceColor;
    }

    public final float getPlaceHolderWidthRatio() {
        return this.placeHolderWidthRatio;
    }

    @NotNull
    public final String getPrefix() {
        return this.prefix;
    }

    public final int getPrefixColor() {
        return this.prefixColor;
    }

    public final boolean getSmallMainPrice() {
        return this.smallMainPrice;
    }

    public final float getSmallSizeRatio() {
        return this.smallSizeRatio;
    }

    public final boolean getSmallSizeRatioNotLimit() {
        return this.smallSizeRatioNotLimit;
    }

    public final boolean getSubNeedCurrencySymbol() {
        return this.subNeedCurrencySymbol;
    }

    @NotNull
    public final String getSubPrice() {
        return this.subPrice;
    }

    public final int getSubPriceColor() {
        return this.subPriceColor;
    }

    public final boolean getSubStrikeThru() {
        return this.subStrikeThru;
    }

    @NotNull
    public final String getSuffix() {
        return this.suffix;
    }

    public final int getSuffixColor() {
        return this.suffixColor;
    }

    public final int getTextSize() {
        return this.textSize;
    }

    public final void setCurrencySymbol(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.currencySymbol = str;
    }

    public final void setGravity(int i) {
        this.gravity = i;
    }

    public final void setMainNeedCurrencySymbol(boolean z) {
        this.mainNeedCurrencySymbol = z;
    }

    public final void setMainPrice(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.mainPrice = str;
    }

    public final void setMainPriceColor(int i) {
        this.mainPriceColor = i;
    }

    public final void setPlaceHolderWidthRatio(float f) {
        this.placeHolderWidthRatio = f;
    }

    public final void setPrefix(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.prefix = str;
    }

    public final void setPrefixColor(int i) {
        this.prefixColor = i;
    }

    public final void setSmallMainPrice(boolean z) {
        this.smallMainPrice = z;
    }

    public final void setSmallSizeRatio(float f) {
        this.smallSizeRatio = f;
    }

    public final void setSmallSizeRatioNotLimit(boolean z) {
        this.smallSizeRatioNotLimit = z;
    }

    public final void setSubNeedCurrencySymbol(boolean z) {
        this.subNeedCurrencySymbol = z;
    }

    public final void setSubPrice(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.subPrice = str;
    }

    public final void setSubPriceColor(int i) {
        this.subPriceColor = i;
    }

    public final void setSubStrikeThru(boolean z) {
        this.subStrikeThru = z;
    }

    public final void setSuffix(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.suffix = str;
    }

    public final void setSuffixColor(int i) {
        this.suffixColor = i;
    }

    public final void setTextSize(int i) {
        this.textSize = i;
    }

    public PriceDesc(@NotNull String mainPrice, int i, boolean z, @NotNull String subPrice, int i2, boolean z2, boolean z3, @NotNull String suffix, int i3, @NotNull String prefix, int i4, int i5, float f, boolean z4, boolean z5, float f2, @NotNull String currencySymbol, int i6) {
        Intrinsics.checkNotNullParameter(mainPrice, "mainPrice");
        Intrinsics.checkNotNullParameter(subPrice, "subPrice");
        Intrinsics.checkNotNullParameter(suffix, "suffix");
        Intrinsics.checkNotNullParameter(prefix, "prefix");
        Intrinsics.checkNotNullParameter(currencySymbol, "currencySymbol");
        this.mainPrice = mainPrice;
        this.mainPriceColor = i;
        this.mainNeedCurrencySymbol = z;
        this.subPrice = subPrice;
        this.subPriceColor = i2;
        this.subNeedCurrencySymbol = z2;
        this.subStrikeThru = z3;
        this.suffix = suffix;
        this.suffixColor = i3;
        this.prefix = prefix;
        this.prefixColor = i4;
        this.textSize = i5;
        this.smallSizeRatio = f;
        this.smallSizeRatioNotLimit = z4;
        this.smallMainPrice = z5;
        this.placeHolderWidthRatio = f2;
        this.currencySymbol = currencySymbol;
        this.gravity = i6;
    }

    public /* synthetic */ PriceDesc(String str, int i, boolean z, String str2, int i2, boolean z2, boolean z3, String str3, int i3, String str4, int i4, int i5, float f, boolean z4, boolean z5, float f2, String str5, int i6, int i7, DefaultConstructorMarker defaultConstructorMarker) {
        this((i7 & 1) != 0 ? "" : str, (i7 & 2) != 0 ? -16777216 : i, (i7 & 4) != 0 ? true : z, (i7 & 8) != 0 ? "" : str2, (i7 & 16) != 0 ? -16777216 : i2, (i7 & 32) != 0 ? true : z2, (i7 & 64) == 0 ? z3 : true, (i7 & 128) != 0 ? "" : str3, (i7 & 256) != 0 ? -16777216 : i3, (i7 & 512) == 0 ? str4 : "", (i7 & 1024) == 0 ? i4 : -16777216, (i7 & 2048) != 0 ? 60 : i5, (i7 & 4096) != 0 ? 0.66f : f, (i7 & 8192) != 0 ? false : z4, (i7 & 16384) != 0 ? false : z5, (i7 & 32768) != 0 ? 0.125f : f2, (i7 & 65536) != 0 ? "¥" : str5, (i7 & 131072) != 0 ? 3 : i6);
    }
}
