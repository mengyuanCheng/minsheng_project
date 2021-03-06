package com.grgbanking.ct.greendao;

import java.util.Map;

import org.greenrobot.greendao.AbstractDao;
import org.greenrobot.greendao.AbstractDaoSession;
import org.greenrobot.greendao.database.Database;
import org.greenrobot.greendao.identityscope.IdentityScopeType;
import org.greenrobot.greendao.internal.DaoConfig;

import com.grgbanking.ct.entity.BankPX;
import com.grgbanking.ct.entity.BankTaskQR;
import com.grgbanking.ct.entity.QRString;

import com.grgbanking.ct.greendao.BankPXDao;
import com.grgbanking.ct.greendao.BankTaskQRDao;
import com.grgbanking.ct.greendao.QRStringDao;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.

/**
 * {@inheritDoc}
 * 
 * @see org.greenrobot.greendao.AbstractDaoSession
 */
public class DaoSession extends AbstractDaoSession {

    private final DaoConfig bankPXDaoConfig;
    private final DaoConfig bankTaskQRDaoConfig;
    private final DaoConfig qRStringDaoConfig;

    private final BankPXDao bankPXDao;
    private final BankTaskQRDao bankTaskQRDao;
    private final QRStringDao qRStringDao;

    public DaoSession(Database db, IdentityScopeType type, Map<Class<? extends AbstractDao<?, ?>>, DaoConfig>
            daoConfigMap) {
        super(db);

        bankPXDaoConfig = daoConfigMap.get(BankPXDao.class).clone();
        bankPXDaoConfig.initIdentityScope(type);

        bankTaskQRDaoConfig = daoConfigMap.get(BankTaskQRDao.class).clone();
        bankTaskQRDaoConfig.initIdentityScope(type);

        qRStringDaoConfig = daoConfigMap.get(QRStringDao.class).clone();
        qRStringDaoConfig.initIdentityScope(type);

        bankPXDao = new BankPXDao(bankPXDaoConfig, this);
        bankTaskQRDao = new BankTaskQRDao(bankTaskQRDaoConfig, this);
        qRStringDao = new QRStringDao(qRStringDaoConfig, this);

        registerDao(BankPX.class, bankPXDao);
        registerDao(BankTaskQR.class, bankTaskQRDao);
        registerDao(QRString.class, qRStringDao);
    }
    
    public void clear() {
        bankPXDaoConfig.clearIdentityScope();
        bankTaskQRDaoConfig.clearIdentityScope();
        qRStringDaoConfig.clearIdentityScope();
    }

    public BankPXDao getBankPXDao() {
        return bankPXDao;
    }

    public BankTaskQRDao getBankTaskQRDao() {
        return bankTaskQRDao;
    }

    public QRStringDao getQRStringDao() {
        return qRStringDao;
    }

}
