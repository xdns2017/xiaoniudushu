package com.xiaoniu.cms.common.base;

import java.util.List;
import java.util.Map;

/**
 * Created by wzyoung on 2017/1/8.
 */
public interface MongoBase<T> {
    //添加
    public void insert(T object, String collectionName);

    //根据条件查找一条
    public T findOne(Map<String, Object> params, String collectionName);

    //根据条件查找所有
    public List<T> findAll(Map<String, Object> params, String collectionName);

    //查找所有
    List<T> findAll(Class<T> c, String collectionName);

    //修改
    public void update(Map<String, Object> params, String collectionName);

    //创建集合
    public void createCollection(String collectionName);

    //根据条件删除
    public void remove(Map<String, Object> params, String collectionName);

    public void dropCollection(String collectionName);
}
