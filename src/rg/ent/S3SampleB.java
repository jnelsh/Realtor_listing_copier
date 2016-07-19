package rg.ent;
//import java.awt.image.BufferedImage;


/*
 * Copyright 2010-2015 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 *
 *  http://aws.amazon.com/apache2.0
 *
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
//import java.io.BufferedOutputStream;
//import java.io.BufferedReader;
//import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileOutputStream;
//import java.io.File;
//import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
//import java.io.InputStreamReader;
//import java.io.OutputStream;
//import java.io.OutputStreamWriter;
//import java.io.Writer;
import java.net.MalformedURLException;
import java.net.URL;
//import java.util.UUID;
import java.util.List;

//import org.apache.commons.io.IOUtils;

import com.amazonaws.AmazonClientException;
import com.amazonaws.AmazonServiceException;
import com.amazonaws.auth.AWSCredentials;
import com.amazonaws.auth.profile.ProfileCredentialsProvider;
//import com.amazonaws.regions.Region;
//import com.amazonaws.regions.Regions;
import com.amazonaws.services.s3.AmazonS3;
import com.amazonaws.services.s3.AmazonS3Client;
//import com.amazonaws.services.s3.model.Bucket;
import com.amazonaws.services.s3.model.CannedAccessControlList;
import com.amazonaws.services.s3.model.CopyObjectRequest;
import com.amazonaws.services.s3.model.ObjectListing;
//import com.amazonaws.services.s3.model.GetObjectRequest;
//import com.amazonaws.services.s3.model.ListObjectsRequest;
//import com.amazonaws.services.s3.model.ObjectListing;
//import com.amazonaws.services.s3.model.ObjectMetadata;
import com.amazonaws.services.s3.model.PutObjectRequest;
//import com.amazonaws.services.s3.model.S3Object;
//import com.amazonaws.services.s3.model.S3ObjectSummary;
/*
 * 
create table flat_image(
	id serial PRIMARY KEY NOT NULL, 
	remote_uri character varying(256) NOT NULL default '',
	l_listingid integer,
	l_objectid integer,
	host_domain character varying(256) not null default '',
	host_folder character varying(256) not null default '', 
	l_uniqueid character varying(100) not null default '',
	big_path character varying(256) not null default '',
	eight_hundred_path character varying(256) not null default '',
	six_forty_path character varying(256) not null default '',
	three_twenty_path character varying(256) not null default '',
	one_sixty_path character varying(256) not null default '',
	tokeep boolean default 'true'
	)
 * 
 * 
 * 
 * 
 */
import com.amazonaws.services.s3.model.S3ObjectSummary;



/**
 * This sample demonstrates how to make basic requests to Amazon S3 using the
 * AWS SDK for Java.
 * <p>
 * <b>Prerequisites:</b> You must have a valid Amazon Web Services developer
 * account, and be signed up to use Amazon S3. For more information on Amazon
 * S3, see http://aws.amazon.com/s3.
 * <p>
 * Fill in your AWS access credentials in the provided credentials file
 * template, and be sure to move the file to the default location
 * (/Users/john/.aws/credentials) where the sample code will load the credentials from.
 * <p>
 * <b>WARNING:</b> To avoid accidental leakage of your credentials, DO NOT keep
 * the credentials file in your source directory.
 *
 * http://aws.amazon.com/security-credentials
 */
public class S3SampleB {
	

	public static void main(String[] args){
		//String s = "http://cdnparap130.paragonrels.com/ParagonImages/Property/p13/BCRES/262083191/0/0/0/addb52077ba7fe8c3ede731c7ca5d05c/16/ce586718db1859924540f445532de1c8/262083191.JPG";
		//CopyImage(s,1,1);
		//String s ="262099918-10.JPG";
		//try {
		//	deleteFileOnS3(s);
		//} catch (IOException e) {
		//	e.printStackTrace();
		//}
		//RunShellCleanup("/home/ec2-user/tmp_images/",args[0]);
		//RunShellCleanup("/Users/john/amazon-web-serv",args[0]);
		copyFileBtweenBuckets();
	}
	

