package com.curso.cuartasesion;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class PrincipalArchivos {
    public static void main(String[] args) {
        Path dir = Paths.get("C:/Users/jugui/OneDrive/Escritorio");
//        try {
//            Files.createDirectory(dir.resolve("NuevaCarpeta"));
//            System.out.println("Carpeta creada");
//        } catch (IOException e) {
//           System.out.println("Error al crear la carpeta");
//        }
//
//
//        try {
//            Files.createFile(dir.resolve("archivo.txt"));
//        } catch (IOException e) {
//            e.printStackTrace();
//        }

//        try {
//            Files.copy(dir.resolve("archivo.txt"),dir.resolve("carpetaDos//archivoCopia.txt"));
//        } catch (IOException e) {
//            e.printStackTrace();
//        }

        try {
            Files.move(dir.resolve("archivo.txt"),dir.resolve("carpetaDos//archivo.txt"));
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
