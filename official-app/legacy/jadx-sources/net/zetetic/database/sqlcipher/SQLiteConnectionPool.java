package net.zetetic.database.sqlcipher;

import android.os.CancellationSignal;
import android.os.OperationCanceledException;
import android.os.SystemClock;
import android.util.Printer;
import com.oplus.weatherservicesdk.data.Weather;
import java.io.Closeable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.locks.LockSupport;
import net.zetetic.database.Logger;

/* JADX INFO: loaded from: classes11.dex */
public final class SQLiteConnectionPool implements Closeable {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    public static final int CONNECTION_FLAG_INTERACTIVE = 4;
    public static final int CONNECTION_FLAG_PRIMARY_CONNECTION_AFFINITY = 2;
    public static final int CONNECTION_FLAG_READ_ONLY = 1;
    private static final long CONNECTION_POOL_BUSY_MILLIS = 30000;
    private static final String TAG = "SQLiteConnectionPool";
    private SQLiteConnection mAvailablePrimaryConnection;
    private final SQLiteDatabaseConfiguration mConfiguration;
    private ConnectionWaiter mConnectionWaiterPool;
    private ConnectionWaiter mConnectionWaiterQueue;
    private boolean mIsOpen;
    private int mMaxConnectionPoolSize;
    private int mNextConnectionId;
    private final CloseGuard mCloseGuard = CloseGuard.get();
    private final Object mLock = new Object();
    private final AtomicBoolean mConnectionLeaked = new AtomicBoolean();
    private final ArrayList<SQLiteConnection> mAvailableNonPrimaryConnections = new ArrayList<>();
    private final WeakHashMap<SQLiteConnection, AcquiredConnectionStatus> mAcquiredConnections = new WeakHashMap<>();

    public enum AcquiredConnectionStatus {
        NORMAL,
        RECONFIGURE,
        DISCARD
    }

    public static final class ConnectionWaiter {
        public SQLiteConnection mAssignedConnection;
        public int mConnectionFlags;
        public RuntimeException mException;
        public ConnectionWaiter mNext;
        public int mNonce;
        public int mPriority;
        public String mSql;
        public long mStartTime;
        public Thread mThread;
        public boolean mWantPrimaryConnection;

        private ConnectionWaiter() {
        }
    }

