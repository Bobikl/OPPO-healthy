package pantanal.app.groupcard.utils;

import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.jvm.functions.Function0;
import p010kotlin.jvm.internal.Lambda;
import pantanal.app.groupcard.scene.PantaSceneSupportObserver;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0010#\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0014\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0001H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "Ljava/util/concurrent/ConcurrentHashMap;", "", "", "Lpantanal/app/groupcard/scene/PantaSceneSupportObserver;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
final class GroupCardTools$entranceToOuterSceneSupportObserver$2 extends Lambda implements Function0<ConcurrentHashMap<Integer, Set<PantaSceneSupportObserver>>> {
    public static final GroupCardTools$entranceToOuterSceneSupportObserver$2 INSTANCE = new GroupCardTools$entranceToOuterSceneSupportObserver$2();

    public GroupCardTools$entranceToOuterSceneSupportObserver$2() {
        super(0);
    }

    @Override // p010kotlin.jvm.functions.Function0
    @NotNull
    public final ConcurrentHashMap<Integer, Set<PantaSceneSupportObserver>> invoke() {
        return new ConcurrentHashMap<>();
    }
}
