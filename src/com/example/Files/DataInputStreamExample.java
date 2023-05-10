package com.example.Files;

import java.io.*;

public class DataInputStreamExample {
    public static void main(String[] args)
            throws IOException {

        DataInputStream in = null;

        try {
            in = new DataInputStream(
                    new BufferedInputStream(
                            new FileInputStream("files\\test.dat")
                    ));

            //out.writeUTF("Testowy strumień binarny");
            String str = in.readUTF();
            System.out.println(str);

            //out.writeShort(32000);
            short shortNum = in.readShort();
            System.out.println(shortNum);

            //out.writeLong(123423547645432234L);
            //long longNum = in.readLong();
            //System.out.println(longNum);
            in.skipBytes(8);

            //out.writeFloat(23.58f);
            float floatNum = in.readFloat();
            System.out.println(floatNum);

            //out.writeDouble(123423235.12342d);
            double doubleNum = in.readDouble();
            System.out.println(doubleNum);

            //out.writeByte(12);
            byte byteNum = in.readByte();
            System.out.println(byteNum);

            //out.writeChar('A');
            char charSign = in.readChar();
            System.out.println(charSign);



        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (in != null) in.close();
        }
    }
}

