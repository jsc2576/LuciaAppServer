package com.hiruashi.simgyuseon;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.springframework.stereotype.Component;

import com.amazonaws.auth.AWSCredentials;
import com.amazonaws.auth.AWSStaticCredentialsProvider;
import com.amazonaws.auth.BasicAWSCredentials;
import com.amazonaws.services.s3.AmazonS3;
import com.amazonaws.services.s3.AmazonS3ClientBuilder;
import com.amazonaws.services.s3.model.CannedAccessControlList;
import com.amazonaws.services.s3.model.GetObjectRequest;
import com.amazonaws.services.s3.model.ObjectMetadata;
import com.amazonaws.services.s3.model.PutObjectRequest;
import com.amazonaws.services.s3.model.S3Object;
import com.amazonaws.util.IOUtils;

@Component
public class AwsS3Config {

	String AWS_BUCKETNAME = "sim-app-img";
	String AWS_ACCESS_KEY = "AKIAIW75AHRK6ZCAEJDQ";
	String AWS_SECRET_KEY = "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";
	
	AmazonS3 s3;
	
	public AwsS3Config(){
		AWSCredentials credentials = new BasicAWSCredentials(AWS_ACCESS_KEY, AWS_SECRET_KEY);
		s3 = AmazonS3ClientBuilder.standard()
			.withRegion("ap-northeast-2")
			.withCredentials(new AWSStaticCredentialsProvider(credentials))
			.build();
	}
	
	public void Upload(String path, String filename, File file) throws IOException{
		
		//FileInputStream fileInputStream = new FileInputStream(file);
		PutObjectRequest putObjectRequest = new PutObjectRequest(AWS_BUCKETNAME, path+filename, file);
		putObjectRequest.setCannedAcl(CannedAccessControlList.PublicRead);
		s3.putObject(putObjectRequest);
		file.delete();
	}
}
