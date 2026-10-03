package com.heytap.health.quickcard;

import android.app.Application;
import androidx.annotation.Keep;
import com.heytap.health.quickcard.channel.StepChannelHandler;
import com.oplus.aiunit.vision.a7b;
import com.oplus.aiunit.vision.a8a;
import com.oplus.aiunit.vision.b78;
import org.hapjs.features.channel.HapChannelManager;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes17.dex */
@Keep
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000 \u000e2\u00020\u0001:\u0001\u000fB\u0007¢\u0006\u0004\b\f\u0010\rJ\b\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0004\u001a\u00020\u0002H\u0016J\b\u0010\u0006\u001a\u00020\u0005H\u0016J\b\u0010\u0007\u001a\u00020\u0005H\u0016J\b\u0010\b\u001a\u00020\u0005H\u0016J\u0012\u0010\u000b\u001a\u00020\u00052\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0016¨\u0006\u0010"}, d2 = {"Lcom/heytap/health/quickcard/ChannelInitializer;", "Lcom/oplus/aiunit/vision/a8a;", "", "configProcess", "configPriority", "", "init", "initAfterInternetAgreed", "initAfterPrivacyAgreed", "Landroid/app/Application;", "application", "attachContext", "<init>", "()V", "Companion", "a", "quickcard_release"}, k = 1, mv = {1, 8, 0})
public final class ChannelInitializer extends a8a {

    @NotNull
    private static final String OPPO_QUICK_APP_PG_NAME = "com.nearme.instant.platform";

    @NotNull
    private static final String OPPO_QUICK_APP_PG_SIGNATURE = "0e76297ae23cdb91dc06240a42bbe04b438951d68ef6e43e1ea0bde6c76d4250";

    @Override // com.oplus.aiunit.vision.a8a
    public void attachContext(@Nullable Application application) {
        super.attachContext(application);
    }

    @Override // com.oplus.aiunit.vision.a8a
    public int configPriority() {
        return 95;
    }

    @Override // com.oplus.aiunit.vision.a8a
    public int configProcess() {
        return 1;
    }

    @Override // com.oplus.aiunit.vision.a8a
    public void init() {
        a7b.f("ChannelInitializer", "init");
        HapChannelManager.get().initialize(b78.a());
        HapChannelManager.get().addPlatform("com.nearme.instant.platform", OPPO_QUICK_APP_PG_SIGNATURE);
        HapChannelManager.get().setChannelHandler("steps", new StepChannelHandler());
    }

    @Override // com.oplus.aiunit.vision.a8a
    public void initAfterInternetAgreed() {
        super.initAfterInternetAgreed();
    }

    @Override // com.oplus.aiunit.vision.a8a
    public void initAfterPrivacyAgreed() {
        super.initAfterPrivacyAgreed();
    }
}
