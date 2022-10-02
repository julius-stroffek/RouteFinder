plugins {
    kotlin("jvm") version "1.7.20"
    id("org.springframework.boot") version "2.6.2"
    id("io.spring.dependency-management") version "1.0.11.RELEASE"
    application
}

group = "cz.stroffek"
version = "1.0-SNAPSHOT"

application {
    mainClass.set("cz.stroffek.routefinder.Application")
}

repositories {
    mavenLocal()
    mavenCentral()
    maven {
        url = uri("https://mvnrepository.com/artifact")
    }
}

dependencies {
    // Initial dependencies
    implementation(kotlin("stdlib-jdk8"))
    testImplementation("org.junit.jupiter:junit-jupiter-api:5.8.1")
    testRuntimeOnly("org.junit.jupiter:junit-jupiter-engine:5.8.1")

    // Spring Boot dependencies
    implementation("org.springframework.boot:spring-boot-starter")
    implementation("org.springframework.boot:spring-boot-starter-web")
    implementation("org.springframework.boot:spring-boot-starter-jdbc")
    implementation("org.springframework.data:spring-data-jdbc")
    testImplementation("org.springframework.boot:spring-boot-starter-test")
    developmentOnly("org.springframework.boot:spring-boot-devtools")

    // org.json reference JSON implementation
    implementation("org.json:json:20220924")
}


tasks.getByName<Test>("test") {
    useJUnitPlatform()
}
