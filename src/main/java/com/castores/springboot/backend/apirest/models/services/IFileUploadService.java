package com.castores.springboot.backend.apirest.models.services;

import java.io.IOException;
import org.springframework.web.multipart.MultipartFile;
import java.net.MalformedURLException;
import java.nio.file.Path;

import org.springframework.core.io.Resource;

public interface IFileUploadService {
	public Resource cargar(String nombreFoto) throws MalformedURLException;

	public String copiar(MultipartFile archivo) throws IOException;
	
	public boolean eliminar(String nombreFoto);
	
	public Path getPath(String nombreFoto);
}
