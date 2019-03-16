plugins { 
  java
  eclipse
}

allprojects {
   group = "it.discovery"
}

subprojects {  
   apply(plugin = "java")

   java.sourceCompatibility = JavaVersion.VERSION_11
   java.targetCompatibility = JavaVersion.VERSION_11

   repositories {
     jcenter()
   }
   
   dependencies {
        runtime("javax.xml.bind:jaxb-api:2.3.0")
        runtime("javax.annotation:javax.annotation-api:1.3.1")
        compileOnly("org.projectlombok:lombok:1.18.6")
        annotationProcessor("org.projectlombok:lombok:1.18.6")
   } 
}