    private SQLiteConnectionPool(SQLiteDatabaseConfiguration sQLiteDatabaseConfiguration) {
        this.mConfiguration = new SQLiteDatabaseConfiguration(sQLiteDatabaseConfiguration);
        setMaxConnectionPoolSizeLocked();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void cancelConnectionWaiterLocked(ConnectionWaiter connectionWaiter) {
        if (connectionWaiter.mAssignedConnection == null && connectionWaiter.mException == null) {
            ConnectionWaiter connectionWaiter2 = null;
            for (ConnectionWaiter connectionWaiter3 = this.mConnectionWaiterQueue; connectionWaiter3 != connectionWaiter; connectionWaiter3 = connectionWaiter3.mNext) {
                connectionWaiter2 = connectionWaiter3;
            }
            if (connectionWaiter2 != null) {
                connectionWaiter2.mNext = connectionWaiter.mNext;
            } else {
                this.mConnectionWaiterQueue = connectionWaiter.mNext;
            }
            connectionWaiter.mException = new OperationCanceledException();
            LockSupport.unpark(connectionWaiter.mThread);
            wakeConnectionWaitersLocked();
        }
    }

    private void closeAvailableConnectionsAndLogExceptionsLocked() {
        closeAvailableNonPrimaryConnectionsAndLogExceptionsLocked();
        SQLiteConnection sQLiteConnection = this.mAvailablePrimaryConnection;
        if (sQLiteConnection != null) {
            closeConnectionAndLogExceptionsLocked(sQLiteConnection);
            this.mAvailablePrimaryConnection = null;
        }
    }

    private void closeAvailableNonPrimaryConnectionsAndLogExceptionsLocked() {
        int size = this.mAvailableNonPrimaryConnections.size();
        for (int i = 0; i < size; i++) {
            closeConnectionAndLogExceptionsLocked(this.mAvailableNonPrimaryConnections.get(i));
        }
        this.mAvailableNonPrimaryConnections.clear();
    }

    private void closeConnectionAndLogExceptionsLocked(SQLiteConnection sQLiteConnection) {
        try {
            sQLiteConnection.close();
        } catch (RuntimeException e2) {
            Logger.e(TAG, "Failed to close connection, its fate is now in the hands of the merciful GC: " + sQLiteConnection, e2);
        }
    }

    private void closeExcessConnectionsAndLogExceptionsLocked() {
        int size = this.mAvailableNonPrimaryConnections.size();
        while (true) {
            int i = size - 1;
            if (size <= this.mMaxConnectionPoolSize - 1) {
                return;
            }
            closeConnectionAndLogExceptionsLocked(this.mAvailableNonPrimaryConnections.remove(i));
            size = i;
        }
    }

    private void discardAcquiredConnectionsLocked() {
        markAcquiredConnectionsLocked(AcquiredConnectionStatus.DISCARD);
    }

    private void dispose(boolean z) {
        CloseGuard closeGuard = this.mCloseGuard;
        if (closeGuard != null) {
            if (z) {
                closeGuard.warnIfOpen();
            }
            this.mCloseGuard.close();
        }
        if (z) {
            return;
        }
        synchronized (this.mLock) {
            throwIfClosedLocked();
            this.mIsOpen = false;
            closeAvailableConnectionsAndLogExceptionsLocked();
            int size = this.mAcquiredConnections.size();
            if (size != 0) {
                Logger.i(TAG, "The connection pool for " + this.mConfiguration.label + " has been closed but there are still " + size + " connections in use.  They will be closed as they are released back to the pool.");
            }
            wakeConnectionWaitersLocked();
        }
    }

    private void finishAcquireConnectionLocked(SQLiteConnection sQLiteConnection, int i) {
        try {
            sQLiteConnection.setOnlyAllowReadOnlyOperations((i & 1) != 0);
            this.mAcquiredConnections.put(sQLiteConnection, AcquiredConnectionStatus.NORMAL);
        } catch (RuntimeException e2) {
            Logger.e(TAG, "Failed to prepare acquired connection for session, closing it: " + sQLiteConnection + ", connectionFlags=" + i);
            closeConnectionAndLogExceptionsLocked(sQLiteConnection);
            throw e2;
        }
    }

    private static int getPriority(int i) {
        return (i & 4) != 0 ? 1 : 0;
    }

    private boolean isSessionBlockingImportantConnectionWaitersLocked(boolean z, int i) {
        ConnectionWaiter connectionWaiter = this.mConnectionWaiterQueue;
        if (connectionWaiter == null) {
            return false;
        }
        int priority = getPriority(i);
        while (priority <= connectionWaiter.mPriority) {
            if (z || !connectionWaiter.mWantPrimaryConnection) {
                return true;
            }
            connectionWaiter = connectionWaiter.mNext;
            if (connectionWaiter == null) {
                return false;
            }
        }
        return false;
    }

    private void logConnectionPoolBusyLocked(long j2, int i) {
        int i2;
        Thread threadCurrentThread = Thread.currentThread();
        StringBuilder sb = new StringBuilder();
        sb.append("The connection pool for database '");
        sb.append(this.mConfiguration.label);
        sb.append("' has been unable to grant a connection to thread ");
        sb.append(threadCurrentThread.getId());
        sb.append(" (");
        sb.append(threadCurrentThread.getName());
        sb.append(") ");
        sb.append("with flags 0x");
        sb.append(Integer.toHexString(i));
        sb.append(" for ");
        sb.append(j2 * 0.001f);
        sb.append(" seconds.\n");
        ArrayList<String> arrayList = new ArrayList();
        int i3 = 0;
        if (this.mAcquiredConnections.isEmpty()) {
            i2 = 0;
        } else {
            Iterator<SQLiteConnection> it = this.mAcquiredConnections.keySet().iterator();
            i2 = 0;
            while (it.hasNext()) {
                String strDescribeCurrentOperationUnsafe = it.next().describeCurrentOperationUnsafe();
                if (strDescribeCurrentOperationUnsafe != null) {
                    arrayList.add(strDescribeCurrentOperationUnsafe);
                    i3++;
                } else {
                    i2++;
                }
            }
        }
        int size = this.mAvailableNonPrimaryConnections.size();
        if (this.mAvailablePrimaryConnection != null) {
            size++;
        }
        sb.append("Connections: ");
        sb.append(i3);
        sb.append(" active, ");
        sb.append(i2);
        sb.append(" idle, ");
        sb.append(size);
        sb.append(" available.\n");
        if (!arrayList.isEmpty()) {
            sb.append("\nRequests in progress:\n");
            for (String str : arrayList) {
                sb.append("  ");
                sb.append(str);
                sb.append(Weather.SEPARATOR);
            }
        }
        Logger.w(TAG, sb.toString());
    }

    private void markAcquiredConnectionsLocked(AcquiredConnectionStatus acquiredConnectionStatus) {
        if (this.mAcquiredConnections.isEmpty()) {
            return;
        }
        ArrayList arrayList = new ArrayList(this.mAcquiredConnections.size());
        for (Map.Entry<SQLiteConnection, AcquiredConnectionStatus> entry : this.mAcquiredConnections.entrySet()) {
            AcquiredConnectionStatus value = entry.getValue();
            if (acquiredConnectionStatus != value && value != AcquiredConnectionStatus.DISCARD) {
                arrayList.add(entry.getKey());
            }
        }
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            this.mAcquiredConnections.put((SQLiteConnection) arrayList.get(i), acquiredConnectionStatus);
        }
    }

