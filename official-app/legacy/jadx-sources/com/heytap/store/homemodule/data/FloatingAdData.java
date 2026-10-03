package com.heytap.store.homemodule.data;

import androidx.annotation.Keep;
import com.heytap.store.base.core.util.statistics.bean.SensorsBean;
import com.heytap.store.base.widget.state.data.StateConstantsKt;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.text.StringsKt__StringsJVMKt;
import p010kotlin.text.StringsKt__StringsKt;

/* JADX INFO: loaded from: classes5.dex */
@Keep
@Metadata(d1 = {"\u00003\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0003\b\u008a\u0001\b\u0087\b\u0018\u0000 ¡\u00012\u00020\u0001:\u0002¡\u0001B\u008b\u0003\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\u0007\u0012\u0006\u0010\u000b\u001a\u00020\u0007\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u000f\u001a\u00020\u0007\u0012\u0006\u0010\u0010\u001a\u00020\u0007\u0012\u0006\u0010\u0011\u001a\u00020\u0007\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0007\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0007\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0007\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0007\u0012\u0010\b\u0002\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u0017\u0012\b\b\u0002\u0010\u0019\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u0007\u0012\u0010\b\u0002\u0010 \u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0017\u0012\b\b\u0002\u0010!\u001a\u00020\u0003\u0012\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010$\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010%\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010&\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010'\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010(\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010)\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0002\u0010*\u001a\u00020\u0007\u0012\b\b\u0002\u0010+\u001a\u00020\u0007\u0012\b\b\u0002\u0010,\u001a\u00020\u0007¢\u0006\u0002\u0010-J\t\u0010w\u001a\u00020\u0003HÆ\u0003J\t\u0010x\u001a\u00020\u0007HÆ\u0003J\t\u0010y\u001a\u00020\u0007HÆ\u0003J\t\u0010z\u001a\u00020\u0007HÆ\u0003J\t\u0010{\u001a\u00020\u0007HÆ\u0003J\t\u0010|\u001a\u00020\u0007HÆ\u0003J\t\u0010}\u001a\u00020\u0007HÆ\u0003J\t\u0010~\u001a\u00020\u0007HÆ\u0003J\u0011\u0010\u007f\u001a\n\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u0017HÆ\u0003J\n\u0010\u0080\u0001\u001a\u00020\u0003HÆ\u0003J\f\u0010\u0081\u0001\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\n\u0010\u0082\u0001\u001a\u00020\u0005HÆ\u0003J\f\u0010\u0083\u0001\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\f\u0010\u0084\u0001\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\f\u0010\u0085\u0001\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\f\u0010\u0086\u0001\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\f\u0010\u0087\u0001\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u0012\u0010\u0088\u0001\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0017HÆ\u0003J\n\u0010\u0089\u0001\u001a\u00020\u0003HÆ\u0003J\f\u0010\u008a\u0001\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\f\u0010\u008b\u0001\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\f\u0010\u008c\u0001\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\n\u0010\u008d\u0001\u001a\u00020\u0007HÆ\u0003J\f\u0010\u008e\u0001\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\f\u0010\u008f\u0001\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\f\u0010\u0090\u0001\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\f\u0010\u0091\u0001\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\f\u0010\u0092\u0001\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\n\u0010\u0093\u0001\u001a\u00020\u0007HÆ\u0003J\n\u0010\u0094\u0001\u001a\u00020\u0007HÆ\u0003J\n\u0010\u0095\u0001\u001a\u00020\u0007HÆ\u0003J\n\u0010\u0096\u0001\u001a\u00020\u0007HÆ\u0003J\n\u0010\u0097\u0001\u001a\u00020\u0007HÆ\u0003J\n\u0010\u0098\u0001\u001a\u00020\u0007HÆ\u0003J\n\u0010\u0099\u0001\u001a\u00020\u0007HÆ\u0003J\n\u0010\u009a\u0001\u001a\u00020\rHÆ\u0003J\n\u0010\u009b\u0001\u001a\u00020\rHÆ\u0003J¨\u0003\u0010\u009c\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\u00072\b\b\u0002\u0010\u000b\u001a\u00020\u00072\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\r2\b\b\u0002\u0010\u000f\u001a\u00020\u00072\b\b\u0002\u0010\u0010\u001a\u00020\u00072\b\b\u0002\u0010\u0011\u001a\u00020\u00072\b\b\u0002\u0010\u0012\u001a\u00020\u00072\b\b\u0002\u0010\u0013\u001a\u00020\u00072\b\b\u0002\u0010\u0014\u001a\u00020\u00072\b\b\u0002\u0010\u0015\u001a\u00020\u00072\u0010\b\u0002\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u00172\b\b\u0002\u0010\u0019\u001a\u00020\u00032\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u00072\u0010\b\u0002\u0010 \u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00172\b\b\u0002\u0010!\u001a\u00020\u00032\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010$\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010%\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010&\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010'\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010(\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010)\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010*\u001a\u00020\u00072\b\b\u0002\u0010+\u001a\u00020\u00072\b\b\u0002\u0010,\u001a\u00020\u0007HÆ\u0001J\u0015\u0010\u009d\u0001\u001a\u00020\r2\t\u0010\u009e\u0001\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\n\u0010\u009f\u0001\u001a\u00020\u0003HÖ\u0001J\n\u0010 \u0001\u001a\u00020\u0007HÖ\u0001R\u0011\u0010\u0011\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b.\u0010/R\u001a\u0010*\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b0\u0010/\"\u0004\b1\u00102R\u001a\u0010+\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b3\u0010/\"\u0004\b4\u00102R\u001a\u0010,\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b5\u0010/\"\u0004\b6\u00102R\u0011\u0010\u0013\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b7\u0010/R\u0011\u0010\u0012\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b8\u0010/R\u0011\u0010!\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b9\u0010:R\u0011\u0010;\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b<\u0010:R\u0013\u0010\"\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b=\u0010/R\u0011\u0010\u0015\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b>\u0010/R\u0011\u0010\n\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b?\u0010/R\u0011\u0010\u0014\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b@\u0010/R\u0011\u0010A\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\bB\u0010:R\u0011\u0010C\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\bD\u0010:R\u0014\u0010E\u001a\u00020\u0007X\u0086D¢\u0006\b\n\u0000\u001a\u0004\bF\u0010/R\u0011\u0010\u0019\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\bG\u0010:R\u0013\u0010\u001a\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\bH\u0010/R\u0013\u0010\u001c\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\bI\u0010/R\u0013\u0010\u001b\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\bJ\u0010/R\u0013\u0010'\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\bK\u0010/R\u0011\u0010L\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\bM\u0010:R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\bN\u0010OR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\bP\u0010/R\u001c\u0010\u001e\u001a\u0004\u0018\u00010\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bQ\u0010/\"\u0004\bR\u00102R\u001a\u0010S\u001a\u00020\rX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bS\u0010T\"\u0004\bU\u0010VR\u0011\u0010W\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\bW\u0010TR\u0011\u0010X\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\bX\u0010TR\u0011\u0010Y\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\bY\u0010TR\u0011\u0010Z\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\bZ\u0010TR\u0011\u0010[\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b[\u0010TR\u0011\u0010\\\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b\\\u0010TR\u0013\u0010\u001d\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b]\u0010/R\u0011\u0010\u000b\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b^\u0010/R\u0011\u0010\b\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b_\u0010/R\u0013\u0010#\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b`\u0010/R\u0013\u0010$\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\ba\u0010/R\u0013\u0010%\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\bb\u0010/R\u0011\u0010\u0010\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\bc\u0010/R\u0011\u0010\u000f\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\bd\u0010/R\u0011\u0010\f\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\be\u0010TR\u0013\u0010&\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\bf\u0010/R\u0011\u0010g\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\bh\u0010TR\u0011\u0010\u000e\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\bi\u0010TR\u0013\u0010)\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\bj\u0010/R\u001c\u0010\u001f\u001a\u0004\u0018\u00010\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bk\u0010/\"\u0004\bl\u00102R\u0011\u0010\t\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\bm\u0010/R\u0019\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u0017¢\u0006\b\n\u0000\u001a\u0004\bn\u0010oR\u0013\u0010(\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\bp\u0010/R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bq\u0010:\"\u0004\br\u0010sR\"\u0010 \u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0017X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bt\u0010o\"\u0004\bu\u0010v¨\u0006¢\u0001"}, d2 = {"Lcom/heytap/store/homemodule/data/FloatingAdData;", "", "type", "", "id", "", "imageUrl", "", "lottieUrl", "text", StateConstantsKt.STATE_ACTION_BTN_CLICK, "link", "needLogin", "", "showCloseBtn", "moduleName", "moduleCode", "adDetail", "bgImageUrl", "bgColorValue", "buttonTextColor", "buttonBgColor", "textLocation", "", "Lcom/heytap/store/homemodule/data/ColorSpanInfo;", "countdown", "countdownColor", "countdownTextColorValue", "countdownText", "jumpType", "initUrl", "slideUrl", "underwrittenGoodsUrlList", "bubbleSceneType", "buriedText", "mediaDigitalAdId", "mediaDigitalAdName", "mediaDigitalSceneId", "orderId", "couponId", "transparent", "skuId", SensorsBean.AD_DETAIL, "attach", "attachTwo", "(IJLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getAdDetail", "()Ljava/lang/String;", "getAddetail", "setAddetail", "(Ljava/lang/String;)V", "getAttach", "setAttach", "getAttachTwo", "setAttachTwo", "getBgColorValue", "getBgImageUrl", "getBubbleSceneType", "()I", "bubbleTextVisible", "getBubbleTextVisible", "getBuriedText", "getButtonBgColor", "getButtonText", "getButtonTextColor", "buttonVisibility", "getButtonVisibility", "countDownIndex", "getCountDownIndex", "countSymbol", "getCountSymbol", "getCountdown", "getCountdownColor", "getCountdownText", "getCountdownTextColorValue", "getCouponId", "iconVisibility", "getIconVisibility", "getId", "()J", "getImageUrl", "getInitUrl", "setInitUrl", "isAnimImgStyle", "()Z", "setAnimImgStyle", "(Z)V", "isBoundBackGround", "isFullBackGround", "isGuideMode", "isInvalidCount", "isPureBackGround", "isTypeValid", "getJumpType", "getLink", "getLottieUrl", "getMediaDigitalAdId", "getMediaDigitalAdName", "getMediaDigitalSceneId", "getModuleCode", "getModuleName", "getNeedLogin", "getOrderId", "removeMargin", "getRemoveMargin", "getShowCloseBtn", "getSkuId", "getSlideUrl", "setSlideUrl", "getText", "getTextLocation", "()Ljava/util/List;", "getTransparent", "getType", "setType", "(I)V", "getUnderwrittenGoodsUrlList", "setUnderwrittenGoodsUrlList", "(Ljava/util/List;)V", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component2", "component20", "component21", "component22", "component23", "component24", "component25", "component26", "component27", "component28", "component29", "component3", "component30", "component31", "component32", "component33", "component34", "component35", "component36", "component37", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "other", "hashCode", "toString", "Companion", "com.heytap.store.business.home-impl"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final /* data */ class FloatingAdData {
    public static final int BUBBLE_BACK_GROUND_BORDER = 5;
    public static final int BUBBLE_BACK_GROUND_FULL = 6;
    public static final int BUBBLE_LEFT_IMAGE_LARGE = 3;
    public static final int BUBBLE_LEFT_IMAGE_MIDDLE = 2;
    public static final int BUBBLE_LEFT_IMAGE_SMALL = 1;
    public static final int BUBBLE_LEFT_NONE_IMAGE = 4;
    public static final int BUBBLE_TAB_BIG_PROMOTION = 13;
    public static final int BUBBLE_TAB_GUIDE = 7;
    public static final int BUBBLE_TAB_RESERVE_NOTIFY = 14;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private final String adDetail;

    @NotNull
    private String addetail;

    @NotNull
    private String attach;

    @NotNull
    private String attachTwo;

    @NotNull
    private final String bgColorValue;

    @NotNull
    private final String bgImageUrl;
    private final int bubbleSceneType;
    private final int bubbleTextVisible;

    @Nullable
    private final String buriedText;

    @NotNull
    private final String buttonBgColor;

    @NotNull
    private final String buttonText;

    @NotNull
    private final String buttonTextColor;
    private final int buttonVisibility;
    private final int countDownIndex;

    @NotNull
    private final String countSymbol;
    private final int countdown;

    @Nullable
    private final String countdownColor;

    @Nullable
    private final String countdownText;

    @Nullable
    private final String countdownTextColorValue;

    @Nullable
    private final String couponId;
    private final int iconVisibility;
    private final long id;

    @NotNull
    private final String imageUrl;

    @Nullable
    private String initUrl;
    private boolean isAnimImgStyle;
    private final boolean isBoundBackGround;
    private final boolean isFullBackGround;
    private final boolean isGuideMode;
    private final boolean isInvalidCount;
    private final boolean isPureBackGround;
    private final boolean isTypeValid;

    @Nullable
    private final String jumpType;

    @NotNull
    private final String link;

    @NotNull
    private final String lottieUrl;

    @Nullable
    private final String mediaDigitalAdId;

    @Nullable
    private final String mediaDigitalAdName;

    @Nullable
    private final String mediaDigitalSceneId;

    @NotNull
    private final String moduleCode;

    @NotNull
    private final String moduleName;
    private final boolean needLogin;

    @Nullable
    private final String orderId;
    private final boolean removeMargin;
    private final boolean showCloseBtn;

    @Nullable
    private final String skuId;

    @Nullable
    private String slideUrl;

    @NotNull
    private final String text;

    @Nullable
    private final List<ColorSpanInfo> textLocation;

    @Nullable
    private final String transparent;
    private int type;

    @Nullable
    private List<String> underwrittenGoodsUrlList;

    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001c\u0010\r\u001a\u0004\u0018\u00010\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u0012J\u001a\u0010\u0013\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u00142\b\b\u0002\u0010\u0015\u001a\u00020\u0016J\b\u0010\u0017\u001a\u00020\u000eH\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0018"}, d2 = {"Lcom/heytap/store/homemodule/data/FloatingAdData$Companion;", "", "()V", "BUBBLE_BACK_GROUND_BORDER", "", "BUBBLE_BACK_GROUND_FULL", "BUBBLE_LEFT_IMAGE_LARGE", "BUBBLE_LEFT_IMAGE_MIDDLE", "BUBBLE_LEFT_IMAGE_SMALL", "BUBBLE_LEFT_NONE_IMAGE", "BUBBLE_TAB_BIG_PROMOTION", "BUBBLE_TAB_GUIDE", "BUBBLE_TAB_RESERVE_NOTIFY", "fromHomeFloatingData", "Lcom/heytap/store/homemodule/data/FloatingAdData;", "data", "Lcom/heytap/store/homemodule/data/HomeBottomAdData$Data;", "adDetail", "", "fromIconDetails", "Lcom/heytap/store/homemodule/data/IconDetails;", "showCloseBtn", "", "ofEmpty", "com.heytap.store.business.home-impl"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ FloatingAdData fromHomeFloatingData$default(Companion companion, HomeBottomAdData.Data data, String str, int i, Object obj) {
            if ((i & 2) != 0) {
                str = "";
            }
            return companion.fromHomeFloatingData(data, str);
        }

        public static /* synthetic */ FloatingAdData fromIconDetails$default(Companion companion, IconDetails iconDetails, boolean z, int i, Object obj) {
            if ((i & 2) != 0) {
                z = false;
            }
            return companion.fromIconDetails(iconDetails, z);
        }

        private final FloatingAdData ofEmpty() {
            return new FloatingAdData(-1, -1L, "", "", "", "", "", false, false, "", "", "", null, null, null, null, null, 0, null, null, null, null, null, null, null, 0, null, null, null, null, null, null, null, null, null, null, null, -4096, 31, null);
        }

        @Nullable
        public final FloatingAdData fromHomeFloatingData(@Nullable HomeBottomAdData.Data data, @NotNull String adDetail) {
            String string;
            Intrinsics.checkNotNullParameter(adDetail, "adDetail");
            if (data == null) {
                return null;
            }
            Integer type = data.getType();
            int iIntValue = type == null ? 1 : type.intValue();
            String leftIcon = data.getLeftIcon();
            String str = leftIcon == null ? "" : leftIcon;
            Long id = data.getId();
            long jLongValue = id == null ? -1L : id.longValue();
            String text = data.getText();
            String str2 = text == null ? "" : text;
            String rightButtonText = data.getRightButtonText();
            String str3 = rightButtonText == null ? "" : rightButtonText;
            String link = data.getLink();
            String str4 = link == null ? "" : link;
            boolean z = data.getTopRightCloseButton() == 1;
            Long id2 = data.getId();
            String str5 = (id2 == null || (string = id2.toString()) == null) ? "" : string;
            String backgroundImage = data.getBackgroundImage();
            String str6 = backgroundImage == null ? "" : backgroundImage;
            String backgroundColor = data.getBackgroundColor();
            String str7 = backgroundColor == null ? "" : backgroundColor;
            String rightButtonTextColor = data.getRightButtonTextColor();
            String str8 = rightButtonTextColor == null ? "" : rightButtonTextColor;
            String rightButtonBackgroundColor = data.getRightButtonBackgroundColor();
            String str9 = rightButtonBackgroundColor == null ? "" : rightButtonBackgroundColor;
            List<ColorSpanInfo> textLocation = data.getTextLocation();
            int countdown = data.getCountdown();
            String countdownColor = data.getCountdownColor();
            String countdownTextColorValue = data.getCountdownTextColorValue();
            String countdownText = data.getCountdownText();
            int bubbleSceneType = data.getBubbleSceneType();
            String buriedText = data.getBuriedText();
            String mediaDigitalAdId = data.getMediaDigitalAdId();
            String mediaDigitalAdName = data.getMediaDigitalAdName();
            String mediaDigitalSceneId = data.getMediaDigitalSceneId();
            String orderId = data.getOrderId();
            String couponId = data.getCouponId();
            String transparent = data.getTransparent();
            String skuId = data.getSkuId();
            String jumpType = data.getJumpType();
            String addetail = data.getAddetail();
            String str10 = addetail == null ? "" : addetail;
            String attach = data.getAttach();
            String str11 = attach == null ? "" : attach;
            String attachTwo = data.getAttachTwo();
            String str12 = attachTwo == null ? "" : attachTwo;
            String initUrl = data.getInitUrl();
            String str13 = initUrl == null ? "" : initUrl;
            String slideUrl = data.getSlideUrl();
            String str14 = slideUrl == null ? "" : slideUrl;
            List<String> underwrittenGoodsUrlList = data.getUnderwrittenGoodsUrlList();
            return new FloatingAdData(iIntValue, jLongValue, str, "", str2, str3, str4, false, z, "首页底部通知条曝光", str5, adDetail, str6, str7, str8, str9, textLocation, countdown, countdownColor, countdownTextColorValue, countdownText, jumpType, str13, str14, underwrittenGoodsUrlList != null ? underwrittenGoodsUrlList : null, bubbleSceneType, buriedText, mediaDigitalAdId, mediaDigitalAdName, mediaDigitalSceneId, orderId, couponId, transparent, skuId, str10, str11, str12);
        }

        @NotNull
        public final FloatingAdData fromIconDetails(@Nullable IconDetails data, boolean showCloseBtn) {
            if (data == null) {
                return ofEmpty();
            }
            int i = -1;
            Long l2 = data.id;
            long jLongValue = l2 == null ? -1L : l2.longValue();
            String str = data.url;
            String str2 = str == null ? "" : str;
            String str3 = data.jsonUrl;
            String str4 = str3 == null ? "" : str3;
            String str5 = data.title;
            String str6 = str5 == null ? "" : str5;
            String str7 = "";
            String str8 = data.link;
            String str9 = str8 == null ? "" : str8;
            String str10 = data.moduleCode;
            Intrinsics.checkNotNullExpressionValue(str10, "data.moduleCode");
            return new FloatingAdData(i, jLongValue, str2, str4, str6, str7, str9, false, showCloseBtn, "首页-推荐-悬浮球广告", str10, "", null, null, null, null, null, 0, null, null, null, null, null, null, null, 0, null, null, null, null, null, null, null, null, null, null, null, -4096, 31, null);
        }
    }

    /* JADX WARN: Code duplicated, block: B:46:0x0168  */
    public FloatingAdData(int i, long j2, @NotNull String imageUrl, @NotNull String lottieUrl, @NotNull String text, @NotNull String buttonText, @NotNull String link, boolean z, boolean z2, @NotNull String moduleName, @NotNull String moduleCode, @NotNull String adDetail, @NotNull String bgImageUrl, @NotNull String bgColorValue, @NotNull String buttonTextColor, @NotNull String buttonBgColor, @Nullable List<ColorSpanInfo> list, int i2, @Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable String str6, @Nullable List<String> list2, int i3, @Nullable String str7, @Nullable String str8, @Nullable String str9, @Nullable String str10, @Nullable String str11, @Nullable String str12, @Nullable String str13, @Nullable String str14, @NotNull String addetail, @NotNull String attach, @NotNull String attachTwo) {
        boolean z3;
        Intrinsics.checkNotNullParameter(imageUrl, "imageUrl");
        Intrinsics.checkNotNullParameter(lottieUrl, "lottieUrl");
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(buttonText, "buttonText");
        Intrinsics.checkNotNullParameter(link, "link");
        Intrinsics.checkNotNullParameter(moduleName, "moduleName");
        Intrinsics.checkNotNullParameter(moduleCode, "moduleCode");
        Intrinsics.checkNotNullParameter(adDetail, "adDetail");
        Intrinsics.checkNotNullParameter(bgImageUrl, "bgImageUrl");
        Intrinsics.checkNotNullParameter(bgColorValue, "bgColorValue");
        Intrinsics.checkNotNullParameter(buttonTextColor, "buttonTextColor");
        Intrinsics.checkNotNullParameter(buttonBgColor, "buttonBgColor");
        Intrinsics.checkNotNullParameter(addetail, "addetail");
        Intrinsics.checkNotNullParameter(attach, "attach");
        Intrinsics.checkNotNullParameter(attachTwo, "attachTwo");
        this.type = i;
        this.id = j2;
        this.imageUrl = imageUrl;
        this.lottieUrl = lottieUrl;
        this.text = text;
        this.buttonText = buttonText;
        this.link = link;
        this.needLogin = z;
        this.showCloseBtn = z2;
        this.moduleName = moduleName;
        this.moduleCode = moduleCode;
        this.adDetail = adDetail;
        this.bgImageUrl = bgImageUrl;
        this.bgColorValue = bgColorValue;
        this.buttonTextColor = buttonTextColor;
        this.buttonBgColor = buttonBgColor;
        this.textLocation = list;
        this.countdown = i2;
        this.countdownColor = str;
        this.countdownTextColorValue = str2;
        this.countdownText = str3;
        this.jumpType = str4;
        this.initUrl = str5;
        this.slideUrl = str6;
        this.underwrittenGoodsUrlList = list2;
        this.bubbleSceneType = i3;
        this.buriedText = str7;
        this.mediaDigitalAdId = str8;
        this.mediaDigitalAdName = str9;
        this.mediaDigitalSceneId = str10;
        this.orderId = str11;
        this.couponId = str12;
        this.transparent = str13;
        this.skuId = str14;
        this.addetail = addetail;
        this.attach = attach;
        this.attachTwo = attachTwo;
        int i4 = 8;
        this.iconVisibility = ((StringsKt__StringsJVMKt.isBlank(imageUrl) ^ true) || (StringsKt__StringsJVMKt.isBlank(lottieUrl) ^ true)) ? 0 : 8;
        int i5 = this.type;
        this.isAnimImgStyle = i5 == 12 || i5 == 13;
        boolean z4 = i5 == 6;
        this.isFullBackGround = z4;
        boolean z5 = i5 == 7;
        this.isGuideMode = z5;
        boolean z6 = i5 == 5;
        this.isBoundBackGround = z6;
        boolean z7 = z6 || z4;
        this.isPureBackGround = z7;
        this.countSymbol = "$倒计时$";
        int iIndexOf$default = StringsKt__StringsKt.indexOf$default((CharSequence) text, "$倒计时$", 0, false, 6, (Object) null);
        this.countDownIndex = iIndexOf$default;
        if (z7 || iIndexOf$default < 0 || i2 > 0) {
            z3 = false;
        } else {
            if (str3 == null || StringsKt__StringsJVMKt.isBlank(str3)) {
                z3 = true;
            } else {
                z3 = false;
            }
        }
        this.isInvalidCount = z3;
        this.removeMargin = z4 || z5;
        this.bubbleTextVisible = z7 ? 8 : 0;
        int i6 = this.type;
        this.isTypeValid = 1 <= i6 && i6 < 14;
        if (!StringsKt__StringsJVMKt.isBlank(buttonText) && !z7) {
            i4 = 0;
        }
        this.buttonVisibility = i4;
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getType() {
        return this.type;
    }

    @NotNull
    /* JADX INFO: renamed from: component10, reason: from getter */
    public final String getModuleName() {
        return this.moduleName;
    }

    @NotNull
    /* JADX INFO: renamed from: component11, reason: from getter */
    public final String getModuleCode() {
        return this.moduleCode;
    }

    @NotNull
    /* JADX INFO: renamed from: component12, reason: from getter */
    public final String getAdDetail() {
        return this.adDetail;
    }

    @NotNull
    /* JADX INFO: renamed from: component13, reason: from getter */
    public final String getBgImageUrl() {
        return this.bgImageUrl;
    }

    @NotNull
    /* JADX INFO: renamed from: component14, reason: from getter */
    public final String getBgColorValue() {
        return this.bgColorValue;
    }

    @NotNull
    /* JADX INFO: renamed from: component15, reason: from getter */
    public final String getButtonTextColor() {
        return this.buttonTextColor;
    }

    @NotNull
    /* JADX INFO: renamed from: component16, reason: from getter */
    public final String getButtonBgColor() {
        return this.buttonBgColor;
    }

    @Nullable
    public final List<ColorSpanInfo> component17() {
        return this.textLocation;
    }

    /* JADX INFO: renamed from: component18, reason: from getter */
    public final int getCountdown() {
        return this.countdown;
    }

    @Nullable
    /* JADX INFO: renamed from: component19, reason: from getter */
    public final String getCountdownColor() {
        return this.countdownColor;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final long getId() {
        return this.id;
    }

    @Nullable
    /* JADX INFO: renamed from: component20, reason: from getter */
    public final String getCountdownTextColorValue() {
        return this.countdownTextColorValue;
    }

    @Nullable
    /* JADX INFO: renamed from: component21, reason: from getter */
    public final String getCountdownText() {
        return this.countdownText;
    }

    @Nullable
    /* JADX INFO: renamed from: component22, reason: from getter */
    public final String getJumpType() {
        return this.jumpType;
    }

    @Nullable
    /* JADX INFO: renamed from: component23, reason: from getter */
    public final String getInitUrl() {
        return this.initUrl;
    }

    @Nullable
    /* JADX INFO: renamed from: component24, reason: from getter */
    public final String getSlideUrl() {
        return this.slideUrl;
    }

    @Nullable
    public final List<String> component25() {
        return this.underwrittenGoodsUrlList;
    }

    /* JADX INFO: renamed from: component26, reason: from getter */
    public final int getBubbleSceneType() {
        return this.bubbleSceneType;
    }

    @Nullable
    /* JADX INFO: renamed from: component27, reason: from getter */
    public final String getBuriedText() {
        return this.buriedText;
    }

    @Nullable
    /* JADX INFO: renamed from: component28, reason: from getter */
    public final String getMediaDigitalAdId() {
        return this.mediaDigitalAdId;
    }

    @Nullable
    /* JADX INFO: renamed from: component29, reason: from getter */
    public final String getMediaDigitalAdName() {
        return this.mediaDigitalAdName;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getImageUrl() {
        return this.imageUrl;
    }

    @Nullable
    /* JADX INFO: renamed from: component30, reason: from getter */
    public final String getMediaDigitalSceneId() {
        return this.mediaDigitalSceneId;
    }

    @Nullable
    /* JADX INFO: renamed from: component31, reason: from getter */
    public final String getOrderId() {
        return this.orderId;
    }

    @Nullable
    /* JADX INFO: renamed from: component32, reason: from getter */
    public final String getCouponId() {
        return this.couponId;
    }

    @Nullable
    /* JADX INFO: renamed from: component33, reason: from getter */
    public final String getTransparent() {
        return this.transparent;
    }

    @Nullable
    /* JADX INFO: renamed from: component34, reason: from getter */
    public final String getSkuId() {
        return this.skuId;
    }

    @NotNull
    /* JADX INFO: renamed from: component35, reason: from getter */
    public final String getAddetail() {
        return this.addetail;
    }

    @NotNull
    /* JADX INFO: renamed from: component36, reason: from getter */
    public final String getAttach() {
        return this.attach;
    }

    @NotNull
    /* JADX INFO: renamed from: component37, reason: from getter */
    public final String getAttachTwo() {
        return this.attachTwo;
    }

    @NotNull
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getLottieUrl() {
        return this.lottieUrl;
    }

    @NotNull
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getText() {
        return this.text;
    }

    @NotNull
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getButtonText() {
        return this.buttonText;
    }

    @NotNull
    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getLink() {
        return this.link;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final boolean getNeedLogin() {
        return this.needLogin;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final boolean getShowCloseBtn() {
        return this.showCloseBtn;
    }

    @NotNull
    public final FloatingAdData copy(int type, long id, @NotNull String imageUrl, @NotNull String lottieUrl, @NotNull String text, @NotNull String buttonText, @NotNull String link, boolean needLogin, boolean showCloseBtn, @NotNull String moduleName, @NotNull String moduleCode, @NotNull String adDetail, @NotNull String bgImageUrl, @NotNull String bgColorValue, @NotNull String buttonTextColor, @NotNull String buttonBgColor, @Nullable List<ColorSpanInfo> textLocation, int countdown, @Nullable String countdownColor, @Nullable String countdownTextColorValue, @Nullable String countdownText, @Nullable String jumpType, @Nullable String initUrl, @Nullable String slideUrl, @Nullable List<String> underwrittenGoodsUrlList, int bubbleSceneType, @Nullable String buriedText, @Nullable String mediaDigitalAdId, @Nullable String mediaDigitalAdName, @Nullable String mediaDigitalSceneId, @Nullable String orderId, @Nullable String couponId, @Nullable String transparent, @Nullable String skuId, @NotNull String addetail, @NotNull String attach, @NotNull String attachTwo) {
        Intrinsics.checkNotNullParameter(imageUrl, "imageUrl");
        Intrinsics.checkNotNullParameter(lottieUrl, "lottieUrl");
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(buttonText, "buttonText");
        Intrinsics.checkNotNullParameter(link, "link");
        Intrinsics.checkNotNullParameter(moduleName, "moduleName");
        Intrinsics.checkNotNullParameter(moduleCode, "moduleCode");
        Intrinsics.checkNotNullParameter(adDetail, "adDetail");
        Intrinsics.checkNotNullParameter(bgImageUrl, "bgImageUrl");
        Intrinsics.checkNotNullParameter(bgColorValue, "bgColorValue");
        Intrinsics.checkNotNullParameter(buttonTextColor, "buttonTextColor");
        Intrinsics.checkNotNullParameter(buttonBgColor, "buttonBgColor");
        Intrinsics.checkNotNullParameter(addetail, "addetail");
        Intrinsics.checkNotNullParameter(attach, "attach");
        Intrinsics.checkNotNullParameter(attachTwo, "attachTwo");
        return new FloatingAdData(type, id, imageUrl, lottieUrl, text, buttonText, link, needLogin, showCloseBtn, moduleName, moduleCode, adDetail, bgImageUrl, bgColorValue, buttonTextColor, buttonBgColor, textLocation, countdown, countdownColor, countdownTextColorValue, countdownText, jumpType, initUrl, slideUrl, underwrittenGoodsUrlList, bubbleSceneType, buriedText, mediaDigitalAdId, mediaDigitalAdName, mediaDigitalSceneId, orderId, couponId, transparent, skuId, addetail, attach, attachTwo);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FloatingAdData)) {
            return false;
        }
        FloatingAdData floatingAdData = (FloatingAdData) other;
        return this.type == floatingAdData.type && this.id == floatingAdData.id && Intrinsics.areEqual(this.imageUrl, floatingAdData.imageUrl) && Intrinsics.areEqual(this.lottieUrl, floatingAdData.lottieUrl) && Intrinsics.areEqual(this.text, floatingAdData.text) && Intrinsics.areEqual(this.buttonText, floatingAdData.buttonText) && Intrinsics.areEqual(this.link, floatingAdData.link) && this.needLogin == floatingAdData.needLogin && this.showCloseBtn == floatingAdData.showCloseBtn && Intrinsics.areEqual(this.moduleName, floatingAdData.moduleName) && Intrinsics.areEqual(this.moduleCode, floatingAdData.moduleCode) && Intrinsics.areEqual(this.adDetail, floatingAdData.adDetail) && Intrinsics.areEqual(this.bgImageUrl, floatingAdData.bgImageUrl) && Intrinsics.areEqual(this.bgColorValue, floatingAdData.bgColorValue) && Intrinsics.areEqual(this.buttonTextColor, floatingAdData.buttonTextColor) && Intrinsics.areEqual(this.buttonBgColor, floatingAdData.buttonBgColor) && Intrinsics.areEqual(this.textLocation, floatingAdData.textLocation) && this.countdown == floatingAdData.countdown && Intrinsics.areEqual(this.countdownColor, floatingAdData.countdownColor) && Intrinsics.areEqual(this.countdownTextColorValue, floatingAdData.countdownTextColorValue) && Intrinsics.areEqual(this.countdownText, floatingAdData.countdownText) && Intrinsics.areEqual(this.jumpType, floatingAdData.jumpType) && Intrinsics.areEqual(this.initUrl, floatingAdData.initUrl) && Intrinsics.areEqual(this.slideUrl, floatingAdData.slideUrl) && Intrinsics.areEqual(this.underwrittenGoodsUrlList, floatingAdData.underwrittenGoodsUrlList) && this.bubbleSceneType == floatingAdData.bubbleSceneType && Intrinsics.areEqual(this.buriedText, floatingAdData.buriedText) && Intrinsics.areEqual(this.mediaDigitalAdId, floatingAdData.mediaDigitalAdId) && Intrinsics.areEqual(this.mediaDigitalAdName, floatingAdData.mediaDigitalAdName) && Intrinsics.areEqual(this.mediaDigitalSceneId, floatingAdData.mediaDigitalSceneId) && Intrinsics.areEqual(this.orderId, floatingAdData.orderId) && Intrinsics.areEqual(this.couponId, floatingAdData.couponId) && Intrinsics.areEqual(this.transparent, floatingAdData.transparent) && Intrinsics.areEqual(this.skuId, floatingAdData.skuId) && Intrinsics.areEqual(this.addetail, floatingAdData.addetail) && Intrinsics.areEqual(this.attach, floatingAdData.attach) && Intrinsics.areEqual(this.attachTwo, floatingAdData.attachTwo);
    }

    @NotNull
    public final String getAdDetail() {
        return this.adDetail;
    }

    @NotNull
    public final String getAddetail() {
        return this.addetail;
    }

    @NotNull
    public final String getAttach() {
        return this.attach;
    }

    @NotNull
    public final String getAttachTwo() {
        return this.attachTwo;
    }

    @NotNull
    public final String getBgColorValue() {
        return this.bgColorValue;
    }

    @NotNull
    public final String getBgImageUrl() {
        return this.bgImageUrl;
    }

    public final int getBubbleSceneType() {
        return this.bubbleSceneType;
    }

    public final int getBubbleTextVisible() {
        return this.bubbleTextVisible;
    }

    @Nullable
    public final String getBuriedText() {
        return this.buriedText;
    }

    @NotNull
    public final String getButtonBgColor() {
        return this.buttonBgColor;
    }

    @NotNull
    public final String getButtonText() {
        return this.buttonText;
    }

    @NotNull
    public final String getButtonTextColor() {
        return this.buttonTextColor;
    }

    public final int getButtonVisibility() {
        return this.buttonVisibility;
    }

    public final int getCountDownIndex() {
        return this.countDownIndex;
    }

    @NotNull
    public final String getCountSymbol() {
        return this.countSymbol;
    }

    public final int getCountdown() {
        return this.countdown;
    }

    @Nullable
    public final String getCountdownColor() {
        return this.countdownColor;
    }

    @Nullable
    public final String getCountdownText() {
        return this.countdownText;
    }

    @Nullable
    public final String getCountdownTextColorValue() {
        return this.countdownTextColorValue;
    }

    @Nullable
    public final String getCouponId() {
        return this.couponId;
    }

    public final int getIconVisibility() {
        return this.iconVisibility;
    }

    public final long getId() {
        return this.id;
    }

    @NotNull
    public final String getImageUrl() {
        return this.imageUrl;
    }

    @Nullable
    public final String getInitUrl() {
        return this.initUrl;
    }

    @Nullable
    public final String getJumpType() {
        return this.jumpType;
    }

    @NotNull
    public final String getLink() {
        return this.link;
    }

    @NotNull
    public final String getLottieUrl() {
        return this.lottieUrl;
    }

    @Nullable
    public final String getMediaDigitalAdId() {
        return this.mediaDigitalAdId;
    }

    @Nullable
    public final String getMediaDigitalAdName() {
        return this.mediaDigitalAdName;
    }

    @Nullable
    public final String getMediaDigitalSceneId() {
        return this.mediaDigitalSceneId;
    }

    @NotNull
    public final String getModuleCode() {
        return this.moduleCode;
    }

    @NotNull
    public final String getModuleName() {
        return this.moduleName;
    }

    public final boolean getNeedLogin() {
        return this.needLogin;
    }

    @Nullable
    public final String getOrderId() {
        return this.orderId;
    }

    public final boolean getRemoveMargin() {
        return this.removeMargin;
    }

    public final boolean getShowCloseBtn() {
        return this.showCloseBtn;
    }

    @Nullable
    public final String getSkuId() {
        return this.skuId;
    }

    @Nullable
    public final String getSlideUrl() {
        return this.slideUrl;
    }

    @NotNull
    public final String getText() {
        return this.text;
    }

    @Nullable
    public final List<ColorSpanInfo> getTextLocation() {
        return this.textLocation;
    }

    @Nullable
    public final String getTransparent() {
        return this.transparent;
    }

    public final int getType() {
        return this.type;
    }

    @Nullable
    public final List<String> getUnderwrittenGoodsUrlList() {
        return this.underwrittenGoodsUrlList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v15, types: [int] */
    /* JADX WARN: Type inference failed for: r0v17, types: [int] */
    /* JADX WARN: Type inference failed for: r1v13, types: [int] */
    /* JADX WARN: Type inference failed for: r1v98 */
    /* JADX WARN: Type inference failed for: r1v99 */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1, types: [int] */
    /* JADX WARN: Type inference failed for: r2v5 */
    public int hashCode() {
        int iHashCode = ((((((((((((Integer.hashCode(this.type) * 31) + Long.hashCode(this.id)) * 31) + this.imageUrl.hashCode()) * 31) + this.lottieUrl.hashCode()) * 31) + this.text.hashCode()) * 31) + this.buttonText.hashCode()) * 31) + this.link.hashCode()) * 31;
        boolean z = this.needLogin;
        ?? r1 = z;
        if (z) {
            r1 = 1;
        }
        int i = (iHashCode + r1) * 31;
        boolean z2 = this.showCloseBtn;
        int iHashCode2 = (((((((((((((((i + (z2 ? 1 : z2)) * 31) + this.moduleName.hashCode()) * 31) + this.moduleCode.hashCode()) * 31) + this.adDetail.hashCode()) * 31) + this.bgImageUrl.hashCode()) * 31) + this.bgColorValue.hashCode()) * 31) + this.buttonTextColor.hashCode()) * 31) + this.buttonBgColor.hashCode()) * 31;
        List<ColorSpanInfo> list = this.textLocation;
        int iHashCode3 = (((iHashCode2 + (list == null ? 0 : list.hashCode())) * 31) + Integer.hashCode(this.countdown)) * 31;
        String str = this.countdownColor;
        int iHashCode4 = (iHashCode3 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.countdownTextColorValue;
        int iHashCode5 = (iHashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.countdownText;
        int iHashCode6 = (iHashCode5 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.jumpType;
        int iHashCode7 = (iHashCode6 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.initUrl;
        int iHashCode8 = (iHashCode7 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.slideUrl;
        int iHashCode9 = (iHashCode8 + (str6 == null ? 0 : str6.hashCode())) * 31;
        List<String> list2 = this.underwrittenGoodsUrlList;
        int iHashCode10 = (((iHashCode9 + (list2 == null ? 0 : list2.hashCode())) * 31) + Integer.hashCode(this.bubbleSceneType)) * 31;
        String str7 = this.buriedText;
        int iHashCode11 = (iHashCode10 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.mediaDigitalAdId;
        int iHashCode12 = (iHashCode11 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.mediaDigitalAdName;
        int iHashCode13 = (iHashCode12 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.mediaDigitalSceneId;
        int iHashCode14 = (iHashCode13 + (str10 == null ? 0 : str10.hashCode())) * 31;
        String str11 = this.orderId;
        int iHashCode15 = (iHashCode14 + (str11 == null ? 0 : str11.hashCode())) * 31;
        String str12 = this.couponId;
        int iHashCode16 = (iHashCode15 + (str12 == null ? 0 : str12.hashCode())) * 31;
        String str13 = this.transparent;
        int iHashCode17 = (iHashCode16 + (str13 == null ? 0 : str13.hashCode())) * 31;
        String str14 = this.skuId;
        return ((((((iHashCode17 + (str14 != null ? str14.hashCode() : 0)) * 31) + this.addetail.hashCode()) * 31) + this.attach.hashCode()) * 31) + this.attachTwo.hashCode();
    }

    /* JADX INFO: renamed from: isAnimImgStyle, reason: from getter */
    public final boolean getIsAnimImgStyle() {
        return this.isAnimImgStyle;
    }

    /* JADX INFO: renamed from: isBoundBackGround, reason: from getter */
    public final boolean getIsBoundBackGround() {
        return this.isBoundBackGround;
    }

    /* JADX INFO: renamed from: isFullBackGround, reason: from getter */
    public final boolean getIsFullBackGround() {
        return this.isFullBackGround;
    }

    /* JADX INFO: renamed from: isGuideMode, reason: from getter */
    public final boolean getIsGuideMode() {
        return this.isGuideMode;
    }

    /* JADX INFO: renamed from: isInvalidCount, reason: from getter */
    public final boolean getIsInvalidCount() {
        return this.isInvalidCount;
    }

    /* JADX INFO: renamed from: isPureBackGround, reason: from getter */
    public final boolean getIsPureBackGround() {
        return this.isPureBackGround;
    }

    /* JADX INFO: renamed from: isTypeValid, reason: from getter */
    public final boolean getIsTypeValid() {
        return this.isTypeValid;
    }

    public final void setAddetail(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.addetail = str;
    }

    public final void setAnimImgStyle(boolean z) {
        this.isAnimImgStyle = z;
    }

    public final void setAttach(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.attach = str;
    }

    public final void setAttachTwo(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.attachTwo = str;
    }

    public final void setInitUrl(@Nullable String str) {
        this.initUrl = str;
    }

    public final void setSlideUrl(@Nullable String str) {
        this.slideUrl = str;
    }

    public final void setType(int i) {
        this.type = i;
    }

    public final void setUnderwrittenGoodsUrlList(@Nullable List<String> list) {
        this.underwrittenGoodsUrlList = list;
    }

    @NotNull
    public String toString() {
        return "FloatingAdData(type=" + this.type + ", id=" + this.id + ", imageUrl=" + this.imageUrl + ", lottieUrl=" + this.lottieUrl + ", text=" + this.text + ", buttonText=" + this.buttonText + ", link=" + this.link + ", needLogin=" + this.needLogin + ", showCloseBtn=" + this.showCloseBtn + ", moduleName=" + this.moduleName + ", moduleCode=" + this.moduleCode + ", adDetail=" + this.adDetail + ", bgImageUrl=" + this.bgImageUrl + ", bgColorValue=" + this.bgColorValue + ", buttonTextColor=" + this.buttonTextColor + ", buttonBgColor=" + this.buttonBgColor + ", textLocation=" + this.textLocation + ", countdown=" + this.countdown + ", countdownColor=" + ((Object) this.countdownColor) + ", countdownTextColorValue=" + ((Object) this.countdownTextColorValue) + ", countdownText=" + ((Object) this.countdownText) + ", jumpType=" + ((Object) this.jumpType) + ", initUrl=" + ((Object) this.initUrl) + ", slideUrl=" + ((Object) this.slideUrl) + ", underwrittenGoodsUrlList=" + this.underwrittenGoodsUrlList + ", bubbleSceneType=" + this.bubbleSceneType + ", buriedText=" + ((Object) this.buriedText) + ", mediaDigitalAdId=" + ((Object) this.mediaDigitalAdId) + ", mediaDigitalAdName=" + ((Object) this.mediaDigitalAdName) + ", mediaDigitalSceneId=" + ((Object) this.mediaDigitalSceneId) + ", orderId=" + ((Object) this.orderId) + ", couponId=" + ((Object) this.couponId) + ", transparent=" + ((Object) this.transparent) + ", skuId=" + ((Object) this.skuId) + ", addetail=" + this.addetail + ", attach=" + this.attach + ", attachTwo=" + this.attachTwo + ')';
    }

    public /* synthetic */ FloatingAdData(int i, long j2, String str, String str2, String str3, String str4, String str5, boolean z, boolean z2, String str6, String str7, String str8, String str9, String str10, String str11, String str12, List list, int i2, String str13, String str14, String str15, String str16, String str17, String str18, List list2, int i3, String str19, String str20, String str21, String str22, String str23, String str24, String str25, String str26, String str27, String str28, String str29, int i4, int i5, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, j2, str, str2, str3, str4, str5, z, z2, str6, str7, str8, (i4 & 4096) != 0 ? "" : str9, (i4 & 8192) != 0 ? "" : str10, (i4 & 16384) != 0 ? "" : str11, (32768 & i4) != 0 ? "" : str12, (65536 & i4) != 0 ? null : list, (131072 & i4) != 0 ? 0 : i2, (262144 & i4) != 0 ? "" : str13, (524288 & i4) != 0 ? "" : str14, (1048576 & i4) != 0 ? "" : str15, (2097152 & i4) != 0 ? "" : str16, (4194304 & i4) != 0 ? "" : str17, (8388608 & i4) != 0 ? "" : str18, (16777216 & i4) != 0 ? null : list2, (33554432 & i4) != 0 ? -1 : i3, (67108864 & i4) != 0 ? "" : str19, (134217728 & i4) != 0 ? "" : str20, (268435456 & i4) != 0 ? "" : str21, (536870912 & i4) != 0 ? "" : str22, (1073741824 & i4) != 0 ? "" : str23, (i4 & Integer.MIN_VALUE) != 0 ? "" : str24, (i5 & 1) != 0 ? "" : str25, (i5 & 2) != 0 ? "" : str26, (i5 & 4) != 0 ? "" : str27, (i5 & 8) != 0 ? "" : str28, (i5 & 16) != 0 ? "" : str29);
    }
}
