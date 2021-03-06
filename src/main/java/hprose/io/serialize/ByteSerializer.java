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
 * ByteSerializer.java                                    *
 *                                                        *
 * byte serializer class for Java.                        *
 *                                                        *
 * LastModified: Apr 17, 2016                             *
 * Author: Ma Bingyao <andot@hprose.com>                  *
 *                                                        *
\**********************************************************/

package hprose.io.serialize;

import java.io.IOException;

final class ByteSerializer implements Serializer<Byte> {

    public final static ByteSerializer instance = new ByteSerializer();

    public final void write(Writer writer, Byte obj) throws IOException {
        ValueWriter.write(writer.stream, obj);
    }
}
