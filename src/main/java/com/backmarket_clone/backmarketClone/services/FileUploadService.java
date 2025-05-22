package com.backmarket_clone.backmarketClone.services;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.nio.file.*;

@Service
public class FileUploadService {

    // Directory to save files (configured in application.properties/yml or hardcoded)
    @Value("${upload.directory}")
    private String uploadDir;

    public String uploadFile(MultipartFile file) throws IOException {
        if (file.isEmpty()) {
            throw new IOException("Empty file.");
        }

        Path targetPath = Paths.get(uploadDir).resolve(file.getOriginalFilename()).normalize();

        // Create directory if it doesn't exist
        Files.createDirectories(targetPath.getParent());

        // Copy the file to the target location
        Files.copy(file.getInputStream(), targetPath, StandardCopyOption.REPLACE_EXISTING);

        return "File uploaded successfully!";
    }

    public byte[] downloadFile(String fileName) throws IOException {
        Path filePath = Paths.get(uploadDir).resolve(fileName).normalize();

        if (!Files.exists(filePath)) {
            throw new IOException("File not found: " + fileName);
        }

        return Files.readAllBytes(filePath);
    }
}
