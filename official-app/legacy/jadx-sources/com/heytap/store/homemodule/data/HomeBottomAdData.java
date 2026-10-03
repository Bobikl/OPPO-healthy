package com.heytap.store.homemodule.data;

import androidx.annotation.Keep;
import com.heytap.store.base.core.util.statistics.bean.SensorsBean;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@Keep
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0015\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001:\u0001!B5\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\tJ\u0010\u0010\u0016\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u000bJ\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0007HÆ\u0003J>\u0010\u001a\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007HÆ\u0001¢\u0006\u0002\u0010\u001bJ\u0013\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001f\u001a\u00020\u0003HÖ\u0001J\t\u0010 \u001a\u00020\u0007HÖ\u0001R\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\f\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010R\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0010\"\u0004\b\u0014\u0010\u0015¨\u0006\""}, d2 = {"Lcom/heytap/store/homemodule/data/HomeBottomAdData;", "", "code", "", "data", "Lcom/heytap/store/homemodule/data/HomeBottomAdData$Data;", "errorMessage", "", "errorType", "(Ljava/lang/Integer;Lcom/heytap/store/homemodule/data/HomeBottomAdData$Data;Ljava/lang/String;Ljava/lang/String;)V", "getCode", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getData", "()Lcom/heytap/store/homemodule/data/HomeBottomAdData$Data;", "getErrorMessage", "()Ljava/lang/String;", "getErrorType", "originalNetData", "getOriginalNetData", "setOriginalNetData", "(Ljava/lang/String;)V", "component1", "component2", "component3", "component4", "copy", "(Ljava/lang/Integer;Lcom/heytap/store/homemodule/data/HomeBottomAdData$Data;Ljava/lang/String;Ljava/lang/String;)Lcom/heytap/store/homemodule/data/HomeBottomAdData;", "equals", "", "other", "hashCode", "toString", "Data", "com.heytap.store.business.home-impl"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final /* data */ class HomeBottomAdData {

    @Nullable
    private final Integer code;

    @Nullable
    private final Data data;

    @Nullable
    private final String errorMessage;

    @Nullable
    private final String errorType;

    @Nullable
    private String originalNetData;

    @Keep
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\bq\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u0097\u0003\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\u0010\b\u0002\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0007\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u0007\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u0005\u0012\u0010\b\u0002\u0010\u001b\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\n\u0012\b\b\u0002\u0010\u001c\u001a\u00020\u0007\u0012\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010$\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010%\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010&\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010'\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010(J\u0010\u0010Y\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010=J\u000b\u0010Z\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010[\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010\\\u001a\u00020\u0007HÆ\u0003J\u000b\u0010]\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010^\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010_\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010`\u001a\u00020\u0007HÆ\u0003J\u000b\u0010a\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010b\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010c\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010d\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010e\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0011\u0010f\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\nHÆ\u0003J\t\u0010g\u001a\u00020\u0007HÆ\u0003J\u000b\u0010h\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010i\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010j\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010k\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010l\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010m\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010n\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0010\u0010o\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010TJ\u000b\u0010p\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010q\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010r\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010s\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010t\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0011\u0010u\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\nHÆ\u0003J\u000b\u0010v\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010w\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010x\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010y\u001a\u0004\u0018\u00010\u0005HÆ\u0003J \u0003\u0010z\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00052\u0010\b\u0002\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0012\u001a\u00020\u00072\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0016\u001a\u00020\u00072\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u00052\u0010\b\u0002\u0010\u001b\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\n2\b\b\u0002\u0010\u001c\u001a\u00020\u00072\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010$\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010%\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010&\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010'\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0002\u0010{J\u0013\u0010|\u001a\u00020}2\b\u0010~\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u007f\u001a\u00020\u0007HÖ\u0001J\n\u0010\u0080\u0001\u001a\u00020\u0005HÖ\u0001R\u001c\u0010%\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b)\u0010*\"\u0004\b+\u0010,R\u001c\u0010&\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b-\u0010*\"\u0004\b.\u0010,R\u001c\u0010'\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b/\u0010*\"\u0004\b0\u0010,R\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b1\u0010*R\u0013\u0010\u0011\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b2\u0010*R\u0011\u0010\u001c\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b3\u00104R\u0013\u0010\u001d\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b5\u0010*R\u0011\u0010\u0012\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b6\u00104R\u0013\u0010\u0013\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b7\u0010*R\u0013\u0010\u0015\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b8\u0010*R\u0013\u0010\u0014\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b9\u0010*R\u0013\u0010#\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b:\u0010*R\u0013\u0010\u0017\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b;\u0010*R\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010>\u001a\u0004\b<\u0010=R\u001c\u0010\u0019\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b?\u0010*\"\u0004\b@\u0010,R\u0013\u0010\u0018\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\bA\u0010*R\u0013\u0010\f\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\bB\u0010*R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\bC\u0010*R\u0013\u0010\u001e\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\bD\u0010*R\u0013\u0010\u001f\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\bE\u0010*R\u0013\u0010 \u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\bF\u0010*R\u0013\u0010!\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\bG\u0010*R\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\bH\u0010*R\u0013\u0010\r\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\bI\u0010*R\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\bJ\u0010*R\u0013\u0010\"\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\bK\u0010*R\u001c\u0010\u001a\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bL\u0010*\"\u0004\bM\u0010,R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\bN\u0010*R\u0019\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\bO\u0010PR\u0011\u0010\u0016\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\bQ\u00104R\u0013\u0010$\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\bR\u0010*R\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\n\n\u0002\u0010U\u001a\u0004\bS\u0010TR\"\u0010\u001b\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bV\u0010P\"\u0004\bW\u0010X¨\u0006\u0081\u0001"}, d2 = {"Lcom/heytap/store/homemodule/data/HomeBottomAdData$Data;", "", "id", "", "link", "", "type", "", "text", "textLocation", "", "Lcom/heytap/store/homemodule/data/ColorSpanInfo;", "leftIcon", "rightButtonText", "rightButtonTextColor", "rightButtonBackgroundColor", "backgroundColor", "backgroundImage", "countdown", "countdownColor", "countdownTextColorValue", "countdownText", "topRightCloseButton", "couponIds", "jumpType", "initUrl", "slideUrl", "underwrittenGoodsUrlList", "bubbleSceneType", "buriedText", "mediaDigitalAdId", "mediaDigitalAdName", "mediaDigitalSceneId", "orderId", "skuId", "couponId", "transparent", SensorsBean.AD_DETAIL, "attach", "attachTwo", "(Ljava/lang/Long;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getAddetail", "()Ljava/lang/String;", "setAddetail", "(Ljava/lang/String;)V", "getAttach", "setAttach", "getAttachTwo", "setAttachTwo", "getBackgroundColor", "getBackgroundImage", "getBubbleSceneType", "()I", "getBuriedText", "getCountdown", "getCountdownColor", "getCountdownText", "getCountdownTextColorValue", "getCouponId", "getCouponIds", "getId", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getInitUrl", "setInitUrl", "getJumpType", "getLeftIcon", "getLink", "getMediaDigitalAdId", "getMediaDigitalAdName", "getMediaDigitalSceneId", "getOrderId", "getRightButtonBackgroundColor", "getRightButtonText", "getRightButtonTextColor", "getSkuId", "getSlideUrl", "setSlideUrl", "getText", "getTextLocation", "()Ljava/util/List;", "getTopRightCloseButton", "getTransparent", "getType", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getUnderwrittenGoodsUrlList", "setUnderwrittenGoodsUrlList", "(Ljava/util/List;)V", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component2", "component20", "component21", "component22", "component23", "component24", "component25", "component26", "component27", "component28", "component29", "component3", "component30", "component31", "component32", "component33", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Ljava/lang/Long;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/heytap/store/homemodule/data/HomeBottomAdData$Data;", "equals", "", "other", "hashCode", "toString", "com.heytap.store.business.home-impl"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final /* data */ class Data {

        @Nullable
        private String addetail;

        @Nullable
        private String attach;

        @Nullable
        private String attachTwo;

        @Nullable
        private final String backgroundColor;

        @Nullable
        private final String backgroundImage;
        private final int bubbleSceneType;

        @Nullable
        private final String buriedText;
        private final int countdown;

        @Nullable
        private final String countdownColor;

        @Nullable
        private final String countdownText;

        @Nullable
        private final String countdownTextColorValue;

        @Nullable
        private final String couponId;

        @Nullable
        private final String couponIds;

        @Nullable
        private final Long id;

        @Nullable
        private String initUrl;

        @Nullable
        private final String jumpType;

        @Nullable
        private final String leftIcon;

        @Nullable
        private final String link;

        @Nullable
        private final String mediaDigitalAdId;

        @Nullable
        private final String mediaDigitalAdName;

        @Nullable
        private final String mediaDigitalSceneId;

        @Nullable
        private final String orderId;

        @Nullable
        private final String rightButtonBackgroundColor;

        @Nullable
        private final String rightButtonText;

        @Nullable
        private final String rightButtonTextColor;

        @Nullable
        private final String skuId;

        @Nullable
        private String slideUrl;

        @Nullable
        private final String text;

        @Nullable
        private final List<ColorSpanInfo> textLocation;
        private final int topRightCloseButton;

        @Nullable
        private final String transparent;

        @Nullable
        private final Integer type;

        @Nullable
        private List<String> underwrittenGoodsUrlList;

        public Data() {
            this(null, null, null, null, null, null, null, null, null, null, null, 0, null, null, null, 0, null, null, null, null, null, 0, null, null, null, null, null, null, null, null, null, null, null, -1, 1, null);
        }

        @Nullable
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final Long getId() {
            return this.id;
        }

        @Nullable
        /* JADX INFO: renamed from: component10, reason: from getter */
        public final String getBackgroundColor() {
            return this.backgroundColor;
        }

        @Nullable
        /* JADX INFO: renamed from: component11, reason: from getter */
        public final String getBackgroundImage() {
            return this.backgroundImage;
        }

        /* JADX INFO: renamed from: component12, reason: from getter */
        public final int getCountdown() {
            return this.countdown;
        }

        @Nullable
        /* JADX INFO: renamed from: component13, reason: from getter */
        public final String getCountdownColor() {
            return this.countdownColor;
        }

        @Nullable
        /* JADX INFO: renamed from: component14, reason: from getter */
        public final String getCountdownTextColorValue() {
            return this.countdownTextColorValue;
        }

        @Nullable
        /* JADX INFO: renamed from: component15, reason: from getter */
        public final String getCountdownText() {
            return this.countdownText;
        }

        /* JADX INFO: renamed from: component16, reason: from getter */
        public final int getTopRightCloseButton() {
            return this.topRightCloseButton;
        }

        @Nullable
        /* JADX INFO: renamed from: component17, reason: from getter */
        public final String getCouponIds() {
            return this.couponIds;
        }

        @Nullable
        /* JADX INFO: renamed from: component18, reason: from getter */
        public final String getJumpType() {
            return this.jumpType;
        }

        @Nullable
        /* JADX INFO: renamed from: component19, reason: from getter */
        public final String getInitUrl() {
            return this.initUrl;
        }

        @Nullable
        /* JADX INFO: renamed from: component2, reason: from getter */
        public final String getLink() {
            return this.link;
        }

        @Nullable
        /* JADX INFO: renamed from: component20, reason: from getter */
        public final String getSlideUrl() {
            return this.slideUrl;
        }

        @Nullable
        public final List<String> component21() {
            return this.underwrittenGoodsUrlList;
        }

        /* JADX INFO: renamed from: component22, reason: from getter */
        public final int getBubbleSceneType() {
            return this.bubbleSceneType;
        }

        @Nullable
        /* JADX INFO: renamed from: component23, reason: from getter */
        public final String getBuriedText() {
            return this.buriedText;
        }

        @Nullable
        /* JADX INFO: renamed from: component24, reason: from getter */
        public final String getMediaDigitalAdId() {
            return this.mediaDigitalAdId;
        }

        @Nullable
        /* JADX INFO: renamed from: component25, reason: from getter */
        public final String getMediaDigitalAdName() {
            return this.mediaDigitalAdName;
        }

        @Nullable
        /* JADX INFO: renamed from: component26, reason: from getter */
        public final String getMediaDigitalSceneId() {
            return this.mediaDigitalSceneId;
        }

        @Nullable
        /* JADX INFO: renamed from: component27, reason: from getter */
        public final String getOrderId() {
            return this.orderId;
        }

        @Nullable
        /* JADX INFO: renamed from: component28, reason: from getter */
        public final String getSkuId() {
            return this.skuId;
        }

        @Nullable
        /* JADX INFO: renamed from: component29, reason: from getter */
        public final String getCouponId() {
            return this.couponId;
        }

        @Nullable
        /* JADX INFO: renamed from: component3, reason: from getter */
        public final Integer getType() {
            return this.type;
        }

        @Nullable
        /* JADX INFO: renamed from: component30, reason: from getter */
        public final String getTransparent() {
            return this.transparent;
        }

        @Nullable
        /* JADX INFO: renamed from: component31, reason: from getter */
        public final String getAddetail() {
            return this.addetail;
        }

        @Nullable
        /* JADX INFO: renamed from: component32, reason: from getter */
        public final String getAttach() {
            return this.attach;
        }

        @Nullable
        /* JADX INFO: renamed from: component33, reason: from getter */
        public final String getAttachTwo() {
            return this.attachTwo;
        }

        @Nullable
        /* JADX INFO: renamed from: component4, reason: from getter */
        public final String getText() {
            return this.text;
        }

        @Nullable
        public final List<ColorSpanInfo> component5() {
            return this.textLocation;
        }

        @Nullable
        /* JADX INFO: renamed from: component6, reason: from getter */
        public final String getLeftIcon() {
            return this.leftIcon;
        }

        @Nullable
        /* JADX INFO: renamed from: component7, reason: from getter */
        public final String getRightButtonText() {
            return this.rightButtonText;
        }

        @Nullable
        /* JADX INFO: renamed from: component8, reason: from getter */
        public final String getRightButtonTextColor() {
            return this.rightButtonTextColor;
        }

        @Nullable
        /* JADX INFO: renamed from: component9, reason: from getter */
        public final String getRightButtonBackgroundColor() {
            return this.rightButtonBackgroundColor;
        }

        @NotNull
        public final Data copy(@Nullable Long id, @Nullable String link, @Nullable Integer type, @Nullable String text, @Nullable List<ColorSpanInfo> textLocation, @Nullable String leftIcon, @Nullable String rightButtonText, @Nullable String rightButtonTextColor, @Nullable String rightButtonBackgroundColor, @Nullable String backgroundColor, @Nullable String backgroundImage, int countdown, @Nullable String countdownColor, @Nullable String countdownTextColorValue, @Nullable String countdownText, int topRightCloseButton, @Nullable String couponIds, @Nullable String jumpType, @Nullable String initUrl, @Nullable String slideUrl, @Nullable List<String> underwrittenGoodsUrlList, int bubbleSceneType, @Nullable String buriedText, @Nullable String mediaDigitalAdId, @Nullable String mediaDigitalAdName, @Nullable String mediaDigitalSceneId, @Nullable String orderId, @Nullable String skuId, @Nullable String couponId, @Nullable String transparent, @Nullable String addetail, @Nullable String attach, @Nullable String attachTwo) {
            return new Data(id, link, type, text, textLocation, leftIcon, rightButtonText, rightButtonTextColor, rightButtonBackgroundColor, backgroundColor, backgroundImage, countdown, countdownColor, countdownTextColorValue, countdownText, topRightCloseButton, couponIds, jumpType, initUrl, slideUrl, underwrittenGoodsUrlList, bubbleSceneType, buriedText, mediaDigitalAdId, mediaDigitalAdName, mediaDigitalSceneId, orderId, skuId, couponId, transparent, addetail, attach, attachTwo);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Data)) {
                return false;
            }
            Data data = (Data) other;
            return Intrinsics.areEqual(this.id, data.id) && Intrinsics.areEqual(this.link, data.link) && Intrinsics.areEqual(this.type, data.type) && Intrinsics.areEqual(this.text, data.text) && Intrinsics.areEqual(this.textLocation, data.textLocation) && Intrinsics.areEqual(this.leftIcon, data.leftIcon) && Intrinsics.areEqual(this.rightButtonText, data.rightButtonText) && Intrinsics.areEqual(this.rightButtonTextColor, data.rightButtonTextColor) && Intrinsics.areEqual(this.rightButtonBackgroundColor, data.rightButtonBackgroundColor) && Intrinsics.areEqual(this.backgroundColor, data.backgroundColor) && Intrinsics.areEqual(this.backgroundImage, data.backgroundImage) && this.countdown == data.countdown && Intrinsics.areEqual(this.countdownColor, data.countdownColor) && Intrinsics.areEqual(this.countdownTextColorValue, data.countdownTextColorValue) && Intrinsics.areEqual(this.countdownText, data.countdownText) && this.topRightCloseButton == data.topRightCloseButton && Intrinsics.areEqual(this.couponIds, data.couponIds) && Intrinsics.areEqual(this.jumpType, data.jumpType) && Intrinsics.areEqual(this.initUrl, data.initUrl) && Intrinsics.areEqual(this.slideUrl, data.slideUrl) && Intrinsics.areEqual(this.underwrittenGoodsUrlList, data.underwrittenGoodsUrlList) && this.bubbleSceneType == data.bubbleSceneType && Intrinsics.areEqual(this.buriedText, data.buriedText) && Intrinsics.areEqual(this.mediaDigitalAdId, data.mediaDigitalAdId) && Intrinsics.areEqual(this.mediaDigitalAdName, data.mediaDigitalAdName) && Intrinsics.areEqual(this.mediaDigitalSceneId, data.mediaDigitalSceneId) && Intrinsics.areEqual(this.orderId, data.orderId) && Intrinsics.areEqual(this.skuId, data.skuId) && Intrinsics.areEqual(this.couponId, data.couponId) && Intrinsics.areEqual(this.transparent, data.transparent) && Intrinsics.areEqual(this.addetail, data.addetail) && Intrinsics.areEqual(this.attach, data.attach) && Intrinsics.areEqual(this.attachTwo, data.attachTwo);
        }

        @Nullable
        public final String getAddetail() {
            return this.addetail;
        }

        @Nullable
        public final String getAttach() {
            return this.attach;
        }

        @Nullable
        public final String getAttachTwo() {
            return this.attachTwo;
        }

        @Nullable
        public final String getBackgroundColor() {
            return this.backgroundColor;
        }

        @Nullable
        public final String getBackgroundImage() {
            return this.backgroundImage;
        }

        public final int getBubbleSceneType() {
            return this.bubbleSceneType;
        }

        @Nullable
        public final String getBuriedText() {
            return this.buriedText;
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

        @Nullable
        public final String getCouponIds() {
            return this.couponIds;
        }

        @Nullable
        public final Long getId() {
            return this.id;
        }

        @Nullable
        public final String getInitUrl() {
            return this.initUrl;
        }

        @Nullable
        public final String getJumpType() {
            return this.jumpType;
        }

        @Nullable
        public final String getLeftIcon() {
            return this.leftIcon;
        }

        @Nullable
        public final String getLink() {
            return this.link;
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

        @Nullable
        public final String getOrderId() {
            return this.orderId;
        }

        @Nullable
        public final String getRightButtonBackgroundColor() {
            return this.rightButtonBackgroundColor;
        }

        @Nullable
        public final String getRightButtonText() {
            return this.rightButtonText;
        }

        @Nullable
        public final String getRightButtonTextColor() {
            return this.rightButtonTextColor;
        }

        @Nullable
        public final String getSkuId() {
            return this.skuId;
        }

        @Nullable
        public final String getSlideUrl() {
            return this.slideUrl;
        }

        @Nullable
        public final String getText() {
            return this.text;
        }

        @Nullable
        public final List<ColorSpanInfo> getTextLocation() {
            return this.textLocation;
        }

        public final int getTopRightCloseButton() {
            return this.topRightCloseButton;
        }

        @Nullable
        public final String getTransparent() {
            return this.transparent;
        }

        @Nullable
        public final Integer getType() {
            return this.type;
        }

        @Nullable
        public final List<String> getUnderwrittenGoodsUrlList() {
            return this.underwrittenGoodsUrlList;
        }

        public int hashCode() {
            Long l2 = this.id;
            int iHashCode = (l2 == null ? 0 : l2.hashCode()) * 31;
            String str = this.link;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            Integer num = this.type;
            int iHashCode3 = (iHashCode2 + (num == null ? 0 : num.hashCode())) * 31;
            String str2 = this.text;
            int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
            List<ColorSpanInfo> list = this.textLocation;
            int iHashCode5 = (iHashCode4 + (list == null ? 0 : list.hashCode())) * 31;
            String str3 = this.leftIcon;
            int iHashCode6 = (iHashCode5 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.rightButtonText;
            int iHashCode7 = (iHashCode6 + (str4 == null ? 0 : str4.hashCode())) * 31;
            String str5 = this.rightButtonTextColor;
            int iHashCode8 = (iHashCode7 + (str5 == null ? 0 : str5.hashCode())) * 31;
            String str6 = this.rightButtonBackgroundColor;
            int iHashCode9 = (iHashCode8 + (str6 == null ? 0 : str6.hashCode())) * 31;
            String str7 = this.backgroundColor;
            int iHashCode10 = (iHashCode9 + (str7 == null ? 0 : str7.hashCode())) * 31;
            String str8 = this.backgroundImage;
            int iHashCode11 = (((iHashCode10 + (str8 == null ? 0 : str8.hashCode())) * 31) + Integer.hashCode(this.countdown)) * 31;
            String str9 = this.countdownColor;
            int iHashCode12 = (iHashCode11 + (str9 == null ? 0 : str9.hashCode())) * 31;
            String str10 = this.countdownTextColorValue;
            int iHashCode13 = (iHashCode12 + (str10 == null ? 0 : str10.hashCode())) * 31;
            String str11 = this.countdownText;
            int iHashCode14 = (((iHashCode13 + (str11 == null ? 0 : str11.hashCode())) * 31) + Integer.hashCode(this.topRightCloseButton)) * 31;
            String str12 = this.couponIds;
            int iHashCode15 = (iHashCode14 + (str12 == null ? 0 : str12.hashCode())) * 31;
            String str13 = this.jumpType;
            int iHashCode16 = (iHashCode15 + (str13 == null ? 0 : str13.hashCode())) * 31;
            String str14 = this.initUrl;
            int iHashCode17 = (iHashCode16 + (str14 == null ? 0 : str14.hashCode())) * 31;
            String str15 = this.slideUrl;
            int iHashCode18 = (iHashCode17 + (str15 == null ? 0 : str15.hashCode())) * 31;
            List<String> list2 = this.underwrittenGoodsUrlList;
            int iHashCode19 = (((iHashCode18 + (list2 == null ? 0 : list2.hashCode())) * 31) + Integer.hashCode(this.bubbleSceneType)) * 31;
            String str16 = this.buriedText;
            int iHashCode20 = (iHashCode19 + (str16 == null ? 0 : str16.hashCode())) * 31;
            String str17 = this.mediaDigitalAdId;
            int iHashCode21 = (iHashCode20 + (str17 == null ? 0 : str17.hashCode())) * 31;
            String str18 = this.mediaDigitalAdName;
            int iHashCode22 = (iHashCode21 + (str18 == null ? 0 : str18.hashCode())) * 31;
            String str19 = this.mediaDigitalSceneId;
            int iHashCode23 = (iHashCode22 + (str19 == null ? 0 : str19.hashCode())) * 31;
            String str20 = this.orderId;
            int iHashCode24 = (iHashCode23 + (str20 == null ? 0 : str20.hashCode())) * 31;
            String str21 = this.skuId;
            int iHashCode25 = (iHashCode24 + (str21 == null ? 0 : str21.hashCode())) * 31;
            String str22 = this.couponId;
            int iHashCode26 = (iHashCode25 + (str22 == null ? 0 : str22.hashCode())) * 31;
            String str23 = this.transparent;
            int iHashCode27 = (iHashCode26 + (str23 == null ? 0 : str23.hashCode())) * 31;
            String str24 = this.addetail;
            int iHashCode28 = (iHashCode27 + (str24 == null ? 0 : str24.hashCode())) * 31;
            String str25 = this.attach;
            int iHashCode29 = (iHashCode28 + (str25 == null ? 0 : str25.hashCode())) * 31;
            String str26 = this.attachTwo;
            return iHashCode29 + (str26 != null ? str26.hashCode() : 0);
        }

        public final void setAddetail(@Nullable String str) {
            this.addetail = str;
        }

        public final void setAttach(@Nullable String str) {
            this.attach = str;
        }

        public final void setAttachTwo(@Nullable String str) {
            this.attachTwo = str;
        }

        public final void setInitUrl(@Nullable String str) {
            this.initUrl = str;
        }

        public final void setSlideUrl(@Nullable String str) {
            this.slideUrl = str;
        }

        public final void setUnderwrittenGoodsUrlList(@Nullable List<String> list) {
            this.underwrittenGoodsUrlList = list;
        }

        @NotNull
        public String toString() {
            return "Data(id=" + this.id + ", link=" + ((Object) this.link) + ", type=" + this.type + ", text=" + ((Object) this.text) + ", textLocation=" + this.textLocation + ", leftIcon=" + ((Object) this.leftIcon) + ", rightButtonText=" + ((Object) this.rightButtonText) + ", rightButtonTextColor=" + ((Object) this.rightButtonTextColor) + ", rightButtonBackgroundColor=" + ((Object) this.rightButtonBackgroundColor) + ", backgroundColor=" + ((Object) this.backgroundColor) + ", backgroundImage=" + ((Object) this.backgroundImage) + ", countdown=" + this.countdown + ", countdownColor=" + ((Object) this.countdownColor) + ", countdownTextColorValue=" + ((Object) this.countdownTextColorValue) + ", countdownText=" + ((Object) this.countdownText) + ", topRightCloseButton=" + this.topRightCloseButton + ", couponIds=" + ((Object) this.couponIds) + ", jumpType=" + ((Object) this.jumpType) + ", initUrl=" + ((Object) this.initUrl) + ", slideUrl=" + ((Object) this.slideUrl) + ", underwrittenGoodsUrlList=" + this.underwrittenGoodsUrlList + ", bubbleSceneType=" + this.bubbleSceneType + ", buriedText=" + ((Object) this.buriedText) + ", mediaDigitalAdId=" + ((Object) this.mediaDigitalAdId) + ", mediaDigitalAdName=" + ((Object) this.mediaDigitalAdName) + ", mediaDigitalSceneId=" + ((Object) this.mediaDigitalSceneId) + ", orderId=" + ((Object) this.orderId) + ", skuId=" + ((Object) this.skuId) + ", couponId=" + ((Object) this.couponId) + ", transparent=" + ((Object) this.transparent) + ", addetail=" + ((Object) this.addetail) + ", attach=" + ((Object) this.attach) + ", attachTwo=" + ((Object) this.attachTwo) + ')';
        }

        public Data(@Nullable Long l2, @Nullable String str, @Nullable Integer num, @Nullable String str2, @Nullable List<ColorSpanInfo> list, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable String str6, @Nullable String str7, @Nullable String str8, int i, @Nullable String str9, @Nullable String str10, @Nullable String str11, int i2, @Nullable String str12, @Nullable String str13, @Nullable String str14, @Nullable String str15, @Nullable List<String> list2, int i3, @Nullable String str16, @Nullable String str17, @Nullable String str18, @Nullable String str19, @Nullable String str20, @Nullable String str21, @Nullable String str22, @Nullable String str23, @Nullable String str24, @Nullable String str25, @Nullable String str26) {
            this.id = l2;
            this.link = str;
            this.type = num;
            this.text = str2;
            this.textLocation = list;
            this.leftIcon = str3;
            this.rightButtonText = str4;
            this.rightButtonTextColor = str5;
            this.rightButtonBackgroundColor = str6;
            this.backgroundColor = str7;
            this.backgroundImage = str8;
            this.countdown = i;
            this.countdownColor = str9;
            this.countdownTextColorValue = str10;
            this.countdownText = str11;
            this.topRightCloseButton = i2;
            this.couponIds = str12;
            this.jumpType = str13;
            this.initUrl = str14;
            this.slideUrl = str15;
            this.underwrittenGoodsUrlList = list2;
            this.bubbleSceneType = i3;
            this.buriedText = str16;
            this.mediaDigitalAdId = str17;
            this.mediaDigitalAdName = str18;
            this.mediaDigitalSceneId = str19;
            this.orderId = str20;
            this.skuId = str21;
            this.couponId = str22;
            this.transparent = str23;
            this.addetail = str24;
            this.attach = str25;
            this.attachTwo = str26;
        }

        public /* synthetic */ Data(Long l2, String str, Integer num, String str2, List list, String str3, String str4, String str5, String str6, String str7, String str8, int i, String str9, String str10, String str11, int i2, String str12, String str13, String str14, String str15, List list2, int i3, String str16, String str17, String str18, String str19, String str20, String str21, String str22, String str23, String str24, String str25, String str26, int i4, int i5, DefaultConstructorMarker defaultConstructorMarker) {
            this((i4 & 1) != 0 ? -1L : l2, (i4 & 2) != 0 ? "" : str, (i4 & 4) != 0 ? -1 : num, (i4 & 8) != 0 ? "" : str2, (i4 & 16) != 0 ? null : list, (i4 & 32) != 0 ? "" : str3, (i4 & 64) != 0 ? "" : str4, (i4 & 128) != 0 ? "" : str5, (i4 & 256) != 0 ? "" : str6, (i4 & 512) != 0 ? "" : str7, (i4 & 1024) != 0 ? "" : str8, (i4 & 2048) != 0 ? 0 : i, (i4 & 4096) != 0 ? "" : str9, (i4 & 8192) != 0 ? "" : str10, (i4 & 16384) != 0 ? "" : str11, (i4 & 32768) != 0 ? 1 : i2, (i4 & 65536) != 0 ? "" : str12, (i4 & 131072) != 0 ? "" : str13, (i4 & 262144) != 0 ? "" : str14, (i4 & 524288) != 0 ? "" : str15, (i4 & 1048576) != 0 ? null : list2, (i4 & 2097152) != 0 ? -1 : i3, (i4 & 4194304) != 0 ? "" : str16, (i4 & 8388608) != 0 ? "" : str17, (i4 & 16777216) != 0 ? "" : str18, (i4 & 33554432) != 0 ? "" : str19, (i4 & 67108864) != 0 ? "" : str20, (i4 & 134217728) != 0 ? "" : str21, (i4 & 268435456) != 0 ? "" : str22, (i4 & 536870912) != 0 ? "" : str23, (i4 & 1073741824) != 0 ? "" : str24, (i4 & Integer.MIN_VALUE) != 0 ? "" : str25, (i5 & 1) != 0 ? "" : str26);
        }
    }

    public HomeBottomAdData() {
        this(null, null, null, null, 15, null);
    }

    public static /* synthetic */ HomeBottomAdData copy$default(HomeBottomAdData homeBottomAdData, Integer num, Data data, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            num = homeBottomAdData.code;
        }
        if ((i & 2) != 0) {
            data = homeBottomAdData.data;
        }
        if ((i & 4) != 0) {
            str = homeBottomAdData.errorMessage;
        }
        if ((i & 8) != 0) {
            str2 = homeBottomAdData.errorType;
        }
        return homeBottomAdData.copy(num, data, str, str2);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Integer getCode() {
        return this.code;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Data getData() {
        return this.data;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getErrorMessage() {
        return this.errorMessage;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getErrorType() {
        return this.errorType;
    }

    @NotNull
    public final HomeBottomAdData copy(@Nullable Integer code, @Nullable Data data, @Nullable String errorMessage, @Nullable String errorType) {
        return new HomeBottomAdData(code, data, errorMessage, errorType);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof HomeBottomAdData)) {
            return false;
        }
        HomeBottomAdData homeBottomAdData = (HomeBottomAdData) other;
        return Intrinsics.areEqual(this.code, homeBottomAdData.code) && Intrinsics.areEqual(this.data, homeBottomAdData.data) && Intrinsics.areEqual(this.errorMessage, homeBottomAdData.errorMessage) && Intrinsics.areEqual(this.errorType, homeBottomAdData.errorType);
    }

    @Nullable
    public final Integer getCode() {
        return this.code;
    }

    @Nullable
    public final Data getData() {
        return this.data;
    }

    @Nullable
    public final String getErrorMessage() {
        return this.errorMessage;
    }

    @Nullable
    public final String getErrorType() {
        return this.errorType;
    }

    @Nullable
    public final String getOriginalNetData() {
        return this.originalNetData;
    }

    public int hashCode() {
        Integer num = this.code;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        Data data = this.data;
        int iHashCode2 = (iHashCode + (data == null ? 0 : data.hashCode())) * 31;
        String str = this.errorMessage;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.errorType;
        return iHashCode3 + (str2 != null ? str2.hashCode() : 0);
    }

    public final void setOriginalNetData(@Nullable String str) {
        this.originalNetData = str;
    }

    @NotNull
    public String toString() {
        return "HomeBottomAdData(code=" + this.code + ", data=" + this.data + ", errorMessage=" + ((Object) this.errorMessage) + ", errorType=" + ((Object) this.errorType) + ')';
    }

    public HomeBottomAdData(@Nullable Integer num, @Nullable Data data, @Nullable String str, @Nullable String str2) {
        this.code = num;
        this.data = data;
        this.errorMessage = str;
        this.errorType = str2;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ HomeBottomAdData(Integer num, Data data, String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        Integer num2 = (i & 1) != 0 ? 0 : num;
        Data data2 = (i & 2) != 0 ? new Data(null, null, null, null, null, null, null, null, null, null, null, 0, null, null, null, 0, null, null, null, null, null, 0, null, null, null, null, null, null, null, null, null, null, null, -1, 1, null) : data;
        String str3 = "";
        String str4 = (i & 4) != 0 ? "" : str;
        if ((i & 8) == 0) {
            str3 = str2;
        }
        this(num2, data2, str4, str3);
    }
}
