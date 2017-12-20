package com.grgbanking.ct.greendao;

import android.database.Cursor;
import android.database.sqlite.SQLiteStatement;

import org.greenrobot.greendao.AbstractDao;
import org.greenrobot.greendao.Property;
import org.greenrobot.greendao.internal.DaoConfig;
import org.greenrobot.greendao.database.Database;
import org.greenrobot.greendao.database.DatabaseStatement;

import com.grgbanking.ct.entity.BankTaskQR;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.
/** 
 * DAO for table "BANK_TASK_QR".
*/
public class BankTaskQRDao extends AbstractDao<BankTaskQR, Long> {

    public static final String TABLENAME = "BANK_TASK_QR";

    /**
     * Properties of entity BankTaskQR.<br/>
     * Can be used for QueryBuilder and for referencing column names.
     */
    public static class Properties {
        public final static Property Id = new Property(0, Long.class, "id", true, "_id");
        public final static Property BankName = new Property(1, String.class, "bankName", false, "BANK_NAME");
        public final static Property FaceValue = new Property(2, String.class, "faceValue", false, "FACE_VALUE");
        public final static Property QrCode = new Property(3, String.class, "qrCode", false, "QR_CODE");
    }


    public BankTaskQRDao(DaoConfig config) {
        super(config);
    }
    
    public BankTaskQRDao(DaoConfig config, DaoSession daoSession) {
        super(config, daoSession);
    }

    /** Creates the underlying database table. */
    public static void createTable(Database db, boolean ifNotExists) {
        String constraint = ifNotExists? "IF NOT EXISTS ": "";
        db.execSQL("CREATE TABLE " + constraint + "\"BANK_TASK_QR\" (" + //
                "\"_id\" INTEGER PRIMARY KEY AUTOINCREMENT ," + // 0: id
                "\"BANK_NAME\" TEXT NOT NULL ," + // 1: bankName
                "\"FACE_VALUE\" TEXT NOT NULL ," + // 2: faceValue
                "\"QR_CODE\" TEXT);"); // 3: qrCode
    }

    /** Drops the underlying database table. */
    public static void dropTable(Database db, boolean ifExists) {
        String sql = "DROP TABLE " + (ifExists ? "IF EXISTS " : "") + "\"BANK_TASK_QR\"";
        db.execSQL(sql);
    }

    @Override
    protected final void bindValues(DatabaseStatement stmt, BankTaskQR entity) {
        stmt.clearBindings();
 
        Long id = entity.getId();
        if (id != null) {
            stmt.bindLong(1, id);
        }
        stmt.bindString(2, entity.getBankName());
        stmt.bindString(3, entity.getFaceValue());
 
        String qrCode = entity.getQrCode();
        if (qrCode != null) {
            stmt.bindString(4, qrCode);
        }
    }

    @Override
    protected final void bindValues(SQLiteStatement stmt, BankTaskQR entity) {
        stmt.clearBindings();
 
        Long id = entity.getId();
        if (id != null) {
            stmt.bindLong(1, id);
        }
        stmt.bindString(2, entity.getBankName());
        stmt.bindString(3, entity.getFaceValue());
 
        String qrCode = entity.getQrCode();
        if (qrCode != null) {
            stmt.bindString(4, qrCode);
        }
    }

    @Override
    public Long readKey(Cursor cursor, int offset) {
        return cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0);
    }    

    @Override
    public BankTaskQR readEntity(Cursor cursor, int offset) {
        BankTaskQR entity = new BankTaskQR( //
            cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0), // id
            cursor.getString(offset + 1), // bankName
            cursor.getString(offset + 2), // faceValue
            cursor.isNull(offset + 3) ? null : cursor.getString(offset + 3) // qrCode
        );
        return entity;
    }
     
    @Override
    public void readEntity(Cursor cursor, BankTaskQR entity, int offset) {
        entity.setId(cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0));
        entity.setBankName(cursor.getString(offset + 1));
        entity.setFaceValue(cursor.getString(offset + 2));
        entity.setQrCode(cursor.isNull(offset + 3) ? null : cursor.getString(offset + 3));
     }
    
    @Override
    protected final Long updateKeyAfterInsert(BankTaskQR entity, long rowId) {
        entity.setId(rowId);
        return rowId;
    }
    
    @Override
    public Long getKey(BankTaskQR entity) {
        if(entity != null) {
            return entity.getId();
        } else {
            return null;
        }
    }

    @Override
    public boolean hasKey(BankTaskQR entity) {
        return entity.getId() != null;
    }

    @Override
    protected final boolean isEntityUpdateable() {
        return true;
    }
    
}
