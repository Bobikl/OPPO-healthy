package com.oplus.aiunit.tools.odinheader;

import com.oplus.aiunit.vision.y0j;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Map;
import java.util.concurrent.CountDownLatch;
import p010kotlin.Metadata;
import p010kotlin.Unit;
import p010kotlin.jvm.functions.Function0;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.jvm.internal.Lambda;
import p010kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nOdinHeaderTools.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OdinHeaderTools.kt\ncom/oplus/aiunit/tools/odinheader/OdinHeaderTools$getProp$1$2\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,186:1\n1#2:187\n*E\n"})
final class OdinHeaderTools$getProp$1$2 extends Lambda implements Function0<Unit> {
    final /* synthetic */ CountDownLatch $locker;
    final /* synthetic */ Map<String, String> $output;
    final /* synthetic */ Process $process;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OdinHeaderTools$getProp$1$2(Process process, CountDownLatch countDownLatch, Map<String, String> map) {
        super(0);
        this.$process = process;
        this.$locker = countDownLatch;
        this.$output = map;
    }

    @Override // p010kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() throws IOException {
        invoke2();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(this.$process.getInputStream()));
        while (true) {
            String line = bufferedReader.readLine();
            if (line == null || line.length() == 0) {
                this.$locker.countDown();
                return;
            }
            if (line != null) {
                Map<String, String> map = this.$output;
                String[] strArrA = y0j.a(line, ": ");
                if (strArrA.length >= 2) {
                    String str = strArrA[0];
                    String str2 = strArrA[1];
                    Intrinsics.checkNotNull(str);
                    String strSubstring = str.substring(1, str.length() - 1);
                    Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
                    Intrinsics.checkNotNull(str2);
                    String strSubstring2 = str2.substring(1, str2.length() - 1);
                    Intrinsics.checkNotNullExpressionValue(strSubstring2, "substring(...)");
                    map.put(strSubstring, strSubstring2);
                }
            }
        }
    }
}
