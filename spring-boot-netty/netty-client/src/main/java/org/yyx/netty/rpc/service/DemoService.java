package org.yyx.netty.rpc.service;

import org.yyx.netty.entity.User;

/**
 * 测试Service
 * <p>
 * create by 叶云轩 at 2018/3/3-下午1:46
 * contact by tdg_yyx@foxmail.com
 *
 * @author 叶云轩 contact by tdg_yyx@foxmail.com
 * @date 2018/8/15 - 12:29
 */
public interface DemoService {

    /**
     * 求和方法
     *
     * @param numberA 第一个数
     * @param numberB 第二个数
     * @return 两数之和
     */
    int sum(int numberA, int numberB);

    /**
     * 打印方法
     *
     * @return 一个字符串
     */
    String print();

    /**
     * 获取用户信息
     *
     * @return 用户信息
     */
    User getUserInfo();
}
