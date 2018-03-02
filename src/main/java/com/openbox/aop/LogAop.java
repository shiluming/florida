package com.openbox.aop;

/**
 * 描述:
 *
 * @author: luming.shi   Created on 18/3/2.
 */
public class LogAop {

    /**
     * 1. 前置通知
     * 2. 异常返回通知
     * 3. 正常返回通知
     * 4. 返回通知
     * 5. 环绕通知
     */

    public void before() {
        System.out.println("#### before");
    }

    public void afterExceptionReturn() {
        System.out.println("#### After Exception return");
    }

    public void afterInReturn() {
        System.out.println("#### After In Return");
    }

    public void afterReturn() {
        System.out.println("#### After Return");
    }

    public void cyclicReturn() {
        System.out.println("#### Cyclic");
    }
}
