package androidx.recyclerview.widget;

/* JADX INFO: loaded from: classes12.dex */
public class InnerColorPhysicalAnimationUtil {
    public static int calcRealOverScrollDist(int i, int i2, int i3) {
        return (int) ((i * (1.0f - ((Math.abs(i2) * 1.0f) / i3))) / 3.0f);
    }
}
