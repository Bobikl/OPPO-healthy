package pantanal.app.groupcard.plugininterface;

import android.content.Context;
import androidx.annotation.Keep;
import com.oplus.aiunit.vision.bs9;
import com.oplus.aiunit.vision.on9;
import com.oplus.aiunit.vision.sbe;
import com.oplus.aiunit.vision.t6e;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.collections.CollectionsKt__CollectionsKt;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
@Keep
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0005\b\u0017\u0018\u0000 \u00132\u00020\u0001:\u0001\u0013B\u0007¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J\b\u0010\t\u001a\u00020\u0004H\u0016J\u0010\u0010\f\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\nH\u0016J\u001e\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00020\u000f2\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\u0002H\u0016¨\u0006\u0014"}, d2 = {"Lpantanal/app/groupcard/plugininterface/CardGroupInitManagerCompatibleImpl;", "Lcom/oplus/aiunit/vision/on9;", "", "methodName", "", "defaultLog", "Landroid/content/Context;", "appContext", "initSdk", "releaseSdk", "", "level", "onTrimMemory", sbe.PAY_SDK_VERSION_NAME, sbe.PAY_SDK_VERSION_CODE, "", "exchangeVersion", "<init>", "()V", "Companion", "groupcard-interface_release"}, k = 1, mv = {1, 8, 0})
public class CardGroupInitManagerCompatibleImpl implements on9 {

    @NotNull
    private static final String TAG = "CardGroupInitManagerCompatibleImpl";

    private final void defaultLog(String methodName) {
        bs9.a.e(t6e.INSTANCE, TAG, "warning, default impl! maybe version is not compatible, methodName:" + methodName, false, null, false, 0, false, null, 252, null);
    }

    @Override // com.oplus.aiunit.vision.on9
    @NotNull
    public List<String> exchangeVersion(@NotNull String sdkVersionName, @NotNull String sdkVersionCode) {
        Intrinsics.checkNotNullParameter(sdkVersionName, "sdkVersionName");
        Intrinsics.checkNotNullParameter(sdkVersionCode, "sdkVersionCode");
        defaultLog("exchangeVersion");
        return CollectionsKt__CollectionsKt.emptyList();
    }

    @Override // com.oplus.aiunit.vision.on9
    public void initSdk(@NotNull Context appContext) {
        Intrinsics.checkNotNullParameter(appContext, "appContext");
        defaultLog("initSdk");
    }

    public void onTrimMemory(int level) {
        defaultLog("onTrimMemory");
    }

    @Override // com.oplus.aiunit.vision.on9
    public void releaseSdk() {
        defaultLog("releaseSdk");
    }
}
