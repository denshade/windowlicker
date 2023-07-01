plugins {
    java
}

java {
    sourceCompatibility = JavaVersion.VERSION_11
    targetCompatibility = JavaVersion.VERSION_11
    sourceSets {
        getByName("main") {
            java.srcDirs("main")
        }
        getByName("test") {
            java.srcDirs("tests")
        }
    }
}

repositories {
    mavenCentral()
}

dependencies {
    implementation(project(":core"))

    implementation("org.seleniumhq.selenium:selenium-java:4.10.0")
    testImplementation("junit:junit:4.12")
    testImplementation("org.jmock:jmock-junit4:2.12.0")
    implementation("org.hamcrest:hamcrest-all:1.3")
}
