package com.oplus.aiunit.vision;

import android.content.res.AssetManager;
import com.heytap.log.consts.LogSenderConst;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0004\u001a\u00020\u00022\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¨\u0006\u0007"}, d2 = {"Lcom/oplus/aiunit/vision/jvc;", "", "", LogSenderConst.FILENAME, "a", "<init>", "()V", "device_notification_impl2_release"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nNotificationAssertUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NotificationAssertUtils.kt\ncom/heytap/health/watch/notification/impl/utils/NotificationAssertUtils\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,43:1\n1#2:44\n*E\n"})
public final class jvc {

    @NotNull
    public static final jvc INSTANCE = new jvc();

    @NotNull
    public final String a(@Nullable String fileName) {
        StringBuilder sb = new StringBuilder();
        try {
            AssetManager assets = b78.a().getAssets();
            Intrinsics.checkNotNull(fileName);
            InputStream inputStreamOpen = assets.open(fileName);
            Intrinsics.checkNotNullExpressionValue(inputStreamOpen, "assetManager.open(fileName!!)");
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStreamOpen));
            while (true) {
                String line = bufferedReader.readLine();
                if (line == null) {
                    break;
                }
                sb.append(line);
            }
        } catch (Exception e2) {
            a7b.b("NTF_AssertUtils", "readAssertString: " + e2.getMessage());
            a7b.b("ResourceUtil", "readAssertResource " + e2.getMessage());
        }
        String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "sb.toString()");
        return string;
    }
}
