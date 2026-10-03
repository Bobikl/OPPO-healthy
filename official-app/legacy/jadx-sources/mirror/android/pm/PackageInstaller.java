package mirror.android.pm;

import android.content.pm.IPackageInstallerSession;
import android.os.IBinder;
import android.os.IInterface;
import com.oplus.utils.reflect.RefClass;
import com.oplus.utils.reflect.RefObject;

/* JADX INFO: loaded from: classes11.dex */
public class PackageInstaller {
    private static Class<?> TYPE = RefClass.load((Class<?>) PackageInstaller.class, (Class<?>) android.content.pm.PackageInstaller.class);
    public static RefObject<IInterface> mInstaller;

    public static class Session {
        private static Class<?> TYPE = RefClass.load((Class<?>) Session.class, (Class<?>) android.content.pm.PackageInstaller.Session.class);
        public static RefObject<IInterface> mSession;

        public static IInterface getSession(android.content.pm.PackageInstaller.Session session) {
            return mSession.get(session);
        }

        public static void setSession(android.content.pm.PackageInstaller.Session session, IBinder iBinder) {
            mSession.set(session, IPackageInstallerSession.Stub.asInterface(iBinder));
        }
    }
}