    private ConnectionWaiter obtainConnectionWaiterLocked(Thread thread, long j2, int i, boolean z, String str, int i2) {
        ConnectionWaiter connectionWaiter = this.mConnectionWaiterPool;
        if (connectionWaiter != null) {
            this.mConnectionWaiterPool = connectionWaiter.mNext;
            connectionWaiter.mNext = null;
        } else {
            connectionWaiter = new ConnectionWaiter();
        }
        connectionWaiter.mThread = thread;
        connectionWaiter.mStartTime = j2;
        connectionWaiter.mPriority = i;
        connectionWaiter.mWantPrimaryConnection = z;
        connectionWaiter.mSql = str;
        connectionWaiter.mConnectionFlags = i2;
        return connectionWaiter;
    }

    public static SQLiteConnectionPool open(SQLiteDatabaseConfiguration sQLiteDatabaseConfiguration) {
        if (sQLiteDatabaseConfiguration == null) {
            throw new IllegalArgumentException("configuration must not be null.");
        }
        SQLiteConnectionPool sQLiteConnectionPool = new SQLiteConnectionPool(sQLiteDatabaseConfiguration);
        sQLiteConnectionPool.open();
        return sQLiteConnectionPool;
    }

    private SQLiteConnection openConnectionLocked(SQLiteDatabaseConfiguration sQLiteDatabaseConfiguration, boolean z) {
        int i = this.mNextConnectionId;
        this.mNextConnectionId = i + 1;
        return SQLiteConnection.open(this, sQLiteDatabaseConfiguration, i, z);
    }

    private void reconfigureAllConnectionsLocked() {
        SQLiteConnection sQLiteConnection = this.mAvailablePrimaryConnection;
        if (sQLiteConnection != null) {
            try {
                sQLiteConnection.reconfigure(this.mConfiguration);
            } catch (RuntimeException e2) {
                Logger.e(TAG, "Failed to reconfigure available primary connection, closing it: " + this.mAvailablePrimaryConnection, e2);
                closeConnectionAndLogExceptionsLocked(this.mAvailablePrimaryConnection);
                this.mAvailablePrimaryConnection = null;
            }
        }
        int size = this.mAvailableNonPrimaryConnections.size();
        int i = 0;
        while (i < size) {
            SQLiteConnection sQLiteConnection2 = this.mAvailableNonPrimaryConnections.get(i);
            try {
                sQLiteConnection2.reconfigure(this.mConfiguration);
            } catch (RuntimeException e3) {
                Logger.e(TAG, "Failed to reconfigure available non-primary connection, closing it: " + sQLiteConnection2, e3);
                closeConnectionAndLogExceptionsLocked(sQLiteConnection2);
                this.mAvailableNonPrimaryConnections.remove(i);
                size += -1;
                i--;
            }
            i++;
        }
        markAcquiredConnectionsLocked(AcquiredConnectionStatus.RECONFIGURE);
    }

