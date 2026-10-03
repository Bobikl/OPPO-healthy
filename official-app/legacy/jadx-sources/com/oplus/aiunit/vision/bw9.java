package com.oplus.aiunit.vision;

import com.heytap.log.formatter.LogFieldKey;
import com.heytap.nearx.tangramconfig.strategy.Fields;
import com.oplus.nearx.track.internal.common.content.GlobalConfigHelper;
import com.oplus.nearx.track.internal.remoteconfig.cloudconfig.entity.EventBlackEntity;
import com.oplus.nearx.track.internal.remoteconfig.cloudconfig.entity.EventRuleEntity;
import com.oplus.nearx.track.internal.storage.sp.SharePreferenceHelper;
import io.protostuff.MapSchema;
import java.util.List;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.Pair;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b`\u0018\u00002\u00020\u0001J\u0012\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0003\u001a\u00020\u0002H&J\b\u0010\u0007\u001a\u00020\u0006H&J\b\u0010\b\u001a\u00020\u0006H&J\b\u0010\t\u001a\u00020\u0002H&J\b\u0010\n\u001a\u00020\u0002H&J\b\u0010\u000b\u001a\u00020\u0006H&J\b\u0010\f\u001a\u00020\u0006H&J\u0014\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f0\rH&J\u0014\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00110\rH&J\b\u0010\u0013\u001a\u00020\u000eH&J\b\u0010\u0014\u001a\u00020\u000eH&J\u0018\u0010\u0018\u001a\u00020\u00042\u0006\u0010\u0015\u001a\u00020\u000e2\u0006\u0010\u0017\u001a\u00020\u0016H&J\u001a\u0010\u001b\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00160\u001a0\u0019H&J\u0016\u0010\u001c\u001a\u0010\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u001aH&J\b\u0010\u001d\u001a\u00020\u0002H&J\b\u0010\u001e\u001a\u00020\u0002H&J\b\u0010\u001f\u001a\u00020\u0002H&J\u0018\u0010#\u001a\u00020\"2\u0006\u0010 \u001a\u00020\u000e2\u0006\u0010!\u001a\u00020\u000eH&J\u0010\u0010&\u001a\u00020\u00042\u0006\u0010%\u001a\u00020$H&J\b\u0010'\u001a\u00020\u0004H&J\b\u0010(\u001a\u00020\u0002H&J\u0018\u0010)\u001a\u00020\"2\u0006\u0010 \u001a\u00020\u000e2\u0006\u0010!\u001a\u00020\u000eH&¨\u0006*"}, d2 = {"Lcom/oplus/aiunit/vision/bw9;", "", "", "isTest", "", "init", "", "f", "c", "q", "b", LogFieldKey.LEVEL_KEY, b2n.f, "", "", "Lcom/oplus/nearx/track/internal/remoteconfig/cloudconfig/entity/EventBlackEntity;", b2n.g, "Lcom/oplus/nearx/track/internal/remoteconfig/cloudconfig/entity/EventRuleEntity;", "a", "j", "d", Fields.PRODUCT_ID, "", "version", "u", "", "Lkotlin/Pair;", MapSchema.FIELD_NAME_KEY, "t", LogFieldKey.MESSAGE_KEY, "n", "r", "eventGroup", "eventId", "Lcom/oplus/aiunit/vision/re1;", "o", "Lcom/oplus/aiunit/vision/mof;", "callback", MapSchema.FIELD_NAME_ENTRY, "s", LogFieldKey.PROCESS_NAME_KEY, "i", "core-statistics_release"}, k = 1, mv = {1, 7, 1})
public interface bw9 {

    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    public static final class a {
        public static /* synthetic */ void a(bw9 bw9Var, boolean z, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: init");
            }
            if ((i & 1) != 0) {
                z = SharePreferenceHelper.h().getBoolean("enableScanTestDeviceMode", false) || GlobalConfigHelper.INSTANCE.d();
            }
            bw9Var.init(z);
        }
    }

    @NotNull
    Map<String, EventRuleEntity> a();

    boolean b();

    long c();

    @NotNull
    String d();

    void e(@NotNull mof callback);

    long f();

    long g();

    @NotNull
    Map<String, EventBlackEntity> h();

    @NotNull
    re1 i(@NotNull String eventGroup, @NotNull String eventId);

    void init(boolean isTest);

    @NotNull
    String j();

    @NotNull
    List<Pair<String, Integer>> k();

    long l();

    boolean m();

    boolean n();

    @NotNull
    re1 o(@NotNull String eventGroup, @NotNull String eventId);

    boolean p();

    boolean q();

    boolean r();

    void s();

    @Nullable
    Pair<String, Integer> t();

    void u(@NotNull String productId, int version);
}
