package com.example.Files;

import java.io.BufferedOutputStream;
import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class DataOutputStreamExample {
    public static void main(String[] args)
            throws IOException {

        DataOutputStream out = null;

        try {
            out = new DataOutputStream(
                    new BufferedOutputStream(
                        new FileOutputStream("files\\test.dat")
                    ));
            out.writeUTF("Testowy strumień binarny");
            out.writeShort(32000);
            out.writeLong(123423547645432234L);
            out.writeFloat(23.58f);
            out.writeDouble(123423235.12342d);
            out.writeByte(12);
            out.writeChar('A');

            out.flush(); //wymuszenie zapisu z bufora

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (out != null) out.close();
        }
    }
}