    private boolean recycleConnectionLocked(SQLiteConnection sQLiteConnection, AcquiredConnectionStatus acquiredConnectionStatus) {
        if (acquiredConnectionStatus == AcquiredConnectionStatus.RECONFIGURE) {
            try {
                sQLiteConnection.reconfigure(this.mConfiguration);
            } catch (RuntimeException e2) {
                Logger.e(TAG, "Failed to reconfigure released connection, closing it: " + sQLiteConnection, e2);
                acquiredConnectionStatus = AcquiredConnectionStatus.DISCARD;
            }
        }
        if (acquiredConnectionStatus != AcquiredConnectionStatus.DISCARD) {
            return true;
        }
        closeConnectionAndLogExceptionsLocked(sQLiteConnection);
        return false;
    }

    private void recycleConnectionWaiterLocked(ConnectionWaiter connectionWaiter) {
        connectionWaiter.mNext = this.mConnectionWaiterPool;
        connectionWaiter.mThread = null;
        connectionWaiter.mSql = null;
        connectionWaiter.mAssignedConnection = null;
        connectionWaiter.mException = null;
        connectionWaiter.mNonce++;
        this.mConnectionWaiterPool = connectionWaiter;
    }

    private void setMaxConnectionPoolSizeLocked() {
        if ((this.mConfiguration.openFlags & 536870912) != 0) {
            this.mMaxConnectionPoolSize = SQLiteGlobal.getWALConnectionPoolSize();
        } else {
            this.mMaxConnectionPoolSize = 1;
        }
    }

    private void throwIfClosedLocked() {
        if (!this.mIsOpen) {
            throw new IllegalStateException("Cannot perform this operation because the connection pool has been closed.");
        }
    }

    private SQLiteConnection tryAcquireNonPrimaryConnectionLocked(String str, int i) {
        int size = this.mAvailableNonPrimaryConnections.size();
        if (size > 1 && str != null) {
            for (int i2 = 0; i2 < size; i2++) {
                SQLiteConnection sQLiteConnection = this.mAvailableNonPrimaryConnections.get(i2);
                if (sQLiteConnection.isPreparedStatementInCache(str)) {
                    this.mAvailableNonPrimaryConnections.remove(i2);
                    finishAcquireConnectionLocked(sQLiteConnection, i);
                    return sQLiteConnection;
                }
            }
        }
        if (size > 0) {
            SQLiteConnection sQLiteConnectionRemove = this.mAvailableNonPrimaryConnections.remove(size - 1);
            finishAcquireConnectionLocked(sQLiteConnectionRemove, i);
            return sQLiteConnectionRemove;
        }
        int size2 = this.mAcquiredConnections.size();
        if (this.mAvailablePrimaryConnection != null) {
            size2++;
        }
        if (size2 >= this.mMaxConnectionPoolSize) {
            return null;
        }
        SQLiteConnection sQLiteConnectionOpenConnectionLocked = openConnectionLocked(this.mConfiguration, false);
        finishAcquireConnectionLocked(sQLiteConnectionOpenConnectionLocked, i);
        return sQLiteConnectionOpenConnectionLocked;
    }