	/*public static void CopyImage(String address, int listingid, int objectid){
		java.net.URL url = null;
		try {
			url = new java.net.URL(address);
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
		try {
			
			String directory_a ="/Users/john/Desktop/re_img";
			String directory_b = "/home/ec2-user/tmp_images";	
			String local_path = null;
			
			File theDir = new File(directory_a);
			if (theDir.exists()){
				local_path = directory_a;
				
			}else if(!theDir.exists()){
				theDir = new File(directory_b);
				if(theDir.exists()){
					local_path=directory_b;	
				}
			}

			String file_name = url.getPath();
			file_name= file_name.substring(file_name.lastIndexOf("/")+1);
			
			copyImageFile(local_path,url, file_name);
			RunShellCommand(local_path,file_name);
				
			rg.PostgresConnector.saveFlatImages(
					"https://s3-us-west-2.amazonaws.com",
					"royaltygroupimages",
					 listingid, 
					 objectid, 
					 "640_"+file_name, 
					 "320_"+file_name,
					 "160_"+file_name);
				
			//Thread.sleep(1000);
			saveFileToS3(file_name, local_path);
			//Thread.sleep(1000);
			//RunShellCleanup(local_path,file_name);
		
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	*/
	/*
	public static void RunShellCleanup(String local_path, String file_name){
		String command = local_path+"/do_clear.sh "+file_name;
		executeCommand(command);
	}
	*/
	/*
	public static void RunShellCommand(String local_path, String file_name){
		String command = local_path+"/do_sixforty.sh "+file_name;
		executeCommand(command);
	}
	*/
	/*private static String executeCommand(String command) {
		StringBuffer output = new StringBuffer();
		Process p = null;
		try {
			p = Runtime.getRuntime().exec(command);
			p.waitFor();		
			BufferedReader reader =  new BufferedReader(new InputStreamReader(p.getInputStream()));
            String line = "";			
			while ((line = reader.readLine())!= null) {
				output.append(line + "\n");
			}
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("what happened "+p.exitValue());			
		}
		return output.toString();
	}
	*/
	
