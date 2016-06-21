/**********************************************************\
|                                                          |
|                          hprose                          |
|                                                          |
| Official WebSite: http://www.hprose.com/                 |
|                   http://www.hprose.org/                 |
|                                                          |
\**********************************************************/
/**********************************************************\
 *                                                        *
 * Thenable.java                                          *
 *                                                        *
 * Thenable interface for Java.                           *
 *                                                        *
 * LastModified: Apr 10, 2016                             *
 * Author: Ma Bingyao <andot@hprose.com>                  *
 *                                                        *
\**********************************************************/
package hprose.util.concurrent;

/**
 * 包含一个then方法，一个完成时的调用，一个拒绝时的调用
 * @param <V>
 */
public interface Thenable<V> {
    Thenable<?> then(Callback<V> onfulfill, Callback<Throwable> onreject);
}