    private SQLiteConnection tryAcquirePrimaryConnectionLocked(int i) {
        SQLiteConnection sQLiteConnection = this.mAvailablePrimaryConnection;
        if (sQLiteConnection != null) {
            this.mAvailablePrimaryConnection = null;
            finishAcquireConnectionLocked(sQLiteConnection, i);
            return sQLiteConnection;
        }
        Iterator<SQLiteConnection> it = this.mAcquiredConnections.keySet().iterator();
        while (it.hasNext()) {
            if (it.next().isPrimaryConnection()) {
                return null;
            }
        }
        SQLiteConnection sQLiteConnectionOpenConnectionLocked = openConnectionLocked(this.mConfiguration, true);
        finishAcquireConnectionLocked(sQLiteConnectionOpenConnectionLocked, i);
        return sQLiteConnectionOpenConnectionLocked;
    }

    /* JADX WARN: Code duplicated, block: B:65:0x00ca  */
    private SQLiteConnection waitForConnection(String str, int i, CancellationSignal cancellationSignal) {
        SQLiteConnection sQLiteConnection;
        RuntimeException runtimeException;
        SQLiteConnection sQLiteConnectionTryAcquireNonPrimaryConnectionLocked;
        SQLiteConnection sQLiteConnectionTryAcquirePrimaryConnectionLocked;
        boolean z = (i & 2) != 0;
        synchronized (this.mLock) {
            throwIfClosedLocked();
            if (cancellationSignal != null) {
                cancellationSignal.throwIfCanceled();
            }
            if (((this.mAvailablePrimaryConnection != null && this.mAvailableNonPrimaryConnections.isEmpty()) || z) && (sQLiteConnectionTryAcquirePrimaryConnectionLocked = tryAcquirePrimaryConnectionLocked(i)) != null) {
                return sQLiteConnectionTryAcquirePrimaryConnectionLocked;
            }
            if (!z && (sQLiteConnectionTryAcquireNonPrimaryConnectionLocked = tryAcquireNonPrimaryConnectionLocked(str, i)) != null) {
                return sQLiteConnectionTryAcquireNonPrimaryConnectionLocked;
            }
            int priority = getPriority(i);
            final ConnectionWaiter connectionWaiterObtainConnectionWaiterLocked = obtainConnectionWaiterLocked(Thread.currentThread(), SystemClock.uptimeMillis(), priority, z, str, i);
            ConnectionWaiter connectionWaiter = null;
            for (ConnectionWaiter connectionWaiter2 = this.mConnectionWaiterQueue; connectionWaiter2 != null; connectionWaiter2 = connectionWaiter2.mNext) {
                if (priority > connectionWaiter2.mPriority) {
                    connectionWaiterObtainConnectionWaiterLocked.mNext = connectionWaiter2;
                    break;
                }
                connectionWaiter = connectionWaiter2;
            }
            if (connectionWaiter != null) {
                connectionWaiter.mNext = connectionWaiterObtainConnectionWaiterLocked;
            } else {
                this.mConnectionWaiterQueue = connectionWaiterObtainConnectionWaiterLocked;
            }
            final int i2 = connectionWaiterObtainConnectionWaiterLocked.mNonce;
            if (cancellationSignal != null) {
                cancellationSignal.setOnCancelListener(new CancellationSignal.OnCancelListener() { // from class: net.zetetic.database.sqlcipher.SQLiteConnectionPool.1
                    @Override // android.os.CancellationSignal.OnCancelListener
                    public void onCancel() {
                        synchronized (SQLiteConnectionPool.this.mLock) {
                            ConnectionWaiter connectionWaiter3 = connectionWaiterObtainConnectionWaiterLocked;
                            if (connectionWaiter3.mNonce == i2) {
                                SQLiteConnectionPool.this.cancelConnectionWaiterLocked(connectionWaiter3);
                            }
                        }
                    }
                });
            }
            try {
                long j2 = connectionWaiterObtainConnectionWaiterLocked.mStartTime + 30000;
                long j3 = 30000;
                while (true) {
                    if (this.mConnectionLeaked.compareAndSet(true, false)) {
                        synchronized (this.mLock) {
                            wakeConnectionWaitersLocked();
                        }
                    }
                    LockSupport.parkNanos(this, j3 * 1000000);
                    Thread.interrupted();
                    synchronized (this.mLock) {
                        throwIfClosedLocked();
                        sQLiteConnection = connectionWaiterObtainConnectionWaiterLocked.mAssignedConnection;
                        runtimeException = connectionWaiterObtainConnectionWaiterLocked.mException;
                        if (sQLiteConnection != null || runtimeException != null) {
                            break;
                            break;
                        }
                        long jUptimeMillis = SystemClock.uptimeMillis();
                        if (jUptimeMillis < j2) {
                            j3 = jUptimeMillis - j2;
                        } else {
                            logConnectionPoolBusyLocked(jUptimeMillis - connectionWaiterObtainConnectionWaiterLocked.mStartTime, i);
                            j2 = jUptimeMillis + 30000;
                            j3 = 30000;
                        }
                    }
                    if (cancellationSignal != null) {
                        cancellationSignal.setOnCancelListener(null);
                    }
                    return sQLiteConnection;
                }
                recycleConnectionWaiterLocked(connectionWaiterObtainConnectionWaiterLocked);
                if (sQLiteConnection == null) {
                    throw runtimeException;
                }
                if (cancellationSignal != null) {
                    cancellationSignal.setOnCancelListener(null);
                }
                return sQLiteConnection;
            } catch (Throwable th) {
                if (cancellationSignal != null) {
                    cancellationSignal.setOnCancelListener(null);
                }
                throw th;
            }
        }
    }

