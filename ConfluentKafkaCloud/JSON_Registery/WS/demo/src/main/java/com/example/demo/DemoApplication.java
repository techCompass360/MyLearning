package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.util.ResourceUtils;

/******************************************************************************/
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;  
import java.net.MalformedURLException;  
import java.net.URL;
import java.nio.file.Files;

import org.jsonschema2pojo.DefaultGenerationConfig;  
import org.jsonschema2pojo.GenerationConfig;  
import org.jsonschema2pojo.Jackson2Annotator;  
import org.jsonschema2pojo.SchemaGenerator;  
import org.jsonschema2pojo.SchemaMapper;  
import org.jsonschema2pojo.SchemaStore;  
import org.jsonschema2pojo.SourceType;  
import org.jsonschema2pojo.rules.RuleFactory;  
import com.sun.codemodel.JCodeModel;  

/*****************************************************************************/

//https://docs.confluent.io/platform/current/schema-registry/serdes-develop/serdes-json.html
//https://www.jsonschema2pojo.org/
//Stream:: https://www.baeldung.com/java-kafka-streams

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) throws IOException {
		SpringApplication.run(DemoApplication.class, args);
		
		//KafkaJsonDeserializerConfig.JSON_VALUE_TYPE, User.class.getName()
		
		System.out.println(User.class.getName());
		
		
		/*
		 * File file = ResourceUtils.getFile("classpath:User.json");
		 * 
		 * System.out.println("File Found : " + file.exists());
		 * 
		 * String content = new String(Files.readAllBytes(file.toPath()));
		 * System.out.println(content);
		 * 
		 * 
		 * String packageName="com.cooltrickshome"; // File inputJson= new
		 * File("."+File.separator+"input.json"); File inputJson =
		 * ResourceUtils.getFile("classpath:User.json"); File outputPojoDirectory=new
		 * File("."+File.separator+"convertedPojo"); outputPojoDirectory.mkdirs(); try {
		 * convert2JSON(inputJson.toURI().toURL(), outputPojoDirectory, packageName,
		 * inputJson.getName().replace(".json", "")); } catch (IOException e) { // TODO
		 * Auto-generated catch block
		 * System.out.println("Encountered issue while converting to pojo: "+e.
		 * getMessage()); e.printStackTrace(); }
		 */
		
		
		
		
	}
	
	
	
	 public static void convert2JSON(URL inputJson, File outputPojoDirectory, String packageName, String className) throws IOException{  
         JCodeModel codeModel = new JCodeModel();  
         URL source = inputJson;  
         GenerationConfig config = new DefaultGenerationConfig() {  
         @Override  
         public boolean isGenerateBuilders() { // set config option by overriding method  
         return true;  
         }  
         public SourceType getSourceType(){  
     return SourceType.JSON;  
   }  
         };  
         SchemaMapper mapper = new SchemaMapper(new RuleFactory(config, new Jackson2Annotator(config), new SchemaStore()), new SchemaGenerator());  
         mapper.generate(codeModel, className, packageName, source);  
         codeModel.build(outputPojoDirectory);  
    }  

	
	
	
	

}
          
	  
