import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

val kotlinVersion = "1.5.10"

plugins {
    val kotlinVersion = "1.5.10"
    id("org.springframework.boot") version "2.5.0"
    id("io.spring.dependency-management") version "1.0.11.RELEASE"
    id("org.jlleitschuh.gradle.ktlint") version "10.1.0"
    kotlin("jvm") version kotlinVersion
    kotlin("plugin.spring") version kotlinVersion
    kotlin("plugin.jpa") version kotlinVersion
}

group = "com.learning"
version = "0.0.1-SNAPSHOT"
java.sourceCompatibility = JavaVersion.VERSION_11

configurations {
	compileOnly {
		extendsFrom(configurations.annotationProcessor.get())
	}
}

repositories {
	mavenCentral()
}

dependencies {
	implementation("org.springframework.boot:spring-boot-starter-data-jpa")
	implementation("org.springframework.boot:spring-boot-starter-web")
	implementation("com.fasterxml.jackson.module:jackson-module-kotlin")
	implementation("org.jetbrains.kotlin:kotlin-reflect")
	implementation("org.jetbrains.kotlin:kotlin-stdlib-jdk8")
	compileOnly("org.projectlombok:lombok")
	developmentOnly("org.springframework.boot:spring-boot-devtools")
	runtimeOnly("com.h2database:h2")
	annotationProcessor("org.projectlombok:lombok")
		// testImplementation("org.springframework.boot:spring-boot-starter-test")
		// testImplementation(platform("org.junit:junit-bom:5.7.0"))

	testImplementation("org.springframework.boot:spring-boot-starter-test"){
        exclude(group = "org.junit.vintage", module = "junit-vintage-engine")
    }

	testImplementation("org.jetbrains.kotlin:kotlin-test")
	testImplementation("org.junit.jupiter:junit-jupiter-api")
    testRuntimeOnly("org.junit.jupiter:junit-jupiter-engine")
    testImplementation("org.junit.jupiter:junit-jupiter-params:5.4.2")
}

tasks.withType<KotlinCompile> {
	kotlinOptions {
		freeCompilerArgs = listOf("-Xjsr305=strict")
		jvmTarget = "11"
		}
}

tasks.withType<Test> {
    useJUnitPlatform()
    systemProperty("spring.profiles.active","test")
}

