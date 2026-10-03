package pantanal.decision;

import androidx.exifinterface.media.ExifInterface;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0000\bæ\u0080\u0001\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002J\u0016\u0010\u0003\u001a\u00020\u00042\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006H&¨\u0006\u0007"}, d2 = {"Lpantanal/decision/ObserverWrapper;", ExifInterface.GPS_DIRECTION_TRUE, "", "onListChanged", "", "newList", "", "service-decision_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public interface ObserverWrapper<T> {
    void onListChanged(@NotNull List<? extends T> newList);
}
