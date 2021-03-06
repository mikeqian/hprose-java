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
 * State.java                                             *
 *                                                        *
 * State enum for Java.                                   *
 *                                                        *
 * LastModified: Apr 15, 2016                             *
 * Author: Ma Bingyao <andot@hprose.com>                  *
 *                                                        *
\**********************************************************/
package hprose.util.concurrent;

/**
 * 等待，结束，失败
 */
public enum State {
    PENDING, FULFILLED, REJECTED
}
