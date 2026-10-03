package p010kotlin.reflect.jvm.internal.impl.resolve.deprecation;

/* JADX INFO: loaded from: classes11.dex */
public abstract class DescriptorBasedDeprecationInfo extends DeprecationInfo {
    @Override // p010kotlin.reflect.jvm.internal.impl.resolve.deprecation.DeprecationInfo
    public boolean getPropagatesToOverrides() {
        return true;
    }
}
