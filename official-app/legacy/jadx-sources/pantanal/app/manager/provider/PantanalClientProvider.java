package pantanal.app.manager.provider;

import android.os.Bundle;
import com.oplus.aiunit.vision.bs9;
import com.oplus.aiunit.vision.t6e;
import com.oplus.channel.server.provider.ChannelServerProvider;
import com.opos.process.bridge.base.BridgeConstant;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\b&\u0018\u0000 \r2\u00020\u0001:\u0001\u000eB\u0007¢\u0006\u0004\b\u000b\u0010\fJ\b\u0010\u0003\u001a\u00020\u0002H&J\b\u0010\u0004\u001a\u00020\u0002H\u0016J.\u0010\n\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00022\b\u0010\u0007\u001a\u0004\u0018\u00010\u00022\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0016¨\u0006\u000f"}, d2 = {"Lpantanal/app/manager/provider/PantanalClientProvider;", "Lcom/oplus/channel/server/provider/ChannelServerProvider;", "", "providerAuthority", "getAuthority", "authority", "method", "arg", "Landroid/os/Bundle;", BridgeConstant.KEY_EXTRAS, "call", "<init>", "()V", "Companion", "a", "pantanal-interface_release"}, k = 1, mv = {1, 8, 0})
public abstract class PantanalClientProvider extends ChannelServerProvider {

    @NotNull
    public static final String TAG = "CardServerProvider";

    @Override // android.content.ContentProvider
    @Nullable
    public Bundle call(@NotNull String authority, @NotNull String method, @Nullable String arg, @Nullable Bundle extras) {
        Intrinsics.checkNotNullParameter(authority, "authority");
        Intrinsics.checkNotNullParameter(method, "method");
        bs9.a.c(t6e.INSTANCE, "CardServerProvider", "call provider:" + authority + ", method = " + method + ", args = " + arg + ",extraBundle = " + extras, false, null, false, 0, false, null, 252, null);
        return super.call(authority, method, arg, extras);
    }

    @Override // com.oplus.channel.server.provider.ChannelServerProvider
    @NotNull
    public String getAuthority() {
        return providerAuthority();
    }

    @NotNull
    public abstract String providerAuthority();
}
