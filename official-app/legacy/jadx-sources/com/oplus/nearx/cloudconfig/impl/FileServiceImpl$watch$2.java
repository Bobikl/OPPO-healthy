package com.oplus.nearx.cloudconfig.impl;

import com.heytap.webview.extension.protocol.Const;
import com.oplus.aiunit.vision.gbd;
import com.oplus.aiunit.vision.ic7;
import java.io.File;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.Unit;
import p010kotlin.jvm.functions.Function2;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "", "configId", "", Const.Scheme.SCHEME_FILE, "Ljava/io/File;", "invoke"}, k = 3, mv = {1, 1, 16})
final class FileServiceImpl$watch$2 extends Lambda implements Function2<String, File, Unit> {
    final /* synthetic */ ic7 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FileServiceImpl$watch$2(ic7 ic7Var) {
        super(2);
        this.this$0 = ic7Var;
    }

    @Override // p010kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(String str, File file) {
        invoke2(str, file);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(@NotNull String configId, @NotNull File file) {
        Intrinsics.checkParameterIsNotNull(configId, "configId");
        Intrinsics.checkParameterIsNotNull(file, "file");
        if (!Intrinsics.areEqual((File) this.this$0.fileMap.get(configId), file)) {
            this.this$0.fileMap.put(configId, file);
            ConcurrentHashMap concurrentHashMap = this.this$0.configObservableMap;
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Map.Entry entry : concurrentHashMap.entrySet()) {
                if (Intrinsics.areEqual((String) entry.getKey(), configId)) {
                    linkedHashMap.put(entry.getKey(), entry.getValue());
                }
            }
            Iterator it = linkedHashMap.entrySet().iterator();
            while (it.hasNext()) {
                ((gbd) ((Map.Entry) it.next()).getValue()).b(file);
            }
            ic7.d(this.this$0, "on File configChanged: " + configId + " -> " + file + " ..", null, 1, null);
        }
    }
}
