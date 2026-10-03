package com.heytap.databaseengine;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import com.heytap.databaseengine.callback.ICommonListener;
import com.heytap.databaseengine.callback.IDataOperateListener;
import com.heytap.databaseengine.callback.IDataReadResultListener;
import com.heytap.databaseengine.model.AccountInfo;
import com.heytap.databaseengine.model.SpaceInfo;
import com.heytap.databaseengine.model.UserGoalInfo;
import com.heytap.databaseengine.model.UserInfo;
import com.heytap.databaseengine.model.UserPreference;
import com.heytap.databaseengine.option.DataDeleteOption;
import com.heytap.databaseengine.option.DataInsertOption;
import com.heytap.databaseengine.option.DataReadOptionV2;
import com.heytap.databaseengine.option.DataSyncOption;
import java.util.List;

/* JADX INFO: loaded from: classes14.dex */
public interface IHealthManager extends IInterface {
    public static final String DESCRIPTOR = "com.heytap.databaseengine.IHealthManager";

    public static class Default implements IHealthManager {
        @Override // android.os.IInterface
        public IBinder asBinder() {
            return null;
        }

        @Override // com.heytap.databaseengine.IHealthManager
        public void clearFriendData(String str, int i) throws RemoteException {
        }

        @Override // com.heytap.databaseengine.IHealthManager
        public void deleteSpaceInfo(IDataOperateListener iDataOperateListener) throws RemoteException {
        }

        @Override // com.heytap.databaseengine.IHealthManager
        public void deleteSportHealthData(DataDeleteOption dataDeleteOption, IDataOperateListener iDataOperateListener) throws RemoteException {
        }

        @Override // com.heytap.databaseengine.IHealthManager
        public void deleteTrackTemp(String str, IDataOperateListener iDataOperateListener) throws RemoteException {
        }

        @Override // com.heytap.databaseengine.IHealthManager
        public void deleteUserDbData(String str, ICommonListener iCommonListener) throws RemoteException {
        }

        @Override // com.heytap.databaseengine.IHealthManager
        public void getMaxModifiedTimestamp(String str, long j2, long j3, int i, IDataOperateListener iDataOperateListener) throws RemoteException {
        }

        @Override // com.heytap.databaseengine.IHealthManager
        public void getUserMultipleSettings(String str, Bundle bundle, ICommonListener iCommonListener) throws RemoteException {
        }

        @Override // com.heytap.databaseengine.IHealthManager
        public void getUserPreference(String str, String str2, ICommonListener iCommonListener) throws RemoteException {
        }

        @Override // com.heytap.databaseengine.IHealthManager
        public void getUserPreferenceNew(String str, String str2, String str3, boolean z, ICommonListener iCommonListener) throws RemoteException {
        }

        @Override // com.heytap.databaseengine.IHealthManager
        public void insertFitData(DataInsertOption dataInsertOption, IDataOperateListener iDataOperateListener) throws RemoteException {
        }

        @Override // com.heytap.databaseengine.IHealthManager
        public void insertOrUpdateSpaceInfo(String str, String str2, List<SpaceInfo> list, IDataOperateListener iDataOperateListener) throws RemoteException {
        }

        @Override // com.heytap.databaseengine.IHealthManager
        public void insertSpaceInfo(List<SpaceInfo> list, IDataOperateListener iDataOperateListener) throws RemoteException {
        }

        @Override // com.heytap.databaseengine.IHealthManager
        public void insertSportHealthData(DataInsertOption dataInsertOption, IDataOperateListener iDataOperateListener) throws RemoteException {
        }

        @Override // com.heytap.databaseengine.IHealthManager
        public void insertTrackTemp(DataInsertOption dataInsertOption, IDataOperateListener iDataOperateListener) throws RemoteException {
        }

        @Override // com.heytap.databaseengine.IHealthManager
        public void insertUserGoalInfo(List<UserGoalInfo> list, IDataOperateListener iDataOperateListener) throws RemoteException {
        }

        @Override // com.heytap.databaseengine.IHealthManager
        public void insertUserInfo(UserInfo userInfo, IDataOperateListener iDataOperateListener) throws RemoteException {
        }

        @Override // com.heytap.databaseengine.IHealthManager
        public void login(AccountInfo accountInfo, ICommonListener iCommonListener) throws RemoteException {
        }

