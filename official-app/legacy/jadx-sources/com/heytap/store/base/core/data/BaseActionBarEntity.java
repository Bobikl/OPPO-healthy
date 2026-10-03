package com.heytap.store.base.core.data;

import com.heytap.nearx.tangramconfig.strategy.Fields;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.Unit;
import p010kotlin.jvm.functions.Function0;
import p010kotlin.jvm.functions.Function1;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u001d\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B¨\u0001\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012%\b\u0002\u0010\u0004\u001a\u001f\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\t\u0012\u0004\u0012\u00020\n\u0018\u00010\u0005\u0012\u0010\b\u0002\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\f\u0012%\b\u0002\u0010\r\u001a\u001f\u0012\u0013\u0012\u00110\u000e¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\u000f\u0012\u0004\u0012\u00020\n\u0018\u00010\u0005\u0012\u0010\b\u0002\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\f\u0012%\b\u0002\u0010\u0011\u001a\u001f\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\u0012\u0012\u0004\u0012\u00020\n\u0018\u00010\u0005¢\u0006\u0002\u0010\u0013J\u000b\u0010$\u001a\u0004\u0018\u00010\u0003HÆ\u0003J&\u0010%\u001a\u001f\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\t\u0012\u0004\u0012\u00020\n\u0018\u00010\u0005HÆ\u0003J\u0011\u0010&\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\fHÆ\u0003J&\u0010'\u001a\u001f\u0012\u0013\u0012\u00110\u000e¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\u000f\u0012\u0004\u0012\u00020\n\u0018\u00010\u0005HÆ\u0003J\u0011\u0010(\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\fHÆ\u0003J&\u0010)\u001a\u001f\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\u0012\u0012\u0004\u0012\u00020\n\u0018\u00010\u0005HÆ\u0003J®\u0001\u0010*\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032%\b\u0002\u0010\u0004\u001a\u001f\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\t\u0012\u0004\u0012\u00020\n\u0018\u00010\u00052\u0010\b\u0002\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\f2%\b\u0002\u0010\r\u001a\u001f\u0012\u0013\u0012\u00110\u000e¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\u000f\u0012\u0004\u0012\u00020\n\u0018\u00010\u00052\u0010\b\u0002\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\f2%\b\u0002\u0010\u0011\u001a\u001f\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\u0012\u0012\u0004\u0012\u00020\n\u0018\u00010\u0005HÆ\u0001J\u0013\u0010+\u001a\u00020,2\b\u0010-\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010.\u001a\u00020\u0006HÖ\u0001J\t\u0010/\u001a\u00020\u0003HÖ\u0001R7\u0010\u0011\u001a\u001f\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\u0012\u0012\u0004\u0012\u00020\n\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\"\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR7\u0010\r\u001a\u001f\u0012\u0013\u0012\u00110\u000e¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\u000f\u0012\u0004\u0012\u00020\n\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u0015\"\u0004\b\u001d\u0010\u0017R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR7\u0010\u0004\u001a\u001f\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\t\u0012\u0004\u0012\u00020\n\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b \u0010\u0015\"\u0004\b!\u0010\u0017R\"\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010\u0019\"\u0004\b#\u0010\u001b¨\u00060"}, d2 = {"Lcom/heytap/store/base/core/data/BaseActionBarEntity;", "", "title", "", "toolBarHeightCallback", "Lkotlin/Function1;", "", "Lkotlin/ParameterName;", "name", Fields.HEIGHT_FIELD, "", "toolBarInitedCallback", "Lkotlin/Function0;", "messageViewClickCallback", "", "unreadMsgNum", "mainSearchLayoutClickCallback", "hotWordForegroundClickCallback", "hotWord", "(Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;)V", "getHotWordForegroundClickCallback", "()Lkotlin/jvm/functions/Function1;", "setHotWordForegroundClickCallback", "(Lkotlin/jvm/functions/Function1;)V", "getMainSearchLayoutClickCallback", "()Lkotlin/jvm/functions/Function0;", "setMainSearchLayoutClickCallback", "(Lkotlin/jvm/functions/Function0;)V", "getMessageViewClickCallback", "setMessageViewClickCallback", "getTitle", "()Ljava/lang/String;", "getToolBarHeightCallback", "setToolBarHeightCallback", "getToolBarInitedCallback", "setToolBarInitedCallback", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "toString", "Core_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final /* data */ class BaseActionBarEntity {

    @Nullable
    private Function1<? super String, Unit> hotWordForegroundClickCallback;

    @Nullable
    private Function0<Unit> mainSearchLayoutClickCallback;

    @Nullable
    private Function1<? super Long, Unit> messageViewClickCallback;

    @Nullable
    private final String title;

    @Nullable
    private Function1<? super Integer, Unit> toolBarHeightCallback;

    @Nullable
    private Function0<Unit> toolBarInitedCallback;

    public BaseActionBarEntity(@Nullable String str, @Nullable Function1<? super Integer, Unit> function1, @Nullable Function0<Unit> function0, @Nullable Function1<? super Long, Unit> function2, @Nullable Function0<Unit> function3, @Nullable Function1<? super String, Unit> function4) {
        this.title = str;
        this.toolBarHeightCallback = function1;
        this.toolBarInitedCallback = function0;
        this.messageViewClickCallback = function2;
        this.mainSearchLayoutClickCallback = function3;
        this.hotWordForegroundClickCallback = function4;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ BaseActionBarEntity copy$default(BaseActionBarEntity baseActionBarEntity, String str, Function1 function1, Function0 function0, Function1 function2, Function0 function3, Function1 function4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = baseActionBarEntity.title;
        }
        if ((i & 2) != 0) {
            function1 = baseActionBarEntity.toolBarHeightCallback;
        }
        Function1 function5 = function1;
        if ((i & 4) != 0) {
            function0 = baseActionBarEntity.toolBarInitedCallback;
        }
        Function0 function6 = function0;
        if ((i & 8) != 0) {
            function2 = baseActionBarEntity.messageViewClickCallback;
        }
        Function1 function7 = function2;
        if ((i & 16) != 0) {
            function3 = baseActionBarEntity.mainSearchLayoutClickCallback;
        }
        Function0 function8 = function3;
        if ((i & 32) != 0) {
            function4 = baseActionBarEntity.hotWordForegroundClickCallback;
        }
        return baseActionBarEntity.copy(str, function5, function6, function7, function8, function4);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    @Nullable
    public final Function1<Integer, Unit> component2() {
        return this.toolBarHeightCallback;
    }

    @Nullable
    public final Function0<Unit> component3() {
        return this.toolBarInitedCallback;
    }

    @Nullable
    public final Function1<Long, Unit> component4() {
        return this.messageViewClickCallback;
    }

    @Nullable
    public final Function0<Unit> component5() {
        return this.mainSearchLayoutClickCallback;
    }

    @Nullable
    public final Function1<String, Unit> component6() {
        return this.hotWordForegroundClickCallback;
    }

    @NotNull
    public final BaseActionBarEntity copy(@Nullable String title, @Nullable Function1<? super Integer, Unit> toolBarHeightCallback, @Nullable Function0<Unit> toolBarInitedCallback, @Nullable Function1<? super Long, Unit> messageViewClickCallback, @Nullable Function0<Unit> mainSearchLayoutClickCallback, @Nullable Function1<? super String, Unit> hotWordForegroundClickCallback) {
        return new BaseActionBarEntity(title, toolBarHeightCallback, toolBarInitedCallback, messageViewClickCallback, mainSearchLayoutClickCallback, hotWordForegroundClickCallback);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BaseActionBarEntity)) {
            return false;
        }
        BaseActionBarEntity baseActionBarEntity = (BaseActionBarEntity) other;
        return Intrinsics.areEqual(this.title, baseActionBarEntity.title) && Intrinsics.areEqual(this.toolBarHeightCallback, baseActionBarEntity.toolBarHeightCallback) && Intrinsics.areEqual(this.toolBarInitedCallback, baseActionBarEntity.toolBarInitedCallback) && Intrinsics.areEqual(this.messageViewClickCallback, baseActionBarEntity.messageViewClickCallback) && Intrinsics.areEqual(this.mainSearchLayoutClickCallback, baseActionBarEntity.mainSearchLayoutClickCallback) && Intrinsics.areEqual(this.hotWordForegroundClickCallback, baseActionBarEntity.hotWordForegroundClickCallback);
    }

    @Nullable
    public final Function1<String, Unit> getHotWordForegroundClickCallback() {
        return this.hotWordForegroundClickCallback;
    }

    @Nullable
    public final Function0<Unit> getMainSearchLayoutClickCallback() {
        return this.mainSearchLayoutClickCallback;
    }

    @Nullable
    public final Function1<Long, Unit> getMessageViewClickCallback() {
        return this.messageViewClickCallback;
    }

    @Nullable
    public final String getTitle() {
        return this.title;
    }

    @Nullable
    public final Function1<Integer, Unit> getToolBarHeightCallback() {
        return this.toolBarHeightCallback;
    }

    @Nullable
    public final Function0<Unit> getToolBarInitedCallback() {
        return this.toolBarInitedCallback;
    }

    public int hashCode() {
        String str = this.title;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Function1<? super Integer, Unit> function1 = this.toolBarHeightCallback;
        int iHashCode2 = (iHashCode + (function1 == null ? 0 : function1.hashCode())) * 31;
        Function0<Unit> function0 = this.toolBarInitedCallback;
        int iHashCode3 = (iHashCode2 + (function0 == null ? 0 : function0.hashCode())) * 31;
        Function1<? super Long, Unit> function2 = this.messageViewClickCallback;
        int iHashCode4 = (iHashCode3 + (function2 == null ? 0 : function2.hashCode())) * 31;
        Function0<Unit> function3 = this.mainSearchLayoutClickCallback;
        int iHashCode5 = (iHashCode4 + (function3 == null ? 0 : function3.hashCode())) * 31;
        Function1<? super String, Unit> function4 = this.hotWordForegroundClickCallback;
        return iHashCode5 + (function4 != null ? function4.hashCode() : 0);
    }

    public final void setHotWordForegroundClickCallback(@Nullable Function1<? super String, Unit> function1) {
        this.hotWordForegroundClickCallback = function1;
    }

    public final void setMainSearchLayoutClickCallback(@Nullable Function0<Unit> function0) {
        this.mainSearchLayoutClickCallback = function0;
    }

    public final void setMessageViewClickCallback(@Nullable Function1<? super Long, Unit> function1) {
        this.messageViewClickCallback = function1;
    }

    public final void setToolBarHeightCallback(@Nullable Function1<? super Integer, Unit> function1) {
        this.toolBarHeightCallback = function1;
    }

    public final void setToolBarInitedCallback(@Nullable Function0<Unit> function0) {
        this.toolBarInitedCallback = function0;
    }

    @NotNull
    public String toString() {
        return "BaseActionBarEntity(title=" + ((Object) this.title) + ", toolBarHeightCallback=" + this.toolBarHeightCallback + ", toolBarInitedCallback=" + this.toolBarInitedCallback + ", messageViewClickCallback=" + this.messageViewClickCallback + ", mainSearchLayoutClickCallback=" + this.mainSearchLayoutClickCallback + ", hotWordForegroundClickCallback=" + this.hotWordForegroundClickCallback + ')';
    }

    public /* synthetic */ BaseActionBarEntity(String str, Function1 function1, Function0 function0, Function1 function2, Function0 function3, Function1 function4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? null : function1, (i & 4) != 0 ? null : function0, (i & 8) != 0 ? null : function2, (i & 16) != 0 ? null : function3, (i & 32) == 0 ? function4 : null);
    }
}
