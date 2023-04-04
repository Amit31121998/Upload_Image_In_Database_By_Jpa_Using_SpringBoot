package com.amit.service;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.amit.entity.User;
import com.amit.repo.UserRepository;

@Service
public class UserService {

	@Autowired
	private UserRepository userRepo;

	public void saveData() throws IOException {
		User user = new User();
		user.setUserName("saffu");
		user.setUserEmail("saffu@gmail.com");
		String path="D:\\17-JFSD\\JRTP\\KKK.JPG";
		
		FileInputStream fis=new FileInputStream(new File(path));
		long size = Files.size(Paths.get(path));
		byte [] arr=new byte[(int) size];
		fis.read(arr);
		fis.close();
		user.setUserImage(arr);
		
		userRepo.save(user);
	}

}
