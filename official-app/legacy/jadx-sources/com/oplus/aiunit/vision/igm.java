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
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b&\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ\u0012\u0010\u0004\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0003\u001a\u00020\u0002H&J\u001a\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002H&R\u001d\u0010\r\u001a\u0004\u0018\u00010\b8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f¨\u0006\u0010"}, d2 = {"Lcom/oplus/aiunit/vision/igm;", "", "", "key", ParserTag.TAG_GET, "value", "", a8i.UPDATE, "Landroid/content/Context;", "context$delegate", "Lkotlin/Lazy;", "getContext", "()Landroid/content/Context;", "context", "<init>", "()V", "com.oplus.card.widget.cardwidget"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nBaseKeyValueCache.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BaseKeyValueCache.kt\ncom/oplus/cardwidget/dataLayer/cache/BaseKeyValueCache\n+ 2 ClientDI.kt\ncom/oplus/channel/client/utils/ClientDI\n*L\n1#1,39:1\n37#2,12:40\n*S KotlinDebug\n*F\n+ 1 BaseKeyValueCache.kt\ncom/oplus/cardwidget/dataLayer/cache/BaseKeyValueCache\n*L\n23#1:40,12\n*E\n"})
public abstract class igm {

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

    public igm() {
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
    public abstract String get(@NotNull String key);

    @Nullable
    public final Context getContext() {
        return (Context) this.context.getValue();
    }

    public abstract boolean update(@NotNull String key, @Nullable String value);
}