    private void wakeConnectionWaitersLocked() {
        SQLiteConnection sQLiteConnectionTryAcquirePrimaryConnectionLocked;
        ConnectionWaiter connectionWaiter = this.mConnectionWaiterQueue;
        ConnectionWaiter connectionWaiter2 = null;
        boolean z = false;
        boolean z2 = false;
        while (connectionWaiter != null) {
            boolean z3 = true;
            if (this.mIsOpen) {
                try {
                    if (connectionWaiter.mWantPrimaryConnection || z) {
                        sQLiteConnectionTryAcquirePrimaryConnectionLocked = null;
                    } else {
                        sQLiteConnectionTryAcquirePrimaryConnectionLocked = tryAcquireNonPrimaryConnectionLocked(connectionWaiter.mSql, connectionWaiter.mConnectionFlags);
                        if (sQLiteConnectionTryAcquirePrimaryConnectionLocked == null) {
                            z = true;
                        }
                    }
                    if (sQLiteConnectionTryAcquirePrimaryConnectionLocked == null && !z2 && (sQLiteConnectionTryAcquirePrimaryConnectionLocked = tryAcquirePrimaryConnectionLocked(connectionWaiter.mConnectionFlags)) == null) {
                        z2 = true;
                    }
                    if (sQLiteConnectionTryAcquirePrimaryConnectionLocked != null) {
                        connectionWaiter.mAssignedConnection = sQLiteConnectionTryAcquirePrimaryConnectionLocked;
                    } else if (z && z2) {
                        return;
                    } else {
                        z3 = false;
                    }
                } catch (RuntimeException e2) {
                    connectionWaiter.mException = e2;
                }
            }
            ConnectionWaiter connectionWaiter3 = connectionWaiter.mNext;
            if (z3) {
                if (connectionWaiter2 != null) {
                    connectionWaiter2.mNext = connectionWaiter3;
                } else {
                    this.mConnectionWaiterQueue = connectionWaiter3;
                }
                connectionWaiter.mNext = null;
                LockSupport.unpark(connectionWaiter.mThread);
            } else {
                connectionWaiter2 = connectionWaiter;
            }
            connectionWaiter = connectionWaiter3;
        }
    }

    public SQLiteConnection acquireConnection(String str, int i, CancellationSignal cancellationSignal) {
        return waitForConnection(str, i, cancellationSignal);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        dispose(false);
    }

    public void collectDbStats(ArrayList<SQLiteDebug.DbStats> arrayList) {
        synchronized (this.mLock) {
            SQLiteConnection sQLiteConnection = this.mAvailablePrimaryConnection;
            if (sQLiteConnection != null) {
                sQLiteConnection.collectDbStats(arrayList);
            }
            Iterator<SQLiteConnection> it = this.mAvailableNonPrimaryConnections.iterator();
            while (it.hasNext()) {
                it.next().collectDbStats(arrayList);
            }
            Iterator<SQLiteConnection> it2 = this.mAcquiredConnections.keySet().iterator();
            while (it2.hasNext()) {
                it2.next().collectDbStatsUnsafe(arrayList);
            }
        }
    }

