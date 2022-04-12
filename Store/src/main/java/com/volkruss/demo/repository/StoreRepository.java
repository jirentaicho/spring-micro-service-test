package com.volkruss.demo.repository;

import java.util.List;

import com.volkruss.demo.entity.Store;

/*
 * ここで@Mapperをつけると、同じ階層のリソースフォルダにあるxmlファイルを読込ます
 * 今回はsqlを全てmappingフォルダに格納しているためapplication.ymlにてxmlファイルとのバインド設定を記述しています。
 * 
 * 今回はMapperScanをApplicationクラスにて付与しています。
 * これによってBeanが登録されます。
 * また@Mapperを付けた場合でもBean登録されます。
 * 
 */
public interface StoreRepository {
	List<Store> findAll();
	Store findById(int id);
}
