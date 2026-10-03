package com.heytap.health.manager;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.oplus.aiunit.vision.cm4;
import com.oplus.aiunit.vision.fdg;
import java.util.HashMap;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\official-device-assets\classes17.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\u000bB\t\b\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u001c\u0010\u0006\u001a\u00020\u00052\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002H\u0007J\b\u0010\u0007\u001a\u00020\u0005H\u0007J$\u0010\n\u001a\u001e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\bj\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002`\tH\u0007R7\u0010\u000e\u001a\u001e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\bj\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002`\t8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\u000b\u0010\r¨\u0006\u0011"}, d2 = {"Lcom/heytap/health/manager/SkuHelper;", "", "", "mac", "imgUrl", "", "c", "d", "Ljava/util/HashMap;", "Lkotlin/collections/HashMap;", "b", "a", "Lkotlin/Lazy;", "()Ljava/util/HashMap;", "sSkuImages", "<init>", "()V", "device_pair_release"}, k = 1, mv = {1, 8, 0})
public final class SkuHelper {

    @NotNull
    public static final SkuHelper INSTANCE = new SkuHelper();

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public static final Lazy sSkuImages = LazyKt.lazy(new Function0<HashMap<String, String>>() { // from class: com.heytap.health.manager.SkuHelper$sSkuImages$2
        @NotNull
        public final HashMap<String, String> invoke() {
            SkuHelper.a aVar;
            try {
                aVar = (SkuHelper.a) new Gson().fromJson(fdg.w().D("picture_id"), SkuHelper.a.class);
            } catch (Exception unused) {
                cm4.c("SkuHelper", "picture id parse error");
                aVar = null;
            }
            if (aVar == null) {
                return new HashMap<>();
            }
            HashMap<String, String> mapA = aVar.a();
            StringBuilder sb = new StringBuilder();
            sb.append("getSkuMap:");
            sb.append(mapA);
            HashMap<String, String> mapA2 = aVar.a();
            return mapA2 == null ? new HashMap<>() : mapA2;
        }
    });

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0002\u0018\u00002\u00020\u0001B/\u0012&\u0010\b\u001a\"\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002j\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u0001`\u0004¢\u0006\u0004\b\t\u0010\nR:\u0010\b\u001a\"\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002j\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u0001`\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0005\u0010\u0007¨\u0006\u000b"}, d2 = {"Lcom/heytap/health/manager/SkuHelper$a;", "", "Ljava/util/HashMap;", "", "Lkotlin/collections/HashMap;", "a", "Ljava/util/HashMap;", "()Ljava/util/HashMap;", "map", "<init>", "(Ljava/util/HashMap;)V", "device_pair_release"}, k = 1, mv = {1, 8, 0})
    public static final class a {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        @SerializedName("map")
        @Nullable
        private final HashMap<String, String> map;

        public a(@Nullable HashMap<String, String> map) {
            this.map = map;
        }

        @Nullable
        public final HashMap<String, String> a() {
            return this.map;
        }
    }

    @JvmStatic
    @NotNull
    public static final HashMap<String, String> b() {
        return INSTANCE.a();
    }

    @JvmStatic
    public static final void c(@Nullable String mac, @Nullable String imgUrl) {
        INSTANCE.a().put(mac == null ? "" : mac, imgUrl != null ? imgUrl : "");
        StringBuilder sb = new StringBuilder();
        sb.append("putSkuImages mac:");
        sb.append(mac);
        sb.append(" imgUrl:");
        sb.append(imgUrl);
    }

    @JvmStatic
    public static final void d() {
        fdg.w().U("picture_id", new Gson().toJson(new a(INSTANCE.a())));
    }

    public final HashMap<String, String> a() {
        return (HashMap) sSkuImages.getValue();
    }
}