    public void dump(Printer printer, boolean z) {
        synchronized (this.mLock) {
            printer.println("Connection pool for " + this.mConfiguration.path + ":");
            StringBuilder sb = new StringBuilder();
            sb.append("  Open: ");
            sb.append(this.mIsOpen);
            printer.println(sb.toString());
            printer.println("  Max connections: " + this.mMaxConnectionPoolSize);
            printer.println("  Available primary connection:");
            SQLiteConnection sQLiteConnection = this.mAvailablePrimaryConnection;
            if (sQLiteConnection != null) {
                sQLiteConnection.dump(printer, z);
            } else {
                printer.println("<none>");
            }
            printer.println("  Available non-primary connections:");
            int i = 0;
            if (this.mAvailableNonPrimaryConnections.isEmpty()) {
                printer.println("<none>");
            } else {
                int size = this.mAvailableNonPrimaryConnections.size();
                for (int i2 = 0; i2 < size; i2++) {
                    this.mAvailableNonPrimaryConnections.get(i2).dump(printer, z);
                }
            }
            printer.println("  Acquired connections:");
            if (this.mAcquiredConnections.isEmpty()) {
                printer.println("<none>");
            } else {
                for (Map.Entry<SQLiteConnection, AcquiredConnectionStatus> entry : this.mAcquiredConnections.entrySet()) {
                    entry.getKey().dumpUnsafe(printer, z);
                    printer.println("  Status: " + entry.getValue());
                }
            }
            printer.println("  Connection waiters:");
            if (this.mConnectionWaiterQueue != null) {
                long jUptimeMillis = SystemClock.uptimeMillis();
                ConnectionWaiter connectionWaiter = this.mConnectionWaiterQueue;
                while (connectionWaiter != null) {
                    printer.println(i + ": waited for " + ((jUptimeMillis - connectionWaiter.mStartTime) * 0.001f) + " ms - thread=" + connectionWaiter.mThread + ", priority=" + connectionWaiter.mPriority + ", sql='" + connectionWaiter.mSql + "'");
                    connectionWaiter = connectionWaiter.mNext;
                    i++;
                }
            } else {
                printer.println("<none>");
            }
        }
    }

    public void enableLocalizedCollators() {
        SQLiteConnection sQLiteConnection;
        synchronized (this.mLock) {
            if (!this.mAcquiredConnections.isEmpty() || (sQLiteConnection = this.mAvailablePrimaryConnection) == null) {
                throw new IllegalStateException("Cannot enable localized collators while database is in use");
            }
            sQLiteConnection.enableLocalizedCollators();
        }
    }

    public void finalize() throws Throwable {
        try {
            dispose(true);
        } finally {
            super.finalize();
        }
    }

    public void onConnectionLeaked() {
        Logger.w(TAG, "A SQLiteConnection object for database '" + this.mConfiguration.label + "' was leaked!  Please fix your application to end transactions in progress properly and to close the database when it is no longer needed.");
        this.mConnectionLeaked.set(true);
    }

