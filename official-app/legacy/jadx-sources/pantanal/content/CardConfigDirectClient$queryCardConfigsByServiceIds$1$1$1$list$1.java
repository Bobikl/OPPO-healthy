package pantanal.content;

import java.util.ArrayList;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.jvm.functions.Function1;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.jvm.internal.Lambda;
import pantanal.app.bean.CardConfigInfo;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "Lpantanal/app/bean/CardConfigInfo;", "it", "", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
final class CardConfigDirectClient$queryCardConfigsByServiceIds$1$1$1$list$1 extends Lambda implements Function1<String, List<CardConfigInfo>> {
    public static final CardConfigDirectClient$queryCardConfigsByServiceIds$1$1$1$list$1 INSTANCE = new CardConfigDirectClient$queryCardConfigsByServiceIds$1$1$1$list$1();

    public CardConfigDirectClient$queryCardConfigsByServiceIds$1$1$1$list$1() {
        super(1);
    }

    @Override // p010kotlin.jvm.functions.Function1
    @NotNull
    public final List<CardConfigInfo> invoke(@NotNull String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return new ArrayList();
    }
}