        @Override // com.heytap.databaseengine.IHealthManager
        public void logout(AccountInfo accountInfo, ICommonListener iCommonListener) throws RemoteException {
        }

        @Override // com.heytap.databaseengine.IHealthManager
        public void onDeviceConnectChanged(int i) throws RemoteException {
        }

        @Override // com.heytap.databaseengine.IHealthManager
        public void querySpaceByPageCode(String str, String str2, ICommonListener iCommonListener) throws RemoteException {
        }

        @Override // com.heytap.databaseengine.IHealthManager
        public void readSportHealthData(DataReadOptionV2 dataReadOptionV2, IDataReadResultListener iDataReadResultListener) throws RemoteException {
        }

        @Override // com.heytap.databaseengine.IHealthManager
        public void readTrackTemp(String str, IDataReadResultListener iDataReadResultListener) throws RemoteException {
        }

        @Override // com.heytap.databaseengine.IHealthManager
        public void readUserGoalInfo(String str, int i, ICommonListener iCommonListener) throws RemoteException {
        }

        @Override // com.heytap.databaseengine.IHealthManager
        public void readUserInfo(String str, ICommonListener iCommonListener) throws RemoteException {
        }

        @Override // com.heytap.databaseengine.IHealthManager
        public void setUserPreference(UserPreference userPreference, boolean z, IDataOperateListener iDataOperateListener) throws RemoteException {
        }

        @Override // com.heytap.databaseengine.IHealthManager
        public void synCloud(DataSyncOption dataSyncOption, ICommonListener iCommonListener) throws RemoteException {
        }

        @Override // com.heytap.databaseengine.IHealthManager
        public void syncFriendData(String str, long j2, long j3, int i) throws RemoteException {
        }
    }

    public static abstract class Stub extends Binder implements IHealthManager {
        static final int TRANSACTION_clearFriendData = 23;
        static final int TRANSACTION_deleteSpaceInfo = 19;
        static final int TRANSACTION_deleteSportHealthData = 2;
        static final int TRANSACTION_deleteTrackTemp = 14;
        static final int TRANSACTION_deleteUserDbData = 26;
        static final int TRANSACTION_getMaxModifiedTimestamp = 22;
        static final int TRANSACTION_getUserMultipleSettings = 27;
        static final int TRANSACTION_getUserPreference = 12;
        static final int TRANSACTION_getUserPreferenceNew = 25;
        static final int TRANSACTION_insertFitData = 16;
        static final int TRANSACTION_insertOrUpdateSpaceInfo = 21;
        static final int TRANSACTION_insertSpaceInfo = 18;
        static final int TRANSACTION_insertSportHealthData = 1;
        static final int TRANSACTION_insertTrackTemp = 13;
        static final int TRANSACTION_insertUserGoalInfo = 9;
        static final int TRANSACTION_insertUserInfo = 4;
        static final int TRANSACTION_login = 6;
        static final int TRANSACTION_logout = 7;
        static final int TRANSACTION_onDeviceConnectChanged = 17;
        static final int TRANSACTION_querySpaceByPageCode = 20;
        static final int TRANSACTION_readSportHealthData = 3;
        static final int TRANSACTION_readTrackTemp = 15;
        static final int TRANSACTION_readUserGoalInfo = 10;
        static final int TRANSACTION_readUserInfo = 5;
        static final int TRANSACTION_setUserPreference = 11;
        static final int TRANSACTION_synCloud = 8;
        static final int TRANSACTION_syncFriendData = 24;

        public static class Proxy implements IHealthManager {
            private IBinder mRemote;

            public Proxy(IBinder iBinder) {
                this.mRemote = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.mRemote;
            }