    public void reconfigure(SQLiteDatabaseConfiguration sQLiteDatabaseConfiguration) {
        if (sQLiteDatabaseConfiguration == null) {
            throw new IllegalArgumentException("configuration must not be null.");
        }
        synchronized (this.mLock) {
            throwIfClosedLocked();
            boolean z = ((sQLiteDatabaseConfiguration.openFlags ^ this.mConfiguration.openFlags) & 536870912) != 0;
            if (z) {
                if (!this.mAcquiredConnections.isEmpty()) {
                    throw new IllegalStateException("Write Ahead Logging (WAL) mode cannot be enabled or disabled while there are transactions in progress.  Finish all transactions and release all active database connections first.");
                }
                closeAvailableNonPrimaryConnectionsAndLogExceptionsLocked();
            }
            if ((sQLiteDatabaseConfiguration.foreignKeyConstraintsEnabled != this.mConfiguration.foreignKeyConstraintsEnabled) && !this.mAcquiredConnections.isEmpty()) {
                throw new IllegalStateException("Foreign Key Constraints cannot be enabled or disabled while there are transactions in progress.  Finish all transactions and release all active database connections first.");
            }
            if (!Arrays.equals(sQLiteDatabaseConfiguration.password, this.mConfiguration.password)) {
                this.mAvailablePrimaryConnection.changePassword(sQLiteDatabaseConfiguration.password);
                this.mConfiguration.updateParametersFrom(sQLiteDatabaseConfiguration);
                closeAvailableNonPrimaryConnectionsAndLogExceptionsLocked();
                reconfigureAllConnectionsLocked();
            }
            SQLiteDatabaseConfiguration sQLiteDatabaseConfiguration2 = this.mConfiguration;
            if (sQLiteDatabaseConfiguration2.openFlags != sQLiteDatabaseConfiguration.openFlags) {
                if (z) {
                    closeAvailableConnectionsAndLogExceptionsLocked();
                }
                SQLiteConnection sQLiteConnectionOpenConnectionLocked = openConnectionLocked(sQLiteDatabaseConfiguration, true);
                closeAvailableConnectionsAndLogExceptionsLocked();
                discardAcquiredConnectionsLocked();
                this.mAvailablePrimaryConnection = sQLiteConnectionOpenConnectionLocked;
                this.mConfiguration.updateParametersFrom(sQLiteDatabaseConfiguration);
                setMaxConnectionPoolSizeLocked();
            } else {
                sQLiteDatabaseConfiguration2.updateParametersFrom(sQLiteDatabaseConfiguration);
                setMaxConnectionPoolSizeLocked();
                closeExcessConnectionsAndLogExceptionsLocked();
                reconfigureAllConnectionsLocked();
            }
            wakeConnectionWaitersLocked();
        }
    }

    public void releaseConnection(SQLiteConnection sQLiteConnection) {
        synchronized (this.mLock) {
            AcquiredConnectionStatus acquiredConnectionStatusRemove = this.mAcquiredConnections.remove(sQLiteConnection);
            if (acquiredConnectionStatusRemove == null) {
                throw new IllegalStateException("Cannot perform this operation because the specified connection was not acquired from this pool or has already been released.");
            }
            if (!this.mIsOpen) {
                closeConnectionAndLogExceptionsLocked(sQLiteConnection);
            } else if (sQLiteConnection.isPrimaryConnection()) {
                if (recycleConnectionLocked(sQLiteConnection, acquiredConnectionStatusRemove)) {
                    this.mAvailablePrimaryConnection = sQLiteConnection;
                }
                wakeConnectionWaitersLocked();
            } else if (this.mAvailableNonPrimaryConnections.size() >= this.mMaxConnectionPoolSize - 1) {
                closeConnectionAndLogExceptionsLocked(sQLiteConnection);
            } else {
                if (recycleConnectionLocked(sQLiteConnection, acquiredConnectionStatusRemove)) {
                    this.mAvailableNonPrimaryConnections.add(sQLiteConnection);
                }
                wakeConnectionWaitersLocked();
            }
        }
    }

    public boolean shouldYieldConnection(SQLiteConnection sQLiteConnection, int i) {
        synchronized (this.mLock) {
            if (!this.mAcquiredConnections.containsKey(sQLiteConnection)) {
                throw new IllegalStateException("Cannot perform this operation because the specified connection was not acquired from this pool or has already been released.");
            }
            if (!this.mIsOpen) {
                return false;
            }
            return isSessionBlockingImportantConnectionWaitersLocked(sQLiteConnection.isPrimaryConnection(), i);
        }
    }

    public String toString() {
        return "SQLiteConnectionPool: " + this.mConfiguration.path;
    }

    private void open() {
        this.mAvailablePrimaryConnection = openConnectionLocked(this.mConfiguration, true);
        this.mIsOpen = true;
        this.mCloseGuard.open("close");
    }
}
