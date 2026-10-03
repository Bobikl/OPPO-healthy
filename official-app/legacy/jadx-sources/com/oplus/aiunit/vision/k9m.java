package com.oplus.aiunit.vision;

import android.content.Context;
import com.oplus.channel.client.utils.ClientDI;
import com.oplus.smartenginehelper.ParserTag;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Lazy;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Reflection;
import p010kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b&\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H&J\u0013\u0010\b\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002H¦\u0002R\u001d\u0010\u000e\u001a\u0004\u0018\u00010\t8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u0011"}, d2 = {"Lcom/oplus/aiunit/vision/k9m;", "", "", "cardId", "", "value", "", a8i.UPDATE, ParserTag.TAG_GET, "Landroid/content/Context;", "context$delegate", "Lkotlin/Lazy;", "getContext", "()Landroid/content/Context;", "context", "<init>", "()V", "com.oplus.card.widget.cardwidget"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nBaseCardSource.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BaseCardSource.kt\ncom/oplus/cardwidget/dataLayer/cache/BaseCardSource\n+ 2 ClientDI.kt\ncom/oplus/channel/client/utils/ClientDI\n*L\n1#1,38:1\n37#2,12:39\n*S KotlinDebug\n*F\n+ 1 BaseCardSource.kt\ncom/oplus/cardwidget/dataLayer/cache/BaseCardSource\n*L\n23#1:39,12\n*E\n"})
public abstract class k9m {

    /* JADX INFO: renamed from: context$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy context;

    @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0016R\u0016\u0010\u0006\u001a\u0004\u0018\u00018\u00008VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0007¸\u0006\u0000"}, d2 = {"com/oplus/channel/client/utils/ClientDI$injectSingle$1", "Lkotlin/Lazy;", "", "isInitialized", "getValue", "()Ljava/lang/Object;", "value", "client_release"}, k = 1, mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nClientDI.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ClientDI.kt\ncom/oplus/channel/client/utils/ClientDI$injectSingle$1\n*L\n1#1,105:1\n*E\n"})
    public static final class a implements Lazy<Context> {
        @Override // p010kotlin.Lazy
        @Nullable
        public Context getValue() {
            return null;
        }

        @Override // p010kotlin.Lazy
        public boolean isInitialized() {
            return false;
        }
    }

    public k9m() {
        Lazy<?> aVar;
        ClientDI clientDI = ClientDI.INSTANCE;
        if (clientDI.getSingleInstanceMap().get(Reflection.getOrCreateKotlinClass(Context.class)) == null) {
            clientDI.onError("the class of [" + ((Object) Reflection.getOrCreateKotlinClass(Context.class).getSimpleName()) + "] are not injected");
            aVar = new a();
        } else {
            Lazy<?> lazy = clientDI.getSingleInstanceMap().get(Reflection.getOrCreateKotlinClass(Context.class));
            if (lazy == null) {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Lazy<T of com.oplus.channel.client.utils.ClientDI.injectSingle>");
            }
            aVar = lazy;
        }
        this.context = aVar;
    }

    @Nullable
    public abstract byte[] get(@NotNull String cardId);

    @Nullable
    public final Context getContext() {
        return (Context) this.context.getValue();
    }

    public abstract void update(@NotNull String cardId, @Nullable byte[] value);
}
