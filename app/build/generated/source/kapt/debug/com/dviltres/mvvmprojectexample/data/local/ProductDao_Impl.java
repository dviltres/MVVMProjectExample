package com.dviltres.mvvmprojectexample.data.local;

import android.database.Cursor;
import android.os.CancellationSignal;
import androidx.room.CoroutinesRoom;
import androidx.room.EntityDeletionOrUpdateAdapter;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.sqlite.db.SupportSQLiteStatement;
import com.dviltres.mvvmprojectexample.data.local.entity.ProductEntity;
import java.lang.Class;
import java.lang.Exception;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Callable;
import javax.annotation.processing.Generated;
import kotlin.Unit;
import kotlin.coroutines.Continuation;

@Generated("androidx.room.RoomProcessor")
@SuppressWarnings({"unchecked", "deprecation"})
public final class ProductDao_Impl implements ProductDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter<ProductEntity> __insertionAdapterOfProductEntity;

  private final EntityDeletionOrUpdateAdapter<ProductEntity> __deletionAdapterOfProductEntity;

  private final EntityDeletionOrUpdateAdapter<ProductEntity> __updateAdapterOfProductEntity;

  public ProductDao_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfProductEntity = new EntityInsertionAdapter<ProductEntity>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR REPLACE INTO `product_table` (`productCode`,`name`,`imageUrl`,`caloriesPer100g`,`carbsPer100g`,`proteinPer100g`,`fatPer100g`,`isFavorite`) VALUES (?,?,?,?,?,?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, ProductEntity value) {
        if (value.getProductCode() == null) {
          stmt.bindNull(1);
        } else {
          stmt.bindString(1, value.getProductCode());
        }
        if (value.getName() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getName());
        }
        if (value.getImageUrl() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getImageUrl());
        }
        stmt.bindLong(4, value.getCaloriesPer100g());
        stmt.bindLong(5, value.getCarbsPer100g());
        stmt.bindLong(6, value.getProteinPer100g());
        stmt.bindLong(7, value.getFatPer100g());
        final int _tmp = value.isFavorite() ? 1 : 0;
        stmt.bindLong(8, _tmp);
      }
    };
    this.__deletionAdapterOfProductEntity = new EntityDeletionOrUpdateAdapter<ProductEntity>(__db) {
      @Override
      public String createQuery() {
        return "DELETE FROM `product_table` WHERE `productCode` = ?";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, ProductEntity value) {
        if (value.getProductCode() == null) {
          stmt.bindNull(1);
        } else {
          stmt.bindString(1, value.getProductCode());
        }
      }
    };
    this.__updateAdapterOfProductEntity = new EntityDeletionOrUpdateAdapter<ProductEntity>(__db) {
      @Override
      public String createQuery() {
        return "UPDATE OR REPLACE `product_table` SET `productCode` = ?,`name` = ?,`imageUrl` = ?,`caloriesPer100g` = ?,`carbsPer100g` = ?,`proteinPer100g` = ?,`fatPer100g` = ?,`isFavorite` = ? WHERE `productCode` = ?";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, ProductEntity value) {
        if (value.getProductCode() == null) {
          stmt.bindNull(1);
        } else {
          stmt.bindString(1, value.getProductCode());
        }
        if (value.getName() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getName());
        }
        if (value.getImageUrl() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getImageUrl());
        }
        stmt.bindLong(4, value.getCaloriesPer100g());
        stmt.bindLong(5, value.getCarbsPer100g());
        stmt.bindLong(6, value.getProteinPer100g());
        stmt.bindLong(7, value.getFatPer100g());
        final int _tmp = value.isFavorite() ? 1 : 0;
        stmt.bindLong(8, _tmp);
        if (value.getProductCode() == null) {
          stmt.bindNull(9);
        } else {
          stmt.bindString(9, value.getProductCode());
        }
      }
    };
  }

  @Override
  public Object insertProduct(final ProductEntity productEntity,
      final Continuation<? super Unit> continuation) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        __db.beginTransaction();
        try {
          __insertionAdapterOfProductEntity.insert(productEntity);
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
        }
      }
    }, continuation);
  }

  @Override
  public Object deleteProduct(final ProductEntity productEntity,
      final Continuation<? super Unit> continuation) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        __db.beginTransaction();
        try {
          __deletionAdapterOfProductEntity.handle(productEntity);
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
        }
      }
    }, continuation);
  }

  @Override
  public Object updateProduct(final ProductEntity productEntity,
      final Continuation<? super Unit> continuation) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        __db.beginTransaction();
        try {
          __updateAdapterOfProductEntity.handle(productEntity);
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
        }
      }
    }, continuation);
  }

  @Override
  public Object getProductByCode(final String productCode,
      final Continuation<? super ProductEntity> continuation) {
    final String _sql = "SELECT * FROM PRODUCT_TABLE WHERE productCode =?";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    if (productCode == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, productCode);
    }
    final CancellationSignal _cancellationSignal = DBUtil.createCancellationSignal();
    return CoroutinesRoom.execute(__db, false, _cancellationSignal, new Callable<ProductEntity>() {
      @Override
      public ProductEntity call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfProductCode = CursorUtil.getColumnIndexOrThrow(_cursor, "productCode");
          final int _cursorIndexOfName = CursorUtil.getColumnIndexOrThrow(_cursor, "name");
          final int _cursorIndexOfImageUrl = CursorUtil.getColumnIndexOrThrow(_cursor, "imageUrl");
          final int _cursorIndexOfCaloriesPer100g = CursorUtil.getColumnIndexOrThrow(_cursor, "caloriesPer100g");
          final int _cursorIndexOfCarbsPer100g = CursorUtil.getColumnIndexOrThrow(_cursor, "carbsPer100g");
          final int _cursorIndexOfProteinPer100g = CursorUtil.getColumnIndexOrThrow(_cursor, "proteinPer100g");
          final int _cursorIndexOfFatPer100g = CursorUtil.getColumnIndexOrThrow(_cursor, "fatPer100g");
          final int _cursorIndexOfIsFavorite = CursorUtil.getColumnIndexOrThrow(_cursor, "isFavorite");
          final ProductEntity _result;
          if(_cursor.moveToFirst()) {
            final String _tmpProductCode;
            if (_cursor.isNull(_cursorIndexOfProductCode)) {
              _tmpProductCode = null;
            } else {
              _tmpProductCode = _cursor.getString(_cursorIndexOfProductCode);
            }
            final String _tmpName;
            if (_cursor.isNull(_cursorIndexOfName)) {
              _tmpName = null;
            } else {
              _tmpName = _cursor.getString(_cursorIndexOfName);
            }
            final String _tmpImageUrl;
            if (_cursor.isNull(_cursorIndexOfImageUrl)) {
              _tmpImageUrl = null;
            } else {
              _tmpImageUrl = _cursor.getString(_cursorIndexOfImageUrl);
            }
            final int _tmpCaloriesPer100g;
            _tmpCaloriesPer100g = _cursor.getInt(_cursorIndexOfCaloriesPer100g);
            final int _tmpCarbsPer100g;
            _tmpCarbsPer100g = _cursor.getInt(_cursorIndexOfCarbsPer100g);
            final int _tmpProteinPer100g;
            _tmpProteinPer100g = _cursor.getInt(_cursorIndexOfProteinPer100g);
            final int _tmpFatPer100g;
            _tmpFatPer100g = _cursor.getInt(_cursorIndexOfFatPer100g);
            final boolean _tmpIsFavorite;
            final int _tmp;
            _tmp = _cursor.getInt(_cursorIndexOfIsFavorite);
            _tmpIsFavorite = _tmp != 0;
            _result = new ProductEntity(_tmpProductCode,_tmpName,_tmpImageUrl,_tmpCaloriesPer100g,_tmpCarbsPer100g,_tmpProteinPer100g,_tmpFatPer100g,_tmpIsFavorite);
          } else {
            _result = null;
          }
          return _result;
        } finally {
          _cursor.close();
          _statement.release();
        }
      }
    }, continuation);
  }

  public static List<Class<?>> getRequiredConverters() {
    return Collections.emptyList();
  }
}
