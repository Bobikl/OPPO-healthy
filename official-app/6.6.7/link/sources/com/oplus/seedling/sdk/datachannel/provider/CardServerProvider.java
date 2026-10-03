package com.oplus.seedling.sdk.datachannel.provider;

import android.os.Bundle;
import com.oplus.channel.server.provider.ChannelServerProvider;
import com.oplus.smartenginehelper.ParserTag;
import com.opos.process.bridge.base.BridgeConstant;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes8.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b&\u0018\u0000 \n2\u00020\u0001:\u0001\nB\u0005¢\u0006\u0002\u0010\u0002J.\u0010\u0003\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\b\u001a\u0004\u0018\u00010\u00062\b\u0010\t\u001a\u0004\u0018\u00010\u0004H\u0016¨\u0006\u000b"}, d2 = {"Lcom/oplus/seedling/sdk/datachannel/provider/CardServerProvider;", "Lcom/oplus/channel/server/provider/ChannelServerProvider;", "()V", "call", "Landroid/os/Bundle;", "authority", "", ParserTag.TAG_METHOD, "arg", BridgeConstant.KEY_EXTRAS, "Companion", "pantanal-client_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public abstract class CardServerProvider extends ChannelServerProvider {

    @NotNull
    public static final String TAG = "CardServerProvider";

    /* JADX WARN: Multi-variable type inference failed */
    @Nullable
    public Bundle call(@NotNull String authority, @NotNull String method, @Nullable String arg, @Nullable Bundle extras) {
        Intrinsics.checkNotNullParameter(authority, "authority");
        Intrinsics.checkNotNullParameter(method, ParserTag.TAG_METHOD);
        return super/*android.content.ContentProvider*/.call(authority, method, arg, extras);
    }
}
