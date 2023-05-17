package com.dviltres.mvvmprojectexample.data.local

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import androidx.room.Update
import com.dviltres.mvvmprojectexample.data.local.entity.ProductEntity

@Dao
interface ProductDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertProduct(productEntity: ProductEntity)

    @Update(onConflict = OnConflictStrategy.REPLACE)
    suspend fun updateProduct(productEntity:ProductEntity)

    @Query("SELECT * FROM PRODUCT_TABLE WHERE productCode =:productCode")
    suspend fun getProductByCode(productCode: String): ProductEntity?

    @Delete
    suspend fun deleteProduct(productEntity: ProductEntity)
}