            @Override // com.heytap.databaseengine.IHealthManager
            public void clearFriendData(String str, int i) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IHealthManager.DESCRIPTOR);
                    parcelObtain.writeString(str);
                    parcelObtain.writeInt(i);
                    this.mRemote.transact(23, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.heytap.databaseengine.IHealthManager
            public void deleteSpaceInfo(IDataOperateListener iDataOperateListener) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IHealthManager.DESCRIPTOR);
                    parcelObtain.writeStrongInterface(iDataOperateListener);
                    this.mRemote.transact(19, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.heytap.databaseengine.IHealthManager
            public void deleteSportHealthData(DataDeleteOption dataDeleteOption, IDataOperateListener iDataOperateListener) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IHealthManager.DESCRIPTOR);
                    a.f(parcelObtain, dataDeleteOption, 0);
                    parcelObtain.writeStrongInterface(iDataOperateListener);
                    this.mRemote.transact(2, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.heytap.databaseengine.IHealthManager
            public void deleteTrackTemp(String str, IDataOperateListener iDataOperateListener) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IHealthManager.DESCRIPTOR);
                    parcelObtain.writeString(str);
                    parcelObtain.writeStrongInterface(iDataOperateListener);
                    this.mRemote.transact(14, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.heytap.databaseengine.IHealthManager
            public void deleteUserDbData(String str, ICommonListener iCommonListener) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IHealthManager.DESCRIPTOR);
                    parcelObtain.writeString(str);
                    parcelObtain.writeStrongInterface(iCommonListener);
                    this.mRemote.transact(26, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            public String getInterfaceDescriptor() {
                return IHealthManager.DESCRIPTOR;
            }

            @Override // com.heytap.databaseengine.IHealthManager
            public void getMaxModifiedTimestamp(String str, long j2, long j3, int i, IDataOperateListener iDataOperateListener) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IHealthManager.DESCRIPTOR);
                    parcelObtain.writeString(str);
                    parcelObtain.writeLong(j2);
                    parcelObtain.writeLong(j3);
                    parcelObtain.writeInt(i);
                    parcelObtain.writeStrongInterface(iDataOperateListener);
                    this.mRemote.transact(22, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.heytap.databaseengine.IHealthManager
            public void getUserMultipleSettings(String str, Bundle bundle, ICommonListener iCommonListener) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IHealthManager.DESCRIPTOR);
                    parcelObtain.writeString(str);
                    a.f(parcelObtain, bundle, 0);
                    parcelObtain.writeStrongInterface(iCommonListener);
                    this.mRemote.transact(27, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.heytap.databaseengine.IHealthManager
            public void getUserPreference(String str, String str2, ICommonListener iCommonListener) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IHealthManager.DESCRIPTOR);
                    parcelObtain.writeString(str);
                    parcelObtain.writeString(str2);
                    parcelObtain.writeStrongInterface(iCommonListener);
                    this.mRemote.transact(12, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.heytap.databaseengine.IHealthManager
            public void getUserPreferenceNew(String str, String str2, String str3, boolean z, ICommonListener iCommonListener) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IHealthManager.DESCRIPTOR);
                    parcelObtain.writeString(str);
                    parcelObtain.writeString(str2);
                    parcelObtain.writeString(str3);
                    parcelObtain.writeInt(z ? 1 : 0);
                    parcelObtain.writeStrongInterface(iCommonListener);
                    this.mRemote.transact(25, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.heytap.databaseengine.IHealthManager
            public void insertFitData(DataInsertOption dataInsertOption, IDataOperateListener iDataOperateListener) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IHealthManager.DESCRIPTOR);
                    a.f(parcelObtain, dataInsertOption, 0);
                    parcelObtain.writeStrongInterface(iDataOperateListener);
                    this.mRemote.transact(16, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.heytap.databaseengine.IHealthManager
            public void insertOrUpdateSpaceInfo(String str, String str2, List<SpaceInfo> list, IDataOperateListener iDataOperateListener) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IHealthManager.DESCRIPTOR);
                    parcelObtain.writeString(str);
                    parcelObtain.writeString(str2);
                    a.e(parcelObtain, list, 0);
                    parcelObtain.writeStrongInterface(iDataOperateListener);
                    this.mRemote.transact(21, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.heytap.databaseengine.IHealthManager
            public void insertSpaceInfo(List<SpaceInfo> list, IDataOperateListener iDataOperateListener) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IHealthManager.DESCRIPTOR);
                    a.e(parcelObtain, list, 0);
                    parcelObtain.writeStrongInterface(iDataOperateListener);
                    this.mRemote.transact(18, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.heytap.databaseengine.IHealthManager
            public void insertSportHealthData(DataInsertOption dataInsertOption, IDataOperateListener iDataOperateListener) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IHealthManager.DESCRIPTOR);
                    a.f(parcelObtain, dataInsertOption, 0);
                    parcelObtain.writeStrongInterface(iDataOperateListener);
                    this.mRemote.transact(1, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.heytap.databaseengine.IHealthManager
            public void insertTrackTemp(DataInsertOption dataInsertOption, IDataOperateListener iDataOperateListener) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IHealthManager.DESCRIPTOR);
                    a.f(parcelObtain, dataInsertOption, 0);
                    parcelObtain.writeStrongInterface(iDataOperateListener);
                    this.mRemote.transact(13, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.heytap.databaseengine.IHealthManager
            public void insertUserGoalInfo(List<UserGoalInfo> list, IDataOperateListener iDataOperateListener) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IHealthManager.DESCRIPTOR);
                    a.e(parcelObtain, list, 0);
                    parcelObtain.writeStrongInterface(iDataOperateListener);
                    this.mRemote.transact(9, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.heytap.databaseengine.IHealthManager
            public void insertUserInfo(UserInfo userInfo, IDataOperateListener iDataOperateListener) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IHealthManager.DESCRIPTOR);
                    a.f(parcelObtain, userInfo, 0);
                    parcelObtain.writeStrongInterface(iDataOperateListener);
                    this.mRemote.transact(4, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.heytap.databaseengine.IHealthManager
            public void login(AccountInfo accountInfo, ICommonListener iCommonListener) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IHealthManager.DESCRIPTOR);
                    a.f(parcelObtain, accountInfo, 0);
                    parcelObtain.writeStrongInterface(iCommonListener);
                    this.mRemote.transact(6, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.heytap.databaseengine.IHealthManager
            public void logout(AccountInfo accountInfo, ICommonListener iCommonListener) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IHealthManager.DESCRIPTOR);
                    a.f(parcelObtain, accountInfo, 0);
                    parcelObtain.writeStrongInterface(iCommonListener);
                    this.mRemote.transact(7, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.heytap.databaseengine.IHealthManager
            public void onDeviceConnectChanged(int i) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IHealthManager.DESCRIPTOR);
                    parcelObtain.writeInt(i);
                    this.mRemote.transact(17, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.heytap.databaseengine.IHealthManager
            public void querySpaceByPageCode(String str, String str2, ICommonListener iCommonListener) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IHealthManager.DESCRIPTOR);
                    parcelObtain.writeString(str);
                    parcelObtain.writeString(str2);
                    parcelObtain.writeStrongInterface(iCommonListener);
                    this.mRemote.transact(20, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.heytap.databaseengine.IHealthManager
            public void readSportHealthData(DataReadOptionV2 dataReadOptionV2, IDataReadResultListener iDataReadResultListener) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IHealthManager.DESCRIPTOR);
                    a.f(parcelObtain, dataReadOptionV2, 0);
                    parcelObtain.writeStrongInterface(iDataReadResultListener);
                    this.mRemote.transact(3, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.heytap.databaseengine.IHealthManager
            public void readTrackTemp(String str, IDataReadResultListener iDataReadResultListener) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IHealthManager.DESCRIPTOR);
                    parcelObtain.writeString(str);
                    parcelObtain.writeStrongInterface(iDataReadResultListener);
                    this.mRemote.transact(15, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.heytap.databaseengine.IHealthManager
            public void readUserGoalInfo(String str, int i, ICommonListener iCommonListener) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IHealthManager.DESCRIPTOR);
                    parcelObtain.writeString(str);
                    parcelObtain.writeInt(i);
                    parcelObtain.writeStrongInterface(iCommonListener);
                    this.mRemote.transact(10, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.heytap.databaseengine.IHealthManager
            public void readUserInfo(String str, ICommonListener iCommonListener) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IHealthManager.DESCRIPTOR);
                    parcelObtain.writeString(str);
                    parcelObtain.writeStrongInterface(iCommonListener);
                    this.mRemote.transact(5, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.heytap.databaseengine.IHealthManager
            public void setUserPreference(UserPreference userPreference, boolean z, IDataOperateListener iDataOperateListener) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IHealthManager.DESCRIPTOR);
                    a.f(parcelObtain, userPreference, 0);
                    parcelObtain.writeInt(z ? 1 : 0);
                    parcelObtain.writeStrongInterface(iDataOperateListener);
                    this.mRemote.transact(11, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.heytap.databaseengine.IHealthManager
            public void synCloud(DataSyncOption dataSyncOption, ICommonListener iCommonListener) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IHealthManager.DESCRIPTOR);
                    a.f(parcelObtain, dataSyncOption, 0);
                    parcelObtain.writeStrongInterface(iCommonListener);
                    this.mRemote.transact(8, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.heytap.databaseengine.IHealthManager
            public void syncFriendData(String str, long j2, long j3, int i) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IHealthManager.DESCRIPTOR);
                    parcelObtain.writeString(str);
                    parcelObtain.writeLong(j2);
                    parcelObtain.writeLong(j3);
                    parcelObtain.writeInt(i);
                    this.mRemote.transact(24, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }
        }

