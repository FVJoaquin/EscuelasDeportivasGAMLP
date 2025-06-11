/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mavenproject1;

import java.io.FileOutputStream;
import java.io.*;

public class AddObjectOutputStream extends ObjectOutputStream {
    public AddObjectOutputStream(OutputStream out) throws IOException {
        super(out);
    }
    protected void writeStreamHeader() throws IOException {
        this.reset();
    }
}
