package com.oplus.aiunit.vision;

import com.heytap.nearx.tangramconfig.strategy.Fields;
import java.io.InputStream;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.collections.CollectionsKt__CollectionsKt;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.jvm.internal.SourceDebugExtension;
import p010kotlin.text.StringsKt__StringsJVMKt;
import p010kotlin.text.StringsKt__StringsKt;

/* JADX INFO: loaded from: classes16.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\u0018\u0000 \u00102\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0011B\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ.\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00030\n2\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\bH\u0016J\u0010\u0010\r\u001a\u00020\f2\u0006\u0010\u0004\u001a\u00020\u0002H\u0016¨\u0006\u0012"}, d2 = {"Lcom/oplus/aiunit/vision/dwi;", "Lcom/oplus/aiunit/vision/n2c;", "", "Ljava/io/InputStream;", "model", "", Fields.WIDTH_FIELD, Fields.HEIGHT_FIELD, "Lcom/oplus/aiunit/vision/erd;", "options", "Lcom/oplus/aiunit/vision/n2c$a;", "c", "", "d", "<init>", "()V", "Companion", "a", "health_archives_release"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nStreamModelLoader.kt\nKotlin\n*S Kotlin\n*F\n+ 1 StreamModelLoader.kt\ncom/heytap/health/health_archives/glide/StreamModelLoader\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,68:1\n1747#2,3:69\n*S KotlinDebug\n*F\n+ 1 StreamModelLoader.kt\ncom/heytap/health/health_archives/glide/StreamModelLoader\n*L\n59#1:69,3\n*E\n"})
public final class dwi implements n2c<String, InputStream> {

    @NotNull
    public static final List<String> a = CollectionsKt__CollectionsKt.listOf((Object[]) new String[]{"/storage/emulated/", "/storage/sdcard/", "/sdcard/", "/data/user/", "/data/data/", "/mnt/sdcard/"});

    @Override // com.oplus.aiunit.vision.n2c
    @NotNull
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public n2c.a<InputStream> a(@NotNull String model, int width, int height, @NotNull erd options) {
        Intrinsics.checkNotNullParameter(model, "model");
        Intrinsics.checkNotNullParameter(options, "options");
        return new n2c.a<>(new ebd(model), new zvi(model));
    }

    @Override // com.oplus.aiunit.vision.n2c
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean b(@NotNull String model) {
        Intrinsics.checkNotNullParameter(model, "model");
        if (model.length() == 0) {
            return false;
        }
        if (!StringsKt__StringsJVMKt.startsWith(model, "http://", true) && !StringsKt__StringsJVMKt.startsWith(model, "https://", true)) {
            if (!StringsKt__StringsJVMKt.startsWith(model, "file://", true)) {
                if (!StringsKt__StringsJVMKt.startsWith$default(model, "/", false, 2, null)) {
                    return false;
                }
                List<String> list = a;
                if ((list instanceof Collection) && list.isEmpty()) {
                    return false;
                }
                Iterator<T> it = list.iterator();
                while (it.hasNext()) {
                    if (StringsKt__StringsJVMKt.startsWith(model, (String) it.next(), true)) {
                    }
                }
                return false;
            }
            if (StringsKt__StringsKt.contains((CharSequence) model, (CharSequence) "/android_asset/", true)) {
                return false;
            }
        }
        return true;
    }
}