        public Stub() {
            attachInterface(this, IHealthManager.DESCRIPTOR);
        }

        public static IHealthManager asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(IHealthManager.DESCRIPTOR);
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof IHealthManager)) ? new Proxy(iBinder) : (IHealthManager) iInterfaceQueryLocalInterface;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i >= 1 && i <= 16777215) {
                parcel.enforceInterface(IHealthManager.DESCRIPTOR);
            }
            if (i == 1598968902) {
                parcel2.writeString(IHealthManager.DESCRIPTOR);
                return true;
            }
            switch (i) {
                case 1:
                    insertSportHealthData((DataInsertOption) a.d(parcel, DataInsertOption.CREATOR), IDataOperateListener.Stub.asInterface(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 2:
                    deleteSportHealthData((DataDeleteOption) a.d(parcel, DataDeleteOption.CREATOR), IDataOperateListener.Stub.asInterface(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 3:
                    readSportHealthData((DataReadOptionV2) a.d(parcel, DataReadOptionV2.INSTANCE), IDataReadResultListener.Stub.asInterface(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 4:
                    insertUserInfo((UserInfo) a.d(parcel, UserInfo.CREATOR), IDataOperateListener.Stub.asInterface(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 5:
                    readUserInfo(parcel.readString(), ICommonListener.Stub.asInterface(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 6:
                    login((AccountInfo) a.d(parcel, AccountInfo.CREATOR), ICommonListener.Stub.asInterface(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 7:
                    logout((AccountInfo) a.d(parcel, AccountInfo.CREATOR), ICommonListener.Stub.asInterface(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 8:
                    synCloud((DataSyncOption) a.d(parcel, DataSyncOption.INSTANCE), ICommonListener.Stub.asInterface(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 9:
                    insertUserGoalInfo(parcel.createTypedArrayList(UserGoalInfo.CREATOR), IDataOperateListener.Stub.asInterface(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 10:
                    readUserGoalInfo(parcel.readString(), parcel.readInt(), ICommonListener.Stub.asInterface(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 11:
                    setUserPreference((UserPreference) a.d(parcel, UserPreference.CREATOR), parcel.readInt() != 0, IDataOperateListener.Stub.asInterface(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 12:
                    getUserPreference(parcel.readString(), parcel.readString(), ICommonListener.Stub.asInterface(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 13:
                    insertTrackTemp((DataInsertOption) a.d(parcel, DataInsertOption.CREATOR), IDataOperateListener.Stub.asInterface(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 14:
                    deleteTrackTemp(parcel.readString(), IDataOperateListener.Stub.asInterface(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 15:
                    readTrackTemp(parcel.readString(), IDataReadResultListener.Stub.asInterface(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 16:
                    insertFitData((DataInsertOption) a.d(parcel, DataInsertOption.CREATOR), IDataOperateListener.Stub.asInterface(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 17:
                    onDeviceConnectChanged(parcel.readInt());
                    parcel2.writeNoException();
                    return true;
                case 18:
                    insertSpaceInfo(parcel.createTypedArrayList(SpaceInfo.CREATOR), IDataOperateListener.Stub.asInterface(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 19:
                    deleteSpaceInfo(IDataOperateListener.Stub.asInterface(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 20:
                    querySpaceByPageCode(parcel.readString(), parcel.readString(), ICommonListener.Stub.asInterface(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 21:
                    insertOrUpdateSpaceInfo(parcel.readString(), parcel.readString(), parcel.createTypedArrayList(SpaceInfo.CREATOR), IDataOperateListener.Stub.asInterface(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 22:
                    getMaxModifiedTimestamp(parcel.readString(), parcel.readLong(), parcel.readLong(), parcel.readInt(), IDataOperateListener.Stub.asInterface(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 23:
                    clearFriendData(parcel.readString(), parcel.readInt());
                    parcel2.writeNoException();
                    return true;
                case 24:
                    syncFriendData(parcel.readString(), parcel.readLong(), parcel.readLong(), parcel.readInt());
                    parcel2.writeNoException();
                    return true;
                case 25:
                    getUserPreferenceNew(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() != 0, ICommonListener.Stub.asInterface(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 26:
                    deleteUserDbData(parcel.readString(), ICommonListener.Stub.asInterface(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 27:
                    getUserMultipleSettings(parcel.readString(), (Bundle) a.d(parcel, Bundle.CREATOR), ICommonListener.Stub.asInterface(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                default:
                    return super.onTransact(i, parcel, parcel2, i2);
            }
        }
    }

    public static class a {
        public static <T> T d(Parcel parcel, Parcelable.Creator<T> creator) {
            if (parcel.readInt() != 0) {
                return creator.createFromParcel(parcel);
            }
            return null;
        }

        public static <T extends Parcelable> void e(Parcel parcel, List<T> list, int i) {
            if (list == null) {
                parcel.writeInt(-1);
                return;
            }
            int size = list.size();
            parcel.writeInt(size);
            for (int i2 = 0; i2 < size; i2++) {
                f(parcel, list.get(i2), i);
            }
        }

        public static <T extends Parcelable> void f(Parcel parcel, T t, int i) {
            if (t == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                t.writeToParcel(parcel, i);
            }
        }
    }

    void clearFriendData(String str, int i) throws RemoteException;

    void deleteSpaceInfo(IDataOperateListener iDataOperateListener) throws RemoteException;

    void deleteSportHealthData(DataDeleteOption dataDeleteOption, IDataOperateListener iDataOperateListener) throws RemoteException;

    void deleteTrackTemp(String str, IDataOperateListener iDataOperateListener) throws RemoteException;

    void deleteUserDbData(String str, ICommonListener iCommonListener) throws RemoteException;

    void getMaxModifiedTimestamp(String str, long j2, long j3, int i, IDataOperateListener iDataOperateListener) throws RemoteException;

    void getUserMultipleSettings(String str, Bundle bundle, ICommonListener iCommonListener) throws RemoteException;

    void getUserPreference(String str, String str2, ICommonListener iCommonListener) throws RemoteException;

    void getUserPreferenceNew(String str, String str2, String str3, boolean z, ICommonListener iCommonListener) throws RemoteException;

    void insertFitData(DataInsertOption dataInsertOption, IDataOperateListener iDataOperateListener) throws RemoteException;

    void insertOrUpdateSpaceInfo(String str, String str2, List<SpaceInfo> list, IDataOperateListener iDataOperateListener) throws RemoteException;

    void insertSpaceInfo(List<SpaceInfo> list, IDataOperateListener iDataOperateListener) throws RemoteException;

    void insertSportHealthData(DataInsertOption dataInsertOption, IDataOperateListener iDataOperateListener) throws RemoteException;

    void insertTrackTemp(DataInsertOption dataInsertOption, IDataOperateListener iDataOperateListener) throws RemoteException;

    void insertUserGoalInfo(List<UserGoalInfo> list, IDataOperateListener iDataOperateListener) throws RemoteException;

    void insertUserInfo(UserInfo userInfo, IDataOperateListener iDataOperateListener) throws RemoteException;

    void login(AccountInfo accountInfo, ICommonListener iCommonListener) throws RemoteException;

    void logout(AccountInfo accountInfo, ICommonListener iCommonListener) throws RemoteException;

    void onDeviceConnectChanged(int i) throws RemoteException;

    void querySpaceByPageCode(String str, String str2, ICommonListener iCommonListener) throws RemoteException;

    void readSportHealthData(DataReadOptionV2 dataReadOptionV2, IDataReadResultListener iDataReadResultListener) throws RemoteException;

    void readTrackTemp(String str, IDataReadResultListener iDataReadResultListener) throws RemoteException;

    void readUserGoalInfo(String str, int i, ICommonListener iCommonListener) throws RemoteException;

    void readUserInfo(String str, ICommonListener iCommonListener) throws RemoteException;

    void setUserPreference(UserPreference userPreference, boolean z, IDataOperateListener iDataOperateListener) throws RemoteException;

    void synCloud(DataSyncOption dataSyncOption, ICommonListener iCommonListener) throws RemoteException;

    void syncFriendData(String str, long j2, long j3, int i) throws RemoteException;
}
