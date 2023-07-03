plugins {
    java
    id("com.github.johnrengelman.shadow") version "7.0.0"
    `maven-publish`
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

tasks.named<Test>("test") {
    useJUnit()
}

dependencies {
    testImplementation("junit:junit:4.12")
    testImplementation("org.jmock:jmock-junit4:2.12.0")
    implementation(project(":core"))
    implementation("org.hamcrest:hamcrest-all:1.3")

}
repositories {
    mavenCentral()
}

tasks.named<Jar>("jar") {
    archiveFileName.set("custom-jar-name.jar") // Set the desired output name
}