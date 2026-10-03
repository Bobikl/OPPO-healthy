package com.oppo.store.web.delegate.datacenter;

import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import androidx.lifecycle.MutableLiveData;
import com.heytap.store.base.core.http.GlobalParams;
import com.heytap.store.base.core.http.HttpUtils;
import com.heytap.store.base.core.util.RequestUtilsKt;
import com.heytap.store.platform.tools.LogUtils;
import com.oplus.aiunit.vision.gj8;
import com.oplus.aiunit.vision.kbd;
import com.oplus.smartenginehelper.ParserTag;
import com.oppo.store.web.bean.Interface;
import com.oppo.store.web.bean.PageInterfaces;
import com.oppo.store.web.bean.PreInterfaceResult;
import com.oppo.store.web.delegate.datacenter.DataEngine;
import com.oppo.store.web.model.WebConfigCenter;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.Unit;
import p010kotlin.collections.CollectionsKt___CollectionsKt;
import p010kotlin.collections.MapsKt__MapsKt;
import p010kotlin.jvm.functions.Function1;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.text.StringsKt__StringsJVMKt;
import p010kotlin.text.StringsKt__StringsKt;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010%\n\u0002\u0010\b\n\u0002\u0010#\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\u001fB\u0007\b\u0002¢\u0006\u0002\u0010\u0002Jd\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00110\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0018\u0010\u0016\u001a\u0014\u0012\u0004\u0012\u00020\u0018\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u00190\u00172\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u001c0\u001bH\u0002J0\u0010\u001d\u001a\u00020\u000b2\u0018\u0010\u0016\u001a\u0014\u0012\u0004\u0012\u00020\u0018\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u00190\u00172\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u001c0\u001bH\u0002J&\u0010\u001e\u001a\u00020\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\f\u001a\u00020\r2\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u001c0\u001bR\"\u0010\u0003\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\t¨\u0006 "}, d2 = {"Lcom/oppo/store/web/delegate/datacenter/DataEngine;", "", "()V", "preInterfaceResult", "", "Lcom/oppo/store/web/bean/PageInterfaces;", "getPreInterfaceResult", "()Ljava/util/List;", "setPreInterfaceResult", "(Ljava/util/List;)V", "executeInterface", "", "viewModel", "Lcom/oppo/store/web/delegate/datacenter/WebViewRepository;", ParserTag.TAG_URI, "Landroid/net/Uri;", "serviceHost", "", "headers", "", "config", "Lcom/oppo/store/web/bean/Interface;", "timeoutMap", "", "", "", "fetchInterfaceResult", "Landroidx/lifecycle/MutableLiveData;", "Lcom/oppo/store/web/delegate/datacenter/DataEngine$PreInterfaceDataResult;", "startTimeOut", "triggerInterface", "PreInterfaceDataResult", "webbrowser-impl_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class DataEngine {

    @NotNull
    public static final DataEngine INSTANCE = new DataEngine();

    @Nullable
    private static List<PageInterfaces> preInterfaceResult;

    private DataEngine() {
    }

    /* JADX WARN: Code duplicated, block: B:23:0x00cd  */
    private final void executeInterface(WebViewRepository viewModel, Uri uri, String serviceHost, Map<String, String> headers, final Interface config, final Map<Integer, Set<String>> timeoutMap, final MutableLiveData<PreInterfaceDataResult> fetchInterfaceResult) {
        boolean z;
        final String tag = config.getTag();
        if (tag == null) {
            return;
        }
        String str = "/cn/oapi" + config.getPath();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Map<String, String> params = config.getParams();
        if (params != null) {
            linkedHashMap.putAll(params);
        }
        LogUtils.INSTANCE.i("bridgeData", "接口前置请求接口 path : " + str + "  query 换前 " + linkedHashMap);
        String query = uri.getQuery();
        if (query != null) {
            for (String str2 : StringsKt__StringsKt.split$default((CharSequence) query, new String[]{"&"}, false, 0, 6, (Object) null)) {
                LogUtils.INSTANCE.i("bridgeData", str + " 从url 获取到的query 为 " + str2);
                List listSplit$default = StringsKt__StringsKt.split$default((CharSequence) str2, new String[]{HttpUtils.EQUAL_SIGN}, false, 0, 6, (Object) null);
                if (listSplit$default.size() == 2) {
                    String str3 = (String) linkedHashMap.get(listSplit$default.get(0));
                    if (str3 == null) {
                        z = false;
                    } else if (str3.length() > 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (z) {
                        linkedHashMap.put(listSplit$default.get(0), listSplit$default.get(1));
                    }
                }
            }
        }
        LogUtils.INSTANCE.i("bridgeData", "接口前置请求接口 path : " + str + "  query 完成替换后 " + linkedHashMap);
        String method = config.getMethod();
        if (method == null) {
            method = "";
        }
        kbd<String> kbdVarWebGetPreInterface = StringsKt__StringsJVMKt.endsWith("post", method, false) ? viewModel.webGetPreInterface(serviceHost, str, headers, linkedHashMap) : viewModel.webPostPreInterface(serviceHost, str, headers, linkedHashMap);
        Integer timeout = config.getTimeout();
        if (timeout != null) {
            int iIntValue = timeout.intValue();
            Set<String> linkedHashSet = timeoutMap.get(Integer.valueOf(iIntValue));
            if (linkedHashSet == null) {
                linkedHashSet = new LinkedHashSet<>();
            }
            String tag2 = config.getTag();
            linkedHashSet.add(tag2 != null ? tag2 : "");
            timeoutMap.put(Integer.valueOf(iIntValue), linkedHashSet);
        }
        RequestUtilsKt.request$default(kbdVarWebGetPreInterface, null, new Function1<Throwable, Unit>() { // from class: com.oppo.store.web.delegate.datacenter.DataEngine.executeInterface.3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // p010kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
                invoke2(th);
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@NotNull Throwable error) {
                Intrinsics.checkNotNullParameter(error, "error");
                Integer timeout2 = config.getTimeout();
                if (timeout2 != null) {
                    Map<Integer, Set<String>> map = timeoutMap;
                    Interface r2 = config;
                    Set<String> set = map.get(Integer.valueOf(timeout2.intValue()));
                    if (set != null) {
                        String tag3 = r2.getTag();
                        if (tag3 == null) {
                            tag3 = "";
                        }
                        set.remove(tag3);
                    }
                }
                LogUtils.INSTANCE.i("bridgeData", "接口前置 请求失败 :" + config + " \n 失败错误信息为:" + error);
                fetchInterfaceResult.postValue(new PreInterfaceDataResult(tag, 103, error.toString(), null));
            }
        }, new Function1<String, Unit>() { // from class: com.oppo.store.web.delegate.datacenter.DataEngine.executeInterface.4
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // p010kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(String str4) {
                invoke2(str4);
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@NotNull String result) {
                String strSubstring;
                Intrinsics.checkNotNullParameter(result, "result");
                Integer timeout2 = config.getTimeout();
                if (timeout2 != null) {
                    Map<Integer, Set<String>> map = timeoutMap;
                    Interface r2 = config;
                    Set<String> set = map.get(Integer.valueOf(timeout2.intValue()));
                    if (set != null) {
                        String tag3 = r2.getTag();
                        if (tag3 == null) {
                            tag3 = "";
                        }
                        set.remove(tag3);
                    }
                }
                LogUtils logUtils = LogUtils.INSTANCE;
                StringBuilder sb = new StringBuilder();
                sb.append("接口前置 请求成功 :");
                sb.append(config);
                sb.append(" \n数据结果为：");
                if (result.length() > 100) {
                    strSubstring = result.substring(0, 100);
                    Intrinsics.checkNotNullExpressionValue(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
                } else {
                    strSubstring = result;
                }
                sb.append(strSubstring);
                logUtils.i("bridgeData", sb.toString());
                fetchInterfaceResult.postValue(new PreInterfaceDataResult(tag, 0, null, result));
            }
        }, 1, null);
    }

    private final void startTimeOut(Map<Integer, Set<String>> timeoutMap, final MutableLiveData<PreInterfaceDataResult> fetchInterfaceResult) {
        LogUtils.INSTANCE.i("bridgeData", "接口前置，启动 请求 timeout " + timeoutMap);
        Handler handler = new Handler(Looper.getMainLooper());
        Iterator<T> it = timeoutMap.keySet().iterator();
        while (it.hasNext()) {
            int iIntValue = ((Number) it.next()).intValue();
            final Set<String> set = timeoutMap.get(Integer.valueOf(iIntValue));
            handler.postDelayed(new Runnable() { // from class: com.oplus.aiunit.vision.ct4
                @Override // java.lang.Runnable
                public final void run() {
                    DataEngine.m5246startTimeOut$lambda4$lambda3(set, fetchInterfaceResult);
                }
            }, iIntValue * 1000);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: startTimeOut$lambda-4$lambda-3, reason: not valid java name */
    public static final void m5246startTimeOut$lambda4$lambda3(Set set, MutableLiveData fetchInterfaceResult) {
        Intrinsics.checkNotNullParameter(fetchInterfaceResult, "$fetchInterfaceResult");
        LogUtils.INSTANCE.i("bridgeData", "接口前置 接口超时： " + set);
        if (set != null) {
            Iterator it = set.iterator();
            while (it.hasNext()) {
                fetchInterfaceResult.postValue(new PreInterfaceDataResult((String) it.next(), 102, "timeout", null));
            }
        }
    }

    @Nullable
    public final List<PageInterfaces> getPreInterfaceResult() {
        return preInterfaceResult;
    }

    public final void setPreInterfaceResult(@Nullable List<PageInterfaces> list) {
        preInterfaceResult = list;
    }

    public final void triggerInterface(@Nullable Uri uri, @NotNull WebViewRepository viewModel, @NotNull MutableLiveData<PreInterfaceDataResult> fetchInterfaceResult) {
        String path;
        Map<String, String> mapEmptyMap;
        Intrinsics.checkNotNullParameter(viewModel, "viewModel");
        Intrinsics.checkNotNullParameter(fetchInterfaceResult, "fetchInterfaceResult");
        PreInterfaceResult.Data preInterfaceResultData = WebConfigCenter.INSTANCE.getPreInterfaceResultData();
        preInterfaceResult = preInterfaceResultData != null ? preInterfaceResultData.getPageInterfaces() : null;
        if (uri == null || (path = uri.getPath()) == null) {
            return;
        }
        String str = uri.getScheme() + "://" + uri.getHost();
        List<PageInterfaces> list = preInterfaceResult;
        if (list != null) {
            for (PageInterfaces pageInterfaces : list) {
                if (Intrinsics.areEqual(path, pageInterfaces.getPage())) {
                    if (GlobalParams.isAddGlobalUrl(str)) {
                        mapEmptyMap = MapsKt__MapsKt.emptyMap();
                    } else {
                        gj8 gj8VarG = GlobalParams.addCommonHeaderForRequest(new gj8.a()).g();
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        Map<String, List<String>> mapG = gj8VarG.g();
                        Intrinsics.checkNotNullExpressionValue(mapG, "tempHeaders.toMultimap()");
                        for (Map.Entry<String, List<String>> entry : mapG.entrySet()) {
                            String key = entry.getKey();
                            Intrinsics.checkNotNullExpressionValue(key, "pair.key");
                            List<String> value = entry.getValue();
                            Intrinsics.checkNotNullExpressionValue(value, "pair.value");
                            String str2 = (String) CollectionsKt___CollectionsKt.firstOrNull((List) value);
                            if (str2 == null) {
                                str2 = "";
                            }
                            linkedHashMap.put(key, str2);
                        }
                        mapEmptyMap = linkedHashMap;
                    }
                    LogUtils.INSTANCE.i("bridgeData", "接口前置匹配成功 :" + pageInterfaces);
                    LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                    List<Interface> interfaces = pageInterfaces.getInterfaces();
                    if (interfaces != null) {
                        Iterator<T> it = interfaces.iterator();
                        while (it.hasNext()) {
                            INSTANCE.executeInterface(viewModel, uri, str, mapEmptyMap, (Interface) it.next(), linkedHashMap2, fetchInterfaceResult);
                        }
                    }
                    INSTANCE.startTimeOut(linkedHashMap2, fetchInterfaceResult);
                }
            }
        }
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\bJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0003J5\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0005HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\f¨\u0006\u0019"}, d2 = {"Lcom/oppo/store/web/delegate/datacenter/DataEngine$PreInterfaceDataResult;", "", "tag", "", "code", "", "message", "data", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)V", "getCode", "()I", "getData", "()Ljava/lang/String;", "getMessage", "getTag", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "toString", "webbrowser-impl_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final /* data */ class PreInterfaceDataResult {
        private final int code;

        @Nullable
        private final String data;

        @Nullable
        private final String message;

        @NotNull
        private final String tag;

        public PreInterfaceDataResult(@NotNull String tag, int i, @Nullable String str, @Nullable String str2) {
            Intrinsics.checkNotNullParameter(tag, "tag");
            this.tag = tag;
            this.code = i;
            this.message = str;
            this.data = str2;
        }

        public static /* synthetic */ PreInterfaceDataResult copy$default(PreInterfaceDataResult preInterfaceDataResult, String str, int i, String str2, String str3, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                str = preInterfaceDataResult.tag;
            }
            if ((i2 & 2) != 0) {
                i = preInterfaceDataResult.code;
            }
            if ((i2 & 4) != 0) {
                str2 = preInterfaceDataResult.message;
            }
            if ((i2 & 8) != 0) {
                str3 = preInterfaceDataResult.data;
            }
            return preInterfaceDataResult.copy(str, i, str2, str3);
        }

        @NotNull
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getTag() {
            return this.tag;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final int getCode() {
            return this.code;
        }

        @Nullable
        /* JADX INFO: renamed from: component3, reason: from getter */
        public final String getMessage() {
            return this.message;
        }

        @Nullable
        /* JADX INFO: renamed from: component4, reason: from getter */
        public final String getData() {
            return this.data;
        }

        @NotNull
        public final PreInterfaceDataResult copy(@NotNull String tag, int code, @Nullable String message, @Nullable String data) {
            Intrinsics.checkNotNullParameter(tag, "tag");
            return new PreInterfaceDataResult(tag, code, message, data);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof PreInterfaceDataResult)) {
                return false;
            }
            PreInterfaceDataResult preInterfaceDataResult = (PreInterfaceDataResult) other;
            return Intrinsics.areEqual(this.tag, preInterfaceDataResult.tag) && this.code == preInterfaceDataResult.code && Intrinsics.areEqual(this.message, preInterfaceDataResult.message) && Intrinsics.areEqual(this.data, preInterfaceDataResult.data);
        }

        public final int getCode() {
            return this.code;
        }

        @Nullable
        public final String getData() {
            return this.data;
        }

        @Nullable
        public final String getMessage() {
            return this.message;
        }

        @NotNull
        public final String getTag() {
            return this.tag;
        }

        public int hashCode() {
            int iHashCode = ((this.tag.hashCode() * 31) + Integer.hashCode(this.code)) * 31;
            String str = this.message;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.data;
            return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            return "PreInterfaceDataResult(tag=" + this.tag + ", code=" + this.code + ", message=" + this.message + ", data=" + this.data + ')';
        }

        public /* synthetic */ PreInterfaceDataResult(String str, int i, String str2, String str3, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, i, (i2 & 4) != 0 ? null : str2, (i2 & 8) != 0 ? null : str3);
        }
    }
}
