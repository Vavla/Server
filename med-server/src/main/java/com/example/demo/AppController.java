package com.example.demo;
import org.springframework.beans.factory.annotation.Autowired;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import java.net.*;
import java.util.*;


@RestController
public class AppController extends HttpServlet{

@Autowired
private UserRepository userRepository;
	

 @GetMapping("user/logup")
 public List<SignFormat> getUser( String login,String password ) {
	 
	 return userRepository.findUser(login, password);
 }

 }
 
//@GetMapping("/data")
// public List<MainInfo> getUser(HttpServletRequest req, HttpServletResponse res) {
//////	 Integer id = Integer.parseInt(req.getParameter("id"));
//////	 Optional<MainInfo> user = userRepository.findById(1);
////	 userRepository.findByEmail("jbmvhk.com")
//	 return userRepository.findByEmail("jbmvhk.com");
//}
//}

/////////
//plugins {
//    id 'com.android.application'
//}
//
//android {
//    compileSdk 31
//
//    defaultConfig {
//        applicationId "com.example.itmedbook"
//        minSdk 21
//        targetSdk 32
//        versionCode 1
//        versionName "1.0"
//
//        testInstrumentationRunner "androidx.test.runner.AndroidJUnitRunner"
//    }
//
//    buildTypes {
//        release {
//            minifyEnabled false
//            proguardFiles getDefaultProguardFile('proguard-android-optimize.txt'), 'proguard-rules.pro'
//        }
//    }
//    compileOptions {
//        sourceCompatibility JavaVersion.VERSION_1_8
//        targetCompatibility JavaVersion.VERSION_1_8
//    }
//    buildFeatures {
//        viewBinding true
//    }
//}
//
//dependencies {
//    implementation'com.squareup.retrofit2:retrofit:2.9.0'
//    implementation'com.squareup.retrofit2:converter-gson:2.9.0'
//    implementation 'androidx.appcompat:appcompat:1.4.0'
//    implementation 'com.google.android.material:material:1.4.0'
//    implementation 'androidx.constraintlayout:constraintlayout:2.1.2'
//    implementation 'androidx.legacy:legacy-support-v4:1.0.0'
//    implementation 'androidx.navigation:navigation-fragment:2.3.5'
//    implementation 'androidx.navigation:navigation-ui:2.3.5'
//    implementation 'com.android.support.constraint:constraint-layout:2.0.4'
//    implementation 'com.android.support:appcompat-v7:28.0.0'
//    implementation 'androidx.lifecycle:lifecycle-livedata-ktx:2.4.1'
//    implementation 'androidx.lifecycle:lifecycle-viewmodel-ktx:2.4.1'
//    testImplementation 'junit:junit:4.+'
//    androidTestImplementation 'androidx.test.ext:junit:1.1.3'
//    androidTestImplementation 'androidx.test.espresso:espresso-core:3.4.0'
//}
