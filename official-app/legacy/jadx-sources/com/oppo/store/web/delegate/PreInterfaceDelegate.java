package com.oppo.store.web.delegate;

import android.net.Uri;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Observer;
import com.oplus.smartenginehelper.ParserTag;
import com.oppo.store.web.delegate.PreInterfaceDelegate;
import com.oppo.store.web.delegate.datacenter.DataEngine;
import com.oppo.store.web.delegate.datacenter.WebViewRepository;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.Unit;
import p010kotlin.jvm.functions.Function3;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010#\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002Jc\u0010\u0018\u001a\u00020\r2\u0006\u0010\u0019\u001a\u00020\u00122Q\u0010\u001a\u001aM\u0012\u0013\u0012\u00110\u0007¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\n\u0012\u0015\u0012\u0013\u0018\u00010\u0005¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\u000b\u0012\u0015\u0012\u0013\u0018\u00010\u0005¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\f\u0012\u0004\u0012\u00020\r\u0018\u00010\u0006H\u0002J_\u0010\u001b\u001a\u00020\r2\u0006\u0010\u001c\u001a\u00020\u00052O\u0010\u001a\u001aK\u0012\u0013\u0012\u00110\u0007¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\n\u0012\u0015\u0012\u0013\u0018\u00010\u0005¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\u000b\u0012\u0015\u0012\u0013\u0018\u00010\u0005¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\f\u0012\u0004\u0012\u00020\r0\u0006J\u0010\u0010\u001d\u001a\u00020\r2\u0006\u0010\u001e\u001a\u00020\u001fH\u0002J\u0016\u0010 \u001a\u00020\r2\u0006\u0010!\u001a\u00020\"2\u0006\u0010\u001e\u001a\u00020\u001fRc\u0010\u0003\u001aW\u0012\u0004\u0012\u00020\u0005\u0012M\u0012K\u0012\u0013\u0012\u00110\u0007¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\n\u0012\u0015\u0012\u0013\u0018\u00010\u0005¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\u000b\u0012\u0015\u0012\u0013\u0018\u00010\u0005¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\f\u0012\u0004\u0012\u00020\r0\u00060\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00050\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00120\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0014\u001a\u00020\u0015¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017¨\u0006#"}, d2 = {"Lcom/oppo/store/web/delegate/PreInterfaceDelegate;", "", "()V", "fetchCallbacks", "", "", "Lkotlin/Function3;", "", "Lkotlin/ParameterName;", "name", "code", "message", "data", "", "fetchExecute", "", "fetchInterfaceResult", "Landroidx/lifecycle/MutableLiveData;", "Lcom/oppo/store/web/delegate/datacenter/DataEngine$PreInterfaceDataResult;", "fetchResultMap", "viewModel", "Lcom/oppo/store/web/delegate/datacenter/WebViewRepository;", "getViewModel", "()Lcom/oppo/store/web/delegate/datacenter/WebViewRepository;", "callBackToJs", "result", "callback", "getPreInterfaceByWeb", "tag", "initObservable", "owner", "Landroidx/lifecycle/LifecycleOwner;", "triggerPageExecute", ParserTag.TAG_URI, "Landroid/net/Uri;", "webbrowser-impl_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class PreInterfaceDelegate {

    @NotNull
    private final WebViewRepository viewModel = new WebViewRepository();

    @NotNull
    private final Map<String, DataEngine.PreInterfaceDataResult> fetchResultMap = new LinkedHashMap();

    @NotNull
    private final Set<String> fetchExecute = new LinkedHashSet();

    @NotNull
    private final Map<String, Function3<Integer, String, String, Unit>> fetchCallbacks = new LinkedHashMap();

    @NotNull
    private final MutableLiveData<DataEngine.PreInterfaceDataResult> fetchInterfaceResult = new MutableLiveData<>();

    private final void callBackToJs(DataEngine.PreInterfaceDataResult result, Function3<? super Integer, ? super String, ? super String, Unit> callback) {
        if (callback != null) {
            callback.invoke(Integer.valueOf(result.getCode()), result.getMessage(), result.getData());
        }
    }

    private final void initObservable(LifecycleOwner owner) {
        this.fetchInterfaceResult.observe(owner, new Observer() { // from class: com.oplus.aiunit.vision.soe
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                PreInterfaceDelegate.m5240initObservable$lambda0(this.i, (DataEngine.PreInterfaceDataResult) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: initObservable$lambda-0, reason: not valid java name */
    public static final void m5240initObservable$lambda0(PreInterfaceDelegate this$0, DataEngine.PreInterfaceDataResult result) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Map<String, DataEngine.PreInterfaceDataResult> map = this$0.fetchResultMap;
        String tag = result.getTag();
        Intrinsics.checkNotNullExpressionValue(result, "result");
        map.put(tag, result);
        this$0.fetchExecute.remove(result.getTag());
        this$0.callBackToJs(result, this$0.fetchCallbacks.get(result.getTag()));
        this$0.fetchCallbacks.remove(result.getTag());
    }

    public final void getPreInterfaceByWeb(@NotNull String tag, @NotNull Function3<? super Integer, ? super String, ? super String, Unit> callback) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(callback, "callback");
        DataEngine.PreInterfaceDataResult preInterfaceDataResult = this.fetchResultMap.get(tag);
        if (preInterfaceDataResult != null) {
            callBackToJs(preInterfaceDataResult, callback);
        } else if (this.fetchExecute.contains(tag)) {
            this.fetchCallbacks.put(tag, callback);
        } else {
            callBackToJs(new DataEngine.PreInterfaceDataResult(tag, 101, "配置错误", ""), callback);
        }
    }

    @NotNull
    public final WebViewRepository getViewModel() {
        return this.viewModel;
    }

    public final void triggerPageExecute(@NotNull Uri uri, @NotNull LifecycleOwner owner) {
        Intrinsics.checkNotNullParameter(uri, "uri");
        Intrinsics.checkNotNullParameter(owner, "owner");
        initObservable(owner);
        DataEngine.INSTANCE.triggerInterface(uri, this.viewModel, this.fetchInterfaceResult);
    }
}