	public static void copyFileBtweenBuckets(){
		
		AWSCredentials credentials = null;
        try {
            credentials = new ProfileCredentialsProvider("default").getCredentials();    
        } catch (Exception e) {
            throw new AmazonClientException(
                    "Cannot load the credentials from the credential profiles file. " +
                    "Please make sure that your credentials file is at the correct " +
                    "location (/Users/john/.aws/credentials), and is in valid format.",
                    e);
        }
        
        String file_name= "640_262098533.JPG";
        String source_bucket="royaltygroupimages";
        String dest_bucket="royaltygroupupload";
        
        AmazonS3 s3 = new AmazonS3Client(credentials);
        CopyObjectRequest cor = new CopyObjectRequest(source_bucket, file_name, dest_bucket, file_name);
        s3.copyObject(cor);
        s3.setObjectAcl(dest_bucket, file_name, CannedAccessControlList.PublicRead);
		
		//S3Object[] filteredObjects = s3Service.listObjects("sourceBucket", "appData/", null);
		//for(S3Object object: filteredObjects ){
		//    s3Service.copyObject("sourceBucket", "newAppData/" + object.getKey().substring(object.getKey().indexOf("/"), "destBucket", object, false);
		//}
	}
	
	
	
/*
	public static void saveFileToS3(String file_name, String local_path) throws IOException {
     //   System.out.println("saveFileToS3");
		AWSCredentials credentials = null;
        try {
            credentials = new ProfileCredentialsProvider("default").getCredentials();    
        } catch (Exception e) {
            throw new AmazonClientException(
                    "Cannot load the credentials from the credential profiles file. " +
                    "Please make sure that your credentials file is at the correct " +
                    "location (/Users/john/.aws/credentials), and is in valid format.",
                    e);
        }
        AmazonS3 s3 = new AmazonS3Client(credentials);
        String bucketName = "royaltygroupimages";
       
        try {    
            PutObjectRequest putObj =  new PutObjectRequest(bucketName, "640_"+file_name, createFile(local_path+"/640_"+file_name));
        	putObj.setCannedAcl(CannedAccessControlList.PublicRead);
            s3.putObject(putObj);
            putObj =  new PutObjectRequest(bucketName, "320_"+file_name, createFile(local_path+"/320_"+file_name));
        	putObj.setCannedAcl(CannedAccessControlList.PublicRead);
            s3.putObject(putObj);
            putObj =  new PutObjectRequest(bucketName, "160_"+file_name, createFile(local_path+"/160_"+file_name));        	
            putObj.setCannedAcl(CannedAccessControlList.PublicRead);
            s3.putObject(putObj);
            
        } catch (AmazonServiceException ase) {
            System.out.println("Caught an AmazonServiceException, which means your request made it "
                    + "to Amazon S3, but was rejected with an error response for some reason.");
            System.out.println("Error Message:    " + ase.getMessage());
            System.out.println("HTTP Status Code: " + ase.getStatusCode());
            System.out.println("AWS Error Code:   " + ase.getErrorCode());
            System.out.println("Error Type:       " + ase.getErrorType());
            System.out.println("Request ID:       " + ase.getRequestId());
        } catch (AmazonClientException ace) {
            System.out.println("Caught an AmazonClientException, which means the client encountered "
                    + "a serious internal problem while trying to communicate with S3, "
                    + "such as not being able to access the network.");
            System.out.println("Error Message: " + ace.getMessage());
        }
    }
	
	*/
	/*
	public static void deleteFileOnS3(String file_name) throws IOException {
	     	System.out.println("deleteFileOnS3");
			AWSCredentials credentials = null;
	        try {
	            credentials = new ProfileCredentialsProvider("default").getCredentials();    
	        } catch (Exception e) {
	            throw new AmazonClientException(
	                    "Cannot load the credentials from the credential profiles file. " +
	                    "Please make sure that your credentials file is at the correct " +
	                    "location (/Users/john/.aws/credentials), and is in valid format.",
	                    e);
	        }
	        AmazonS3 s3 = new AmazonS3Client(credentials);
	        String bucketName = "royaltygroupimages";
	        try {    
	        	s3.deleteObject(bucketName, "640_"+file_name);
	            s3.deleteObject(bucketName, "320_"+file_name); 
	            s3.deleteObject(bucketName, "160_"+file_name);
	        } catch (AmazonServiceException ase) {
	            System.out.println("Caught an AmazonServiceException, which means your request made it to Amazon S3, but was rejected with an error response for some reason.");
	            System.out.println("Error Message:    " + ase.getMessage());
	            System.out.println("HTTP Status Code: " + ase.getStatusCode());
	            System.out.println("AWS Error Code:   " + ase.getErrorCode());
	            System.out.println("Error Type:       " + ase.getErrorType());
	            System.out.println("Request ID:       " + ase.getRequestId());
	        } catch (AmazonClientException ace) {
	            System.out.println("Caught an AmazonClientException, which means the client encountered a serious internal problem while trying to communicate with S3, such as not being able to access the network.");
	            System.out.println("Error Message: " + ace.getMessage());
	        }
	    }
		
	*/
	
	
	
	
	
	
	
	
	
	
	
	
	/*public static void invetoryS3() throws IOException {
     	System.out.println("deleteFileOnS3");
		AWSCredentials credentials = null;
        try {
            credentials = new ProfileCredentialsProvider("default").getCredentials();    
        } catch (Exception e) {
            throw new AmazonClientException(
                    "Cannot load the credentials from the credential profiles file. " +
                    "Please make sure that your credentials file is at the correct " +
                    "location (/Users/john/.aws/credentials), and is in valid format.",
                    e);
        }
        AmazonS3 s3 = new AmazonS3Client(credentials);
        String bucketName = "royaltygroupimages";
        FileNameCollator fnc = new FileNameCollator();
        try {    
        	  ObjectListing list = s3.listObjects(bucketName);   //, contentKeyPrefix);
        	  
        	  java.util.ArrayList<String> file_names = null;  
        	  do {                

        	        List<com.amazonaws.services.s3.model.S3ObjectSummary> summaries = list.getObjectSummaries();
        	        file_names = new java.util.ArrayList();
        	        for (S3ObjectSummary summary : summaries) {

        	            String summaryKey = summary.getKey();               
        	            file_names.add(summaryKey);
        	            // Retrieve object 

        	            // Process it 

        	        }
        	        //System.out.println("size "+file_names.size());
        	        fnc.parseLotsOfFiles(file_names);
        	        
        	        
        	        list = s3.listNextBatchOfObjects(list);

        	    }while (list.isTruncated());
        	  
        	    //System.out.println("finally size "+file_names.size());
        	    fnc.parseLotsOfFiles(file_names);
        } catch (AmazonServiceException ase) {
            System.out.println("Caught an AmazonServiceException, which means your request made it to Amazon S3, but was rejected with an error response for some reason.");
            System.out.println("Error Message:    " + ase.getMessage());
            System.out.println("HTTP Status Code: " + ase.getStatusCode());
            System.out.println("AWS Error Code:   " + ase.getErrorCode());
            System.out.println("Error Type:       " + ase.getErrorType());
            System.out.println("Request ID:       " + ase.getRequestId());
        } catch (AmazonClientException ace) {
            System.out.println("Caught an AmazonClientException, which means the client encountered a serious internal problem while trying to communicate with S3, such as not being able to access the network.");
            System.out.println("Error Message: " + ace.getMessage());
        }
    }
	*/
	
	/*private void parseList(java.util.ArrayList<String> files){
		
		if(files.size()>100){
			
		}else if(files.size()<=100){
			
		}
		
		
	}
	*/
	
	
	
	
	
	
	
/*
	public static void copyImageFile(String local_path,URL url, String file_name){	
		try{
			InputStream in = new BufferedInputStream(url.openStream());			
			OutputStream out = new BufferedOutputStream(new FileOutputStream(local_path+"/"+file_name));
			for ( int i; (i = in.read()) != -1; ) {		out.write(i);			}
			in.close();
			out.close();
		}catch(java.io.IOException e){
			System.out.println("CopyImageFile "+e);
		}
	}
	*/

	/*private static File createFile(String path) throws IOException {
    	File f = new File(path);
    	return f;
    }
*/
}
