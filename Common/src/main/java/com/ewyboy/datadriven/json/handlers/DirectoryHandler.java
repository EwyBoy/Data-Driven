package com.ewyboy.datadriven.json.handlers;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class DirectoryHandler {

    private static void createDirectory(Path directoryPath) {
        try {
            Files.createDirectory(directoryPath);
        } catch (IOException alreadyExistsException){
            alreadyExistsException.printStackTrace();
        }
    }

}
